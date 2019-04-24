.class Lo/exx$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exx;->d(JJILo/ekr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ekr;

.field final synthetic d:Lo/exx;


# direct methods
.method constructor <init>(Lo/exx;Lo/ekr;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lo/exx$1;->d:Lo/exx;

    iput-object p2, p0, Lo/exx$1;->c:Lo/ekr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 148
    move-object/from16 v4, p1

    .line 149
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 150
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exx$1;->c:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 151
    return-void

    .line 154
    :cond_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 155
    const-string v0, "UIHLH_SleepModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sumDataList.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 157
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 158
    const-string v0, "core_sleep_deep_key"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 159
    const-string v0, "core_sleep_light_key"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 160
    const-string v0, "core_sleep_wake_dream_key"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 161
    const-string v0, "core_sleep_wake_key"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 162
    const-string v0, "core_sleep_day_sleep_time_key"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v14

    .line 164
    new-instance v15, Lo/fai;

    invoke-direct {v15}, Lo/fai;-><init>()V

    .line 167
    if-gtz v10, :cond_2

    if-gtz v11, :cond_2

    if-gtz v12, :cond_2

    if-gtz v13, :cond_2

    if-lez v14, :cond_3

    .line 168
    :cond_2
    add-int v0, v10, v11

    add-int/2addr v0, v12

    add-int/2addr v0, v13

    add-int/2addr v0, v14

    int-to-float v1, v0

    move/from16 v17, v1

    .line 169
    int-to-float v0, v10

    invoke-virtual {v15, v0}, Lo/fai;->b(F)V

    .line 170
    int-to-float v0, v11

    invoke-virtual {v15, v0}, Lo/fai;->a(F)V

    .line 171
    int-to-float v0, v12

    invoke-virtual {v15, v0}, Lo/fai;->d(F)V

    .line 172
    int-to-float v0, v13

    invoke-virtual {v15, v0}, Lo/fai;->c(F)V

    .line 173
    int-to-float v0, v14

    invoke-virtual {v15, v0}, Lo/fai;->e(F)V

    .line 174
    const/16 v0, 0x1f

    invoke-virtual {v15, v0}, Lo/fai;->b(I)V

    .line 175
    new-instance v0, Lo/fam;

    move/from16 v1, v17

    move-object v2, v15

    invoke-direct {v0, v1, v2}, Lo/fam;-><init>(FLo/fai;)V

    move-object/from16 v16, v0

    .line 176
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    goto :goto_1

    .line 178
    :cond_3
    const-string v0, "sleep_deep_key"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    div-int/lit8 v17, v0, 0x3c

    .line 179
    const-string v0, "sleep_light_key"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    div-int/lit8 v18, v0, 0x3c

    .line 180
    const-string v0, "sleep_wake_key"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    div-int/lit8 v19, v0, 0x3c

    .line 181
    if-gtz v17, :cond_4

    if-lez v18, :cond_5

    .line 182
    :cond_4
    add-int v0, v17, v18

    int-to-float v1, v0

    move/from16 v20, v1

    .line 183
    move/from16 v0, v17

    int-to-float v0, v0

    invoke-virtual {v15, v0}, Lo/fai;->b(F)V

    .line 184
    move/from16 v0, v18

    int-to-float v0, v0

    invoke-virtual {v15, v0}, Lo/fai;->a(F)V

    .line 185
    const/16 v0, 0x1e

    invoke-virtual {v15, v0}, Lo/fai;->b(I)V

    .line 186
    new-instance v0, Lo/fam;

    move/from16 v1, v20

    move-object v2, v15

    invoke-direct {v0, v1, v2}, Lo/fam;-><init>(FLo/fai;)V

    move-object/from16 v16, v0

    .line 187
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    :cond_5
    :goto_1
    goto/16 :goto_0

    .line 192
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exx$1;->c:Lo/ekr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 193
    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 194
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exx$1;->c:Lo/ekr;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lo/ekr;->b(ILjava/lang/Object;)V

    goto :goto_2

    .line 196
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exx$1;->c:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 199
    :cond_8
    :goto_2
    return-void
.end method
