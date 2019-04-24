.class Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$8;
.super Lo/bsf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getFitnessHistoryByMonth()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)V
    .locals 0

    .line 951
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$8;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-direct {p0}, Lo/bsf;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Request;Ljava/lang/Exception;)V
    .locals 4

    .line 954
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryTrainCount "

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

    .line 955
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$8;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$1300(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)V

    .line 956
    return-void
.end method

.method public onSuccess(Lorg/json/JSONObject;)V
    .locals 6

    .line 960
    const-string v0, "monthTrainList"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 961
    if-eqz v4, :cond_0

    .line 962
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 963
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 964
    const/16 v0, 0x3ea

    iput v0, v5, Landroid/os/Message;->what:I

    .line 965
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$8;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$600(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 966
    goto :goto_0

    .line 967
    :cond_0
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryTrainCount no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 968
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$8;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$1300(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)V

    .line 970
    :goto_0
    return-void
.end method
