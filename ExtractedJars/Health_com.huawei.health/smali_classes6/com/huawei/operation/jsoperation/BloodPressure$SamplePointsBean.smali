.class public Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/jsoperation/BloodPressure;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SamplePointsBean"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;
    }
.end annotation


# instance fields
.field private endTime:J

.field private key:Ljava/lang/String;

.field private startTime:J

.field private unit:Ljava/lang/String;

.field private value:Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;


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

    .line 89
    iput-wide p1, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->endTime:J

    .line 90
    return-void
.end method

.method public config_setKey(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->key:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public config_setStartTime(J)V
    .locals 0

    .line 81
    iput-wide p1, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->startTime:J

    .line 82
    return-void
.end method

.method public config_setUnit(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->unit:Ljava/lang/String;

    .line 114
    return-void
.end method

.method public config_setValue(Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->value:Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;

    .line 106
    return-void
.end method

.method public fetch_getEndTime()J
    .locals 2

    .line 93
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->endTime:J

    return-wide v0
.end method

.method public fetch_getKey()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->key:Ljava/lang/String;

    return-object v0
.end method

.method public fetch_getStartTime()J
    .locals 2

    .line 85
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->startTime:J

    return-wide v0
.end method

.method public fetch_getUnit()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public fetch_getValue()Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;->value:Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;

    return-object v0
.end method
