.class public final Lcom/rt/mobile/english/ui/BookmarkReader;
.super Landroid/support/v4/app/Fragment;
.source "BookmarkReader.java"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;,
        Lcom/rt/mobile/english/ui/BookmarkReader$InnerClient;,
        Lcom/rt/mobile/english/ui/BookmarkReader$Listener;
    }
.end annotation


# static fields
.field private static final ARICLE_EXTRA:Ljava/lang/String; = "extra_arice"

.field private static final POSITION:Ljava/lang/String; = "position"

.field private static final TAG:Ljava/lang/String; = "ArticleReader"


# instance fields
.field private article:Lcom/rt/mobile/english/data/articles/Article;

.field private browser:Landroid/webkit/WebView;

.field gson:Lcom/google/gson/Gson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private html:Ljava/lang/String;

.field private linkedUrl:Ljava/lang/String;

.field private listener:Lcom/rt/mobile/english/ui/BookmarkReader$Listener;

.field private mMenu:Landroid/view/Menu;

.field private mSwipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

.field private positionInPager:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    const-string v0, ""

    .line 51
    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->html:Ljava/lang/String;

    const-string v0, ""

    .line 52
    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->linkedUrl:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/ui/BookmarkReader;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->loadVideo()V

    return-void
.end method

.method static synthetic access$202(Lcom/rt/mobile/english/ui/BookmarkReader;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->linkedUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$300(Lcom/rt/mobile/english/ui/BookmarkReader;)Lcom/rt/mobile/english/data/articles/Article;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->article:Lcom/rt/mobile/english/data/articles/Article;

    return-object p0
.end method

.method static synthetic access$400(Lcom/rt/mobile/english/ui/BookmarkReader;)Ljava/lang/String;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->html:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$402(Lcom/rt/mobile/english/ui/BookmarkReader;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->html:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$500(Lcom/rt/mobile/english/ui/BookmarkReader;)Landroid/webkit/WebView;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->browser:Landroid/webkit/WebView;

    return-object p0
.end method

.method static synthetic access$600(Lcom/rt/mobile/english/ui/BookmarkReader;)Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->mSwipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    return-object p0
.end method

.method private loadNew()V
    .locals 4

    .line 149
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->article:Lcom/rt/mobile/english/data/articles/Article;

    if-eqz v0, :cond_1

    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getAppUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/news/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/articles/Article;->getSection()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/articles/Article;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/html/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 151
    iget-object v1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->linkedUrl:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 152
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->linkedUrl:Ljava/lang/String;

    :cond_0
    const-string v1, "ArticleReader"

    .line 153
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Loading article "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    new-instance v1, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;-><init>(Lcom/rt/mobile/english/ui/BookmarkReader;)V

    const/4 v2, 0x1

    .line 157
    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Lcom/rt/mobile/english/ui/BookmarkReader$HtmlLoader;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1
    return-void
.end method

.method private loadVideo()V
    .locals 5

    .line 225
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.intent.action.VIEW"

    .line 226
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 227
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "ArticleReader"

    .line 229
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "BEFORE JSON video newsItem.getVideo().toString()     |"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v4}, Lcom/rt/mobile/english/data/articles/Article;->getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    const-string v2, "video"

    .line 231
    iget-object v3, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v3}, Lcom/rt/mobile/english/data/articles/Article;->getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 232
    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/articles/Article;->getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object v2

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/articles/Article$Video;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "ArticleReader"

    .line 233
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AFTER JSON video, url = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "url"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v2, "url"

    .line 234
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 236
    invoke-static {v1}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    .line 238
    :goto_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "video/mp4"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 239
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/BookmarkReader;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static newInstance(Ljava/lang/String;I)Lcom/rt/mobile/english/ui/BookmarkReader;
    .locals 3

    .line 65
    new-instance v0, Lcom/rt/mobile/english/ui/BookmarkReader;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/BookmarkReader;-><init>()V

    .line 67
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "extra_arice"

    .line 68
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "position"

    .line 69
    invoke-virtual {v1, p0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 70
    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/BookmarkReader;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public getMenu()Landroid/view/Menu;
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->mMenu:Landroid/view/Menu;

    return-object v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 3

    .line 112
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 114
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->isTablet()Z

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    .line 115
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Landroid/support/v7/app/AppCompatActivity;

    .line 116
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/BookmarkReader;->setHasOptionsMenu(Z)V

    .line 117
    invoke-virtual {p1}, Landroid/support/v7/app/AppCompatActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v7/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 118
    invoke-virtual {p1}, Landroid/support/v7/app/AppCompatActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 119
    invoke-virtual {p1}, Landroid/support/v7/app/AppCompatActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBar;->setDisplayShowHomeEnabled(Z)V

    .line 120
    invoke-virtual {p1}, Landroid/support/v7/app/AppCompatActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 123
    :cond_0
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/BookmarkReader;->setHasOptionsMenu(Z)V

    .line 126
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getView()Landroid/view/View;

    move-result-object p1

    const v1, 0x7f0901b5

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->browser:Landroid/webkit/WebView;

    .line 127
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->browser:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 128
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->browser:Landroid/webkit/WebView;

    new-instance v0, Lcom/rt/mobile/english/ui/BookmarkReader$InnerClient;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/rt/mobile/english/ui/BookmarkReader$InnerClient;-><init>(Lcom/rt/mobile/english/ui/BookmarkReader;Lcom/rt/mobile/english/ui/BookmarkReader$1;)V

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 129
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getView()Landroid/view/View;

    move-result-object p1

    const v0, 0x7f090180

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v4/widget/SwipeRefreshLayout;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->mSwipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    .line 131
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->mSwipeRefreshLayout:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-virtual {p1, p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 133
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->loadNew()V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    .line 77
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 78
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    .line 80
    :try_start_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/BookmarkReader$Listener;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->listener:Lcom/rt/mobile/english/ui/BookmarkReader$Listener;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 82
    :catch_0
    new-instance p1, Ljava/lang/ClassCastException;

    const-string v0, "Parent fragment or activity must implement PagerFragment.Listener"

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 3

    .line 162
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 163
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    const-string p2, "bookmark"

    const/4 v0, 0x1

    const v1, 0x7f090030

    const/4 v2, 0x0

    .line 164
    invoke-interface {p1, v0, v1, v2, p2}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p2

    const v0, 0x7f080109

    .line 165
    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p2

    const/16 v0, 0x9

    .line 166
    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 170
    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->mMenu:Landroid/view/Menu;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 89
    invoke-super {p0, p3}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 91
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object p3

    if-nez p3, :cond_0

    .line 92
    new-instance p3, Lcom/rt/mobile/english/ui/DatabaseManager$DBHelper;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p3, v0}, Lcom/rt/mobile/english/ui/DatabaseManager$DBHelper;-><init>(Landroid/content/Context;)V

    invoke-static {p3}, Lcom/rt/mobile/english/ui/DatabaseManager;->initializeInstance(Landroid/database/sqlite/SQLiteOpenHelper;)V

    .line 96
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    const-string v0, "extra_arice"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    .line 97
    :goto_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "position"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    iput v0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->positionInPager:I

    if-eqz p3, :cond_3

    .line 102
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->gson:Lcom/google/gson/Gson;

    const-class v2, Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v0, p3, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/rt/mobile/english/data/articles/Article;

    iput-object p3, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->article:Lcom/rt/mobile/english/data/articles/Article;

    :cond_3
    const/4 p3, 0x1

    .line 105
    invoke-virtual {p0, p3}, Lcom/rt/mobile/english/ui/BookmarkReader;->setHasOptionsMenu(Z)V

    const p3, 0x7f0c004e

    .line 107
    invoke-virtual {p1, p3, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 206
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    const-string v0, "ArticleReader"

    const-string v1, "onDestroy"

    .line 207
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 209
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->invalidateOptionsMenu()V

    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 5

    .line 176
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090030

    if-ne v0, v1, :cond_2

    .line 177
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/DatabaseManager;->openDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const-string v0, "bookmarks"

    .line 178
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "article_id = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/articles/Article;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 179
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/DatabaseManager;->closeDatabase()V

    .line 180
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 181
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f100024

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/BookmarkReader;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f100036

    .line 182
    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/BookmarkReader;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->article:Lcom/rt/mobile/english/data/articles/Article;

    .line 183
    invoke-virtual {v4}, Lcom/rt/mobile/english/data/articles/Article;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->article:Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v4}, Lcom/rt/mobile/english/data/articles/Article;->getURL()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 181
    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/rt/mobile/english/Utils;->sendEvent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    const v0, 0x7f100043

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    .line 185
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 186
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x11

    if-lt p1, v0, :cond_0

    .line 187
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->isDestroyed()Z

    goto :goto_0

    .line 189
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->onDetachedFromWindow()V

    .line 193
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->listener:Lcom/rt/mobile/english/ui/BookmarkReader$Listener;

    iget v0, p0, Lcom/rt/mobile/english/ui/BookmarkReader;->positionInPager:I

    invoke-interface {p1, v0}, Lcom/rt/mobile/english/ui/BookmarkReader$Listener;->onBookmarkDeleted(I)V

    const/4 p1, 0x1

    return p1

    .line 196
    :cond_2
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onRefresh()V
    .locals 0

    .line 244
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/BookmarkReader;->loadNew()V

    return-void
.end method

.method public onResume()V
    .locals 2

    .line 144
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    const-string v0, "ArticleReader"

    const-string v1, "onResume"

    .line 145
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onStart()V
    .locals 2

    .line 138
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    const-string v0, "ArticleReader"

    const-string v1, "onStart"

    .line 139
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onStop()V
    .locals 2

    .line 220
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    const-string v0, "ArticleReader"

    const-string v1, "onStop"

    .line 221
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
