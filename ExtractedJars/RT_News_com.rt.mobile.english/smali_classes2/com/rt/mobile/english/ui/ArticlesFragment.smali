.class public Lcom/rt/mobile/english/ui/ArticlesFragment;
.super Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;
.source "ArticlesFragment.java"

# interfaces
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Ljava/util/List<",
        "Lcom/rt/mobile/english/data/articles/Section;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900d7
    .end annotation
.end field

.field slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090182
    .end annotation
.end field

.field toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090196
    .end annotation
.end field

.field viewPager:Landroid/support/v4/view/ViewPager;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090114
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;-><init>()V

    return-void
.end method

.method private reloadData()V
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesFragment;->articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;

    invoke-interface {v0, p0}, Lcom/rt/mobile/english/data/articles/ArticlesService;->listSections(Lretrofit/Callback;)V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 0

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 51
    invoke-super {p0, p1}, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->onAttach(Landroid/app/Activity;)V

    .line 52
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c004c

    const/4 v0, 0x0

    .line 65
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 66
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 68
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    new-instance p3, Lcom/rt/mobile/english/ui/ArticlesFragment$1;

    invoke-direct {p3, p0}, Lcom/rt/mobile/english/ui/ArticlesFragment$1;-><init>(Lcom/rt/mobile/english/ui/ArticlesFragment;)V

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setCustomTabColorizer(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;)V

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 84
    invoke-super {p0, p1, p2}, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 85
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticlesFragment;->reloadData()V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Section;",
            ">;>;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 95
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setVisibility(I)V

    .line 97
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p2, v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setViewPager(Landroid/support/v4/view/ViewPager;)V

    .line 99
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p2

    sget-object v0, Lcom/rt/mobile/english/Utils$EditionEnum;->AR:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne p2, v0, :cond_0

    .line 100
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p2, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ArticlesFragment;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
