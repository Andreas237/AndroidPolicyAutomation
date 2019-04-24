.class public Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "PwiOnboardingPagerAdapter.java"


# instance fields
.field private final viewEvents:Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewEvents;

.field private viewStates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewEvents;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 20
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;->viewStates:Ljava/util/List;

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;->viewEvents:Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewEvents;

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 51
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;->viewStates:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 3
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 38
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c019d

    const/4 v2, 0x0

    .line 39
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboarding;

    .line 41
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;->viewStates:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;

    .line 42
    invoke-virtual {v0, p2}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboarding;->updateViewState(Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;)V

    .line 43
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;->viewEvents:Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewEvents;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/views/pwi/onboarding/PwiOnboarding;->bindViewEvents(Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewEvents;)V

    .line 45
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public update(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/onboarding/PwiOnboardingViewState;",
            ">;)V"
        }
    .end annotation

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;->viewStates:Ljava/util/List;

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingPagerAdapter;->notifyDataSetChanged()V

    return-void
.end method
