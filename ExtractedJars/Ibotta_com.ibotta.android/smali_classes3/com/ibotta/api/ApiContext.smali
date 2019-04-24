.class public final enum Lcom/ibotta/api/ApiContext;
.super Ljava/lang/Enum;
.source "ApiContext.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/ApiContext;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/ApiContext;

.field public static final enum INSTANCE:Lcom/ibotta/api/ApiContext;


# instance fields
.field private apiAuthManager:Lcom/ibotta/api/auth/ApiAuthManager;

.field private apiCache:Lcom/ibotta/api/ApiCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/api/ApiCache<",
            "Lcom/ibotta/api/CacheableApiCall;",
            "Lcom/ibotta/api/CacheableApiResponse;",
            ">;"
        }
    .end annotation
.end field

.field private apiClient:Lcom/ibotta/api/ApiClient;

.field private apiExecutionFactory:Lcom/ibotta/api/execution/ApiExecutionFactory;

.field private apiFormatting:Lcom/ibotta/api/ApiFormatting;

.field private apiUriBuilder:Lcom/ibotta/api/ApiUriBuilder;

.field private apiUrl:Ljava/lang/String;

.field private appVersion:Ljava/lang/String;

.field private appsFlyerUID:Ljava/lang/String;

.field private cookieJar:Lokhttp3/CookieJar;

.field private debug:Z

.field private devicePrivateId:Ljava/lang/String;

.field private devicePublicId:Ljava/lang/String;

.field private emulator:Z

.field private exceptionTracker:Lcom/ibotta/api/ExceptionTracker;

.field private key:Ljava/lang/String;

.field private modelNumber:Ljava/lang/String;

.field private mvtApiUrl:Ljava/lang/String;

.field private offerRecommScoreName:Ljava/lang/String;

.field private okHttpClient:Lokhttp3/OkHttpClient;

.field private osVersion:Ljava/lang/String;

.field private platform:Ljava/lang/String;

.field private pwiApiUrl:Ljava/lang/String;

.field private rooted:Z

.field private secret:Ljava/lang/String;

.field private userLocation:Lcom/ibotta/api/UserLocation;

