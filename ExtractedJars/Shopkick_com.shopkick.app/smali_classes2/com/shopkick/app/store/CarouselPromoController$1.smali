.class Lcom/shopkick/app/store/CarouselPromoController$1;
.super Ljava/util/TimerTask;
.source "CarouselPromoController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/CarouselPromoController;->startSlidingPromoViewPager()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/CarouselPromoController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/CarouselPromoController;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/shopkick/app/store/CarouselPromoController$1;->this$0:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/store/CarouselPromoController$1;->this$0:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-static {v0}, Lcom/shopkick/app/store/CarouselPromoController;->access$100(Lcom/shopkick/app/store/CarouselPromoController;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/CarouselPromoController$1;->this$0:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-static {v1}, Lcom/shopkick/app/store/CarouselPromoController;->access$000(Lcom/shopkick/app/store/CarouselPromoController;)Lcom/shopkick/app/store/CarouselPromoController$SlidingPromoViewPagerRunnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
