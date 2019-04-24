.class public Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;
.super Ljava/lang/Object;
.source "FeaturedViewHolderFactory.java"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final hardware:Lcom/ibotta/android/hardware/Hardware;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/images/ImageCache;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;->hardware:Lcom/ibotta/android/hardware/Hardware;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
    .locals 4

    .line 35
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 37
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$featured$FeaturedRowType:[I

    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->values()[Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    move-result-object v2

    aget-object p2, v2, p2

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->ordinal()I

    move-result p2

    aget p2, v1, p2

    packed-switch p2, :pswitch_data_0

    const/4 p2, 0x0

    goto/16 :goto_0

    .line 67
    :pswitch_0
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;-><init>(Landroid/content/Context;)V

    .line 68
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder;

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;)V

    goto :goto_0

    .line 61
    :pswitch_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;-><init>(Landroid/content/Context;)V

    const p2, 0x7f060171

    .line 62
    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBackgroundResource(I)V

    .line 64
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V

    goto :goto_0

    .line 58
    :pswitch_2
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;

    new-instance p1, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/ProductsModuleViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;)V

    goto :goto_0

    .line 55
    :pswitch_3
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;

    new-instance p1, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/PopularRetailersViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/PopularRetailerModuleView;)V

    goto :goto_0

    .line 51
    :pswitch_4
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;->hardware:Lcom/ibotta/android/hardware/Hardware;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedViewHolderFactory;->imageCache:Lcom/ibotta/android/images/ImageCache;

    new-instance v3, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-direct {v3, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p1, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V

    goto :goto_0

    .line 48
    :pswitch_5
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;

    new-instance p1, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FavoriteRetailerViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;)V

    goto :goto_0

    .line 45
    :pswitch_6
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;

    new-instance p1, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V

    goto :goto_0

    .line 42
    :pswitch_7
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;

    new-instance p1, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-direct {p1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V

    goto :goto_0

    .line 39
    :pswitch_8
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;

    new-instance v0, Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/view/featured/FeaturedView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/BannersViewHolder;-><init>(Lcom/ibotta/android/view/featured/FeaturedView;)V

    :goto_0
    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
