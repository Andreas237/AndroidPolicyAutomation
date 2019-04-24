.class public Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "WindfallReceiptCaptureActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;
.implements Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;",
        "Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;"
    }
.end annotation


# static fields
.field public static final RESP_CODE_SUCCESS:I = 0x1

.field private static final TAG_ERROR_IMAGE_SAVE_FAILED:Ljava/lang/String; = "error_image_save_failed"


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

.field protected flGuideHolder:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901f0
    .end annotation
.end field

.field protected rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903c2
    .end annotation
.end field

.field private recognizerCallback:Lcom/microblink/SimpleCameraRecognizerCallback;

.field protected rvRecognizer:Lcom/microblink/RecognizerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903c5
    .end annotation
.end field

.field protected storageSiloState:Lcom/ibotta/android/state/xprocess/StorageSiloState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvReceiptCount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090567
    .end annotation
.end field

.field protected tvWarning:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09059a
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;Lcom/microblink/BitmapResult;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->onWindfallCameraFrameResults(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$500(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    return-object p0
.end method

.method static synthetic access$600(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$700(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$800(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 60
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private initReceiptCaptureButtons()V
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setListener(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;)V

    return-void
.end method

.method private initReceiptGuide(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
    .locals 1

    .line 384
    new-instance v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;

    invoke-direct {v0, p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    .line 385
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->init(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    return-void
.end method

.method private initReceiptGuideHolder()V
    .locals 4

    .line 389
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->flGuideHolder:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 390
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->flGuideHolder:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private initRecognizerCallback()V
    .locals 2

    .line 396
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$WindfallRecognizerCallback;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$1;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->recognizerCallback:Lcom/microblink/SimpleCameraRecognizerCallback;

    return-void
.end method

.method private initRecognizerView()V
    .locals 5

    .line 400
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    sget-object v1, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    invoke-virtual {v0, v1}, Lcom/microblink/RecognizerView;->setAspectMode(Lcom/microblink/camera/view/CameraAspectMode;)V

    .line 401
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->recognizerCallback:Lcom/microblink/SimpleCameraRecognizerCallback;

    invoke-virtual {v0, v1}, Lcom/microblink/RecognizerView;->recognizerCallback(Lcom/microblink/CameraRecognizerCallback;)V

    .line 405
    invoke-static {}, Lcom/microblink/RecognizerCompatibility;->defaultRegionOfInterest()Landroid/graphics/RectF;

    move-result-object v0

    .line 411
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    invoke-virtual {v1, v0}, Lcom/microblink/RecognizerView;->scanRegion(Landroid/graphics/RectF;)V

    .line 412
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    const/4 v2, 0x1

    new-array v3, v2, [Landroid/graphics/RectF;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-virtual {v1, v3, v2}, Lcom/microblink/RecognizerView;->setMeteringAreas([Landroid/graphics/RectF;Z)V

    .line 413
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->create()V

    return-void
.end method

.method public static synthetic lambda$showCaptureFailed$2(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V
    .locals 1

    .line 319
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onCaptureFailedDisplayed()V

    return-void
.end method

.method public static synthetic lambda$showInitFailed$0(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V
    .locals 1

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onInitFailed()V

    return-void
.end method

.method public static synthetic lambda$showRebatesFound$3(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;Landroid/content/DialogInterface;)V
    .locals 0

    .line 347
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onRebatesFoundDisplayed()V

    return-void
.end method

.method public static synthetic lambda$showRebatesFound$4(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;Landroid/content/DialogInterface;)V
    .locals 0

    .line 348
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onRebatesFoundDisplayed()V

    return-void
.end method

.method public static synthetic lambda$showScanFailed$1(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V
    .locals 1

    .line 284
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onScanFailedDisplayed()V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v0, "retailer"

    .line 134
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const-string v1, "capture_count"

    .line 135
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    move v3, v1

    move-object v1, v0

    move v0, v3

    goto :goto_0

    .line 136
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 137
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "retailer"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 140
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->isFreshStart(Landroid/os/Bundle;)Z

    move-result p1

    invoke-interface {v2, p1, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onLoadState(ZLcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    return-void
.end method

.method public static newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;
    .locals 3

    .line 91
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "retailer"

    .line 92
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 94
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    const v1, 0x7f11024b

    invoke-virtual {p1, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 95
    new-instance v1, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    sget-object v2, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->CAMERA:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-direct {v1, p0, v2, p1, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;Ljava/lang/String;Landroid/content/Intent;)V

    const/4 p0, 0x0

    .line 96
    invoke-virtual {v1, p0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->requestCode(I)Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    move-result-object p0

    .line 97
    invoke-virtual {p0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->create()Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method private onWindfallCameraFrameResults(Lcom/microblink/BitmapResult;)V
    .locals 1

    .line 375
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onBitmapResultReceived(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method public static start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 87
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public capturePhoto()V
    .locals 2

    .line 294
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V

    invoke-virtual {v0, v1}, Lcom/microblink/RecognizerView;->takePicture(Lcom/microblink/CameraCaptureListener;)V

    return-void
.end method

.method public confirmCapture(Lcom/microblink/BitmapResult;)V
    .locals 1

    .line 310
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    invoke-virtual {v0, p1}, Lcom/microblink/RecognizerView;->confirmPicture(Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 60
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureComponent;
    .locals 1

    .line 102
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;

    move-result-object v0

    .line 103
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureView;)V

    .line 104
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->windfallReceiptCaptureModule(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;

    move-result-object p1

    .line 105
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/DaggerWindfallReceiptCaptureComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureComponent;

    move-result-object p1

    return-object p1
.end method

.method public destroyReceiptGuide()V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    if-eqz v0, :cond_0

    .line 250
    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->releasePreviousReceipt()V

    :cond_0
    return-void
.end method

.method public destroyRecognizer()V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    if-eqz v0, :cond_0

    .line 236
    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->destroy()V

    :cond_0
    return-void
.end method

.method public finishScan()V
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->finishedScanning()V

    return-void
.end method

.method public finishWithFailure()V
    .locals 0

    .line 265
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->finish()V

    return-void
.end method

.method public finishWithSuccessResult(I)V
    .locals 2

    .line 270
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "verified_count"

    .line 271
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 p1, 0x1

    .line 273
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->setResult(ILandroid/content/Intent;)V

    .line 275
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->finish()V

    return-void
.end method

.method public getButtonCaptureMode()Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 179
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->getMode()Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    move-result-object v0

    return-object v0
.end method

.method public getReceiptSilo()Lcom/ibotta/android/commons/disk/StorageSilo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .line 366
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->storageSiloState:Lcom/ibotta/android/state/xprocess/StorageSiloState;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/state/xprocess/StorageSiloState;->getReceiptSilo(Landroid/content/Context;)Lcom/ibotta/android/commons/disk/StorageSilo;

    move-result-object v0

    return-object v0
.end method

.method public hideMoveCloserMessage()V
    .locals 2

    .line 361
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->tvWarning:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public initWithScanOptions(Lcom/microblink/ScanOptions;)V
    .locals 2
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    const/4 v0, 0x0

    .line 201
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    invoke-virtual {v1, p1}, Lcom/microblink/RecognizerView;->initialize(Lcom/microblink/ScanOptions;)V

    const-string p1, "Recognizer initialized"

    .line 202
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed to initialize Windfall with ScanOptions"

    .line 204
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onInitWithScanOptionsFailed()V

    :goto_0
    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 60
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureComponent;)V
    .locals 0

    .line 110
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 115
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 117
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v2, 0x7f060022

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/AppHelper;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    const v0, 0x7f0c007e

    .line 119
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->setContentView(I)V

    .line 120
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 122
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->initReceiptCaptureButtons()V

    .line 124
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->loadState(Landroid/os/Bundle;)V

    .line 126
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onReadyForSetup()V

    return-void
.end method

.method public onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
    .locals 1

    .line 380
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 145
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 147
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "capture_count"

    .line 148
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->getCaptureCount()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public pauseReceiptGuide()V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    if-eqz v0, :cond_0

    .line 243
    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->pause()V

    :cond_0
    return-void
.end method

.method public pauseRecognizer()V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    if-eqz v0, :cond_0

    .line 222
    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->pause()V

    :cond_0
    return-void
.end method

.method public releaseCapturedPhoto()V
    .locals 1

    .line 340
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->releaseCapturedReceipt()V

    return-void
.end method

.method public resumeRecognizer()V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->resume()V

    return-void
.end method

.method public setButtonCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    .line 186
    sget-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->POST_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    if-ne p1, v0, :cond_0

    .line 187
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/microblink/RecognizerView;->setVisibility(I)V

    goto :goto_0

    .line 189
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/microblink/RecognizerView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setCanSubmit(Z)V
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setCanSubmit(Z)V

    return-void
.end method

.method public setCaptureAllowed(Z)V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setCaptureAllowed(Z)V

    return-void
.end method

.method public setCaptureCount(I)V
    .locals 1

    if-lez p1, :cond_0

    .line 331
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->tvReceiptCount:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 332
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->tvReceiptCount:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 334
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->tvReceiptCount:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setCapturedReceiptBitmap(Lcom/microblink/BitmapResult;)V
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    invoke-interface {p1}, Lcom/microblink/BitmapResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->setCapturedReceiptBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public setup(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
    .locals 0

    .line 167
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->initReceiptGuide(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    .line 168
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->initReceiptGuideHolder()V

    .line 169
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->initRecognizerCallback()V

    .line 170
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->initRecognizerView()V

    return-void
.end method

.method public showCaptureFailed()V
    .locals 4

    .line 315
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$xhlF0wcjE6TqBlIuUCF0Neeb2eE;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$xhlF0wcjE6TqBlIuUCF0Neeb2eE;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V

    const v1, 0x7f110571

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v2, v3, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->showQuickMessage(IZZLcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$NotificationDialogListener;)V

    return-void
.end method

.method public showInitFailed()V
    .locals 4

    .line 256
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$OgYlm3mKppLvjq4VZtsdtEfWgo4;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$OgYlm3mKppLvjq4VZtsdtEfWgo4;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V

    const v1, 0x7f110573

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v2, v3, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->showQuickMessage(IZZLcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$NotificationDialogListener;)V

    return-void
.end method

.method public showMoveCloserMessage()V
    .locals 2

    .line 355
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->tvWarning:Landroid/widget/TextView;

    const v1, 0x7f110574

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 356
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->tvWarning:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public showPreviousReceipt(Lcom/microblink/BitmapResult;)V
    .locals 1

    .line 324
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    invoke-interface {p1}, Lcom/microblink/BitmapResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->setPreviousReceiptBitmap(Landroid/graphics/Bitmap;)V

    .line 325
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->releaseCapturedPhoto()V

    return-void
.end method

.method public showRebatesFound(I)V
    .locals 1

    .line 345
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;-><init>(Landroid/content/Context;)V

    .line 346
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->setRebatesFound(I)V

    .line 347
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$3aBmWzd_SRESt4Qm33YMR-3Io3s;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$3aBmWzd_SRESt4Qm33YMR-3Io3s;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 348
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$XA_nQSCBrADtCLEOcoRI-XBiRuY;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$XA_nQSCBrADtCLEOcoRI-XBiRuY;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 350
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/RebatesFoundDialog;->show()V

    return-void
.end method

.method public showReceiptImageSaveFailed()V
    .locals 2

    const-string v0, "error_image_save_failed"

    const v1, 0x7f110572

    .line 371
    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->showErrorMessage(ILjava/lang/String;)V

    return-void
.end method

.method public showScanFailed()V
    .locals 4

    .line 280
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$zwpRwL32mctbtc5McNViwZzTVNI;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/-$$Lambda$WindfallReceiptCaptureActivity$zwpRwL32mctbtc5McNViwZzTVNI;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V

    const v1, 0x7f110575

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v2, v3, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->showQuickMessage(IZZLcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog$NotificationDialogListener;)V

    return-void
.end method

.method public startRecognizer()V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->start()V

    return-void
.end method

.method public stopRecognizer()V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->rvRecognizer:Lcom/microblink/RecognizerView;

    if-eqz v0, :cond_0

    .line 229
    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->stop()V

    :cond_0
    return-void
.end method
