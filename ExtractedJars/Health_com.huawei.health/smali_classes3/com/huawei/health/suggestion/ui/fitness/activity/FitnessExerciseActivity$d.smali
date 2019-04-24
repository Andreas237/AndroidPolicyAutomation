.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity$d;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;Landroid/support/v4/app/FragmentManager;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity$d;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;

    .line 136
    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 137
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 146
    const/4 v0, 0x2

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity$d;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity$d;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessExerciseActivity;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, p1

    return-object v0
.end method
