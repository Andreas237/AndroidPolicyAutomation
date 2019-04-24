.class public Lcom/tencent/open/c/b;
.super Landroid/webkit/WebView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 14
    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 7

    .line 26
    invoke-super {p0}, Landroid/webkit/WebView;->onAttachedToWindow()V

    .line 27
    invoke-virtual {p0}, Lcom/tencent/open/c/b;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v4

    .line 28
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 29
    return-void

    .line 31
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    .line 33
    const-string v0, "removeJavascriptInterface"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 35
    if-eqz v6, :cond_1

    .line 36
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "searchBoxJavaBridge_"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    :cond_1
    goto :goto_0

    .line 37
    :catch_0
    move-exception v6

    .line 39
    :goto_0
    return-void
.end method
