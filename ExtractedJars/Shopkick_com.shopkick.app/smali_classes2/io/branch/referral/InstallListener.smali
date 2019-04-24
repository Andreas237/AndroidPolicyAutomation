.class public Lio/branch/referral/InstallListener;
.super Landroid/content/BroadcastReceiver;
.source "InstallListener.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/referral/InstallListener$IInstallReferrerEvents;,
        Lio/branch/referral/InstallListener$ReferrerClientWrapper;
    }
.end annotation


# static fields
.field private static callback_:Lio/branch/referral/InstallListener$IInstallReferrerEvents; = null

.field private static installID_:Ljava/lang/String; = "bnc_no_value"

.field private static isReferrerClientAvailable:Z

.field private static isWaitingForReferrer:Z

.field static unReportedReferrerAvailable:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method static synthetic access$200()V
    .locals 0

    .line 34
    invoke-static {}, Lio/branch/referral/InstallListener;->reportInstallReferrer()V

    return-void
.end method

.method static synthetic access$500(Landroid/content/Context;Ljava/lang/String;JJ)V
    .locals 0

    .line 34
    invoke-static/range {p0 .. p5}, Lio/branch/referral/InstallListener;->onReferrerClientFinished(Landroid/content/Context;Ljava/lang/String;JJ)V

    return-void
.end method

.method static synthetic access$600()V
    .locals 0

    .line 34
    invoke-static {}, Lio/branch/referral/InstallListener;->onReferrerClientError()V

    return-void
.end method

