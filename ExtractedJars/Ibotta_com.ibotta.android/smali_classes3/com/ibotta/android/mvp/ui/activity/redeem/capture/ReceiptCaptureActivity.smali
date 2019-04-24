.class public Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;
.super Lcom/ibotta/android/mvp/base/MvpActivity;
.source "ReceiptCaptureActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;
.implements Lcom/ibotta/android/view/camera/ReceiptCameraView$ReceiptCameraListener;
.implements Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/MvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;",
        "Lcom/ibotta/android/view/camera/ReceiptCameraView$ReceiptCameraListener;",
        "Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;"
    }
.end annotation


# static fields
.field public static final RESULT_CODE_FAIL:I = 0x0

.field public static final RESULT_CODE_SUCCESS:I = 0x1

.field private static final TAG_CAMERA_ERROR:Ljava/lang/String; = "camera_error"

.field private static final TAG_FAILED_IMAGE_PROCESSING:Ljava/lang/String; = "failed_image_processing"

.field private static final TAG_RECEIPT_CAPTURE_CONFIRM_FINISHED:Ljava/lang/String; = "receipt_capture_confirm_finished"

.field private static final TOAST_DELAY:J


# instance fields
.field protected flGuideHolder:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901f0
    .end annotation
.end field

.field protected formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected imageProcessor:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903c2
    .end annotation
.end field

.field protected rcvCamera:Lcom/ibotta/android/view/camera/ReceiptCameraView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903c3
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
.method static constructor <clinit>()V
    .locals 3

    .line 55
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->TOAST_DELAY:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;-><init>()V

    return-void
.end method

.method private disableControls()V
    .locals 3

    const-string v0, "disableControls"

    const/4 v1, 0x0

    .line 379
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->hideWarning()V

    .line 382
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setCaptureAllowed(Z)V

    return-void
.end method

