.class final Lcom/huawei/hwCloudJs/service/hms/b$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/service/hms/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/hms/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/huawei/hwCloudJs/core/JsCallback;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/huawei/hwCloudJs/core/JsCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/b$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/hms/b$a;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwCloudJs/service/hms/a$b;)V
    .locals 8

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "resultCode"

    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/hms/a$b;->b()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "HmsCoreApiHelper"

    const-string v1, "JS getResultFromActivityResult put json error"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/hms/a$b;->a()Landroid/content/Intent;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/hms/f;->a(I)Lcom/huawei/hwCloudJs/service/hms/e;

    move-result-object v5

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$a;->a:Ljava/lang/String;

    invoke-virtual {v5, v0, v4, v6}, Lcom/huawei/hwCloudJs/service/hms/e;->a(Ljava/lang/String;Landroid/os/Bundle;Lorg/json/JSONObject;)V

    const-string v0, "result"

    :try_start_1
    invoke-virtual {v2, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v7

    const-string v0, "HmsCoreApiHelper"

    const-string v1, "JS InvokeResultCallback onResult JSONException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$a;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure()V

    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$a;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/core/JsCallback;->success(Ljava/lang/String;)V

    return-void
.end method
