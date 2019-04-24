.class Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 90
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 91
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 92
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 93
    const-string v0, "groupType"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 94
    const-string v0, "groupDesc"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$1;->c:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->startActivity(Landroid/content/Intent;)V

    .line 97
    return-void
.end method
