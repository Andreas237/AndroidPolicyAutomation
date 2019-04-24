.class Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;
.super Landroid/os/CountDownTimer;
.source "PromoTileTimerController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/PromoTileTimerController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PromoTileTimer"
.end annotation


# instance fields
.field private timerControllerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/store/PromoTileTimerController;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JJLcom/shopkick/app/store/PromoTileTimerController;)V
    .locals 0

    .line 156
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 157
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;->timerControllerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;->timerControllerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/PromoTileTimerController;

    if-eqz v0, :cond_0

    .line 174
    invoke-static {v0}, Lcom/shopkick/app/store/PromoTileTimerController;->access$100(Lcom/shopkick/app/store/PromoTileTimerController;)V

    :cond_0
    return-void
.end method

.method public onTick(J)V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;->timerControllerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/PromoTileTimerController;

    if-eqz v0, :cond_0

    .line 164
    invoke-static {v0, p1, p2}, Lcom/shopkick/app/store/PromoTileTimerController;->access$000(Lcom/shopkick/app/store/PromoTileTimerController;J)V

    goto :goto_0

    .line 166
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/store/PromoTileTimerController$PromoTileTimer;->cancel()V

    :goto_0
    return-void
.end method
