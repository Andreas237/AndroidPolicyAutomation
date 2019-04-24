.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V
    .locals 0

    .line 400
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 403
    const-string v0, "FitnessMeExerciseCoFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it is positive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    const-string v0, "FitnessMeExerciseCoFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mSelectedList:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Lo/but;

    move-result-object v0

    invoke-virtual {v0}, Lo/but;->d()Ljava/util/List;

    move-result-object v4

    .line 406
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 407
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Ljava/util/List;

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

    .line 408
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 409
    goto :goto_0

    .line 410
    :cond_0
    const-string v0, "FitnessMeExerciseCoFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete fitworkout size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->p(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Ljava/util/List;

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

    .line 411
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->s(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)I

    move-result v0

    if-nez v0, :cond_1

    .line 412
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->o(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;Ljava/util/List;)V

    goto :goto_1

    .line 414
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->u(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    .line 416
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$2;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->r(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V

    .line 417
    return-void
.end method
