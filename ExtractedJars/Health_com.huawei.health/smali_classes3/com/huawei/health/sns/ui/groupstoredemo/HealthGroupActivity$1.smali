.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V
    .locals 0

    .line 1540
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1543
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->y(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1544
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->y(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "run"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1545
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1546
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    const-string v1, "RANK_TYPE_RUN_DISTANCE"

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_0

    .line 1547
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->y(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "riding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1548
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_riding_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1549
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    const-string v1, "RANK_TYPE_RIDING_DISTANCE"

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/lang/String;)Ljava/lang/String;

    goto/16 :goto_0

    .line 1550
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->y(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "bodybuilding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1551
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1552
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    const-string v1, "RANK_TYPE_FITNESS_DURATION"

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 1553
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->y(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "swimming"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1554
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swimming_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1555
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    const-string v1, "RANK_TYPE_SWIMMING_DISTANCE"

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 1558
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1559
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    const-string v1, "RANK_TYPE_RUN_DISTANCE"

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1561
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->p(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    .line 1562
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 1563
    const-string v0, "RANK_TYPE_FITNESS_DURATION"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->x(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1564
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)J

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

    const-string v3, "RANK_TYPE_FITNESS_DURATION"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto/16 :goto_1

    .line 1565
    :cond_5
    const-string v0, "RANK_TYPE_RIDING_DISTANCE"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->x(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1566
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)J

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

    const-string v3, "RANK_TYPE_RIDING_DISTANCE"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto/16 :goto_1

    .line 1567
    :cond_6
    const-string v0, "RANK_TYPE_SWIMMING_DISTANCE"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->x(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1568
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)J

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

    const-string v3, "RANK_TYPE_SWIMMING_DISTANCE"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_1

    .line 1569
    :cond_7
    const-string v0, "RANK_TYPE_RUN_DISTANCE"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->x(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1570
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)J

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

    const-string v3, "RANK_TYPE_RUN_DISTANCE"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1572
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->q(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    .line 1573
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;->e:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->r(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 1574
    return-void
.end method
