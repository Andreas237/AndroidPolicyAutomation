.class Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/EditText;

.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/widget/EditText;I)V
    .locals 0

    .line 890
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$9;->d:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$9;->a:Landroid/widget/EditText;

    iput p3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$9;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 892
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 893
    const-string v0, "Group_HealthGroupSettingActiv"

    const-string v1, "showEditDialog network is not connected"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 894
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$9;->d:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    .line 895
    return-void

    .line 897
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$9;->d:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$9;->a:Landroid/widget/EditText;

    iget v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$9;->e:I

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/widget/EditText;I)V

    .line 898
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$9;->d:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->g(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 899
    return-void
.end method
