.class public final Lcom/microblink/ReceiptSdk;
.super Ljava/lang/Object;


# static fields
.field private static final DEEP_OCR_LOGO_MODEL_NAME:Ljava/lang/String; = "microblink/logo_detection_model_production_5.1.1.zzip"

.field private static final DEEP_OCR_MODEL_NAME:Ljava/lang/String; = "microblink/deep_ocr_model_internal_5.1.0.zzip"

.field private static final DEVICE_OCR_KEY_PROPERTY:Ljava/lang/String; = "com.microblink.OnDeviceOcr"

.field private static final GOOGLE_API_KEY_PROPERTY:Ljava/lang/String; = "com.microblink.GooglePlacesKey"

.field private static final LICENSEE_NAME_KEY_PROPERTY:Ljava/lang/String; = "com.microblink.LicenseeName"

.field private static final LICENSE_KEY_PROPERTY:Ljava/lang/String; = "com.microblink.LicenseKey"

.field private static final NETWORK_OFFLINE_KEY_PROPERTY:Ljava/lang/String; = "com.microblink.NetworkOffline"

.field private static final PROD_INTEL_KEY_PROPERTY:Ljava/lang/String; = "com.microblink.ProductIntelligence"

.field private static final TAG:Ljava/lang/String; = "ReceiptSdk"

.field private static final YELP_API_KEY_PROPERTY:Ljava/lang/String; = "com.microblink.YelpKey"

.field private static applicationContext:Landroid/content/Context; = null
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static debug:Z = false

.field private static googleApiKey:Ljava/lang/String; = null

.field private static licenseKey:Ljava/lang/String; = null

.field private static licenseeName:Ljava/lang/String; = null

.field private static networkOffline:Z = false

.field private static onDeviceOcr:Z = false

.field private static productIntelligenceKey:Ljava/lang/String; = null

.field private static retryOnConnectionFailure:Z = false

.field private static volatile sdkInitialized:Z = false

.field private static uniqueId:Ljava/lang/String;

.field private static yelpApiKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x17

    if-lt v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/microblink/ReceiptSdk;->onDeviceOcr:Z

    sput-boolean v1, Lcom/microblink/ReceiptSdk;->networkOffline:Z

    sput-boolean v1, Lcom/microblink/ReceiptSdk;->retryOnConnectionFailure:Z

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/InstantiationError;

    const-string v1, "ReceiptSdk constructor can\'t be called!"

    invoke-direct {v0, v1}, Ljava/lang/InstantiationError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static applicationContext()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lcom/microblink/internal/Validate;->sdkInitialized()V

    sget-object v0, Lcom/microblink/ReceiptSdk;->applicationContext:Landroid/content/Context;

    return-object v0
.end method

