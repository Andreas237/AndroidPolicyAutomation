.class public Lcom/rt/mobile/english/ui/ArticleActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "ArticleActivity.java"

# interfaces
.implements Lcom/rt/mobile/english/ui/PagerFragment$Adapter;
.implements Lcom/rt/mobile/english/ui/PagerFragment$Listener;
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
.implements Lretrofit/Callback;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/app/AppCompatActivity;",
        "Lcom/rt/mobile/english/ui/PagerFragment$Adapter;",
        "Lcom/rt/mobile/english/ui/PagerFragment$Listener;",
        "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;",
        "Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;",
        "Landroid/support/v4/view/ViewPager$OnPageChangeListener;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Lcom/rt/mobile/english/data/articles/Article;",
        ">;>;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# static fields
.field public static final ARGUMENT_ARTICLES_STRING:Ljava/lang/String; = "articles_string"

.field public static final ARGUMENT_ARTICLE_ID:Ljava/lang/String; = "article_id"

.field public static final ARGUMENT_INITIAL_POSITION:Ljava/lang/String; = "initial_position"

.field public static final ARGUMENT_OPEDGE:Ljava/lang/String; = "opedge"

.field public static final ARGUMENT_SECTION_TITLE:Ljava/lang/String; = "section_title"


# instance fields
.field appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field articleId:Ljava/lang/String;

.field articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private articlesString:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field fab:Landroid/support/design/widget/FloatingActionButton;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090099
    .end annotation
.end field

.field public fabBookmarks:Landroid/support/design/widget/FloatingActionButton;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09009b
    .end annotation
.end field

.field public fabChangeSize:Landroid/support/design/widget/FloatingActionButton;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09009c
    .end annotation
.end field

.field public fabShare:Landroid/support/design/widget/FloatingActionButton;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09009a
    .end annotation
.end field

.field gson:Lcom/google/gson/Gson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private initialPosition:I

.field private isFabOpen:Ljava/lang/Boolean;

.field private isPost:Ljava/lang/Boolean;

.field loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090027
    .end annotation
.end field

.field pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

.field private rotate_backward:Landroid/view/animation/Animation;

.field private rotate_forward:Landroid/view/animation/Animation;

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
    .locals 2

    .line 36
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesString:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 49
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->isPost:Ljava/lang/Boolean;

    .line 85
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->isFabOpen:Ljava/lang/Boolean;

    return-void
.end method

.method private loadData()V
    .locals 2

    .line 196
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articleId:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->isPost:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articleId:Ljava/lang/String;

    invoke-interface {v0, v1, p0}, Lcom/rt/mobile/english/data/articles/ArticlesService;->getPost(Ljava/lang/String;Lretrofit/Callback;)V

    goto :goto_0

    .line 202
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesService:Lcom/rt/mobile/english/data/articles/ArticlesService;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articleId:Ljava/lang/String;

    invoke-interface {v0, v1, p0}, Lcom/rt/mobile/english/data/articles/ArticlesService;->getArticle(Ljava/lang/String;Lretrofit/Callback;)V

    :goto_0
    return-void
.end method

.method private trackContent(Ljava/lang/Integer;)V
    .locals 3

    .line 125
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesString:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesString:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 130
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/articles/Article;

    .line 131
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->isPost:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f100034

    goto :goto_0

    :cond_1
    const v0, 0x7f100021

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/articles/Article;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 133
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public animateFAB()V
    .locals 3

    .line 151
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->isFabOpen:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/16 v1, 0x15

    if-eqz v0, :cond_1

    .line 152
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v0}, Landroid/support/design/widget/FloatingActionButton;->hide()V

    .line 153
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v0}, Landroid/support/design/widget/FloatingActionButton;->hide()V

    .line 154
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabChangeSize:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v0}, Landroid/support/design/widget/FloatingActionButton;->hide()V

    .line 155
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v1, :cond_0

    .line 156
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fab:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0800fb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 158
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fab:Landroid/support/design/widget/FloatingActionButton;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->rotate_backward:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->startAnimation(Landroid/view/animation/Animation;)V

    .line 160
    :goto_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setClickable(Z)V

    .line 161
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setClickable(Z)V

    .line 162
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabChangeSize:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setClickable(Z)V

    .line 163
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->isFabOpen:Ljava/lang/Boolean;

    goto :goto_2

    .line 166
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v1, :cond_2

    .line 167
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fab:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080107

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 169
    :cond_2
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fab:Landroid/support/design/widget/FloatingActionButton;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->rotate_forward:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->startAnimation(Landroid/view/animation/Animation;)V

    .line 171
    :goto_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v0}, Landroid/support/design/widget/FloatingActionButton;->show()V

    .line 172
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v0}, Landroid/support/design/widget/FloatingActionButton;->show()V

    .line 173
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabChangeSize:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v0}, Landroid/support/design/widget/FloatingActionButton;->show()V

    .line 174
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setClickable(Z)V

    .line 175
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setClickable(Z)V

    .line 176
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabChangeSize:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setClickable(Z)V

    .line 177
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->isFabOpen:Ljava/lang/Boolean;

    :goto_2
    return-void
.end method

.method public failure(Lretrofit/RetrofitError;)V
    .locals 2

    .line 314
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "load article error"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 315
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public getContainerActivity()Landroid/view/View;
    .locals 1

    const v0, 0x1020002

    .line 181
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ArticleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public getFragment(I)Landroid/support/v4/app/Fragment;
    .locals 2

    .line 208
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesString:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 212
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesString:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->isPost:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, p1, v1}, Lcom/rt/mobile/english/ui/ArticleFragment;->newInstance(Ljava/lang/String;IZ)Lcom/rt/mobile/english/ui/ArticleFragment;

    move-result-object p1

    return-object p1
