.class public Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;
.super Lcom/ibotta/android/mvp/base/MvpActivity;
.source "PwiOnboardingActivity.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/MvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingComponent;",
        ">;",
        "Landroid/support/v4/view/ViewPager$OnPageChangeListener;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;"
    }
.end annotation


# instance fields
.field private pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;

.field protected tlDots:Landroid/support/design/widget/TabLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090483
    .end annotation
.end field

.field protected vpOnboarding:Landroid/support/v4/view/ViewPager;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905cb
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;-><init>()V

    return-void
.end method

.method private clearTitle()V
    .locals 2

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initAdapter()V
    .locals 3

    .line 109
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewEvents;

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;-><init>(Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewEvents;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->vpOnboarding:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->vpOnboarding:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->tlDots:Landroid/support/design/widget/TabLayout;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->vpOnboarding:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/support/design/widget/TabLayout;->setupWithViewPager(Landroid/support/v4/view/ViewPager;Z)V

    return-void
.end method

.method public static synthetic lambda$setMenuListener$0(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;Landroid/view/View;)V
    .locals 0

    .line 88
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;->onCloseTapped()V

    return-void
.end method

.method private setMenuListener(Landroid/view/MenuItem;)V
    .locals 2

    .line 87
    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object p1

    const v0, 0x7f090439

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 88
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/-$$Lambda$PwiOnboardingActivity$bJEyrRDYCb_j4ZHh0XB91s1vMdE;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/-$$Lambda$PwiOnboardingActivity$bJEyrRDYCb_j4ZHh0XB91s1vMdE;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;)V

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingComponent;
    .locals 1

    .line 35
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;

    move-result-object v0

    .line 36
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingView;)V

    .line 37
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->pwiOnboardingModule(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;

    move-result-object p1

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/DaggerPwiOnboardingComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingComponent;

    move-result-object p1

    return-object p1
.end method

.method public finish()V
    .locals 2

    .line 98
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;->finish()V

    const/4 v0, 0x0

    const v1, 0x7f01001e

    .line 99
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public finishWithResult(I)V
    .locals 0

    .line 104
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->setResult(I)V

    .line 105
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->finish()V

    return-void
.end method

.method protected getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getPagerPosition()I
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->tlDots:Landroid/support/design/widget/TabLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TabLayout;->getSelectedTabPosition()I

    move-result v0

    return v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 25
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingComponent;)V
    .locals 0

    .line 43
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;)V

    return-void
.end method

.method public navigatePagerTo(I)V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->vpOnboarding:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;->onBackTapped()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 53
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c005e

    .line 54
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->setContentView(I)V

    .line 55
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->clearTitle()V

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->initAdapter()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0014

    .line 67
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f090017

    .line 69
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 70
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->setMenuListener(Landroid/view/MenuItem;)V

    .line 72
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 77
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f090017

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 79
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;->onCloseTapped()V

    const/4 p1, 0x1

    return p1
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPresenter;->onPageChanged(I)V

    return-void
.end method

.method public setPagerData(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;",
            ">;)V"
        }
    .end annotation

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->pagerAdapter:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;->update(Ljava/util/List;)V

    .line 130
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->tlDots:Landroid/support/design/widget/TabLayout;

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout;->getTouchables()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    .line 131
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method
