.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private a:[Ljava/lang/String;

.field private b:[Landroid/support/v4/app/Fragment;

.field final synthetic c:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;

.field private d:[I

.field private e:[I


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;Landroid/support/v4/app/FragmentManager;)V
    .locals 3

    .line 165
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;

    .line 166
    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 167
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_collected_ok:I

    invoke-virtual {p1, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_load_ok:I

    invoke-virtual {p1, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->a:[Ljava/lang/String;

    .line 168
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_right:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_left:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->e:[I

    .line 170
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_rightn:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_leftn:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->d:[I

    goto :goto_0

    .line 172
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_left:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_right:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->e:[I

    .line 173
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_leftn:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_rightn:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->d:[I

    .line 175
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->a:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [Landroid/support/v4/app/Fragment;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->b:[Landroid/support/v4/app/Fragment;

    .line 176
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->a:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 2

    .line 180
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->b:[Landroid/support/v4/app/Fragment;

    aget-object v1, v0, p1

    .line 181
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 182
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 184
    :sswitch_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a(I)Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    move-result-object v1

    .line 185
    goto :goto_1

    .line 187
    :sswitch_1
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a(I)Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    move-result-object v1

    .line 188
    goto :goto_1

    .line 190
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;->a(I)Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/FitnessMeExerciseCoFragment;

    move-result-object v1

    .line 192
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->b:[Landroid/support/v4/app/Fragment;

    aput-object v1, v0, p1

    .line 194
    :cond_0
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessMeExerciseActivity$c;->a:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public saveState()Landroid/os/Parcelable;
    .locals 1

    .line 199
    const/4 v0, 0x0

    return-object v0
.end method
