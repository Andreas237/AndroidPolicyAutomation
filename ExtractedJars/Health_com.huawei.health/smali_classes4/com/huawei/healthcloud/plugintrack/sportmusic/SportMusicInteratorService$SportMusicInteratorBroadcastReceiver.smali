.class public Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SportMusicInteratorBroadcastReceiver"
.end annotation


# instance fields
.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 101
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    .line 102
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    .line 103
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 107
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 108
    :cond_0
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent or action is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    return-void

    .line 112
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    if-nez v0, :cond_2

    .line 113
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHandler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    return-void

    .line 117
    :cond_2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 118
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const-string v0, "action_stop_play_sport_music"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 121
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    const/16 v1, 0x7d2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 122
    const-string v0, "extroInfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    .line 123
    invoke-virtual {v5, v6}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 124
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 125
    const/4 v0, -0x1

    iput v0, v5, Landroid/os/Message;->arg1:I

    .line 133
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 136
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    const/16 v1, 0x7d6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 137
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v7, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 139
    goto/16 :goto_0

    :cond_4
    const-string v0, "action_send_steprate_to_hwmusic"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 141
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    const/16 v1, 0x7d3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 142
    const-string v0, "stepRate"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, v5, Landroid/os/Message;->arg1:I

    .line 143
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 144
    goto :goto_0

    :cond_5
    const-string v0, "action_next_song"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 145
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    const/16 v1, 0x7d1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 146
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 147
    goto :goto_0

    :cond_6
    const-string v0, "action_pause_song"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 148
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    const/16 v1, 0x7d4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 149
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 150
    goto :goto_0

    :cond_7
    const-string v0, "action_play_song"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 151
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    const/16 v1, 0x7d5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 152
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$SportMusicInteratorBroadcastReceiver;->c:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 155
    :cond_8
    :goto_0
    return-void
.end method
