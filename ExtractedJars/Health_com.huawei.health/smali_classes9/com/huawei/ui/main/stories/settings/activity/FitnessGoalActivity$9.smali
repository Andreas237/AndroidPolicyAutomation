.class Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V
    .locals 0

    .line 425
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;->d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;->d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->h(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    .line 430
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;->d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->f(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)[Z

    move-result-object v0

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 431
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;->d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->f(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)[Z

    move-result-object v0

    const/4 v1, 0x0

    aput-boolean v1, v0, v2

    .line 430
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 433
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;->d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->f(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)[Z

    move-result-object v0

    const/4 v1, 0x1

    aput-boolean v1, v0, p3

    .line 435
    packed-switch p3, :pswitch_data_0

    goto :goto_1

    .line 437
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;->d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;I)I

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;->d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->i(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    .line 439
    goto :goto_1

    .line 441
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;->d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;I)I

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;->d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->n(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    .line 443
    goto :goto_1

    .line 445
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;->d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;I)I

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$9;->d:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->p(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V

    .line 447
    .line 451
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
