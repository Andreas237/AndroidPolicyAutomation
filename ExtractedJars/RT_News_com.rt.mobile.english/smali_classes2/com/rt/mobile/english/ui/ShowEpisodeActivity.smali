.class public Lcom/rt/mobile/english/ui/ShowEpisodeActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "ShowEpisodeActivity.java"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/app/AppCompatActivity;",
        "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Lcom/rt/mobile/english/data/shows/ShowEpisode;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final ARGUMENT_EPISODES:Ljava/lang/String; = "episodes_string"

.field public static final ARGUMENT_EPISODE_ID:Ljava/lang/String; = "episode_id"

.field public static final ARGUMENT_INITIAL_POSITION:Ljava/lang/String; = "initial_position"

.field public static final ARGUMENT_SHOW_ID:Ljava/lang/String; = "show_id"

.field public static final ARGUMENT_SHOW_TITLE:Ljava/lang/String; = "section_title"


# instance fields
.field private episodeId:Ljava/lang/String;

.field private episodeStrings:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field gson:Lcom/google/gson/Gson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private initialPosition:I

.field loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09007c
    .end annotation
.end field

.field pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

.field private showId:Ljava/lang/String;

.field showsService:Lcom/rt/mobile/english/data/shows/ShowsService;
    .annotation runtime Ljavax/inject/Inject;
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

.field viewPager:Landroid/support/v4/view/ViewPager;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090114
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->episodeStrings:Ljava/util/ArrayList;

    return-void
.end method

.method private loadData()V
    .locals 3

    .line 94
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->episodeId:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->showsService:Lcom/rt/mobile/english/data/shows/ShowsService;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->showId:Ljava/lang/String;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->episodeId:Ljava/lang/String;

    invoke-interface {v0, v1, v2, p0}, Lcom/rt/mobile/english/data/shows/ShowsService;->getEpisode(Ljava/lang/String;Ljava/lang/String;Lretrofit/Callback;)V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 2

    .line 133
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "load episode error"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 134
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 65
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 66
    invoke-static {p0}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    const p1, 0x7f0c001d

    .line 67
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->setContentView(I)V

    .line 69
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 70
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 71
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 74
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "episodes_string"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 75
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "episode_id"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->episodeId:Ljava/lang/String;

    .line 76
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "show_id"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->showId:Ljava/lang/String;

    .line 77
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setVisibility(I)V

    .line 78
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->loadData()V

    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "episodes_string"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->episodeStrings:Ljava/util/ArrayList;

    .line 81
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "initial_position"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->initialPosition:I

    .line 83
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    new-instance v0, Lcom/rt/mobile/english/ui/adapter/VideoPagerAdapter;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->episodeStrings:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lcom/rt/mobile/english/ui/adapter/VideoPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 84
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    iget v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->initialPosition:I

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 86
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "section_title"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 89
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    const v0, 0x7f100026

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 103
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-eq v0, v1, :cond_0

    .line 108
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 105
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->finish()V

    const/4 p1, 0x1

    return p1
.end method

.method public onRefresh()V
    .locals 0

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Lcom/rt/mobile/english/data/shows/ShowEpisode;",
            ">;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 120
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    .line 121
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 122
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/rt/mobile/english/ui/adapter/VideoPagerAdapter;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Lcom/rt/mobile/english/ui/adapter/VideoPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 125
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    iget v1, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->initialPosition:I

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 126
    iput-object p2, p0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->episodeStrings:Ljava/util/ArrayList;

    .line 128
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/shows/ShowEpisode;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/shows/ShowEpisode;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 33
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
