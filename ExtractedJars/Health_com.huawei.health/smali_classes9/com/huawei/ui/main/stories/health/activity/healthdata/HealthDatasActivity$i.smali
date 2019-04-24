.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$i;
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
    name = "i"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)V
    .locals 0

    .line 524
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$i;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 4

    .line 527
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity for sleepLayout begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$i;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    sget-object v1, Lo/dae;->dn:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Ljava/lang/String;)V

    .line 530
    invoke-static {}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 532
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$i;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 535
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$i;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->e()Z

    move-result v1

    invoke-static {}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;->b(Landroid/content/Context;ZZ)V

    .line 537
    :goto_0
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity for sleepLayout end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    return-void
.end method
