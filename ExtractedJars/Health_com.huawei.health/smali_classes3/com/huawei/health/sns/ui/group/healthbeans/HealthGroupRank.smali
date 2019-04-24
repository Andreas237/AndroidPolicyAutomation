.class public Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private distance:J

.field private duration:J

.field private headImgUrl:Ljava/lang/String;

.field private huid:J

.field private nickName:Ljava/lang/String;

.field private rankNumb:I

.field private steps:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDistance()J
    .locals 2

    .line 59
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->distance:J

    return-wide v0
.end method

.method public getDuration()J
    .locals 2

    .line 67
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->duration:J

    return-wide v0
.end method

.method public getHeadImgUrl()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->headImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getHuid()J
    .locals 2

    .line 27
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->huid:J

    return-wide v0
.end method

.method public getNickName()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->nickName:Ljava/lang/String;

    return-object v0
.end method

.method public getRankNumb()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->rankNumb:I

    return v0
.end method

.method public getSteps()J
    .locals 2

    .line 51
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->steps:J

    return-wide v0
.end method

.method public setDistance(J)V
    .locals 0

    .line 63
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->distance:J

    .line 64
    return-void
.end method

.method public setDuration(J)V
    .locals 0

    .line 71
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->duration:J

    .line 72
    return-void
.end method

.method public setHeadImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->headImgUrl:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setHuid(J)V
    .locals 0

    .line 31
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->huid:J

    .line 32
    return-void
.end method

.method public setNickName(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->nickName:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setRankNumb(I)V
    .locals 0

    .line 22
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->rankNumb:I

    .line 23
    return-void
.end method

.method public setSteps(J)V
    .locals 0

    .line 55
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->steps:J

    .line 56
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthGroupRank{huid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->huid:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nickName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->nickName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headImgUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->headImgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", steps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->steps:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->distance:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->duration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
