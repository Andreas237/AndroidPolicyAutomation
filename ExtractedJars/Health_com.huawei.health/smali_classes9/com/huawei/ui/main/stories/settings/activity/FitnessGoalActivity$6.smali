.class Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;
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

    .line 527
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 9

    .line 530
    const/4 v5, 0x5

    .line 533
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    mul-int/lit16 v1, p2, 0x4e20

    div-int/lit8 v1, v1, 0x64

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;I)I

    .line 534
    if-gt p2, v5, :cond_0

    .line 535
    const/4 p2, 0x5

    .line 536
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->m(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhu;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/fhu;->setProgress(I)V

    .line 537
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    const/16 v1, 0x3e8

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;I)I

    .line 543
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->o(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 546
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->q(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fhp;->e(I)Ljava/lang/String;

    move-result-object v6

    .line 547
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->s(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 550
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onProgressChanged() -> progress="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mGoalStep="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mUserInfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->k(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->q(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->l(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->k(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fhp;->e(ILcom/huawei/up/model/UserInfomation;)I

    move-result v7

    .line 552
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->q(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->k(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    invoke-virtual {v0, v7, v1}, Lo/fhp;->a(ILcom/huawei/up/model/UserInfomation;)[I

    move-result-object v8

    .line 553
    const-string v0, "FitnessGoalActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onProgressChanged() -> times="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v8}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->r(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    aget v1, v8, v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->t(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    aget v1, v8, v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 557
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$6;->a:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->u(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x2

    aget v1, v8, v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 558
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 562
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 566
    return-void
.end method
