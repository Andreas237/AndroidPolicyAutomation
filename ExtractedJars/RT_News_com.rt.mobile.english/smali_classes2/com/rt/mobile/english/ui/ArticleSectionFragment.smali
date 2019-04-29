.class public Lcom/rt/mobile/english/ui/ArticleSectionFragment;
.super Landroid/support/v4/app/Fragment;
.source "ArticleSectionFragment.java"

# interfaces
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/app/Fragment;",
        "Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Ljava/util/List<",
        "Lcom/rt/mobile/english/data/articles/Section;",
        ">;>;>;"
    }
.end annotation


# static fields
.field public static final ARGUMENT_OTHER_NEWS:Ljava/lang/String; = "other_news_boolean"


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

.field private otherNews:Z

.field private sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Section;",
            ">;"
        }
    .end annotation
.end field

.field private selectedIndex:Ljava/lang/Integer;

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
        value = 0x7f090025
    .end annotation
.end field

.field toolbar_live:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090198
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

    .line 59
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->sections:Ljava/util/List;

    const/4 v0, 0x0

    .line 63
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->otherNews:Z

    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->selectedIndex:Ljava/lang/Integer;

    return-void
.end method

.method static synthetic access$002(Lcom/rt/mobile/english/ui/ArticleSectionFragment;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->selectedIndex:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/ui/ArticleSectionFragment;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->trackCurrentSection()V

    return-void
.end method

.method private reloadData()V
    .locals 1

    .line 185
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->otherNews:Z

    if-eqz v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;

    invoke-interface {v0, p0}, Lcom/rt/mobile/english/data/articles/ArticlesService;->listOtherSections(Lretrofit/Callback;)V

    goto :goto_0

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;

    invoke-interface {v0, p0}, Lcom/rt/mobile/english/data/articles/ArticlesService;->listSections(Lretrofit/Callback;)V

    :goto_0
    return-void
.end method

.method private trackCurrentSection()V
    .locals 5

    .line 115
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->sections:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 119
    :cond_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Section "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->sections:Ljava/util/List;

    iget-object v4, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->selectedIndex:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/rt/mobile/english/data/articles/Section;

    invoke-virtual {v3}, Lcom/rt/mobile/english/data/articles/Section;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 0

    .line 225
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public getToolbar()Landroid/support/v7/widget/Toolbar;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    return-object v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 179
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 180
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->reloadData()V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 88
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 89
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 98
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 99
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "other_news_boolean"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->otherNews:Z

    .line 101
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "open_uri"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 102
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "open_uri"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    .line 103
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 105
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 106
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/rt/mobile/english/ui/ArticleActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "section_title"

    const-string v2, ""

    .line 107
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "article_id"

    .line 108
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p1

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 109
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const/4 p3, 0x0

    const v0, 0x7f0c004c

    .line 125
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 126
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 128
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    if-eqz p2, :cond_0

    .line 129
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 130
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p2

    sget-object v0, Lcom/rt/mobile/english/Utils$EditionEnum;->FR:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne p2, v0, :cond_0

    .line 131
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar_live:Landroid/widget/Button;

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setVisibility(I)V

    .line 132
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar_live:Landroid/widget/Button;

    new-instance p3, Lcom/rt/mobile/english/ui/ArticleSectionFragment$1;

    invoke-direct {p3, p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment$1;-><init>(Lcom/rt/mobile/english/ui/ArticleSectionFragment;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    :cond_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p2

    sget-object p3, Lcom/rt/mobile/english/Utils$EditionEnum;->ES:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne p2, p3, :cond_1

    .line 144
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setVisibility(I)V

    .line 147
    :cond_1
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    new-instance p3, Lcom/rt/mobile/english/ui/ArticleSectionFragment$2;

    invoke-direct {p3, p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment$2;-><init>(Lcom/rt/mobile/english/ui/ArticleSectionFragment;)V

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 165
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/ui/MainActivity;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/MainActivity;->setToolbar(Landroid/support/v7/widget/Toolbar;)V

    .line 166
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    return-object p1
.end method

.method public onResume()V
    .locals 0

    .line 172
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 174
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->trackCurrentSection()V

    return-void
.end method

.method public onRetryClicked()V
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 196
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->reloadData()V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 4
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

    .line 203
    :try_start_0
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->sections:Ljava/util/List;

    .line 205
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->trackCurrentSection()V

    .line 207
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p2

    sget-object v0, Lcom/rt/mobile/english/Utils$EditionEnum;->EN:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne p2, v0, :cond_0

    .line 208
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->sections:Ljava/util/List;

    const/4 v0, 0x4

    new-instance v1, Lcom/rt/mobile/english/data/articles/Section;

    const-string v2, "opedge"

    const-string v3, "OP-ED"

    invoke-direct {v1, v2, v3}, Lcom/rt/mobile/english/data/articles/Section;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 211
    :cond_0
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    new-instance v0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    iget-boolean v2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->otherNews:Z

    invoke-direct {v0, v1, p1, v2}, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;Lcom/rt/mobile/english/data/Message;Z)V

    invoke-virtual {p2, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 212
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p2, v0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setViewPager(Landroid/support/v4/view/ViewPager;)V

    .line 214
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p2

    sget-object v0, Lcom/rt/mobile/english/Utils$EditionEnum;->AR:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne p2, v0, :cond_1

    .line 215
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p2, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 217
    :cond_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 219
    :catch_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    :goto_0
    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 59
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
