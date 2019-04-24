.class public Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;
.super Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;
.source "SourceFile"


# instance fields
.field private currentTime:Ljava/lang/String;

.field private groupActivity:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

.field private huidList:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getCurrentTime()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->currentTime:Ljava/lang/String;

    return-object v0
.end method

.method public getGroupActivity()Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->groupActivity:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    return-object v0
.end method

.method public getHuidList()[Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->huidList:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 22
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->huidList:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public setCurrentTime(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->currentTime:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setGroupActivity(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->groupActivity:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    .line 63
    return-void
.end method

.method public setHuidList([Ljava/lang/String;)V
    .locals 1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->huidList:[Ljava/lang/String;

    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->huidList:[Ljava/lang/String;

    .line 34
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthGetGroupActivityBean{huidList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->huidList:[Ljava/lang/String;

    .line 45
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupActivity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->groupActivity:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currentTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->currentTime:Ljava/lang/String;

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

    .line 44
    return-object v0
.end method
