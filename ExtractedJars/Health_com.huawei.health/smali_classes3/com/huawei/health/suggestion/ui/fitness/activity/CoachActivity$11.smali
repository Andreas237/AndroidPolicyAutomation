.class Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V
    .locals 0

    .line 599
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 602
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bwa;->setVisibility(I)V

    .line 604
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->o(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 606
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->m(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 607
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->finish()V

    .line 608
    return-void

    .line 610
    :cond_0
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 611
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 612
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 613
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "bundlekey"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 614
    const-string v0, "bundlekey"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "bundlekey"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 616
    :cond_1
    const-string v0, "workout_record"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 617
    const-string v0, "is_show_rpe"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 618
    invoke-virtual {v4, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 619
    const-string v0, "entrance"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 620
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->startActivity(Landroid/content/Intent;)V

    .line 622
    :cond_2
    goto :goto_0

    .line 623
    :cond_3
    invoke-static {}, Lo/bxb;->b()Lo/bxb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bxb;->d()V

    .line 624
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;Z)Z

    .line 626
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    iget-object v0, v0, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, -0x64

    if-ne v0, v1, :cond_4

    .line 627
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->finish()V

    .line 629
    :cond_4
    return-void
.end method
