.class public Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private createTime:Ljava/lang/String;

.field private groupAddress:Ljava/lang/String;

.field private groupDesc:Ljava/lang/String;

.field private groupId:J

.field private groupName:Ljava/lang/String;

.field private groupType:Ljava/lang/String;

.field private modifyTime:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCreateTime()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->createTime:Ljava/lang/String;

    return-object v0
.end method

.method public getGroupAddress()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getGroupDesc()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getGroupId()J
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupId:J

    return-wide v0
.end method

.method public getGroupName()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupName:Ljava/lang/String;

    return-object v0
.end method

.method public getGroupType()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupType:Ljava/lang/String;

    return-object v0
.end method

.method public getModifyTime()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->modifyTime:Ljava/lang/String;

    return-object v0
.end method

.method public setCreateTime(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->createTime:Ljava/lang/String;

    .line 103
    return-void
.end method

.method public setGroupAddress(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupAddress:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public setGroupDesc(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupDesc:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public setGroupId(J)V
    .locals 0

    .line 62
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupId:J

    .line 63
    return-void
.end method

.method public setGroupName(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupName:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setGroupType(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupType:Ljava/lang/String;

    .line 95
    return-void
.end method

.method public setModifyTime(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->modifyTime:Ljava/lang/String;

    .line 111
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthGroupInfoBean{groupId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupDesc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupDesc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupAddress=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->groupType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->createTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", modifyTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->modifyTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
