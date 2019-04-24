.class Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "CarouselPromoController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/CarouselPromoController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SlidingPromoViewPagerAdapter"
.end annotation


# instance fields
.field private carouselPromoControllerWeakRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/store/CarouselPromoController;",
            ">;"
        }
    .end annotation
.end field

.field private promoConfiguratorWeakRefArray:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/store/PromoConfigurator;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/CarouselPromoController;)V
    .locals 1

    .line 426
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 427
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;->carouselPromoControllerWeakRef:Ljava/lang/ref/WeakReference;

    .line 428
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;->promoConfiguratorWeakRefArray:Landroid/util/SparseArray;

    return-void
.end method

.method static synthetic access$1200(Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 421
    iget-object p0, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;->carouselPromoControllerWeakRef:Ljava/lang/ref/WeakReference;

    return-object p0
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 433
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 3

    .line 438
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;->carouselPromoControllerWeakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/CarouselPromoController;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 440
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 441
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    return v0

    :cond_0
    return v1

    :cond_1
    return v1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 17
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 453
    iget-object v2, v0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;->carouselPromoControllerWeakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/store/CarouselPromoController;

    if-nez v2, :cond_0

    .line 455
    invoke-super/range {p0 .. p2}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 457
    :cond_0
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    move/from16 v4, p2

    invoke-static {v4, v3}, Lcom/shopkick/app/store/CarouselPromoController;->access$300(II)I

    move-result v3

    .line 458
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lt v3, v4, :cond_1

    .line 459
    invoke-super {v0, v1, v3}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 462
    :cond_1
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 463
    iget-object v4, v13, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/shopkick/app/store/CarouselPromoController;->getPromoConfigurator(I)Lcom/shopkick/app/store/PromoConfigurator;

    move-result-object v14

    .line 464
    invoke-virtual {v14, v2, v1, v3, v13}, Lcom/shopkick/app/store/PromoConfigurator;->loadLayout(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Landroid/view/ViewGroup;

    move-result-object v15

    .line 469
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$700(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/widget/UserEventFrameLayout;

    move-result-object v5

    .line 470
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$800(Lcom/shopkick/app/store/CarouselPromoController;)I

    move-result v6

    .line 474
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$900(Lcom/shopkick/app/store/CarouselPromoController;)Z

    move-result v10

    .line 476
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$500(Lcom/shopkick/app/store/CarouselPromoController;)I

    move-result v4

    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-static {v4, v7}, Lcom/shopkick/app/store/CarouselPromoController;->access$300(II)I

    move-result v4

    const/4 v12, 0x1

    if-ne v3, v4, :cond_2

    move v11, v12

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    move v11, v4

    :goto_0
    const/16 v16, 0x1

    move-object v4, v14

    move-object v7, v15

    move v8, v3

    move-object v9, v13

    move v1, v12

    move/from16 v12, v16

    .line 469
    invoke-virtual/range {v4 .. v12}, Lcom/shopkick/app/store/PromoConfigurator;->setupLogging(Lcom/shopkick/app/widget/UserEventFrameLayout;ILandroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ZZZ)V

    .line 480
    iget-object v4, v0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;->promoConfiguratorWeakRefArray:Landroid/util/SparseArray;

    new-instance v5, Ljava/lang/ref/WeakReference;

    invoke-direct {v5, v14}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v3, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 483
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-le v4, v1, :cond_3

    add-int/lit8 v1, v3, 0x1

    .line 484
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v1, v4}, Lcom/shopkick/app/store/CarouselPromoController;->access$300(II)I

    move-result v1

    .line 485
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 486
    iget-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 487
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/shopkick/app/store/CarouselPromoController;->getPromoConfigurator(I)Lcom/shopkick/app/store/PromoConfigurator;

    move-result-object v5

    const/4 v6, 0x0

    .line 488
    invoke-virtual {v5, v2, v6, v1, v4}, Lcom/shopkick/app/store/PromoConfigurator;->refreshImages(Lcom/shopkick/app/store/CarouselPromoController;Landroid/view/ViewGroup;ILcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 492
    :cond_3
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$1000(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/controllers/RecyclerViewImageController;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 493
    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$1000(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/controllers/RecyclerViewImageController;

    move-result-object v1

    invoke-static {v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$1100(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/controllers/RecyclerViewImageController;->fetchImages(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 496
    :cond_4
    invoke-virtual {v14, v15, v13}, Lcom/shopkick/app/store/PromoConfigurator;->animateLayout(Landroid/view/ViewGroup;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    if-eqz v15, :cond_5

    .line 499
    new-instance v1, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter$1;

    invoke-direct {v1, v0, v3}, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter$1;-><init>(Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;I)V

    invoke-virtual {v15, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v15

    :cond_5
    move-object/from16 v1, p1

    .line 514
    invoke-super {v0, v1, v3}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 520
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
