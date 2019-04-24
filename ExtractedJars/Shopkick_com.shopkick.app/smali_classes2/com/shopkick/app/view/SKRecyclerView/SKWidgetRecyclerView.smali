.class public Lcom/shopkick/app/view/SKRecyclerView/SKWidgetRecyclerView;
.super Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;
.source "SKWidgetRecyclerView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(I)V
    .locals 2

    .line 28
    invoke-super {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->onScrollStateChanged(I)V

    if-nez p1, :cond_0

    const p1, 0x7f09084d

    .line 31
    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKWidgetRecyclerView;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_0

    .line 33
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p1, :cond_0

    .line 35
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p1

    const-string v0, "PARAMS_CLIENT_DATA_WIDGET_SCROLL_POS"

    .line 36
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/SKWidgetRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 35
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
