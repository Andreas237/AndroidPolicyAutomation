.class Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;)V
    .locals 0

    .line 1014
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 1017
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

    const-string v2, " objData = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1018
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    .line 1019
    const/16 v0, 0xb1

    if-ne p1, v0, :cond_0

    .line 1021
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14$1$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14$1$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14$1;)V

    invoke-static {v0, v1}, Lo/anz;->e(Ljava/lang/Long;Lo/aog;)V

    .line 1032
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1033
    const-string v0, "EXTRA_IS_QUIT_GROUP"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1034
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v4}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 1035
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14$1;->b:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 1037
    :cond_0
    return-void
.end method
