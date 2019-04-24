.class final Lcom/huawei/hwCloudJs/service/hms/b$d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hms/support/api/client/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/hms/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/hms/support/api/client/ResultCallback<Lcom/huawei/hms/support/api/client/BundleResult;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/hms/api/HuaweiApiClient;>;"
        }
    .end annotation
.end field

.field private b:Lcom/huawei/hwCloudJs/core/JsCallback;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Lcom/huawei/hwCloudJs/core/JsCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/ref/WeakReference<Lcom/huawei/hms/api/HuaweiApiClient;>;Lcom/huawei/hwCloudJs/core/JsCallback;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/b$d;->a:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/hms/b$d;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/client/BundleResult;)V
    .locals 6

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hms/api/HuaweiApiClient;

    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$d;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure()V

    return-void

    :cond_0
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "statusCode"

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/client/BundleResult;->getResultCode()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/client/BundleResult;->getRspBody()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/hms/f;->a(I)Lcom/huawei/hwCloudJs/service/hms/e;

    move-result-object v5

    invoke-virtual {v2}, Lcom/huawei/hms/api/HuaweiApiClient;->getAppID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/client/BundleResult;->getRspBody()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v5, v0, v1, v4}, Lcom/huawei/hwCloudJs/service/hms/e;->a(Ljava/lang/String;Landroid/os/Bundle;Lorg/json/JSONObject;)V

    const-string v0, "result"

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$d;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/core/JsCallback;->success(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "HmsCoreApiHelper"

    const-string v1, "InvokeResultCallback JSONException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$d;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure()V

    :goto_0
    return-void
.end method

.method public synthetic onResult(Ljava/lang/Object;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/client/BundleResult;

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/service/hms/b$d;->a(Lcom/huawei/hms/support/api/client/BundleResult;)V

    return-void
.end method
