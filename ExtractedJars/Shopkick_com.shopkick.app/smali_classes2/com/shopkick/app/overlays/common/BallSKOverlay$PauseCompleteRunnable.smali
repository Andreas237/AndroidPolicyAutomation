.class Lcom/shopkick/app/overlays/common/BallSKOverlay$PauseCompleteRunnable;
.super Ljava/lang/Object;
.source "BallSKOverlay.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/common/BallSKOverlay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PauseCompleteRunnable"
.end annotation


# instance fields
.field overlayRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/overlays/common/BallSKOverlay;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V
    .locals 1

    .line 507
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 505
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay$PauseCompleteRunnable;->overlayRef:Ljava/lang/ref/WeakReference;

    .line 508
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay$PauseCompleteRunnable;->overlayRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 513
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay$PauseCompleteRunnable;->overlayRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/common/BallSKOverlay;

    if-nez v0, :cond_0

    return-void

    .line 518
    :cond_0
    invoke-static {v0}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->access$100(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V

    return-void
.end method
