.class Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoOnPageChangeListener;
.super Ljava/lang/Object;
.source "CarouselPromoController.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/CarouselPromoController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SlidingPromoOnPageChangeListener"
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

.field private slidingPromoViewPagerPreviousPage:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/CarouselPromoController;)V
    .locals 1

    .line 346
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 344
    iput v0, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoOnPageChangeListener;->slidingPromoViewPagerPreviousPage:I

    .line 347
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoOnPageChangeListener;->carouselPromoControllerWeakRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 5

    .line 356
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoOnPageChangeListener;->carouselPromoControllerWeakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/CarouselPromoController;

    if-eqz v0, :cond_0

    .line 361
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {p1, v1}, Lcom/shopkick/app/store/CarouselPromoController;->access$300(II)I

    move-result v1

    .line 362
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$400(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/widget/PageIndicator;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/PageIndicator;->selectIndicator(I)V

    .line 363
    invoke-static {v0, p1}, Lcom/shopkick/app/store/CarouselPromoController;->access$502(Lcom/shopkick/app/store/CarouselPromoController;I)I

    .line 365
    iget p1, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoOnPageChangeListener;->slidingPromoViewPagerPreviousPage:I

    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 366
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v1, p1, :cond_0

    .line 368
    iget p1, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoOnPageChangeListener;->slidingPromoViewPagerPreviousPage:I

    .line 369
    iput v1, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoOnPageChangeListener;->slidingPromoViewPagerPreviousPage:I

    .line 371
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$600(Lcom/shopkick/app/store/CarouselPromoController;)Landroid/support/v4/view/ViewPager;

    move-result-object v2

    invoke-static {v1}, Lcom/shopkick/app/store/CarouselPromoController;->promoCarouselTileTag(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v4/view/ViewPager;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 372
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 373
    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/shopkick/app/store/CarouselPromoController;->getPromoConfigurator(I)Lcom/shopkick/app/store/PromoConfigurator;

    move-result-object v3

    const-string v4, "CAROUSEL_CELL_VISIBLE"

    .line 374
    invoke-virtual {v3, v2, v4}, Lcom/shopkick/app/store/PromoConfigurator;->removeImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 376
    invoke-virtual {v3, v2, v1}, Lcom/shopkick/app/store/PromoConfigurator;->animateLayout(Landroid/view/ViewGroup;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 378
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$600(Lcom/shopkick/app/store/CarouselPromoController;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-static {p1}, Lcom/shopkick/app/store/CarouselPromoController;->promoCarouselTileTag(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 379
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 380
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/store/CarouselPromoController;->getPromoConfigurator(I)Lcom/shopkick/app/store/PromoConfigurator;

    move-result-object p1

    const-string v0, "CAROUSEL_CELL_VISIBLE"

    .line 381
    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/store/PromoConfigurator;->addImpressionKey(Landroid/view/ViewGroup;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
