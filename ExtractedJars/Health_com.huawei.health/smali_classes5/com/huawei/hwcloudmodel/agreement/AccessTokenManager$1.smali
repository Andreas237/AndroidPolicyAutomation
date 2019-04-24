.class Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->signIn(Landroid/content/Context;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

.field final synthetic val$client:Lcom/huawei/hms/api/HuaweiApiClient;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$mainHandler:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient;Landroid/os/Handler;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;->this$0:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iput-object p2, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;->val$client:Lcom/huawei/hms/api/HuaweiApiClient;

    iput-object p4, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;->val$mainHandler:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 95
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;->val$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;->val$client:Lcom/huawei/hms/api/HuaweiApiClient;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->access$000(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient;I)Ljava/lang/String;

    move-result-object v4

    .line 96
    const-string v0, "Login_AccessTokenManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "signIn.aToken = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "agreementservice"

    invoke-virtual {v0, v1}, Lo/cze;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 98
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;->val$mainHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 99
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 100
    const-string v0, "agrUrl"

    invoke-virtual {v7, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const-string v0, "token"

    invoke-virtual {v7, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    invoke-virtual {v6, v7}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 104
    const/16 v0, 0x2712

    iput v0, v6, Landroid/os/Message;->what:I

    .line 105
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;->val$mainHandler:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 106
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;->this$0:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager$1;->val$context:Landroid/content/Context;

    invoke-static {v0, v1, v4}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->access$100(Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;Landroid/content/Context;Ljava/lang/String;)V

    .line 107
    return-void
.end method
