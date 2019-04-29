.class public Lcom/rt/mobile/english/ui/ChannelsFragment;
.super Landroid/support/v4/app/Fragment;
.source "ChannelsFragment.java"

# interfaces
.implements Lcom/rt/mobile/english/ui/PagerFragment$Listener;
.implements Lcom/rt/mobile/english/ui/PagerFragment$Adapter;
.implements Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;
.implements Lretrofit/Callback;
.implements Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/app/Fragment;",
        "Lcom/rt/mobile/english/ui/PagerFragment$Listener;",
        "Lcom/rt/mobile/english/ui/PagerFragment$Adapter;",
        "Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;",
        "Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Ljava/util/List<",
        "Lcom/rt/mobile/english/data/channels/Channel;",
        ">;>;>;",
        "Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;"
    }
.end annotation


# instance fields
.field private channels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/channels/Channel;",
            ">;"
        }
    .end annotation
.end field

.field channelsService:Lcom/rt/mobile/english/data/channels/ChannelsService;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field chromeCast:Lcom/rt/mobile/english/ui/widget/ChromeCast;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field gson:Lcom/google/gson/Gson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900d7
    .end annotation
.end field

.field private pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

.field private selectChanelFragment:Lcom/rt/mobile/english/ui/ChannelFragment;

.field slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090168
    .end annotation
.end field

.field toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090196
    .end annotation
.end field

.field toolbar_and_tabs:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090197
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 55
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->channels:Ljava/util/List;

    return-void
.end method

.method static synthetic access$002(Lcom/rt/mobile/english/ui/ChannelsFragment;Lcom/rt/mobile/english/ui/ChannelFragment;)Lcom/rt/mobile/english/ui/ChannelFragment;
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->selectChanelFragment:Lcom/rt/mobile/english/ui/ChannelFragment;

    return-object p1
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/ui/ChannelsFragment;)Lcom/rt/mobile/english/ui/PagerFragment;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

    return-object p0
.end method

.method private reloadData()V
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->channelsService:Lcom/rt/mobile/english/data/channels/ChannelsService;

    invoke-interface {v0, p0}, Lcom/rt/mobile/english/data/channels/ChannelsService;->listChannels(Lretrofit/Callback;)V

    return-void
.end method

.method private setTabsInvisible()V
    .locals 2

    .line 180
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setVisibility(I)V

    return-void
.end method

.method private setTabsVisibility()V
    .locals 2

    .line 176
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 0

    .line 276
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->setTabsInvisible()V

    .line 277
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public getFragment(I)Landroid/support/v4/app/Fragment;
    .locals 2

    .line 185
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->channels:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->gson:Lcom/google/gson/Gson;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->channels:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/rt/mobile/english/ui/ChannelFragment;->newInstance(Ljava/lang/String;)Lcom/rt/mobile/english/ui/ChannelFragment;

    move-result-object p1

    return-object p1
.end method

.method public getInitialPosition()I
    .locals 2

    .line 193
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/PagerFragment;->setPagerBackground(I)V

    const/4 v0, 0x0

    return v0
.end method

.method public getPageCount()I
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->channels:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 202
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->channels:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getTabTitle(I)Ljava/lang/String;
    .locals 2

    .line 250
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->channels:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 253
    :cond_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 254
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->channels:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/channels/Channel;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/channels/Channel;->getTitle()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getToolBar()Landroid/support/v7/widget/Toolbar;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    return-object v0
.end method

.method public getToolBarAndTabs()Landroid/view/View;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->toolbar_and_tabs:Landroid/view/View;

    return-object v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 135
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 136
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    .line 137
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 138
    invoke-static {v0, v1}, Lcom/rt/mobile/english/ui/PagerFragment;->newInstance(ZLjava/lang/String;)Lcom/rt/mobile/english/ui/PagerFragment;

    move-result-object v0

    const v1, 0x7f090058

    invoke-virtual {p1, v1, v0}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    .line 139
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 90
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method public onAttach(Lcom/rt/mobile/english/ui/PagerFragment;)V
    .locals 1

    .line 209
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

    .line 210
    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/ui/PagerFragment;->setAdapter(Lcom/rt/mobile/english/ui/PagerFragment$Adapter;)V

    .line 211
    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/ui/PagerFragment;->setTabsAdapter(Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;)V

    .line 212
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/ui/PagerFragment;->setSlidingTabLayout(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)V

    .line 213
    new-instance v0, Lcom/rt/mobile/english/ui/ChannelsFragment$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/ChannelsFragment$1;-><init>(Lcom/rt/mobile/english/ui/ChannelsFragment;)V

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/ui/PagerFragment;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    return-void
.end method

.method public onChromecastConnected()V
    .locals 2

    .line 292
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->selectChanelFragment:Lcom/rt/mobile/english/ui/ChannelFragment;

    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->selectChanelFragment:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->onChromecastConnected()V

    goto :goto_0

    .line 295
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/PagerFragment;->getFragmentAtPosition(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->onChromecastConnected()V

    :goto_0
    return-void
.end method

.method public onChromecastDisconnect()V
    .locals 2

    .line 282
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->selectChanelFragment:Lcom/rt/mobile/english/ui/ChannelFragment;

    if-eqz v0, :cond_0

    .line 283
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->selectChanelFragment:Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->onChromecastDisconnect()V

    goto :goto_0

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/PagerFragment;->getFragmentAtPosition(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->onChromecastDisconnect()V

    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 95
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 97
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f10002b

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c0050

    const/4 v0, 0x0

    .line 114
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 115
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 117
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/ui/MainActivity;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/MainActivity;->setToolbar(Landroid/support/v7/widget/Toolbar;)V

    .line 118
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p3

    invoke-virtual {p3}, Landroid/support/v4/app/FragmentActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 120
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->chromeCast:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p3

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p2, p3, v0, p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->Initialize(Landroid/app/Activity;Landroid/support/v7/widget/Toolbar;Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;)V

    .line 122
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 149
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 150
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 152
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 153
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 154
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x800

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    .line 157
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 158
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    return-void
.end method

.method public onDetach()V
    .locals 0

    .line 144
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    return-void
.end method

.method public onDetach(Lcom/rt/mobile/english/ui/PagerFragment;)V
    .locals 0

    return-void
.end method

.method public onLiveItemsLoaded()V
    .locals 2

    .line 168
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getPageCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 169
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->setTabsVisibility()V

    goto :goto_0

    .line 171
    :cond_0
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->setTabsInvisible()V

    :goto_0
    return-void
.end method

.method public onRetryClicked()V
    .locals 1

    .line 260
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 261
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->reloadData()V

    return-void
.end method

.method public onStart()V
    .locals 0

    .line 102
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->chromeCast:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->onStop()V

    .line 108
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 129
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 130
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->reloadData()V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/channels/Channel;",
            ">;>;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 266
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->channels:Ljava/util/List;

    .line 267
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

    if-eqz p1, :cond_0

    .line 268
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/PagerFragment;->notifyDataSetChanged()V

    .line 270
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelsFragment;->onLiveItemsLoaded()V

    .line 271
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelsFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 55
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ChannelsFragment;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
