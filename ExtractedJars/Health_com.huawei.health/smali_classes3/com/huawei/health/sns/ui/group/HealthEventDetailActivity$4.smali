.class Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 792
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 795
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    if-nez v0, :cond_0

    .line 796
    const-string v0, "Group_HealthEventDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTheTitleBarRightButton(), group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 797
    return-void

    .line 799
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 801
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->a(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/view/View;)V

    goto :goto_0

    .line 804
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$4;->b:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->e(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Landroid/view/View;)V

    .line 806
    :goto_0
    return-void
.end method
