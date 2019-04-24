.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 107
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;Landroid/os/Message;)V
    .locals 7

    .line 113
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 116
    :sswitch_0
    invoke-static {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->a(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)V

    .line 117
    iget-object v4, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 118
    instance-of v0, v4, Landroid/content/Intent;

    if-nez v0, :cond_0

    .line 120
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownLoadHandler obj is not intent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    return-void

    .line 123
    :cond_0
    move-object v5, v4

    check-cast v5, Landroid/content/Intent;

    .line 124
    const-string v0, "TAG_ALL_CITY_LIST_SA"

    .line 125
    invoke-virtual {v5, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;

    .line 126
    invoke-static {p1, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;)V

    .line 127
    goto :goto_0

    .line 129
    :sswitch_1
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->finish()V

    .line 130
    goto :goto_0

    .line 133
    :sswitch_2
    invoke-static {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)V

    .line 135
    .line 139
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0xc9 -> :sswitch_1
        0xca -> :sswitch_2
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 102
    move-object v0, p1

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;Landroid/os/Message;)V

    return-void
.end method
