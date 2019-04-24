.class Lo/bhm$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bhm;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

.field final synthetic d:Lo/bhm;


# direct methods
.method constructor <init>(Lo/bhm;Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/bhm$3;->d:Lo/bhm;

    iput-object p2, p0, Lo/bhm$3;->c:Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 75
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/bhm$3;->d:Lo/bhm;

    invoke-static {v0}, Lo/bhm;->c(Lo/bhm;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 76
    const-string v0, "group"

    iget-object v1, p0, Lo/bhm$3;->d:Lo/bhm;

    invoke-static {v1}, Lo/bhm;->d(Lo/bhm;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 77
    const-string v0, "activityId"

    iget-object v1, p0, Lo/bhm$3;->c:Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 79
    iget-object v0, p0, Lo/bhm$3;->d:Lo/bhm;

    invoke-static {v0}, Lo/bhm;->c(Lo/bhm;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x58

    invoke-virtual {v0, v2, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 80
    return-void
.end method
