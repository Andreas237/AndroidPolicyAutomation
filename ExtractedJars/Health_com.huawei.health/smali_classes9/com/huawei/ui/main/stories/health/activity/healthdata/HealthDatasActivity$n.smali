.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$n;
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
    name = "n"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)V
    .locals 0

    .line 596
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$n;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 5

    .line 599
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity for stressLayout begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 601
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$n;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->h(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$n;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDetailActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 604
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$n;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 606
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$n;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 608
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity for stressLayout end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    return-void
.end method
