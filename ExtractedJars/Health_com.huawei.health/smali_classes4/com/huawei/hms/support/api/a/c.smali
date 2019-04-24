.class final Lcom/huawei/hms/support/api/a/c;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/ResolveResult<Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;>;Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;)Lcom/huawei/hms/support/api/ResolveResult;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;)Lcom/huawei/hms/support/api/ResolveResult<Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;>;"
        }
    .end annotation

    .line 101
    if-nez p1, :cond_0

    .line 102
    const-string v0, "connectservice"

    const-string v1, "JosNoticeResp is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const/4 v0, 0x0

    return-object v0

    .line 106
    :cond_0
    const-string v0, "connectservice"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "josNoticeResp status code :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;->getStatusCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    new-instance v3, Lcom/huawei/hms/support/api/ResolveResult;

    invoke-direct {v3, p1}, Lcom/huawei/hms/support/api/ResolveResult;-><init>(Ljava/lang/Object;)V

    .line 109
    sget-object v0, Lcom/huawei/hms/support/api/client/Status;->SUCCESS:Lcom/huawei/hms/support/api/client/Status;

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/ResolveResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 111
    return-object v3
.end method

.method public synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 98
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/a/c;->a(Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;)Lcom/huawei/hms/support/api/ResolveResult;

    move-result-object v0

    return-object v0
.end method
