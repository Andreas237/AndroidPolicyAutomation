.class Lcom/huawei/up/api/UpApi$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/up/api/UpApi;->getUserInfo(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/up/api/UpApi;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$handler:Lcom/huawei/cloudservice/CloudRequestHandler;


# direct methods
.method constructor <init>(Lcom/huawei/up/api/UpApi;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/content/Context;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/up/api/UpApi$2;->this$0:Lcom/huawei/up/api/UpApi;

    iput-object p2, p0, Lcom/huawei/up/api/UpApi$2;->val$handler:Lcom/huawei/cloudservice/CloudRequestHandler;

    iput-object p3, p0, Lcom/huawei/up/api/UpApi$2;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 125
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HuaweiLoginManager.getAccount()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HuaweiLoginManager.getAccount() is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 128
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfo by huawei sdk111"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const-string v2, "1000"

    iget-object v3, p0, Lcom/huawei/up/api/UpApi$2;->val$handler:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/cloudservice/CloudAccount;->getUserInfo(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    goto :goto_0

    .line 132
    :cond_0
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$2;->this$0:Lcom/huawei/up/api/UpApi;

    invoke-static {v0}, Lcom/huawei/up/api/UpApi;->access$000(Lcom/huawei/up/api/UpApi;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/up/api/UpApi$2;->val$context:Landroid/content/Context;

    new-instance v2, Lcom/huawei/up/api/UpApi$2$1;

    invoke-direct {v2, p0}, Lcom/huawei/up/api/UpApi$2$1;-><init>(Lcom/huawei/up/api/UpApi$2;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/LoginInit;->notAuthLogin(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 149
    :goto_0
    return-void
.end method