.method private static callLicenseService()V
    .locals 3

    invoke-static {}, Lcom/microblink/AccessTokenManager;->getInstance()Lcom/microblink/AccessTokenManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/AccessTokenManager;->hasAccessToken()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "ReceiptSdk"

    const-string v2, "we already have the access token!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lcom/microblink/ReceiptSdk;->applicationContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/microblink/internal/Validate;->hasInternetPermissions(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ReceiptSdk"

    const-string v2, "internet permission not provided!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance v0, Lcom/microblink/internal/services/license/LicenseeRepository;

    invoke-direct {v0}, Lcom/microblink/internal/services/license/LicenseeRepository;-><init>()V

    new-instance v1, Lcom/microblink/ReceiptSdk$2;

    invoke-direct {v1}, Lcom/microblink/ReceiptSdk$2;-><init>()V

    invoke-virtual {v0, v1}, Lcom/microblink/internal/services/license/LicenseeRepository;->checkLicense(Lcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method public static debug(Z)V
    .locals 0

    sput-boolean p0, Lcom/microblink/ReceiptSdk;->debug:Z

    if-eqz p0, :cond_0

    sget-object p0, Lcom/microblink/internal/Logger$LogLevel;->LOG_DEBUG:Lcom/microblink/internal/Logger$LogLevel;

    :goto_0
    invoke-static {p0}, Lcom/microblink/internal/Logger;->setLogLevel(Lcom/microblink/internal/Logger$LogLevel;)V

    return-void

    :cond_0
    sget-object p0, Lcom/microblink/internal/Logger$LogLevel;->LOG_WARNINGS_AND_ERRORS:Lcom/microblink/internal/Logger$LogLevel;

    goto :goto_0
.end method

.method public static debug()Z
    .locals 1

    sget-boolean v0, Lcom/microblink/ReceiptSdk;->debug:Z

    return v0
.end method

.method public static googleApiKey()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/microblink/ReceiptSdk;->googleApiKey:Ljava/lang/String;

    return-object v0
.end method

.method public static googleApiKey(Ljava/lang/String;)V
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sput-object p0, Lcom/microblink/ReceiptSdk;->googleApiKey:Ljava/lang/String;

    return-void
.end method

.method private static native initializeOcrModels(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public static declared-synchronized isInitialized()Z
    .locals 2

    const-class v0, Lcom/microblink/ReceiptSdk;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/microblink/ReceiptSdk;->sdkInitialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static isRecognizerSupported(Landroid/content/Context;)Z
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/microblink/RecognizerCompatibility;->recognizerCompatibilityStatus(Landroid/content/Context;)Lcom/microblink/RecognizerCompatibilityStatus;

    move-result-object p0

    sget-object v0, Lcom/microblink/RecognizerCompatibilityStatus;->RECOGNIZER_SUPPORTED:Lcom/microblink/RecognizerCompatibilityStatus;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static native licenseCheck(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public static licenseKey()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/microblink/ReceiptSdk;->licenseKey:Ljava/lang/String;

    return-object v0
.end method

.method public static licenseeName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/microblink/ReceiptSdk;->licenseeName:Ljava/lang/String;

    return-object v0
.end method

.method private static metaFromManifest(Landroid/content/Context;)V
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x80

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_8

    iget-object v1, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "com.microblink.NetworkOffline"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sput-boolean v0, Lcom/microblink/ReceiptSdk;->networkOffline:Z

    :cond_1
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "com.microblink.OnDeviceOcr"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sput-boolean v0, Lcom/microblink/ReceiptSdk;->onDeviceOcr:Z

    :cond_2
    sget-object v0, Lcom/microblink/ReceiptSdk;->licenseKey:Ljava/lang/String;

    if-nez v0, :cond_3

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "com.microblink.LicenseKey"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_3

    check-cast v0, Ljava/lang/String;

    sput-object v0, Lcom/microblink/ReceiptSdk;->licenseKey:Ljava/lang/String;

    :cond_3
    sget-object v0, Lcom/microblink/ReceiptSdk;->licenseeName:Ljava/lang/String;

    if-nez v0, :cond_4

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "com.microblink.LicenseeName"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/lang/String;

    sput-object v0, Lcom/microblink/ReceiptSdk;->licenseeName:Ljava/lang/String;

    :cond_4
    sget-object v0, Lcom/microblink/ReceiptSdk;->googleApiKey:Ljava/lang/String;

    if-nez v0, :cond_5

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "com.microblink.GooglePlacesKey"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_5

    check-cast v0, Ljava/lang/String;

    sput-object v0, Lcom/microblink/ReceiptSdk;->googleApiKey:Ljava/lang/String;

    :cond_5
    sget-object v0, Lcom/microblink/ReceiptSdk;->yelpApiKey:Ljava/lang/String;

    if-nez v0, :cond_6

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "com.microblink.YelpKey"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_6

    check-cast v0, Ljava/lang/String;

    sput-object v0, Lcom/microblink/ReceiptSdk;->yelpApiKey:Ljava/lang/String;

    :cond_6
    sget-object v0, Lcom/microblink/ReceiptSdk;->productIntelligenceKey:Ljava/lang/String;

    if-nez v0, :cond_7

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "com.microblink.ProductIntelligence"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_7

    check-cast p0, Ljava/lang/String;

    sput-object p0, Lcom/microblink/ReceiptSdk;->productIntelligenceKey:Ljava/lang/String;

    :cond_7
    return-void

    :cond_8
    :goto_0
    const-string p0, "ReceiptSdk"

    const-string v1, "application info or application meta data couldn\'t be found."

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception p0

    const-string v1, "ReceiptSdk"

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p0, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static networkOffline(Z)V
    .locals 0

    sput-boolean p0, Lcom/microblink/ReceiptSdk;->networkOffline:Z

    return-void
.end method

.method public static networkOffline()Z
    .locals 1

    sget-boolean v0, Lcom/microblink/ReceiptSdk;->networkOffline:Z

    return v0
.end method

.method static ocrCorrections()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static onDeviceOcr(Z)V
    .locals 0

    sput-boolean p0, Lcom/microblink/ReceiptSdk;->onDeviceOcr:Z

    return-void
.end method

.method public static onDeviceOcr()Z
    .locals 1

    sget-boolean v0, Lcom/microblink/ReceiptSdk;->onDeviceOcr:Z

    return v0
.end method

.method public static productIntelligenceKey()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/microblink/ReceiptSdk;->productIntelligenceKey:Ljava/lang/String;

    return-object v0
.end method

.method public static productIntelligenceKey(Ljava/lang/String;)V
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sput-object p0, Lcom/microblink/ReceiptSdk;->productIntelligenceKey:Ljava/lang/String;

    return-void
.end method

.method public static retryOnConnectionFailure()Z
    .locals 1

    sget-boolean v0, Lcom/microblink/ReceiptSdk;->retryOnConnectionFailure:Z

    return v0
.end method

.method public static declared-synchronized sdkInitialize(Landroid/content/Context;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-class v0, Lcom/microblink/ReceiptSdk;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/microblink/ReceiptSdk$1;

    invoke-direct {v1}, Lcom/microblink/ReceiptSdk$1;-><init>()V

    invoke-static {p0, v1}, Lcom/microblink/ReceiptSdk;->sdkInitialize(Landroid/content/Context;Lcom/microblink/InitializeCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized sdkInitialize(Landroid/content/Context;Lcom/microblink/InitializeCallback;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/microblink/InitializeCallback;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-class v0, Lcom/microblink/ReceiptSdk;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lcom/microblink/ReceiptSdk;->metaFromManifest(Landroid/content/Context;)V

    sget-object v1, Lcom/microblink/ReceiptSdk;->licenseKey:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x0

    sput-boolean p0, Lcom/microblink/ReceiptSdk;->sdkInitialized:Z

    if-eqz p1, :cond_0

    new-instance p0, Lcom/microblink/SdkNotInitializedException;

    const-string v1, "license key not found in your manifest!"

    invoke-direct {p0, v1}, Lcom/microblink/SdkNotInitializedException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lcom/microblink/InitializeCallback;->onException(Lcom/microblink/ReceiptSdkException;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    sget-object v1, Lcom/microblink/ReceiptSdk;->licenseKey:Ljava/lang/String;

    invoke-static {p0, v1, p1}, Lcom/microblink/ReceiptSdk;->sdkInitialize(Landroid/content/Context;Ljava/lang/String;Lcom/microblink/InitializeCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized sdkInitialize(Landroid/content/Context;Ljava/lang/String;Lcom/microblink/InitializeCallback;)V
    .locals 4
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/InitializeCallback;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-class v0, Lcom/microblink/ReceiptSdk;

    monitor-enter v0

    :try_start_0
    const-string v1, "applicationContext"

    invoke-static {p0, v1}, Lcom/microblink/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/microblink/ReceiptSdk;->applicationContext:Landroid/content/Context;

    sput-object p1, Lcom/microblink/ReceiptSdk;->licenseKey:Ljava/lang/String;

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p0

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    sput-boolean v1, Lcom/microblink/ReceiptSdk;->sdkInitialized:Z

    if-eqz p2, :cond_0

    new-instance p0, Lcom/microblink/InvalidLicenceException;

    const-string p1, "license key can not be null or empty!"

    invoke-direct {p0, p1}, Lcom/microblink/InvalidLicenceException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lcom/microblink/InitializeCallback;->onException(Lcom/microblink/ReceiptSdkException;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->isNativeLibraryLoaded()Z

    move-result p0

    if-nez p0, :cond_4

    sput-boolean v1, Lcom/microblink/ReceiptSdk;->sdkInitialized:Z

    if-eqz p2, :cond_3

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoadError()Ljava/lang/Error;

    move-result-object p0

    new-instance p1, Lcom/microblink/SdkNotInitializedException;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Error;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-string p0, "Native library not loaded!!!"

    :goto_0
    invoke-direct {p1, p0}, Lcom/microblink/SdkNotInitializedException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/microblink/InitializeCallback;->onException(Lcom/microblink/ReceiptSdkException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    monitor-exit v0

    return-void

    :cond_4
    :try_start_2
    sget-boolean p0, Lcom/microblink/ReceiptSdk;->sdkInitialized:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p0, :cond_a

    :try_start_3
    invoke-static {}, Lcom/microblink/AssetManagerProvider;->getInstance()Lcom/microblink/AssetManagerProvider;

    move-result-object p0

    sget-object v2, Lcom/microblink/ReceiptSdk;->applicationContext:Landroid/content/Context;

    invoke-virtual {p0, v2}, Lcom/microblink/AssetManagerProvider;->prepare(Landroid/content/Context;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {}, Lcom/microblink/AccessTokenManager;->getInstance()Lcom/microblink/AccessTokenManager;

    move-result-object p0

    invoke-virtual {p0}, Lcom/microblink/AccessTokenManager;->loadAccessToken()Z

    sget-object p0, Lcom/microblink/ReceiptSdk;->applicationContext:Landroid/content/Context;

    invoke-static {p0}, Lcom/microblink/internal/MerchantCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/MerchantCsvManager;

    move-result-object p0

    invoke-virtual {p0}, Lcom/microblink/internal/MerchantCsvManager;->parse()V

    invoke-static {}, Lcom/microblink/ReceiptSdk;->licenseeName()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lcom/microblink/ReceiptSdk;->onDeviceOcr()Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v2, "microblink/deep_ocr_model_internal_5.1.0.zzip"

    const-string v3, "microblink/logo_detection_model_production_5.1.1.zzip"

    invoke-static {p1, p0, v2, v3}, Lcom/microblink/ReceiptSdk;->initializeOcrModels(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_5
    invoke-static {p1, p0}, Lcom/microblink/ReceiptSdk;->licenseCheck(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    sput-boolean v1, Lcom/microblink/ReceiptSdk;->sdkInitialized:Z

    if-eqz p2, :cond_6

    new-instance p1, Lcom/microblink/SdkNotInitializedException;

    invoke-direct {p1, p0}, Lcom/microblink/SdkNotInitializedException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/microblink/InitializeCallback;->onException(Lcom/microblink/ReceiptSdkException;)V

    :cond_6
    const-string p1, "ReceiptSdk"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-void

    :cond_7
    if-eqz p2, :cond_8

    :try_start_5
    invoke-interface {p2}, Lcom/microblink/InitializeCallback;->onInitialized()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_8
    monitor-exit v0

    return-void

    :catch_0
    move-exception p0

    :try_start_6
    const-string p1, "ReceiptSdk"

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {p1, v2, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sput-boolean v1, Lcom/microblink/ReceiptSdk;->sdkInitialized:Z

    if-eqz p2, :cond_9

    new-instance p1, Lcom/microblink/SdkNotInitializedException;

    invoke-direct {p1, p0}, Lcom/microblink/SdkNotInitializedException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p2, p1}, Lcom/microblink/InitializeCallback;->onException(Lcom/microblink/ReceiptSdkException;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_9
    monitor-exit v0

    return-void

    :cond_a
    :try_start_7
    invoke-static {}, Lcom/microblink/AssetManagerProvider;->getInstance()Lcom/microblink/AssetManagerProvider;

    move-result-object p0

    sget-object v2, Lcom/microblink/ReceiptSdk;->applicationContext:Landroid/content/Context;

    invoke-virtual {p0, v2}, Lcom/microblink/AssetManagerProvider;->prepare(Landroid/content/Context;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    sget-object p0, Lcom/microblink/ReceiptSdk;->applicationContext:Landroid/content/Context;

    invoke-static {p0}, Lcom/microblink/ReceiptSdk;->isRecognizerSupported(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_c

    sput-boolean v1, Lcom/microblink/ReceiptSdk;->sdkInitialized:Z

    const-string p0, "The sdk failed to sdkInitialize, Recognizer not supported!"

    if-eqz p2, :cond_b

    new-instance p1, Lcom/microblink/SdkNotInitializedException;

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->isNativeLibraryLoaded()Z

    move-result v2

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->nativeLibraryLoadError()Ljava/lang/Error;

    move-result-object v3

    invoke-direct {p1, v2, p0, v3}, Lcom/microblink/SdkNotInitializedException;-><init>(ZLjava/lang/String;Ljava/lang/Error;)V

    invoke-interface {p2, p1}, Lcom/microblink/InitializeCallback;->onException(Lcom/microblink/ReceiptSdkException;)V

    :cond_b
    const-string p1, "ReceiptSdk"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    monitor-exit v0

    return-void

    :cond_c
    :try_start_9
    invoke-static {}, Lcom/microblink/ReceiptSdk;->licenseeName()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lcom/microblink/ReceiptSdk;->onDeviceOcr()Z

    move-result v2

    if-eqz v2, :cond_d

    const-string v2, "microblink/deep_ocr_model_internal_5.1.0.zzip"

    const-string v3, "microblink/logo_detection_model_production_5.1.1.zzip"

    invoke-static {p1, p0, v2, v3}, Lcom/microblink/ReceiptSdk;->initializeOcrModels(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_d
    invoke-static {p1, p0}, Lcom/microblink/ReceiptSdk;->licenseCheck(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_2
    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_f

    sput-boolean v1, Lcom/microblink/ReceiptSdk;->sdkInitialized:Z

    if-eqz p2, :cond_e

    new-instance p1, Lcom/microblink/SdkNotInitializedException;

    invoke-direct {p1, p0}, Lcom/microblink/SdkNotInitializedException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/microblink/InitializeCallback;->onException(Lcom/microblink/ReceiptSdkException;)V

    :cond_e
    const-string p1, "ReceiptSdk"

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    monitor-exit v0

    return-void

    :cond_f
    const/4 p0, 0x1

    :try_start_a
    sput-boolean p0, Lcom/microblink/ReceiptSdk;->sdkInitialized:Z

    sget-object p0, Lcom/microblink/ReceiptSdk;->applicationContext:Landroid/content/Context;

    invoke-static {p0, v1}, Lcom/microblink/internal/Validate;->hasInternetPermissions(Landroid/content/Context;Z)V

    sget-object p0, Lcom/microblink/ReceiptSdk;->applicationContext:Landroid/content/Context;

    invoke-static {p0}, Lcom/microblink/internal/DeviceHelper;->uniqueId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/microblink/ReceiptSdk;->uniqueId:Ljava/lang/String;

    invoke-static {}, Lcom/microblink/AccessTokenManager;->getInstance()Lcom/microblink/AccessTokenManager;

    move-result-object p0

    invoke-virtual {p0}, Lcom/microblink/AccessTokenManager;->loadAccessToken()Z

    sget-object p0, Lcom/microblink/ReceiptSdk;->applicationContext:Landroid/content/Context;

    invoke-static {p0}, Lcom/microblink/internal/MerchantCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/MerchantCsvManager;

    move-result-object p0

    invoke-virtual {p0}, Lcom/microblink/internal/MerchantCsvManager;->parse()V

    if-eqz p2, :cond_10

    invoke-interface {p2}, Lcom/microblink/InitializeCallback;->onInitialized()V

    :cond_10
    invoke-static {}, Lcom/microblink/ReceiptSdk;->callLicenseService()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    monitor-exit v0

    return-void

    :catch_1
    move-exception p0

    :try_start_b
    const-string p1, "ReceiptSdk"

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {p1, v2, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sput-boolean v1, Lcom/microblink/ReceiptSdk;->sdkInitialized:Z

    if-eqz p2, :cond_11

    new-instance p1, Lcom/microblink/SdkNotInitializedException;

    invoke-direct {p1, p0}, Lcom/microblink/SdkNotInitializedException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p2, p1}, Lcom/microblink/InitializeCallback;->onException(Lcom/microblink/ReceiptSdkException;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :cond_11
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static sha()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/microblink/SdkVersion;->sha()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static uniqueId()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/microblink/ReceiptSdk;->uniqueId:Ljava/lang/String;

    return-object v0
.end method

.method public static versionName()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/microblink/SdkVersion;->versionName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static yelpApiKey()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/microblink/ReceiptSdk;->yelpApiKey:Ljava/lang/String;

    return-object v0
.end method

.method public static yelpApiKey(Ljava/lang/String;)V
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sput-object p0, Lcom/microblink/ReceiptSdk;->yelpApiKey:Ljava/lang/String;

    return-void
.end method
