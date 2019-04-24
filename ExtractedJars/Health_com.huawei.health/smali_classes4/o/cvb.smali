.class public Lo/cvb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 36
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 39
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    .line 46
    const/4 v12, 0x0

    :goto_0
    if-ge v12, v3, :cond_5

    .line 47
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 48
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    add-int/lit8 v0, v3, -0x1

    if-lt v12, v0, :cond_2

    .line 52
    goto :goto_3

    .line 55
    :cond_2
    add-int/lit8 v0, v12, 0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 56
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v6

    .line 57
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v8

    .line 58
    sub-long v10, v6, v8

    .line 61
    const-wide/32 v0, 0x2bf20

    cmp-long v0, v10, v0

    if-lez v0, :cond_4

    const-wide/32 v0, 0x1b7740

    cmp-long v0, v10, v0

    if-ltz v0, :cond_3

    .line 62
    goto :goto_2

    .line 65
    :cond_3
    :goto_1
    cmp-long v0, v8, v6

    if-gez v0, :cond_4

    .line 66
    new-instance v0, Lcom/huawei/hihealth/HiHealthData;

    const/16 v1, 0x55f3

    invoke-direct {v0, v1}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    move-object v13, v0

    .line 67
    const-wide/32 v0, 0xea60

    add-long/2addr v0, v8

    invoke-virtual {v13, v8, v9, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 68
    invoke-interface {v2, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    const-wide/32 v0, 0xea60

    add-long/2addr v8, v0

    .line 70
    goto :goto_1

    .line 46
    :cond_4
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 72
    :cond_5
    :goto_3
    return-object v2
.end method
