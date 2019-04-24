.class Lo/bhl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bhl;->e(Lo/bhl$c;ILcom/huawei/health/sns/model/group/Group;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bhl;

.field final synthetic e:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method constructor <init>(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lo/bhl$2;->d:Lo/bhl;

    iput-object p2, p0, Lo/bhl$2;->e:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 168
    iget-object v0, p0, Lo/bhl$2;->e:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 169
    iget-object v0, p0, Lo/bhl$2;->d:Lo/bhl;

    iget-object v1, p0, Lo/bhl$2;->e:Lcom/huawei/health/sns/model/group/Group;

    invoke-static {v0, v1}, Lo/bhl;->c(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 171
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 172
    iget-object v0, p0, Lo/bhl$2;->d:Lo/bhl;

    invoke-static {v0}, Lo/bhl;->c(Lo/bhl;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 173
    const-string v0, "group"

    iget-object v1, p0, Lo/bhl$2;->e:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 174
    const-string v0, "groupType"

    iget-object v1, p0, Lo/bhl$2;->e:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    const-string v0, "groupDesc"

    iget-object v1, p0, Lo/bhl$2;->e:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 176
    iget-object v0, p0, Lo/bhl$2;->d:Lo/bhl;

    invoke-static {v0}, Lo/bhl;->c(Lo/bhl;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 178
    :goto_0
    return-void
.end method
