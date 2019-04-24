.class public Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private c:Landroid/webkit/WebSettings;

.field private e:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private b()V
    .locals 4

    .line 38
    const-string v0, "PLGACHIEVE_AchieveLevelRuleCNActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    new-instance v0, Landroid/webkit/WebView;

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->e:Landroid/webkit/WebView;

    .line 42
    sget v0, Lcom/huawei/pluginachievement/R$id;->service_item_linear:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->a:Landroid/widget/LinearLayout;

    .line 44
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 48
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->c:Landroid/webkit/WebSettings;

    .line 49
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->c:Landroid/webkit/WebSettings;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 50
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->c:Landroid/webkit/WebSettings;

    sget-object v1, Landroid/webkit/WebSettings$TextSize;->SMALLER:Landroid/webkit/WebSettings$TextSize;

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setTextSize(Landroid/webkit/WebSettings$TextSize;)V

    .line 51
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->c:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 52
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->c:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 53
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->c:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 55
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->e:Landroid/webkit/WebView;

    const-string v1, "file:///android_asset/level_rule.html"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 56
    return-void
.end method

.method private e()V
    .locals 6

    .line 88
    const-string v0, "PLGACHIEVE_AchieveLevelRuleCNActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroyWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->e:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 90
    const-string v0, "PLGACHIEVE_AchieveLevelRuleCNActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy destroyWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 92
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 93
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 96
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    goto :goto_0

    .line 97
    :catch_0
    move-exception v5

    .line 98
    const-string v0, "PLGACHIEVE_AchieveLevelRuleCNActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Throwable e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 31
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 32
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_level_cn_rule:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->setContentView(I)V

    .line 33
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->b()V

    .line 34
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 82
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 83
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelRuleCNActivity;->e()V

    .line 84
    const-string v0, "PLGACHIEVE_AchieveLevelRuleCNActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 75
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 76
    const-string v0, "PLGACHIEVE_AchieveLevelRuleCNActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    return-void
.end method

.method protected onRestart()V
    .locals 4

    .line 61
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRestart()V

    .line 62
    const-string v0, "PLGACHIEVE_AchieveLevelRuleCNActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRestart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 68
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 69
    const-string v0, "PLGACHIEVE_AchieveLevelRuleCNActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    return-void
.end method
