.class public Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private duration:J

.field private stepSum:I

.field private trackDistanceSum:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->stepSum:I

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->trackDistanceSum:I

    .line 11
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->duration:J

    return-void
.end method


# virtual methods
.method public getDuration()J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->duration:J

    return-wide v0
.end method

.method public getStepSum()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->stepSum:I

    return v0
.end method

.method public getTrackDistanceSum()I
    .locals 1

    .line 14
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->trackDistanceSum:I

    return v0
.end method

.method public setDuration(J)V
    .locals 0

    .line 34
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->duration:J

    .line 35
    return-void
.end method

.method public setStepSum(I)V
    .locals 0

    .line 26
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->stepSum:I

    .line 27
    return-void
.end method

.method public setTrackDistanceSum(I)V
    .locals 0

    .line 18
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->trackDistanceSum:I

    .line 19
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SportsDataBean{stepSum = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->stepSum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", trackDistanceSum = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->trackDistanceSum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", duration = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->duration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
