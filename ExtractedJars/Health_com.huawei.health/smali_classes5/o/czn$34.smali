.class Lo/czn$34;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/czn;->b(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;Lo/cyx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cyx;

.field final synthetic e:Lo/czn;


# direct methods
.method constructor <init>(Lo/czn;Lo/cyx;)V
    .locals 0

    .line 5818
    iput-object p1, p0, Lo/czn$34;->e:Lo/czn;

    iput-object p2, p0, Lo/czn$34;->d:Lo/cyx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Exception;)V
    .locals 4

    .line 5843
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWifiDeviceStatus EXCEPTION code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "message = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5844
    iget-object v0, p0, Lo/czn$34;->d:Lo/cyx;

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v1, v3}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5845
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 5

    .line 5821
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWifiDeviceStatus in operationResult text=***"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5823
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;

    .line 5824
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 5826
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWifiDeviceStatus ResultCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5827
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 5829
    iget-object v0, p0, Lo/czn$34;->d:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v4, v1, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    goto :goto_0

    .line 5833
    :cond_0
    iget-object v0, p0, Lo/czn$34;->d:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v4, v1, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5839
    :cond_1
    :goto_0
    goto :goto_1

    .line 5836
    :catch_0
    move-exception v4

    .line 5837
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getWifiDeviceStatus exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5838
    iget-object v0, p0, Lo/czn$34;->d:Lo/cyx;

    invoke-virtual {v4}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v1, v3}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 5840
    :goto_1
    return-void
.end method