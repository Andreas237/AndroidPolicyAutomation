.class public Lcom/shopkick/app/url/URLDispatcherFactory;
.super Ljava/lang/Object;
.source "URLDispatcherFactory.java"


# instance fields
.field private handlersByKey:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/url/URLHandler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/url/URLDispatcherFactory;->handlersByKey:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public addHandler(Ljava/lang/String;Lcom/shopkick/app/url/URLHandler;)V
    .locals 2

    .line 24
    iget-object v0, p0, Lcom/shopkick/app/url/URLDispatcherFactory;->handlersByKey:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    const-class p2, Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error: duplicate handler added for key "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/url/URLDispatcherFactory;->handlersByKey:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public dispatcher()Lcom/shopkick/app/url/URLDispatcher;
    .locals 3

    .line 20
    new-instance v0, Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/url/URLDispatcherFactory;->handlersByKey:Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/shopkick/app/url/URLDispatcher;-><init>(Landroid/webkit/WebView;Ljava/util/Map;)V

    return-object v0
.end method

.method public dispatcherForWebView(Landroid/webkit/WebView;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 2

    .line 16
    new-instance v0, Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/url/URLDispatcherFactory;->handlersByKey:Ljava/util/HashMap;

    invoke-direct {v0, p1, v1}, Lcom/shopkick/app/url/URLDispatcher;-><init>(Landroid/webkit/WebView;Ljava/util/Map;)V

    return-object v0
.end method

.method public removeHandler(Ljava/lang/String;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/shopkick/app/url/URLDispatcherFactory;->handlersByKey:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
