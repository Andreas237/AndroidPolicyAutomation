.class Lcom/usebutton/sdk/internal/views/OneLineInventoryView$1;
.super Ljava/lang/Object;
.source "OneLineInventoryView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setInventory(Lcom/usebutton/sdk/models/Inventory;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/internal/ImageLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/OneLineInventoryView;

.field final synthetic val$inventory:Lcom/usebutton/sdk/models/Inventory;

.field final synthetic val$onClickListener:Lcom/usebutton/sdk/internal/util/Receiver;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/OneLineInventoryView;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/models/Inventory;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$1;->this$0:Lcom/usebutton/sdk/internal/views/OneLineInventoryView;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$1;->val$onClickListener:Lcom/usebutton/sdk/internal/util/Receiver;

    iput-object p3, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$1;->val$inventory:Lcom/usebutton/sdk/models/Inventory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 81
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$1;->val$onClickListener:Lcom/usebutton/sdk/internal/util/Receiver;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$1;->val$inventory:Lcom/usebutton/sdk/models/Inventory;

    invoke-virtual {v0}, Lcom/usebutton/sdk/models/Inventory;->getAction()Lcom/usebutton/sdk/models/Link;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/internal/util/Receiver;->receive(Ljava/lang/Object;)V

    return-void
.end method
