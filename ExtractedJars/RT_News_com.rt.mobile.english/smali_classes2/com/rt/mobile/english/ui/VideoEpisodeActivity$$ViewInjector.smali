.class public Lcom/rt/mobile/english/ui/VideoEpisodeActivity$$ViewInjector;
.super Ljava/lang/Object;
.source "VideoEpisodeActivity$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/VideoEpisodeActivity;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'toolbar\'"

    const v1, 0x7f090196

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/support/v7/widget/Toolbar;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const-string v0, "field \'toolbar_and_tabs\'"

    const v1, 0x7f090197

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    check-cast v0, Landroid/support/design/widget/AppBarLayout;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->toolbar_and_tabs:Landroid/support/design/widget/AppBarLayout;

    const-string v0, "field \'viewPager\'"

    const v1, 0x7f090114

    .line 14
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 15
    check-cast p0, Landroid/support/v4/view/ViewPager;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/VideoEpisodeActivity;)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 20
    iput-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->toolbar_and_tabs:Landroid/support/design/widget/AppBarLayout;

    .line 21
    iput-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    return-void
.end method
