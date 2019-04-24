.class public final Lcom/shopkick/utilities/GooglePlayServicesUtility;
.super Ljava/lang/Object;
.source "GooglePlayServicesUtility.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isGooglePlayServicesAvailable(Landroid/content/Context;)Z
    .locals 7

    if-eqz p0, :cond_1

    const/4 v0, 0x0

    .line 29
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v1

    .line 30
    invoke-virtual {v1, p0}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :catch_0
    move-exception p0

    move-object v4, p0

    .line 34
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p0

    invoke-virtual {p0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object p0, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    invoke-virtual {p0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "isGooglePlayServicesAvailable() failed"

    new-array v6, v0, [Ljava/lang/Object;

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0

    .line 25
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'context\' can not be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
