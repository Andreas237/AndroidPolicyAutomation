.class Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 690
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$5;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 694
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$5;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    if-nez v0, :cond_0

    .line 695
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exitGroupActivity:groupMemberPopView(),group is a null object"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 697
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$5;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$5;->c:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$5$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$5$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$5;)V

    invoke-static {v0, v1, v2}, Lo/anz;->b(Ljava/lang/Long;Ljava/lang/String;Lo/aog;)V

    .line 712
    :goto_0
    return-void
.end method
