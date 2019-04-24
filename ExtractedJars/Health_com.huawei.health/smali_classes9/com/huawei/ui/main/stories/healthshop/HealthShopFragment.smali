.class public Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/Button;

.field private f:Lcom/huawei/operation/view/CustomWebView;

.field private g:Landroid/widget/ProgressBar;

.field private h:Lo/emr;

.field private i:Landroid/webkit/WebView;

.field private k:Landroid/content/Context;

.field private l:Landroid/os/Handler;

.field private p:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 113
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 61
    new-instance v0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$2;-><init>(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->l:Landroid/os/Handler;

    .line 114
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WebViewMiniShopFragment()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Landroid/content/Context;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 6

    .line 205
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->web_view_container:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->a:Landroid/widget/RelativeLayout;

    .line 207
    new-instance v0, Landroid/webkit/WebView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 211
    new-instance v0, Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k:Landroid/content/Context;

    .line 212
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$id;->load_url_progress:I

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ProgressBar;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->l:Landroid/os/Handler;

    const/16 v5, 0xbb9

    invoke-direct/range {v0 .. v5}, Lcom/huawei/operation/view/CustomWebView;-><init>(Landroid/content/Context;Landroid/widget/ProgressBar;Landroid/webkit/WebView;Landroid/os/Handler;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->f:Lcom/huawei/operation/view/CustomWebView;

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$1;-><init>(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 234
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$5;-><init>(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V

    .line 249
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->operation_webview_titlebar:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->h:Lo/emr;

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->f:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getProgressBar()Landroid/widget/ProgressBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->g:Landroid/widget/ProgressBar;

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->f:Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->h:Lo/emr;

    invoke-virtual {v1}, Lo/emr;->getmViewTitle()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setTextView(Landroid/widget/TextView;)V

    .line 253
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->net_work_layout:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->b:Landroid/widget/RelativeLayout;

    .line 255
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->reload_layout:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->d:Landroid/widget/RelativeLayout;

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 258
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->btn_no_net_work:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->e:Landroid/widget/Button;

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->e:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 261
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->tips_no_net_work:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->c:Landroid/widget/TextView;

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->h:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setVisibility(I)V

    .line 264
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->p:Z

    .line 265
    return-void
.end method

.method private b()V
    .locals 4

    .line 302
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showServerErrorPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->e:Landroid/widget/Button;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_servers_error:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 307
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->c()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Lo/emr;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->h:Lo/emr;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 281
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoServicePage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->e:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_unable_connect_server_tips:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 286
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 315
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 316
    const-string v0, "url"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 317
    const-string v0, "type"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 318
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 321
    return-void
.end method

.method private d()V
    .locals 4

    .line 292
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoNetWorkPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->e:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 296
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->d()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Landroid/widget/ProgressBar;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->g:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 270
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoServicePage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_unstable_net_work_pls_touch_to_retry:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->e:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 275
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;Z)Z
    .locals 0

    .line 47
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->p:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Landroid/webkit/WebView;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->b()V

    return-void
.end method

.method private i()V
    .locals 4

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 325
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload isNetworkConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    return-void

    .line 328
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "healthRecommendUrl"

    new-instance v2, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$4;-><init>(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 344
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->e()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Lcom/huawei/operation/view/CustomWebView;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->f:Lcom/huawei/operation/view/CustomWebView;

    return-object v0
.end method

.method private k()V
    .locals 5

    .line 366
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroyWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    .line 368
    const-string v0, "onDestroy destroyWebView"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 370
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 371
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 373
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 375
    :cond_1
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 162
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 163
    const-string v0, "TimeEat_HealthShopFragmentEnter onActivityCreated"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 164
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k:Landroid/content/Context;

    .line 165
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->p:Z

    .line 166
    const-string v0, "TimeEat_HealthShopFragmentLeave onActivityCreated"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 167
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->d:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 349
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i()V

    goto :goto_0

    .line 350
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->e:Landroid/widget/Button;

    if-ne p1, v0, :cond_1

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 353
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 124
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 125
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 132
    const-string v0, "TimeEat_HealthShopFragmentEnter onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 133
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_health_shop:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 134
    const-string v0, "TimeEat_HealthShopFragmentLeave onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 135
    return-object v2
.end method

.method public onDestroy()V
    .locals 4

    .line 357
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->f:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 359
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Contants.WEBVIEW_STATUS_ONDESTROY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->f:Lcom/huawei/operation/view/CustomWebView;

    const-string v1, "303"

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->callBackWebviewStatus(Ljava/lang/String;)V

    .line 362
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k()V

    .line 363
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 152
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "webview onPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->f:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 155
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Contants.WEBVIEW_STATUS_ONPAUSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->f:Lcom/huawei/operation/view/CustomWebView;

    const-string v1, "302"

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->callBackWebviewStatus(Ljava/lang/String;)V

    .line 158
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 141
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 142
    const-string v0, "TimeEat_HealthShopFragmentEnter onResume"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->f:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 144
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Contants.WEBVIEW_STATUS_ONRESUME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->f:Lcom/huawei/operation/view/CustomWebView;

    const-string v1, "301"

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->callBackWebviewStatus(Ljava/lang/String;)V

    .line 147
    :cond_0
    const-string v0, "TimeEat_HealthShopFragmentLeave onResume"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 148
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 4

    .line 171
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V

    .line 172
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserVisibleHint isVisibleToUser is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    if-eqz p1, :cond_1

    .line 174
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->p:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 175
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->a()V

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->f:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_0

    .line 177
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCustomWebView.load(HEALTH_SHPO_URL)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "healthRecommendUrl"

    new-instance v2, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$3;-><init>(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    goto :goto_0

    .line 195
    :cond_0
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserVisibleHint mCustomWebView is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    :cond_1
    :goto_0
    return-void
.end method
