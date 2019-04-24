.class public Lcom/tencent/open/TDialog;
.super Lcom/tencent/open/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/TDialog$1;,
        Lcom/tencent/open/TDialog$FbWebViewClient;,
        Lcom/tencent/open/TDialog$JsListener;,
        Lcom/tencent/open/TDialog$OnTimeListener;,
        Lcom/tencent/open/TDialog$THandler;
    }
.end annotation


# static fields
.field static final a:Landroid/widget/FrameLayout$LayoutParams;

.field static b:Landroid/widget/Toast;

.field private static d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/app/ProgressDialog;>;"
        }
    .end annotation
.end field


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/content/Context;>;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;

.field private f:Lcom/tencent/open/TDialog$OnTimeListener;

.field private g:Lcom/tencent/tauth/IUiListener;

.field private h:Landroid/widget/FrameLayout;

.field private i:Lcom/tencent/open/c/b;

.field private j:Landroid/os/Handler;

.field private k:Z

.field private l:Lcom/tencent/connect/auth/QQToken;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 46
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    sput-object v0, Lcom/tencent/open/TDialog;->a:Landroid/widget/FrameLayout$LayoutParams;

    .line 463
    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Lcom/tencent/connect/auth/QQToken;)V
    .locals 6

    .line 190
    const v0, 0x1030010

    invoke-direct {p0, p1, v0}, Lcom/tencent/open/b;-><init>(Landroid/content/Context;I)V

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TDialog;->k:Z

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/TDialog;->l:Lcom/tencent/connect/auth/QQToken;

    .line 191
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;

    .line 192
    iput-object p3, p0, Lcom/tencent/open/TDialog;->e:Ljava/lang/String;

    .line 193
    new-instance v0, Lcom/tencent/open/TDialog$OnTimeListener;

    invoke-virtual {p5}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/tencent/open/TDialog$OnTimeListener;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V

    iput-object v0, p0, Lcom/tencent/open/TDialog;->f:Lcom/tencent/open/TDialog$OnTimeListener;

    .line 194
    new-instance v0, Lcom/tencent/open/TDialog$THandler;

    iget-object v1, p0, Lcom/tencent/open/TDialog;->f:Lcom/tencent/open/TDialog$OnTimeListener;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/tencent/open/TDialog$THandler;-><init>(Lcom/tencent/open/TDialog;Lcom/tencent/open/TDialog$OnTimeListener;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/os/Handler;

    .line 195
    iput-object p4, p0, Lcom/tencent/open/TDialog;->g:Lcom/tencent/tauth/IUiListener;

    .line 196
    iput-object p5, p0, Lcom/tencent/open/TDialog;->l:Lcom/tencent/connect/auth/QQToken;

    .line 197
    return-void
.end method

.method static synthetic a(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 219
    new-instance v2, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 220
    const-string v0, "test"

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v3, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 225
    new-instance v0, Lcom/tencent/open/c/b;

    iget-object v1, p0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tencent/open/c/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    .line 226
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    invoke-virtual {v0, v3}, Lcom/tencent/open/c/b;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 228
    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/TDialog;->h:Landroid/widget/FrameLayout;

    .line 229
    const/16 v0, 0x11

    iput v0, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 230
    iget-object v0, p0, Lcom/tencent/open/TDialog;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 231
    iget-object v0, p0, Lcom/tencent/open/TDialog;->h:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 232
    iget-object v0, p0, Lcom/tencent/open/TDialog;->h:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lcom/tencent/open/TDialog;->setContentView(Landroid/view/View;)V

    .line 234
    return-void
.end method

.method static synthetic a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-static {p0, p1}, Lcom/tencent/open/TDialog;->c(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/tencent/open/TDialog;)Landroid/os/Handler;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/tencent/open/TDialog;->j:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 276
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setVerticalScrollBarEnabled(Z)V

    .line 277
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setHorizontalScrollBarEnabled(Z)V

    .line 278
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    new-instance v1, Lcom/tencent/open/TDialog$FbWebViewClient;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/tencent/open/TDialog$FbWebViewClient;-><init>(Lcom/tencent/open/TDialog;Lcom/tencent/open/TDialog$1;)V

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 279
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    iget-object v1, p0, Lcom/tencent/open/TDialog;->mChromeClient:Landroid/webkit/WebChromeClient;

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 280
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->clearFormData()V

    .line 283
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    .line 284
    if-nez v3, :cond_0

    .line 285
    return-void

    .line 287
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 288
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 290
    const/4 v0, -0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 293
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setNeedInitialFocus(Z)V

    .line 294
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 295
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 297
    sget-object v0, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V

    .line 298
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 300
    iget-object v0, p0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 301
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 302
    iget-object v0, p0, Lcom/tencent/open/TDialog;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "databases"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 305
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 307
    iget-object v0, p0, Lcom/tencent/open/TDialog;->jsBridge:Lcom/tencent/open/a;

    new-instance v1, Lcom/tencent/open/TDialog$JsListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/tencent/open/TDialog$JsListener;-><init>(Lcom/tencent/open/TDialog;Lcom/tencent/open/TDialog$1;)V

    const-string v2, "sdk_js_if"

    invoke-virtual {v0, v1, v2}, Lcom/tencent/open/a;->a(Lcom/tencent/open/a$b;Ljava/lang/String;)V

    .line 309
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    iget-object v1, p0, Lcom/tencent/open/TDialog;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->loadUrl(Ljava/lang/String;)V

    .line 310
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    sget-object v1, Lcom/tencent/open/TDialog;->a:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 311
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setVisibility(I)V

    .line 312
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 313
    return-void
.end method

.method static synthetic b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-static {p0, p1}, Lcom/tencent/open/TDialog;->d(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/tencent/open/TDialog;)Lcom/tencent/open/TDialog$OnTimeListener;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/tencent/open/TDialog;->f:Lcom/tencent/open/TDialog$OnTimeListener;

    return-object v0
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 468
    :try_start_0
    invoke-static {p1}, Lcom/tencent/open/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 469
    const-string v0, "type"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 471
    const-string v0, "msg"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 473
    if-nez v3, :cond_1

    .line 474
    sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    if-nez v0, :cond_0

    .line 475
    const/4 v0, 0x0

    invoke-static {p0, v4, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    goto :goto_0

    .line 478
    :cond_0
    sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    sget-object v1, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 479
    sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    invoke-virtual {v0, v4}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 480
    sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V

    .line 482
    :goto_0
    sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_2

    .line 483
    :cond_1
    const/4 v0, 0x1

    if-ne v3, v0, :cond_3

    .line 484
    sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    if-nez v0, :cond_2

    .line 485
    const/4 v0, 0x1

    invoke-static {p0, v4, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    goto :goto_1

    .line 488
    :cond_2
    sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    sget-object v1, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 489
    sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    invoke-virtual {v0, v4}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 490
    sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V

    .line 492
    :goto_1
    sget-object v0, Lcom/tencent/open/TDialog;->b:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 497
    :cond_3
    :goto_2
    goto :goto_3

    .line 494
    :catch_0
    move-exception v2

    .line 496
    invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V

    .line 498
    :goto_3
    return-void
.end method

.method static synthetic d(Lcom/tencent/open/TDialog;)Lcom/tencent/open/c/b;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    return-object v0
.end method

.method private static d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 502
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 503
    :cond_0
    return-void

    .line 505
    :cond_1
    :try_start_0
    invoke-static {p1}, Lcom/tencent/open/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 506
    const-string v0, "action"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 507
    const-string v0, "msg"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 508
    const/4 v0, 0x1

    if-ne v2, v0, :cond_4

    .line 509
    sget-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    .line 510
    :cond_2
    new-instance v4, Landroid/app/ProgressDialog;

    invoke-direct {v4, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 511
    invoke-virtual {v4, v3}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 512
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;

    .line 514
    invoke-virtual {v4}, Landroid/app/ProgressDialog;->show()V

    .line 515
    goto :goto_0

    .line 516
    :cond_3
    sget-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ProgressDialog;

    invoke-virtual {v0, v3}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 517
    sget-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_6

    .line 518
    sget-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    goto :goto_0

    .line 521
    :cond_4
    if-nez v2, :cond_6

    .line 522
    sget-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_5

    .line 523
    return-void

    .line 525
    :cond_5
    :try_start_1
    sget-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 527
    sget-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 528
    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/open/TDialog;->d:Ljava/lang/ref/WeakReference;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 535
    :cond_6
    :goto_0
    goto :goto_1

    .line 532
    :catch_0
    move-exception v1

    .line 534
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 536
    :goto_1
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/tencent/open/TDialog;->f:Lcom/tencent/open/TDialog$OnTimeListener;

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/tencent/open/TDialog;->f:Lcom/tencent/open/TDialog$OnTimeListener;

    invoke-virtual {v0}, Lcom/tencent/open/TDialog$OnTimeListener;->onCancel()V

    .line 215
    :cond_0
    invoke-super {p0}, Lcom/tencent/open/b;->onBackPressed()V

    .line 216
    return-void
.end method

.method protected onConsoleMessage(Ljava/lang/String;)V
    .locals 3

    .line 238
    const-string v0, "TDialog"

    const-string v1, "--onConsoleMessage--"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/TDialog;->jsBridge:Lcom/tencent/open/a;

    iget-object v1, p0, Lcom/tencent/open/TDialog;->i:Lcom/tencent/open/c/b;

    invoke-virtual {v0, v1, p1}, Lcom/tencent/open/a;->a(Landroid/webkit/WebView;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 243
    goto :goto_0

    .line 241
    :catch_0
    move-exception v2

    .line 244
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 201
    invoke-super {p0, p1}, Lcom/tencent/open/b;->onCreate(Landroid/os/Bundle;)V

    .line 202
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/tencent/open/TDialog;->requestWindowFeature(I)Z

    .line 206
    invoke-direct {p0}, Lcom/tencent/open/TDialog;->a()V

    .line 207
    invoke-direct {p0}, Lcom/tencent/open/TDialog;->b()V

    .line 208
    return-void
.end method
