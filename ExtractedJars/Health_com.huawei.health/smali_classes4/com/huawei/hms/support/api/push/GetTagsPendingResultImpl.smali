.class public Lcom/huawei/hms/support/api/push/GetTagsPendingResultImpl;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/push/GetTagResult;Lcom/huawei/hms/support/api/entity/push/GetTagsResp;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/hms/support/api/client/ApiClient;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 30
    iput-object p1, p0, Lcom/huawei/hms/support/api/push/GetTagsPendingResultImpl;->a:Lcom/huawei/hms/support/api/client/ApiClient;

    .line 31
    return-void
.end method


# virtual methods
.method public bridge synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 22
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/entity/push/GetTagsResp;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/push/GetTagsPendingResultImpl;->onComplete(Lcom/huawei/hms/support/api/entity/push/GetTagsResp;)Lcom/huawei/hms/support/api/push/GetTagResult;

    move-result-object v0

    return-object v0
.end method

.method public onComplete(Lcom/huawei/hms/support/api/entity/push/GetTagsResp;)Lcom/huawei/hms/support/api/push/GetTagResult;
    .locals 6

    .line 36
    new-instance v3, Lcom/huawei/hms/support/api/push/GetTagResult;

    invoke-direct {v3}, Lcom/huawei/hms/support/api/push/GetTagResult;-><init>()V

    .line 40
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/GetTagsPendingResultImpl;->a:Lcom/huawei/hms/support/api/client/ApiClient;

    invoke-interface {v0}, Lcom/huawei/hms/support/api/client/ApiClient;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 41
    new-instance v5, Lcom/huawei/hms/support/api/push/b/a/a/c;

    const-string v0, "tags_info"

    invoke-direct {v5, v4, v0}, Lcom/huawei/hms/support/api/push/b/a/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 42
    invoke-virtual {v5}, Lcom/huawei/hms/support/api/push/b/a/a/c;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hms/support/api/entity/push/GetTagsResp;->setTags(Ljava/util/Map;)V

    .line 44
    invoke-virtual {v3, p1}, Lcom/huawei/hms/support/api/push/GetTagResult;->setTagsRes(Lcom/huawei/hms/support/api/entity/push/GetTagsResp;)V

    .line 45
    sget-object v0, Lcom/huawei/hms/support/api/client/Status;->SUCCESS:Lcom/huawei/hms/support/api/client/Status;

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/push/GetTagResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    goto :goto_0

    .line 46
    :catch_0
    move-exception v4

    .line 47
    const-string v0, "GetTagsPendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get tags failed, error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    invoke-virtual {v3, p1}, Lcom/huawei/hms/support/api/push/GetTagResult;->setTagsRes(Lcom/huawei/hms/support/api/entity/push/GetTagsResp;)V

    .line 49
    new-instance v0, Lcom/huawei/hms/support/api/client/Status;

    const v1, 0x36119552

    invoke-direct {v0, v1}, Lcom/huawei/hms/support/api/client/Status;-><init>(I)V

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/push/GetTagResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 51
    :goto_0
    return-object v3
.end method
