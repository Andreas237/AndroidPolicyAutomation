.class public Lcom/huawei/hwCloudJs/JsClientApi;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;,
        Lcom/huawei/hwCloudJs/JsClientApi$Permission;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwCloudJs/HWCloudJSBridge;>;"
        }
    .end annotation
.end field

.field private static b:Ljava/lang/Class;

.field private static c:Ljava/lang/Class;

.field private static d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Class;>;"
        }
    .end annotation
.end field

.field private static e:Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

.field private static f:Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;

.field private static g:Ljava/lang/String;

.field private static h:Z

.field private static i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/hwCloudJs/JsClientApi;->a:Ljava/util/Map;

    const-class v0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/JsClientApi;->registerJsApi(Ljava/lang/Class;)V

    const-class v0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/JsClientApi;->registerJsApi(Ljava/lang/Class;)V

    const-class v0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/JsClientApi;->registerExtKit(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static clearUserPermissionSet()V
    .locals 1

    invoke-static {}, Lcom/huawei/hwCloudJs/service/locationapi/a/a;->a()Lcom/huawei/hwCloudJs/service/locationapi/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/service/locationapi/a/a;->b()V

    return-void
.end method

.method public static createApi(Landroid/webkit/WebView;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwCloudJs/b/a;->a(Landroid/content/Context;)V

    new-instance v1, Lcom/huawei/hwCloudJs/HWCloudJSBridge;

    invoke-direct {v1}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;-><init>()V

    invoke-virtual {v1, p0}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->attach(Landroid/webkit/WebView;)V

    invoke-virtual {v1}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->getBridgeId()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/huawei/hwCloudJs/JsClientApi;->a:Ljava/util/Map;

    monitor-enter v3

    :try_start_0
    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi;->a:Ljava/util/Map;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    :goto_0
    return-object v2
.end method

.method public static createApi(Landroid/webkit/WebView;Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->a(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;)Z

    move-result v0

    invoke-static {p1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->b(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->ordinal()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/b/a;->a(ZI)V

    :cond_0
    invoke-static {p0}, Lcom/huawei/hwCloudJs/JsClientApi;->createApi(Landroid/webkit/WebView;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static destroyApi(Ljava/lang/String;)V
    .locals 4

    sget-object v1, Lcom/huawei/hwCloudJs/JsClientApi;->a:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwCloudJs/HWCloudJSBridge;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->detach()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    invoke-static {}, Lcom/huawei/hwCloudJs/core/d;->a()Lcom/huawei/hwCloudJs/core/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwCloudJs/core/d;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static finishAllwebview()V
    .locals 3

    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->d()Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.jssdk.finishAll"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->d()Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    :cond_0
    return-void
.end method

.method public static getjsActionbarClass()Ljava/lang/Class;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public static getjsInterfacemap()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Class;>;"
        }
    .end annotation

    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method public static getjsWebviewClass()Ljava/lang/Class;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public static handleActivityPermissionResult(I[Ljava/lang/String;[I)V
    .locals 2

    new-instance v1, Lcom/huawei/hwCloudJs/service/locationapi/a$a;

    invoke-direct {v1}, Lcom/huawei/hwCloudJs/service/locationapi/a$a;-><init>()V

    invoke-virtual {v1, p0}, Lcom/huawei/hwCloudJs/service/locationapi/a$a;->a(I)V

    invoke-virtual {v1, p2}, Lcom/huawei/hwCloudJs/service/locationapi/a$a;->a([I)V

    invoke-static {}, Lcom/huawei/hwCloudJs/service/locationapi/a;->a()Lcom/huawei/hwCloudJs/service/locationapi/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/service/locationapi/a;->a(Lcom/huawei/hwCloudJs/support/b/d;)V

    return-void
.end method

.method public static handleActivityResult(IILandroid/content/Intent;)V
    .locals 2

    new-instance v1, Lcom/huawei/hwCloudJs/service/hms/a$b;

    invoke-direct {v1}, Lcom/huawei/hwCloudJs/service/hms/a$b;-><init>()V

    invoke-virtual {v1, p2}, Lcom/huawei/hwCloudJs/service/hms/a$b;->a(Landroid/content/Intent;)V

    invoke-virtual {v1, p0}, Lcom/huawei/hwCloudJs/service/hms/a$b;->b(I)V

    invoke-virtual {v1, p1}, Lcom/huawei/hwCloudJs/service/hms/a$b;->a(I)V

    invoke-static {}, Lcom/huawei/hwCloudJs/service/hms/a;->a()Lcom/huawei/hwCloudJs/service/hms/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/service/hms/a;->a(Lcom/huawei/hwCloudJs/support/b/d;)V

    return-void
.end method

.method public static isUrlWhileList(Ljava/lang/String;)Z
    .locals 1

    invoke-static {}, Lcom/huawei/hwCloudJs/service/a/b;->a()Lcom/huawei/hwCloudJs/service/a/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwCloudJs/service/a/b;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isneedoriginalUserAgent()Z
    .locals 1

    sget-boolean v0, Lcom/huawei/hwCloudJs/JsClientApi;->h:Z

    return v0
.end method

.method public static navigateTo(Landroid/content/Context;Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$UrlDescription;)V
    .locals 5

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    :cond_0
    const-string v0, "JsClientApi"

    const-string v1, "navigateTo  null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$UrlDescription;->getToUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$UrlDescription;->getTitle()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "url"

    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "urlTitle"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_2
    invoke-virtual {p0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static notifyNativeMsg(Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/huawei/hwCloudJs/service/jsmsg/a;->a()Lcom/huawei/hwCloudJs/service/jsmsg/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwCloudJs/service/jsmsg/a;->a(Lcom/huawei/hwCloudJs/support/b/d;)V

    :cond_0
    return-void
.end method

.method public static notifyNativeMsgToBridge(Ljava/lang/String;Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)V
    .locals 4

    if-eqz p1, :cond_1

    sget-object v1, Lcom/huawei/hwCloudJs/JsClientApi;->a:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwCloudJs/HWCloudJSBridge;

    if-eqz v2, :cond_0

    invoke-virtual {v2, p1}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->onReceive(Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :cond_1
    :goto_0
    return-void
.end method

.method public static preload([Ljava/lang/String;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/huawei/hwCloudJs/support/a/c;->a([Ljava/lang/String;I)V

    return-void
.end method

.method public static registerActionbarClass(Ljava/lang/Class;)V
    .locals 0

    sput-object p0, Lcom/huawei/hwCloudJs/JsClientApi;->b:Ljava/lang/Class;

    return-void
.end method

.method public static registerExtKit(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hwCloudJs/api/ILocDialog;>;)V"
        }
    .end annotation

    const-string v0, "loc_dlg"

    invoke-static {v0, p0}, Lcom/huawei/hwCloudJs/core/extKit/a;->a(Ljava/lang/String;Ljava/lang/Class;)V

    return-void
.end method

.method public static registerJsApi(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hwCloudJs/core/JSRequest;>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hwCloudJs/core/a/b;->a()Lcom/huawei/hwCloudJs/core/a/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwCloudJs/core/a/b;->a(Ljava/lang/Class;)V

    const-class v0, Lcom/huawei/hwCloudJs/core/c;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hwCloudJs/core/d;->a()Lcom/huawei/hwCloudJs/core/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwCloudJs/core/d;->a(Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method public static registerUrlWhiteList(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hwCloudJs/service/a/b;->a()Lcom/huawei/hwCloudJs/service/a/b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/hwCloudJs/service/a/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static registerWebSettingsMixmode(I)V
    .locals 0

    sput p0, Lcom/huawei/hwCloudJs/JsClientApi;->i:I

    return-void
.end method

.method public static registerWebviewClass(Ljava/lang/Class;)V
    .locals 0

    sput-object p0, Lcom/huawei/hwCloudJs/JsClientApi;->c:Ljava/lang/Class;

    return-void
.end method

.method public static registerWebviewFileChooserListenner(Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;)V
    .locals 0

    sput-object p0, Lcom/huawei/hwCloudJs/JsClientApi;->e:Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    return-void
.end method

.method public static registerjsInterface(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Class;>;)V"
        }
    .end annotation

    sput-object p0, Lcom/huawei/hwCloudJs/JsClientApi;->d:Ljava/util/HashMap;

    return-void
.end method

.method public static registerwebViewDownLoadListener(Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;)V
    .locals 0

    sput-object p0, Lcom/huawei/hwCloudJs/JsClientApi;->f:Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;

    return-void
.end method

.method public static registerwebViewUserAgentString(Ljava/lang/String;Z)V
    .locals 0

    sput-object p0, Lcom/huawei/hwCloudJs/JsClientApi;->g:Ljava/lang/String;

    sput-boolean p1, Lcom/huawei/hwCloudJs/JsClientApi;->h:Z

    return-void
.end method

.method public static setJSOption(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;)V
    .locals 2

    if-eqz p0, :cond_0

    invoke-static {p0}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->a(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;)Z

    move-result v0

    invoke-static {p0}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->b(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->ordinal()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/b/a;->a(ZI)V

    :cond_0
    return-void
.end method

.method public static setMaxCacheSize(J)V
    .locals 1

    invoke-static {}, Lcom/huawei/hwCloudJs/support/a/b;->a()Lcom/huawei/hwCloudJs/support/a/b;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/huawei/hwCloudJs/support/a/b;->a(J)V

    return-void
.end method

.method public static setUrlToWebView(Lcom/huawei/hwCloudJs/service/debugtool/SetUrl$GetUrlCallBack;)V
    .locals 1

    invoke-static {}, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->a()Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->a(Lcom/huawei/hwCloudJs/service/debugtool/SetUrl$GetUrlCallBack;)V

    return-void
.end method

.method public static unRegisterJsApi(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/huawei/hwCloudJs/core/a/b;->a()Lcom/huawei/hwCloudJs/core/a/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwCloudJs/core/a/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static webSettingsMixmode()I
    .locals 1

    sget v0, Lcom/huawei/hwCloudJs/JsClientApi;->i:I

    return v0
.end method

.method public static webViewDownLoadListener()Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi;->f:Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;

    return-object v0
.end method

.method public static webViewUserAgentString()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi;->g:Ljava/lang/String;

    return-object v0
.end method

.method public static webviewFileChooserListenner()Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi;->e:Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    return-object v0
.end method
