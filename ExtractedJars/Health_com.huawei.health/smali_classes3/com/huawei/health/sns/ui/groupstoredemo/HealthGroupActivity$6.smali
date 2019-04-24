.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

.field final synthetic c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;)V
    .locals 0

    .line 1179
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$6;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$6;->a:Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1183
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$6;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1184
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$6;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1185
    const-string v0, "activityId"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$6;->a:Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1186
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$6;->c:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1187
    return-void
.end method
