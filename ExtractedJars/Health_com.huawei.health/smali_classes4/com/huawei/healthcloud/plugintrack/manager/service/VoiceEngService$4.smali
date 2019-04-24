.class Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$4;->e:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 209
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopEngine() run"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$4;->e:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;J)J

    .line 212
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$4;->e:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->a(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/ceg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ceg;->c()V

    .line 213
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$4;->e:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->stopSelf()V

    .line 214
    return-void
.end method
