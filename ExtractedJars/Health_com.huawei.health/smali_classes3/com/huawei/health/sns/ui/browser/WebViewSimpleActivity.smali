.class public Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$c;,
        Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$e;
    }
.end annotation


# instance fields
.field private f:Landroid/app/ActionBar;

.field private g:Landroid/webkit/WebView;

.field private h:Ljava/lang/String;

.field private k:Landroid/widget/FrameLayout;

.field private n:Landroid/view/View;

.field private p:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 71
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->p:Z

    return-void
.end method

.method private a()V
    .locals 4

    .line 134
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->f:Landroid/app/ActionBar;

    .line 136
    sget v0, Lcom/huawei/android/sns/R$id;->wvs_Holder:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->k:Landroid/widget/FrameLayout;

    .line 139
    sget v0, Lcom/huawei/android/sns/R$id;->wvs_webView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    .line 140
    sget v0, Lcom/huawei/android/sns/R$id;->wvs_load_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->n:Landroid/view/View;

    .line 143
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$e;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$4;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$c;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$4;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    .line 147
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 148
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 150
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 151
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 153
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 154
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 156
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 157
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 159
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->b()V

    .line 160
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->k()V

    return-void
.end method

.method private b()V
    .locals 4

    .line 164
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 165
    if-nez v3, :cond_0

    .line 167
    const-string v0, "WebViewSimpleActivity"

    const-string v1, "actionbar not found."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    return-void

    .line 171
    :cond_0
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 175
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    goto :goto_0

    .line 180
    :cond_1
    new-instance v0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$4;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v3, v1, v2, v0}, Lo/bmm;->a(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 193
    :goto_0
    const-string v0, " "

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 194
    return-void
.end method

.method public static b(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3

    .line 204
    if-eqz p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 206
    :cond_0
    const-string v0, "WebViewSimpleActivity"

    const-string v1, "param error, can\'t view page."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    return-void

    .line 210
    :cond_1
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 211
    const-string v0, "url"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 212
    invoke-virtual {p0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 213
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 7

    .line 382
    invoke-static {p0}, Lo/boi;->d(Landroid/app/Activity;)I

    move-result v4

    .line 383
    invoke-static {p0}, Lo/boi;->b(Landroid/app/Activity;)I

    move-result v5

    .line 385
    int-to-double v0, v4

    const-wide v2, 0x3fd3333333333333L    # 0.3

    mul-double/2addr v0, v2

    double-to-int v0, v0

    sub-int v1, v4, v5

    sub-int v6, v0, v1

    .line 386
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v6, v1, v2}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 387
    return-void
.end method

.method private c()V
    .locals 4

    .line 92
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 93
    if-nez v2, :cond_0

    .line 95
    return-void

    .line 98
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 99
    if-nez v3, :cond_1

    .line 101
    return-void

    .line 105
    :cond_1
    const-string v0, "url"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->h:Ljava/lang/String;

    .line 106
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->h:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 109
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "url is null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 111
    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;Ljava/lang/String;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)Z
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->h()Z

    move-result v0

    return v0
.end method

.method private e()V
    .locals 1

    .line 124
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->p:Z

    .line 125
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->f:Landroid/app/ActionBar;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->f:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 349
    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    .line 356
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 357
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->n:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 358
    return-void
.end method

.method private h()Z
    .locals 1

    .line 337
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->p:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private k()V
    .locals 2

    .line 365
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->n:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 366
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 367
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->p:Z

    .line 368
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 116
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->d:Landroid/view/View;

    .line 117
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 373
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 374
    sget v0, Lcom/huawei/android/sns/R$id;->wvs_ic_load_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->b(Landroid/view/View;)V

    .line 375
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 76
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 77
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_webview_simple:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->setContentView(I)V

    .line 79
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->a()V

    .line 81
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->c()V

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->e()V

    .line 84
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 85
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 314
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 317
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 319
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->k:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 322
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 325
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->removeAllViews()V

    .line 326
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 328
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    .line 329
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 307
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onPause()V

    .line 308
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    .line 309
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 300
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onResume()V

    .line 301
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->g:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    .line 302
    return-void
.end method
