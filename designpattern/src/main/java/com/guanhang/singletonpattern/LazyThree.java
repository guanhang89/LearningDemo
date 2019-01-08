package com.guanhang.singletonpattern;

public class LazyThree {

    private boolean initialized = false;
    private LazyThree(){

        synchronized (LazyThree.class){
            if(initialized == false){
                initialized = !initialized;
            }else{
                throw new RuntimeException("单例已被侵犯");
            }
        }

    }
    public static final LazyThree getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }
    //默认不加载
    private static class LazyHolder{
        private static final LazyThree LAZY = new LazyThree();
    }
}
