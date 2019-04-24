.class Lcom/usebutton/sdk/internal/ButtonPrivate$5;
.super Ljava/lang/Object;
.source "ButtonPrivate.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/FailableReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/ButtonPrivate;->onFirstActivityForegrounded()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ButtonPrivate;)V
    .locals 0

    .line 423
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$5;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 1

    .line 443
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$5;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$1000(Lcom/usebutton/sdk/internal/ButtonPrivate;)V

    return-void
.end method

.method public onResult(Ljava/lang/Boolean;)V
    .locals 3

    .line 426
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 427
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$5;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Storage;->getSessionId()Ljava/lang/String;

    move-result-object p1

    .line 428
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$5;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$900(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/api/ButtonApi;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$5;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/ButtonPrivate;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->setSessionInfo(Lcom/usebutton/sdk/internal/core/Storage;)V

    const-string v0, "Restored session (Session ID: %s)"

    const/4 v1, 0x1

    .line 429
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$5;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$200(Lcom/usebutton/sdk/internal/ButtonPrivate;)V

    goto :goto_0

    :cond_0
    const-string p1, "ButtonPrivate"

    const-string v0, "Not logged in, register."

    .line 432
    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$5;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$1000(Lcom/usebutton/sdk/internal/ButtonPrivate;)V

    .line 435
    :goto_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$5;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$300(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/events/EventTracker;->onAppLaunch()V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 423
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/ButtonPrivate$5;->onResult(Ljava/lang/Boolean;)V

    return-void
.end method
