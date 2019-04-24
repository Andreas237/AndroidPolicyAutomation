.class Lcom/shopkick/app/overlays/common/BallSKOverlay$PostToFacebookClick;
.super Ljava/lang/Object;
.source "BallSKOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/common/BallSKOverlay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PostToFacebookClick"
.end annotation


# instance fields
.field private overlayRef:Ljava/lang/ref/WeakReference;
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

    .line 554
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 555
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay$PostToFacebookClick;->overlayRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 560
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay$PostToFacebookClick;->overlayRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/overlays/common/BallSKOverlay;

    if-nez p1, :cond_0

    return-void

    .line 564
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->access$200(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V

    .line 565
    invoke-static {p1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->access$300(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V

    return-void
.end method
