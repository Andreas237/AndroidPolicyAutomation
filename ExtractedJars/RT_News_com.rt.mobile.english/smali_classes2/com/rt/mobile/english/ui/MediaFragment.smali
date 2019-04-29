.class public Lcom/rt/mobile/english/ui/MediaFragment;
.super Landroid/support/v4/app/Fragment;
.source "MediaFragment.java"

# interfaces
.implements Lretrofit/Callback;
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/app/Fragment;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Ljava/util/List<",
        "Lcom/rt/mobile/english/data/media/Media;",
        ">;>;>;",
        "Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;"
    }
.end annotation


# instance fields
.field loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900d7
    .end annotation
.end field

.field mediaService:Lcom/rt/mobile/english/data/media/MediaService;
    .annotation runtime Ljavax/inject/Inject;
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

    .line 33
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method private reloadData()V
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MediaFragment;->mediaService:Lcom/rt/mobile/english/data/media/MediaService;

    invoke-interface {v0, p0}, Lcom/rt/mobile/english/data/media/MediaService;->getListMedia(Lretrofit/Callback;)V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 0

    .line 98
    iget-object p1, p0, Lcom/rt/mobile/english/ui/MediaFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 60
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 61
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c0052

    const/4 v0, 0x0

    .line 67
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 68
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 70
    iget-object p2, p0, Lcom/rt/mobile/english/ui/MediaFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    .line 72
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MediaFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/ui/MainActivity;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/MediaFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/MainActivity;->setToolbar(Landroid/support/v7/widget/Toolbar;)V

    .line 73
    iget-object p2, p0, Lcom/rt/mobile/english/ui/MediaFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MediaFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p3

    invoke-virtual {p3}, Landroid/support/v4/app/FragmentActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-object p1
.end method

.method public onRetryClicked()V
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MediaFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 104
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/MediaFragment;->reloadData()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 79
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 80
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/MediaFragment;->reloadData()V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/media/Media;",
            ">;>;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 89
    iget-object p2, p0, Lcom/rt/mobile/english/ui/MediaFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setVisibility(I)V

    .line 90
    iget-object p2, p0, Lcom/rt/mobile/english/ui/MediaFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    new-instance v0, Lcom/rt/mobile/english/ui/adapter/MediaPagerAdapter;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MediaFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/rt/mobile/english/ui/adapter/MediaPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;Lcom/rt/mobile/english/data/Message;)V

    invoke-virtual {p2, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 91
    iget-object p2, p0, Lcom/rt/mobile/english/ui/MediaFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/MediaFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p2, v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setViewPager(Landroid/support/v4/view/ViewPager;)V

    .line 92
    iget-object p2, p0, Lcom/rt/mobile/english/ui/MediaFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p2, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 93
    iget-object p1, p0, Lcom/rt/mobile/english/ui/MediaFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 33
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/MediaFragment;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
