.class Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;)V
    .locals 0

    .line 1065
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2$1;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 1068
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "objData = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1069
    const/16 v0, 0xb1

    if-ne p1, v0, :cond_0

    .line 1071
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2$1;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2$1;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->l(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lo/boa;->d(Landroid/content/Context;Ljava/lang/Long;)V

    .line 1073
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2$1;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->p(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lo/aoh;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2$1;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->l(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/aoh;->e(J)V

    .line 1074
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 1075
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 1076
    const-string v0, "HEALTH_ACTION_DISMISSED_GROUP_SUCCESS"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1077
    invoke-virtual {v4, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 1078
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2$1;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 1080
    :cond_0
    return-void
.end method
