.class Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;
.super Ljava/lang/Object;
.source "OverlaysManager.java"

# interfaces
.implements Lcom/shopkick/app/overlays/common/OverlaySpecState$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/base/OverlaysManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ReplaceCurrentOverlayRunnable"
.end annotation


# instance fields
.field private currentOverlayRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;",
            ">;"
        }
    .end annotation
.end field

.field private overlayReplaceListenerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;",
            ">;"
        }
    .end annotation
.end field

.field private specSpecStateToReplace:Lcom/shopkick/app/overlays/common/OverlaySpecState;

.field final synthetic this$0:Lcom/shopkick/app/overlays/base/OverlaysManager;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/common/OverlaySpecState;Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;)V
    .locals 0

    .line 419
    iput-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;->this$0:Lcom/shopkick/app/overlays/base/OverlaysManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 420
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;->currentOverlayRef:Ljava/lang/ref/WeakReference;

    .line 421
    iput-object p3, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;->specSpecStateToReplace:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    .line 422
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;->overlayReplaceListenerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/common/OverlaySpecState;Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;Lcom/shopkick/app/overlays/base/OverlaysManager$1;)V
    .locals 0

    .line 412
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;-><init>(Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/common/OverlaySpecState;Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;)V

    return-void
.end method


# virtual methods
.method public onPrepareFailed(Lcom/shopkick/app/overlays/common/OverlaySpecState;)V
    .locals 1

    .line 433
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;->overlayReplaceListenerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;

    if-eqz v0, :cond_0

    .line 435
    invoke-virtual {p1}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;->onOverlayReplaceFailed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    :cond_0
    return-void
.end method

.method public onPrepared()V
    .locals 4

    .line 427
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;->currentOverlayRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 428
    iget-object v1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;->this$0:Lcom/shopkick/app/overlays/base/OverlaysManager;

    iget-object v2, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;->specSpecStateToReplace:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    iget-object v3, p0, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;->overlayReplaceListenerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;

    invoke-static {v1, v0, v2, v3}, Lcom/shopkick/app/overlays/base/OverlaysManager;->access$100(Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/common/OverlaySpecState;Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;)V

    return-void
.end method
