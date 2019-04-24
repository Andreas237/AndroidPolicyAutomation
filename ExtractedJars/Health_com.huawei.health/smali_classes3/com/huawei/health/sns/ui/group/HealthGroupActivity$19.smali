.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 1454
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$19;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1457
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$19;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1458
    const-string v0, "EXTRA_HEALTH_GROUP_ACT_LIST_GROUP"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$19;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1459
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$19;->a:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 1460
    return-void
.end method
