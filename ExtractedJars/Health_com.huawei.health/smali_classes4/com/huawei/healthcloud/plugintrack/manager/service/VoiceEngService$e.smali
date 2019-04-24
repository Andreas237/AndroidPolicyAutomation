.class Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;


# direct methods
.method private constructor <init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$4;)V
    .locals 0

    .line 139
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;-><init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 142
    if-nez p2, :cond_0

    .line 143
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "intent = null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    return-void

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->a(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/ceg;

    move-result-object v0

    if-nez v0, :cond_1

    .line 148
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "voiceEng = null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    return-void

    .line 152
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 154
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " action = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 157
    return-void

    .line 160
    :cond_2
    const-string v0, "action_play_voice"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 163
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->e(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->S()Z

    move-result v0

    if-nez v0, :cond_3

    .line 164
    return-void

    .line 166
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/cef;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/cef;->e(Landroid/content/Intent;)Z

    .line 167
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 168
    const-string v0, "SPEAK_TYPE"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_4

    .line 171
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)V

    .line 174
    :cond_4
    const/4 v0, 0x1

    iput v0, v5, Landroid/os/Message;->what:I

    .line 175
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 177
    goto :goto_0

    .line 178
    :cond_5
    const-string v0, "action_stop_voice"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 180
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->f(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V

    goto :goto_0

    .line 181
    :cond_6
    const-string v0, "action_stop_service"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 182
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->k(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V

    goto :goto_0

    .line 183
    :cond_7
    const-string v0, "ACTION_RESET_MEDIA_IDLE"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 184
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)V

    .line 186
    :cond_8
    :goto_0
    return-void
.end method
