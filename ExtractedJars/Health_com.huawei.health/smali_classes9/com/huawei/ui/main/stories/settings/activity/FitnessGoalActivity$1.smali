.class Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;
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
.field final synthetic b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)V
    .locals 0

    .line 616
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 9

    .line 619
    const/4 v5, 0x4

    .line 622
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    mul-int/lit16 v1, p2, 0x2710

    int-to-double v1, v1

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    div-double/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;D)D

    .line 623
    if-gt p2, v5, :cond_0

    .line 624
    const/4 p2, 0x4

    .line 625
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->y(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhu;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/fhu;->setProgress(I)V

    .line 626
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    const-wide/high16 v1, 0x4079000000000000L    # 400.0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;D)D

    .line 633
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->o(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->z(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 636
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->q(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->z(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fhp;->c(D)Ljava/lang/String;

    move-result-object v6

    .line 637
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->s(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 640
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

    const-string v3, ", mGoalDistance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->z(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mUserInfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->k(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 641
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->q(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->z(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)D

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->k(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/fhp;->d(DLcom/huawei/up/model/UserInfomation;)I

    move-result v7

    .line 642
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->q(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lo/fhp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;->k(Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    invoke-virtual {v0, v7, v1}, Lo/fhp;->a(ILcom/huawei/up/model/UserInfomation;)[I

    move-result-object v8

    .line 643
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

    .line 644
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

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

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

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

    .line 646
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/FitnessGoalActivity;

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

    .line 647
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 651
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 655
    return-void
.end method
