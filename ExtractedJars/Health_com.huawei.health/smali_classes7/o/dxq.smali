.class public Lo/dxq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)D
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)D"
        }
    .end annotation

    .line 85
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v6

    .line 86
    const/4 v7, 0x0

    .line 87
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Integer;

    .line 88
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v7, v0

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    int-to-double v0, v7

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    int-to-double v2, v6

    div-double v8, v0, v2

    .line 92
    const/4 v10, 0x0

    .line 93
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/Integer;

    .line 94
    int-to-double v0, v10

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-double v2, v2

    sub-double/2addr v2, v8

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-double v4, v4

    sub-double/2addr v4, v8

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-int v10, v0

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    int-to-double v0, v10

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    int-to-double v2, v6

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v11

    .line 97
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    invoke-static {v11, v12, v0, v1}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    if-gtz v0, :cond_2

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double/2addr v0, v11

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    sub-double v13, v2, v0

    goto :goto_2

    :cond_2
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double v0, v11, v0

    const-wide v2, 0x4057c00000000000L    # 95.0

    sub-double v13, v2, v0

    .line 99
    :goto_2
    const-wide/16 v0, 0x0

    cmpl-double v0, v13, v0

    if-ltz v0, :cond_3

    move-wide v0, v13

    goto :goto_3

    :cond_3
    const-wide/16 v0, 0x0

    :goto_3
    return-wide v0
.end method

.method public static b(II)I
    .locals 3

    .line 20
    const/4 v2, 0x0

    .line 21
    const/16 v0, 0xa

    if-ge p0, v0, :cond_0

    .line 22
    mul-int/lit8 v0, p0, 0x2

    rsub-int/lit8 v2, v0, 0x64

    goto :goto_0

    .line 24
    :cond_0
    rsub-int/lit8 v2, p0, 0x5a

    .line 26
    :goto_0
    if-gez v2, :cond_1

    .line 27
    const/4 v2, 0x0

    .line 29
    :cond_1
    if-nez p0, :cond_2

    if-nez p1, :cond_2

    .line 30
    const/4 v2, 0x0

    .line 32
    :cond_2
    return v2
.end method

.method public static d(Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)I"
        }
    .end annotation

    .line 103
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public static e(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;Ljava/util/List;I)I
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;Ljava/util/List<Ljava/lang/Integer;>;I)I"
        }
    .end annotation

    .line 36
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 37
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepTime()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSlumberSleepTime()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getShallowSleepTime()I

    move-result v1

    add-int/2addr v0, v1

    div-int v7, v0, p2

    .line 39
    invoke-static {p1}, Lo/dxq;->a(Ljava/util/List;)D

    move-result-wide v8

    .line 40
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getScore()I

    move-result v0

    int-to-double v0, v0

    int-to-double v2, p2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    const-wide v2, 0x4051800000000000L    # 70.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 41
    sget-object v0, Lo/dxn;->q:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getScore()I

    move-result v0

    int-to-double v0, v0

    int-to-double v2, p2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    const-wide v2, 0x4055400000000000L    # 85.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 44
    sget-object v0, Lo/dxn;->z:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getFallTime()I

    move-result v0

    int-to-double v0, v0

    int-to-double v2, p2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    const-wide v2, 0x4097700000000000L    # 1500.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 47
    sget-object v0, Lo/dxn;->w:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getFallTime()I

    move-result v0

    int-to-double v0, v0

    int-to-double v2, p2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    const-wide v2, 0x4093b00000000000L    # 1260.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 50
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getFallTime()I

    move-result v0

    int-to-double v0, v0

    int-to-double v2, p2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    const-wide v2, 0x4095900000000000L    # 1380.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    const-wide v0, 0x4056800000000000L    # 90.0

    cmpl-double v0, v8, v0

    if-lez v0, :cond_3

    .line 52
    sget-object v0, Lo/dxn;->v:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getWakeUpTime()I

    move-result v0

    int-to-double v0, v0

    int-to-double v2, p2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    const-wide v2, 0x4076800000000000L    # 360.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_4

    .line 55
    sget-object v0, Lo/dxn;->j:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    :cond_4
    int-to-double v0, v7

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_5

    .line 58
    sget-object v0, Lo/dxn;->q:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    :cond_5
    int-to-double v0, v7

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4022000000000000L    # 9.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_6

    .line 61
    sget-object v0, Lo/dxn;->y:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getWakeupTimes()I

    move-result v0

    int-to-double v0, v0

    int-to-double v2, p2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_7

    .line 64
    sget-object v0, Lo/dxn;->x:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    :cond_7
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepTime()I

    move-result v0

    int-to-double v0, v0

    int-to-double v2, p2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    int-to-double v2, v7

    div-double/2addr v0, v2

    const-wide v2, 0x3fc999999999999aL    # 0.2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_8

    .line 67
    sget-object v0, Lo/dxn;->A:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    :cond_8
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSlumberSleepTime()I

    move-result v0

    int-to-double v0, v0

    int-to-double v2, p2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    int-to-double v2, v7

    div-double/2addr v0, v2

    const-wide v2, 0x3fb999999999999aL    # 0.1

    cmpg-double v0, v0, v2

    if-gez v0, :cond_9

    .line 70
    sget-object v0, Lo/dxn;->B:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    :cond_9
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSlumberSleepTime()I

    move-result v0

    int-to-double v0, v0

    int-to-double v2, p2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    int-to-double v2, v7

    div-double/2addr v0, v2

    const-wide v2, 0x3fd3333333333333L    # 0.3

    cmpl-double v0, v0, v2

    if-lez v0, :cond_a

    .line 73
    sget-object v0, Lo/dxn;->D:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_a
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    cmpg-double v0, v8, v0

    if-gez v0, :cond_b

    .line 76
    sget-object v0, Lo/dxn;->C:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    :cond_b
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_c

    .line 79
    sget-object v0, Lo/dxn;->z:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    :cond_c
    invoke-static {v6}, Lo/dxq;->d(Ljava/util/List;)I

    move-result v0

    return v0
.end method
