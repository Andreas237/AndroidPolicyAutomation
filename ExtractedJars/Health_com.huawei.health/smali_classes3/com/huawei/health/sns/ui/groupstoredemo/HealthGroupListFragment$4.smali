.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ems$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSingleTap(I)V
    .locals 3

    .line 128
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 131
    :sswitch_0
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->startActivity(Landroid/content/Intent;)V

    .line 134
    goto :goto_0

    .line 137
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeProxyActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->startActivity(Landroid/content/Intent;)V

    .line 140
    .line 146
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
