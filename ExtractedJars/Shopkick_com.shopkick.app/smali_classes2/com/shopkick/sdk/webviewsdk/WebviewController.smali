.class public Lcom/shopkick/sdk/webviewsdk/WebviewController;
.super Ljava/lang/Object;
.source "WebviewController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/webviewsdk/WebviewController$ActionListener;
    }
.end annotation


# static fields
.field private static context:Landroid/content/Context;

.field private static instance:Lcom/shopkick/sdk/webviewsdk/WebviewController;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/shopkick/sdk/webviewsdk/WebviewController;
    .locals 0

    .line 13
    sput-object p0, Lcom/shopkick/sdk/webviewsdk/WebviewController;->context:Landroid/content/Context;

    .line 14
    sget-object p0, Lcom/shopkick/sdk/webviewsdk/WebviewController;->instance:Lcom/shopkick/sdk/webviewsdk/WebviewController;

    if-nez p0, :cond_0

    .line 15
    new-instance p0, Lcom/shopkick/sdk/webviewsdk/WebviewController;

    invoke-direct {p0}, Lcom/shopkick/sdk/webviewsdk/WebviewController;-><init>()V

    sput-object p0, Lcom/shopkick/sdk/webviewsdk/WebviewController;->instance:Lcom/shopkick/sdk/webviewsdk/WebviewController;

    .line 17
    :cond_0
    sget-object p0, Lcom/shopkick/sdk/webviewsdk/WebviewController;->instance:Lcom/shopkick/sdk/webviewsdk/WebviewController;

    return-object p0
.end method

.method private isValidUrl(Ljava/lang/String;)Z
    .locals 1

    .line 53
    sget-object v0, Landroid/util/Patterns;->WEB_URL:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method


# virtual methods
.method public getAction(Lcom/shopkick/sdk/webviewsdk/WebviewParam;Lcom/shopkick/sdk/webviewsdk/WebviewController$ActionListener;)V
    .locals 2

    .line 34
    invoke-virtual {p1}, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->getStartUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/shopkick/sdk/webviewsdk/WebviewController;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    new-instance v0, Lcom/shopkick/sdk/webviewsdk/WebviewAction;

    invoke-direct {v0}, Lcom/shopkick/sdk/webviewsdk/WebviewAction;-><init>()V

    .line 36
    sget-object v1, Lcom/shopkick/sdk/webviewsdk/WebviewController;->context:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->getLaunchIntent(Landroid/content/Context;Lcom/shopkick/sdk/webviewsdk/WebviewParam;)Landroid/content/Intent;

    move-result-object p1

    .line 37
    invoke-virtual {v0, p1}, Lcom/shopkick/sdk/webviewsdk/WebviewAction;->setActionIntent(Landroid/content/Intent;)V

    .line 38
    invoke-interface {p2, v0}, Lcom/shopkick/sdk/webviewsdk/WebviewController$ActionListener;->action(Lcom/shopkick/sdk/webviewsdk/WebviewAction;)V

    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {p2}, Lcom/shopkick/sdk/webviewsdk/WebviewController$ActionListener;->noAction()V

    :goto_0
    return-void
.end method

.method public getAction(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public getAction(Ljava/net/URL;)V
    .locals 0

    return-void
.end method

.method public setWebviewEventListener(Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;)V
    .locals 0

    .line 25
    invoke-static {p1}, Lcom/shopkick/sdk/webviewsdk/WebviewActivity;->setWebviewEventListener(Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;)V

    return-void
.end method
