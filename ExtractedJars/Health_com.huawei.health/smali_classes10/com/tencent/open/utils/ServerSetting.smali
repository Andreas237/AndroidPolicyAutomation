.class public Lcom/tencent/open/utils/ServerSetting;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APP_DETAIL_PAGE:Ljava/lang/String; = "http://fusion.qq.com/cgi-bin/qzapps/unified_jump?appid=%1$s&from=%2$s&isOpenAppID=1"

.field public static final CGI_FETCH_QQ_URL:Ljava/lang/String; = "http://fusion.qq.com/cgi-bin/qzapps/mapp_getappinfo.cgi"

.field public static final DEFAULT_CGI_AUTHORIZE:Ljava/lang/String; = "http://openmobile.qq.com/oauth2.0/m_authorize?"

.field public static final DEFAULT_LOCAL_STORAGE_URI:Ljava/lang/String; = "http://qzs.qq.com"

.field public static final DEFAULT_REDIRECT_URI:Ljava/lang/String; = "auth://tauth.qq.com/"

.field public static final DEFAULT_URL_ASK:Ljava/lang/String; = "http://qzs.qq.com/open/mobile/request/sdk_request.html?"

.field public static final DEFAULT_URL_BRAG:Ljava/lang/String; = "http://qzs.qq.com/open/mobile/brag/sdk_brag.html?"

.field public static final DEFAULT_URL_GIFT:Ljava/lang/String; = "http://qzs.qq.com/open/mobile/request/sdk_request.html?"

.field public static final DEFAULT_URL_GRAPH_BASE:Ljava/lang/String; = "https://openmobile.qq.com/"

.field public static final DEFAULT_URL_INVITE:Ljava/lang/String; = "http://qzs.qq.com/open/mobile/invite/sdk_invite.html?"

.field public static final DEFAULT_URL_REACTIVE:Ljava/lang/String; = "http://qzs.qq.com/open/mobile/reactive/sdk_reactive.html?"

.field public static final DEFAULT_URL_REPORT:Ljava/lang/String; = "http://wspeed.qq.com/w.cgi"

.field public static final DEFAULT_URL_SEND_STORY:Ljava/lang/String; = "http://qzs.qq.com/open/mobile/sendstory/sdk_sendstory_v1.3.html?"

.field public static final DEFAULT_URL_VOICE:Ljava/lang/String; = "http://qzs.qq.com/open/mobile/not_support.html?"

.field public static final DOWNLOAD_QQ_URL:Ljava/lang/String; = "http://qzs.qq.com/open/mobile/login/qzsjump.html?"

.field public static final DOWNLOAD_QQ_URL_COMMON:Ljava/lang/String; = "http://qzs.qq.com/open/mobile/sdk_common/down_qq.htm?"

.field public static final ENVIRONMENT_EXPERIENCE:I = 0x1

.field public static final ENVIRONMENT_NORMOL:I = 0x0

.field public static final KEY_HOST_ANALY:Ljava/lang/String; = "analy.qq.com"

.field public static final KEY_HOST_APPIC:Ljava/lang/String; = "appic.qq.com"

.field public static final KEY_HOST_APP_SUPPORT:Ljava/lang/String; = "appsupport.qq.com"

.field public static final KEY_HOST_FUSION:Ljava/lang/String; = "fusion.qq.com"

.field public static final KEY_HOST_I_GTIMG:Ljava/lang/String; = "i.gtimg.cn"

.field public static final KEY_HOST_MAPP_QZONE:Ljava/lang/String; = "mapp.qzone.qq.com"

.field public static final KEY_HOST_OPEN_MOBILE:Ljava/lang/String; = "openmobile.qq.com"

.field public static final KEY_HOST_QZAPP_QLOGO:Ljava/lang/String; = "qzapp.qlogo.cn"

.field public static final KEY_HOST_QZS_QQ:Ljava/lang/String; = "qzs.qq.com"

.field public static final KEY_OPEN_ENV:Ljava/lang/String; = "OpenEnvironment"

.field public static final KEY_OPEN_SETTING:Ljava/lang/String; = "OpenSettings"

.field public static final NEED_QQ_VERSION_TIPS_URL:Ljava/lang/String; = "http://openmobile.qq.com/oauth2.0/m_jump_by_version?"

.field public static final URL_FUSION_BASE:Ljava/lang/String; = "http://fusion.qq.com"

.field public static final URL_FUSION_CGI_BASE:Ljava/lang/String; = "http://fusion.qq.com/cgi-bin"

.field public static final URL_PRIZE_EXCHANGE:Ljava/lang/String; = "http://fusion.qq.com/cgi-bin/prize_sharing/exchange_prize.cgi"

.field public static final URL_PRIZE_GET_ACTIVITY_STATE:Ljava/lang/String; = "http://fusion.qq.com/cgi-bin/prize_sharing/get_activity_state.cgi"

.field public static final URL_PRIZE_MAKE_SHARE_URL:Ljava/lang/String; = "http://fusion.qq.com/cgi-bin/prize_sharing/make_share_url.cgi"

.field public static final URL_PRIZE_QUERY_UNEXCHANGE:Ljava/lang/String; = "http://fusion.qq.com/cgi-bin/prize_sharing/query_unexchange_prize.cgi"

.field private static final a:Ljava/lang/String;

