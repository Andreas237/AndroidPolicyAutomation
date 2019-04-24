.class public Lo/cvg;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 44
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    :cond_0
    new-instance v0, Lo/cvo;

    const-string v1, "validTimes times is null or empty"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiTimeInterval;

    .line 50
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiTimeInterval;->getStartTime()J

    move-result-wide v3

    .line 51
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiTimeInterval;->getEndTime()J

    move-result-wide v5

    .line 52
    cmp-long v0, v3, v5

    if-lez v0, :cond_2

    .line 53
    new-instance v0, Lo/cvo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "validTimes startTime > endTime startTime = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",endTime = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_2
    goto :goto_0

    .line 56
    :cond_3
    return-void
.end method

.method private d([I)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 26
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 27
    :cond_0
    new-instance v0, Lo/cvo;

    const-string v1, "validType types is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 30
    :cond_1
    const/4 v0, 0x0

    aget v0, p1, v0

    invoke-static {v0}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v3

    .line 31
    move-object v4, p1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    aget v7, v4, v6

    .line 32
    invoke-static {v7}, Lo/cmk;->c(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 33
    invoke-static {v7}, Lo/cmi;->c(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 34
    new-instance v0, Lo/cvo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "validType types canot delete type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_2
    invoke-static {v7}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v0

    if-eq v3, v0, :cond_3

    .line 38
    new-instance v0, Lo/cvo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "validType types is not same category type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 31
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 41
    :cond_4
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/hihealth/HiDataDeleteOption;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 16
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 17
    new-instance v0, Lo/cvo;

    const-string v1, "validDeleteOption deleteOption is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataDeleteOption;->getTimes()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cvg;->b(Ljava/util/List;)V

    .line 22
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataDeleteOption;->getTypes()[I

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cvg;->d([I)V

    .line 23
    return-void
.end method
