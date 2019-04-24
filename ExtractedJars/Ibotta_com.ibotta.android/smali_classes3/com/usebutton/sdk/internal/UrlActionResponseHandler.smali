.class Lcom/usebutton/sdk/internal/UrlActionResponseHandler;
.super Ljava/lang/Object;
.source "UrlActionResponseHandler.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/FailableReceiver;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
        "Lcom/usebutton/sdk/internal/core/Response<",
        "Lcom/usebutton/sdk/internal/models/AppAction;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final LINK_ERROR_TEMPLATE:Ljava/lang/String; = "Failed to fetch app action for url: \'%s\' (requestId = %s)"

.field private static final TAG:Ljava/lang/String; = "UrlActionResponseHandler"


# instance fields
.field private final eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

.field private final invoker:Lcom/usebutton/sdk/internal/AppActionCallbacks;

.field private final url:Ljava/net/URL;

.field private final urlMatcher:Lcom/usebutton/sdk/internal/models/UrlMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Ljava/net/URL;Lcom/usebutton/sdk/internal/models/UrlMatcher;Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/AppActionCallbacks;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->url:Ljava/net/URL;

    .line 31
    iput-object p2, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->urlMatcher:Lcom/usebutton/sdk/internal/models/UrlMatcher;

    .line 32
    iput-object p3, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    .line 33
    iput-object p4, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->invoker:Lcom/usebutton/sdk/internal/AppActionCallbacks;

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->invoker:Lcom/usebutton/sdk/internal/AppActionCallbacks;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AppActionCallbacks;->onNoAction()V

    return-void
.end method

.method public onResult(Lcom/usebutton/sdk/internal/core/Response;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/core/Response<",
            "Lcom/usebutton/sdk/internal/models/AppAction;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 39
    iget-object p1, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->invoker:Lcom/usebutton/sdk/internal/AppActionCallbacks;

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/AppActionCallbacks;->onNoAction()V

    return-void

    .line 43
    :cond_0
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Response;->object()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 45
    iget-object v0, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->urlMatcher:Lcom/usebutton/sdk/internal/models/UrlMatcher;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->url:Ljava/net/URL;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/models/UrlMatcher;->canExchangeUrl(Ljava/net/URL;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    sget-object v0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->TAG:Ljava/lang/String;

    const-string v1, "Failed to fetch app action for url: \'%s\' (requestId = %s)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->url:Ljava/net/URL;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Response;->requestId()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    :cond_1
    iget-object p1, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->invoker:Lcom/usebutton/sdk/internal/AppActionCallbacks;

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/AppActionCallbacks;->onNoAction()V

    return-void

    .line 53
    :cond_2
    iget-object v0, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Response;->object()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackActionAvailable(Lcom/usebutton/sdk/internal/models/MetaInfo;)V

    .line 54
    iget-object v0, p0, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->invoker:Lcom/usebutton/sdk/internal/AppActionCallbacks;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Response;->object()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/AppActionCallbacks;->onAction(Lcom/usebutton/sdk/internal/models/AppAction;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/usebutton/sdk/internal/core/Response;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/UrlActionResponseHandler;->onResult(Lcom/usebutton/sdk/internal/core/Response;)V

    return-void
.end method
