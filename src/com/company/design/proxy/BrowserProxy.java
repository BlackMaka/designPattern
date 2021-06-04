package com.company.design.proxy;

public class BrowserProxy implements IBrowser {
    private String url;
    private Html html;

    public BrowserProxy(String url){
        this.url = url;
    }
    @Override
    public Html show() {
        if(html == null){
            this.html = new Html(url);
            System.out.println("Browser프록시 loading html from : "+ url);
        }
        System.out.println("Browser프록시 캐시 html from : " + url);
        return html;
    }
}
