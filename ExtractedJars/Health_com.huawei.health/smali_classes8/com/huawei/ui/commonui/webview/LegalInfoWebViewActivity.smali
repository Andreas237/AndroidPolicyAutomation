.class public Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$e;,
        Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Landroid/widget/Button;

.field private c:Landroid/webkit/WebView;

.field private d:Landroid/widget/Button;

.field private e:Landroid/widget/LinearLayout;

.field private f:Lo/emr;

.field private g:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;

.field private h:Landroid/content/Context;

.field private i:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$e;

.field private k:Landroid/webkit/WebSettings;

.field private m:I

.field private n:Ljava/lang/String;

.field private o:[Ljava/lang/String;

.field private p:Lo/egv;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->e:Landroid/widget/LinearLayout;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->a:Landroid/widget/LinearLayout;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->d:Landroid/widget/Button;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->b:Landroid/widget/Button;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->k:Landroid/webkit/WebSettings;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->h:Landroid/content/Context;

    .line 53
    new-instance v0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$e;-><init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$2;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->i:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$e;

    .line 54
    new-instance v0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;-><init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$2;)V

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->g:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;

    .line 57
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "https://health.vmall.com/help/legal/eula/index.jsp"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "https://health.vmall.com/help/userimprovement/index.jsp"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "file:///android_asset/legalInformation/"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->o:[Ljava/lang/String;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->p:Lo/egv;

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->n:Ljava/lang/String;

    .line 74
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->m:I

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)Landroid/content/Context;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->h:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 185
    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 3

    .line 221
    const-string v0, "connectivity"

    .line 222
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 223
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 224
    if-eqz v2, :cond_0

    .line 225
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    if-nez v0, :cond_0

    .line 226
    const/4 v0, 0x1

    return v0

    .line 228
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)Lo/egv;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->p:Lo/egv;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 86
    invoke-virtual {p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 87
    if-nez v4, :cond_0

    .line 88
    const-string v0, "LegalInfoWebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    return-void

    .line 92
    :cond_0
    sget v0, Lcom/huawei/ui/commonui/R$id;->use_agreenment_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->f:Lo/emr;

    .line 93
    const-string v0, "LegalInfoWebViewActivity.TITLE_KEY"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->f:Lo/emr;

    invoke-virtual {v0, v5}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 97
    const-string v0, "LegalInfoWebViewActivity.URL_KEY"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->n:Ljava/lang/String;

    .line 100
    sget v0, Lcom/huawei/ui/commonui/R$id;->layout_retry:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->a:Landroid/widget/LinearLayout;

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 103
    sget v0, Lcom/huawei/ui/commonui/R$id;->layout_loading:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->e:Landroid/widget/LinearLayout;

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 106
    sget v0, Lcom/huawei/ui/commonui/R$id;->retry:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->d:Landroid/widget/Button;

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->d:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->d:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 108
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c()V

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->d:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$2;-><init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    sget v0, Lcom/huawei/ui/commonui/R$id;->ok_btn:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->b:Landroid/widget/Button;

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->b:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$5;-><init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    const-string v0, "LegalInfoWebViewActivity.URL_TYPE_KEY"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->m:I

    .line 130
    iget v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->m:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 132
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->k:Landroid/webkit/WebSettings;

    sget-object v1, Landroid/webkit/WebSettings$TextSize;->SMALLER:Landroid/webkit/WebSettings$TextSize;

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setTextSize(Landroid/webkit/WebSettings$TextSize;)V

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->e()V

    goto :goto_0

    .line 138
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 139
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->h()V

    .line 141
    goto :goto_0

    .line 143
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 144
    .line 148
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3e9 -> :sswitch_0
        0x3ea -> :sswitch_1
    .end sparse-switch
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    .line 268
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 273
    :cond_0
    return-void
.end method

.method private c()V
    .locals 2

    .line 154
    sget v0, Lcom/huawei/ui/commonui/R$id;->webview:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    goto :goto_0

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 161
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->k:Landroid/webkit/WebSettings;

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->k:Landroid/webkit/WebSettings;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->g:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->i:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$e;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 171
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->h()V

    return-void
.end method

.method private d()V
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 181
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->a()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)Landroid/webkit/WebView;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c:Landroid/webkit/WebView;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 193
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->h:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_service_area_notice_title:I

    .line 194
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_app_help_3gnet_diag_conent:I

    .line 195
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_apphelp_pwindows_back_button:I

    new-instance v2, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$1;-><init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V

    .line 196
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_apphelp_pwindows_continue_button:I

    new-instance v2, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$3;-><init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V

    .line 203
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 211
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->p:Lo/egv;

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->p:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 213
    return-void
.end method

.method private e(Ljava/lang/String;)Z
    .locals 8

    .line 283
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {p1, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v4

    .line 285
    const-string v0, "[<>]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    .line 286
    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    .line 287
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    const-string v0, "LegalInfoWebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " url is illegal..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 291
    :cond_0
    const-string v0, "LegalInfoWebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url is correct..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->o:[Ljava/lang/String;

    array-length v0, v0

    if-ge v7, v0, :cond_2

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->o:[Ljava/lang/String;

    aget-object v0, v0, v7

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    const/4 v0, 0x1

    return v0

    .line 292
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 299
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private h()V
    .locals 1

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->h:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->n:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 240
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->d()V

    .line 242
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->d()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->e:Landroid/widget/LinearLayout;

    return-object v0
.end method


# virtual methods
.method public c(Landroid/content/Context;)Z
    .locals 4

    .line 250
    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 251
    if-eqz v2, :cond_0

    .line 252
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 253
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v0

    sget-object v1, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v0, v1, :cond_0

    .line 255
    const/4 v0, 0x1

    return v0

    .line 259
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 78
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 79
    sget v0, Lcom/huawei/ui/commonui/R$layout;->activity_lefal_info_webview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->setContentView(I)V

    .line 80
    iput-object p0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->h:Landroid/content/Context;

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->b()V

    .line 82
    return-void
.end method
