.class Lcom/huawei/health/sns/ui/group/NormalGroupFragment$10;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/NormalGroupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V
    .locals 0

    .line 1400
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$10;->b:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1404
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 1405
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$10;->b:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 1406
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1408
    const-string v0, "QUIT_GROUP_ACTION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1410
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 1412
    :cond_0
    const-string v0, "TRANSFER_GROUP_ACTION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1414
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$10;->b:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->i(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)V

    .line 1417
    :cond_1
    return-void
.end method
