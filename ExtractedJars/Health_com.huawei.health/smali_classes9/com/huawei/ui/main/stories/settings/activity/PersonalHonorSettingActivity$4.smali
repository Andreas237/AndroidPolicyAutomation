.class Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$4;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 7

    .line 145
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " response = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 147
    return-void

    .line 151
    :cond_0
    move-object v4, p2

    :try_start_0
    check-cast v4, Ljava/util/List;

    .line 152
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$4;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;

    const-string v1, "Track_Walk_Distance_Sum"

    invoke-virtual {v5, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;F)F

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$4;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;

    const-string v1, "Track_Run_Distance_Sum"

    invoke-virtual {v5, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;F)F

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$4;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;

    const-string v1, "Track_Ride_Distance_Sum"

    invoke-virtual {v5, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;F)F

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$4;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 157
    const/16 v0, 0x64

    iput v0, v6, Landroid/os/Message;->what:I

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$4;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    goto :goto_0

    .line 159
    :catch_0
    move-exception v4

    .line 160
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSportData data ClassCastException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    :goto_0
    return-void
.end method
