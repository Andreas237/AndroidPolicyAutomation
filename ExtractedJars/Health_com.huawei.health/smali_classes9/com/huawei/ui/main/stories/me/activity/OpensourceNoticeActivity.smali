.class public Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$c;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Ljava/util/concurrent/ExecutorService;

.field private c:Landroid/content/Context;

.field private d:Landroid/os/Handler;

.field private e:Landroid/webkit/WebSettings;

.field private h:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 39
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$c;-><init>(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->d:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;)Landroid/os/Handler;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->d:Landroid/os/Handler;

    return-object v0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 6

    .line 132
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    .line 134
    const-string v0, "opensourcenotice"

    :try_start_0
    invoke-virtual {v4, v0}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 135
    invoke-interface {v5, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    const/4 v0, 0x1

    return v0

    .line 140
    :cond_0
    goto :goto_0

    .line 138
    :catch_0
    move-exception v5

    .line 139
    const-string v0, "OpensourceNoticeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private c()V
    .locals 4

    .line 57
    const-string v0, "OpensourceNoticeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_user_profile_opensource_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->setContentView(I)V

    .line 60
    new-instance v0, Landroid/webkit/WebView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->h:Landroid/webkit/WebView;

    .line 61
    sget v0, Lcom/huawei/ui/main/R$id;->opensource_item_linear:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->a:Landroid/widget/LinearLayout;

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->h:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->h:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->e:Landroid/webkit/WebSettings;

    .line 66
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->e:Landroid/webkit/WebSettings;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->e:Landroid/webkit/WebSettings;

    sget-object v1, Landroid/webkit/WebSettings$TextSize;->SMALLER:Landroid/webkit/WebSettings$TextSize;

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setTextSize(Landroid/webkit/WebSettings$TextSize;)V

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->e:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->e:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->e:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->e:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->d()V

    .line 74
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->h:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->h:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 101
    :cond_0
    return-void
.end method

.method private d()V
    .locals 2

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->b:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 94
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;Ljava/lang/String;)Z
    .locals 1

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private e()V
    .locals 6

    .line 116
    const-string v0, "OpensourceNoticeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroyWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->h:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 118
    const-string v0, "OpensourceNoticeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy destroyWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->h:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 120
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 121
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->h:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 124
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->h:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    goto :goto_0

    .line 125
    :catch_0
    move-exception v5

    .line 126
    const-string v0, "OpensourceNoticeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Throwable e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 45
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 46
    const-string v0, "OpensourceNoticeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->c:Landroid/content/Context;

    .line 49
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->b:Ljava/util/concurrent/ExecutorService;

    .line 51
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->c()V

    .line 53
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 106
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->e()V

    .line 109
    const-string v0, "OpensourceNoticeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->b:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 113
    :cond_0
    return-void
.end method
