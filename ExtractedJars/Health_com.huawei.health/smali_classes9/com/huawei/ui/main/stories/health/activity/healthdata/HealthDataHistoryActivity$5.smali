.class Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 87
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 88
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;Z)V

    goto :goto_0

    .line 91
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 93
    sget-object v0, Lo/acs;->c:Lo/acs;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Lo/acu;

    move-result-object v1

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/acs;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;Z)V

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;Z)V

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$5;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V

    .line 99
    :cond_1
    :goto_0
    return-void
.end method
