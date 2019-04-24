.class public Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig$HeartRateZone;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FitHRZoneConfig"


# instance fields
.field public aerobicThreshold:I

.field public anaerobicThreshold:I

.field public fatBurnThreshold:I

.field public maxThreshold:I

.field public minThreshold:I

.field public warmUpThreshold:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleBits(IZ)I
    .locals 5

    .line 33
    const/4 v4, 0x0

    .line 34
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 36
    :pswitch_0
    if-eqz p2, :cond_0

    .line 37
    iget v4, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->minThreshold:I

    goto/16 :goto_1

    .line 39
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->warmUpThreshold:I

    add-int/lit8 v4, v0, -0x1

    .line 41
    goto/16 :goto_1

    .line 43
    :pswitch_1
    if-eqz p2, :cond_1

    .line 44
    iget v4, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->warmUpThreshold:I

    goto :goto_1

    .line 46
    :cond_1
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->fatBurnThreshold:I

    add-int/lit8 v4, v0, -0x1

    .line 48
    goto :goto_1

    .line 50
    :pswitch_2
    if-eqz p2, :cond_2

    .line 51
    iget v4, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->fatBurnThreshold:I

    goto :goto_1

    .line 53
    :cond_2
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->aerobicThreshold:I

    add-int/lit8 v4, v0, -0x1

    .line 55
    goto :goto_1

    .line 57
    :pswitch_3
    if-eqz p2, :cond_3

    .line 58
    iget v4, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->aerobicThreshold:I

    goto :goto_1

    .line 60
    :cond_3
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->anaerobicThreshold:I

    add-int/lit8 v4, v0, -0x1

    .line 62
    goto :goto_1

    .line 64
    :pswitch_4
    if-eqz p2, :cond_4

    .line 65
    iget v4, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->anaerobicThreshold:I

    goto :goto_1

    .line 67
    :cond_4
    iget v4, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->maxThreshold:I

    .line 69
    goto :goto_1

    .line 71
    :goto_0
    const-string v0, "FitHRZoneConfig"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "heartrateZone should be given right data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    const/4 v0, 0x1

    if-ge p1, v0, :cond_5

    .line 73
    iget v4, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->minThreshold:I

    goto :goto_1

    .line 74
    :cond_5
    const/4 v0, 0x5

    if-le p1, v0, :cond_6

    .line 75
    iget v4, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->maxThreshold:I

    .line 79
    :cond_6
    :goto_1
    return v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public tanslateReserveHeartRate(IZLcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)I
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 84
    const/4 v4, 0x0

    .line 85
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 87
    :pswitch_0
    if-eqz p2, :cond_0

    .line 88
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicBaseThreshold()I

    move-result v4

    goto/16 :goto_1

    .line 90
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicAdvanceThreshold()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    .line 92
    goto/16 :goto_1

    .line 94
    :pswitch_1
    if-eqz p2, :cond_1

    .line 95
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicAdvanceThreshold()I

    move-result v4

    goto/16 :goto_1

    .line 97
    :cond_1
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getLacticAcidThreshold()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    .line 99
    goto :goto_1

    .line 101
    :pswitch_2
    if-eqz p2, :cond_2

    .line 102
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getLacticAcidThreshold()I

    move-result v4

    goto :goto_1

    .line 104
    :cond_2
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicBaseThreshold()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    .line 106
    goto :goto_1

    .line 108
    :pswitch_3
    if-eqz p2, :cond_3

    .line 109
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicBaseThreshold()I

    move-result v4

    goto :goto_1

    .line 111
    :cond_3
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicAdvanceThreshold()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    .line 113
    goto :goto_1

    .line 115
    :pswitch_4
    if-eqz p2, :cond_4

    .line 116
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicAdvanceThreshold()I

    move-result v4

    goto :goto_1

    .line 118
    :cond_4
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getHRRMaxThreshold()I

    move-result v4

    .line 120
    goto :goto_1

    .line 122
    :goto_0
    const-string v0, "FitHRZoneConfig"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "heartrateZone should be given right data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const/4 v0, 0x1

    if-ge p1, v0, :cond_5

    .line 124
    iget v4, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->minThreshold:I

    goto :goto_1

    .line 125
    :cond_5
    const/4 v0, 0x5

    if-le p1, v0, :cond_6

    .line 126
    iget v4, p0, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->maxThreshold:I

    .line 130
    :cond_6
    :goto_1
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
