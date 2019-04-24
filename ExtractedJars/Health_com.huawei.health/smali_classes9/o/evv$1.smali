.class Lo/evv$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evv;->d(Landroid/content/Context;JJLo/ekr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ekr;

.field final synthetic e:Lo/evv;


# direct methods
.method constructor <init>(Lo/evv;Lo/ekr;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lo/evv$1;->e:Lo/evv;

    iput-object p2, p0, Lo/evv$1;->a:Lo/ekr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 16

    .line 198
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_1

    .line 199
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$1;->a:Lo/ekr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 200
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$1;->a:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 202
    :cond_0
    return-void

    .line 204
    :cond_1
    move-object/from16 v6, p1

    check-cast v6, Landroid/util/SparseArray;

    .line 205
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$1;->a:Lo/ekr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 207
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$1;->a:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 209
    :cond_2
    return-void

    .line 214
    :cond_3
    const v0, 0xad12

    invoke-virtual {v6, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 215
    move-object v7, v8

    check-cast v7, Ljava/util/List;

    .line 217
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 218
    const-wide/32 v10, 0x2932e00

    .line 219
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 220
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    add-long/2addr v0, v10

    invoke-static {v0, v1}, Lo/dbu;->e(J)J

    move-result-wide v14

    .line 221
    const-string v0, "PressureLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "--time1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--time1Date = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v14, v15}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--healthData.getStartTime() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    goto/16 :goto_0

    .line 225
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$1;->a:Lo/ekr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 226
    invoke-interface {v9}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$1;->a:Lo/ekr;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v9}, Lo/ekr;->b(ILjava/lang/Object;)V

    goto :goto_1

    .line 229
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/evv$1;->a:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 232
    :cond_6
    :goto_1
    return-void
.end method
