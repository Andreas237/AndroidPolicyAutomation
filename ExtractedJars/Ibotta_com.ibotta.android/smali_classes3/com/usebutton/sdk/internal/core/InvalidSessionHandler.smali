.class public Lcom/usebutton/sdk/internal/core/InvalidSessionHandler;
.super Ljava/lang/Object;
.source "InvalidSessionHandler.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/ExceptionHandler;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handle(Ljava/lang/Throwable;)Z
    .locals 4

    .line 10
    instance-of v0, p1, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 11
    check-cast p1, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;

    .line 12
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;->wasUnauthorized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 13
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getStorage()Lcom/usebutton/sdk/internal/core/Storage;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/core/Storage;->setSessionId(Ljava/lang/String;)V

    const-string v0, "Button Session ID is not authorized (Request ID: %s)"

    const/4 v2, 0x1

    .line 14
    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;->getRequestId()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v1

    invoke-static {v0, v3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_0
    return v1
.end method
