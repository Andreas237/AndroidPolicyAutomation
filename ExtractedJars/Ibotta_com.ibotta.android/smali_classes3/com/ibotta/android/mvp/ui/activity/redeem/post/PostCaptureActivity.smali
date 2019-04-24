.class public Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;
.super Lcom/ibotta/android/mvp/base/MvpActivity;
.source "PostCaptureActivity.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;
.implements Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/MvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureComponent;",
        ">;",
        "Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;",
        "Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;"
    }
.end annotation


# static fields
.field private static final MAX_RECEIPTS_IMAGE_DELAY:J

.field private static final TAG_POST_CAPTURE_CONFIRM_FINISHED:Ljava/lang/String; = "post_capture_confirm_finished"


# instance fields
.field private argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field protected flGuideHolder:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901f0
    .end annotation
.end field

.field protected formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903c2
    .end annotation
.end field

.field protected tvMaxReceiptImages:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090546
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 52
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->MAX_RECEIPTS_IMAGE_DELAY:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;-><init>()V

    return-void
.end method

.method private initButtons()V
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setListener(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;)V

    return-void
.end method

.method private initGuide()V
    .locals 4

    .line 126
    new-instance v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;

    invoke-direct {v0, p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideViewDefaultRegion;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->flGuideHolder:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;->getRetailer()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;->getCaptureCount()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->init(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    return-void
.end method

.method private initMaxReceiptImagesText()V
    .locals 4

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->tvMaxReceiptImages:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    .line 138
    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;->getMaxReceiptImages()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f1104bc

    invoke-virtual {p0, v2, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 137
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic lambda$showMaxReceiptImagesReached$0(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;)V
    .locals 2

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->tvMaxReceiptImages:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 6
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string v0, "retailer"

    .line 102
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const-string v2, "receipt_path"

    .line 103
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "capture_count"

    .line 104
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    move-object v5, v2

    move v2, p1

    move-object p1, v5

    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 106
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 107
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "receipt_path"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 108
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "capture_count"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    goto :goto_0

    :cond_1
    move-object p1, v0

    const/4 v2, 0x0

    :goto_0
    const-string v3, "Post capture: %1$s"

    const/4 v4, 0x1

    .line 111
    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v1

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    invoke-interface {v1, v0, p1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;->setData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public confirmFinish(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 4
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 196
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/api/model/retailer/RedemptionMeta;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object p1

    goto :goto_0

    .line 197
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object p1

    :goto_0
    const v0, 0x7f110566

    .line 199
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f110565

    const/4 v2, 0x1

    .line 200
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameLower()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    .line 202
    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-static {v0, p1, v1}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    move-result-object p1

    .line 204
    invoke-virtual {p1, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 205
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v1, "post_capture_confirm_finished"

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

    .line 48
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureComponent;
    .locals 1

    .line 69
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;

    move-result-object v0

    .line 70
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureView;)V

    .line 71
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->postCaptureModule(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;

    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/DaggerPostCaptureComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithResult(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
    .locals 2

    .line 210
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "action"

    .line 211
    invoke-virtual {p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, -0x1

    .line 213
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->setResult(ILandroid/content/Intent;)V

    .line 214
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->finish()V

    const/4 p1, 0x0

    .line 216
    invoke-virtual {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->overridePendingTransition(II)V

    return-void
.end method

.method protected getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 48
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureComponent;)V
    .locals 0

    .line 77
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;->onBackPressed()V

    return-void
.end method

.method public onChoice(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const-string v0, "post_capture_confirm_finished"

    .line 221
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f110196

    if-ne p2, v0, :cond_0

    .line 222
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;->onFinishConfirmed()V

    goto :goto_0

    .line 224
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

    .line 82
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c0058

    .line 84
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->setContentView(I)V

    .line 85
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 87
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->loadState(Landroid/os/Bundle;)V

    .line 89
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->initGuide()V

    .line 90
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->initButtons()V

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->initMaxReceiptImagesText()V

    .line 93
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;->onViewReady()V

    return-void
.end method

.method public onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;->onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 118
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 120
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;->getRetailer()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "receipt_path"

    .line 121
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;->getReceiptPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "capture_count"

    .line 122
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCapturePresenter;->getCaptureCount()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public releaseCapturedReceiptImage()V
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    if-eqz v0, :cond_0

    .line 181
    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->releaseCapturedReceipt()V

    :cond_0
    return-void
.end method

.method public setCanSubmit(Z)V
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setCanSubmit(Z)V

    return-void
.end method

.method public setMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    return-void
.end method

.method public showCapturedReceiptImage(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 159
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 160
    iput-boolean v0, v1, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    const/4 v2, 0x1

    .line 161
    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 163
    sget-object v3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v3, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 164
    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    const/4 v2, 0x4

    .line 165
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 167
    invoke-static {p1, v1}, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 169
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    if-eqz v1, :cond_0

    .line 170
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->argvGuide:Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->setCapturedReceiptBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Out of memory preparing receipt image for review."

    .line 174
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public showMaxReceiptImagesReached()V
    .locals 4

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->tvMaxReceiptImages:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->tvMaxReceiptImages:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->tvMaxReceiptImages:Landroid/widget/TextView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/post/-$$Lambda$PostCaptureActivity$RBIrJxdN84NRnXjYfg-BsdiZbo0;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/post/-$$Lambda$PostCaptureActivity$RBIrJxdN84NRnXjYfg-BsdiZbo0;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;)V

    sget-wide v2, Lcom/ibotta/android/mvp/ui/activity/redeem/post/PostCaptureActivity;->MAX_RECEIPTS_IMAGE_DELAY:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/TextView;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
