.class Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aog;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;)V
    .locals 0

    .line 654
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12$3;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V
    .locals 4

    .line 657
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteGroupActivity:\u5220\u9664\u6d3b\u52a8\u6210\u529f"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12$3;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 660
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12$3;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12$3;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12$3;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;

    iget-object v2, v2, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/boa;->e(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;)V

    .line 662
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12$3;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12;->e:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->l(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xd1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 663
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 667
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteGroupActivity:\u5220\u9664\u6d3b\u52a8\u5931\u8d25"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "\n "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "result = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 668
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 654
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$12$3;->c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V

    return-void
.end method
