.class public Lcom/huawei/hms/support/api/push/HandleTagPendingResultImpl;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/push/HandleTagsResult;Lcom/huawei/hms/support/api/entity/push/TagsResp;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/hms/support/api/client/ApiClient;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 31
    iput-object p1, p0, Lcom/huawei/hms/support/api/push/HandleTagPendingResultImpl;->a:Lcom/huawei/hms/support/api/client/ApiClient;

    .line 32
    return-void
.end method

.method private static a(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;)V
    .locals 10

    .line 53
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 54
    const-string v0, "HandleTagPendingResultImpl"

    const-string v1, "the client is null when adding or deleting tags from file."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    return-void

    .line 59
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/huawei/hms/support/api/push/b/a/a/a;->a(Ljava/lang/String;)Lorg/json/JSONArray;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 60
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 61
    return-void

    .line 63
    :cond_1
    :try_start_1
    new-instance v4, Lcom/huawei/hms/support/api/push/b/a/a/c;

    invoke-interface {p0}, Lcom/huawei/hms/support/api/client/ApiClient;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "tags_info"

    invoke-direct {v4, v0, v1}, Lcom/huawei/hms/support/api/push/b/a/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 64
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    .line 65
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    .line 66
    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 67
    if-eqz v7, :cond_3

    .line 68
    const-string v0, "tagKey"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 69
    const-string v0, "opType"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v9

    .line 70
    const/4 v0, 0x1

    if-ne v0, v9, :cond_2

    .line 71
    const-string v0, "tagValue"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v8, v0}, Lcom/huawei/hms/support/api/push/b/a/a/c;->a(Ljava/lang/String;Ljava/lang/Object;)Z

    goto :goto_1

    .line 72
    :cond_2
    const/4 v0, 0x2

    if-ne v0, v9, :cond_3

    .line 73
    invoke-virtual {v4, v8}, Lcom/huawei/hms/support/api/push/b/a/a/c;->d(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    :cond_3
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 80
    :cond_4
    goto :goto_2

    .line 78
    :catch_0
    move-exception v3

    .line 79
    const-string v0, "HandleTagPendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "when adding or deleting tags from file excepiton,"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    :goto_2
    return-void
.end method


# virtual methods
.method public bridge synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 23
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/entity/push/TagsResp;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/push/HandleTagPendingResultImpl;->onComplete(Lcom/huawei/hms/support/api/entity/push/TagsResp;)Lcom/huawei/hms/support/api/push/HandleTagsResult;

    move-result-object v0

    return-object v0
.end method

.method public onComplete(Lcom/huawei/hms/support/api/entity/push/TagsResp;)Lcom/huawei/hms/support/api/push/HandleTagsResult;
    .locals 4

    .line 39
    const-string v0, "HandleTagPendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "report tag completely, retcode is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/push/TagsResp;->getRetCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/push/TagsResp;->getRetCode()I

    move-result v0

    const v1, 0x36119551

    if-ne v1, v0, :cond_0

    .line 41
    const-string v0, "HandleTagPendingResultImpl"

    const-string v1, "report tag success."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/HandleTagPendingResultImpl;->a:Lcom/huawei/hms/support/api/client/ApiClient;

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/push/TagsResp;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/api/push/HandleTagPendingResultImpl;->a(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;)V

    .line 45
    :cond_0
    new-instance v3, Lcom/huawei/hms/support/api/push/HandleTagsResult;

    invoke-direct {v3}, Lcom/huawei/hms/support/api/push/HandleTagsResult;-><init>()V

    .line 46
    new-instance v0, Lcom/huawei/hms/support/api/client/Status;

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/push/TagsResp;->getRetCode()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/huawei/hms/support/api/client/Status;-><init>(I)V

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/push/HandleTagsResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 47
    invoke-virtual {v3, p1}, Lcom/huawei/hms/support/api/push/HandleTagsResult;->setTagsRes(Lcom/huawei/hms/support/api/entity/push/TagsResp;)V

    .line 49
    return-object v3
.end method
