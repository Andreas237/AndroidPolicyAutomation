.class Lcom/usebutton/sdk/internal/ButtonPrivate$6;
.super Ljava/lang/Object;
.source "ButtonPrivate.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/FailableReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/ButtonPrivate;->doGetAction(Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;Ljava/lang/String;Lcom/usebutton/sdk/internal/AppActionCallbacks;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
        "Lcom/usebutton/sdk/internal/models/AppAction;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

.field final synthetic val$invoker:Lcom/usebutton/sdk/internal/AppActionCallbacks;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/internal/AppActionCallbacks;)V
    .locals 0

    .line 471
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$6;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$6;->val$invoker:Lcom/usebutton/sdk/internal/AppActionCallbacks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 1

    .line 484
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$6;->val$invoker:Lcom/usebutton/sdk/internal/AppActionCallbacks;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/AppActionCallbacks;->onNoAction()V

    return-void
.end method

.method public onResult(Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 475
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$6;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$300(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackActionAvailable(Lcom/usebutton/sdk/internal/models/MetaInfo;)V

    .line 476
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$6;->val$invoker:Lcom/usebutton/sdk/internal/AppActionCallbacks;

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/AppActionCallbacks;->onAction(Lcom/usebutton/sdk/internal/models/AppAction;)V

    goto :goto_0

    .line 478
    :cond_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$6;->val$invoker:Lcom/usebutton/sdk/internal/AppActionCallbacks;

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/AppActionCallbacks;->onNoAction()V

    :goto_0
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 471
    check-cast p1, Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/ButtonPrivate$6;->onResult(Lcom/usebutton/sdk/internal/models/AppAction;)V

    return-void
.end method
