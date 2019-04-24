.class Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a(ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

.field final synthetic c:I

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;ZI)V
    .locals 0

    .line 311
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    iput-boolean p2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;->e:Z

    iput p3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 314
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it is positive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;->e:Z

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->h(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;Z)V

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;Z)V

    goto :goto_0

    .line 320
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;->c:I

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;I)V

    .line 322
    :goto_0
    return-void
.end method
