.class Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchObserver;
.super Ljava/lang/Object;
.source "ScanOverlayImpl.java"

# interfaces
.implements Lcom/scandit/base/util/Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TorchObserver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/scandit/base/util/Observer<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private mView:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V
    .locals 1

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchObserver;->mView:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onChange(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 3

    .line 126
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchObserver;->mView:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    if-nez v0, :cond_0

    return-void

    .line 128
    :cond_0
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Landroid/os/Handler;

    move-result-object v0

    const/16 v2, 0xb

    .line 129
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 128
    invoke-virtual {v0, v2, p1, p2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public bridge synthetic onChange(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 118
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchObserver;->onChange(Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method
