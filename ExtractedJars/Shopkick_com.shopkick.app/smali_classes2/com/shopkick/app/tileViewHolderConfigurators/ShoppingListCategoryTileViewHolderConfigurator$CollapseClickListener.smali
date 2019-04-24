.class public Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;
.super Ljava/lang/Object;
.source "ShoppingListCategoryTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CollapseClickListener"
.end annotation


# instance fields
.field private configuratorRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field private tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

.field private viewHolderRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;)V
    .locals 1

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;->viewHolderRef:Ljava/lang/ref/WeakReference;

    .line 134
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 135
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private animateArrow(Landroid/view/View;Z)V
    .locals 8

    .line 162
    new-instance v7, Landroid/view/animation/RotateAnimation;

    if-eqz p2, :cond_0

    const/high16 v0, 0x43b40000    # 360.0f

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v1, v0

    const/high16 v2, 0x43340000    # 180.0f

    const/4 v3, 0x1

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    const-wide/16 v0, 0x12c

    .line 168
    invoke-virtual {v7, v0, v1}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 169
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;Landroid/view/View;Z)V

    invoke-virtual {v7, v0}, Landroid/view/animation/RotateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 184
    invoke-virtual {p1, v7}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;

    .line 141
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;->viewHolderRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v0, :cond_2

    .line 142
    invoke-static {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;)Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ICollapseCategory;

    move-result-object v2

    if-eqz v2, :cond_2

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const v2, 0x7f090118

    .line 144
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 147
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v3, 0xe6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 148
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->shoppingListEntry:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->taxonomyNodeId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTaxonomyNodeId(Ljava/lang/String;)V

    .line 149
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setIsExpanded(Ljava/lang/Boolean;)V

    .line 150
    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 152
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 153
    invoke-static {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;)Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ICollapseCategory;

    move-result-object v0

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getAdapterPosition()I

    move-result v1

    invoke-interface {v0, v2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ICollapseCategory;->expandCategory(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;I)V

    const/4 v0, 0x0

    .line 154
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;->animateArrow(Landroid/view/View;Z)V

    goto :goto_0

    .line 156
    :cond_1
    invoke-static {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator;)Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ICollapseCategory;

    move-result-object v0

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;->tileInfo:Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    invoke-virtual {v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getAdapterPosition()I

    move-result v1

    invoke-interface {v0, v2, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$ICollapseCategory;->collapseCategory(Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;I)V

    const/4 v0, 0x1

    .line 157
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListCategoryTileViewHolderConfigurator$CollapseClickListener;->animateArrow(Landroid/view/View;Z)V

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method
