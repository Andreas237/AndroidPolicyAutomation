.class public Lcom/huawei/hihealthservice/old/dataswitch/BloodSugarToHiHealthData;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private changeBloodSugarType(I)I
    .locals 1

    .line 43
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 45
    :pswitch_0
    const/16 v0, 0x7df

    return v0

    .line 48
    :pswitch_1
    const/16 v0, 0x7d9

    return v0

    .line 51
    :pswitch_2
    const/16 v0, 0x7d8

    return v0

    .line 54
    :pswitch_3
    const/16 v0, 0x7dd

    return v0

    .line 57
    :pswitch_4
    const/16 v0, 0x7dc

    return v0

    .line 60
    :pswitch_5
    const/16 v0, 0x7db

    return v0

    .line 63
    :pswitch_6
    const/16 v0, 0x7da

    return v0

    .line 66
    :pswitch_7
    const/16 v0, 0x7de

    return v0

    .line 69
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x501
        :pswitch_2
        :pswitch_1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_7
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public switchBloodSugar(Lcom/huawei/hihealthservice/old/model/BloodSugar;)Lcom/huawei/hihealth/HiHealthData;
    .locals 3

    .line 31
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 32
    :cond_0
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 33
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/BloodSugar;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 34
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/BloodSugar;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 35
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/BloodSugar;->getBloodSugar()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    .line 37
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/BloodSugar;->getSubType()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/dataswitch/BloodSugarToHiHealthData;->changeBloodSugarType(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 38
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 39
    return-object v2
.end method

.method public switchBloodSugars([Lcom/huawei/hihealthservice/old/model/BloodSugar;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Lcom/huawei/hihealthservice/old/model/BloodSugar;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 19
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 20
    const/4 v0, 0x0

    return-object v0

    .line 22
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 24
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    goto :goto_1

    .line 25
    :cond_1
    invoke-virtual {p0, v5}, Lcom/huawei/hihealthservice/old/dataswitch/BloodSugarToHiHealthData;->switchBloodSugar(Lcom/huawei/hihealthservice/old/model/BloodSugar;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 27
    :cond_2
    return-object v1
.end method