.end method

.method public getInitialPosition()I
    .locals 1

    .line 217
    iget v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->initialPosition:I

    return v0
.end method

.method public getPageCount()I
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesString:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 226
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesString:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method protected getScreenHeight()I
    .locals 1

    const v0, 0x7f090117

    .line 184
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ArticleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    return v0
.end method

.method public getToolBar()Landroid/support/v7/widget/Toolbar;
    .locals 1

    .line 188
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    return-object v0
.end method

.method public getToolBarAndTabs()Landroid/view/View;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->toolbar_and_tabs:Landroid/view/View;

    return-object v0
.end method

.method public onAttach(Lcom/rt/mobile/english/ui/PagerFragment;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

    .line 233
    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/ui/PagerFragment;->setAdapter(Lcom/rt/mobile/english/ui/PagerFragment$Adapter;)V

    .line 234
    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/ui/PagerFragment;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 138
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 141
    :pswitch_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->animateFAB()V

    :goto_0
    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x7f090099
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 90
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 91
    invoke-static {p0}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    const p1, 0x7f0c001b

    .line 92
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ArticleActivity;->setContentView(I)V

    .line 93
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 94
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ArticleActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 95
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 96
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    .line 97
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "section_title"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 99
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "articles_string"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesString:Ljava/util/ArrayList;

    .line 100
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "initial_position"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->initialPosition:I

    .line 101
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "opedge"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->isPost:Ljava/lang/Boolean;

    .line 103
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    const/4 v0, 0x0

    .line 104
    invoke-static {v1, v0}, Lcom/rt/mobile/english/ui/PagerFragment;->newInstance(ZLjava/lang/String;)Lcom/rt/mobile/english/ui/PagerFragment;

    move-result-object v0

    const v2, 0x7f090058

    invoke-virtual {p1, v2, v0}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    .line 105
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 107
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/AppEventCounter;->articleOpened()V

    .line 109
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "articles_string"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 110
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "article_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articleId:Ljava/lang/String;

    .line 111
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1, v1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setVisibility(I)V

    .line 112
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->loadData()V

    .line 115
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f01001a

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->rotate_forward:Landroid/view/animation/Animation;

    .line 116
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f010019

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->rotate_backward:Landroid/view/animation/Animation;

    .line 117
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fab:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p1, p0}, Landroid/support/design/widget/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p1, p0}, Landroid/support/design/widget/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p1, p0}, Landroid/support/design/widget/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ArticleActivity;->trackContent(Ljava/lang/Integer;)V

    return-void
.end method

.method public onDetach(Lcom/rt/mobile/english/ui/PagerFragment;)V
    .locals 0

    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .line 260
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/rt/mobile/english/ui/ArticleActivity;->trackContent(Ljava/lang/Integer;)V

    .line 262
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/PagerFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/app/Fragment;

    .line 263
    instance-of v2, v1, Lcom/rt/mobile/english/ui/ArticleFragment;

    if-eqz v2, :cond_0

    .line 264
    check-cast v1, Lcom/rt/mobile/english/ui/ArticleFragment;

    .line 265
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v2

    invoke-virtual {v2}, Lcom/rt/mobile/english/Utils;->isRtlDirectionSupports()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 266
    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesString:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    sub-int/2addr v2, p1

    invoke-virtual {v1, v2}, Lcom/rt/mobile/english/ui/ArticleFragment;->onPagerPositionChanged(I)V

    goto :goto_0

    .line 268
    :cond_1
    invoke-virtual {v1, p1}, Lcom/rt/mobile/english/ui/ArticleFragment;->onPagerPositionChanged(I)V

    goto :goto_0

    .line 273
    :cond_2
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->isFabOpen:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 274
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p1}, Landroid/support/design/widget/FloatingActionButton;->hide()V

    .line 275
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p1}, Landroid/support/design/widget/FloatingActionButton;->hide()V

    .line 276
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabChangeSize:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p1}, Landroid/support/design/widget/FloatingActionButton;->hide()V

    .line 277
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-ge p1, v0, :cond_3

    .line 278
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fab:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0800fb

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/design/widget/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 280
    :cond_3
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fab:Landroid/support/design/widget/FloatingActionButton;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->rotate_backward:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/support/design/widget/FloatingActionButton;->startAnimation(Landroid/view/animation/Animation;)V

    .line 283
    :goto_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabShare:Landroid/support/design/widget/FloatingActionButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/design/widget/FloatingActionButton;->setClickable(Z)V

    .line 284
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabBookmarks:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p1, v0}, Landroid/support/design/widget/FloatingActionButton;->setClickable(Z)V

    .line 285
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->fabChangeSize:Landroid/support/design/widget/FloatingActionButton;

    invoke-virtual {p1, v0}, Landroid/support/design/widget/FloatingActionButton;->setClickable(Z)V

    .line 286
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->isFabOpen:Ljava/lang/Boolean;

    :cond_4
    return-void
.end method

.method public onRefresh()V
    .locals 0

    return-void
.end method

.method public onRetryClicked()V
    .locals 0

    .line 249
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->loadData()V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 297
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 298
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Data of message is empty. Request url = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lretrofit/client/Response;->getUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 301
    :cond_0
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    .line 302
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 303
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/articles/Article;->getSectionTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 305
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ArticleActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/articles/Article;->getSectionTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 307
    :cond_1
    iput-object p2, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->articlesString:Ljava/util/ArrayList;

    .line 308
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleActivity;->pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/PagerFragment;->notifyDataSetChanged()V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 36
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ArticleActivity;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
