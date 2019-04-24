.class Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->c(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)V
    .locals 0

    .line 522
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 527
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->g(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 528
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->g(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getCurrentTime()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getBeginTime()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->b(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 529
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->g(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetGroupActivityBean;->getCurrentTime()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getEndTime()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->b(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 530
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_detail_activity_end_edit:I

    invoke-virtual {v1, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 532
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_event_detail_activity_start:I

    invoke-virtual {v1, v2}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 536
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 537
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 538
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->p(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 539
    const-string v0, "EXTRA_GROUP_ACTIVITY_DETAIL"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->h(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 540
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->i(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 544
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity$13;->d:Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;->f(Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 545
    return-void
.end method
