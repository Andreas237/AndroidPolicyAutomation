.class public Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "ExternalDeeplinkHandler.java"


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "deeplink"


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/url/URLDispatcherFactory;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 21
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    return-void
.end method


# virtual methods
.method public clone()Lcom/shopkick/app/url/URLHandler;
    .locals 3

    .line 26
    new-instance v0, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/url/URLDispatcherFactory;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 11
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object v0

    return-object v0
.end method

.method public execute()V
    .locals 3

    .line 31
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 33
    invoke-virtual {p0}, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;->finish()V

    return-void

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/ExternalDeeplinkHandler;->params:Ljava/util/Map;

    const-string/jumbo v2, "sk_link"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
