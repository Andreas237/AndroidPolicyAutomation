.class Lio/branch/referral/BranchStrongMatchHelper;
.super Ljava/lang/Object;
.source "BranchStrongMatchHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/referral/BranchStrongMatchHelper$MockCustomTabServiceConnection;,
        Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;
    }
.end annotation


# static fields
.field private static final STRONG_MATCH_CHECK_TIME_OUT:I = 0x1f4

.field public static final STRONG_MATCH_URL_HIT_DELAY:I = 0x2ee

.field private static StrongMatchUrlHitDelay:I = 0x2ee

.field private static final THIRTY_DAYS_EPOCH_MILLI_SEC:J = 0x9a7ec800L

.field private static branchStrongMatchHelper_:Lio/branch/referral/BranchStrongMatchHelper;


# instance fields
.field CustomServiceTabConnectionClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field CustomTabsCallbackClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field CustomTabsClientClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field CustomTabsSessionClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field ICustomTabsServiceClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private isCustomTabsAvailable_:Z

.field isStrongMatchUrlLaunched:Z

.field mClient_:Ljava/lang/Object;

.field private final timeOutHandler_:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lio/branch/referral/BranchStrongMatchHelper;->mClient_:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Lio/branch/referral/BranchStrongMatchHelper;->isCustomTabsAvailable_:Z

    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Lio/branch/referral/BranchStrongMatchHelper;->isStrongMatchUrlLaunched:Z

    :try_start_0
    const-string v1, "android.support.customtabs.CustomTabsClient"

    .line 47
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lio/branch/referral/BranchStrongMatchHelper;->CustomTabsClientClass:Ljava/lang/Class;

    const-string v1, "android.support.customtabs.CustomTabsServiceConnection"

    .line 48
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lio/branch/referral/BranchStrongMatchHelper;->CustomServiceTabConnectionClass:Ljava/lang/Class;

    const-string v1, "android.support.customtabs.CustomTabsCallback"

    .line 49
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lio/branch/referral/BranchStrongMatchHelper;->CustomTabsCallbackClass:Ljava/lang/Class;

    const-string v1, "android.support.customtabs.CustomTabsSession"

    .line 50
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lio/branch/referral/BranchStrongMatchHelper;->CustomTabsSessionClass:Ljava/lang/Class;

    const-string v1, "android.support.customtabs.ICustomTabsService"

    .line 51
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lio/branch/referral/BranchStrongMatchHelper;->ICustomTabsServiceClass:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 53
    :catch_0
    iput-boolean v0, p0, Lio/branch/referral/BranchStrongMatchHelper;->isCustomTabsAvailable_:Z

    .line 59
    :goto_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lio/branch/referral/BranchStrongMatchHelper;->timeOutHandler_:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lio/branch/referral/BranchStrongMatchHelper;Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;Z)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lio/branch/referral/BranchStrongMatchHelper;->updateStrongMatchCheckFinished(Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;Z)V

    return-void
.end method

