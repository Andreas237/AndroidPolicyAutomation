.class public Lcom/shopkick/app/products/ScanScreen$ScanOverlayListener;
.super Ljava/lang/Object;
.source "ScanScreen.java"

# interfaces
.implements Lcom/shopkick/app/overlays/interfaces/IOverlayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/ScanScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ScanOverlayListener"
.end annotation


# instance fields
.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/products/ScanScreen;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/products/ScanScreen;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/products/ScanScreen;Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/products/ScanScreen;",
            ">;)V"
        }
    .end annotation

    .line 1592
    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen$ScanOverlayListener;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1593
    iput-object p2, p0, Lcom/shopkick/app/products/ScanScreen$ScanOverlayListener;->screenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onOverlayDismissed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 0

    .line 1602
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$ScanOverlayListener;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/products/ScanScreen;

    if-nez p1, :cond_0

    return-void

    .line 1606
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen$ScanOverlayListener;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p2}, Lcom/shopkick/app/products/ScanScreen;->access$1300(Lcom/shopkick/app/products/ScanScreen;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 1607
    iget-object p2, p0, Lcom/shopkick/app/products/ScanScreen$ScanOverlayListener;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-static {p2}, Lcom/shopkick/app/products/ScanScreen;->access$1400(Lcom/shopkick/app/products/ScanScreen;)Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->resumeBCScanning()V

    :cond_1
    const/4 p2, 0x0

    .line 1609
    invoke-static {p1, p2}, Lcom/shopkick/app/products/ScanScreen;->access$1502(Lcom/shopkick/app/products/ScanScreen;I)I

    return-void
.end method

.method public onOverlayShown(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 0

    return-void
.end method
