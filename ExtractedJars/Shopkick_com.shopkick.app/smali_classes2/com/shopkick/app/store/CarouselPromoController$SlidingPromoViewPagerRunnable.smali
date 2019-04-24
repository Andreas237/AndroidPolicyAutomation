.class Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerRunnable;
.super Ljava/lang/Object;
.source "CarouselPromoController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/CarouselPromoController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SlidingPromoViewPagerRunnable"
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


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/CarouselPromoController;)V
    .locals 1

    .line 394
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 395
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerRunnable;->carouselPromoControllerWeakRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 400
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerRunnable;->carouselPromoControllerWeakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/CarouselPromoController;

    if-eqz v0, :cond_1

    .line 402
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$500(Lcom/shopkick/app/store/CarouselPromoController;)I

    move-result v1

    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x64

    mul-int/2addr v2, v3

    if-ne v1, v2, :cond_0

    .line 403
    invoke-static {v0, v3}, Lcom/shopkick/app/store/CarouselPromoController;->access$502(Lcom/shopkick/app/store/CarouselPromoController;I)I

    .line 405
    :cond_0
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$600(Lcom/shopkick/app/store/CarouselPromoController;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$500(Lcom/shopkick/app/store/CarouselPromoController;)I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 406
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$500(Lcom/shopkick/app/store/CarouselPromoController;)I

    move-result v1

    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, v2}, Lcom/shopkick/app/store/CarouselPromoController;->access$300(II)I

    move-result v1

    .line 407
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$400(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/widget/PageIndicator;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/PageIndicator;->selectIndicator(I)V

    .line 408
    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$508(Lcom/shopkick/app/store/CarouselPromoController;)I

    :cond_1
    return-void
.end method
