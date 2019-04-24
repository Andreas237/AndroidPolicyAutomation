.class Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter$1;
.super Ljava/lang/Object;
.source "CarouselPromoController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;

.field final synthetic val$position:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;I)V
    .locals 0

    .line 499
    iput-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter$1;->this$0:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;

    iput p2, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter$1;->val$position:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 502
    iget-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter$1;->this$0:Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;

    invoke-static {p1}, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;->access$1200(Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/store/CarouselPromoController;

    if-eqz p1, :cond_1

    .line 503
    invoke-static {p1}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 507
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/store/CarouselPromoController;->access$200(Lcom/shopkick/app/store/CarouselPromoController;)Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerAdapter$1;->val$position:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 508
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/store/CarouselPromoController;->getPromoConfigurator(I)Lcom/shopkick/app/store/PromoConfigurator;

    move-result-object v1

    .line 509
    invoke-static {p1}, Lcom/shopkick/app/store/CarouselPromoController;->access$1300(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lcom/shopkick/app/store/PromoConfigurator;->onClick(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method
