.class public Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/graphics/drawable/AnimationDrawable;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/webkit/WebView;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/Button;

.field private h:Lo/emr;

.field private i:Landroid/widget/Button;

.field private k:Landroid/webkit/WebSettings;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Landroid/content/Context;

.field private q:Landroid/os/Handler;

.field private t:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 85
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->q:Landroid/os/Handler;

    .line 301
    new-instance v0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->t:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)Landroid/webkit/WebView;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->e:Landroid/webkit/WebView;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 159
    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    .line 162
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_title_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->h:Lo/emr;

    .line 163
    const-string v0, "https://consumer.huawei.com/minisite/cloudservice/health/terms.htm?country="

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->o:Ljava/lang/String;

    .line 164
    const-string v0, "HealthUserAgreement"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    const-string v0, "https://consumer.huawei.com/minisite/cloudservice/health/terms.htm?country="

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->o:Ljava/lang/String;

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_about_service_item:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->n:Ljava/lang/String;

    .line 168
    :cond_0
    const-string v0, "HealthPrivacy"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    const-string v0, "https://consumer.huawei.com/minisite/cloudservice/health/privacy-statement.htm?country="

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->o:Ljava/lang/String;

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_about_privacy_notice:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->n:Ljava/lang/String;

    .line 172
    :cond_1
    const-string v0, "CBGPrivacy"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 173
    const-string v0, "https://consumer.huawei.com/minisite/legal/privacy/statement.htm?country="

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->o:Ljava/lang/String;

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_privacy_CBG_privacy:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->n:Ljava/lang/String;

    .line 177
    :cond_2
    const-string v0, "VmallUserAgreement"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 178
    const-string v0, "https://consumer.huawei.com/minisite/cloudservice/vmall/terms.htm?country=CN&language=zh_Hans_CN"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->o:Ljava/lang/String;

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_use_agreement:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->n:Ljava/lang/String;

    .line 182
    :cond_3
    const-string v0, "VmallPrivacy"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 183
    const-string v0, "https://consumer.huawei.com/minisite/cloudservice/vmall/privacy-statement.htm?country=CN&language=zh_Hans_CN"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->o:Ljava/lang/String;

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_privacy_statement:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->n:Ljava/lang/String;

    .line 187
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->h:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->k:Landroid/webkit/WebSettings;

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    goto :goto_0

    .line 192
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 194
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->k:Landroid/webkit/WebSettings;

    sget-object v1, Landroid/webkit/WebSettings$TextSize;->SMALLER:Landroid/webkit/WebSettings$TextSize;

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setTextSize(Landroid/webkit/WebSettings$TextSize;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->e:Landroid/webkit/WebView;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->e:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$3;-><init>(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 210
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;Ljava/lang/String;)Z
    .locals 1

    .line 37
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)Landroid/graphics/drawable/AnimationDrawable;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->c:Landroid/graphics/drawable/AnimationDrawable;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 117
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServiceItemActivity.isErrorWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    sget v0, Lcom/huawei/ui/main/R$id;->btn_go_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->i:Landroid/widget/Button;

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->i:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    sget v0, Lcom/huawei/ui/main/R$id;->mini_shop__webview_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->h:Lo/emr;

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->h:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_about_service_item:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 132
    return-void
.end method

.method private c(Ljava/lang/String;)Z
    .locals 6

    .line 288
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    .line 290
    const-string v0, "healthUserAgreement"

    :try_start_0
    invoke-virtual {v4, v0}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 291
    invoke-interface {v5, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    const/4 v0, 0x1

    return v0

    .line 297
    :cond_0
    goto :goto_0

    .line 295
    :catch_0
    move-exception v5

    .line 296
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->d:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 135
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_user_agreement_webview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->e:Landroid/webkit/WebView;

    .line 137
    sget v0, Lcom/huawei/ui/main/R$id;->service_layout_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->d:Landroid/widget/LinearLayout;

    .line 138
    sget v0, Lcom/huawei/ui/main/R$id;->service_item_linear:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->b:Landroid/widget/LinearLayout;

    .line 139
    sget v0, Lcom/huawei/ui/main/R$id;->reload_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->f:Landroid/widget/RelativeLayout;

    .line 140
    sget v0, Lcom/huawei/ui/main/R$id;->btn_no_net_work:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->g:Landroid/widget/Button;

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->d:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->service_info_loading:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->a:Landroid/widget/ImageView;

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->c:Landroid/graphics/drawable/AnimationDrawable;

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->c:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->g:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->q:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->t:Ljava/lang/Runnable;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 149
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->a()V

    .line 151
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)Landroid/content/Context;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    return-object v0
.end method

.method private e()Ljava/lang/String;
    .locals 7

    .line 213
    const-string v0, "VmallPrivacy"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "VmallUserAgreement"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 214
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->o:Ljava/lang/String;

    return-object v0

    .line 216
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    .line 217
    const/4 v4, 0x0

    .line 218
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    .line 219
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getScript()Ljava/lang/String;

    move-result-object v4

    .line 226
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    const/16 v1, 0x2734

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "select_country"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->m:Ljava/lang/String;

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 230
    const-string v0, "GB"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->m:Ljava/lang/String;

    .line 234
    :cond_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v5

    .line 235
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 236
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private f()V
    .locals 6

    .line 272
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroyWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->e:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 274
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy destroyWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 276
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 277
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 280
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 283
    goto :goto_0

    .line 281
    :catch_0
    move-exception v5

    .line 282
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Throwable e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->g:Landroid/widget/Button;

    if-ne p1, v0, :cond_0

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 269
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 89
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 90
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    .line 91
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 92
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->finish()V

    .line 93
    return-void

    .line 96
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 97
    const-string v0, "CN"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->m:Ljava/lang/String;

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->getCountryCode(Lo/dcx;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->m:Ljava/lang/String;

    .line 104
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "Agreement_key"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->l:Ljava/lang/String;

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->p:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->A(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_web_view_error_1:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->setContentView(I)V

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->c()V

    goto :goto_0

    .line 109
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_about_serviceitem:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->setContentView(I)V

    .line 110
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->d()V

    .line 112
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->b()V

    .line 114
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 259
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 260
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->f()V

    .line 261
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 253
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 254
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    return-void
.end method

.method protected onRestart()V
    .locals 4

    .line 241
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRestart()V

    .line 242
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRestart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 247
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 248
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    return-void
.end method
