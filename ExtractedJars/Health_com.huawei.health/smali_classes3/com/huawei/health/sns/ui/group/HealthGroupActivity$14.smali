.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 2470
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 2473
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2474
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->E(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    .line 2475
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Z)Z

    .line 2476
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 2477
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->s(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_USER_SELECT_RANK_TYPE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "RANK_TYPE_STEPS"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2478
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->u(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    .line 2480
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->s(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/boa;->a(Landroid/content/Context;Ljava/lang/Long;I)V

    .line 2481
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->h(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 2482
    return-void
.end method
