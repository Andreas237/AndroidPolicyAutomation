.class final Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/service/hms/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/huawei/hwCloudJs/core/JsCallback;

.field private b:Z


# direct methods
.method public constructor <init>(Lcom/huawei/hwCloudJs/core/JsCallback;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$a;->a:Lcom/huawei/hwCloudJs/core/JsCallback;

    iput-boolean p2, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$a;->b:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwCloudJs/service/hms/a$b;)V
    .locals 5

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/hms/a$b;->a()Landroid/content/Intent;

    move-result-object v3

    if-eqz v3, :cond_2

    sget-object v0, Lcom/huawei/hms/support/api/hwid/HuaweiId;->HuaweiIdApi:Lcom/huawei/hms/support/api/hwid/HuaweiIdApi;

    invoke-interface {v0, v3}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApi;->getSignInResultFromIntent(Landroid/content/Intent;)Lcom/huawei/hms/support/api/hwid/SignInResult;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/hms/support/api/hwid/SignInResult;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "HmsCoreApi"

    const-string v1, "JS signIn onResult isSuccess"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$a;->a:Lcom/huawei/hwCloudJs/core/JsCallback;

    iget-boolean v1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$a;->b:Z

    invoke-static {v4, v1}, Lcom/huawei/hwCloudJs/service/hms/b;->a(Lcom/huawei/hms/support/api/hwid/SignInResult;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/core/JsCallback;->success(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "HmsCoreApi"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JS signIn onResult"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$a;->a:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-virtual {v4}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(I)V

    goto :goto_0

    :cond_1
    const-string v0, "HmsCoreApi"

    const-string v1, "JS signIn onResult signInResult is null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$a;->a:Lcom/huawei/hwCloudJs/core/JsCallback;

    const-string v1, "signInResult is null"

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(Ljava/lang/String;)V

    :goto_0
    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/hms/a$b;->b()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    const-string v0, "HmsCoreApi"

    const-string v1, "JS signIn onResult JS_RET_CODE_USER_DENAL"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$a;->a:Lcom/huawei/hwCloudJs/core/JsCallback;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(I)V

    goto :goto_1

    :cond_3
    const-string v0, "HmsCoreApi"

    const-string v1, "JS signIn onResult hms not ret data"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$a;->a:Lcom/huawei/hwCloudJs/core/JsCallback;

    const-string v1, "hms not ret data"

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(Ljava/lang/String;)V

    :goto_1
    return-void
.end method
