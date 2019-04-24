.class Lcom/huawei/login/huaweilogin/HuaweiLoginManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/CloudRequestHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->login()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;


# direct methods
.method constructor <init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$1;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 4

    .line 133
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "login() initial onError, ErrorCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", ErrorReason: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorReason()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "login() initial onError, ErrorCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$1;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$000(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;I)V

    .line 136
    return-void
.end method

.method public onFinish(Landroid/os/Bundle;)V
    .locals 5

    .line 116
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 117
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() onFinish bundle is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$1;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    const/16 v1, -0x64

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$000(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;I)V

    .line 119
    return-void

    .line 121
    :cond_0
    const-string v0, "versionName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 122
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() initial onFinish,version:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$1;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$100(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 125
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$1;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$200(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_0

    .line 127
    :cond_1
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$1;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$200(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 129
    :goto_0
    return-void
.end method
