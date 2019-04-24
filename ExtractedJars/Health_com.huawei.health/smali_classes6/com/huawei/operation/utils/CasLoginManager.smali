.class public Lcom/huawei/operation/utils/CasLoginManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;,
        Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;,
        Lcom/huawei/operation/utils/CasLoginManager$InJavaScriptLocalObj;
    }
.end annotation


# static fields
.field public static final LOCAL_TO_CART:I = 0xb

.field private static final OPERATION_VMALL_CONSTAINTS_EUID:Ljava/lang/String; = "OPERATION_VMALL_CONSTAINTS_EUID"

.field private static final OPERATION_VMALL_CONSTAINTS_UKMC:Ljava/lang/String; = "OPERATION_VMALL_CONSTAINTS_UKMC"

.field private static final TAG:Ljava/lang/String; = "CasLoginManager"

.field private static final TIME_LOGIN_INTERVAL:I = 0xbb8

.field private static final TIME_REMOTE_LOGIN_INTERVAL:I = 0x3e8

.field private static casLoginManager:Lcom/huawei/operation/utils/CasLoginManager; = null

.field private static final lockObject:Ljava/lang/Object;


# instance fields
.field private callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private lastLoginChangedTime:J

.field private lastStRemoteLoginTime:J

.field private loginWebviewClient:Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;

.field private mHandler:Landroid/os/Handler;

.field private mLoginWebview:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/operation/utils/CasLoginManager;->lockObject:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->lastLoginChangedTime:J

    .line 40
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->lastStRemoteLoginTime:J

    .line 53
    return-void
.end method

.method static synthetic access$100(Lcom/huawei/operation/utils/CasLoginManager;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/operation/utils/CasLoginManager;)Landroid/os/Handler;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/operation/utils/CasLoginManager;)J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->lastStRemoteLoginTime:J

    return-wide v0
.end method

.method static synthetic access$302(Lcom/huawei/operation/utils/CasLoginManager;J)J
    .locals 0

    .line 28
    iput-wide p1, p0, Lcom/huawei/operation/utils/CasLoginManager;->lastStRemoteLoginTime:J

    return-wide p1
.end method

.method static synthetic access$400(Lcom/huawei/operation/utils/CasLoginManager;)Landroid/webkit/WebView;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    return-object v0
.end method

.method public static getInstance()Lcom/huawei/operation/utils/CasLoginManager;
    .locals 3

    .line 43
    sget-object v1, Lcom/huawei/operation/utils/CasLoginManager;->lockObject:Ljava/lang/Object;

    monitor-enter v1

    .line 44
    :try_start_0
    sget-object v0, Lcom/huawei/operation/utils/CasLoginManager;->casLoginManager:Lcom/huawei/operation/utils/CasLoginManager;

    if-nez v0, :cond_0

    .line 45
    new-instance v0, Lcom/huawei/operation/utils/CasLoginManager;

    invoke-direct {v0}, Lcom/huawei/operation/utils/CasLoginManager;-><init>()V

    sput-object v0, Lcom/huawei/operation/utils/CasLoginManager;->casLoginManager:Lcom/huawei/operation/utils/CasLoginManager;

    .line 47
    :cond_0
    sget-object v0, Lcom/huawei/operation/utils/CasLoginManager;->casLoginManager:Lcom/huawei/operation/utils/CasLoginManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 48
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private initWebview()V
    .locals 4

    .line 56
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 57
    return-void

    .line 60
    :cond_0
    new-instance v0, Landroid/webkit/WebView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    .line 61
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    .line 63
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    const-string v1, "searchBoxJavaBridge_"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    const-string v1, "accessibilityTraversal"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 66
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 68
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/operation/utils/CasLoginManager$InJavaScriptLocalObj;

    invoke-direct {v1, p0}, Lcom/huawei/operation/utils/CasLoginManager$InJavaScriptLocalObj;-><init>(Lcom/huawei/operation/utils/CasLoginManager;)V

    const-string v2, "java_obj"

    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 71
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V

    .line 72
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 73
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 74
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    .line 75
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 76
    sget-object v0, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V

    .line 77
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 78
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 79
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 80
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    .line 81
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setBlockNetworkImage(Z)V

    .line 83
    new-instance v0, Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;-><init>(Lcom/huawei/operation/utils/CasLoginManager;Lcom/huawei/operation/utils/CasLoginManager$1;)V

    iput-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->loginWebviewClient:Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;

    .line 84
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/operation/utils/CasLoginManager;->loginWebviewClient:Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 85
    return-void
.end method

.method private startLogin()V
    .locals 5

    .line 201
    invoke-direct {p0}, Lcom/huawei/operation/utils/CasLoginManager;->initWebview()V

    .line 203
    const-string v0, "CasLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startLogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    :try_start_0
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    const-string v1, "https://openapi.test.vmall.com/"

    invoke-static {v1}, Lcom/huawei/operation/utils/CasLoginUtil;->getCasLoginUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 212
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    const-string v1, "https://openapi.vmall.com/"

    invoke-static {v1}, Lcom/huawei/operation/utils/CasLoginUtil;->getCasLoginUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    :goto_0
    goto :goto_1

    .line 214
    :catch_0
    move-exception v4

    .line 215
    const-string v0, "CasLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UnsupportedEncodingException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    :goto_1
    return-void
.end method

.method private startLoginWithHandler(Landroid/os/Handler;)V
    .locals 5

    .line 220
    invoke-direct {p0}, Lcom/huawei/operation/utils/CasLoginManager;->initWebview()V

    .line 222
    iput-object p1, p0, Lcom/huawei/operation/utils/CasLoginManager;->mHandler:Landroid/os/Handler;

    .line 225
    :try_start_0
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    const-string v1, "https://openapi.vmall.com/"

    invoke-static {v1}, Lcom/huawei/operation/utils/CasLoginUtil;->getCasLoginUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 228
    goto :goto_0

    .line 226
    :catch_0
    move-exception v4

    .line 227
    const-string v0, "CasLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UnsupportedEncodingException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    :goto_0
    return-void
.end method

.method private startLogout()V
    .locals 2

    .line 232
    invoke-direct {p0}, Lcom/huawei/operation/utils/CasLoginManager;->initWebview()V

    .line 234
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    const-string v1, "https://m.vmall.com/account/logout?url=/personal"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 235
    return-void
.end method


# virtual methods
.method public getLoginIntervalRule()Z
    .locals 4

    .line 344
    const-string v0, "CasLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLoginIntervalRule, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/operation/utils/CasLoginManager;->lastLoginChangedTime:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 346
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->lastLoginChangedTime:J

    .line 347
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "test"

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 348
    const/4 v0, 0x1

    return v0

    .line 350
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->lastLoginChangedTime:J

    .line 351
    const/4 v0, 0x0

    return v0
.end method

.method public release()V
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    .line 239
    invoke-direct {p0}, Lcom/huawei/operation/utils/CasLoginManager;->startLogout()V

    .line 240
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->loginWebviewClient:Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;

    if-eqz v0, :cond_0

    .line 241
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->loginWebviewClient:Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;

    .line 243
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->removeAllViews()V

    .line 244
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 245
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->mLoginWebview:Landroid/webkit/WebView;

    .line 248
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 249
    return-void
.end method

.method public syncLoginState(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 189
    invoke-direct {p0}, Lcom/huawei/operation/utils/CasLoginManager;->initWebview()V

    .line 191
    iput-object p1, p0, Lcom/huawei/operation/utils/CasLoginManager;->callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 192
    invoke-direct {p0}, Lcom/huawei/operation/utils/CasLoginManager;->startLogin()V

    .line 198
    return-void
.end method
