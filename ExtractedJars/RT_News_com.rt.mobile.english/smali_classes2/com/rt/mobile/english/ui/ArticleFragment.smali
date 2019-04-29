.class public final Lcom/rt/mobile/english/ui/ArticleFragment;
.super Landroid/support/v4/app/Fragment;
.source "ArticleFragment.java"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;
.implements Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollViewCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;
    }
.end annotation


# static fields
.field private static final ARICLE_EXTRA:Ljava/lang/String; = "extra_arice"

.field private static final OPTEDGE:Z = false

.field private static final POSITION:Ljava/lang/String; = "position"


# instance fields
.field private article:Lcom/rt/mobile/english/data/articles/Article;

.field private articleLoadingFailed:Z

.field gson:Lcom/google/gson/Gson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private html:Ljava/lang/String;

.field htmlService:Lcom/rt/mobile/english/data/articles/HtmlService;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private isLoaded:Z

.field loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900d7
    .end annotation
.end field

.field private mMenu:Landroid/view/Menu;

.field private mToolbar:Landroid/support/v7/widget/Toolbar;

.field private optedge:Z

.field private position:I

.field private settings:Landroid/webkit/WebSettings;

.field swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090180
    .end annotation
.end field

.field private toolbar_and_tabs:Landroid/view/View;

.field private utils:Lcom/rt/mobile/english/Utils;

.field webView:Landroid/webkit/WebView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0901b5
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 68
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    const-string v0, ""

    .line 86
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->html:Ljava/lang/String;

    const/4 v0, 0x0

    .line 87
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->articleLoadingFailed:Z

    .line 89
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->isLoaded:Z

    return-void
.end method

.method private PrepareFab()V
    .locals 5

    .line 188
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->settings:Landroid/webkit/WebSettings;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->utils:Lcom/rt/mobile/english/Utils;

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getWebViewTextZoom()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 189
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/ui/ArticleActivity;

    .line 190
    iget-object v1, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/support/design/widget/FloatingActionButton;->setVisibility(I)V

    .line 191
    iget-object v1, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v1, v2}, Landroid/support/design/widget/FloatingActionButton;->setVisibility(I)V

    .line 192
    iget-object v1, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabChangeSize:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v1, v2}, Landroid/support/design/widget/FloatingActionButton;->setVisibility(I)V

    .line 194
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->isInBookmarks()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 195
    iget-object v1, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0801c7

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/support/design/widget/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 197
    :cond_0
    iget-object v1, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0801c8

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/support/design/widget/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 200
    :goto_0
    iget-object v1, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    new-instance v3, Lcom/rt/mobile/english/ui/ArticleFragment$1;

    invoke-direct {v3, p0}, Lcom/rt/mobile/english/ui/ArticleFragment$1;-><init>(Lcom/rt/mobile/english/ui/ArticleFragment;)V

    invoke-virtual {v1, v3}, Landroid/support/design/widget/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    iget-object v1, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    new-instance v3, Lcom/rt/mobile/english/ui/ArticleFragment$2;

    invoke-direct {v3, p0}, Lcom/rt/mobile/english/ui/ArticleFragment$2;-><init>(Lcom/rt/mobile/english/ui/ArticleFragment;)V

    invoke-virtual {v1, v3}, Landroid/support/design/widget/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 218
    iget-object v1, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabChangeSize:Landroid/support/design/widget/FloatingActionButton;

    new-instance v3, Lcom/rt/mobile/english/ui/ArticleFragment$3;

    invoke-direct {v3, p0}, Lcom/rt/mobile/english/ui/ArticleFragment$3;-><init>(Lcom/rt/mobile/english/ui/ArticleFragment;)V

    invoke-virtual {v1, v3}, Landroid/support/design/widget/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    iget-object v1, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v1, v2}, Landroid/support/design/widget/FloatingActionButton;->setVisibility(I)V

    .line 227
    iget-object v0, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v0, v2}, Landroid/support/design/widget/FloatingActionButton;->setVisibility(I)V

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/ArticleFragment;)Ljava/lang/String;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->html:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$002(Lcom/rt/mobile/english/ui/ArticleFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->html:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/ui/ArticleFragment;)Lcom/rt/mobile/english/data/articles/Article;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    return-object p0
.end method