.method public static captureInstallReferrer(Landroid/content/Context;JLio/branch/referral/InstallListener$IInstallReferrerEvents;)V
    .locals 1

    .line 49
    sput-object p3, Lio/branch/referral/InstallListener;->callback_:Lio/branch/referral/InstallListener$IInstallReferrerEvents;

    .line 50
    sget-boolean p3, Lio/branch/referral/InstallListener;->unReportedReferrerAvailable:Z

    if-eqz p3, :cond_0

    .line 51
    invoke-static {}, Lio/branch/referral/InstallListener;->reportInstallReferrer()V

    goto :goto_0

    :cond_0
    const/4 p3, 0x1

    .line 53
    sput-boolean p3, Lio/branch/referral/InstallListener;->isWaitingForReferrer:Z

    .line 54
    new-instance p3, Lio/branch/referral/InstallListener$ReferrerClientWrapper;

    const/4 v0, 0x0

    invoke-direct {p3, p0, v0}, Lio/branch/referral/InstallListener$ReferrerClientWrapper;-><init>(Landroid/content/Context;Lio/branch/referral/InstallListener$1;)V

    .line 55
    invoke-static {p3}, Lio/branch/referral/InstallListener$ReferrerClientWrapper;->access$100(Lio/branch/referral/InstallListener$ReferrerClientWrapper;)Z

    move-result p0

    sput-boolean p0, Lio/branch/referral/InstallListener;->isReferrerClientAvailable:Z

    .line 56
    new-instance p0, Landroid/os/Handler;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance p3, Lio/branch/referral/InstallListener$1;

    invoke-direct {p3}, Lio/branch/referral/InstallListener$1;-><init>()V

    invoke-virtual {p0, p3, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method

.method public static getInstallationID()Ljava/lang/String;
    .locals 1

    .line 204
    sget-object v0, Lio/branch/referral/InstallListener;->installID_:Ljava/lang/String;

    return-object v0
.end method

.method private static onReferrerClientError()V
    .locals 1

    const/4 v0, 0x0

    .line 82
    sput-boolean v0, Lio/branch/referral/InstallListener;->isReferrerClientAvailable:Z

    return-void
.end method

.method private static onReferrerClientFinished(Landroid/content/Context;Ljava/lang/String;JJ)V
    .locals 0

    .line 75
    invoke-static/range {p0 .. p5}, Lio/branch/referral/InstallListener;->processReferrerInfo(Landroid/content/Context;Ljava/lang/String;JJ)V

    .line 76
    sget-boolean p0, Lio/branch/referral/InstallListener;->isWaitingForReferrer:Z

    if-eqz p0, :cond_0

    .line 77
    invoke-static {}, Lio/branch/referral/InstallListener;->reportInstallReferrer()V

    :cond_0
    return-void
.end method

.method private static processReferrerInfo(Landroid/content/Context;Ljava/lang/String;JJ)V
    .locals 5

    .line 152
    invoke-static {p0}, Lio/branch/referral/PrefHelper;->getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;

    move-result-object p0

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_0

    const-string v2, "bnc_referrer_click_ts"

    .line 154
    invoke-virtual {p0, v2, p2, p3}, Lio/branch/referral/PrefHelper;->setLong(Ljava/lang/String;J)V

    :cond_0
    cmp-long p2, p4, v0

    if-lez p2, :cond_1

    const-string p2, "bnc_install_begin_ts"

    .line 157
    invoke-virtual {p0, p2, p4, p5}, Lio/branch/referral/PrefHelper;->setLong(Ljava/lang/String;J)V

    :cond_1
    if-eqz p1, :cond_7

    :try_start_0
    const-string p2, "UTF-8"

    .line 161
    invoke-static {p1, p2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 162
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string p3, "&"

    .line 163
    invoke-virtual {p1, p3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    .line 165
    array-length p4, p3

    const/4 p5, 0x0

    move v0, p5

    :goto_0
    if-ge v0, p4, :cond_4

    aget-object v1, p3, v0

    .line 166
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "="

    const-string v3, "="

    .line 168
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "-"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v2, "-"

    .line 171
    :cond_2
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 172
    array-length v2, v1

    const/4 v3, 0x1

    if-le v2, v3, :cond_3

    .line 173
    aget-object v2, v1, p5

    const-string v4, "UTF-8"

    invoke-static {v2, v4}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aget-object v1, v1, v3

    const-string v3, "UTF-8"

    invoke-static {v1, v3}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 177
    :cond_4
    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 178
    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    sput-object p3, Lio/branch/referral/InstallListener;->installID_:Ljava/lang/String;

    .line 179
    sget-object p3, Lio/branch/referral/InstallListener;->installID_:Ljava/lang/String;

    invoke-virtual {p0, p3}, Lio/branch/referral/PrefHelper;->setLinkClickIdentifier(Ljava/lang/String;)V

    .line 183
    :cond_5
    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->IsFullAppConv:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->ReferringLink:Lio/branch/referral/Defines$Jsonkey;

    .line 184
    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 185
    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->IsFullAppConv:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p3

    invoke-virtual {p0, p3}, Lio/branch/referral/PrefHelper;->setIsFullAppConversion(Z)V

    .line 186
    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->ReferringLink:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p3}, Lio/branch/referral/PrefHelper;->setAppLink(Ljava/lang/String;)V

    .line 189
    :cond_6
    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->GoogleSearchInstallReferrer:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    .line 190
    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->GoogleSearchInstallReferrer:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p2}, Lio/branch/referral/PrefHelper;->setGoogleSearchInstallIdentifier(Ljava/lang/String;)V

    .line 191
    invoke-virtual {p0, p1}, Lio/branch/referral/PrefHelper;->setGooglePlayReferrer(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 197
    invoke-virtual {p0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    const-string p0, "BranchSDK"

    const-string p1, "Illegal characters in url encoded string"

    .line 198
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_1
    move-exception p0

    .line 195
    invoke-virtual {p0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    :cond_7
    :goto_1
    return-void
.end method

.method private static reportInstallReferrer()V
    .locals 1

    const/4 v0, 0x1

    .line 208
    sput-boolean v0, Lio/branch/referral/InstallListener;->unReportedReferrerAvailable:Z

    .line 209
    sget-object v0, Lio/branch/referral/InstallListener;->callback_:Lio/branch/referral/InstallListener$IInstallReferrerEvents;

    if-eqz v0, :cond_0

    .line 210
    invoke-interface {v0}, Lio/branch/referral/InstallListener$IInstallReferrerEvents;->onInstallReferrerEventsFinished()V

    const/4 v0, 0x0

    .line 211
    sput-object v0, Lio/branch/referral/InstallListener;->callback_:Lio/branch/referral/InstallListener$IInstallReferrerEvents;

    const/4 v0, 0x0

    .line 212
    sput-boolean v0, Lio/branch/referral/InstallListener;->unReportedReferrerAvailable:Z

    .line 213
    sput-boolean v0, Lio/branch/referral/InstallListener;->isWaitingForReferrer:Z

    .line 214
    sput-boolean v0, Lio/branch/referral/InstallListener;->isReferrerClientAvailable:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    const-string v0, "referrer"

    .line 67
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v1, p1

    .line 68
    invoke-static/range {v1 .. v6}, Lio/branch/referral/InstallListener;->processReferrerInfo(Landroid/content/Context;Ljava/lang/String;JJ)V

    .line 69
    sget-boolean p1, Lio/branch/referral/InstallListener;->isWaitingForReferrer:Z

    if-eqz p1, :cond_0

    sget-boolean p1, Lio/branch/referral/InstallListener;->isReferrerClientAvailable:Z

    if-nez p1, :cond_0

    .line 70
    invoke-static {}, Lio/branch/referral/InstallListener;->reportInstallReferrer()V

    :cond_0
    return-void
.end method
