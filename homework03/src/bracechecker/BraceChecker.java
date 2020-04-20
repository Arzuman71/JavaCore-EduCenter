package bracechecker;

public class BraceChecker {

    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;

    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        char a;
        char last;
        Stack stack = new Stack();


        for (int i = 0; i < text.length(); i++) {
            a = text.charAt(i);
            switch (a) {
                case '(':
                case '[':
                case '{':
                    stack.push(a);
                    break;
                case ')':
                    last = (char) stack.pop();
                    if (last != '(') {
                        if (last == 0) {
                            System.err.println("Errar: closed ) but not opened at:" + i);
                        } else {
                            System.err.println("Error: closed ) but opened" + last + " opened at:" + i);
                        }
                    }
                    break;
                case ']':
                    last = (char) stack.pop();
                    if (last != '[') {
                        if (last == 0) {
                            System.err.println("Errar: closed ] but not opened at:" + i);
                        } else {
                            System.err.println("Error: closed ] but opened" + last + " opened at:" + i);
                        }
                    }
                    break;
                case '}':
                    last = (char) stack.pop();
                    if (last != '{') {
                        if (last == 0) {
                            System.err.println("Errar: closed } but not opened at:" + i);
                        } else {
                            System.err.println("Error: closed } but opened" + last + " opened at:" + i);
                        }
                    }
                    break;
            }
        }
        while ((last = (char) stack.pop()) != 0) {
            System.out.println("Error: opened" + last + "but not closed");
        }
    }
}






