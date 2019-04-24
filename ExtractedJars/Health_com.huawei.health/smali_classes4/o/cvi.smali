.class public Lo/cvi;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c([I)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 36
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 37
    :cond_0
    new-instance v0, Lo/cvo;

    const-string v1, "types is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :cond_1
    move-object v3, p1

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget v6, v3, v5

    .line 40
    invoke-static {v6}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v7

    .line 41
    sget-object v0, Lo/cvi$4;->a:[I

    invoke-virtual {v7}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 43
    :pswitch_0
    goto :goto_2

    .line 45
    :pswitch_1
    goto :goto_2

    .line 47
    :pswitch_2
    goto :goto_2

    .line 49
    :pswitch_3
    goto :goto_2

    .line 51
    :pswitch_4
    goto :goto_2

    .line 53
    :pswitch_5
    goto :goto_2

    .line 55
    :pswitch_6
    goto :goto_2

    .line 57
    :pswitch_7
    goto :goto_2

    .line 59
    :pswitch_8
    goto :goto_2

    .line 61
    :goto_1
    new-instance v0, Lo/cvo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown data type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 64
    :cond_2
    return-void

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
        :pswitch_8
    .end packed-switch
.end method

.method private d(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 67
    if-lez p1, :cond_0

    const/16 v0, 0x4e21

    if-eq p1, v0, :cond_0

    .line 68
    new-instance v0, Lo/cvo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "alignType is error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_0
    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/hihealth/HiDataReadOption;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/cvo;
        }
    .end annotation

    .line 13
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 14
    new-instance v0, Lo/cvo;

    const-string v1, "HiDataReadOption is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cvi;->c([I)V

    .line 19
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getAlignType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/cvi;->d(I)V

    .line 21
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v2

    .line 22
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v4

    .line 24
    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    .line 26
    new-instance v0, Lo/cvo;

    const-string v1, "startTime > endTime"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 28
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getReadType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 29
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 30
    new-instance v0, Lo/cvo;

    const-string v1, "readType = READ_USER_DEVICE but deviceUUID is null"

    invoke-direct {v0, v1}, Lo/cvo;-><init>(Ljava/lang/String;)V

    throw v0

    .line 33
    :cond_2
    return-void
.end method
