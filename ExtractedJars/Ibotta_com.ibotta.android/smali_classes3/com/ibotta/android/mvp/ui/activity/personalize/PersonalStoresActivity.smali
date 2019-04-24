.class public Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "PersonalStoresActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;
.implements Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogListener;
.implements Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;",
        "Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogListener;",
        "Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;"
    }
.end annotation


# static fields
.field private static final LOTTIE_BONUS_ANIMATION:Ljava/lang/String; = "lottie_10_bonus_animation.json"

.field private static final TAG_FINDING_REBATES:Ljava/lang/String; = "finding_rebates"


# instance fields
.field private adWelcomeBonus:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

.field protected appPickerListV2:Lcom/ibotta/android/views/list/IbottaListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090247
    .end annotation
.end field

.field protected bNext:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090094
    .end annotation
.end field

.field protected handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

.field protected pslvRecycler:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903b9
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    .line 52
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->CPG:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    return-void
.end method

.method private initNextButton()V
    .locals 2

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;->setNextButtonEnabled(Z)V

    return-void
.end method

.method private initRecycler()V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->pslvRecycler:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->setListener(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;)V

    return-void
.end method

.method private initWelcomeBonusDialog()V
    .locals 1

    .line 156
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->adWelcomeBonus:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 1

    .line 63
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->CPG:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    invoke-static {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method private static newIntent(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)Landroid/content/Intent;
    .locals 2

    .line 67
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "personal_store_mode"

    .line 68
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public static start(Landroid/content/Context;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 59
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 39
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresComponent;
    .locals 1

    .line 75
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;

    move-result-object v0

    .line 76
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;)V

    .line 77
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->personalStoresModule(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;)Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;

    move-result-object p1

    .line 78
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/DaggerPersonalStoresComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresComponent;

    move-result-object p1

    return-object p1
.end method

.method public disableNextButton()V
    .locals 2

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->bNext:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public dismissWelcomeBonusDialog()V
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->adWelcomeBonus:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->dismiss()V

    return-void
.end method

.method public enableNextButton()V
    .locals 2

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->bNext:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public getAnimationFilename()Ljava/lang/String;
    .locals 1

    const-string v0, "lottie_10_bonus_animation.json"

    return-object v0
.end method

.method public getHeaderPrompt(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)Ljava/lang/String;
    .locals 0

    .line 232
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->getPromptTextResId()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getWelcomeBonusDialogButtonText()Ljava/lang/String;
    .locals 1

    const v0, 0x7f110183

    .line 172
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hideSubmittedJobLoading()V
    .locals 0

    return-void
.end method

.method protected initToolBar()V
    .locals 3

    .line 124
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->initToolBar()V

    .line 126
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 127
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 128
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v7/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 129
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const v2, 0x7f08028d

    invoke-virtual {v0, v2}, Landroid/support/v7/app/ActionBar;->setLogo(I)V

    .line 130
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/support/v7/app/ActionBar;->setDisplayUseLogoEnabled(Z)V

    .line 131
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    goto :goto_0

    :cond_0
    const-string v0, "getSupportActionBar() returned null. Could not create action bar"

    .line 133
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 39
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresComponent;)V
    .locals 0

    .line 83
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;)V

    return-void
.end method

.method public loadState(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "personal_store_mode"

    .line 104
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 106
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "personal_store_mode"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    .line 108
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;->setPersonalStoreMode(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V

    return-void
.end method

.method public onActionClicked()V
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;->dialogActionClicked()V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;->onBackPressed()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 88
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c0057

    .line 90
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->setContentView(I)V

    .line 91
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 93
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->initRecycler()V

    .line 94
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->initNextButton()V

    .line 95
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->initWelcomeBonusDialog()V

    .line 97
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->loadState(Landroid/os/Bundle;)V

    .line 99
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->bNext:Landroid/widget/Button;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;->getPersonalStoreMode()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->getButtonLabelResId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onDismissedClicked()V
    .locals 0

    return-void
.end method

.method protected onNextClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090094
        }
    .end annotation

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;->onNextClicked()V

    return-void
.end method

.method public onPersonalRetailerCardClicked(Lcom/ibotta/android/view/model/PersonalStoresItem;)V
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;->onPersonalRetailerCardClicked(Lcom/ibotta/android/view/model/PersonalStoresItem;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->pslvRecycler:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->trackRetailerClick(Lcom/ibotta/android/view/model/PersonalStoresItem;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 113
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "personal_store_mode"

    .line 114
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setRows(Ljava/util/List;Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;",
            ">;",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;",
            ")V"
        }
    .end annotation

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->pslvRecycler:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->setRows(Ljava/util/List;Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V

    return-void
.end method

.method public showFindingRebates()V
    .locals 3

    .line 206
    invoke-static {}, Lcom/ibotta/android/fragment/dialog/FindingRebatesDialogFragment;->newInstance()Lcom/ibotta/android/fragment/dialog/FindingRebatesDialogFragment;

    move-result-object v0

    .line 207
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "finding_rebates"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showPersonalStoresApps()V
    .locals 1

    .line 212
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->APP:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    invoke-static {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showSubmittedJobLoading()V
    .locals 0

    return-void
.end method

.method public showWelcomeBonusDialog(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;Z)V
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->adWelcomeBonus:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->setup(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;Z)V

    .line 198
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->adWelcomeBonus:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->setCanceledOnTouchOutside(Z)V

    .line 199
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->adWelcomeBonus:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->setCancelable(Z)V

    .line 200
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->adWelcomeBonus:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->setListener(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogListener;)V

    .line 201
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresActivity;->adWelcomeBonus:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->show()V

    return-void
.end method
