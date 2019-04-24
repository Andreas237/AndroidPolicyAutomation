.class public abstract Lcom/shopkick/app/url/URLHandler;
.super Ljava/lang/Object;
.source "URLHandler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/url/URLHandler$JSBuilder;
    }
.end annotation


# static fields
.field private static final JS_PREFIX:Ljava/lang/String; = "javascript:"


# instance fields
.field public callback:Lcom/shopkick/app/url/IURLHandlerCallback;

.field public isAsync:Z

.field public params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public urlPathComponents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public webView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private varargs buildJSWithParams(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 86
    new-instance v0, Lcom/shopkick/app/url/URLHandler$JSBuilder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/url/URLHandler$JSBuilder;-><init>(Lcom/shopkick/app/url/URLHandler;Lcom/shopkick/app/url/URLHandler$1;)V

    .line 88
    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLHandler$JSBuilder;->addMethodName(Ljava/lang/String;)V

    const/4 p1, 0x0

    move v1, p1

    .line 89
    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_5

    .line 90
    aget-object v2, p2, v1

    const/4 v3, 0x1

    if-nez v2, :cond_1

    if-lez v1, :cond_0

    goto :goto_1

    :cond_0
    move v3, p1

    .line 92
    :goto_1
    invoke-virtual {v0, v3}, Lcom/shopkick/app/url/URLHandler$JSBuilder;->addNullParam(Z)V

    goto :goto_4

    .line 93
    :cond_1
    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_3

    .line 94
    check-cast v2, Ljava/lang/String;

    if-lez v1, :cond_2

    goto :goto_2

    :cond_2
    move v3, p1

    :goto_2
    invoke-virtual {v0, v2, v3}, Lcom/shopkick/app/url/URLHandler$JSBuilder;->addStringParam(Ljava/lang/String;Z)V

    goto :goto_4

    :cond_3
    if-lez v1, :cond_4

    goto :goto_3

    :cond_4
    move v3, p1

    .line 96
    :goto_3
    invoke-virtual {v0, v2, v3}, Lcom/shopkick/app/url/URLHandler$JSBuilder;->addObjectParam(Ljava/lang/Object;Z)V

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 99
    :cond_5
    invoke-virtual {v0}, Lcom/shopkick/app/url/URLHandler$JSBuilder;->endJS()V

    .line 101
    invoke-virtual {v0}, Lcom/shopkick/app/url/URLHandler$JSBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public cancel()V
    .locals 1

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lcom/shopkick/app/url/URLHandler;->webView:Landroid/webkit/WebView;

    return-void
.end method

.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 1

    .line 23
    iget-boolean v0, p0, Lcom/shopkick/app/url/URLHandler;->isAsync:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 8
    invoke-virtual {p0}, Lcom/shopkick/app/url/URLHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public abstract execute()V
.end method

.method public finish()V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/url/URLHandler;->callback:Lcom/shopkick/app/url/IURLHandlerCallback;

    if-eqz v0, :cond_0

    .line 52
    invoke-interface {v0, p0}, Lcom/shopkick/app/url/IURLHandlerCallback;->handlerDidFinish(Lcom/shopkick/app/url/URLHandler;)V

    :cond_0
    return-void
.end method

.method protected varargs finishWithWebViewCallback(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 62
    invoke-virtual {p0}, Lcom/shopkick/app/url/URLHandler;->finish()V

    .line 63
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/url/URLHandler;->invokeWebViewCallback(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected varargs invokeWebViewCallback(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/url/URLHandler;->webView:Landroid/webkit/WebView;

    if-nez v0, :cond_0

    return-void

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/url/URLHandler;->params:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_1

    return-void

    .line 79
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/url/URLHandler;->buildJSWithParams(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 81
    iget-object p2, p0, Lcom/shopkick/app/url/URLHandler;->webView:Landroid/webkit/WebView;

    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "URLHandler [callback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/url/URLHandler;->callback:Lcom/shopkick/app/url/IURLHandlerCallback;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", webView="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/url/URLHandler;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", urlPathComponents="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/url/URLHandler;->urlPathComponents:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", params="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/url/URLHandler;->params:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isAsync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/shopkick/app/url/URLHandler;->isAsync:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
