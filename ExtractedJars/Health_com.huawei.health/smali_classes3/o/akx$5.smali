.class Lo/akx$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/akx;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[J

.field final synthetic c:Lo/akx;


# direct methods
.method constructor <init>(Lo/akx;[J)V
    .locals 0

    .line 249
    iput-object p1, p0, Lo/akx$5;->c:Lo/akx;

    iput-object p2, p0, Lo/akx$5;->a:[J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 15

    .line 252
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " datas "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " errorCode"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  anchor"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 254
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readStepData onResult null == data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    iget-object v0, p0, Lo/akx$5;->c:Lo/akx;

    invoke-static {v0}, Lo/akx;->a(Lo/akx;)V

    .line 256
    return-void

    .line 258
    :cond_0
    move-object/from16 v6, p1

    check-cast v6, Landroid/util/SparseArray;

    .line 260
    const/16 v0, 0x4e21

    invoke-virtual {v6, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 261
    move-object v8, v7

    check-cast v8, Ljava/util/List;

    .line 262
    if-nez v8, :cond_1

    .line 263
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readStepData onResult steplist == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    iget-object v0, p0, Lo/akx$5;->c:Lo/akx;

    invoke-static {v0}, Lo/akx;->a(Lo/akx;)V

    .line 265
    return-void

    .line 267
    :cond_1
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "steplist "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 270
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v11

    .line 271
    const-string v0, "step"

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 272
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v14

    .line 273
    const-string v0, "ISportIntensity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiHealthData startTime "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " step"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    const/16 v0, 0x64

    if-le v13, v0, :cond_4

    .line 275
    const/16 v0, 0x4e22

    if-eq v14, v0, :cond_2

    const/16 v0, 0x4e24

    if-ne v14, v0, :cond_3

    .line 276
    :cond_2
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type is walk or climb"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    iget-object v0, p0, Lo/akx$5;->c:Lo/akx;

    invoke-static {v0}, Lo/akx;->b(Lo/akx;)[B

    move-result-object v0

    iget-object v1, p0, Lo/akx$5;->c:Lo/akx;

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    iget-object v4, p0, Lo/akx$5;->a:[J

    const/4 v5, 0x0

    aget-wide v4, v4, v5

    sub-long/2addr v2, v4

    invoke-static {v1, v2, v3}, Lo/akx;->b(Lo/akx;J)I

    move-result v1

    const/4 v2, 0x1

    aput-byte v2, v0, v1

    goto :goto_1

    .line 279
    :cond_3
    const/16 v0, 0x4e23

    if-ne v14, v0, :cond_5

    .line 280
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type is run"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    iget-object v0, p0, Lo/akx$5;->c:Lo/akx;

    invoke-static {v0}, Lo/akx;->b(Lo/akx;)[B

    move-result-object v0

    iget-object v1, p0, Lo/akx$5;->c:Lo/akx;

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    iget-object v4, p0, Lo/akx$5;->a:[J

    const/4 v5, 0x0

    aget-wide v4, v4, v5

    sub-long/2addr v2, v4

    invoke-static {v1, v2, v3}, Lo/akx;->b(Lo/akx;J)I

    move-result v1

    const/4 v2, 0x2

    aput-byte v2, v0, v1

    goto :goto_1

    .line 284
    :cond_4
    iget-object v0, p0, Lo/akx$5;->c:Lo/akx;

    invoke-static {v0}, Lo/akx;->b(Lo/akx;)[B

    move-result-object v0

    iget-object v1, p0, Lo/akx$5;->c:Lo/akx;

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    iget-object v4, p0, Lo/akx$5;->a:[J

    const/4 v5, 0x0

    aget-wide v4, v4, v5

    sub-long/2addr v2, v4

    invoke-static {v1, v2, v3}, Lo/akx;->b(Lo/akx;J)I

    move-result v1

    const/4 v2, 0x0

    aput-byte v2, v0, v1

    .line 286
    :cond_5
    :goto_1
    goto/16 :goto_0

    .line 287
    :cond_6
    iget-object v0, p0, Lo/akx$5;->c:Lo/akx;

    invoke-static {v0}, Lo/akx;->a(Lo/akx;)V

    .line 289
    return-void
.end method
