.class Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;
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

.field final synthetic b:I

.field final synthetic d:J

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;Lcom/huawei/hwbasemgr/IBaseResponseCallback;JI)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->a:Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-wide p3, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->d:J

    iput p5, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 14

    .line 161
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TYPE_DAY errorCode = "

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

    .line 162
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 166
    :cond_0
    return-void

    .line 168
    :cond_1
    move-object v5, p1

    check-cast v5, Landroid/util/SparseArray;

    .line 169
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gez v0, :cond_3

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 173
    :cond_2
    return-void

    .line 175
    :cond_3
    if-nez p2, :cond_4

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 176
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

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    invoke-interface {v0, v1, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 178
    return-void

    .line 182
    :cond_4
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 183
    const/16 v0, 0x7f2

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 184
    move-object v6, v8

    check-cast v6, Ljava/util/List;

    .line 185
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 186
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 187
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    goto :goto_0

    .line 189
    :cond_5
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressMetaDatasList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 191
    new-instance v10, Lorg/json/JSONArray;

    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    .line 193
    const-string v0, "curr_time"

    :try_start_0
    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->d:J

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-virtual {v9, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 194
    const-string v0, "type"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->a:Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;

    iget v2, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->b:I

    invoke-static {v1, v2}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->e(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;I)I

    move-result v1

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 195
    const-string v0, "zone"

    const/16 v1, 0x320

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 196
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 197
    new-instance v13, Lorg/json/JSONObject;

    invoke-direct {v13}, Lorg/json/JSONObject;-><init>()V

    .line 198
    const-string v0, "gather_time"

    invoke-virtual {v12}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_start_time()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-virtual {v13, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 199
    const-string v0, "score"

    invoke-virtual {v12}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v1

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 200
    invoke-virtual {v10, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 201
    goto :goto_1

    .line 202
    :cond_6
    const-string v0, "time_score_arr"

    invoke-virtual {v9, v0, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$5;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v9}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 206
    goto :goto_2

    .line 204
    :catch_0
    move-exception v11

    .line 205
    invoke-virtual {v11}, Lorg/json/JSONException;->printStackTrace()V

    .line 208
    :goto_2
    return-void
.end method
