.class public Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "SubmitReceiptActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;"
    }
.end annotation


# instance fields
.field protected formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected lavSubmitted:Lcom/airbnb/lottie/LottieAnimationView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ea
    .end annotation
.end field

.field protected lavSubmittingOrFailed:Lcom/airbnb/lottie/LottieAnimationView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902eb
    .end annotation
.end field

.field protected llFailed:Landroid/widget/RelativeLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09030a
    .end annotation
.end field

.field protected llSubmitted:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09032b
    .end annotation
.end field

.field protected llSubmitting:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09032c
    .end annotation
.end field

.field protected llSuccess:Landroid/widget/RelativeLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09032d
    .end annotation
.end field

.field protected storageSiloState:Lcom/ibotta/android/state/xprocess/StorageSiloState;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private submittedAnimationListener:Landroid/animation/Animator$AnimatorListener;

.field protected tvSubmitting:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09057b
    .end annotation
.end field

.field protected tvSuccessMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090581
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private getRetailerParcel(Landroid/os/Bundle;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-eqz p1, :cond_0

    const-string v0, "retailer"

    .line 146
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object p1

    .line 147
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 148
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private getVerifiedAmount(Landroid/os/Bundle;)F
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v0, "verified_amount"

    .line 135
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    goto :goto_0

    .line 136
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 137
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "verified_amount"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getFloatExtra(Ljava/lang/String;F)F

    move-result v0

    :cond_1
    :goto_0
    return v0
.end method

.method private initSubmittingProgress()V
    .locals 1

    const/4 v0, 0x0

    .line 155
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->setSubmittingProgress(F)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;F)Landroid/content/Intent;
    .locals 2

    .line 71
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "retailer"

    .line 72
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "verified_amount"

    .line 73
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;F)Landroid/content/Intent;

    return-object v0
.end method

.method public static start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;F)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 67
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;F)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptComponent;
    .locals 1

    .line 80
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;

    move-result-object v0

    .line 81
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;)V

    .line 82
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->submitReceiptModule(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;

    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/DaggerSubmitReceiptComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptComponent;

    move-result-object p1

    return-object p1
.end method

.method public getReceiptSilo()Lcom/ibotta/android/commons/disk/StorageSilo;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 268
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->storageSiloState:Lcom/ibotta/android/state/xprocess/StorageSiloState;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/state/xprocess/StorageSiloState;->getReceiptSilo(Landroid/content/Context;)Lcom/ibotta/android/commons/disk/StorageSilo;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/android/commons/disk/StorageException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 270
    :catch_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;->onFailedToGetReceiptSilo()V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 42
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptComponent;)V
    .locals 0

    .line 88
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)V

    return-void
.end method

.method protected onCancelClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09007f
        }
    .end annotation

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;->onCancelClicked()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 93
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c006e

    .line 96
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->setContentView(I)V

    .line 97
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->getRetailerParcel(Landroid/os/Bundle;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->getVerifiedAmount(Landroid/os/Bundle;)F

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;->setVerifiedAmount(F)V

    .line 102
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity$1;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->submittedAnimationListener:Landroid/animation/Animator$AnimatorListener;

    .line 121
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->initSubmittingProgress()V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmitted:Lcom/airbnb/lottie/LottieAnimationView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->submittedAnimationListener:Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->removeAnimatorListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 211
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onDestroy()V

    return-void
.end method

.method protected onDoneClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090086
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;->onDoneClicked()V

    return-void
.end method

.method protected onRedeemAnotherClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09009b
        }
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;->onRedeemAnotherClicked()V

    return-void
.end method

.method protected onRetryClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a1
        }
    .end annotation

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;->onRetryClicked()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 126
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 127
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "verified_amount"

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;->getVerifiedAmount()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-void
.end method

.method public setSubmittingProgress(F)V
    .locals 3

    .line 259
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Formatting;->percentage(F)Ljava/lang/String;

    move-result-object p1

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->tvSubmitting:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f11061c

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public showFailed()V
    .locals 2

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitting:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitted:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSuccess:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmitted:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llFailed:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 254
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmittingOrFailed:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    return-void
.end method

.method public showRedeemRequirements(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 180
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public showSubmitted()V
    .locals 2

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitting:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSuccess:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llFailed:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmittingOrFailed:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitted:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmitted:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmitted:Lcom/airbnb/lottie/LottieAnimationView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->submittedAnimationListener:Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->addAnimatorListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmitted:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieAnimationView;->playAnimation()V

    return-void
.end method

.method public showSubmittedJobLoading()V
    .locals 0

    return-void
.end method

.method public showSubmitting()V
    .locals 2

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitted:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSuccess:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llFailed:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmitted:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmittingOrFailed:Lcom/airbnb/lottie/LottieAnimationView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitting:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public showSuccess()V
    .locals 2

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitting:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llFailed:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitted:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmittingOrFailed:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSuccess:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmitted:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setVisibility(I)V

    return-void
.end method

.method public showSuccessMessage(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 227
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string p1, ""

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getCreditPendingPeriod()Ljava/lang/String;

    move-result-object v0

    .line 232
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const v0, 0x7f11014e

    .line 233
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const v2, 0x7f11005f

    const/4 v3, 0x2

    .line 236
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v1

    const/4 v0, 0x1

    aput-object p1, v3, v0

    invoke-virtual {p0, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 239
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v0, v2, :cond_2

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->tvSuccessMessage:Landroid/widget/TextView;

    invoke-static {p1, v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 242
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->tvSuccessMessage:Landroid/widget/TextView;

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
