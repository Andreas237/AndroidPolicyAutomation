.class public Lcom/tencent/open/yyb/AppbarActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/yyb/AppbarActivity$b;,
        Lcom/tencent/open/yyb/AppbarActivity$a;,
        Lcom/tencent/open/yyb/AppbarActivity$d;,
        Lcom/tencent/open/yyb/AppbarActivity$c;
    }
.end annotation


# static fields
.field private static final FLOATING_DIALOG_HEIGHT:I = 0x64

.field public static final MYAPP_CACHE_PATH:Ljava/lang/String; = "/tencent/tassistant"

.field private static final UA_PREFIX:Ljava/lang/String; = "qqdownloader/"

.field private static final WEBVIEW_PATH:Ljava/lang/String; = "/webview_cache"

.field private static specialModel:Ljava/util/ArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# instance fields
.field private appid:Ljava/lang/String;

.field private jsBridge:Lcom/tencent/open/yyb/AppbarJsBridge;

.field private final mDownloadListener:Landroid/webkit/DownloadListener;

.field private mFloatingDialog:Lcom/tencent/open/yyb/MoreFloatingDialog;

.field protected mProgressDialog:Landroid/app/ProgressDialog;

.field private mRootView:Landroid/widget/LinearLayout;

.field private mTitleBar:Lcom/tencent/open/yyb/TitleBar;

.field private mToken:Lcom/tencent/connect/auth/QQToken;

.field private mWebView:Lcom/tencent/open/c/b;

.field private model:Lcom/tencent/open/yyb/ShareModel;

.field private tencent:Lcom/tencent/tauth/Tencent;

.field private titlebarTop:I

.field private url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 225
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/tencent/open/yyb/AppbarActivity;->specialModel:Ljava/util/ArrayList;

    .line 227
    sget-object v0, Lcom/tencent/open/yyb/AppbarActivity;->specialModel:Ljava/util/ArrayList;

    const-string v1, "MT870"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    sget-object v0, Lcom/tencent/open/yyb/AppbarActivity;->specialModel:Ljava/util/ArrayList;

    const-string v1, "XT910"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    sget-object v0, Lcom/tencent/open/yyb/AppbarActivity;->specialModel:Ljava/util/ArrayList;

    const-string v1, "XT928"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    sget-object v0, Lcom/tencent/open/yyb/AppbarActivity;->specialModel:Ljava/util/ArrayList;

    const-string v1, "MT917"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    sget-object v0, Lcom/tencent/open/yyb/AppbarActivity;->specialModel:Ljava/util/ArrayList;

    const-string v1, "Lenovo A60"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 743
    new-instance v0, Lcom/tencent/open/yyb/AppbarActivity$5;

    invoke-direct {v0, p0}, Lcom/tencent/open/yyb/AppbarActivity$5;-><init>(Lcom/tencent/open/yyb/AppbarActivity;)V

    iput-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mDownloadListener:Landroid/webkit/DownloadListener;

    return-void
.end method

