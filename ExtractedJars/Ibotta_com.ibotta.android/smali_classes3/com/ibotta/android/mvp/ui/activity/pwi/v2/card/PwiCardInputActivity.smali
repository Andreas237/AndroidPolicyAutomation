.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "PwiCardInputActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;
.implements Lcom/ibotta/android/views/pwi/StripeInputViewListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;",
        "Lcom/ibotta/android/views/pwi/StripeInputViewListener;"
    }
.end annotation


# instance fields
.field protected sivStripeInputView:Lcom/ibotta/android/views/pwi/StripeInputView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090412
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "pwi_first_time_card"

    .line 61
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "pwi_first_time_card"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 66
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;->setFirstTimeCard(Z)V

    return-void
.end method


# virtual methods
.method public buildAndValidateNewPaymentCard(Lcom/stripe/android/model/Card;)V
    .locals 1
    .param p1    # Lcom/stripe/android/model/Card;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;->buildNewPaymentSourceFromCard(Lcom/stripe/android/model/Card;)V

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 27
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputComponent;
    .locals 1

    .line 34
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent$Builder;

    move-result-object v0

    .line 35
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;)V

    .line 36
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent$Builder;->pwiCardInputModule(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputModule;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent$Builder;

    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithSuccessResult()V
    .locals 1

    const/4 v0, 0x2

    .line 94
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->setResult(I)V

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->finish()V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 27
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputComponent;)V
    .locals 0

    .line 42
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 47
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c005c

    .line 49
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->setContentView(I)V

    .line 50
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 52
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->loadState(Landroid/os/Bundle;)V

    .line 54
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->sivStripeInputView:Lcom/ibotta/android/views/pwi/StripeInputView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/views/pwi/StripeInputView;->bindViewEvents(Lcom/ibotta/android/views/pwi/StripeInputViewListener;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 71
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "pwi_first_time_card"

    .line 72
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;->isFirstTimeCard()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public showErrorDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
    .locals 0

    .line 89
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/views/messages/alert/SemiModal;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/SemiModal;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModal;->show()V

    return-void
.end method

.method public showGenericStripeErrorMessage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->sivStripeInputView:Lcom/ibotta/android/views/pwi/StripeInputView;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const p1, 0x7f110507

    .line 84
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 83
    :goto_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/StripeInputView;->displayGenericStripeErrorMessage(Ljava/lang/String;)V

    return-void
.end method
