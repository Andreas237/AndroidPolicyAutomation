.class Lo/cwe$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwe;->querySleepQuestionnaireResults(JLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic c:Lo/cwe;


# direct methods
.method constructor <init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 2023
    iput-object p1, p0, Lo/cwe$15;->c:Lo/cwe;

    iput-object p2, p0, Lo/cwe$15;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;Ljava/lang/String;Z)V
    .locals 7

    .line 2028
    if-eqz p3, :cond_0

    .line 2029
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 2031
    invoke-virtual {v4, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 2033
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v6

    .line 2034
    iget-object v0, p0, Lo/cwe$15;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v6}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2037
    goto :goto_0

    .line 2035
    :catch_0
    move-exception v6

    .line 2036
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Base64.encodeToString error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2038
    :goto_0
    goto :goto_1

    .line 2039
    :cond_0
    const/16 v4, 0x7cf

    .line 2040
    const-string v5, "unknown error"

    .line 2041
    if-eqz p1, :cond_1

    .line 2042
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 2043
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;->getResultDesc()Ljava/lang/String;

    move-result-object v5

    .line 2045
    :cond_1
    iget-object v0, p0, Lo/cwe$15;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v4, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2047
    :goto_1
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 2023
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/cwe$15;->e(Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;Ljava/lang/String;Z)V

    return-void
.end method
