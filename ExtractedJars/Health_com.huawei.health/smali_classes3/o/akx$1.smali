.class Lo/akx$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/akx;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[J

.field final synthetic e:Lo/akx;


# direct methods
.method constructor <init>(Lo/akx;[J)V
    .locals 0

    .line 330
    iput-object p1, p0, Lo/akx$1;->e:Lo/akx;

    iput-object p2, p0, Lo/akx$1;->b:[J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 12

    .line 333
    const-string v0, "ISportIntensity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResult  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " errorCode"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " anchor"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    if-eqz p1, :cond_1

    .line 337
    move-object v6, p1

    check-cast v6, Landroid/util/SparseArray;

    .line 338
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 340
    const/16 v0, 0x4e25

    invoke-virtual {v6, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 341
    move-object v8, v7

    check-cast v8, Ljava/util/List;

    .line 343
    iget-object v0, p0, Lo/akx$1;->e:Lo/akx;

    invoke-static {v0}, Lo/akx;->b(Lo/akx;)[B

    move-result-object v0

    if-nez v0, :cond_0

    .line 344
    iget-object v0, p0, Lo/akx$1;->e:Lo/akx;

    const/16 v1, 0x5a0

    new-array v1, v1, [B

    invoke-static {v0, v1}, Lo/akx;->b(Lo/akx;[B)[B

    .line 347
    :cond_0
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 349
    :try_start_0
    iget-object v0, p0, Lo/akx$1;->e:Lo/akx;

    invoke-static {v0}, Lo/akx;->b(Lo/akx;)[B

    move-result-object v0

    iget-object v1, p0, Lo/akx$1;->e:Lo/akx;

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    iget-object v4, p0, Lo/akx$1;->b:[J

    const/4 v5, 0x0

    aget-wide v4, v4, v5

    sub-long/2addr v2, v4

    invoke-static {v1, v2, v3}, Lo/akx;->b(Lo/akx;J)I

    move-result v1

    const/4 v2, 0x3

    aput-byte v2, v0, v1

    .line 350
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "readTrackData  = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 353
    goto :goto_1

    .line 351
    :catch_0
    move-exception v11

    .line 352
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    :goto_1
    goto :goto_0

    .line 358
    :cond_1
    iget-object v0, p0, Lo/akx$1;->e:Lo/akx;

    invoke-static {v0}, Lo/akx;->k(Lo/akx;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x7d0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 359
    iget-object v0, p0, Lo/akx$1;->e:Lo/akx;

    invoke-static {v0}, Lo/akx;->k(Lo/akx;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 360
    return-void
.end method
