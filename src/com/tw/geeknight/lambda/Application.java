package com.tw.geeknight.lambda;

interface Executable{
    void execute();
}

class Runner{
    void run(Executable executable){
        System.out.print("Inside Run = ");
        executable.execute();
    }
}

public class Application {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Execute");
            }
        });

        runner.run(() -> {
            System.out.println("Execute");
            System.out.println("Execute");
            System.out.println("Execute");
        });

    }
}