.method private buildStrongMatchUrl(Ljava/lang/String;Lio/branch/referral/DeviceInfo;Lio/branch/referral/PrefHelper;Lio/branch/referral/SystemObserver;Landroid/content/Context;)Landroid/net/Uri;
    .locals 1

    .line 160
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-nez p4, :cond_5

    .line 161
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "https://"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/_strong_match?os="

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lio/branch/referral/DeviceInfo;->getOsName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 163
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->HardwareID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lio/branch/referral/DeviceInfo;->getHardwareID()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 164
    invoke-virtual {p2}, Lio/branch/referral/DeviceInfo;->isHardwareIDReal()Z

    move-result p4

    if-eqz p4, :cond_0

    sget-object p4, Lio/branch/referral/Defines$Jsonkey;->HardwareIDTypeVendor:Lio/branch/referral/Defines$Jsonkey;

    goto :goto_0

    :cond_0
    sget-object p4, Lio/branch/referral/Defines$Jsonkey;->HardwareIDTypeRandom:Lio/branch/referral/Defines$Jsonkey;

    :goto_0
    invoke-virtual {p4}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p4

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->HardwareIDType:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 167
    sget-object p4, Lio/branch/referral/SystemObserver;->GAIDString_:Ljava/lang/String;

    if-eqz p4, :cond_1

    invoke-static {p5}, Lio/branch/referral/BranchUtil;->isTestModeEnabled(Landroid/content/Context;)Z

    move-result p4

    if-nez p4, :cond_1

    .line 168
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->GoogleAdvertisingID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lio/branch/referral/SystemObserver;->GAIDString_:Ljava/lang/String;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 171
    :cond_1
    invoke-virtual {p3}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object p4

    const-string p5, "bnc_no_value"

    invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_2

    .line 172
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 175
    :cond_2
    invoke-virtual {p2}, Lio/branch/referral/DeviceInfo;->getAppVersion()Ljava/lang/String;

    move-result-object p4

    const-string p5, "bnc_no_value"

    invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_3

    .line 176
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->AppVersion:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lio/branch/referral/DeviceInfo;->getAppVersion()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 179
    :cond_3
    invoke-virtual {p3}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object p2

    const-string p4, "bnc_no_value"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 180
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->BranchKey:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 183
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&sdk=android2.19.5"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 185
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public static getInstance()Lio/branch/referral/BranchStrongMatchHelper;
    .locals 1

    .line 63
    sget-object v0, Lio/branch/referral/BranchStrongMatchHelper;->branchStrongMatchHelper_:Lio/branch/referral/BranchStrongMatchHelper;

    if-nez v0, :cond_0

    .line 64
    new-instance v0, Lio/branch/referral/BranchStrongMatchHelper;

    invoke-direct {v0}, Lio/branch/referral/BranchStrongMatchHelper;-><init>()V

    sput-object v0, Lio/branch/referral/BranchStrongMatchHelper;->branchStrongMatchHelper_:Lio/branch/referral/BranchStrongMatchHelper;

    .line 66
    :cond_0
    sget-object v0, Lio/branch/referral/BranchStrongMatchHelper;->branchStrongMatchHelper_:Lio/branch/referral/BranchStrongMatchHelper;

    return-object v0
.end method

