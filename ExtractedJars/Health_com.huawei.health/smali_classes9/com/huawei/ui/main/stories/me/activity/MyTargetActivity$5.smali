.class Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    .line 221
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onProgressChanged() value:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    div-int/lit16 v0, p2, 0x3e8

    mul-int/lit16 v0, v0, 0x3e8

    add-int/lit16 p2, v0, 0x7d0

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-virtual {v0, p2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d(I)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setGoalType(I)V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->a(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->setStepGoal(I)V

    .line 228
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 231
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 234
    return-void
.end method
