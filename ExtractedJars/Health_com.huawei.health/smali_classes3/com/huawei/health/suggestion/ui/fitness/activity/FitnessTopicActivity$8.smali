.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 244
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it is positive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mSelectedList:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->o(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Lo/but;

    move-result-object v0

    invoke-virtual {v0}, Lo/but;->d()Ljava/util/List;

    move-result-object v4

    .line 247
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->n(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 248
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->o(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    .line 249
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->n(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 250
    goto :goto_0

    .line 251
    :cond_0
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete fitworkout size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->o(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->n(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->a(Ljava/util/List;Lo/bui;)V

    .line 265
    return-void
.end method
