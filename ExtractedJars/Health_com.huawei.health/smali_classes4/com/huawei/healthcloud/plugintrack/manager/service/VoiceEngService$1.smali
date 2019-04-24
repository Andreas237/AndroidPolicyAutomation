.class Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 5

    .line 369
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->e(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->S()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->i(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 370
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The voice was interupted!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)V

    .line 374
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/cef;

    move-result-object v0

    invoke-virtual {v0}, Lo/cef;->b()V

    goto :goto_0

    .line 375
    :cond_0
    if-nez p1, :cond_1

    .line 377
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The voice was phoning!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)V

    .line 381
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/cef;

    move-result-object v0

    invoke-virtual {v0}, Lo/cef;->b()V

    goto :goto_0

    .line 385
    :cond_1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 386
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 387
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v0

    sget-object v1, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-eq v0, v1, :cond_2

    .line 388
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 391
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)V

    .line 395
    :goto_0
    return-void
.end method
