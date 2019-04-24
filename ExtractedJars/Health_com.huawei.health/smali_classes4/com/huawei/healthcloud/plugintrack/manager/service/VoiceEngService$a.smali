.class Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V
    .locals 0

    .line 485
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method

.method private c()V
    .locals 2

    .line 505
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->a(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)Z

    .line 506
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->f(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V

    .line 507
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/cef;

    move-result-object v0

    invoke-virtual {v0}, Lo/cef;->b()V

    .line 508
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)V

    .line 510
    return-void
.end method


# virtual methods
.method public onCallStateChanged(ILjava/lang/String;)V
    .locals 4

    .line 488
    invoke-super {p0, p1, p2}, Landroid/telephony/PhoneStateListener;->onCallStateChanged(ILjava/lang/String;)V

    .line 489
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCallStateChanged() enter , state is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 492
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->a(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)Z

    .line 493
    goto :goto_0

    .line 495
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;->c()V

    .line 496
    goto :goto_0

    .line 498
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;->c()V

    .line 499
    .line 502
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
