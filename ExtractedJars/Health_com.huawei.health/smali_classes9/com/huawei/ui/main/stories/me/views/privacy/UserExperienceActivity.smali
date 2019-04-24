.class public Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity$e;
    }
.end annotation


# instance fields
.field private a:Landroid/webkit/WebSettings;

.field private c:Ljava/util/concurrent/ExecutorService;

.field private d:Landroid/os/Handler;

.field private e:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 33
    new-instance v0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity$e;-><init>(Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->d:Landroid/os/Handler;

    return-void
.end method

.method private b()V
    .locals 4

    .line 46
    const-string v0, "UserExperienceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_user_experience_webview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->e:Landroid/webkit/WebView;

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->a:Landroid/webkit/WebSettings;

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->a:Landroid/webkit/WebSettings;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->a:Landroid/webkit/WebSettings;

    sget-object v1, Landroid/webkit/WebSettings$TextSize;->SMALLER:Landroid/webkit/WebSettings$TextSize;

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setTextSize(Landroid/webkit/WebSettings$TextSize;)V

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->a:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->a:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 55
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->a:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 62
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->d(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 6

    .line 65
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    .line 67
    const-string v0, "userExperience"

    :try_start_0
    invoke-virtual {v4, v0}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 68
    invoke-interface {v5, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    const/4 v0, 0x1

    return v0

    .line 73
    :cond_0
    goto :goto_0

    .line 71
    :catch_0
    move-exception v5

    .line 72
    const-string v0, "UserExperienceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->e:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 105
    :cond_0
    return-void
.end method

.method private e()V
    .locals 9

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file:///android_asset/userExperience/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file:///android_asset/userExperience/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 82
    const-string v0, "UserExperienceActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "User_agreementAll = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    const-string v0, "UserExperienceActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "User_agreement = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->d:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v8

    .line 86
    invoke-direct {p0, v4}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iput-object v5, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->d:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 90
    :cond_0
    invoke-direct {p0, v6}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->d:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 95
    :cond_1
    const-string v0, "file:///android_asset/userExperience/en-US.html"

    iput-object v0, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->d:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 99
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->e()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 37
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 38
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_health_user_experience_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->setContentView(I)V

    .line 39
    const-string v0, "UserExperienceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->c:Ljava/util/concurrent/ExecutorService;

    .line 41
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->b()V

    .line 42
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 127
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->c:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/UserExperienceActivity;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 131
    :cond_0
    return-void
.end method
