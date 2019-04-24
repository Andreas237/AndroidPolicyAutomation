.class Lo/dlz$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:J

.field final synthetic c:Lo/dlz;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/dlz;JLjava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lo/dlz$15;->c:Lo/dlz;

    iput-wide p2, p0, Lo/dlz$15;->b:J

    iput-object p4, p0, Lo/dlz$15;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 202
    if-eqz p2, :cond_1

    .line 203
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 204
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 205
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 206
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setOrDeleteMeasureMsg,size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v7

    .line 208
    iget-object v0, p0, Lo/dlz$15;->c:Lo/dlz;

    iget-wide v1, p0, Lo/dlz$15;->b:J

    sub-long/2addr v1, v7

    const-wide/32 v3, 0x5265c00

    div-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v0, v1}, Lo/dlz;->b(Lo/dlz;I)I

    .line 209
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setOrDeleteMeasureMsg,interval_day = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dlz$15;->c:Lo/dlz;

    invoke-static {v3}, Lo/dlz;->c(Lo/dlz;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    iget-object v0, p0, Lo/dlz$15;->c:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->b(Lo/dlz;)I

    move-result v0

    iget-object v1, p0, Lo/dlz$15;->c:Lo/dlz;

    invoke-static {v1}, Lo/dlz;->c(Lo/dlz;)I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 211
    iget-object v0, p0, Lo/dlz$15;->c:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->d(Lo/dlz;)Lo/dly;

    move-result-object v0

    iget-object v1, p0, Lo/dlz$15;->c:Lo/dlz;

    invoke-static {v1}, Lo/dlz;->c(Lo/dlz;)I

    move-result v1

    iget-object v2, p0, Lo/dlz$15;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/dlz$15;->c:Lo/dlz;

    invoke-static {v3}, Lo/dlz;->b(Lo/dlz;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/dly;->c(ILjava/lang/String;I)V

    goto :goto_0

    .line 213
    :cond_0
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " setOrDeleteMeasureMsg, MSG_STATUS_EXPIRED "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    iget-object v0, p0, Lo/dlz$15;->c:Lo/dlz;

    iget-object v0, v0, Lo/dlz;->b:Landroid/content/Context;

    const/16 v1, 0x4e25

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 218
    :cond_1
    :goto_0
    return-void
.end method
