.class Lcom/usebutton/sdk/InteractiveButton$1;
.super Ljava/lang/Object;
.source "InteractiveButton.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/util/Receiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/InteractiveButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/util/Receiver<",
        "Lcom/usebutton/sdk/models/Link;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/InteractiveButton;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/InteractiveButton;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lcom/usebutton/sdk/InteractiveButton$1;->this$0:Lcom/usebutton/sdk/InteractiveButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public receive(Lcom/usebutton/sdk/models/Link;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 244
    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton$1;->this$0:Lcom/usebutton/sdk/InteractiveButton;

    invoke-static {v0}, Lcom/usebutton/sdk/InteractiveButton;->access$000(Lcom/usebutton/sdk/InteractiveButton;)Lcom/usebutton/sdk/internal/models/AppAction;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "InteractiveButton"

    const-string v1, "Button tapped without action object, should not happen. url=%s"

    const/4 v2, 0x1

    .line 245
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 249
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton$1;->this$0:Lcom/usebutton/sdk/InteractiveButton;

    invoke-static {v0}, Lcom/usebutton/sdk/InteractiveButton;->access$000(Lcom/usebutton/sdk/InteractiveButton;)Lcom/usebutton/sdk/internal/models/AppAction;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v0

    .line 250
    new-instance v1, Lcom/usebutton/sdk/internal/ActionPerformer;

    invoke-direct {v1, v0, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;)V

    const-string p1, "btn:inventory-button-item-selected"

    .line 251
    invoke-virtual {v1, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;->withEvent(Ljava/lang/String;)Lcom/usebutton/sdk/internal/ActionPerformer;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/InteractiveButton$1;->this$0:Lcom/usebutton/sdk/InteractiveButton;

    .line 252
    invoke-virtual {v0}, Lcom/usebutton/sdk/InteractiveButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;)V

    return-void
.end method

.method public bridge synthetic receive(Ljava/lang/Object;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 240
    check-cast p1, Lcom/usebutton/sdk/models/Link;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/InteractiveButton$1;->receive(Lcom/usebutton/sdk/models/Link;)V

    return-void
.end method
