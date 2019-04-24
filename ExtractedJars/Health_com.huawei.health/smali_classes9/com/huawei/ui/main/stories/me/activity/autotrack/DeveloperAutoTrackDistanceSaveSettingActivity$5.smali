.class Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 107
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v1

    invoke-virtual {v1}, Lo/cbl;->i()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v1

    invoke-virtual {v1}, Lo/cbl;->i()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->d(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    goto :goto_0

    .line 110
    :catch_0
    move-exception v4

    .line 111
    const-string v0, "Track_DeveloperAutoTrackDistanceSaveSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can not get autoTrackStatusString "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    const-string v1, "false"

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->a(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->d(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->b(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$5;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->c(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 119
    return-void
.end method
