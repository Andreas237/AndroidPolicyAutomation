.class Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$5;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/Map;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$5;->a:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 168
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrainStatisticsMap errCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 165
    move-object v0, p1

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$5;->d(Ljava/util/Map;)V

    return-void
.end method

.method public d(Ljava/util/Map;)V
    .locals 7

    .line 173
    const-string v0, "duration"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 174
    const-string v0, "UIME_PersonalDataSettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "duration value = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$5;->a:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;

    invoke-static {v0, v4, v5}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;J)J

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$5;->a:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 177
    const/16 v0, 0x64

    iput v0, v6, Landroid/os/Message;->what:I

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity$5;->a:Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/PersonalHonorSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 179
    return-void
.end method
