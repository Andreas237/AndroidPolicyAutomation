.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V
    .locals 0

    .line 1493
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1496
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->o(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_rank_by_day:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1497
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->m(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1498
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->n(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1499
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->p(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    .line 1500
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 1501
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    .line 1502
    invoke-static {v3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_time_period"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rank_date_by_day"

    .line 1501
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1503
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->s(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1504
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1505
    new-instance v6, Lo/dcy;

    invoke-direct {v6}, Lo/dcy;-><init>()V

    .line 1506
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    .line 1507
    invoke-static {v3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_date"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aget-object v3, v3, v4

    .line 1506
    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1509
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->t(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    .line 1510
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->q(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    .line 1511
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->r(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 1512
    return-void
.end method
