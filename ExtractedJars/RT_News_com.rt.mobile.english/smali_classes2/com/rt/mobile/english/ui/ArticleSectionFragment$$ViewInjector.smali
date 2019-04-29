.class public Lcom/rt/mobile/english/ui/ArticleSectionFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "ArticleSectionFragment$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/ArticleSectionFragment;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'viewPager\'"

    const v1, 0x7f090114

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    const-string v0, "field \'loadingView\'"

    const v1, 0x7f0900d7

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    check-cast v0, Lcom/rt/mobile/english/ui/widget/LoadingView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    const-string v0, "field \'toolbar\'"

    const v1, 0x7f090196

    .line 14
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 15
    check-cast v0, Landroid/support/v7/widget/Toolbar;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    const-string v0, "field \'toolbar_and_tabs\'"

    const v1, 0x7f090025

    .line 16
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 17
    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar_and_tabs:Landroid/view/View;

    const-string v0, "field \'slidingTabLayout\'"

    const v1, 0x7f090168

    .line 18
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 19
    check-cast v0, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    const-string v0, "field \'toolbar_live\'"

    const v1, 0x7f090198

    .line 20
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 21
    check-cast p0, Landroid/widget/Button;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar_live:Landroid/widget/Button;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/ArticleSectionFragment;)V
    .locals 1

    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    .line 26
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    .line 27
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 28
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar_and_tabs:Landroid/view/View;

    .line 29
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    .line 30
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar_live:Landroid/widget/Button;

    return-void
.end method
