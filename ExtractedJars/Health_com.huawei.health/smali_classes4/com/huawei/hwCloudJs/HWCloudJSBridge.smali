.class public Lcom/huawei/hwCloudJs/HWCloudJSBridge;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/support/b/b;
.implements Lcom/huawei/hwCloudJs/support/enables/INoProguard;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/hwCloudJs/support/b/b<Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;>;Lcom/huawei/hwCloudJs/support/enables/INoProguard;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "HWCloudJSBridge"


# instance fields
.field private b:Landroid/webkit/WebView;

.field private c:Ljava/lang/String;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->d:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->e:Ljava/util/HashMap;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/huawei/hwCloudJs/d/f;->a()I

    move-result v1

    int-to-long v1, v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/HWCloudJSBridge;)Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/HWCloudJSBridge;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V

    return-void
.end method

.method private a(Lcom/huawei/hwCloudJs/core/a/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS callNative begin"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/core/a/a;->a()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/core/a/a;->a()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/huawei/hwCloudJs/api/JsParam;

    if-ne v0, v1, :cond_0

    new-instance v3, Lcom/huawei/hwCloudJs/api/JsParam;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    invoke-direct {v3, p4, p5, v0}, Lcom/huawei/hwCloudJs/api/JsParam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/huawei/hwCloudJs/core/b;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/core/b;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/core/a/a;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lcom/huawei/hwCloudJs/core/b;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    instance-of v0, v3, Lcom/huawei/hwCloudJs/api/JsParam;

    if-eqz v0, :cond_1

    move-object v4, v3

    check-cast v4, Lcom/huawei/hwCloudJs/api/JsParam;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    invoke-static {v4, p4, p5, v0}, Lcom/huawei/hwCloudJs/c;->a(Lcom/huawei/hwCloudJs/api/JsParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hwCloudJs/api/JsParam;

    move-result-object v3

    :cond_1
    :goto_0
    new-instance v0, Lcom/huawei/hwCloudJs/core/JsCallback;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    iget-object v2, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    invoke-direct {v0, v1, p3, v2}, Lcom/huawei/hwCloudJs/core/JsCallback;-><init>(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hwCloudJs/core/a/a;->a(Ljava/lang/Object;Lcom/huawei/hwCloudJs/core/JsCallback;)V

    return-void
.end method

.method private a(Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;Ljava/lang/String;)V
    .locals 6

    invoke-direct {p0, p2}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "HWCloudJSBridge"

    const-string v1, "url white contains!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    invoke-static {v0, p1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->d:Ljava/util/List;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;->getPermission()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, p2, v0}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    invoke-static {v0, p1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    goto :goto_0

    :cond_2
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    :cond_3
    :goto_1
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwCloudJs/core/a/a;)V
    .locals 7

    invoke-direct {p0, p4}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS url white contains!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v0, p0

    move-object v1, p5

    move-object v2, p2

    move-object v3, p3

    move-object v4, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Lcom/huawei/hwCloudJs/core/a/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p5}, Lcom/huawei/hwCloudJs/d/c;->a(Lcom/huawei/hwCloudJs/core/a/a;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS method Is not Open!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    const/16 v2, 0xc

    invoke-static {v0, p3, v2, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    return-void

    :cond_1
    invoke-static {p5}, Lcom/huawei/hwCloudJs/d/c;->c(Lcom/huawei/hwCloudJs/core/a/a;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, p1, p4, v6}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS checkAuth OK"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-object v0, p0

    move-object v1, p5

    move-object v2, p2

    move-object v3, p3

    move-object v4, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Lcom/huawei/hwCloudJs/core/a/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS checkAuth fail!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    const/16 v2, 0xa

    invoke-static {v0, p3, v2, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Lorg/json/JSONObject;)V"
        }
    .end annotation

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS configAuth"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;-><init>(Lcom/huawei/hwCloudJs/HWCloudJSBridge;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V

    move-object v6, v0

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/huawei/hwCloudJs/service/a/b;->a()Lcom/huawei/hwCloudJs/service/a/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v7, v6}, Lcom/huawei/hwCloudJs/service/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/b$a;)V

    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 4

    invoke-static {p1}, Lcom/huawei/hwCloudJs/c;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    const-string v0, "eventName"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->e:Ljava/util/HashMap;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x40

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    const/16 v1, 0x32

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->e:Ljava/util/HashMap;

    const-string v1, ""

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {}, Lcom/huawei/hwCloudJs/service/a/b;->a()Lcom/huawei/hwCloudJs/service/a/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v1}, Lcom/huawei/hwCloudJs/service/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Lorg/json/JSONObject;)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hwCloudJs/core/d;->a()Lcom/huawei/hwCloudJs/core/d;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    iget-object v4, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/hwCloudJs/core/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V

    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 1

    invoke-static {}, Lcom/huawei/hwCloudJs/service/a/b;->a()Lcom/huawei/hwCloudJs/service/a/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwCloudJs/service/a/b;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public attach(Landroid/webkit/WebView;)V
    .locals 2

    iput-object p1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    const-string v0, "hbssdk"

    invoke-virtual {p1, p0, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hwCloudJs/service/jsmsg/a;->a()Lcom/huawei/hwCloudJs/service/jsmsg/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwCloudJs/service/jsmsg/a;->a(Lcom/huawei/hwCloudJs/support/b/b;)V

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS attach"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public config(Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS config"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Lcom/huawei/hwCloudJs/c;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS callJson == null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    const/16 v1, 0xd

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;I)V

    return-void

    :cond_0
    const-string v0, "appId"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS appId isEmpty"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    const/16 v1, 0xd

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;I)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/d/a;->a(Landroid/webkit/WebView;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS webViewUrl isEmpty"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    const/16 v1, 0x270f

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;I)V

    return-void

    :cond_2
    const-string v0, "needConfig"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwCloudJs/d/b;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v5

    invoke-direct {p0, v3, v4, v5, v2}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V

    iget-object v6, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->d:Ljava/util/List;

    monitor-enter v6

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->d:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    :goto_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    const-string v0, "config"

    invoke-static {v6, v3, v4, v0}, Lcom/huawei/hwCloudJs/service/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public detach()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    const-string v1, "hbssdk"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/b/a;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/huawei/hwCloudJs/service/jsmsg/a;->a()Lcom/huawei/hwCloudJs/service/jsmsg/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwCloudJs/service/jsmsg/a;->b(Lcom/huawei/hwCloudJs/support/b/b;)V

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS detach"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public getBridgeId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    return-object v0
.end method

