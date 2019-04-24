.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aog;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

.field final synthetic d:J


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;J)V
    .locals 0

    .line 805
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$17;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    iput-wide p2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$17;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;)V
    .locals 8

    .line 808
    if-eqz p1, :cond_3

    .line 809
    const-string v0, "0"

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;->getResultCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 810
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;->getGroupInfoList()Ljava/util/List;

    move-result-object v5

    .line 811
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 812
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;

    .line 813
    if-eqz v7, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$17;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 814
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$17;->d:J

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->getGroupId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 815
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "info.getGroupId() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->getGroupId()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 816
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$17;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->getGroupAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setHealthGroupAddress(Ljava/lang/String;)V

    .line 817
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$17;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->getGroupDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setHealthGroupDesc(Ljava/lang/String;)V

    .line 818
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$17;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupInfoBean;->getGroupType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setHealthGroupType(Ljava/lang/String;)V

    .line 819
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthGroupInfoBean = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    goto :goto_1

    .line 823
    :cond_0
    goto/16 :goto_0

    .line 825
    :cond_1
    :goto_1
    goto :goto_2

    .line 826
    :cond_2
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getGroupInfoByIds getResultCode == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;->getResultCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 829
    :cond_3
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthGetGroupInfoByIdsBean == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 831
    :goto_2
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 835
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", result:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 805
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$17;->c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupInfoByIdsBean;)V

    return-void
.end method
