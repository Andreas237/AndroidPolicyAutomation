.class Lcom/huawei/hms/support/api/hwid/c;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/hwid/SignInResult;Lcom/huawei/hms/support/api/entity/hwid/SignInResp;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;


# direct methods
.method constructor <init>(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/huawei/hms/support/api/hwid/c;->a:Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;

    invoke-direct {p0, p2, p3, p4}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/entity/hwid/SignInResp;)Lcom/huawei/hms/support/api/hwid/SignInResult;
    .locals 4

    .line 140
    const-string v0, "HuaweiIdApiImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "signInBackend onComplete:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/hwid/SignInResp;->getRetCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/hwid/SignInResp;->getData()Landroid/content/Intent;

    move-result-object v3

    .line 142
    const-string v0, "RET_CODE"

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/hwid/SignInResp;->getRetCode()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 143
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/c;->a:Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;

    invoke-virtual {v0, v3}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->getSignInResultFromIntent(Landroid/content/Intent;)Lcom/huawei/hms/support/api/hwid/SignInResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 137
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/entity/hwid/SignInResp;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/hwid/c;->a(Lcom/huawei/hms/support/api/entity/hwid/SignInResp;)Lcom/huawei/hms/support/api/hwid/SignInResult;

    move-result-object v0

    return-object v0
.end method
