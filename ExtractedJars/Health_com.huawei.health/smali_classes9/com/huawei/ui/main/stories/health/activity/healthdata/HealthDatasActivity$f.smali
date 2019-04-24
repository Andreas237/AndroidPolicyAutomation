.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)V
    .locals 0

    .line 434
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$f;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 8

    .line 439
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity for climbLayout begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$f;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    sget-object v1, Lo/dae;->dp:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Ljava/lang/String;)V

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$f;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Lo/cmj;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cms;)V

    .line 442
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 443
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 444
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v6

    .line 445
    const-string v0, "intent_key_query_start_time"

    invoke-virtual {v5, v0, v6, v7}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$f;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 447
    const-string v0, "bundle_key_data"

    invoke-virtual {v4, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 448
    const-string v0, "today_current_climb_total"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$f;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$f;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 450
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity for climbLayout end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    return-void
.end method
