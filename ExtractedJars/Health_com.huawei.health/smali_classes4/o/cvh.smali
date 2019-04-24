.class public Lo/cvh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 208
    const-wide v0, 0x757b041a0L

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 209
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption groupUnitType is YEAR endTime - startTime should >= one year"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 211
    :cond_0
    return-void
.end method

.method private b(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 106
    if-lez p1, :cond_0

    invoke-static {p1}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v0

    sget-object v1, Lo/cmk$b;->d:Lo/cmk$b;

    if-eq v0, v1, :cond_0

    .line 107
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption alignType is not SESSION"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 109
    :cond_0
    return-void
.end method

.method private b(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 190
    const-wide/32 v0, 0x52571a0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 191
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption groupUnitType is DAY endTime - startTime should >= one day"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 193
    :cond_0
    return-void
.end method

.method private b(JI)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 158
    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 161
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lo/cvh;->c(J)V

    .line 162
    goto :goto_1

    .line 164
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lo/cvh;->b(J)V

    .line 165
    goto :goto_1

    .line 167
    :pswitch_2
    invoke-direct {p0, p1, p2}, Lo/cvh;->d(J)V

    .line 168
    goto :goto_1

    .line 170
    :pswitch_3
    invoke-direct {p0, p1, p2}, Lo/cvh;->e(J)V

    .line 171
    goto :goto_1

    .line 173
    :pswitch_4
    invoke-direct {p0, p1, p2}, Lo/cvh;->a(J)V

    .line 174
    goto :goto_1

    .line 177
    :pswitch_5
    goto :goto_1

    .line 179
    :goto_0
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption groupUnitType is out of rang "

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 181
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private b(Lcom/huawei/hihealth/HiAggregateOption;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 55
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 56
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_0
    return-void
.end method

.method private c(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 184
    const-wide/32 v0, 0x5265c00

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 185
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption groupUnitType is MINUTE or HOUR endTime - startTime should < one day"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 187
    :cond_0
    return-void
.end method

.method private c(Lo/cmk$b;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 122
    sget-object v0, Lo/cvh$4;->c:[I

    invoke-virtual {p1}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 125
    :pswitch_0
    if-lez p3, :cond_0

    .line 126
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption types is SESSION alignType should equal O"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 128
    :cond_0
    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x6

    if-eq p2, v0, :cond_2

    .line 129
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption types is SESSION aggregateType should be SUM or CLUSTER_COUNT"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :pswitch_1
    goto :goto_1

    .line 136
    :pswitch_2
    if-lez p3, :cond_1

    .line 137
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption types is SEQUENCE alignType should equal O"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_1
    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    .line 140
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption types is SEQUENCE aggregateType should be SUM"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 145
    :pswitch_3
    if-lez p3, :cond_2

    .line 146
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption types is STAT alignType should equal O"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 150
    :pswitch_4
    goto :goto_1

    .line 153
    :goto_0
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption types is out of rang "

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 155
    :cond_2
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private c(Lo/cmk$b;[I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 113
    move-object v2, p2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget v5, v2, v4

    .line 114
    invoke-static {v5}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v0

    if-eq p1, v0, :cond_0

    .line 115
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption types is not same category"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 113
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 118
    :cond_1
    return-void
.end method

.method private d(II)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 79
    if-eq p1, p2, :cond_0

    .line 80
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption constantsKey length not equal types length"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 82
    :cond_0
    return-void
.end method

.method private d(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 196
    const-wide/32 v0, 0x240b99a0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 197
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption groupUnitType is WEEK endTime - startTime should >= one week"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 199
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/hihealth/HiAggregateOption;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 91
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getReadType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 94
    :pswitch_0
    goto :goto_1

    .line 97
    :pswitch_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cvh;->d(Ljava/lang/String;)V

    .line 98
    goto :goto_1

    .line 101
    :goto_0
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption readType is out of rang"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 103
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private d(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 85
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    :cond_0
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption readType is READ_USER_DEVICE deviceUUID should be not null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 88
    :cond_1
    return-void
.end method

.method private e(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 202
    const-wide v0, 0x903125a0L

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 203
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption groupUnitType is MONTH endTime - startTime should >= one month"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 205
    :cond_0
    return-void
.end method

.method private e(JJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 61
    cmp-long v0, p1, p3

    if-lez v0, :cond_0

    .line 62
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption startTime is bigger than endTime"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_0
    return-void
.end method

.method private e([I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 67
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 68
    :cond_0
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption types is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_1
    return-void
.end method

.method private e([Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 73
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 74
    :cond_0
    new-instance v0, Lo/cvo;

    const-string v1, "HiAggregateOption constantsKey is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_1
    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/hihealth/HiAggregateOption;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1}, Lo/cvh;->b(Lcom/huawei/hihealth/HiAggregateOption;)V

    .line 22
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v3

    .line 23
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v5

    .line 25
    invoke-direct {p0, v3, v4, v5, v6}, Lo/cvh;->e(JJ)V

    .line 27
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v7

    .line 28
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v8

    .line 30
    invoke-direct {p0, v7}, Lo/cvh;->e([I)V

    .line 32
    invoke-direct {p0, v8}, Lo/cvh;->e([Ljava/lang/String;)V

    .line 34
    array-length v0, v7

    array-length v1, v8

    invoke-direct {p0, v0, v1}, Lo/cvh;->d(II)V

    .line 37
    invoke-direct {p0, p1}, Lo/cvh;->d(Lcom/huawei/hihealth/HiAggregateOption;)V

    .line 40
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getAlignType()I

    move-result v9

    .line 41
    invoke-direct {p0, v9}, Lo/cvh;->b(I)V

    .line 44
    const/4 v0, 0x0

    aget v0, v7, v0

    invoke-static {v0}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v10

    .line 45
    invoke-direct {p0, v10, v7}, Lo/cvh;->c(Lo/cmk$b;[I)V

    .line 48
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getAggregateType()I

    move-result v0

    invoke-direct {p0, v10, v0, v9}, Lo/cvh;->c(Lo/cmk$b;II)V

    .line 51
    sub-long v0, v5, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getGroupUnitType()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lo/cvh;->b(JI)V

    .line 52
    return-void
.end method
