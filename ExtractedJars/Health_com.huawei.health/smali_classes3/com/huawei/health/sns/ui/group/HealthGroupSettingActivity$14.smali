.class Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 0

    .line 1010
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1013
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->n(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    .line 1014
    invoke-static {}, Lo/ant;->a()Lo/ant;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;->c:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lo/ant;->a(Lcom/huawei/health/sns/model/group/Group;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1039
    return-void
.end method
