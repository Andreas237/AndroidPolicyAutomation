.class public Lcom/huawei/ui/commonui/webview/WebViewActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/commonui/webview/WebViewActivity$a;,
        Lcom/huawei/ui/commonui/webview/WebViewActivity$d;,
        Lcom/huawei/ui/commonui/webview/WebViewActivity$c;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/LinearLayout;

.field public c:Lo/emr;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/webkit/WebView;

.field private f:Landroid/widget/ProgressBar;

.field private g:Ljava/lang/String;

.field private h:Lo/egv;

.field private i:Landroid/widget/Button;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Z

.field private n:Ljava/lang/String;

.field private o:Lcom/huawei/ui/commonui/webview/WebViewActivity$a;

.field private p:Ljava/lang/String;

.field private q:I

.field private r:[Ljava/lang/String;

.field private t:Lcom/huawei/ui/commonui/webview/WebViewActivity$d;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b:Landroid/widget/LinearLayout;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->h:Lo/egv;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->i:Landroid/widget/Button;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->g:Ljava/lang/String;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->k:Ljava/lang/String;

    .line 66
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->n:Ljava/lang/String;

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->p:Ljava/lang/String;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->l:Ljava/lang/String;

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->m:Z

    .line 71
    new-instance v0, Lcom/huawei/ui/commonui/webview/WebViewActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/commonui/webview/WebViewActivity$a;-><init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;Lcom/huawei/ui/commonui/webview/WebViewActivity$5;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->o:Lcom/huawei/ui/commonui/webview/WebViewActivity$a;

    .line 72
    new-instance v0, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/commonui/webview/WebViewActivity$d;-><init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;Lcom/huawei/ui/commonui/webview/WebViewActivity$5;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->t:Lcom/huawei/ui/commonui/webview/WebViewActivity$d;

    .line 98
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->q:I

    .line 103
    const/16 v0, 0x16

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "http://cn.club.vmall.com/"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "https://health.vmall.com/help/"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "https://health.vmall.com/help/userimprovement/index.jsp"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "http://club.huawei.com/cn/forum-1421-1.html"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "http://club.huawei.com/"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "http://www.dol.cn/minisite/index.aspx"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "https://m.vmall.com/"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "http://v.youku.com/"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "http://m.youku.com/"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "http://player.youku.com/"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "http://www.iqiyi.com/"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "http://www.miaopai.com/"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "http://3ms.huawei.com/"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "http://v.qq.com/"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "https://v.qq.com/"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "https://m.v.qq.com/"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "http://static.video.qq.com/"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "http://www.letv.com/"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "http://i7.imgs.letv.com/"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "https://hwid1.vmall.com/"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "http://hwid1.vmall.com/"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "https://msale.vmall.com/"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->r:[Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/commonui/webview/WebViewActivity;)I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->q:I

    return v0
.end method

.method private a()V
    .locals 4

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->h:Lo/egv;

    if-nez v0, :cond_0

    .line 285
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_service_area_notice_title:I

    .line 286
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_app_help_3gnet_diag_conent:I

    .line 287
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_apphelp_pwindows_back_button:I

    new-instance v2, Lcom/huawei/ui/commonui/webview/WebViewActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity$3;-><init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V

    .line 288
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_apphelp_pwindows_continue_button:I

    new-instance v2, Lcom/huawei/ui/commonui/webview/WebViewActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity$1;-><init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V

    .line 295
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 302
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->h:Lo/egv;

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->h:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 306
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->h:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 311
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Landroid/content/Context;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/webview/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->k:Ljava/lang/String;

    return-object p1
.end method

.method private b()V
    .locals 4

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->k:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->k:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->d(Ljava/lang/String;)V

    .line 378
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->k:Ljava/lang/String;

    goto :goto_0

    .line 381
    :cond_0
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-- WebViewActivity load url ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 386
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e()V

    .line 389
    :goto_0
    return-void
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 551
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jumpToActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 554
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 555
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 556
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 557
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 558
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jump to scheme view"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 561
    goto :goto_0

    .line 559
    :catch_0
    move-exception v4

    .line 560
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    :goto_0
    return-void
.end method

.method private c()V
    .locals 3

    .line 174
    sget v0, Lcom/huawei/ui/commonui/R$id;->webview_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->d:Landroid/widget/LinearLayout;

    .line 175
    sget v0, Lcom/huawei/ui/commonui/R$id;->app_help_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c:Lo/emr;

    .line 176
    sget v0, Lcom/huawei/ui/commonui/R$id;->refresh_btn:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->i:Landroid/widget/Button;

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->i:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->i:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 178
    sget v0, Lcom/huawei/ui/commonui/R$id;->load_help_url_progress:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->f:Landroid/widget/ProgressBar;

    .line 179
    sget v0, Lcom/huawei/ui/commonui/R$id;->sns_app_help_web:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 184
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    .line 185
    iget v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->q:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    goto :goto_0

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    goto :goto_0

    .line 191
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 196
    :cond_2
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 199
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->t:Lcom/huawei/ui/commonui/webview/WebViewActivity$d;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->o:Lcom/huawei/ui/commonui/webview/WebViewActivity$a;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/ui/commonui/webview/WebViewActivity$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/commonui/webview/WebViewActivity$c;-><init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;Lcom/huawei/ui/commonui/webview/WebViewActivity$5;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 203
    sget v0, Lcom/huawei/ui/commonui/R$id;->help_retry:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b:Landroid/widget/LinearLayout;

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c:Lo/emr;

    new-instance v1, Lcom/huawei/ui/commonui/webview/WebViewActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity$5;-><init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Landroid/webkit/WebView;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 317
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->h:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->h:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->cancel()V

    .line 320
    :cond_0
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    .line 426
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 427
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-- WebViewActivity load url ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 430
    :cond_0
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "This url is inValid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    :goto_0
    return-void
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 3

    .line 360
    const-string v0, "connectivity"

    .line 361
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 362
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 363
    if-eqz v2, :cond_0

    .line 364
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    if-nez v0, :cond_0

    .line 365
    const/4 v0, 0x1

    return v0

    .line 367
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private e()V
    .locals 2

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 439
    return-void
.end method

.method private e(I)V
    .locals 3

    .line 248
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 250
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_main_discovery_tab_service_help:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 251
    goto/16 :goto_1

    .line 253
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_main_discovery_tab_service_huawei_club:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 254
    goto :goto_1

    .line 256
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_main_left_menu_vmall:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 257
    goto :goto_1

    .line 259
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setFitsSystemWindows(Z)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setVisibility(I)V

    .line 261
    goto :goto_1

    .line 263
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_main_discovery_tab_service_help:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 264
    goto :goto_1

    .line 266
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 267
    goto :goto_1

    .line 269
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_nottification_settings_b2_ex:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 270
    goto :goto_1

    .line 272
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 275
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method static synthetic e(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->d()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/commonui/webview/WebViewActivity;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/lang/String;)Z
    .locals 8

    .line 400
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {p1, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v4

    .line 401
    const-string v0, "[<>]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    .line 402
    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    .line 403
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 404
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " url is illegal..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 407
    :cond_0
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url is correct..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->r:[Ljava/lang/String;

    array-length v0, v0

    if-ge v7, v0, :cond_2

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->r:[Ljava/lang/String;

    aget-object v0, v0, v7

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 411
    const/4 v0, 0x1

    return v0

    .line 408
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 416
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic f(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->k()V

    return-void
.end method

.method private g()V
    .locals 5

    .line 453
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 454
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_social_information_tips:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_social_information_update_webview_notifi:I

    .line 455
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$string;->IDS_common_notification_know_tips:I

    .line 456
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/commonui/webview/WebViewActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity$2;-><init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 461
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 462
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 463
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->m:Z

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->f:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->l:Ljava/lang/String;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 446
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->g()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 0

    .line 610
    iput-object p1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->p:Ljava/lang/String;

    .line 611
    return-void
.end method

.method public b(Landroid/content/Context;)Z
    .locals 4

    .line 343
    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 344
    if-eqz v2, :cond_0

    .line 345
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 346
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 347
    const/4 v0, 0x1

    return v0

    .line 350
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 130
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 131
    sget v0, Lcom/huawei/ui/commonui/R$layout;->activity_web_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->setContentView(I)V

    .line 132
    iput-object p0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    .line 134
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 135
    if-nez v4, :cond_0

    .line 136
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    return-void

    .line 140
    :cond_0
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->g:Ljava/lang/String;

    .line 143
    const-string v0, "WebViewActivity.TITLE"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->n:Ljava/lang/String;

    .line 146
    const-string v0, "WebViewActivity.HANDLE_REDIRECT"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->m:Z

    .line 149
    const-string v0, "WebViewActivity.RESULT_URL"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->l:Ljava/lang/String;

    .line 152
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 154
    iput v5, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->q:I

    .line 157
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c()V

    .line 160
    invoke-direct {p0, v5}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e(I)V

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    if-ne v5, v0, :cond_1

    .line 164
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a()V

    goto :goto_0

    .line 166
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b()V

    .line 168
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 632
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 634
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 635
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 636
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 638
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 325
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 328
    const/4 v0, 0x1

    return v0

    .line 330
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->finish()V

    .line 333
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 0

    .line 627
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 628
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 622
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 623
    return-void
.end method

.method public onWebRetryClick(Landroid/view/View;)V
    .locals 0

    .line 471
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b()V

    .line 472
    return-void
.end method
