.class Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$1;
.super Ljava/lang/Object;
.source "GroupedInventoryCardActivity.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/util/Receiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;
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
.field final synthetic this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public receive(Lcom/usebutton/sdk/models/Link;)V
    .locals 3

    .line 147
    new-instance v0, Lcom/usebutton/sdk/internal/ActionPerformer;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;)V

    const-string p1, "btn:inventory-card-item-selected"

    .line 148
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;->withEvent(Ljava/lang/String;)Lcom/usebutton/sdk/internal/ActionPerformer;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "group_name"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;

    .line 149
    invoke-static {v1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->access$000(Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/ActionPerformer;->withEventProperties([Ljava/lang/String;)Lcom/usebutton/sdk/internal/ActionPerformer;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;

    .line 150
    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;)V

    .line 151
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$1;->this$0:Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->finish()V

    return-void
.end method

.method public bridge synthetic receive(Ljava/lang/Object;)V
    .locals 0

    .line 144
    check-cast p1, Lcom/usebutton/sdk/models/Link;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$1;->receive(Lcom/usebutton/sdk/models/Link;)V

    return-void
.end method
