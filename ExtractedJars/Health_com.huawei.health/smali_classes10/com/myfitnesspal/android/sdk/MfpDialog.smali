.class public Lcom/myfitnesspal/android/sdk/MfpDialog;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;
    }
.end annotation


# static fields
.field static final FILL:Landroid/widget/FrameLayout$LayoutParams;

.field private static final MFP_WEB_BASE_URL:Ljava/lang/String; = "https://www.myfitnesspal.com/oauth2"


# instance fields
.field private authListener:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

.field private content:Landroid/widget/FrameLayout;

.field private crossImage:Landroid/widget/ImageView;

.field private redirectUrl:Ljava/lang/String;

.field private spinner:Landroid/app/ProgressDialog;

.field private url:Ljava/lang/String;

.field private webView:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 28
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    sput-object v0, Lcom/myfitnesspal/android/sdk/MfpDialog;->FILL:Landroid/widget/FrameLayout$LayoutParams;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;Landroid/os/Bundle;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V
    .locals 4

    .line 46
    const v0, 0x1030010

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 47
    invoke-virtual {p3}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->asBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 48
    const-string v0, "%s/%s?%s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "https://www.myfitnesspal.com/oauth2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {p4}, Lcom/myfitnesspal/shared/utils/UriUtils;->urlEncode(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->url:Ljava/lang/String;

    .line 49
    invoke-virtual {p3}, Lcom/myfitnesspal/android/sdk/AuthorizeRequestData;->getRedirectUri()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->redirectUrl:Ljava/lang/String;

    .line 50
    iput-object p5, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->authListener:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    .line 51
    return-void
.end method

.method static synthetic access$000(Lcom/myfitnesspal/android/sdk/MfpDialog;)Lcom/myfitnesspal/android/sdk/MfpAuthListener;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->authListener:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    return-object v0
.end method

.method static synthetic access$200(Lcom/myfitnesspal/android/sdk/MfpDialog;)Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->redirectUrl:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300(Lcom/myfitnesspal/android/sdk/MfpDialog;)Landroid/app/ProgressDialog;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->spinner:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic access$400(Lcom/myfitnesspal/android/sdk/MfpDialog;)Landroid/widget/FrameLayout;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->content:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic access$500(Lcom/myfitnesspal/android/sdk/MfpDialog;)Landroid/webkit/WebView;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->webView:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic access$600(Lcom/myfitnesspal/android/sdk/MfpDialog;)Landroid/widget/ImageView;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->crossImage:Landroid/widget/ImageView;

    return-object v0
.end method

.method private createCrossImage()V
    .locals 3

    .line 92
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->crossImage:Landroid/widget/ImageView;

    .line 94
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->crossImage:Landroid/widget/ImageView;

    new-instance v1, Lcom/myfitnesspal/android/sdk/MfpDialog$1;

    invoke-direct {v1, p0}, Lcom/myfitnesspal/android/sdk/MfpDialog$1;-><init>(Lcom/myfitnesspal/android/sdk/MfpDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/myfitnesspal/android/api/R$drawable;->close:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 104
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->crossImage:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 108
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->crossImage:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 109
    return-void
.end method

.method private setUpWebView(I)V
    .locals 4

    .line 113
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 114
    new-instance v0, Landroid/webkit/WebView;

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->webView:Landroid/webkit/WebView;

    .line 115
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 116
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 117
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;-><init>(Lcom/myfitnesspal/android/sdk/MfpDialog;Lcom/myfitnesspal/android/sdk/MfpDialog$1;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 118
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 119
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->webView:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->webView:Landroid/webkit/WebView;

    sget-object v1, Lcom/myfitnesspal/android/sdk/MfpDialog;->FILL:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 122
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 124
    invoke-virtual {v3, p1, p1, p1, p1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 125
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->webView:Landroid/webkit/WebView;

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 126
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->content:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 127
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 2

    .line 86
    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    .line 87
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->authListener:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/myfitnesspal/android/sdk/MfpAuthListener;->onCancel(Landroid/os/Bundle;)V

    .line 88
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 56
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 57
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->spinner:Landroid/app/ProgressDialog;

    .line 58
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->spinner:Landroid/app/ProgressDialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->requestWindowFeature(I)Z

    .line 59
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->spinner:Landroid/app/ProgressDialog;

    const-string v1, "Loading..."

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 61
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->requestWindowFeature(I)Z

    .line 62
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->content:Landroid/widget/FrameLayout;

    .line 68
    invoke-direct {p0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->createCrossImage()V

    .line 73
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->crossImage:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    .line 74
    div-int/lit8 v0, v5, 0x2

    invoke-direct {p0, v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->setUpWebView(I)V

    .line 79
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->content:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->crossImage:Landroid/widget/ImageView;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x2

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog;->content:Landroid/widget/FrameLayout;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lcom/myfitnesspal/android/sdk/MfpDialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 81
    return-void
.end method
