.class public Lcom/shopkick/app/application/AppLaunchState;
.super Ljava/lang/Object;
.source "AppLaunchState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/application/AppLaunchState$Source;
    }
.end annotation


# static fields
.field private static final DAY_IN_MILLIS:J = 0x5265c00L

.field public static final FROM_LOCAL_NOTIF:Ljava/lang/String; = "fromLocalNotif"

.field public static final FROM_PNS:Ljava/lang/String; = "fromPns"

.field public static final LOCAL_NOTIF_ID:Ljava/lang/String; = "localNotifId"

.field private static final LOG_TAG:Ljava/lang/String;

.field public static final PNS_PUSH_MESSAGE:Ljava/lang/String; = "pnsPushMessage"

.field public static final SHOPKICK_PYLONS_HOST:Ljava/lang/String; = "app.shopkick.com"

.field public static final SHOPKICK_SCHEME:Ljava/lang/String; = "shopkick"

.field private static final VERIFY_PHONE_CODE_PARAM:Ljava/lang/String; = "c"

.field private static final VERIFY_PHONE_SEGMENT:Ljava/lang/String; = "vpv"

.field private static final WEB_REGISTRATION_CODE_PARAM:Ljava/lang/String; = "i"

.field private static final WEB_REGISTRATION_SEGMENT:Ljava/lang/String; = "webreg"

