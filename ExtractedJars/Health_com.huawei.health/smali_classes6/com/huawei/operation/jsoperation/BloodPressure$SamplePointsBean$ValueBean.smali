.class public Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ValueBean"
.end annotation


# instance fields
.field private BLOODPRESSURE_DIASTOLIC:D

.field private BLOODPRESSURE_SYSTOLIC:D

.field private DATA_POINT_DYNAMIC_HEARTRATE:D


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public config_setBLOODPRESSURE_DIASTOLIC(I)V
    .locals 2

    .line 136
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;->BLOODPRESSURE_DIASTOLIC:D

    .line 137
    return-void
.end method

.method public config_setBLOODPRESSURE_SYSTOLIC(I)V
    .locals 2

    .line 144
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;->BLOODPRESSURE_SYSTOLIC:D

    .line 145
    return-void
.end method

.method public config_setDATA_POINT_DYNAMIC_HEARTRATE(I)V
    .locals 2

    .line 152
    int-to-double v0, p1

    iput-wide v0, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;->DATA_POINT_DYNAMIC_HEARTRATE:D

    .line 153
    return-void
.end method

.method public fetch_getBLOODPRESSURE_DIASTOLIC()D
    .locals 2

    .line 132
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;->BLOODPRESSURE_DIASTOLIC:D

    return-wide v0
.end method

.method public fetch_getBLOODPRESSURE_SYSTOLIC()D
    .locals 2

    .line 140
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;->BLOODPRESSURE_SYSTOLIC:D

    return-wide v0
.end method

.method public fetch_getDATA_POINT_DYNAMIC_HEARTRATE()D
    .locals 2

    .line 148
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/BloodPressure$SamplePointsBean$ValueBean;->DATA_POINT_DYNAMIC_HEARTRATE:D

    return-wide v0
.end method
