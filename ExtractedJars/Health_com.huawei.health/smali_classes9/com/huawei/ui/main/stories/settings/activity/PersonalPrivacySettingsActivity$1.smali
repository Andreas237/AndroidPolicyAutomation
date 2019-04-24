.class Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V
    .locals 0

    .line 627
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$1;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 630
    move-object v5, p2

    check-cast v5, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;

    .line 631
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 632
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastClearCloudDataTime null == record"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 633
    return-void

    .line 635
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->getOperateTime()J

    move-result-wide v6

    .line 636
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastClearCloudDataTime time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 637
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$1;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "privacy_last_clear_cloud_data_time"

    .line 638
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 637
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 639
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v8

    .line 640
    const/16 v0, 0x66

    iput v0, v8, Landroid/os/Message;->what:I

    .line 641
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 642
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$1;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 643
    return-void
.end method