.field private static final whitelistedDeeplinks:[Ljava/lang/String;

.field private static final whitelistedSKLinks:[Ljava/lang/String;

.field private static final whitelistedSKLinksWithoutLogin:[Ljava/lang/String;


# instance fields
.field private androidBadgeDisplayType:Ljava/lang/Integer;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private currentBadgeValue:Ljava/lang/String;

.field private gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

.field public localNotifId:Ljava/lang/String;

.field public pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

.field private pushMessageId:Ljava/lang/String;

.field public shopkickLaunchLink:Landroid/net/Uri;

.field public source:Lcom/shopkick/app/application/AppLaunchState$Source;

.field public verifyPhoneCode:Ljava/lang/String;

.field public webRegCode:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const-string v0, "screen"

    const-string v1, "launch_buy_and_collect"

    const-string v2, "email"

    const-string v3, "modalwebview"

    const-string v4, "register"

    const-string/jumbo v5, "sms"

    const-string/jumbo v6, "verify"

    .line 33
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState;->whitelistedSKLinks:[Ljava/lang/String;

    const-string v1, "offer"

    const-string v2, "deeplink"

    const-string v3, "reset_password"

    const-string v4, "email_verify"

    const-string v5, "auth_code_login"

    const-string v6, "marketing_data_opt_out"

    .line 37
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState;->whitelistedDeeplinks:[Ljava/lang/String;

    const-string v0, "reset_password"

    const-string v1, "email_verify"

    const-string v2, "auth_code_login"

    .line 41
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState;->whitelistedSKLinksWithoutLogin:[Ljava/lang/String;

    .line 72
    const-class v0, Lcom/shopkick/app/application/AppLaunchState;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState;->LOG_TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/gcm/GCMLifeCycle;)V
    .locals 1

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->DEFAULT:Lcom/shopkick/app/application/AppLaunchState$Source;

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    .line 103
    iput-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 104
    iput-object p2, p0, Lcom/shopkick/app/application/AppLaunchState;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    return-void
.end method

.method private clearGCMPushMessage()V
    .locals 2

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 147
    invoke-virtual {v0, v1}, Lcom/shopkick/app/gcm/GCMLifeCycle;->setLastPushMessageJSON(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private isWhitelistedDeeplink(Ljava/lang/String;)Z
    .locals 5

    .line 216
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState;->whitelistedDeeplinks:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 217
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method private isWhitelistedSKLink(Ljava/lang/String;)Z
    .locals 5

    .line 225
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState;->whitelistedSKLinks:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 226
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method private parseGCMPushMessage()V
    .locals 5

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    if-eqz v0, :cond_1

    .line 129
    invoke-virtual {v0}, Lcom/shopkick/app/gcm/GCMLifeCycle;->getLastPushMessageJSON()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 131
    invoke-static {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    move-result-object v0

    .line 134
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->timestamp:Ljava/lang/Long;

    if-eqz v1, :cond_0

    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0x5265c00

    sub-long/2addr v1, v3

    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->timestamp:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    .line 136
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeValue:Ljava/lang/String;

    iput-object v1, p0, Lcom/shopkick/app/application/AppLaunchState;->currentBadgeValue:Ljava/lang/String;

    .line 137
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeDisplayType:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->androidBadgeDisplayType:Ljava/lang/Integer;

    .line 140
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/application/AppLaunchState;->clearGCMPushMessage()V

    :cond_1
    return-void
.end method

.method private parsePushMessage(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 110
    :try_start_0
    invoke-static {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->pushMessageId:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessageId:Ljava/lang/String;

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeValue:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->currentBadgeValue:Ljava/lang/String;

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->androidBadgeDisplayType:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->androidBadgeDisplayType:Ljava/lang/Integer;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 115
    :catch_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    .line 116
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not parse the push message from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->PUSH_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    if-ne p1, v0, :cond_0

    .line 119
    invoke-direct {p0}, Lcom/shopkick/app/application/AppLaunchState;->clearGCMPushMessage()V

    :cond_0
    return-void
.end method


# virtual methods
.method public getBadgeDisplayType()Ljava/lang/Integer;
    .locals 1

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->androidBadgeDisplayType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getBadgeValue()Ljava/lang/Integer;
    .locals 1

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->currentBadgeValue:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 295
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPNSSKLink()Ljava/lang/String;
    .locals 1

    .line 273
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->skUrl:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getPnsSource()I
    .locals 2

    .line 277
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$1;->$SwitchMap$com$shopkick$app$application$AppLaunchState$Source:[I

    iget-object v1, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppLaunchState$Source;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x2

    return v0

    :pswitch_1
    const/4 v0, 0x4

    return v0

    :pswitch_2
    const/4 v0, 0x1

    return v0

    :pswitch_3
    const/4 v0, 0x5

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getPushMessageId()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public isWhitelistedSKLinksWithoutLogin(Ljava/lang/String;)Z
    .locals 5

    .line 234
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState;->whitelistedSKLinksWithoutLogin:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 235
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public parseIntent(Landroid/content/Intent;)V
    .locals 4

    .line 152
    invoke-virtual {p0}, Lcom/shopkick/app/application/AppLaunchState;->reset()V

    .line 153
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parsing intent "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "fromPns"

    const/4 v1, 0x0

    .line 154
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->PUSH_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    const-string v0, "pnsPushMessage"

    .line 156
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/application/AppLaunchState;->parsePushMessage(Ljava/lang/String;)V

    .line 157
    sget-object p1, Lcom/shopkick/app/application/AppLaunchState;->LOG_TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The push message is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_2

    :cond_0
    const-string v0, "fromLocalNotif"

    .line 158
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 159
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->LOCAL_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    const-string v0, "localNotifId"

    .line 160
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->localNotifId:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessageId:Ljava/lang/String;

    const-string v0, "pnsPushMessage"

    .line 161
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/application/AppLaunchState;->parsePushMessage(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 164
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/application/AppLaunchState;->parseGCMPushMessage()V

    .line 165
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 166
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "shopkick"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 167
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    .line 168
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 169
    invoke-direct {p0, v1}, Lcom/shopkick/app/application/AppLaunchState;->isWhitelistedSKLink(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-direct {p0, v1}, Lcom/shopkick/app/application/AppLaunchState;->isWhitelistedDeeplink(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 170
    :cond_2
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->LINK:Lcom/shopkick/app/application/AppLaunchState$Source;

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    const-string/jumbo v0, "sk"

    .line 173
    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedSchemeSpecificPart()Ljava/lang/String;

    move-result-object v1

    .line 174
    invoke-virtual {p1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object p1

    .line 172
    invoke-static {v0, v1, p1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->shopkickLaunchLink:Landroid/net/Uri;

    goto/16 :goto_2

    :cond_3
    if-eqz v0, :cond_a

    const-string/jumbo v1, "vpv"

    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 177
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->PHONE_VERIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    const-string v0, "c"

    .line 178
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->verifyPhoneCode:Ljava/lang/String;

    .line 179
    iget-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->verifyPhoneCode:Ljava/lang/String;

    if-nez p1, :cond_a

    .line 180
    sget-object p1, Lcom/shopkick/app/application/AppLaunchState$Source;->DEFAULT:Lcom/shopkick/app/application/AppLaunchState$Source;

    iput-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    goto/16 :goto_2

    :cond_4
    const-string/jumbo v1, "webreg"

    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "i"

    .line 183
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->webRegCode:Ljava/lang/String;

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->webRegCode:Ljava/lang/String;

    if-eqz p1, :cond_5

    .line 185
    sget-object p1, Lcom/shopkick/app/application/AppLaunchState$Source;->WEB_REG:Lcom/shopkick/app/application/AppLaunchState$Source;

    iput-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    .line 186
    iget-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->webRegCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setWebRegistrationId(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 188
    :cond_5
    sget-object p1, Lcom/shopkick/app/application/AppLaunchState$Source;->DEFAULT:Lcom/shopkick/app/application/AppLaunchState$Source;

    iput-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    goto/16 :goto_2

    :cond_6
    if-eqz p1, :cond_a

    .line 193
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    const-string v2, "app.shopkick.com"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 194
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "http"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "https"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 197
    :cond_7
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_a

    .line 198
    invoke-direct {p0, v0}, Lcom/shopkick/app/application/AppLaunchState;->isWhitelistedDeeplink(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 199
    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->DEEP_LINK:Lcom/shopkick/app/application/AppLaunchState$Source;

    iput-object v1, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    .line 200
    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    const-string/jumbo v2, "sk"

    .line 201
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    .line 202
    invoke-virtual {v2, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    const/4 v0, 0x1

    .line 203
    :goto_0
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_8

    .line 204
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 206
    :cond_8
    invoke-virtual {p1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 207
    invoke-virtual {p1, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_1

    .line 209
    :cond_9
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/AppLaunchState;->shopkickLaunchLink:Landroid/net/Uri;

    :cond_a
    :goto_2
    return-void
.end method

.method public reset()V
    .locals 1

    .line 261
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->DEFAULT:Lcom/shopkick/app/application/AppLaunchState$Source;

    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    const/4 v0, 0x0

    .line 262
    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    .line 263
    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->pushMessageId:Ljava/lang/String;

    .line 264
    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->verifyPhoneCode:Ljava/lang/String;

    .line 265
    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->webRegCode:Ljava/lang/String;

    .line 266
    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->localNotifId:Ljava/lang/String;

    .line 267
    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->shopkickLaunchLink:Landroid/net/Uri;

    .line 268
    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->androidBadgeDisplayType:Ljava/lang/Integer;

    .line 269
    iput-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->currentBadgeValue:Ljava/lang/String;

    return-void
.end method

.method public shouldHandleShopkickLaunchLinkWithoutLogin()Z
    .locals 3

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchState;->shopkickLaunchLink:Landroid/net/Uri;

    if-eqz v0, :cond_1

    .line 246
    :try_start_0
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "utf-8"

    invoke-static {v1, v2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 248
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 249
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 255
    :catch_0
    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/application/AppLaunchState;->isWhitelistedSKLinksWithoutLogin(Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
