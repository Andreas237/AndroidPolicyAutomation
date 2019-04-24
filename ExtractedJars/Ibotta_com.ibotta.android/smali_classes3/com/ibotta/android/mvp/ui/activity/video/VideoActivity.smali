.class public Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;
.super Lcom/ibotta/android/mvp/base/MvpActivity;
.source "VideoActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/video/VideoView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/MvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/video/VideoComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/video/VideoView;"
    }
.end annotation


# static fields
.field public static final RESULT_CANCELED:I = 0x3

.field public static final RESULT_ERROR:I = 0x2

.field public static final RESULT_SUCCESS:I = 0x1

.field private static final TAG_VIDEO_ERROR:Ljava/lang/String; = "video_error"


# instance fields
.field private allowCancel:Z

.field private allowSkip:Z

.field protected bSkip:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a9
    .end annotation
.end field

.field protected flVideoContainer:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901fe
    .end annotation
.end field

.field protected ivvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902d4
    .end annotation
.end field

.field protected tibVideoPlay:Lcom/ibotta/android/commons/view/TintableImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090466
    .end annotation
.end field

.field private trackingImpressionUrl:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private url:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private urlIsAd:Z

.field protected vgLoading:Landroid/view/ViewGroup;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903cd
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;-><init>()V

    return-void
.end method

.method private finishWithResult(I)V
    .locals 0

    .line 247
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->setResult(I)V

    .line 248
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->finish()V

    return-void
.end method

.method private handleDialogClosed(Ljava/lang/String;)V
    .locals 1

    const-string v0, "video_error"

    .line 147
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 148
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;->onErrorDialogClosed()V

    :cond_0
    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 6
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "url"

    .line 79
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->url:Ljava/lang/String;

    const-string v1, "url_is_add"

    .line 80
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->urlIsAd:Z

    const-string v1, "allow_cancel"

    .line 81
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->allowCancel:Z

    const-string v1, "allow_skip"

    .line 82
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->allowSkip:Z

    const-string v0, "tracking_impression_url"

    .line 83
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->trackingImpressionUrl:Ljava/lang/String;

    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "url"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->url:Ljava/lang/String;

    .line 86
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "url_is_add"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->urlIsAd:Z

    .line 87
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "allow_cancel"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->allowCancel:Z

    .line 88
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "allow_skip"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->allowSkip:Z

    .line 89
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "tracking_impression_url"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->trackingImpressionUrl:Ljava/lang/String;

    .line 92
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->url:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->urlIsAd:Z

    iget-boolean v3, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->allowCancel:Z

    iget-boolean v4, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->allowSkip:Z

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->trackingImpressionUrl:Ljava/lang/String;

    invoke-interface/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;->setParams(Ljava/lang/String;ZZZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public confirmCancel()V
    .locals 3

    const v0, 0x7f110675

    .line 193
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f110673

    .line 194
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    .line 198
    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    move-result-object v0

    .line 199
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 200
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-class v2, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x7f110672
        0x7f110674
    .end array-data
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 36
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/video/VideoComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/video/VideoComponent;
    .locals 1

    .line 56
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/video/DaggerVideoComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/video/DaggerVideoComponent$Builder;

    move-result-object v0

    .line 57
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/DaggerVideoComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/video/DaggerVideoComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoView;)V

    .line 58
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/video/DaggerVideoComponent$Builder;->videoModule(Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;)Lcom/ibotta/android/mvp/ui/activity/video/DaggerVideoComponent$Builder;

    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/video/DaggerVideoComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/video/VideoComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithCanceled()V
    .locals 1

    const/4 v0, 0x3

    .line 188
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->finishWithResult(I)V

    return-void
.end method

.method public finishWithError()V
    .locals 1

    const/4 v0, 0x2

    .line 178
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->finishWithResult(I)V

    return-void
.end method

.method public finishWithSuccess()V
    .locals 1

    const/4 v0, 0x1

    .line 183
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->finishWithResult(I)V

    return-void
.end method

.method public getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public hideLoadingIndicator()V
    .locals 2

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->vgLoading:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public hidePause()V
    .locals 2

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->tibVideoPlay:Lcom/ibotta/android/commons/view/TintableImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/view/TintableImageButton;->setVisibility(I)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 36
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/video/VideoComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/video/VideoComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/video/VideoComponent;)V
    .locals 0

    .line 64
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;->onBackPressed()V

    return-void
.end method

.method public onCancelClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09007f
        }
    .end annotation

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;->onCancelClicked()V

    return-void
.end method

.method public onChoice(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    const p1, 0x7f110674

    if-ne p2, p1, :cond_0

    .line 126
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;->onCancelConfirmed()V

    goto :goto_0

    .line 128
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;->onCancelNotConfirmed()V

    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 120
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 69
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c007c

    .line 71
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->setContentView(I)V

    .line 72
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 74
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->loadState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDialogFragmentCancelled(Ljava/lang/String;)V
    .locals 0

    .line 141
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onDialogFragmentCancelled(Ljava/lang/String;)V

    .line 143
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->handleDialogClosed(Ljava/lang/String;)V

    return-void
.end method

.method public onDialogFragmentDismissed(Ljava/lang/String;)V
    .locals 0

    .line 134
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onDialogFragmentDismissed(Ljava/lang/String;)V

    .line 136
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->handleDialogClosed(Ljava/lang/String;)V

    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 113
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-class v1, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hideSync(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    .line 115
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->vgLoading:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 108
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;->onResume()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 97
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "url"

    .line 98
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->url:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "url_is_add"

    .line 99
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->urlIsAd:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "allow_cancel"

    .line 100
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->allowCancel:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "allow_skip"

    .line 101
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->allowSkip:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public onSkipClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a9
        }
    .end annotation

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;->onSkipClicked()V

    return-void
.end method

.method public onVideoPlayClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090466
        }
    .end annotation

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;->onVideoPlayClicked()V

    return-void
.end method

.method public onVideoTouched()Z
    .locals 1
    .annotation runtime Lbutterknife/OnTouch;
        value = {
            0x7f0902d4
        }
    .end annotation

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;->onVideoTouched()V

    const/4 v0, 0x0

    return v0
.end method

.method public setVideoController(Lcom/ibotta/android/mvp/ui/activity/video/VideoController;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 160
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->flVideoContainer:Landroid/widget/FrameLayout;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->setPlayerView(Landroid/view/View;)V

    goto :goto_0

    .line 162
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->ivvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/video/VideoController;->setPlayerView(Landroid/view/View;)V

    :goto_0
    return-void
.end method

.method public showError()V
    .locals 3

    const/4 v0, 0x0

    const-wide/32 v1, 0x7f110676

    .line 205
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->newInstance(ZJ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;

    move-result-object v0

    .line 206
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 207
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "video_error"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showLoadingIndicator()V
    .locals 2

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->vgLoading:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public showPause()V
    .locals 2

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->tibVideoPlay:Lcom/ibotta/android/commons/view/TintableImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/view/TintableImageButton;->setVisibility(I)V

    return-void
.end method

.method public showSkip()V
    .locals 2

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->bSkip:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method
