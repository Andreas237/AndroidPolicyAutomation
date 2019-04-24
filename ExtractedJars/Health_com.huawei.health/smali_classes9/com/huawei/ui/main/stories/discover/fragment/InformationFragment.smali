.class public Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/Button;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/ProgressBar;

.field private g:Lcom/huawei/operation/view/CustomWebView;

.field private h:Landroid/content/Context;

.field private i:Landroid/webkit/WebView;

.field private k:Lo/emr;

.field private l:Z

.field private m:Ljava/lang/String;

.field private o:Lo/fia;

.field private p:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 148
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->m:Ljava/lang/String;

    .line 71
    new-instance v0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$5;-><init>(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->p:Landroid/os/Handler;

    .line 149
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WebViewMiniShopFragment()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Lo/emr;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->k:Lo/emr;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 308
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoNetWorkPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->a:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 312
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/widget/ProgressBar;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->f:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private b()V
    .locals 4

    .line 297
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoServicePage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->a:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_unable_connect_server_tips:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 302
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 142
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 143
    const-string v0, "url"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 144
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 146
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->m:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 4

    .line 286
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoServicePage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_unstable_net_work_pls_touch_to_retry:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->a:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 291
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->b()V

    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 332
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 333
    const-string v0, "url"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 334
    const-string v0, "type"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 335
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 337
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 338
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/content/Context;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 318
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showServerErrorPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->a:Landroid/widget/Button;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_servers_error:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 323
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;Z)Z
    .locals 0

    .line 53
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->l:Z

    return p1
.end method

.method private e()V
    .locals 6

    .line 220
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->web_view_container_info:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->e:Landroid/widget/RelativeLayout;

    .line 222
    new-instance v0, Landroid/webkit/WebView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->e:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 226
    new-instance v0, Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    .line 227
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$id;->load_url_progress_info:I

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ProgressBar;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->p:Landroid/os/Handler;

    const/16 v5, 0xbb9

    invoke-direct/range {v0 .. v5}, Lcom/huawei/operation/view/CustomWebView;-><init>(Landroid/content/Context;Landroid/widget/ProgressBar;Landroid/webkit/WebView;Landroid/os/Handler;I)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$4;-><init>(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 249
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$3;-><init>(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V

    .line 264
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->operation_webview_titlebar_info:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->k:Lo/emr;

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->getProgressBar()Landroid/widget/ProgressBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->f:Landroid/widget/ProgressBar;

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->k:Lo/emr;

    invoke-virtual {v1}, Lo/emr;->getmViewTitle()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->setTextView(Landroid/widget/TextView;)V

    .line 268
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->net_work_layout_info:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d:Landroid/widget/RelativeLayout;

    .line 270
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->reload_layout_info:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->b:Landroid/widget/RelativeLayout;

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 273
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->btn_no_net_work_info:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->a:Landroid/widget/Button;

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->a:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 276
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$id;->tips_no_net_work_info:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->c:Landroid/widget/TextView;

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->k:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setVisibility(I)V

    .line 279
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->l:Z

    .line 280
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->a()V

    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Lcom/huawei/operation/view/CustomWebView;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 418
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->m:Ljava/lang/String;

    .line 419
    const-string v0, "ai-information-001"

    const/16 v1, 0x7534

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v3

    .line 420
    if-eqz v3, :cond_0

    .line 421
    const-string v0, "ai-information-001"

    const-string v1, "information_more_url"

    const/16 v2, 0x7534

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->m:Ljava/lang/String;

    .line 425
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SOCIAL_MORE_INFO_URL"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->m:Ljava/lang/String;

    .line 429
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 430
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    .line 431
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->l:Z

    .line 434
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h()V

    .line 435
    return-void
.end method

.method private h()V
    .locals 4

    .line 385
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getinformationUrl()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->o:Lo/fia;

    new-instance v1, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment$1;-><init>(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V

    invoke-virtual {v0, v1}, Lo/fia;->b(Lo/eaf;)V

    .line 411
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->c()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/webkit/WebView;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 342
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload isNetworkConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    return-void

    .line 345
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 347
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g()V

    .line 348
    return-void
.end method

.method private k()V
    .locals 5

    .line 370
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroyWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    .line 372
    const-string v0, "onDestroy destroyWebView"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 374
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 375
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 377
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 379
    :cond_1
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->d()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Landroid/os/Handler;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->p:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;)Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->l:Z

    return v0
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 194
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 195
    const-string v0, "TimeEat_InformationFragmentEnter onActivityCreated"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 196
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    .line 197
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->l:Z

    .line 198
    const-string v0, "TimeEat_InformationFragmentLeave onActivityCreated"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 199
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->b:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 353
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i()V

    goto :goto_0

    .line 354
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->a:Landroid/widget/Button;

    if-ne p1, v0, :cond_1

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 357
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

    .line 155
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 156
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
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

    .line 163
    const-string v0, "TimeEat_InformationFragmentEnter onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 164
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_health_information:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/fia;->d(Landroid/content/Context;)Lo/fia;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->o:Lo/fia;

    .line 166
    const-string v0, "TimeEat_InformationFragmentLeave onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 167
    return-object v2
.end method

.method public onDestroy()V
    .locals 4

    .line 361
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 363
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Contants.WEBVIEW_STATUS_ONDESTROY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    const-string v1, "303"

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->callBackWebviewStatus(Ljava/lang/String;)V

    .line 366
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->k()V

    .line 367
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 184
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "webview onPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 187
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Contants.WEBVIEW_STATUS_ONPAUSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    const-string v1, "302"

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->callBackWebviewStatus(Ljava/lang/String;)V

    .line 190
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 173
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 174
    const-string v0, "TimeEat_InformationFragmentEnter onResume"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->i:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 176
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Contants.WEBVIEW_STATUS_ONRESUME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    const-string v1, "301"

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->callBackWebviewStatus(Ljava/lang/String;)V

    .line 179
    :cond_0
    const-string v0, "TimeEat_InformationFragmentLeave onResume"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 180
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 4

    .line 203
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V

    .line 204
    const-string v0, "Opera_InformationFragment"

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

    .line 205
    if-eqz p1, :cond_1

    .line 206
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->l:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 207
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->e()V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g:Lcom/huawei/operation/view/CustomWebView;

    if-eqz v0, :cond_0

    .line 209
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/InformationFragment;->g()V

    goto :goto_0

    .line 211
    :cond_0
    const-string v0, "Opera_InformationFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserVisibleHint mCustomWebView is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    :cond_1
    :goto_0
    return-void
.end method
