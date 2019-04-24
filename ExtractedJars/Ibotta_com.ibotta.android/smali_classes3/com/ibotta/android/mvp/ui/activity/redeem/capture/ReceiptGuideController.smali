.class public Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;
.super Ljava/lang/Object;
.source "ReceiptGuideController.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final receiptFilename:Ljava/lang/String;

.field private final storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->receiptFilename:Ljava/lang/String;

    return-void
.end method

.method private createBitmapOptions()Landroid/graphics/BitmapFactory$Options;
    .locals 4

    .line 86
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x0

    .line 87
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    const/4 v2, 0x1

    .line 88
    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 90
    sget-object v3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v3, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 91
    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    const/4 v2, 0x2

    .line 92
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 93
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    return-object v0
.end method

.method private getPreviousFile(I)Ljava/io/File;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->receiptFilename:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->storage:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->getReceiptImage(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 76
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    const-string p1, "Previous receipt image has gone missing."

    .line 77
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Receipt image has gone missing unexpectedly."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public init(Landroid/content/Context;Landroid/widget/FrameLayout;Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
    .locals 2

    .line 38
    new-instance v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;

    invoke-direct {v0, p1}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    .line 39
    invoke-virtual {p2}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 40
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    invoke-virtual {p1, p3, p4}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->init(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    return-void
.end method

.method public loadPreviousReceipt(I)V
    .locals 2

    if-lez p1, :cond_2

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->isPreviousReceiptApplicable()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 55
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->getPreviousFile(I)Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    .line 62
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->createBitmapOptions()Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->setPreviousReceiptBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Out of memory preparing receipt image for review."

    const/4 v1, 0x0

    .line 66
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method public pause()V
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    if-nez v0, :cond_0

    return-void

    .line 115
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->releaseCapturedReceipt()V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->pause()V

    return-void
.end method

.method public prepareForNewReceiptImage()V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    if-eqz v0, :cond_0

    .line 106
    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->releasePreviousReceipt()V

    :cond_0
    return-void
.end method

.method public previewStarted(Z)V
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    if-eqz v0, :cond_0

    .line 100
    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->previewStarted(Z)V

    :cond_0
    return-void
.end method

.method public setEdgeDistances(Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;)V
    .locals 2

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    if-nez v0, :cond_0

    return-void

    .line 124
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->getReceiptPercDistFromLeft()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->setReceiptPercDistFromLeft(D)V

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->getReceiptPercDistFromRight()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->setReceiptPercDistFromRight(D)V

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->getReceiptPercDistFromTop()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->setReceiptPercDistFromTop(D)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->getReceiptPercDistFromBottom()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/ibotta/android/service/receipt/ReceiptProcessingParams;->setReceiptPercDistFromBottom(D)V

    return-void
.end method