.method private updateStrongMatchCheckFinished(Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;Z)V
    .locals 3

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 146
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lio/branch/referral/BranchStrongMatchHelper$3;

    invoke-direct {v0, p0, p1}, Lio/branch/referral/BranchStrongMatchHelper$3;-><init>(Lio/branch/referral/BranchStrongMatchHelper;Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;)V

    sget p1, Lio/branch/referral/BranchStrongMatchHelper;->StrongMatchUrlHitDelay:I

    int-to-long v1, p1

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 153
    :cond_0
    invoke-interface {p1}, Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;->onStrongMatchCheckFinished()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public checkForStrongMatch(Landroid/content/Context;Ljava/lang/String;Lio/branch/referral/DeviceInfo;Lio/branch/referral/PrefHelper;Lio/branch/referral/SystemObserver;Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;)V
    .locals 12

    move-object v8, p0

    move-object/from16 v9, p6

    const/4 v6, 0x0

    .line 74
    iput-boolean v6, v8, Lio/branch/referral/BranchStrongMatchHelper;->isStrongMatchUrlLaunched:Z

    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual/range {p4 .. p4}, Lio/branch/referral/PrefHelper;->getLastStrongMatchTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide v2, 0x9a7ec800L

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 77
    iget-boolean v0, v8, Lio/branch/referral/BranchStrongMatchHelper;->isStrongMatchUrlLaunched:Z

    invoke-direct {p0, v9, v0}, Lio/branch/referral/BranchStrongMatchHelper;->updateStrongMatchCheckFinished(Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;Z)V

    goto/16 :goto_0

    .line 78
    :cond_0
    iget-boolean v0, v8, Lio/branch/referral/BranchStrongMatchHelper;->isCustomTabsAvailable_:Z

    if-nez v0, :cond_1

    .line 79
    iget-boolean v0, v8, Lio/branch/referral/BranchStrongMatchHelper;->isStrongMatchUrlLaunched:Z

    invoke-direct {p0, v9, v0}, Lio/branch/referral/BranchStrongMatchHelper;->updateStrongMatchCheckFinished(Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;Z)V

    goto/16 :goto_0

    .line 82
    :cond_1
    :try_start_0
    invoke-virtual {p3}, Lio/branch/referral/DeviceInfo;->getHardwareID()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object v5, p1

    .line 83
    invoke-direct/range {v0 .. v5}, Lio/branch/referral/BranchStrongMatchHelper;->buildStrongMatchUrl(Ljava/lang/String;Lio/branch/referral/DeviceInfo;Lio/branch/referral/PrefHelper;Lio/branch/referral/SystemObserver;Landroid/content/Context;)Landroid/net/Uri;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 85
    iget-object v0, v8, Lio/branch/referral/BranchStrongMatchHelper;->timeOutHandler_:Landroid/os/Handler;

    new-instance v1, Lio/branch/referral/BranchStrongMatchHelper$1;

    invoke-direct {v1, p0, v9}, Lio/branch/referral/BranchStrongMatchHelper$1;-><init>(Lio/branch/referral/BranchStrongMatchHelper;Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 92
    iget-object v0, v8, Lio/branch/referral/BranchStrongMatchHelper;->CustomTabsClientClass:Ljava/lang/Class;

    const-string v1, "bindCustomTabsService"

    const/4 v2, 0x3

    new-array v3, v2, [Ljava/lang/Class;

    const-class v5, Landroid/content/Context;

    aput-object v5, v3, v6

    const-class v5, Ljava/lang/String;

    const/4 v7, 0x1

    aput-object v5, v3, v7

    iget-object v5, v8, Lio/branch/referral/BranchStrongMatchHelper;->CustomServiceTabConnectionClass:Ljava/lang/Class;

    const/4 v10, 0x2

    aput-object v5, v3, v10

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 93
    iget-object v0, v8, Lio/branch/referral/BranchStrongMatchHelper;->CustomTabsClientClass:Ljava/lang/Class;

    const-string/jumbo v1, "warmup"

    new-array v3, v7, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v6

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 94
    iget-object v0, v8, Lio/branch/referral/BranchStrongMatchHelper;->CustomTabsClientClass:Ljava/lang/Class;

    const-string v1, "newSession"

    new-array v5, v7, [Ljava/lang/Class;

    iget-object v11, v8, Lio/branch/referral/BranchStrongMatchHelper;->CustomTabsCallbackClass:Ljava/lang/Class;

    aput-object v11, v5, v6

    invoke-virtual {v0, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 95
    iget-object v0, v8, Lio/branch/referral/BranchStrongMatchHelper;->CustomTabsSessionClass:Ljava/lang/Class;

    const-string v1, "mayLaunchUrl"

    new-array v2, v2, [Ljava/lang/Class;

    const-class v11, Landroid/net/Uri;

    aput-object v11, v2, v6

    const-class v6, Landroid/os/Bundle;

    aput-object v6, v2, v7

    const-class v6, Ljava/util/List;

    aput-object v6, v2, v10

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 99
    new-instance v10, Landroid/content/Intent;

    const-string v0, "android.support.customtabs.action.CustomTabsService"

    invoke-direct {v10, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "com.android.chrome"

    .line 100
    invoke-virtual {v10, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 102
    new-instance v11, Lio/branch/referral/BranchStrongMatchHelper$2;

    move-object v0, v11

    move-object v1, p0

    move-object v2, v3

    move-object v3, v5

    move-object v5, v6

    move-object/from16 v6, p4

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v7}, Lio/branch/referral/BranchStrongMatchHelper$2;-><init>(Lio/branch/referral/BranchStrongMatchHelper;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Landroid/net/Uri;Ljava/lang/reflect/Method;Lio/branch/referral/PrefHelper;Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;)V

    const/16 v0, 0x21

    move-object v1, p1

    invoke-virtual {p1, v10, v11, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    goto :goto_0

    .line 131
    :cond_2
    iget-boolean v0, v8, Lio/branch/referral/BranchStrongMatchHelper;->isStrongMatchUrlLaunched:Z

    invoke-direct {p0, v9, v0}, Lio/branch/referral/BranchStrongMatchHelper;->updateStrongMatchCheckFinished(Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;Z)V

    goto :goto_0

    .line 134
    :cond_3
    iget-boolean v0, v8, Lio/branch/referral/BranchStrongMatchHelper;->isStrongMatchUrlLaunched:Z

    invoke-direct {p0, v9, v0}, Lio/branch/referral/BranchStrongMatchHelper;->updateStrongMatchCheckFinished(Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;Z)V

    const-string v0, "BranchSDK"

    const-string v1, "Cannot use cookie-based matching since device id is not available"

    .line 135
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 138
    :catch_0
    iget-boolean v0, v8, Lio/branch/referral/BranchStrongMatchHelper;->isStrongMatchUrlLaunched:Z

    invoke-direct {p0, v9, v0}, Lio/branch/referral/BranchStrongMatchHelper;->updateStrongMatchCheckFinished(Lio/branch/referral/BranchStrongMatchHelper$StrongMatchCheckEvents;Z)V

    :goto_0
    return-void
.end method

.method public setStrongMatchUrlHitDelay(I)V
    .locals 0

    .line 70
    sput p1, Lio/branch/referral/BranchStrongMatchHelper;->StrongMatchUrlHitDelay:I

    return-void
.end method
