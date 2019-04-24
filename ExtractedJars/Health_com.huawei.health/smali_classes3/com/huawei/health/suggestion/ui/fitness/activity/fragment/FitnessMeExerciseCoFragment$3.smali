.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

.field final synthetic e:Lo/ems;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;Lo/ems;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$3;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$3;->e:Lo/ems;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 148
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$3;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Lo/byu;

    move-result-object v0

    invoke-virtual {v0}, Lo/byu;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$3;->e:Lo/ems;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$3;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Lo/byu;

    move-result-object v0

    invoke-virtual {v0}, Lo/byu;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 152
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$3;->e:Lo/ems;

    invoke-virtual {v0}, Lo/ems;->getHeight()I

    move-result v0

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 153
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment$3;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;)Lo/byu;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/byu;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 155
    :cond_0
    return-void
.end method
