.class Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;
.super Ljava/lang/Object;
.source "ScanV3ViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/overlays/interfaces/IOverlayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "FailedOfflineScanOverlayListener"
.end annotation


# instance fields
.field private clientLogRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

.field private context:Landroid/content/Context;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private overlayViewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private productFamilyId:Ljava/lang/String;

.field private scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field private scanErrorCode:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Landroid/view/View;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 0

    .line 675
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 676
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->context:Landroid/content/Context;

    .line 677
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 678
    iput p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->scanErrorCode:I

    .line 679
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->productFamilyId:Ljava/lang/String;

    .line 680
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->overlayViewRef:Ljava/lang/ref/WeakReference;

    .line 681
    iput-object p6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->clientLogRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    .line 682
    iput-object p7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 687
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->context:Landroid/content/Context;

    iget v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->scanErrorCode:I

    invoke-static {p1, v0, p0}, Lcom/shopkick/app/util/ScanClickUtils;->showScanErrorToast(Landroid/content/Context;ILcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    .line 690
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz p1, :cond_0

    .line 691
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->clientLogRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    :cond_0
    return-void
.end method

.method public onOverlayDismissed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 0

    .line 700
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->removeFamilyIdFromFailedOfflineScan(Ljava/lang/String;)V

    .line 701
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;->overlayViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_0

    const/16 p2, 0x8

    .line 703
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public onOverlayShown(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 0

    return-void
.end method
