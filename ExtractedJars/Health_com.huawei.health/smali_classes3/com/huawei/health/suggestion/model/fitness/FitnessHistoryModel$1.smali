.class Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field start:I

.field final synthetic this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Landroid/os/Looper;)V
    .locals 1

    .line 105
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 106
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->start:I

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 17

    .line 110
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super {v0, v1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 111
    move-object/from16 v0, p1

    iget v0, v0, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 113
    :pswitch_0
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HAS_MORE_DATA"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lorg/json/JSONObject;

    .line 115
    const-string v0, "startTime"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 116
    const-string v0, "endTime"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v9

    .line 117
    const-string v0, "pageNum"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v11

    .line 118
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-wide v1, v7

    move-wide v3, v9

    add-int/lit8 v5, v11, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->postFitnessHistoryRequest(JJI)V

    .line 119
    goto/16 :goto_1

    .line 121
    :pswitch_1
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NO_MORE_DATA"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    const-wide/16 v2, 0x3e8

    mul-long/2addr v2, v12

    invoke-static {v1, v2, v3}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$300(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;J)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$202(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/util/List;)Ljava/util/List;

    .line 124
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$200(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v2}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$400(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$500(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/util/List;Ljava/util/List;)V

    .line 125
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$400(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 126
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v14

    .line 127
    const/16 v0, 0x3ea

    iput v0, v14, Landroid/os/Message;->what:I

    .line 128
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, v14, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 129
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->start:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->start:I

    .line 130
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$600(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v14}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 131
    goto/16 :goto_1

    .line 133
    :pswitch_2
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RECEIVE_DATA START = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->start:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->start:I

    if-nez v0, :cond_0

    .line 135
    move-object/from16 v0, p1

    iget-object v15, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 136
    instance-of v0, v15, Lorg/json/JSONArray;

    if-eqz v0, :cond_0

    .line 137
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-object/from16 v1, p1

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lorg/json/JSONArray;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$702(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    .line 141
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$700(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->start:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$700(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 142
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$700(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lorg/json/JSONArray;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->start:I

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v15

    .line 143
    if-eqz v15, :cond_1

    .line 144
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryTrainCount month: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "months"

    invoke-virtual {v15, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " count: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "count"

    invoke-virtual {v15, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0, v15}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$800(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Lorg/json/JSONObject;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->start:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->start:I

    .line 147
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$600(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 150
    :cond_1
    goto :goto_1

    .line 151
    :cond_2
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->start:I

    .line 152
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$900(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 153
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$900(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    move-result-object v0

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/health/suggestion/model/fitness/IResultCallback;->onResult(ILjava/lang/Object;)V

    goto :goto_0

    .line 155
    :cond_3
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mResultCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    :goto_0
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    monitor-enter v15

    .line 159
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$1;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$1002(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    monitor-exit v15

    goto :goto_1

    :catchall_0
    move-exception v16

    monitor-exit v15

    throw v16

    .line 162
    .line 166
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3e8
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
