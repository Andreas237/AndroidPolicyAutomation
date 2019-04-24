.class Lcom/shopkick/app/overlays/base/OverlaysManager$AutoDismissRunnable;
.super Ljava/lang/Object;
.source "OverlaysManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/base/OverlaysManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AutoDismissRunnable"
.end annotation


# instance fields
.field overlayRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/overlays/base/SKOverlay;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/overlays/base/OverlaysManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 0

    .line 517
    iput-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$AutoDismissRunnable;->this$0:Lcom/shopkick/app/overlays/base/OverlaysManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 518
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$AutoDismissRunnable;->overlayRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 523
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$AutoDismissRunnable;->overlayRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/base/SKOverlay;

    if-eqz v0, :cond_0

    .line 525
    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/SKOverlay;->dismiss()V

    :cond_0
    return-void
.end method
