.class Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;
.super Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;
.source "ActionBinder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PagerAdapter"
.end annotation


# instance fields
.field private final mInventory:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/models/Inventory;",
            ">;"
        }
    .end annotation
.end field

.field private final mItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/models/Inventory;",
            ">;"
        }
    .end annotation
.end field

.field private final mOnInvoke:Lcom/usebutton/sdk/internal/util/Receiver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;Ljava/util/List;Lcom/usebutton/sdk/internal/util/Receiver;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/models/Inventory;",
            ">;",
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;)V"
        }
    .end annotation

    .line 89
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->this$0:Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;

    .line 90
    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->access$000(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p1, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    invoke-direct {p0, v0, v1}, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/InteractiveButton;)V

    .line 91
    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->mInventory:Ljava/util/List;

    .line 92
    iput-object p3, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->mOnInvoke:Lcom/usebutton/sdk/internal/util/Receiver;

    .line 93
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->access$100(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;)I

    move-result v0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    const/4 v0, 0x0

    invoke-interface {p2, v0, p3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->mItems:Ljava/util/List;

    .line 94
    iget-object p1, p1, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->setCanScroll(Z)V

    return-void
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;)Lcom/usebutton/sdk/internal/util/Receiver;
    .locals 0

    .line 84
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->mOnInvoke:Lcom/usebutton/sdk/internal/util/Receiver;

    return-object p0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->mItems:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 100
    new-instance v0, Lcom/usebutton/sdk/internal/views/LazyView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/views/LazyView;-><init>(Landroid/content/Context;)V

    .line 101
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->mInventory:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/usebutton/sdk/models/Inventory;

    .line 102
    sget v1, Lcom/usebutton/sdk/R$layout;->btn_inventory_two_line_preview:I

    new-instance v2, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter$1;

    invoke-direct {v2, p0, p2}, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter$1;-><init>(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;Lcom/usebutton/sdk/models/Inventory;)V

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/views/LazyView;->load(ILcom/usebutton/sdk/internal/util/Receiver;)V

    .line 109
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;->getItemLayoutParams()Landroid/support/v4/view/ViewPager$LayoutParams;

    move-result-object v1

    .line 110
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/LazyView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    invoke-virtual {v0, p2}, Lcom/usebutton/sdk/internal/views/LazyView;->setTag(Ljava/lang/Object;)V

    .line 112
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p2
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 127
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