.field private workDir:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 14
    new-instance v0, Lcom/ibotta/api/ApiContext;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/ApiContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    const/4 v0, 0x1

    .line 13
    new-array v0, v0, [Lcom/ibotta/api/ApiContext;

    sget-object v1, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/api/ApiContext;->$VALUES:[Lcom/ibotta/api/ApiContext;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 36
    new-instance p1, Lcom/ibotta/api/UserLocation;

    invoke-direct {p1}, Lcom/ibotta/api/UserLocation;-><init>()V

    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->userLocation:Lcom/ibotta/api/UserLocation;

    .line 37
    new-instance p1, Lcom/ibotta/api/NoOpExceptionTracker;

    invoke-direct {p1}, Lcom/ibotta/api/NoOpExceptionTracker;-><init>()V

    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->exceptionTracker:Lcom/ibotta/api/ExceptionTracker;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/ApiContext;
    .locals 1

    .line 13
    const-class v0, Lcom/ibotta/api/ApiContext;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/ApiContext;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/ApiContext;
    .locals 1

    .line 13
    sget-object v0, Lcom/ibotta/api/ApiContext;->$VALUES:[Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, [Lcom/ibotta/api/ApiContext;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/ApiContext;

    return-object v0
.end method


# virtual methods
.method public getApiAuthManager()Lcom/ibotta/api/auth/ApiAuthManager;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->apiAuthManager:Lcom/ibotta/api/auth/ApiAuthManager;

    return-object v0
.end method

.method public getApiCache()Lcom/ibotta/api/ApiCache;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/ibotta/api/ApiCache<",
            "Lcom/ibotta/api/CacheableApiCall;",
            "Lcom/ibotta/api/CacheableApiResponse;",
            ">;"
        }
    .end annotation

    .line 178
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->apiCache:Lcom/ibotta/api/ApiCache;

    return-object v0
.end method

.method public getApiClient()Lcom/ibotta/api/ApiClient;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->apiClient:Lcom/ibotta/api/ApiClient;

    return-object v0
.end method

.method public getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->apiExecutionFactory:Lcom/ibotta/api/execution/ApiExecutionFactory;

    return-object v0
.end method

.method public getApiFormatting()Lcom/ibotta/api/ApiFormatting;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->apiFormatting:Lcom/ibotta/api/ApiFormatting;

    return-object v0
.end method

.method public getApiUriBuilder()Lcom/ibotta/api/ApiUriBuilder;
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->apiUriBuilder:Lcom/ibotta/api/ApiUriBuilder;

    return-object v0
.end method

.method public getApiUrl()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->apiUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getAppVersion()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->appVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getAppsFlyerUID()Ljava/lang/String;
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->appsFlyerUID:Ljava/lang/String;

    return-object v0
.end method

.method public getCookieJar()Lokhttp3/CookieJar;
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->cookieJar:Lokhttp3/CookieJar;

    return-object v0
.end method

.method public getDevicePrivateId()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->devicePrivateId:Ljava/lang/String;

    return-object v0
.end method

.method public getDevicePublicId()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->devicePublicId:Ljava/lang/String;

    return-object v0
.end method

.method public getExceptionTracker()Lcom/ibotta/api/ExceptionTracker;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->exceptionTracker:Lcom/ibotta/api/ExceptionTracker;

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getModelNumber()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->modelNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getMvtApiUrl()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->mvtApiUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferRecommScoreName()Ljava/lang/String;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->offerRecommScoreName:Ljava/lang/String;

    return-object v0
.end method

.method public getOkHttpClient()Lokhttp3/OkHttpClient;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->okHttpClient:Lokhttp3/OkHttpClient;

    return-object v0
.end method

.method public getOsVersion()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->osVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getPlatform()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->platform:Ljava/lang/String;

    return-object v0
.end method

.method public getPwiApiUrl()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->pwiApiUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSecret()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->secret:Ljava/lang/String;

    return-object v0
.end method

.method public getUserLocation()Lcom/ibotta/api/UserLocation;
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->userLocation:Lcom/ibotta/api/UserLocation;

    return-object v0
.end method

.method public getWorkDir()Ljava/io/File;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/ibotta/api/ApiContext;->workDir:Ljava/io/File;

    return-object v0
.end method

.method public isDebug()Z
    .locals 1

    .line 152
    iget-boolean v0, p0, Lcom/ibotta/api/ApiContext;->debug:Z

    return v0
.end method

.method public isEmulator()Z
    .locals 1

    .line 148
    iget-boolean v0, p0, Lcom/ibotta/api/ApiContext;->emulator:Z

    return v0
.end method

.method public isRooted()Z
    .locals 1

    .line 140
    iget-boolean v0, p0, Lcom/ibotta/api/ApiContext;->rooted:Z

    return v0
.end method

.method public setApiAuthManager(Lcom/ibotta/api/auth/ApiAuthManager;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->apiAuthManager:Lcom/ibotta/api/auth/ApiAuthManager;

    return-void
.end method

.method public setApiCache(Lcom/ibotta/api/ApiCache;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/ApiCache<",
            "Lcom/ibotta/api/CacheableApiCall;",
            "Lcom/ibotta/api/CacheableApiResponse;",
            ">;)V"
        }
    .end annotation

    .line 182
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->apiCache:Lcom/ibotta/api/ApiCache;

    return-void
.end method

.method public setApiClient(Lcom/ibotta/api/ApiClient;)V
    .locals 4

    .line 172
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->apiClient:Lcom/ibotta/api/ApiClient;

    if-eqz p1, :cond_0

    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "null"

    .line 174
    :goto_0
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v1, "Set API Client: %1$s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public setApiExecutionFactory(Lcom/ibotta/api/execution/ApiExecutionFactory;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->apiExecutionFactory:Lcom/ibotta/api/execution/ApiExecutionFactory;

    return-void
.end method

.method public setApiFormatting(Lcom/ibotta/api/ApiFormatting;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->apiFormatting:Lcom/ibotta/api/ApiFormatting;

    return-void
.end method

.method public setApiUriBuilder(Lcom/ibotta/api/ApiUriBuilder;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->apiUriBuilder:Lcom/ibotta/api/ApiUriBuilder;

    return-void
.end method

.method public setApiUrl(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->apiUrl:Ljava/lang/String;

    return-void
.end method

.method public setAppVersion(Ljava/lang/String;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->appVersion:Ljava/lang/String;

    return-void
.end method

.method public setAppsFlyerUID(Ljava/lang/String;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->appsFlyerUID:Ljava/lang/String;

    return-void
.end method

.method public setCookieJar(Lokhttp3/CookieJar;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->cookieJar:Lokhttp3/CookieJar;

    return-void
.end method

.method public setDebug(Z)V
    .locals 0

    .line 156
    iput-boolean p1, p0, Lcom/ibotta/api/ApiContext;->debug:Z

    return-void
.end method

.method public setDevicePrivateId(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->devicePrivateId:Ljava/lang/String;

    return-void
.end method

.method public setDevicePublicId(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->devicePublicId:Ljava/lang/String;

    return-void
.end method

.method public setEmulator(Z)V
    .locals 0

    .line 144
    iput-boolean p1, p0, Lcom/ibotta/api/ApiContext;->emulator:Z

    return-void
.end method

.method public setExceptionTracker(Lcom/ibotta/api/ExceptionTracker;)V
    .locals 0

    if-nez p1, :cond_0

    .line 219
    new-instance p1, Lcom/ibotta/api/NoOpExceptionTracker;

    invoke-direct {p1}, Lcom/ibotta/api/NoOpExceptionTracker;-><init>()V

    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->exceptionTracker:Lcom/ibotta/api/ExceptionTracker;

    goto :goto_0

    .line 221
    :cond_0
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->exceptionTracker:Lcom/ibotta/api/ExceptionTracker;

    :goto_0
    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->key:Ljava/lang/String;

    return-void
.end method

.method public setModelNumber(Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->modelNumber:Ljava/lang/String;

    return-void
.end method

.method public setMvtApiUrl(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->mvtApiUrl:Ljava/lang/String;

    return-void
.end method

.method public setOfferRecommScoreName(Ljava/lang/String;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->offerRecommScoreName:Ljava/lang/String;

    return-void
.end method

.method public setOkHttpClient(Lokhttp3/OkHttpClient;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->okHttpClient:Lokhttp3/OkHttpClient;

    return-void
.end method

.method public setOsVersion(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->osVersion:Ljava/lang/String;

    return-void
.end method

.method public setPlatform(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->platform:Ljava/lang/String;

    return-void
.end method

.method public setPwiApiUrl(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->pwiApiUrl:Ljava/lang/String;

    return-void
.end method

.method public setRooted(Z)V
    .locals 0

    .line 136
    iput-boolean p1, p0, Lcom/ibotta/api/ApiContext;->rooted:Z

    return-void
.end method

.method public setSecret(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->secret:Ljava/lang/String;

    return-void
.end method

.method public setWorkDir(Ljava/io/File;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lcom/ibotta/api/ApiContext;->workDir:Ljava/io/File;

    return-void
.end method
