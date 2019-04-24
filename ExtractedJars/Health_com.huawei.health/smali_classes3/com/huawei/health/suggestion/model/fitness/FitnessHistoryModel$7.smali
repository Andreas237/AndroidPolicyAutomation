.class Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;
.super Lo/bsf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->postFitnessHistoryRequest(JJI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

.field final synthetic val$endTime:J

.field final synthetic val$object:Lorg/json/JSONObject;

.field final synthetic val$startTime:J


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;JJLorg/json/JSONObject;)V
    .locals 0

    .line 907
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    iput-wide p2, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->val$startTime:J

    iput-wide p4, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->val$endTime:J

    iput-object p6, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->val$object:Lorg/json/JSONObject;

    invoke-direct {p0}, Lo/bsf;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Request;Ljava/lang/Exception;)V
    .locals 4

    .line 910
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postFitnessHistoryRequest "

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

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 911
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$1300(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)V

    .line 912
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$1402(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Z)Z

    .line 913
    return-void
.end method

.method public onSuccess(Lorg/json/JSONObject;)V
    .locals 11

    .line 917
    const-string v0, "trainInfoList"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 918
    if-eqz v7, :cond_1

    .line 919
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v8, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 920
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTime is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->val$startTime:J

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "and endTime is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->val$endTime:J

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$400(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Ljava/util/List;

    move-result-object v0

    invoke-static {v7}, Lo/bsx;->d(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 923
    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_0

    .line 924
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 925
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postFitnessHistoryRequest onSuccess "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 923
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 927
    :cond_0
    goto :goto_1

    .line 928
    :cond_1
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postFitnessHistoryRequest no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 930
    :goto_1
    const-string v0, "hasMore"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 931
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v8

    .line 932
    const/16 v0, 0x3e8

    iput v0, v8, Landroid/os/Message;->what:I

    .line 933
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->val$object:Lorg/json/JSONObject;

    iput-object v0, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 934
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$600(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 935
    goto :goto_2

    .line 936
    :cond_2
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v8

    .line 937
    const/16 v0, 0x3e9

    iput v0, v8, Landroid/os/Message;->what:I

    .line 938
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->val$startTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 939
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$7;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$600(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 941
    :goto_2
    return-void
.end method
