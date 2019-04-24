.class Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter$1;
.super Ljava/lang/Object;
.source "ActionBinder.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/util/Receiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/util/Receiver<",
        "Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;

.field final synthetic val$inventory:Lcom/usebutton/sdk/models/Inventory;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;Lcom/usebutton/sdk/models/Inventory;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter$1;->this$1:Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter$1;->val$inventory:Lcom/usebutton/sdk/models/Inventory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public receive(Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;)V
    .locals 3

    .line 105
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter$1;->val$inventory:Lcom/usebutton/sdk/models/Inventory;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter$1;->this$1:Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->access$200(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;)Lcom/usebutton/sdk/internal/util/Receiver;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter$1;->this$1:Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;

    iget-object v2, v2, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->this$0:Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;

    invoke-static {v2}, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->access$300(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;)Lcom/usebutton/sdk/internal/ImageLoader;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->setInventory(Lcom/usebutton/sdk/models/Inventory;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/internal/ImageLoader;)V

    .line 106
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter$1;->this$1:Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->this$0:Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->invalidate()V

    return-void
.end method

.method public bridge synthetic receive(Ljava/lang/Object;)V
    .locals 0

    .line 102
    check-cast p1, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter$1;->receive(Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;)V

    return-void
.end method
