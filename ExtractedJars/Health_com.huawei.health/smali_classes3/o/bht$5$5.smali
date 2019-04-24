.class Lo/bht$5$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bht$5;->d(Ljava/lang/Object;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bht$5;


# direct methods
.method constructor <init>(Lo/bht$5;)V
    .locals 0

    .line 801
    iput-object p1, p0, Lo/bht$5$5;->c:Lo/bht$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 804
    if-nez p2, :cond_0

    .line 805
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get fitness data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 806
    iget-object v0, p0, Lo/bht$5$5;->c:Lo/bht$5;

    iget-object v0, v0, Lo/bht$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v1, p0, Lo/bht$5$5;->c:Lo/bht$5;

    iget-object v1, v1, Lo/bht$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

    invoke-interface {v0, p1, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 807
    return-void

    .line 809
    :cond_0
    const-string v0, "Group_HealthGroupInteractors"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "objData is : \n "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " \nerr_code is : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 810
    move-object v4, p2

    check-cast v4, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;

    .line 811
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->acquireRecordsSumTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v5, v0, v2

    .line 812
    iget-object v0, p0, Lo/bht$5$5;->c:Lo/bht$5;

    iget-object v0, v0, Lo/bht$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

    invoke-virtual {v0, v5, v6}, Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;->setDuration(J)V

    .line 813
    iget-object v0, p0, Lo/bht$5$5;->c:Lo/bht$5;

    iget-object v0, v0, Lo/bht$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v1, p0, Lo/bht$5$5;->c:Lo/bht$5;

    iget-object v1, v1, Lo/bht$5;->c:Lcom/huawei/health/sns/ui/group/healthbeans/SportsDataBean;

    invoke-interface {v0, p1, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 814
    return-void
.end method
