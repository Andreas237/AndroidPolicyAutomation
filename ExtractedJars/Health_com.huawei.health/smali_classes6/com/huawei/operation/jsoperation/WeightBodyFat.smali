.class public Lcom/huawei/operation/jsoperation/WeightBodyFat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean;
    }
.end annotation


# instance fields
.field private endTime:J

.field private samplePoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean;>;"
        }
    .end annotation
.end field

.field private startTime:J

.field private timeZone:Ljava/lang/String;

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public config_setEndTime(J)V
    .locals 0

    .line 38
    iput-wide p1, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat;->endTime:J

    .line 39
    return-void
.end method

.method public config_setSamplePoints(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean;>;)V"
        }
    .end annotation

    .line 62
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat;->samplePoints:Ljava/util/List;

    .line 63
    return-void
.end method

.method public config_setStartTime(J)V
    .locals 0

    .line 30
    iput-wide p1, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat;->startTime:J

    .line 31
    return-void
.end method

.method public config_setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat;->timeZone:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public config_setType(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat;->type:I

    .line 55
    return-void
.end method

.method public fetch_getEndTime()J
    .locals 2

    .line 34
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat;->endTime:J

    return-wide v0
.end method

.method public fetch_getSamplePoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/operation/jsoperation/WeightBodyFat$SamplePointsBean;>;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat;->samplePoints:Ljava/util/List;

    return-object v0
.end method

.method public fetch_getStartTime()J
    .locals 2

    .line 26
    iget-wide v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat;->startTime:J

    return-wide v0
.end method

.method public fetch_getTimeZone()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public fetch_getType()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/operation/jsoperation/WeightBodyFat;->type:I

    return v0
.end method