.field private static b:Lcom/tencent/open/utils/ServerSetting; = null


# instance fields
.field private volatile c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/content/SharedPreferences;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "openSDK_LOG."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-class v1, Lcom/tencent/open/utils/ServerSetting;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/utils/ServerSetting;->a:Ljava/lang/String;

    .line 81
    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/open/utils/ServerSetting;->b:Lcom/tencent/open/utils/ServerSetting;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/utils/ServerSetting;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static declared-synchronized getInstance()Lcom/tencent/open/utils/ServerSetting;
    .locals 3

    const-class v1, Lcom/tencent/open/utils/ServerSetting;

    monitor-enter v1

    .line 86
    :try_start_0
    sget-object v0, Lcom/tencent/open/utils/ServerSetting;->b:Lcom/tencent/open/utils/ServerSetting;

    if-nez v0, :cond_0

    .line 87
    new-instance v0, Lcom/tencent/open/utils/ServerSetting;

    invoke-direct {v0}, Lcom/tencent/open/utils/ServerSetting;-><init>()V

    sput-object v0, Lcom/tencent/open/utils/ServerSetting;->b:Lcom/tencent/open/utils/ServerSetting;

    .line 89
    :cond_0
    sget-object v0, Lcom/tencent/open/utils/ServerSetting;->b:Lcom/tencent/open/utils/ServerSetting;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public changeServer()V
    .locals 1

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/utils/ServerSetting;->c:Ljava/lang/ref/WeakReference;

    .line 97
    return-void
.end method

.method public getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 107
    iget-object v0, p0, Lcom/tencent/open/utils/ServerSetting;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/open/utils/ServerSetting;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 108
    :cond_0
    const-string v0, "ServerPrefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 109
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tencent/open/utils/ServerSetting;->c:Ljava/lang/ref/WeakReference;

    .line 112
    :cond_1
    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 113
    invoke-virtual {v3}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v4

    .line 114
    if-nez v4, :cond_2

    .line 115
    sget-object v0, Lcom/tencent/open/utils/ServerSetting;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Get host error. url="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    return-object p2

    .line 118
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/tencent/open/utils/ServerSetting;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 119
    if-eqz v5, :cond_3

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 120
    :cond_3
    sget-object v0, Lcom/tencent/open/utils/ServerSetting;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "host="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", envHost="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 121
    return-object p2

    .line 123
    :cond_4
    :try_start_2
    invoke-virtual {p2, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    move-object p2, v0

    .line 124
    sget-object v0, Lcom/tencent/open/utils/ServerSetting;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "return environment url : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 125
    return-object p2

    .line 127
    :catch_0
    move-exception v3

    .line 128
    sget-object v0, Lcom/tencent/open/utils/ServerSetting;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getEnvUrl url="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "error.: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    return-object p2
.end method

.method public setEnvironment(Landroid/content/Context;I)V
    .locals 3

    .line 141
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/tencent/open/utils/ServerSetting;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/open/utils/ServerSetting;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 142
    :cond_0
    const-string v0, "ServerPrefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 143
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tencent/open/utils/ServerSetting;->c:Ljava/lang/ref/WeakReference;

    .line 145
    :cond_1
    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    .line 146
    sget-object v0, Lcom/tencent/open/utils/ServerSetting;->a:Ljava/lang/String;

    const-string v1, "\u5207\u6362\u73af\u5883\u53c2\u6570\u9519\u8bef\uff0c\u6b63\u5f0f\u73af\u5883\u4e3a0\uff0c\u4f53\u9a8c\u73af\u5883\u4e3a1"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    return-void

    .line 149
    :cond_2
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_0

    .line 151
    :sswitch_0
    iget-object v0, p0, Lcom/tencent/open/utils/ServerSetting;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 152
    const/4 v0, 0x0

    if-ne v0, v2, :cond_3

    .line 153
    return-void

    .line 155
    :cond_3
    const-string v0, "ServerType"

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 157
    const-string v0, "OpenEnvironment"

    const-string v1, "formal"

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 159
    const-string v0, "qzs.qq.com"

    const-string v1, "qzs.qq.com"

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 161
    const-string v0, "openmobile.qq.com"

    const-string v1, "openmobile.qq.com"

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 163
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 165
    invoke-virtual {p0}, Lcom/tencent/open/utils/ServerSetting;->changeServer()V

    .line 166
    const-string v0, "\u5df2\u5207\u6362\u5230\u6b63\u5f0f\u73af\u5883"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 167
    return-void

    .line 171
    :sswitch_1
    iget-object v0, p0, Lcom/tencent/open/utils/ServerSetting;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 172
    const/4 v0, 0x0

    if-ne v0, v2, :cond_4

    .line 173
    return-void

    .line 175
    :cond_4
    const-string v0, "ServerType"

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 177
    const-string v0, "OpenEnvironment"

    const-string v1, "exp"

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 179
    const-string v0, "qzs.qq.com"

    const-string v1, "testmobile.qq.com"

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 181
    const-string v0, "openmobile.qq.com"

    const-string v1, "test.openmobile.qq.com"

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 182
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 183
    invoke-virtual {p0}, Lcom/tencent/open/utils/ServerSetting;->changeServer()V

    .line 184
    const-string v0, "\u5df2\u5207\u6362\u5230\u4f53\u9a8c\u73af\u5883"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 185
    return-void

    .line 188
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
