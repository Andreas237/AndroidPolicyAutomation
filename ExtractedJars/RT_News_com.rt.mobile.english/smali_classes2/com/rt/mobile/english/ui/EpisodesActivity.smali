.class public Lcom/rt/mobile/english/ui/EpisodesActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "EpisodesActivity.java"

# interfaces
.implements Lretrofit/Callback;
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/app/AppCompatActivity;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Lcom/rt/mobile/english/data/shows/ShowInfo;",
        ">;>;",
        "Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;"
    }
.end annotation


# static fields
.field public static final ARG_SHOW:Ljava/lang/String; = "show"

.field public static final EPISODE_ID:Ljava/lang/String; = "episode_id"

.field public static final SHOW_ID:Ljava/lang/String; = "show_id"


# instance fields
.field private episodeIdString:Ljava/lang/String;

.field gson:Lcom/google/gson/Gson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09007c
    .end annotation
.end field

.field show:Lcom/rt/mobile/english/data/shows/Show;

.field private showIdString:Ljava/lang/String;

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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private loadData()V
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->showIdString:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->showsService:Lcom/rt/mobile/english/data/shows/ShowsService;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->showIdString:Ljava/lang/String;

    invoke-interface {v0, v1, p0}, Lcom/rt/mobile/english/data/shows/ShowsService;->getShow(Ljava/lang/String;Lretrofit/Callback;)V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 2

    .line 122
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "load showInfo error"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 123
    iget-object p1, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public getToolBar()Landroid/support/v7/widget/Toolbar;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    return-object v0
.end method

.method public getToolBarAndTabs()Landroid/view/View;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->toolbar_and_tabs:Landroid/view/View;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 60
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 61
    invoke-static {p0}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    const v0, 0x7f0c001e

    .line 63
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->setContentView(I)V

    .line 65
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 66
    iget-object v0, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    .line 67
    iget-object v0, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 68
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 70
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "show"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "show_id"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->showIdString:Ljava/lang/String;

    .line 72
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "episode_id"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->episodeIdString:Ljava/lang/String;

    .line 73
    iget-object v1, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->showIdString:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 74
    iget-object v1, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->gson:Lcom/google/gson/Gson;

    const-class v2, Lcom/rt/mobile/english/data/shows/Show;

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/shows/Show;

    iput-object v0, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->show:Lcom/rt/mobile/english/data/shows/Show;

    .line 75
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->show:Lcom/rt/mobile/english/data/shows/Show;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/shows/Show;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    if-nez p1, :cond_1

    .line 77
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    const v0, 0x7f090058

    iget-object v1, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->show:Lcom/rt/mobile/english/data/shows/Show;

    .line 78
    invoke-virtual {v1}, Lcom/rt/mobile/english/data/shows/Show;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->show:Lcom/rt/mobile/english/data/shows/Show;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/shows/Show;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    .line 79
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 82
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setVisibility(I)V

    .line 83
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->loadData()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onRetryClicked()V
    .locals 0

    .line 128
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->loadData()V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Lcom/rt/mobile/english/data/shows/ShowInfo;",
            ">;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 104
    iget-object p2, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    .line 105
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p2

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/shows/ShowInfo;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/shows/ShowInfo;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 106
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EpisodesActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p2

    invoke-virtual {p2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p2

    .line 107
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/shows/ShowInfo;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/shows/ShowInfo;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/rt/mobile/english/data/shows/ShowInfo;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/shows/ShowInfo;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/rt/mobile/english/ui/ShowEpisodesRecyclerViewFragment;

    move-result-object v0

    const v1, 0x7f090058

    invoke-virtual {p2, v1, v0}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p2

    .line 108
    invoke-virtual {p2}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 110
    iget-object p2, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->episodeIdString:Ljava/lang/String;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->episodeIdString:Ljava/lang/String;

    const-string v0, "episode_id"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 111
    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/rt/mobile/english/ui/ShowEpisodeActivity;

    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "episode_id"

    .line 112
    iget-object v1, p0, Lcom/rt/mobile/english/ui/EpisodesActivity;->episodeIdString:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "show_id"

    .line 113
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/rt/mobile/english/data/shows/ShowInfo;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/shows/ShowInfo;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "section_title"

    .line 114
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/shows/ShowInfo;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/shows/ShowInfo;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 115
    invoke-virtual {p0, p2}, Lcom/rt/mobile/english/ui/EpisodesActivity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 35
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/EpisodesActivity;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
