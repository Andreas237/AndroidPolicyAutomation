.class public Lcom/mopub/common/GpsHelper;
.super Ljava/lang/Object;
.source "GpsHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/common/GpsHelper$FetchAdvertisingInfoTask;,
        Lcom/mopub/common/GpsHelper$GpsHelperListener;,
        Lcom/mopub/common/GpsHelper$AdvertisingInfo;
    }
.end annotation


# static fields
.field public static final ADVERTISING_ID_KEY:Ljava/lang/String; = "advertisingId"

.field public static final GOOGLE_PLAY_SUCCESS_CODE:I = 0x0

.field public static final IS_LIMIT_AD_TRACKING_ENABLED_KEY:Ljava/lang/String; = "isLimitAdTrackingEnabled"

.field private static sAdvertisingIdClientClassName:Ljava/lang/String; = "com.google.android.gms.ads.identifier.AdvertisingIdClient"

.field private static sPlayServicesUtilClassName:Ljava/lang/String; = "com.google.android.gms.common.GooglePlayServicesUtil"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 16
    sget-object v0, Lcom/mopub/common/GpsHelper;->sAdvertisingIdClientClassName:Ljava/lang/String;

    return-object v0
.end method

.method public static fetchAdvertisingInfoAsync(Landroid/content/Context;Lcom/mopub/common/GpsHelper$GpsHelperListener;)V
    .locals 2

    .line 69
    invoke-static {p0}, Lcom/mopub/common/GpsHelper;->isPlayServicesAvailable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    invoke-static {p0}, Lcom/mopub/common/GpsHelper;->isClientMetadataPopulated(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 71
    invoke-static {p0, p1}, Lcom/mopub/common/GpsHelper;->internalFetchAdvertisingInfoAsync(Landroid/content/Context;Lcom/mopub/common/GpsHelper$GpsHelperListener;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 74
    invoke-interface {p1}, Lcom/mopub/common/GpsHelper$GpsHelperListener;->onFetchAdInfoCompleted()V

    :cond_1
    if-eqz v0, :cond_2

    const/4 p1, 0x0

    .line 78
    invoke-static {p0, p1}, Lcom/mopub/common/GpsHelper;->internalFetchAdvertisingInfoAsync(Landroid/content/Context;Lcom/mopub/common/GpsHelper$GpsHelperListener;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static fetchAdvertisingInfoSync(Landroid/content/Context;)Lcom/mopub/common/GpsHelper$AdvertisingInfo;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    const-string v1, "getAdvertisingIdInfo"

    .line 90
    invoke-static {v0, v1}, Lcom/mopub/common/factories/MethodBuilderFactory;->create(Ljava/lang/Object;Ljava/lang/String;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v1

    sget-object v2, Lcom/mopub/common/GpsHelper;->sAdvertisingIdClientClassName:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/mopub/common/util/Reflection$MethodBuilder;->setStatic(Ljava/lang/Class;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-virtual {v1, v2, p0}, Lcom/mopub/common/util/Reflection$MethodBuilder;->addParam(Ljava/lang/Class;Ljava/lang/Object;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object p0

    .line 94
    invoke-virtual {p0}, Lcom/mopub/common/util/Reflection$MethodBuilder;->execute()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    invoke-static {p0, v0}, Lcom/mopub/common/GpsHelper;->reflectedGetAdvertisingId(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 101
    invoke-static {p0, v1}, Lcom/mopub/common/GpsHelper;->reflectedIsLimitAdTrackingEnabled(Ljava/lang/Object;Z)Z

    move-result p0

    .line 103
    new-instance v1, Lcom/mopub/common/GpsHelper$AdvertisingInfo;

    invoke-direct {v1, v0, p0}, Lcom/mopub/common/GpsHelper$AdvertisingInfo;-><init>(Ljava/lang/String;Z)V

    return-object v1

    :catch_0
    const-string p0, "Unable to obtain Google AdvertisingIdClient.Info via reflection."

    .line 96
    invoke-static {p0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    return-object v0
.end method

.method private static internalFetchAdvertisingInfoAsync(Landroid/content/Context;Lcom/mopub/common/GpsHelper$GpsHelperListener;)V
    .locals 1

    .line 107
    sget-object v0, Lcom/mopub/common/GpsHelper;->sAdvertisingIdClientClassName:Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/common/util/Reflection;->classFound(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 109
    invoke-interface {p1}, Lcom/mopub/common/GpsHelper$GpsHelperListener;->onFetchAdInfoCompleted()V

    :cond_0
    return-void

    .line 115
    :cond_1
    :try_start_0
    new-instance v0, Lcom/mopub/common/GpsHelper$FetchAdvertisingInfoTask;

    invoke-direct {v0, p0, p1}, Lcom/mopub/common/GpsHelper$FetchAdvertisingInfoTask;-><init>(Landroid/content/Context;Lcom/mopub/common/GpsHelper$GpsHelperListener;)V

    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Void;

    invoke-static {v0, p0}, Lcom/mopub/common/util/AsyncTasks;->safeExecuteOnExecutor(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string v0, "Error executing FetchAdvertisingInfoTask"

    .line 117
    invoke-static {v0, p0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p1, :cond_2

    .line 120
    invoke-interface {p1}, Lcom/mopub/common/GpsHelper$GpsHelperListener;->onFetchAdInfoCompleted()V

    :cond_2
    :goto_0
    return-void
.end method

.method static isClientMetadataPopulated(Landroid/content/Context;)Z
    .locals 0

    .line 62
    invoke-static {p0}, Lcom/mopub/common/ClientMetadata;->getInstance(Landroid/content/Context;)Lcom/mopub/common/ClientMetadata;

    move-result-object p0

    invoke-virtual {p0}, Lcom/mopub/common/ClientMetadata;->isAdvertisingInfoSet()Z

    move-result p0

    return p0
.end method

.method public static isLimitAdTrackingEnabled(Landroid/content/Context;)Z
    .locals 2

    .line 53
    invoke-static {p0}, Lcom/mopub/common/GpsHelper;->isPlayServicesAvailable(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 54
    invoke-static {p0}, Lcom/mopub/common/SharedPreferencesHelper;->getSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "isLimitAdTrackingEnabled"

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0

    :cond_0
    return v1
.end method

.method public static isPlayServicesAvailable(Landroid/content/Context;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "isGooglePlayServicesAvailable"

    .line 39
    invoke-static {v0, v2}, Lcom/mopub/common/factories/MethodBuilderFactory;->create(Ljava/lang/Object;Ljava/lang/String;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v0

    sget-object v2, Lcom/mopub/common/GpsHelper;->sPlayServicesUtilClassName:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/mopub/common/util/Reflection$MethodBuilder;->setStatic(Ljava/lang/Class;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-virtual {v0, v2, p0}, Lcom/mopub/common/util/Reflection$MethodBuilder;->addParam(Ljava/lang/Class;Ljava/lang/Object;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object p0

    .line 43
    invoke-virtual {p0}, Lcom/mopub/common/util/Reflection$MethodBuilder;->execute()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 45
    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :catch_0
    return v1
.end method

.method static reflectedGetAdvertisingId(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "getId"

    .line 182
    invoke-static {p0, v0}, Lcom/mopub/common/factories/MethodBuilderFactory;->create(Ljava/lang/Object;Ljava/lang/String;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/mopub/common/util/Reflection$MethodBuilder;->execute()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object p1
.end method

.method static reflectedIsLimitAdTrackingEnabled(Ljava/lang/Object;Z)Z
    .locals 1

    :try_start_0
    const-string v0, "isLimitAdTrackingEnabled"

    .line 190
    invoke-static {p0, v0}, Lcom/mopub/common/factories/MethodBuilderFactory;->create(Ljava/lang/Object;Ljava/lang/String;)Lcom/mopub/common/util/Reflection$MethodBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/mopub/common/util/Reflection$MethodBuilder;->execute()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_0

    .line 191
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    move p0, p1

    :goto_0
    return p0

    :catch_0
    return p1
.end method

.method public static setClassNamesForTesting()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "java.lang.Class"

    .line 203
    sput-object v0, Lcom/mopub/common/GpsHelper;->sPlayServicesUtilClassName:Ljava/lang/String;

    .line 204
    sput-object v0, Lcom/mopub/common/GpsHelper;->sAdvertisingIdClientClassName:Ljava/lang/String;

    return-void
.end method

.method static updateClientMetadata(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    .line 168
    invoke-static {p1, v0}, Lcom/mopub/common/GpsHelper;->reflectedGetAdvertisingId(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 169
    invoke-static {p1, v1}, Lcom/mopub/common/GpsHelper;->reflectedIsLimitAdTrackingEnabled(Ljava/lang/Object;Z)Z

    move-result p1

    .line 176
    invoke-static {p0}, Lcom/mopub/common/ClientMetadata;->getInstance(Landroid/content/Context;)Lcom/mopub/common/ClientMetadata;

    move-result-object p0

    .line 177
    invoke-virtual {p0, v0, p1}, Lcom/mopub/common/ClientMetadata;->setAdvertisingInfo(Ljava/lang/String;Z)V

    return-void
.end method
