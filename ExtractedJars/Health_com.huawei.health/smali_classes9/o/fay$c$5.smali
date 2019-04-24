.class Lo/fay$c$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fay$c;->b(JJLo/fbd$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fbd$e;

.field final synthetic c:Lo/fay$c;


# direct methods
.method constructor <init>(Lo/fay$c;Lo/fbd$e;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lo/fay$c$5;->c:Lo/fay$c;

    iput-object p2, p0, Lo/fay$c$5;->b:Lo/fbd$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 165
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 166
    const-string v0, "WarningHRHistoryDataTree"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggered but the data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fay$c$5;->b:Lo/fbd$e;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fbd$e;->b(Ljava/util/List;)V

    .line 168
    return-void

    .line 170
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 171
    const-string v0, "WarningHRHistoryDataTree"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggered but the data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fay$c$5;->b:Lo/fbd$e;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fbd$e;->b(Ljava/util/List;)V

    .line 173
    return-void

    .line 176
    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 178
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    .line 180
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_3

    .line 181
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 183
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v10

    .line 184
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v12

    .line 186
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;

    .line 187
    if-nez v14, :cond_2

    .line 188
    goto :goto_1

    .line 191
    :cond_2
    new-instance v0, Lo/fbb$e;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fay$c$5;->c:Lo/fay$c;

    iget-object v1, v1, Lo/fay$c;->b:Lo/fay;

    .line 192
    invoke-static {v1}, Lo/fay;->e(Lo/fay;)Landroid/content/Context;

    move-result-object v1

    move-wide v2, v10

    move-wide v4, v12

    invoke-direct/range {v0 .. v5}, Lo/fbb$e;-><init>(Landroid/content/Context;JJ)V

    move-object v15, v0

    .line 193
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->getMinHeartRate()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v15, v0}, Lo/fbb$e;->c(F)V

    .line 194
    invoke-virtual {v14}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->getMaxHeartRate()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v15, v0}, Lo/fbb$e;->b(F)V

    .line 195
    invoke-interface {v6, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 198
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fay$c$5;->b:Lo/fbd$e;

    invoke-interface {v0, v6}, Lo/fbd$e;->b(Ljava/util/List;)V

    .line 199
    return-void
.end method
