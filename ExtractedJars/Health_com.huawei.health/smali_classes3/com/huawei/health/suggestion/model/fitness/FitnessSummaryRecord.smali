.class public Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private recordsCount:J

.field private recordsEndTime:J

.field private recordsStartTime:J

.field private recordsSumCal:F

.field private recordsSumTime:J

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireRecordType()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->type:I

    return v0
.end method

.method public acquireRecordsCount()J
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->recordsCount:J

    return-wide v0
.end method

.method public acquireRecordsEndTime()J
    .locals 2

    .line 24
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->recordsEndTime:J

    return-wide v0
.end method

.method public acquireRecordsStartTime()J
    .locals 2

    .line 32
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->recordsStartTime:J

    return-wide v0
.end method

.method public acquireRecordsSumCal()F
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->recordsSumCal:F

    return v0
.end method

.method public acquireRecordsSumTime()J
    .locals 2

    .line 56
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->recordsSumTime:J

    return-wide v0
.end method

.method public saveRecordType(I)V
    .locals 0

    .line 20
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->type:I

    .line 21
    return-void
.end method

.method public saveRecordsCount(J)V
    .locals 0

    .line 44
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->recordsCount:J

    .line 45
    return-void
.end method

.method public saveRecordsEndTime(J)V
    .locals 0

    .line 28
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->recordsEndTime:J

    .line 29
    return-void
.end method

.method public saveRecordsStartTime(J)V
    .locals 0

    .line 36
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->recordsStartTime:J

    .line 37
    return-void
.end method

.method public saveRecordsSumCal(F)V
    .locals 0

    .line 52
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->recordsSumCal:F

    .line 53
    return-void
.end method

.method public saveRecordsSumTime(J)V
    .locals 0

    .line 60
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->recordsSumTime:J

    .line 61
    return-void
.end method