.method public invoke(Ljava/lang/String;)V
    .locals 15
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS invoke"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static/range {p1 .. p1}, Lcom/huawei/hwCloudJs/c;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-nez v6, :cond_0

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS invoke callJson null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    const/16 v1, 0xd

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;I)V

    return-void

    :cond_0
    const-string v0, "_appId"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "_method"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "_args"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "_index"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/d/a;->a(Landroid/webkit/WebView;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS invoke webViewUrl null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    const/16 v2, 0x270f

    invoke-static {v0, v10, v2, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    return-void

    :cond_1
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v11}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS invoke JS_RET_CODE_METHOD_NOT_AUTH"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    const/16 v2, 0xa

    invoke-static {v0, v10, v2, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    return-void

    :cond_2
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS invoke method isEmpty"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    const/16 v2, 0xd

    invoke-static {v0, v10, v2, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    return-void

    :cond_3
    const-string v0, "listenEvent"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS invoke method listenEvent"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, v9}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS invoke method listenEvent error"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    const/16 v2, 0xd

    invoke-static {v0, v10, v2, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    :cond_4
    return-void

    :cond_5
    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v12

    const-string v0, "hmsInvoke"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {v12, v7, v11, v8}, Lcom/huawei/hwCloudJs/service/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    invoke-static {v9}, Lcom/huawei/hwCloudJs/c;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v13

    const/4 v0, 0x0

    if-eq v0, v13, :cond_7

    const-string v0, "URI"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v7, v11, v14}, Lcom/huawei/hwCloudJs/service/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    :goto_0
    invoke-static {}, Lcom/huawei/hwCloudJs/core/a/b;->a()Lcom/huawei/hwCloudJs/core/a/b;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/huawei/hwCloudJs/core/a/b;->b(Ljava/lang/String;)Lcom/huawei/hwCloudJs/core/a/a;

    move-result-object v13

    if-nez v13, :cond_8

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS invoke method cannot get!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    const/16 v2, 0xc

    invoke-static {v0, v10, v2, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;Ljava/lang/String;ILjava/lang/String;)V

    return-void

    :cond_8
    move-object v0, p0

    move-object v1, v7

    move-object v2, v9

    move-object v3, v10

    move-object v4, v11

    move-object v5, v13

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwCloudJs/core/a/a;)V

    return-void
.end method

.method public onReceive(Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)Z
    .locals 6

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->b:Landroid/webkit/WebView;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/d/a;->a(Landroid/webkit/WebView;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v0, "channelMessage"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    instance-of v0, p1, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$ChannelMessageReq;

    if-eqz v0, :cond_4

    move-object v4, p1

    check-cast v4, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$ChannelMessageReq;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChannelMessageEvent_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$ChannelMessageReq;->getChannelName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->e:Ljava/util/HashMap;

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    invoke-direct {p0, v4, v2}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->e:Ljava/util/HashMap;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x1

    return v0

    :cond_5
    invoke-direct {p0, p1, v2}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic onReceive(Lcom/huawei/hwCloudJs/support/b/d;)Z
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->onReceive(Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)Z

    move-result v0

    return v0
.end method

.method public setBridgeId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->c:Ljava/lang/String;

    return-void
.end method
