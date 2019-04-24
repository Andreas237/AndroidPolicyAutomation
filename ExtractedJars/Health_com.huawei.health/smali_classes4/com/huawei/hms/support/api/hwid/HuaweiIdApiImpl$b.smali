.class Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$b;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/hwid/SignOutResult;Lcom/huawei/hms/support/api/entity/hwid/SignOutResp;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 165
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 166
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/entity/hwid/SignOutResp;)Lcom/huawei/hms/support/api/hwid/SignOutResult;
    .locals 4

    .line 176
    new-instance v2, Lcom/huawei/hms/support/api/hwid/SignOutResult;

    invoke-direct {v2}, Lcom/huawei/hms/support/api/hwid/SignOutResult;-><init>()V

    .line 177
    new-instance v3, Lcom/huawei/hms/support/api/client/Status;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/hms/support/api/client/Status;-><init>(I)V

    .line 178
    invoke-virtual {v2, v3}, Lcom/huawei/hms/support/api/hwid/SignOutResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 179
    const-string v0, "HuaweiIdApiImpl"

    const-string v1, "signOut onComplete"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    return-object v2
.end method

.method public synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 163
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/entity/hwid/SignOutResp;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$b;->a(Lcom/huawei/hms/support/api/entity/hwid/SignOutResp;)Lcom/huawei/hms/support/api/hwid/SignOutResult;

    move-result-object v0

    return-object v0
.end method
