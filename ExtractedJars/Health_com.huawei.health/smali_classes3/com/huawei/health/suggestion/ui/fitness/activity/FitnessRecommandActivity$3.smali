.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$3;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 134
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$3;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/LinearLayout;

    .line 136
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 138
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$3;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$3;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;I)V

    .line 140
    :cond_0
    goto :goto_0

    .line 141
    :cond_1
    return-void
.end method
