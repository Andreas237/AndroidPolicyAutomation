.class Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$3;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$3;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$3;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isMotionGoalChanged() == true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$3;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$3;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->c(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    goto :goto_0

    .line 140
    :cond_0
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isMotionGoalChanged() == false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$3;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->finish()V

    goto :goto_0

    .line 144
    :cond_1
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick(): mMotionGoal is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$3;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->finish()V

    .line 147
    :goto_0
    return-void
.end method
