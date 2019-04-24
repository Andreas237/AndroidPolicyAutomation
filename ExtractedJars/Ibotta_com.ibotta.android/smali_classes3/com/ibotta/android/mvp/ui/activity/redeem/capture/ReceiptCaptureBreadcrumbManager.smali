.class public Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;
.super Ljava/lang/Object;
.source "ReceiptCaptureBreadcrumbManager.java"


# instance fields
.field private final breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    return-void
.end method

.method private createBreadcrumb(II)Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;
    .locals 1

    .line 40
    new-instance v0, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;-><init>()V

    .line 41
    invoke-virtual {v0, p1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->setRetailerId(I)V

    const/4 p1, 0x0

    .line 42
    invoke-virtual {v0, p1}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->setWindfall(Z)V

    .line 43
    invoke-virtual {v0, p2}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->setPictureCount(I)V

    .line 45
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    invoke-interface {p1, v0}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->saveBreadcrumb(Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;)V

    return-object v0
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    sget-object v1, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->BREADCRUMB_RECEIPT_CAPTURE:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->deleteBreadcrumb(Ljava/lang/String;)V

    return-void
.end method

.method public init(II)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;->createBreadcrumb(II)Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    return-void
.end method

.method public setPictureCount(II)V
    .locals 3

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    sget-object v1, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->BREADCRUMB_RECEIPT_CAPTURE:Ljava/lang/String;

    const-class v2, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->getBreadcrumb(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    if-nez v0, :cond_0

    .line 28
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;->createBreadcrumb(II)Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;

    move-result-object v0

    .line 31
    :cond_0
    invoke-virtual {v0, p2}, Lcom/ibotta/android/state/app/breadcrumb/ReceiptCaptureBreadcrumb;->setPictureCount(I)V

    .line 32
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureBreadcrumbManager;->breadcrumbStorage:Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;

    invoke-interface {p1, v0}, Lcom/ibotta/android/state/app/breadcrumb/BreadcrumbStorage;->saveBreadcrumb(Lcom/ibotta/android/state/app/breadcrumb/Breadcrumb;)V

    return-void
.end method
