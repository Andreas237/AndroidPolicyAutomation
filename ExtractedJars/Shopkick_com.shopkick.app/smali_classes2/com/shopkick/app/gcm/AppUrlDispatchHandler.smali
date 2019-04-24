.class public Lcom/shopkick/app/gcm/AppUrlDispatchHandler;
.super Lcom/shopkick/app/gcm/PushEventHandler;
.source "AppUrlDispatchHandler.java"


# instance fields
.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcherFactory;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/shopkick/app/gcm/PushEventHandler;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/shopkick/app/gcm/AppUrlDispatchHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    return-void
.end method


# virtual methods
.method public accepts(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)Z
    .locals 0

    .line 19
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->skUrl:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public handle(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)Lcom/shopkick/app/gcm/PushEventHandler$Progress;
    .locals 3

    .line 24
    iget-object v0, p0, Lcom/shopkick/app/gcm/AppUrlDispatchHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    .line 25
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AppUrlDispatchHandler skUrl: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->skUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->log(Ljava/lang/String;)V

    .line 28
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->skUrl:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 29
    sget-object p1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Continue:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-object p1
.end method
