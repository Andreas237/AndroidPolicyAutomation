.class public Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private beginDate:Ljava/lang/String;

.field private cumulativeBodybuilding:I

.field private cumulativeRun:I

.field private cumulativeStep:I

.field private endDate:Ljava/lang/String;

.field private redPacketId:I

.field private singleBodybuilding:I

.field private singleRun:I

.field private singleStep:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBeginDate()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->beginDate:Ljava/lang/String;

    return-object v0
.end method

.method public getCumulativeBodybuilding()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->cumulativeBodybuilding:I

    return v0
.end method

.method public getCumulativeRun()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->cumulativeRun:I

    return v0
.end method

.method public getCumulativeStep()I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->cumulativeStep:I

    return v0
.end method

.method public getEndDate()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->endDate:Ljava/lang/String;

    return-object v0
.end method

.method public getRedPacketId()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->redPacketId:I

    return v0
.end method

.method public getSingleBodybuilding()I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->singleBodybuilding:I

    return v0
.end method

.method public getSingleRun()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->singleRun:I

    return v0
.end method

.method public getSingleStep()I
    .locals 1

    .line 97
    iget v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->singleStep:I

    return v0
.end method

.method public setBeginDate(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->beginDate:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setCumulativeBodybuilding(I)V
    .locals 0

    .line 45
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->cumulativeBodybuilding:I

    .line 46
    return-void
.end method

.method public setCumulativeRun(I)V
    .locals 0

    .line 53
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->cumulativeRun:I

    .line 54
    return-void
.end method

.method public setCumulativeStep(I)V
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->cumulativeStep:I

    .line 62
    return-void
.end method

.method public setEndDate(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->endDate:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public setRedPacketId(I)V
    .locals 0

    .line 77
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->redPacketId:I

    .line 78
    return-void
.end method

.method public setSingleBodybuilding(I)V
    .locals 0

    .line 85
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->singleBodybuilding:I

    .line 86
    return-void
.end method

.method public setSingleRun(I)V
    .locals 0

    .line 93
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->singleRun:I

    .line 94
    return-void
.end method

.method public setSingleStep(I)V
    .locals 0

    .line 101
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->singleStep:I

    .line 102
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RedRulesBean{beginDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->beginDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cumulativeBodybuilding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->cumulativeBodybuilding:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cumulativeRun="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->cumulativeRun:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cumulativeStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->cumulativeStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->endDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", redPacketId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->redPacketId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", singleBodybuilding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->singleBodybuilding:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", singleRun="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->singleRun:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", singleStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;->singleStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
