.class Lo/bup$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bup;->a(Lcom/huawei/health/suggestion/model/Topic;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/model/Topic;

.field final synthetic e:Lo/bup;


# direct methods
.method constructor <init>(Lo/bup;Lcom/huawei/health/suggestion/model/Topic;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lo/bup$1;->e:Lo/bup;

    iput-object p2, p0, Lo/bup$1;->c:Lcom/huawei/health/suggestion/model/Topic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 184
    iget-object v0, p0, Lo/bup$1;->e:Lo/bup;

    iget-object v0, v0, Lo/bup;->b:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 185
    const-string v0, "FitnessCourseHorizontalHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "view == mRlNametopic.acquireId():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bup$1;->c:Lcom/huawei/health/suggestion/model/Topic;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/Topic;->acquireId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bup$1;->c:Lcom/huawei/health/suggestion/model/Topic;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/Topic;->acquireName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    iget-object v0, p0, Lo/bup$1;->e:Lo/bup;

    iget-object v1, p0, Lo/bup$1;->c:Lcom/huawei/health/suggestion/model/Topic;

    invoke-static {v0, v1}, Lo/bup;->b(Lo/bup;Lcom/huawei/health/suggestion/model/Topic;)V

    .line 187
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/bup$1;->e:Lo/bup;

    iget-object v0, v0, Lo/bup;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 188
    const-string v0, "intent_key_topicid"

    iget-object v1, p0, Lo/bup$1;->c:Lcom/huawei/health/suggestion/model/Topic;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Topic;->acquireId()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 189
    const-string v0, "intent_key_topicname"

    iget-object v1, p0, Lo/bup$1;->c:Lcom/huawei/health/suggestion/model/Topic;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Topic;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 190
    iget-object v0, p0, Lo/bup$1;->e:Lo/bup;

    iget-object v0, v0, Lo/bup;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 192
    :cond_0
    return-void
.end method
