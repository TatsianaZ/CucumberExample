package com.cucumber.testng.navigation;

public enum PortalUrl {
    HOME(""),
    TOOLS("tools/"),
    DOCS("docs/cucumber/");

    private String url;

    PortalUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
