.class Lcom/usebutton/sdk/internal/SingleProductCardActivity$1;
.super Ljava/lang/Object;
.source "SingleProductCardActivity.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/util/Receiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/SingleProductCardActivity;
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
.field final synthetic this$0:Lcom/usebutton/sdk/internal/SingleProductCardActivity;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/SingleProductCardActivity;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/SingleProductCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public receive(Lcom/usebutton/sdk/models/Link;)V
    .locals 2

    .line 84
    new-instance v0, Lcom/usebutton/sdk/internal/ActionPerformer;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/SingleProductCardActivity;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;)V

    const-string p1, "btn:inventory-preview-card-tapped"

    .line 85
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;->withEvent(Ljava/lang/String;)Lcom/usebutton/sdk/internal/ActionPerformer;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/SingleProductCardActivity;

    .line 86
    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;)V

    .line 87
    iget-object p1, p0, Lcom/usebutton/sdk/internal/SingleProductCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/SingleProductCardActivity;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/SingleProductCardActivity;->finish()V

    return-void
.end method

.method public bridge synthetic receive(Ljava/lang/Object;)V
    .locals 0

    .line 81
    check-cast p1, Lcom/usebutton/sdk/models/Link;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/SingleProductCardActivity$1;->receive(Lcom/usebutton/sdk/models/Link;)V

    return-void
.end method
