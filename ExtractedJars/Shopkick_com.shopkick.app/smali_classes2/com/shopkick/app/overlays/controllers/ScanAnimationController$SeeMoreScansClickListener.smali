.class Lcom/shopkick/app/overlays/controllers/ScanAnimationController$SeeMoreScansClickListener;
.super Ljava/lang/Object;
.source "ScanAnimationController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/controllers/ScanAnimationController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SeeMoreScansClickListener"
.end annotation


# instance fields
.field scanAnimationControllerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/overlays/controllers/ScanAnimationController;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)V
    .locals 1

    .line 509
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 510
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$SeeMoreScansClickListener;->scanAnimationControllerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 515
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/ScanAnimationController$SeeMoreScansClickListener;->scanAnimationControllerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;

    if-eqz p1, :cond_0

    .line 517
    invoke-static {p1}, Lcom/shopkick/app/overlays/controllers/ScanAnimationController;->access$400(Lcom/shopkick/app/overlays/controllers/ScanAnimationController;)V

    :cond_0
    return-void
.end method
