.class public final Lcom/microblink/internal/DeviceHelper;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String; = "DeviceHelper"

.field private static final UNIQUE_ID_KEY:Ljava/lang/String; = "com.microblink.device.id.SECURE_DEVICE_ID"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static deviceInfo(Landroid/content/Context;)Lcom/microblink/internal/services/license/DeviceInfo;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/internal/services/license/DeviceInfo;

    new-instance v1, Lcom/microblink/camera/util/DeviceInformation;

    invoke-direct {v1, p0}, Lcom/microblink/camera/util/DeviceInformation;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/microblink/internal/services/license/DeviceInfo;-><init>(Lcom/microblink/camera/util/DeviceInformation;)V

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getProcessorABI()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/microblink/internal/services/license/DeviceInfo;->processorABI(Ljava/lang/String;)Lcom/microblink/internal/services/license/DeviceInfo;

    move-result-object p0

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getMaxCPUFrequency()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/microblink/internal/services/license/DeviceInfo;->maxCPUFrequency(I)Lcom/microblink/internal/services/license/DeviceInfo;

    move-result-object p0

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getNumberOfCores()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/microblink/internal/services/license/DeviceInfo;->numberOfCores(I)Lcom/microblink/internal/services/license/DeviceInfo;

    move-result-object p0

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->isProcessorCompatible()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/microblink/internal/services/license/DeviceInfo;->processorCompatible(Z)Lcom/microblink/internal/services/license/DeviceInfo;

    move-result-object p0

    return-object p0
.end method

.method public static uniqueId(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "com.microblink.device.id.SECURE_DEVICE_ID"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v1, "com.microblink.device.id.SECURE_DEVICE_ID"

    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    move-exception p0

    const-string v0, "DeviceHelper"

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
