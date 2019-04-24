.class Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->b(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;

.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:J

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;Lcom/huawei/hwbasemgr/IBaseResponseCallback;JI)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->a:Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-wide p3, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->d:J

    iput p5, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 15

    .line 228
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TYPE_MONTH errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_1

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 233
    :cond_0
    return-void

    .line 235
    :cond_1
    move-object/from16 v5, p1

    check-cast v5, Landroid/util/SparseArray;

    .line 236
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gez v0, :cond_3

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 240
    :cond_2
    return-void

    .line 242
    :cond_3
    if-nez p2, :cond_4

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 243
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "------readHiHealthData --errorCode == ErrorConstants.SUCCESS && map.size() == 0----errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    invoke-interface {v0, v1, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 245
    return-void

    .line 248
    :cond_4
    const v0, 0xad12

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 249
    move-object v6, v7

    check-cast v6, Ljava/util/List;

    .line 251
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 252
    new-instance v9, Lorg/json/JSONArray;

    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 254
    const-string v0, "curr_time"

    :try_start_0
    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->d:J

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-virtual {v8, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 255
    const-string v0, "type"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->a:Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;

    iget v2, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->e:I

    invoke-static {v1, v2}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->e(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;I)I

    move-result v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 256
    const-string v0, "zone"

    const/16 v1, 0x320

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 257
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 258
    new-instance v12, Lorg/json/JSONObject;

    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V

    .line 259
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v13, v0, v2

    .line 260
    const-string v0, "gather_time"

    invoke-virtual {v12, v0, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 261
    const-string v0, "score"

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v1

    invoke-virtual {v12, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 262
    invoke-virtual {v9, v12}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 263
    goto :goto_0

    .line 264
    :cond_5
    const-string v0, "time_score_arr"

    invoke-virtual {v8, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 268
    goto :goto_1

    .line 266
    :catch_0
    move-exception v10

    .line 267
    invoke-virtual {v10}, Lorg/json/JSONException;->printStackTrace()V

    .line 270
    :goto_1
    return-void
.end method