.method static synthetic access$200(Lcom/rt/mobile/english/ui/ArticleFragment;)Landroid/webkit/WebSettings;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->settings:Landroid/webkit/WebSettings;

    return-object p0
.end method

.method static synthetic access$300(Lcom/rt/mobile/english/ui/ArticleFragment;)Lcom/rt/mobile/english/Utils;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->utils:Lcom/rt/mobile/english/Utils;

    return-object p0
.end method

.method static synthetic access$400(Lcom/rt/mobile/english/ui/ArticleFragment;)Landroid/view/View;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->toolbar_and_tabs:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$600(Lcom/rt/mobile/english/ui/ArticleFragment;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->loadVideo()V

    return-void
.end method

.method static synthetic access$700(Lcom/rt/mobile/english/ui/ArticleFragment;)Z
    .locals 0

    .line 68
    iget-boolean p0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->articleLoadingFailed:Z

    return p0
.end method

.method static synthetic access$702(Lcom/rt/mobile/english/ui/ArticleFragment;Z)Z
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->articleLoadingFailed:Z

    return p1
.end method

.method static synthetic access$802(Lcom/rt/mobile/english/ui/ArticleFragment;Z)Z
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->isLoaded:Z

    return p1
.end method

.method private hideToolbar()V
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->toolbar_and_tabs:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    invoke-direct {p0, v0}, Lcom/rt/mobile/english/ui/ArticleFragment;->moveToolbar(F)V

    return-void
.end method

.method private isInBookmarks()Z
    .locals 10

    const-string v3, "article_id = ?"

    const/4 v8, 0x1

    .line 436
    new-array v4, v8, [Ljava/lang/String;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/articles/Article;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    aput-object v0, v4, v9

    .line 438
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/DatabaseManager;->openDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "bookmarks"

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 439
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 440
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v8, v9

    .line 441
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 442
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/DatabaseManager;->closeDatabase()V

    return v8
.end method

.method private loadNew()V
    .locals 3

    .line 333
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 334
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->articleLoadingFailed:Z

    .line 336
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->optedge:Z

    if-nez v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->htmlService:Lcom/rt/mobile/english/data/articles/HtmlService;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/articles/Article;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/rt/mobile/english/ui/ArticleFragment$5;

    invoke-direct {v2, p0}, Lcom/rt/mobile/english/ui/ArticleFragment$5;-><init>(Lcom/rt/mobile/english/ui/ArticleFragment;)V

    invoke-interface {v0, v1, v2}, Lcom/rt/mobile/english/data/articles/HtmlService;->getArticle(Ljava/lang/String;Lretrofit/Callback;)V

    goto :goto_0

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->htmlService:Lcom/rt/mobile/english/data/articles/HtmlService;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/articles/Article;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/rt/mobile/english/ui/ArticleFragment$6;

    invoke-direct {v2, p0}, Lcom/rt/mobile/english/ui/ArticleFragment$6;-><init>(Lcom/rt/mobile/english/ui/ArticleFragment;)V

    invoke-interface {v0, v1, v2}, Lcom/rt/mobile/english/data/articles/HtmlService;->getPost(Ljava/lang/String;Lretrofit/Callback;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private loadVideo()V
    .locals 4

    .line 386
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/articles/Article;->getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/articles/Article$Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 387
    sget-object v0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->Companion:Lcom/rt/mobile/english/ui/ExoPlayerActivity$Companion;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/articles/Article;->getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object v2

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/articles/Article$Video;->getUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v3}, Lcom/rt/mobile/english/data/articles/Article;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/rt/mobile/english/ui/ExoPlayerActivity$Companion;->run(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 390
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/articles/Article;->getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/articles/Article$Video;->getYoutubeId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 396
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/articles/Article;->getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/articles/Article$Video;->getYoutubeId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v2}, Lcom/google/android/youtube/player/YouTubeIntents;->createPlayVideoIntentWithOptions(Landroid/content/Context;Ljava/lang/String;ZZ)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ArticleFragment;->startActivity(Landroid/content/Intent;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private moveToolbar(F)V
    .locals 3

    .line 289
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->toolbar_and_tabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v0

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    .line 292
    new-array v0, v0, [F

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->toolbar_and_tabs:Landroid/view/View;

    invoke-static {v2}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    aput p1, v0, v1

    invoke-static {v0}, Lcom/nineoldandroids/animation/ValueAnimator;->ofFloat([F)Lcom/nineoldandroids/animation/ValueAnimator;

    move-result-object p1

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setDuration(J)Lcom/nineoldandroids/animation/ValueAnimator;

    move-result-object p1

    .line 293
    new-instance v0, Lcom/rt/mobile/english/ui/ArticleFragment$4;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/ArticleFragment$4;-><init>(Lcom/rt/mobile/english/ui/ArticleFragment;)V

    invoke-virtual {p1, v0}, Lcom/nineoldandroids/animation/ValueAnimator;->addUpdateListener(Lcom/nineoldandroids/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 305
    invoke-virtual {p1}, Lcom/nineoldandroids/animation/ValueAnimator;->start()V

    return-void
.end method

.method public static newInstance(Ljava/lang/String;IZ)Lcom/rt/mobile/english/ui/ArticleFragment;
    .locals 3

    .line 104
    new-instance v0, Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/ArticleFragment;-><init>()V

    .line 106
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "extra_arice"

    .line 107
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "position"

    .line 108
    invoke-virtual {v1, p0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const/4 p0, 0x0

    .line 109
    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 110
    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/ArticleFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private showToolbar()V
    .locals 1

    const/4 v0, 0x0

    .line 281
    invoke-direct {p0, v0}, Lcom/rt/mobile/english/ui/ArticleFragment;->moveToolbar(F)V

    return-void
.end method

.method private toolbarIsHidden()Z
    .locals 2

    .line 277
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->toolbar_and_tabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->toolbar_and_tabs:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private toolbarIsShown()Z
    .locals 2

    .line 273
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->toolbar_and_tabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public getMenu()Landroid/view/Menu;
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->mMenu:Landroid/view/Menu;

    return-object v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 317
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 318
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ArticleFragment;->setHasOptionsMenu(Z)V

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 1

    .line 117
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 119
    instance-of v0, p1, Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    .line 123
    :cond_0
    check-cast p1, Landroid/app/Activity;

    .line 125
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    .line 126
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object p1

    if-nez p1, :cond_1

    .line 127
    new-instance p1, Lcom/rt/mobile/english/ui/DatabaseManager$DBHelper;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/rt/mobile/english/ui/DatabaseManager$DBHelper;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/rt/mobile/english/ui/DatabaseManager;->initializeInstance(Landroid/database/sqlite/SQLiteOpenHelper;)V

    :cond_1
    return-void
.end method

.method public onBookmarkClicked()V
    .locals 8

    .line 405
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/DatabaseManager;->openDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 406
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->isInBookmarks()Z

    move-result v1

    const v2, 0x7f100024

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v1, :cond_0

    .line 407
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v5, "article_id"

    .line 408
    iget-object v6, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v6}, Lcom/rt/mobile/english/data/articles/Article;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "item"

    .line 409
    iget-object v6, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->gson:Lcom/google/gson/Gson;

    iget-object v7, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v6, v7}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "html"

    .line 410
    iget-object v6, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->html:Ljava/lang/String;

    invoke-virtual {v1, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "thumbnail"

    const-string v6, ""

    .line 411
    invoke-virtual {v1, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "bookmarks"

    .line 412
    invoke-virtual {v0, v5, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 414
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/ui/ArticleActivity;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f0801c7

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 416
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f100042

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 417
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 418
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/ArticleFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f100020

    .line 419
    invoke-virtual {p0, v3}, Lcom/rt/mobile/english/ui/ArticleFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    .line 420
    invoke-virtual {v5}, Lcom/rt/mobile/english/data/articles/Article;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v5}, Lcom/rt/mobile/english/data/articles/Article;->getURL()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 418
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/rt/mobile/english/Utils;->sendEvent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v1, "bookmarks"

    .line 422
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "article_id = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v6}, Lcom/rt/mobile/english/data/articles/Article;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v1, v5, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 423
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/ui/ArticleActivity;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f0801c8

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 424
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f100043

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 425
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 426
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/ArticleFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f100036

    .line 427
    invoke-virtual {p0, v3}, Lcom/rt/mobile/english/ui/ArticleFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    .line 428
    invoke-virtual {v5}, Lcom/rt/mobile/english/data/articles/Article;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v5}, Lcom/rt/mobile/english/data/articles/Article;->getURL()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 426
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/rt/mobile/english/Utils;->sendEvent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/DatabaseManager;->closeDatabase()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 324
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 325
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->invalidate()V

    .line 326
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 327
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setVisibility(I)V

    .line 328
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 329
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->loadNew()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    .line 231
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 233
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->PrepareFab()V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 135
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 138
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    const-string v0, "extra_arice"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 139
    :goto_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "position"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, -0x1

    :goto_1
    iput v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->position:I

    .line 140
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->optedge:Z

    if-eqz p3, :cond_3

    .line 142
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->gson:Lcom/google/gson/Gson;

    const-class v2, Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v0, p3, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/rt/mobile/english/data/articles/Article;

    iput-object p3, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->article:Lcom/rt/mobile/english/data/articles/Article;

    :cond_3
    const/4 p3, 0x1

    .line 145
    invoke-virtual {p0, p3}, Lcom/rt/mobile/english/ui/ArticleFragment;->setHasOptionsMenu(Z)V

    .line 147
    new-instance v0, Lcom/rt/mobile/english/Utils;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/rt/mobile/english/Utils;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->utils:Lcom/rt/mobile/english/Utils;

    const v0, 0x7f0c004b

    .line 149
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 150
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 151
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    .line 152
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->swipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 153
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/ui/ArticleActivity;

    invoke-virtual {p2}, Lcom/rt/mobile/english/ui/ArticleActivity;->getToolBar()Landroid/support/v7/widget/Toolbar;

    move-result-object p2

    iput-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->mToolbar:Landroid/support/v7/widget/Toolbar;

    .line 154
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/ui/ArticleActivity;

    invoke-virtual {p2}, Lcom/rt/mobile/english/ui/ArticleActivity;->getToolBarAndTabs()Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->toolbar_and_tabs:Landroid/view/View;

    .line 156
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    iput-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->settings:Landroid/webkit/WebSettings;

    .line 157
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->settings:Landroid/webkit/WebSettings;

    invoke-virtual {p2, p3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 158
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->settings:Landroid/webkit/WebSettings;

    invoke-virtual {p2, p3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 159
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->settings:Landroid/webkit/WebSettings;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->utils:Lcom/rt/mobile/english/Utils;

    invoke-virtual {p3}, Lcom/rt/mobile/english/Utils;->getWebViewTextZoom()Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    return-object p1
.end method

.method public onDownMotionEvent()V
    .locals 0

    return-void
.end method

.method public onPagerPositionChanged(I)V
    .locals 1

    .line 175
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->isLoaded:Z

    if-nez v0, :cond_0

    return-void

    .line 178
    :cond_0
    iget v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->position:I

    if-ne v0, p1, :cond_1

    .line 179
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->onResume()V

    goto :goto_0

    .line 181
    :cond_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->onPause()V

    :goto_0
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 244
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 245
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    return-void
.end method

.method public onRefresh()V
    .locals 0

    .line 448
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->loadNew()V

    return-void
.end method

.method public onResume()V
    .locals 1

    .line 169
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 171
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    return-void
.end method

.method public onRetryClicked()V
    .locals 1

    .line 453
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 454
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->loadNew()V

    return-void
.end method

.method public onScrollChanged(IZZ)V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 0

    .line 382
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    return-void
.end method

.method public onUpOrCancelMotionEvent(Lcom/github/ksoichiro/android/observablescrollview/ScrollState;)V
    .locals 1

    .line 261
    sget-object v0, Lcom/github/ksoichiro/android/observablescrollview/ScrollState;->UP:Lcom/github/ksoichiro/android/observablescrollview/ScrollState;

    if-ne p1, v0, :cond_0

    .line 262
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->toolbarIsShown()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 263
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->hideToolbar()V

    goto :goto_0

    .line 265
    :cond_0
    sget-object v0, Lcom/github/ksoichiro/android/observablescrollview/ScrollState;->DOWN:Lcom/github/ksoichiro/android/observablescrollview/ScrollState;

    if-ne p1, v0, :cond_1

    .line 266
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->toolbarIsHidden()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 267
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->showToolbar()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 310
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 311
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment;->webView:Landroid/webkit/WebView;

    new-instance p2, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lcom/rt/mobile/english/ui/ArticleFragment$InnerClient;-><init>(Lcom/rt/mobile/english/ui/ArticleFragment;Lcom/rt/mobile/english/ui/ArticleFragment$1;)V

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 312
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleFragment;->loadNew()V

    return-void
.end method
