.class public Lcom/sina/weibo/sdk/statistic/WBAgent;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TAG:Ljava/lang/String; = "WBAgent"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static onEvent(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 111
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/sina/weibo/sdk/statistic/WBAgent;->onEvent(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V

    .line 112
    return-void
.end method

.method public static onEvent(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 116
    if-nez p0, :cond_0

    .line 117
    const-string v0, "WBAgent"

    const-string v1, "unexpected null page or activity in onEvent"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    return-void

    .line 120
    :cond_0
    if-nez p1, :cond_1

    .line 121
    const-string v0, "WBAgent"

    const-string v1, "unexpected null eventId in onEvent"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    return-void

    .line 125
    :cond_1
    instance-of v0, p0, Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    .line 129
    :cond_2
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->getInstance()Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->onEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 130
    return-void
.end method

.method public static onKillProcess()V
    .locals 1

    .line 162
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->getInstance()Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->onKillProcess()V

    .line 163
    return-void
.end method

.method public static onPageEnd(Ljava/lang/String;)V
    .locals 1

    .line 89
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 90
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->getInstance()Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->onPageEnd(Ljava/lang/String;)V

    .line 92
    :cond_0
    return-void
.end method

.method public static onPageStart(Ljava/lang/String;)V
    .locals 1

    .line 83
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 84
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->getInstance()Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->onPageStart(Ljava/lang/String;)V

    .line 86
    :cond_0
    return-void
.end method

.method public static onPause(Landroid/content/Context;)V
    .locals 2

    .line 103
    if-nez p0, :cond_0

    .line 104
    const-string v0, "WBAgent"

    const-string v1, "unexpected null context in onResume"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    return-void

    .line 107
    :cond_0
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->getInstance()Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->onPause(Landroid/content/Context;)V

    .line 108
    return-void
.end method

.method public static onResume(Landroid/content/Context;)V
    .locals 2

    .line 95
    if-nez p0, :cond_0

    .line 96
    const-string v0, "WBAgent"

    const-string v1, "unexpected null context in onResume"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    return-void

    .line 99
    :cond_0
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->getInstance()Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->onResume(Landroid/content/Context;)V

    .line 100
    return-void
.end method

.method public static onStop(Landroid/content/Context;)V
    .locals 2

    .line 151
    if-nez p0, :cond_0

    .line 152
    const-string v0, "WBAgent"

    const-string v1, "unexpected null context in onStop"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    return-void

    .line 155
    :cond_0
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->getInstance()Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->onStop(Landroid/content/Context;)V

    .line 156
    return-void
.end method

.method public static openActivityDurationTrack(Z)V
    .locals 0

    .line 25
    sput-boolean p0, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->ACTIVITY_DURATION_OPEN:Z

    .line 26
    return-void
.end method

.method public static registerApptoAd(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 182
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    const-string v0, "WBAgent"

    const-string v1, "registerApptoAd appKey is  null  "

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    return-void

    .line 186
    :cond_0
    invoke-static {p1}, Lcom/sina/weibo/sdk/statistic/WBAgent;->setAppKey(Ljava/lang/String;)V

    .line 187
    invoke-static {p2}, Lcom/sina/weibo/sdk/statistic/WBAgent;->setChannel(Ljava/lang/String;)V

    .line 188
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->getInstance()Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p3}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->registerApptoAd(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 189
    return-void
.end method

.method public static setAppKey(Ljava/lang/String;)V
    .locals 0

    .line 43
    invoke-static {p0}, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->setAppkey(Ljava/lang/String;)V

    .line 44
    return-void
.end method

.method public static setChannel(Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-static {p0}, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->setChannel(Ljava/lang/String;)V

    .line 53
    return-void
.end method

.method public static setDebugMode(ZZ)V
    .locals 0

    .line 166
    sput-boolean p0, Lcom/sina/weibo/sdk/utils/LogUtil;->sIsLogEnable:Z

    .line 167
    invoke-static {p1}, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->setNeedGizp(Z)V

    .line 168
    return-void
.end method

.method public static setForceUploadInterval(J)V
    .locals 0

    .line 70
    invoke-static {p0, p1}, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->setForceUploadInterval(J)V

    .line 71
    return-void
.end method

.method public static setNeedGzip(Z)V
    .locals 0

    .line 79
    invoke-static {p0}, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->setNeedGizp(Z)V

    .line 80
    return-void
.end method

.method public static setSessionContinueMillis(J)V
    .locals 0

    .line 34
    sput-wide p0, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->kContinueSessionMillis:J

    .line 35
    return-void
.end method

.method public static setUploadInterval(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 62
    invoke-static {p0, p1}, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->setUploadInterval(J)V

    .line 63
    return-void
.end method

.method public static uploadAppLogs(Landroid/content/Context;)V
    .locals 2

    .line 138
    if-nez p0, :cond_0

    .line 139
    const-string v0, "WBAgent"

    const-string v1, "unexpected null context in uploadAppLogs"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    return-void

    .line 142
    :cond_0
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->getInstance()Lcom/sina/weibo/sdk/statistic/WBAgentHandler;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/sina/weibo/sdk/statistic/WBAgentHandler;->uploadAppLogs(Landroid/content/Context;)V

    .line 143
    return-void
.end method
