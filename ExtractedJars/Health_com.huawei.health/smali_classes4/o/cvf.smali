.class public Lo/cvf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(ILcom/huawei/hihealth/HiHealthData;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 86
    invoke-static {p1}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v3

    .line 87
    sget-object v0, Lo/cvf$3;->a:[I

    invoke-virtual {v3}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 89
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lo/cvf;->d(ILcom/huawei/hihealth/HiHealthData;)V

    .line 90
    goto :goto_1

    .line 92
    :pswitch_1
    invoke-direct {p0, p2}, Lo/cvf;->c(Lcom/huawei/hihealth/HiHealthData;)V

    .line 93
    goto :goto_1

    .line 95
    :pswitch_2
    goto :goto_1

    .line 97
    :pswitch_3
    invoke-direct {p0, p1, p2}, Lo/cvf;->e(ILcom/huawei/hihealth/HiHealthData;)V

    .line 98
    goto :goto_1

    .line 100
    :pswitch_4
    invoke-direct {p0, p2}, Lo/cvf;->b(Lcom/huawei/hihealth/HiHealthData;)V

    .line 101
    goto :goto_1

    .line 103
    :pswitch_5
    goto :goto_1

    .line 105
    :pswitch_6
    invoke-direct {p0, p2}, Lo/cvf;->a(Lcom/huawei/hihealth/HiHealthData;)V

    .line 106
    goto :goto_1

    .line 108
    :pswitch_7
    goto :goto_1

    .line 110
    :goto_0
    new-instance v0, Lo/cvo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown data type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 112
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method private a(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 115
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v4

    .line 116
    invoke-static {v4}, Lo/cmi;->h(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 117
    new-instance v0, Lo/cvo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknow data type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 119
    :cond_0
    invoke-static {v4}, Lo/cmi;->i(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 120
    const/4 v0, 0x3

    invoke-static {v5, v0}, Lo/cmi;->c(II)Ljava/lang/Object;

    move-result-object v6

    .line 121
    const/4 v0, 0x4

    invoke-static {v5, v0}, Lo/cmi;->c(II)Ljava/lang/Object;

    move-result-object v7

    .line 122
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 123
    new-instance v0, Lo/cvo;

    const-string v1, "max value is too large"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 125
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 126
    new-instance v0, Lo/cvo;

    const-string v1, "min value is too little"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 128
    :cond_2
    return-void
.end method

.method private a(JJ)Z
    .locals 4

    .line 165
    const-wide/32 v0, 0xea60

    rem-long v0, p1, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const-wide/32 v0, 0xea60

    rem-long v0, p3, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    sub-long v0, p3, p1

    const-wide/32 v2, 0xea60

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private b(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 157
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v3

    .line 158
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v5

    .line 159
    invoke-direct {p0, v3, v4, v5, v6}, Lo/cvf;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 160
    new-instance v0, Lo/cvo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SESSION time is not one minite or not currentMinite startTime = "

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

    .line 162
    :cond_0
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 60
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 62
    :cond_0
    new-instance v0, Lo/cvo;

    const-string v1, "List<HiHealthData> is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 65
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v2

    .line 66
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 67
    :cond_2
    new-instance v0, Lo/cvo;

    const-string v1, "deviceUUID is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_3
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getOwnerID()I

    move-result v3

    .line 70
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 72
    if-nez v5, :cond_4

    .line 73
    new-instance v0, Lo/cvo;

    const-string v1, "List<HiHealthData> has a null data"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_4
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 76
    new-instance v0, Lo/cvo;

    const-string v1, "deviceUUID is not the same"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_5
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getOwnerID()I

    move-result v0

    if-eq v3, v0, :cond_6

    .line 79
    new-instance v0, Lo/cvo;

    const-string v1, "ownerID is not the same"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_6
    invoke-direct {p0, v5}, Lo/cvf;->e(Lcom/huawei/hihealth/HiHealthData;)V

    .line 82
    goto :goto_0

    .line 83
    :cond_7
    return-void
.end method

.method private c(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 142
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 143
    new-instance v0, Lo/cvo;

    const-string v1, "SEQUENCE metaData is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 145
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSequenceFileUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 146
    new-instance v0, Lo/cvo;

    const-string v1, "SEQUENCE sequenceData and sequenceFileUrl is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 148
    :cond_1
    return-void
.end method

.method private d(ILcom/huawei/hihealth/HiHealthData;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 131
    invoke-static {p1, p2}, Lo/cno;->d(ILcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    new-instance v0, Lo/cvo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "POINT pointValue is out of range type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :cond_0
    invoke-static {p1}, Lo/cmk;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 135
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    invoke-direct {p0, v0, v1, v2, v3}, Lo/cvf;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 136
    new-instance v0, Lo/cvo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "time is not one minite or not currentMinite type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_1
    return-void
.end method

.method private e(ILcom/huawei/hihealth/HiHealthData;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 151
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lo/cno;->a(ID)Z

    move-result v0

    if-nez v0, :cond_0

    .line 152
    new-instance v0, Lo/cvo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "STAT statValue is out of range type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 154
    :cond_0
    return-void
.end method

.method private e(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 37
    if-nez p1, :cond_0

    .line 39
    new-instance v0, Lo/cvo;

    const-string v1, "HiHealthData is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    .line 43
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v4

    .line 45
    cmp-long v0, v2, v4

    if-gtz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-gtz v0, :cond_2

    .line 47
    :cond_1
    new-instance v0, Lo/cvo;

    const-string v1, "startTime > endTime or startTime <= 0"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 54
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-direct {p0, v0, p1}, Lo/cvf;->a(ILcom/huawei/hihealth/HiHealthData;)V

    .line 55
    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/hihealth/HiDataInsertOption;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 28
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 29
    new-instance v0, Lo/cvo;

    const-string v1, "HiDataInsertOption is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 31
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataInsertOption;->getDatas()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cvf;->b(Ljava/util/List;)V

    .line 32
    return-void
.end method
