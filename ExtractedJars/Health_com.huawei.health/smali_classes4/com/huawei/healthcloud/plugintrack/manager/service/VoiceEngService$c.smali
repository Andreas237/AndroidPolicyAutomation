.class Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;


# direct methods
.method private constructor <init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$4;)V
    .locals 0

    .line 262
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;-><init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 265
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 266
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 269
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/cef;

    move-result-object v0

    invoke-virtual {v0}, Lo/cef;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->i(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 270
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/cef;

    move-result-object v1

    invoke-virtual {v1}, Lo/cef;->e()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b(Landroid/content/Intent;)V

    .line 271
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)V

    goto :goto_0

    .line 273
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->i(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 274
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 275
    invoke-virtual {p0, v2}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->sendMessage(Landroid/os/Message;)Z

    .line 276
    goto :goto_0

    .line 280
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/cef;

    move-result-object v0

    invoke-virtual {v0}, Lo/cef;->c()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->i(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 281
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/cef;

    move-result-object v1

    invoke-virtual {v1}, Lo/cef;->e()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b(Landroid/content/Intent;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;->d:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)V

    .line 289
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
