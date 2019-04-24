.class public Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/jsoperation/BloodSugar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SamplePointsBean"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;
    }
.end annotation


# instance fields
.field private endTime:J

.field private key:Ljava/lang/String;

.field private startTime:J

.field private unit:Ljava/lang/String;

.field private value:Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public config_setEndTime(J)V
    .locals 0

    .line 109
    iput-wide p1, p0, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->endTime:J

    .line 110
    return-void
.end method

.method public config_setKey(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->key:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public config_setStartTime(J)V
    .locals 0

    .line 117
    iput-wide p1, p0, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->startTime:J

    .line 118
    return-void
.end method

.method public config_setUnit(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->unit:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public config_setValue(Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->value:Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;

    .line 94
    return-void
.end method

.method public fetch_getEndTime()J
    .locals 2

    .line 105
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->endTime:J

    return-wide v0
.end method

.method public fetch_getKey()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->key:Ljava/lang/String;

    return-object v0
.end method

.method public fetch_getStartTime()J
    .locals 2

    .line 113
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->startTime:J

    return-wide v0
.end method

.method public fetch_getUnit()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public fetch_getValue()Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean;->value:Lcom/huawei/operation/jsoperation/BloodSugar$SamplePointsBean$ValueBean;

    return-object v0
.end method
