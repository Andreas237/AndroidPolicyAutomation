.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$6;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 185
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$6;->e:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    .line 186
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 187
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 189
    :cond_0
    return-void
.end method
