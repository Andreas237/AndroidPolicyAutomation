.class public Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity_ViewBinding;
.super Ljava/lang/Object;
.source "PwiOnboardingActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;

    const-string v0, "field \'vpOnboarding\'"

    .line 27
    const-class v1, Landroid/support/v4/view/ViewPager;

    const v2, 0x7f0905cb

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->vpOnboarding:Landroid/support/v4/view/ViewPager;

    const-string v0, "field \'tlDots\'"

    .line 28
    const-class v1, Landroid/support/design/widget/TabLayout;

    const v2, 0x7f090483

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/support/design/widget/TabLayout;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->tlDots:Landroid/support/design/widget/TabLayout;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;

    .line 38
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->vpOnboarding:Landroid/support/v4/view/ViewPager;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingActivity;->tlDots:Landroid/support/design/widget/TabLayout;

    return-void

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
