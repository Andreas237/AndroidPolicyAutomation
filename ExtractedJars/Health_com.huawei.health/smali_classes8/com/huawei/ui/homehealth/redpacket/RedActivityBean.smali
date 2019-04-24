.class public Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private beginDate:Ljava/lang/String;

.field private dynamicIcon:Ljava/lang/String;

.field private endDate:Ljava/lang/String;

.field private harvesReminder:Ljava/lang/String;

.field private harvestName:Ljava/lang/String;

.field private homePageFailureRemind:Ljava/lang/String;

.field private homePageIcon:Ljava/lang/String;

.field private iconJumpUrl:Ljava/lang/String;

.field private joinStatus:I

.field private maxCampaignTimes:I

.field private redPacketId:I

.field private redPacketName:Ljava/lang/String;

.field private redRules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBeginDate()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->beginDate:Ljava/lang/String;

    return-object v0
.end method

.method public getDynamicIcon()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->dynamicIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getEndDate()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->endDate:Ljava/lang/String;

    return-object v0
.end method

.method public getHarvesReminder()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->harvesReminder:Ljava/lang/String;

    return-object v0
.end method

.method public getHarvestName()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->harvestName:Ljava/lang/String;

    return-object v0
.end method

.method public getHomePageFailureRemind()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->homePageFailureRemind:Ljava/lang/String;

    return-object v0
.end method

.method public getHomePageIcon()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->homePageIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getIconJumpUrl()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->iconJumpUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getJoinStatus()I
    .locals 1

    .line 107
    iget v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->joinStatus:I

    return v0
.end method

.method public getMaxCampaignTimes()I
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->maxCampaignTimes:I

    return v0
.end method

.method public getRedPacketId()I
    .locals 1

    .line 131
    iget v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->redPacketId:I

    return v0
.end method

.method public getRedPacketName()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->redPacketName:Ljava/lang/String;

    return-object v0
.end method

.method public getRedRules()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;>;"
        }
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->redRules:Ljava/util/List;

    return-object v0
.end method

.method public setBeginDate(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->beginDate:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setDynamicIcon(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->dynamicIcon:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setEndDate(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->endDate:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public setHarvesReminder(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->harvesReminder:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public setHarvestName(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->harvestName:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setHomePageFailureRemind(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->homePageFailureRemind:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public setHomePageIcon(Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->homePageIcon:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public setIconJumpUrl(Ljava/lang/String;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->iconJumpUrl:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public setJoinStatus(I)V
    .locals 0

    .line 111
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->joinStatus:I

    .line 112
    return-void
.end method

.method public setMaxCampaignTimes(I)V
    .locals 0

    .line 119
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->maxCampaignTimes:I

    .line 120
    return-void
.end method

.method public setRedPacketId(I)V
    .locals 0

    .line 135
    iput p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->redPacketId:I

    .line 136
    return-void
.end method

.method public setRedPacketName(Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->redPacketName:Ljava/lang/String;

    .line 128
    return-void
.end method

.method public setRedRules(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/homehealth/redpacket/RedRulesBean;>;)V"
        }
    .end annotation

    .line 143
    iput-object p1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->redRules:Ljava/util/List;

    .line 144
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RedActivityBean{, beginDate=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->beginDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dynamicIcon=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->dynamicIcon:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endDate=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->endDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", harvesReminder=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->harvesReminder:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", harvestName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->harvestName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", homePageFailureRemind=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->homePageFailureRemind:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", homePageIcon=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->homePageIcon:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconJumpUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->iconJumpUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", joinStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->joinStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxCampaignTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->maxCampaignTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", redPacketName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->redPacketName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", redPacketId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->redPacketId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", redRules="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/redpacket/RedActivityBean;->redRules:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
