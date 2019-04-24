.class public Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private groupUserRankList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;"
        }
    .end annotation
.end field

.field private resultCode:Ljava/lang/String;

.field private resultDesc:Ljava/lang/String;

.field private totalCount:I

.field private userRank:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getGroupUserRank()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->groupUserRankList:Ljava/util/List;

    return-object v0
.end method

.method public getResultCode()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->resultCode:Ljava/lang/String;

    return-object v0
.end method

.method public getResultDesc()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->resultDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getTotalCount()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->totalCount:I

    return v0
.end method

.method public getUserRank()Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->userRank:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    return-object v0
.end method

.method public setGroupUserRank(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;)V"
        }
    .end annotation

    .line 59
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->groupUserRankList:Ljava/util/List;

    .line 60
    return-void
.end method

.method public setResultCode(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->resultCode:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public setResultDesc(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->resultDesc:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public setTotalCount(I)V
    .locals 0

    .line 25
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->totalCount:I

    .line 26
    return-void
.end method

.method public setUserRank(Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->userRank:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 51
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthGroupActivityStatusBean{resultCode=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->resultCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", resultDesc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthEventRankFragmentBean;->resultDesc:Ljava/lang/String;

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
