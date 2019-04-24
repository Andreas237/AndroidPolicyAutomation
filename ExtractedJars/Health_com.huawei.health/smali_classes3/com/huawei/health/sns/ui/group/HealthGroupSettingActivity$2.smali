.class Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c(Lcom/huawei/health/sns/model/group/Group;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

.field final synthetic c:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 1061
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;->a:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1064
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setPositiveButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1065
    invoke-static {}, Lo/ant;->a()Lo/ant;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;->c:Lcom/huawei/health/sns/model/group/Group;

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;)V

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Lo/ant;->a(Lcom/huawei/health/sns/model/group/Group;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1082
    return-void
.end method