.method private hideWarning()V
    .locals 3

    .line 371
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->tvWarning:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "hideWarning"

    const/4 v2, 0x0

    .line 374
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->tvWarning:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public static synthetic lambda$showToastWarning$0(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;)V
    .locals 0

    .line 356
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->reenableControls()V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 5
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 112
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->isFreshStart(Landroid/os/Bundle;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "retailer"

    .line 113
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const-string v2, "capture_count"

    .line 114
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "expecting_result"

    .line 115
    invoke-virtual {p1, v3, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    move v4, v2

    move v2, v1

    move v1, v4

    goto :goto_0

    .line 116
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 117
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "retailer"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 120
    :goto_0
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->isFreshStart(Landroid/os/Bundle;)Z

    move-result p1

    invoke-interface {v3, p1, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onLoadState(ZLcom/ibotta/android/fragment/retailer/RetailerParcel;IZ)V

    return-void
.end method

.method private reenableControls()V
    .locals 2

    const-string v0, "reenableControls"

    const/4 v1, 0x0

    .line 386
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->hideWarning()V

    .line 389
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setCaptureAllowed(Z)V

    return-void
.end method

.method private showToastWarning(IJ)V
    .locals 1

    .line 351
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->disableControls()V

    .line 353
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->showWarning(I)V

    .line 356
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->handler:Landroid/os/Handler;

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/-$$Lambda$ReceiptCaptureActivity$PDXmusDD9UHmIySHWqf6_dPmscU;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/-$$Lambda$ReceiptCaptureActivity$PDXmusDD9UHmIySHWqf6_dPmscU;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;)V

    invoke-virtual {p1, v0, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private showWarning(I)V
    .locals 4

    .line 360
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->tvWarning:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f110569

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    const-string v0, "showWarning: %1$d"

    const/4 v1, 0x1

    .line 365
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->tvWarning:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 367
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->tvWarning:Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public confirmFinish(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 4
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    return-void

    .line 178
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/api/model/retailer/RedemptionMeta;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object p1

    const v0, 0x7f110566

    .line 179
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f110565

    const/4 v2, 0x1

    .line 180
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameLower()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    .line 182
    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-static {v0, p1, v1}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    move-result-object p1

    .line 184
    invoke-virtual {p1, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 185
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v1, "receipt_capture_confirm_finished"

    invoke-virtual {v0, p0, p1, v1}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void

    :array_0
    .array-data 4
        0x7f1101b9
        0x7f110196
    .end array-data
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 50
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureComponent;
    .locals 1

    .line 78
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;

    move-result-object v0

    .line 79
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureView;)V

    .line 80
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->receiptCaptureModule(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;

    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/DaggerReceiptCaptureComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithFailure()V
    .locals 1

    const/4 v0, 0x0

    .line 254
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->setResult(I)V

    .line 255
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->finish()V

    return-void
.end method

.method public finishWithSuccess()V
    .locals 1

    const/4 v0, 0x1

    .line 248
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->setResult(I)V

    .line 249
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->finish()V

    return-void
.end method

.method protected getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getReceiptSilo()Lcom/ibotta/android/commons/disk/StorageSilo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->storageSiloState:Lcom/ibotta/android/state/xprocess/StorageSiloState;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/state/xprocess/StorageSiloState;->getReceiptSilo(Landroid/content/Context;)Lcom/ibotta/android/commons/disk/StorageSilo;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 50
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureComponent;)V
    .locals 0

    .line 86
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 134
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/MvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    const-string p1, "action"

    .line 137
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 138
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-static {p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onPostCaptureAction(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onBackPressed()V

    return-void
.end method

.method public onCameraConfigured(Landroid/hardware/Camera$Parameters;)V
    .locals 0

    .line 291
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onCameraConfigured()V

    return-void
.end method

.method public onCameraError()V
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onCameraError()V

    return-void
.end method

.method public onCameraOpened()V
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onCameraOpened()V

    return-void
.end method

.method public onCameraOpening()V
    .locals 1

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onCameraOpening()V

    return-void
.end method

.method public onChoice(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const-string v0, "receipt_capture_confirm_finished"

    .line 337
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f110196

    if-ne p2, v0, :cond_0

    .line 338
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onFinishConfirmed()V

    goto :goto_0

    .line 340
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/MvpActivity;->onChoice(Ljava/lang/String;ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 91
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c0060

    .line 93
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->setContentView(I)V

    .line 94
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcvCamera:Lcom/ibotta/android/view/camera/ReceiptCameraView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->setActivity(Landroid/app/Activity;)V

    .line 98
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->loadState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDialogFragmentDismissed(Ljava/lang/String;)V
    .locals 1

    const-string v0, "camera_error"

    .line 328
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "failed_image_processing"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 331
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onDialogFragmentDismissed(Ljava/lang/String;)V

    goto :goto_1

    .line 329
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onFailureDialogDismissed()V

    :goto_1
    return-void
.end method

.method public onFocusDetermined(Z)V
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onFocusDetermined(Z)V

    return-void
.end method

.method public onFocusFail()V
    .locals 1

    .line 318
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onFocusFail()V

    return-void
.end method

.method public onFocusing()V
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onFocusing()V

    return-void
.end method

.method public onManualOverride()V
    .locals 1

    .line 323
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onManualOverride()V

    return-void
.end method

.method public onOrientationDetermined(I)V
    .locals 1

    .line 270
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onOrientationDetermined(I)V

    return-void
.end method

.method public onPictureTaken([B)V
    .locals 1

    .line 307
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->hideWarning()V

    .line 308
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onPictureTaken([B)V

    return-void
.end method

.method public onPreviewStarted()V
    .locals 2

    .line 296
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcvCamera:Lcom/ibotta/android/view/camera/ReceiptCameraView;

    invoke-virtual {v1}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->isManualFocus()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onPreviewStarted(Z)V

    .line 297
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->hideWarning()V

    return-void
.end method

.method public onPreviewStopped()V
    .locals 1

    .line 302
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onPreviewStopped()V

    return-void
.end method

.method public onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
    .locals 1

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 125
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 127
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->getRetailerOptional()Ljava9/util/Optional;

    move-result-object v1

    invoke-virtual {v1}, Ljava9/util/Optional;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "capture_count"

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->getCaptureCount()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "expecting_result"

    .line 129
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCapturePresenter;->isExpectingActivityResult()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 103
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;->onStart()V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setListener(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;)V

    return-void
.end method

.method public pauseCamera()V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcvCamera:Lcom/ibotta/android/view/camera/ReceiptCameraView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->pause()V

    return-void
.end method

.method public prepareGuide(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
    .locals 1
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->flGuideHolder:Landroid/widget/FrameLayout;

    invoke-virtual {p1, p0, v0, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptGuideController;->init(Landroid/content/Context;Landroid/widget/FrameLayout;Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    :cond_0
    if-lez p3, :cond_1

    .line 229
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->tvReceiptCount:Landroid/widget/TextView;

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->tvReceiptCount:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 233
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->imageProcessor:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;

    if-eqz p1, :cond_2

    .line 234
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcvCamera:Lcom/ibotta/android/view/camera/ReceiptCameraView;

    invoke-virtual {p2}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getCameraParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p2

    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptImageProcessor;->setPreviewSize(Landroid/hardware/Camera$Size;)V

    :cond_2
    return-void
.end method

.method public resumeCamera()V
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcvCamera:Lcom/ibotta/android/view/camera/ReceiptCameraView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->resume()V

    return-void
.end method

.method public setCanSubmit(Z)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setCanSubmit(Z)V

    return-void
.end method

.method public setCaptureAllowed(Z)V
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setCaptureAllowed(Z)V

    return-void
.end method

.method public setReceiptCaptureMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    return-void
.end method

.method public showCameraError()V
    .locals 2

    .line 201
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->hideWarning()V

    const-string v0, "camera_error"

    const v1, 0x7f110141

    .line 202
    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->showErrorMessage(ILjava/lang/String;)V

    return-void
.end method

.method public showCaptureFailedError()V
    .locals 2

    const-string v0, "failed_image_processing"

    const v1, 0x7f110567

    .line 207
    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->showErrorMessage(ILjava/lang/String;)V

    return-void
.end method

.method public showFocusFailedWarning()V
    .locals 3

    .line 217
    sget-wide v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->TOAST_DELAY:J

    const v2, 0x7f110568

    invoke-direct {p0, v2, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->showToastWarning(IJ)V

    return-void
.end method

.method public showInitializingWarning()V
    .locals 1

    const v0, 0x7f110562

    .line 196
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->showWarning(I)V

    return-void
.end method

.method public showPleaseHoldWarning()V
    .locals 1

    const v0, 0x7f110569

    .line 212
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->showWarning(I)V

    return-void
.end method

.method public showPostCapture(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;I)V
    .locals 1
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 240
    new-instance v0, Lcom/ibotta/android/routing/intent/PostCaptureIntentCreator;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/routing/intent/PostCaptureIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;I)V

    .line 241
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PostCaptureIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/4 p2, 0x2

    .line 242
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->startActivityForResult(Landroid/content/Intent;I)V

    const/4 p1, 0x0

    .line 243
    invoke-virtual {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public takePhoto(Z)V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcvCamera:Lcom/ibotta/android/view/camera/ReceiptCameraView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->takePicture()V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setCaptureAllowed(Z)V

    return-void
.end method
