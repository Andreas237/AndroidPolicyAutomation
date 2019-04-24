.class Lcom/huawei/up/api/UpApi$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dcx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/up/api/UpApi;->getUserInfoByUP(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/up/api/UpApi;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$handler:Lcom/huawei/cloudservice/CloudRequestHandler;

.field final synthetic val$loginManager:Lcom/huawei/login/ui/login/LoginInit;


# direct methods
.method constructor <init>(Lcom/huawei/up/api/UpApi;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/content/Context;Lcom/huawei/login/ui/login/LoginInit;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/huawei/up/api/UpApi$3;->this$0:Lcom/huawei/up/api/UpApi;

    iput-object p2, p0, Lcom/huawei/up/api/UpApi$3;->val$handler:Lcom/huawei/cloudservice/CloudRequestHandler;

    iput-object p3, p0, Lcom/huawei/up/api/UpApi$3;->val$context:Landroid/content/Context;

    iput-object p4, p0, Lcom/huawei/up/api/UpApi$3;->val$loginManager:Lcom/huawei/login/ui/login/LoginInit;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProcessed(Lo/ddb;)V
    .locals 6

    .line 164
    invoke-virtual {p1}, Lo/ddb;->d()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$3;->val$handler:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-virtual {p1}, Lo/ddb;->d()I

    move-result v2

    const-string v3, "unknown error"

    invoke-direct {v1, v2, v3}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 166
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserInfo failure, errcode is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/ddb;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfo failure, errcode is error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    return-void

    .line 170
    :cond_0
    invoke-virtual {p1}, Lo/ddb;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 171
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$3;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getSessionID()Ljava/lang/String;

    move-result-object v5

    .line 172
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$3;->this$0:Lcom/huawei/up/api/UpApi;

    iget-object v1, p0, Lcom/huawei/up/api/UpApi$3;->val$loginManager:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/up/api/UpApi$3$1;

    invoke-direct {v2, p0}, Lcom/huawei/up/api/UpApi$3$1;-><init>(Lcom/huawei/up/api/UpApi$3;)V

    invoke-static {v0, v1, v4, v5, v2}, Lcom/huawei/up/api/UpApi;->access$200(Lcom/huawei/up/api/UpApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V

    .line 194
    return-void
.end method
