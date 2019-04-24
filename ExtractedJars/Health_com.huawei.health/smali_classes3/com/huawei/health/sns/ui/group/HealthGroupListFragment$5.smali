.class Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ems$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V
    .locals 0

    .line 326
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSingleTap(I)V
    .locals 3

    .line 329
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 332
    :sswitch_0
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->i(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->startActivity(Landroid/content/Intent;)V

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->e(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;Z)Z

    .line 336
    goto :goto_0

    .line 339
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->g(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 340
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->i(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/qrcode/HealthQRCodeProxyActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 341
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->startActivity(Landroid/content/Intent;)V

    .line 342
    .line 348
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
