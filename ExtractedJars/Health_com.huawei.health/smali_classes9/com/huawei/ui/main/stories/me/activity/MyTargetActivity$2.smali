.class Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;
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

    .line 129
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    .line 133
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    div-int/lit8 v0, p2, 0x1

    mul-int/lit8 v0, v0, 0x1

    add-int/lit8 p2, v0, 0x2

    .line 136
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weightViewChangeListener onProgressChanged() value: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    int-to-double v2, p2

    invoke-static {v2, v3}, Lo/cxh;->a(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    int-to-double v1, p2

    invoke-static {v1, v2}, Lo/cxh;->a(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setWeight(F)V

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalType(I)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v0

    int-to-double v1, p2

    invoke-static {v1, v2}, Lo/cxh;->a(D)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalValue(D)V

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V

    goto :goto_0

    .line 143
    :cond_0
    div-int/lit8 v0, p2, 0x1

    mul-int/lit8 v0, v0, 0x1

    add-int/lit8 p2, v0, 0x1

    .line 144
    const-string v0, "Main_MyTargetActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weightViewChangeListener onProgressChanged() value: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    int-to-float v1, p2

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setWeight(F)V

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalType(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->d(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v0

    int-to-double v1, p2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalValue(D)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->b(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;D)V

    .line 150
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity$2;->e:Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;->e(Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 151
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 154
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 157
    return-void
.end method
