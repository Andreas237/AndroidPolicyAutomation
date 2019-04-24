.class public Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;
.super Lcom/ibotta/android/mvp/base/MvpActivity;
.source "DebugFeatureFlagActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/MvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;"
    }
.end annotation


# instance fields
.field protected rgVariants:Landroid/widget/RadioGroup;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903c6
    .end annotation
.end field

.field protected scDebug:Landroid/support/v7/widget/SwitchCompat;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903f4
    .end annotation
.end field

.field private settingDebugProgrammatically:Z

.field private settingVariantProgrammatically:Z

.field protected tvChosenVariantName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09050b
    .end annotation
.end field

.field protected tvTestDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090515
    .end annotation
.end field

.field protected tvTestName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090585
    .end annotation
.end field

.field protected viewEvents:Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;

.field private viewState:Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;-><init>()V

    .line 34
    sget-object v0, Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;->EMPTY:Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->viewState:Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;

    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->settingDebugProgrammatically:Z

    .line 37
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->settingVariantProgrammatically:Z

    return-void
.end method

.method private initChosenVariantName(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->tvChosenVariantName:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;->getPrettyChosenVariantName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initDebugSwitch(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V
    .locals 1

    const/4 v0, 0x1

    .line 103
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->settingDebugProgrammatically:Z

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->scDebug:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;->isDebugEnabled()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    const/4 p1, 0x0

    .line 105
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->settingDebugProgrammatically:Z

    return-void
.end method

.method private initDebugSwitchListener()V
    .locals 2

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->scDebug:Landroid/support/v7/widget/SwitchCompat;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagActivity$8XPQL_fjfW9_wyk4bkfpiv0P_Xo;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagActivity$8XPQL_fjfW9_wyk4bkfpiv0P_Xo;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SwitchCompat;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method private initRadioGroup(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V
    .locals 7

    const/4 v0, 0x1

    .line 109
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->settingVariantProgrammatically:Z

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->rgVariants:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->removeAllViews()V

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->rgVariants:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->clearCheck()V

    .line 114
    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;->getDebugVariantRows()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;

    .line 115
    new-instance v4, Landroid/support/v7/widget/AppCompatRadioButton;

    invoke-direct {v4, p0}, Landroid/support/v7/widget/AppCompatRadioButton;-><init>(Landroid/content/Context;)V

    .line 116
    invoke-virtual {v4, v2}, Landroid/support/v7/widget/AppCompatRadioButton;->setId(I)V

    .line 117
    invoke-virtual {v3}, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;->isVariantChosen()Z

    move-result v5

    if-eqz v5, :cond_0

    move v1, v2

    .line 120
    :cond_0
    invoke-virtual {v3}, Lcom/ibotta/android/views/debug/feature/detail/DebugVariantRow;->getPrettyVariantName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/support/v7/widget/AppCompatRadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 121
    new-instance v3, Landroid/widget/RadioGroup$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v3, v5, v6}, Landroid/widget/RadioGroup$LayoutParams;-><init>(II)V

    .line 123
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->rgVariants:Landroid/widget/RadioGroup;

    add-int/lit8 v6, v2, 0x1

    invoke-virtual {v5, v4, v2, v3}, Landroid/widget/RadioGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    move v2, v6

    goto :goto_0

    .line 125
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->rgVariants:Landroid/widget/RadioGroup;

    invoke-virtual {p1, v1}, Landroid/widget/RadioGroup;->check(I)V

    .line 126
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->settingVariantProgrammatically:Z

    return-void
.end method

.method private initTestDescription(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->tvTestDescription:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;->getTestDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initTestName(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->tvTestName:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;->getPrettyTestName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initVariantsListener()V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->rgVariants:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagActivity$vD6TMkamblqbgQ8YGmFypVNss70;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagActivity$vD6TMkamblqbgQ8YGmFypVNss70;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    return-void
.end method

.method public static synthetic lambda$initDebugSwitchListener$0(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 131
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->settingDebugProgrammatically:Z

    if-nez p1, :cond_0

    .line 132
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->viewEvents:Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;

    invoke-interface {p1, p2}, Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;->onDebugTapped(Z)V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$initVariantsListener$1(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;Landroid/widget/RadioGroup;I)V
    .locals 1

    .line 139
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->viewState:Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;->getDebugVariantRows()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 140
    :goto_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->settingVariantProgrammatically:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    .line 141
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->viewEvents:Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;

    invoke-interface {p1, p2}, Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;->onDebugVariantSelected(I)V

    :cond_1
    return-void
.end method

.method private loadParams()V
    .locals 2

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;->getPersistedState()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "presenter_state"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPersistedState;

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;->setPersistedState(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->bindViewEvents(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->viewEvents:Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;

    return-void
.end method

.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 26
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagComponent;
    .locals 1

    .line 41
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;

    move-result-object v0

    .line 42
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;

    invoke-direct {v0, p0, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;Lcom/ibotta/android/views/components/ViewComponent;)V

    .line 43
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->debugFeatureFlagModule(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;

    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DaggerDebugFeatureFlagComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagComponent;

    move-result-object p1

    return-object p1
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

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagComponent;)V
    .locals 0

    .line 49
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 54
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c002c

    .line 55
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->setContentView(I)V

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->loadParams()V

    .line 57
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->initDebugSwitchListener()V

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->initVariantsListener()V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 26
    check-cast p1, Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->updateViewState(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V
    .locals 0
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->viewState:Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;

    .line 78
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->initTestName(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V

    .line 79
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->initTestDescription(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V

    .line 80
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->initChosenVariantName(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V

    .line 81
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->initDebugSwitch(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V

    .line 82
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagActivity;->initRadioGroup(Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;)V

    return-void
.end method
