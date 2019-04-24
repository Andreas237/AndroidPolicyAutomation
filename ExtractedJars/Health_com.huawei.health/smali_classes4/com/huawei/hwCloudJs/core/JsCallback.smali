.class public Lcom/huawei/hwCloudJs/core/JsCallback;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/support/enables/INoProguard;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/core/JsCallback$a;
    }
.end annotation


# static fields
.field private static final a:I = 0x0

.field private static final b:I = 0x270f

.field private static final c:Ljava/lang/String; = "JsCallback"

.field private static final d:Ljava/lang/String; = "javascript:%s.callback(%s,%s,%d);"


# instance fields
.field private final e:Ljava/lang/String;

.field private f:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/webkit/WebView;>;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/huawei/hwCloudJs/core/JsCallback;->g:Ljava/lang/String;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/JsCallback;->f:Ljava/lang/ref/WeakReference;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/JsCallback;->e:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/core/JsCallback;->h:Ljava/lang/String;

    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p1
.end method

.method private a(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/huawei/hwCloudJs/core/JsCallback$a;

    invoke-direct {v0, p1, p2}, Lcom/huawei/hwCloudJs/core/JsCallback$a;-><init>(Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 6

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/core/JsCallback;->getWebView()Landroid/webkit/WebView;

    move-result-object v4

    if-nez v4, :cond_0

    return-void

    :cond_0
    const-string v0, "javascript:%s.callback(%s,%s,%d);"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hbs"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwCloudJs/core/JsCallback;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v4, v5}, Lcom/huawei/hwCloudJs/core/JsCallback;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final failure()V
    .locals 1

    const/16 v0, 0x270f

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(I)V

    return-void
.end method

.method public final failure(I)V
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, p1, v0}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(ILjava/lang/String;)V

    return-void
.end method

.method public final failure(ILjava/lang/String;)V
    .locals 4

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "code"

    :try_start_0
    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "message"

    invoke-virtual {v2, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "JsCallback"

    const-string v1, "failure put json error"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwCloudJs/core/JsCallback;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, p1}, Lcom/huawei/hwCloudJs/core/JsCallback;->a(Ljava/lang/String;I)V

    return-void
.end method

.method public final failure(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x270f

    invoke-virtual {p0, v0, p1}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(ILjava/lang/String;)V

    return-void
.end method

.method public getWebView()Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/JsCallback;->f:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    return-object v0
.end method

.method public getwebviewId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/JsCallback;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final success()V
    .locals 1

    const-string v0, "{}"

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/core/JsCallback;->success(Ljava/lang/String;)V

    return-void
.end method

.method public final success(Ljava/lang/Object;)V
    .locals 2

    new-instance v0, Lcom/huawei/hwCloudJs/core/b;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/core/b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/huawei/hwCloudJs/core/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/hwCloudJs/core/JsCallback;->a(Ljava/lang/String;I)V

    return-void
.end method

.method public final success(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/huawei/hwCloudJs/core/JsCallback;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/hwCloudJs/core/JsCallback;->a(Ljava/lang/String;I)V

    return-void
.end method