.method static synthetic access$200(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/yyb/TitleBar;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mTitleBar:Lcom/tencent/open/yyb/TitleBar;

    return-object v0
.end method

.method static synthetic access$300(Lcom/tencent/open/yyb/AppbarActivity;Z)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/tencent/open/yyb/AppbarActivity;->setSupportZoom(Z)V

    return-void
.end method

.method static synthetic access$400(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/yyb/AppbarJsBridge;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->jsBridge:Lcom/tencent/open/yyb/AppbarJsBridge;

    return-object v0
.end method

.method static synthetic access$500(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$600(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/c/b;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    return-object v0
.end method

.method private buildTransaction(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 658
    if-nez p1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private createViews()V
    .locals 3

    .line 133
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v2, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 136
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0, v2}, Lcom/tencent/open/c/b;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 138
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mRootView:Landroid/widget/LinearLayout;

    .line 139
    const/16 v0, 0x11

    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 140
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mRootView:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mRootView:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 143
    new-instance v0, Lcom/tencent/open/yyb/TitleBar;

    invoke-direct {v0, p0}, Lcom/tencent/open/yyb/TitleBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mTitleBar:Lcom/tencent/open/yyb/TitleBar;

    .line 144
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mTitleBar:Lcom/tencent/open/yyb/TitleBar;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/TitleBar;->getBackBtn()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mTitleBar:Lcom/tencent/open/yyb/TitleBar;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/TitleBar;->getSharBtn()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mRootView:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->mTitleBar:Lcom/tencent/open/yyb/TitleBar;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 148
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mRootView:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 150
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mRootView:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lcom/tencent/open/yyb/AppbarActivity;->setContentView(Landroid/view/View;)V

    .line 151
    return-void
.end method

.method private getCommonPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 265
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getCommonRootDir()Ljava/lang/String;

    move-result-object v1

    .line 266
    const/4 v2, 0x0

    .line 267
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 270
    :cond_0
    move-object v2, v1

    .line 272
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, v2, v0}, Lcom/tencent/open/yyb/AppbarActivity;->getPath(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getCommonRootDir()Ljava/lang/String;
    .locals 4

    .line 290
    const/4 v2, 0x0

    .line 293
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->isSDCardExistAndCanWrite()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 294
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/tencent/tassistant"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 297
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getFilesDir()Ljava/io/File;

    move-result-object v3

    .line 298
    if-nez v3, :cond_1

    .line 299
    const-string v0, ""

    return-object v0

    .line 301
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/tencent/tassistant"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 303
    :goto_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 304
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 305
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 307
    :cond_2
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getFloatingDialg()Lcom/tencent/open/yyb/MoreFloatingDialog;
    .locals 2

    .line 276
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mFloatingDialog:Lcom/tencent/open/yyb/MoreFloatingDialog;

    if-nez v0, :cond_0

    .line 277
    new-instance v0, Lcom/tencent/open/yyb/MoreFloatingDialog;

    invoke-direct {v0, p0}, Lcom/tencent/open/yyb/MoreFloatingDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mFloatingDialog:Lcom/tencent/open/yyb/MoreFloatingDialog;

    .line 278
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mFloatingDialog:Lcom/tencent/open/yyb/MoreFloatingDialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/tencent/open/yyb/MoreFloatingDialog;->setCanceledOnTouchOutside(Z)V

    .line 280
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mFloatingDialog:Lcom/tencent/open/yyb/MoreFloatingDialog;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/MoreFloatingDialog;->getQQItem()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 281
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mFloatingDialog:Lcom/tencent/open/yyb/MoreFloatingDialog;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/MoreFloatingDialog;->getQzoneItem()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mFloatingDialog:Lcom/tencent/open/yyb/MoreFloatingDialog;

    return-object v0
.end method

.method private getPath(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 5

    .line 324
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 325
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 326
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 327
    if-eqz p2, :cond_0

    .line 328
    new-instance v3, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".nomedia"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 330
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 333
    goto :goto_0

    .line 331
    :catch_0
    move-exception v4

    .line 332
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V

    .line 336
    :cond_0
    :goto_0
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getTencent()Lcom/tencent/tauth/Tencent;
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->tencent:Lcom/tencent/tauth/Tencent;

    if-nez v0, :cond_0

    .line 246
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->appid:Ljava/lang/String;

    invoke-static {v0, p0}, Lcom/tencent/tauth/Tencent;->createInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/tencent/tauth/Tencent;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->tencent:Lcom/tencent/tauth/Tencent;

    .line 249
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->tencent:Lcom/tencent/tauth/Tencent;

    return-object v0
.end method

.method private getTitbarTop()I
    .locals 4

    .line 430
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 431
    invoke-virtual {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 432
    new-instance v3, Landroid/util/DisplayMetrics;

    invoke-direct {v3}, Landroid/util/DisplayMetrics;-><init>()V

    .line 433
    invoke-virtual {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 435
    iget v0, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->titlebarTop:I

    .line 436
    iget v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->titlebarTop:I

    return v0
.end method

.method private getToken()Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mToken:Lcom/tencent/connect/auth/QQToken;

    if-nez v0, :cond_0

    .line 254
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getTencent()Lcom/tencent/tauth/Tencent;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mToken:Lcom/tencent/connect/auth/QQToken;

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method private getWebViewCacheDir()Ljava/lang/String;
    .locals 1

    .line 261
    const-string v0, "/webview_cache"

    invoke-direct {p0, v0}, Lcom/tencent/open/yyb/AppbarActivity;->getCommonPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private initViews()V
    .locals 8

    .line 154
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v4

    .line 155
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "qqdownloader/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->jsBridge:Lcom/tencent/open/yyb/AppbarJsBridge;

    invoke-virtual {v1}, Lcom/tencent/open/yyb/AppbarJsBridge;->getVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/sdk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 158
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 159
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    .line 161
    const-string v0, "setPluginsEnabled"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 162
    if-eqz v6, :cond_0

    .line 163
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 169
    :cond_0
    goto :goto_0

    .line 165
    :catch_0
    move-exception v6

    .line 166
    invoke-virtual {v6}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    .line 169
    goto :goto_0

    .line 167
    :catch_1
    move-exception v6

    .line 168
    invoke-virtual {v6}, Ljava/lang/Throwable;->printStackTrace()V

    .line 171
    :goto_0
    const-string v0, "setDomStorageEnabled"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 173
    if-eqz v6, :cond_1

    .line 174
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_6

    .line 181
    :cond_1
    goto :goto_1

    .line 175
    :catch_2
    move-exception v6

    .line 176
    invoke-virtual {v6}, Ljava/lang/SecurityException;->printStackTrace()V

    .line 181
    goto :goto_1

    .line 177
    :catch_3
    move-exception v6

    .line 181
    goto :goto_1

    .line 178
    :catch_4
    move-exception v6

    .line 181
    goto :goto_1

    .line 179
    :catch_5
    move-exception v6

    .line 181
    goto :goto_1

    .line 180
    :catch_6
    move-exception v6

    .line 183
    :goto_1
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getWebViewCacheDir()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V

    .line 184
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getWebViewCacheDir()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 185
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 186
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V

    .line 188
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->supportWebViewFullScreen()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 189
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 190
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x7

    if-lt v0, v1, :cond_2

    .line 192
    const-string v0, "setLoadWithOverviewMode"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 194
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7

    .line 196
    goto :goto_2

    .line 195
    :catch_7
    move-exception v6

    .line 198
    :cond_2
    :goto_2
    invoke-static {}, Lcom/tencent/open/utils/SystemUtils;->isSupportMultiTouch()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 199
    invoke-static {}, Lcom/tencent/open/utils/SystemUtils;->getAndroidSDKVersion()I

    move-result v0

    const/16 v1, 0xb

    if-ge v0, v1, :cond_3

    .line 201
    :try_start_3
    const-class v0, Landroid/webkit/WebView;

    const-string v1, "mZoomButtonsController"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    .line 202
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 203
    new-instance v7, Landroid/widget/ZoomButtonsController;

    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-direct {v7, v0}, Landroid/widget/ZoomButtonsController;-><init>(Landroid/view/View;)V

    .line 204
    invoke-virtual {v7}, Landroid/widget/ZoomButtonsController;->getZoomControls()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 205
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v6, v0, v7}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_8

    .line 207
    goto :goto_3

    .line 206
    :catch_8
    move-exception v6

    .line 207
    goto :goto_3

    .line 210
    :cond_3
    :try_start_4
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    .line 211
    const-string v0, "setDisplayZoomControls"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 212
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_9

    .line 214
    goto :goto_3

    .line 213
    :catch_9
    move-exception v6

    .line 219
    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    new-instance v1, Lcom/tencent/open/yyb/AppbarActivity$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/tencent/open/yyb/AppbarActivity$d;-><init>(Lcom/tencent/open/yyb/AppbarActivity;Lcom/tencent/open/yyb/AppbarActivity$1;)V

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 220
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    new-instance v1, Lcom/tencent/open/yyb/AppbarActivity$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/tencent/open/yyb/AppbarActivity$c;-><init>(Lcom/tencent/open/yyb/AppbarActivity;Lcom/tencent/open/yyb/AppbarActivity$1;)V

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 221
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->mDownloadListener:Landroid/webkit/DownloadListener;

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 222
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->loadUrl(Ljava/lang/String;)V

    .line 223
    return-void
.end method

.method private isSDCardExistAndCanWrite()Z
    .locals 4

    .line 311
    const/4 v2, 0x0

    .line 313
    const-string v0, "mounted"

    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v2, v0

    .line 318
    goto :goto_1

    .line 316
    :catch_0
    move-exception v3

    .line 317
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 320
    :goto_1
    return v2
.end method

.method private setSupportZoom(Z)V
    .locals 1

    .line 340
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    if-eqz v0, :cond_0

    .line 341
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 343
    :cond_0
    return-void
.end method

.method private shareToWX(Z)V
    .locals 4

    .line 609
    const-string v0, "openSDK_LOG"

    const-string v1, "-->shareToWX : wx_appid = wx8e8dc60535c9cd93"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 615
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v0, v0, Lcom/tencent/open/yyb/ShareModel;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 616
    const-string v0, ""

    const-string v1, ""

    invoke-virtual {p0, p0, v0, v1}, Lcom/tencent/open/yyb/AppbarActivity;->showProgressDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    new-instance v0, Lcom/tencent/open/yyb/AppbarActivity$b;

    new-instance v1, Lcom/tencent/open/yyb/AppbarActivity$4;

    invoke-direct {v1, p0}, Lcom/tencent/open/yyb/AppbarActivity$4;-><init>(Lcom/tencent/open/yyb/AppbarActivity;)V

    invoke-direct {v0, v1}, Lcom/tencent/open/yyb/AppbarActivity$b;-><init>(Lcom/tencent/open/yyb/AppbarActivity$a;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    iget-object v2, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v2, v2, Lcom/tencent/open/yyb/ShareModel;->c:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/tencent/open/yyb/AppbarActivity$b;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 643
    :cond_0
    return-void
.end method

.method private supportWebViewFullScreen()Z
    .locals 2

    .line 240
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 241
    const-string v0, "vivo"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/tencent/open/yyb/AppbarActivity;->specialModel:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public login()V
    .locals 3

    .line 458
    const-string v0, "openSDK_LOG"

    const-string v1, "-->login : activity~~~"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 459
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getTencent()Lcom/tencent/tauth/Tencent;

    move-result-object v2

    .line 460
    const-string v0, "all"

    new-instance v1, Lcom/tencent/open/yyb/AppbarActivity$1;

    invoke-direct {v1, p0}, Lcom/tencent/open/yyb/AppbarActivity$1;-><init>(Lcom/tencent/open/yyb/AppbarActivity;)V

    invoke-virtual {v2, p0, v0, v1}, Lcom/tencent/tauth/Tencent;->login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I

    .line 519
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 124
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getFloatingDialg()Lcom/tencent/open/yyb/MoreFloatingDialog;

    move-result-object v1

    .line 125
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/tencent/open/yyb/MoreFloatingDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    invoke-virtual {v1}, Lcom/tencent/open/yyb/MoreFloatingDialog;->dismiss()V

    .line 127
    return-void

    .line 129
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 130
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 441
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getFloatingDialg()Lcom/tencent/open/yyb/MoreFloatingDialog;

    move-result-object v1

    .line 442
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mTitleBar:Lcom/tencent/open/yyb/TitleBar;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/TitleBar;->getSharBtn()Landroid/widget/ImageView;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 443
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->jsBridge:Lcom/tencent/open/yyb/AppbarJsBridge;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/AppbarJsBridge;->clickCallback()V

    goto :goto_0

    .line 444
    :cond_0
    invoke-virtual {v1}, Lcom/tencent/open/yyb/MoreFloatingDialog;->getQQItem()Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 445
    invoke-virtual {p0}, Lcom/tencent/open/yyb/AppbarActivity;->shareToQQ()V

    goto :goto_0

    .line 446
    :cond_1
    invoke-virtual {v1}, Lcom/tencent/open/yyb/MoreFloatingDialog;->getQzoneItem()Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 447
    invoke-virtual {p0}, Lcom/tencent/open/yyb/AppbarActivity;->shareToQzone()V

    goto :goto_0

    .line 448
    :cond_2
    invoke-virtual {v1}, Lcom/tencent/open/yyb/MoreFloatingDialog;->getWXItem()Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_3

    .line 449
    invoke-virtual {p0}, Lcom/tencent/open/yyb/AppbarActivity;->shareToWX()V

    goto :goto_0

    .line 450
    :cond_3
    invoke-virtual {v1}, Lcom/tencent/open/yyb/MoreFloatingDialog;->getTimelineItem()Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_4

    .line 451
    invoke-virtual {p0}, Lcom/tencent/open/yyb/AppbarActivity;->shareToTimeline()V

    goto :goto_0

    .line 452
    :cond_4
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mTitleBar:Lcom/tencent/open/yyb/TitleBar;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/TitleBar;->getBackBtn()Landroid/widget/RelativeLayout;

    move-result-object v0

    if-ne p1, v0, :cond_5

    .line 453
    invoke-virtual {p0}, Lcom/tencent/open/yyb/AppbarActivity;->finish()V

    .line 455
    :cond_5
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 92
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 94
    invoke-virtual {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "appid"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->appid:Ljava/lang/String;

    .line 95
    invoke-virtual {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->url:Ljava/lang/String;

    .line 97
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->(AppbarActivity)onCreate : appid = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/yyb/AppbarActivity;->appid:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " url = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/yyb/AppbarActivity;->url:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    new-instance v0, Lcom/tencent/open/c/b;

    invoke-direct {v0, p0}, Lcom/tencent/open/c/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    .line 101
    new-instance v0, Lcom/tencent/open/yyb/AppbarJsBridge;

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-direct {v0, p0, v1}, Lcom/tencent/open/yyb/AppbarJsBridge;-><init>(Landroid/app/Activity;Landroid/webkit/WebView;)V

    iput-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->jsBridge:Lcom/tencent/open/yyb/AppbarJsBridge;

    .line 103
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->createViews()V

    .line 104
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->initViews()V

    .line 105
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 357
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 359
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    if-eqz v0, :cond_0

    .line 363
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->removeAllViews()V

    .line 364
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setVisibility(I)V

    .line 365
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->stopLoading()V

    .line 366
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->clearHistory()V

    .line 367
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->destroy()V

    .line 369
    :cond_0
    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 114
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 115
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getFloatingDialg()Lcom/tencent/open/yyb/MoreFloatingDialog;

    move-result-object v1

    .line 116
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/tencent/open/yyb/MoreFloatingDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    invoke-virtual {v1}, Lcom/tencent/open/yyb/MoreFloatingDialog;->dismiss()V

    .line 118
    return-void

    .line 120
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 109
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 110
    return-void
.end method

.method public setAppbarTitle(Ljava/lang/String;)V
    .locals 1

    .line 650
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mTitleBar:Lcom/tencent/open/yyb/TitleBar;

    invoke-virtual {v0, p1}, Lcom/tencent/open/yyb/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 651
    return-void
.end method

.method public setShareModel(Lcom/tencent/open/yyb/ShareModel;)V
    .locals 0

    .line 654
    iput-object p1, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    .line 655
    return-void
.end method

.method public setShareVisibility(Z)V
    .locals 2

    .line 646
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mTitleBar:Lcom/tencent/open/yyb/TitleBar;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/TitleBar;->getSharBtn()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 647
    return-void
.end method

.method public shareToQQ()V
    .locals 6

    .line 522
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v3

    .line 523
    if-nez v3, :cond_0

    .line 524
    return-void

    .line 526
    :cond_0
    new-instance v4, Lcom/tencent/connect/share/QQShare;

    invoke-direct {v4, p0, v3}, Lcom/tencent/connect/share/QQShare;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 527
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 528
    const-string v0, "title"

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v1, v1, Lcom/tencent/open/yyb/ShareModel;->a:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    const-string v0, "targetUrl"

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v1, v1, Lcom/tencent/open/yyb/ShareModel;->d:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    const-string v0, "summary"

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v1, v1, Lcom/tencent/open/yyb/ShareModel;->b:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    const-string v0, "imageUrl"

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v1, v1, Lcom/tencent/open/yyb/ShareModel;->c:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->(AppbarActivity)shareToQQ : model.mTitle = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v2, v2, Lcom/tencent/open/yyb/ShareModel;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->(AppbarActivity)shareToQQ : model.mTargetUrl = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v2, v2, Lcom/tencent/open/yyb/ShareModel;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->(AppbarActivity)shareToQQ : model.mDescription = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v2, v2, Lcom/tencent/open/yyb/ShareModel;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->(AppbarActivity)shareToQQ : model.mIconUrl = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v2, v2, Lcom/tencent/open/yyb/ShareModel;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    new-instance v0, Lcom/tencent/open/yyb/AppbarActivity$2;

    invoke-direct {v0, p0, v3}, Lcom/tencent/open/yyb/AppbarActivity$2;-><init>(Lcom/tencent/open/yyb/AppbarActivity;Lcom/tencent/connect/auth/QQToken;)V

    invoke-virtual {v4, p0, v5, v0}, Lcom/tencent/connect/share/QQShare;->shareToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 557
    invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "200"

    const-string v2, "SDK.APPBAR.HOME.SHARE.QQ"

    invoke-static {v0, v1, v2}, Lcom/tencent/open/yyb/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    return-void
.end method

.method public shareToQzone()V
    .locals 7

    .line 561
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v3

    .line 562
    if-nez v3, :cond_0

    .line 563
    return-void

    .line 565
    :cond_0
    new-instance v4, Lcom/tencent/connect/share/QzoneShare;

    invoke-direct {v4, p0, v3}, Lcom/tencent/connect/share/QzoneShare;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 566
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 567
    const-string v0, "req_type"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 569
    const-string v0, "title"

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v1, v1, Lcom/tencent/open/yyb/ShareModel;->a:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    const-string v0, "summary"

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v1, v1, Lcom/tencent/open/yyb/ShareModel;->b:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    const-string v0, "targetUrl"

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v1, v1, Lcom/tencent/open/yyb/ShareModel;->d:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 572
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 573
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->shareToQzone : mIconUrl = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v2, v2, Lcom/tencent/open/yyb/ShareModel;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->model:Lcom/tencent/open/yyb/ShareModel;

    iget-object v0, v0, Lcom/tencent/open/yyb/ShareModel;->c:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    const-string v0, "imageUrl"

    invoke-virtual {v5, v0, v6}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 576
    new-instance v0, Lcom/tencent/open/yyb/AppbarActivity$3;

    invoke-direct {v0, p0, v3}, Lcom/tencent/open/yyb/AppbarActivity$3;-><init>(Lcom/tencent/open/yyb/AppbarActivity;Lcom/tencent/connect/auth/QQToken;)V

    invoke-virtual {v4, p0, v5, v0}, Lcom/tencent/connect/share/QzoneShare;->shareToQzone(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 597
    invoke-virtual {v3}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "200"

    const-string v2, "SDK.APPBAR.HOME.SHARE.QZ"

    invoke-static {v0, v1, v2}, Lcom/tencent/open/yyb/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 598
    return-void
.end method

.method public shareToTimeline()V
    .locals 1

    .line 605
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/tencent/open/yyb/AppbarActivity;->shareToWX(Z)V

    .line 606
    return-void
.end method

.method public shareToWX()V
    .locals 1

    .line 601
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/tencent/open/yyb/AppbarActivity;->shareToWX(Z)V

    .line 602
    return-void
.end method

.method public showFloatingDialog()V
    .locals 9

    .line 410
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getFloatingDialg()Lcom/tencent/open/yyb/MoreFloatingDialog;

    move-result-object v4

    .line 411
    invoke-virtual {v4}, Lcom/tencent/open/yyb/MoreFloatingDialog;->show()V

    .line 413
    invoke-virtual {v4}, Lcom/tencent/open/yyb/MoreFloatingDialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    .line 414
    invoke-virtual {v5}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v6

    .line 415
    const/16 v0, 0x30

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 417
    invoke-direct {p0}, Lcom/tencent/open/yyb/AppbarActivity;->getTitbarTop()I

    move-result v0

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity;->mTitleBar:Lcom/tencent/open/yyb/TitleBar;

    invoke-virtual {v1}, Lcom/tencent/open/yyb/TitleBar;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 418
    invoke-virtual {v4}, Lcom/tencent/open/yyb/MoreFloatingDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v7

    .line 419
    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v8

    .line 420
    const/high16 v0, 0x42c80000    # 100.0f

    invoke-virtual {v4, v0}, Lcom/tencent/open/yyb/MoreFloatingDialog;->dip2px(F)I

    move-result v0

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 421
    invoke-virtual {v8}, Landroid/view/Display;->getWidth()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3fee666666666666L    # 0.95

    mul-double/2addr v0, v2

    double-to-int v0, v0

    div-int/lit8 v0, v0, 0x2

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 422
    iget v0, v6, Landroid/view/WindowManager$LayoutParams;->width:I

    div-int/lit8 v0, v0, 0x2

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 424
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->(AppbarDialog)showFloatingDialog : params.x = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v6, Landroid/view/WindowManager$LayoutParams;->x:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    invoke-virtual {v5, v6}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 427
    return-void
.end method

.method protected showProgressDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 664
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 665
    const-string p2, "\u8bf7\u7a0d\u5019"

    .line 667
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 668
    const-string p3, "\u6b63\u5728\u52a0\u8f7d..."

    .line 670
    :cond_1
    invoke-static {p1, p2, p3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mProgressDialog:Landroid/app/ProgressDialog;

    .line 671
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity;->mProgressDialog:Landroid/app/ProgressDialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 672
    return-void
.end method
