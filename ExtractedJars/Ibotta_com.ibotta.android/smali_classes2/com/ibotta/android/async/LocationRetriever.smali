.class public Lcom/ibotta/android/async/LocationRetriever;
.super Ljava/lang/Object;
.source "LocationRetriever.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;
    }
.end annotation


# static fields
.field private static final ZIP_CACHE_LIMIT:I = 0xa

.field private static final ZIP_GEOHASH_WIDTH:I = 0x5

.field private static final zipCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

.field private final client:Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;

.field private latitude:Ljava/lang/Double;

.field private longitude:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lcom/ibotta/android/async/LocationRetriever;->zipCache:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;Lcom/ibotta/android/service/api/job/ApiJobEnvironment;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/async/LocationRetriever;->client:Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;

    .line 51
    iput-object p2, p0, Lcom/ibotta/android/async/LocationRetriever;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    return-void
.end method

.method private notEmulator()Z
    .locals 4

    const/4 v0, 0x0

    .line 136
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/LocationRetriever;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v1}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    .line 137
    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v3, "vbox"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "0"

    const-string v3, "mock_location"

    .line 138
    invoke-static {v1, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    return v0

    :catch_0
    move-exception v1

    const-string v2, "Emulator check failed."

    .line 142
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public loadLocation(Z)V
    .locals 12

    const-string v0, "loadLocation: quick=%1$b"

    const/4 v1, 0x1

    .line 71
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->client:Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;

    invoke-interface {v0}, Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    if-nez v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->client:Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;

    invoke-interface {v0}, Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;->makeApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;->setApiCall(Lcom/ibotta/api/ApiCall;)V

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->latitude:Ljava/lang/Double;

    const/4 v2, 0x0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->longitude:Ljava/lang/Double;

    if-nez v0, :cond_6

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    .line 81
    iget-object v3, p0, Lcom/ibotta/android/async/LocationRetriever;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v3}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v5

    iget-object v3, p0, Lcom/ibotta/android/async/LocationRetriever;->client:Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;

    invoke-interface {v3}, Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;->getMaxLocationAge()J

    move-result-wide v7

    sub-long/2addr v5, v7

    if-eqz v0, :cond_1

    .line 82
    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v7

    cmp-long v3, v5, v7

    if-lez v3, :cond_1

    const-string v0, "Last location is too old, discarding."

    .line 83
    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v0, v2

    .line 87
    :cond_1
    iget-object v3, p0, Lcom/ibotta/android/async/LocationRetriever;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v3}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->isCoarseLocationAvailable()Z

    move-result v3

    .line 88
    iget-object v5, p0, Lcom/ibotta/android/async/LocationRetriever;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v5}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->isFineLocationAvailable()Z

    move-result v5

    if-nez v0, :cond_3

    if-nez p1, :cond_3

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/async/LocationRetriever;->notEmulator()Z

    move-result v6

    if-eqz v6, :cond_3

    if-nez v3, :cond_2

    if-eqz v5, :cond_3

    :cond_2
    const-string v0, "Trying for fresh location."

    .line 94
    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->client:Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;

    .line 96
    invoke-interface {v0}, Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;->getMaxLocationAge()J

    move-result-wide v6

    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->client:Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;

    invoke-interface {v0}, Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;->getLocationWaitTime()J

    move-result-wide v8

    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->client:Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;

    invoke-interface {v0}, Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;->getLocationIntervalWaitTime()J

    move-result-wide v10

    move-object v5, p0

    .line 95
    invoke-virtual/range {v5 .. v11}, Lcom/ibotta/android/async/LocationRetriever;->tryForFreshLocation(JJJ)Landroid/location/Location;

    move-result-object v0

    goto :goto_0

    :cond_3
    if-nez v0, :cond_5

    if-nez v3, :cond_4

    if-eqz v5, :cond_5

    :cond_4
    const-string v3, "Will request for a location update for use at another time."

    .line 98
    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v3, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    invoke-virtual {p0}, Lcom/ibotta/android/async/LocationRetriever;->requestFreshLocationForLaterUse()V

    goto :goto_0

    :cond_5
    const-string v3, "Skipped attempt for fresh location."

    .line 101
    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v3, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    if-eqz v0, :cond_7

    const-string v3, "Location obtained good, using that."

    .line 105
    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v3, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    iput-object v3, p0, Lcom/ibotta/android/async/LocationRetriever;->latitude:Ljava/lang/Double;

    .line 107
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->longitude:Ljava/lang/Double;

    goto :goto_1

    :cond_6
    const-string v0, "Location supplied by caller."

    .line 110
    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v0, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->latitude:Ljava/lang/Double;

    if-eqz v0, :cond_8

    iget-object v3, p0, Lcom/ibotta/android/async/LocationRetriever;->longitude:Ljava/lang/Double;

    if-eqz v3, :cond_8

    .line 115
    invoke-virtual {p0, v0, v3, p1}, Lcom/ibotta/android/async/LocationRetriever;->lookUpZip(Ljava/lang/Double;Ljava/lang/Double;Z)Ljava/lang/String;

    move-result-object v2

    const-string p1, "Last location: lat=%1$f, long=%2$f, zip=%3$s"

    const/4 v0, 0x3

    .line 117
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/async/LocationRetriever;->latitude:Ljava/lang/Double;

    aput-object v3, v0, v4

    iget-object v3, p0, Lcom/ibotta/android/async/LocationRetriever;->longitude:Ljava/lang/Double;

    aput-object v3, v0, v1

    const/4 v1, 0x2

    aput-object v2, v0, v1

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_8
    if-nez v2, :cond_9

    const-string p1, "Zip not obtained by location, using customer zip as fallback"

    .line 121
    new-array v0, v4, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object p1, p0, Lcom/ibotta/android/async/LocationRetriever;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCustomerZip()Ljava/lang/String;

    move-result-object v2

    :cond_9
    if-eqz v2, :cond_a

    .line 126
    iget-object p1, p0, Lcom/ibotta/android/async/LocationRetriever;->client:Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;

    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->latitude:Ljava/lang/Double;

    iget-object v1, p0, Lcom/ibotta/android/async/LocationRetriever;->longitude:Ljava/lang/Double;

    invoke-interface {p1, v0, v1, v2}, Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;->onLocationReady(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V

    :cond_a
    return-void
.end method

.method protected lookUpZip(Ljava/lang/Double;Ljava/lang/Double;Z)Ljava/lang/String;
    .locals 12

    const-string v0, "lookUpZip: lat=%1$f, long=%2$f, quick=%3$b"

    const/4 v1, 0x3

    .line 157
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v3, 0x1

    aput-object p2, v1, v3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v5, 0x2

    aput-object v4, v1, v5

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_5

    if-eqz p2, :cond_5

    .line 161
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    const/4 v4, 0x5

    invoke-static {v0, v1, v6, v7, v4}, Lch/hsr/geohash/GeoHash;->withCharacterPrecision(DDI)Lch/hsr/geohash/GeoHash;

    move-result-object v0

    invoke-virtual {v0}, Lch/hsr/geohash/GeoHash;->toBinaryString()Ljava/lang/String;

    move-result-object v0

    .line 163
    sget-object v1, Lcom/ibotta/android/async/LocationRetriever;->zipCache:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v4, "HIT - Zip found in cache: geohash=%1$s, zip=%2$s"

    .line 165
    new-array v6, v5, [Ljava/lang/Object;

    aput-object v0, v6, v2

    aput-object v1, v6, v3

    invoke-static {v4, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    if-nez v1, :cond_4

    if-nez p3, :cond_4

    :try_start_0
    const-string p3, "Attempting to lookup zip from geocoder."

    .line 170
    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {p3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    iget-object p3, p0, Lcom/ibotta/android/async/LocationRetriever;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {p3}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->createGeocoder()Landroid/location/Geocoder;

    move-result-object v6

    .line 172
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    const/4 v11, 0x1

    invoke-virtual/range {v6 .. v11}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 174
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    .line 175
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/Address;

    if-eqz p1, :cond_2

    const-string p2, "Zip obtained from geocoder."

    .line 178
    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    invoke-virtual {p1}, Landroid/location/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v1

    .line 181
    :goto_0
    sget-object p1, Lcom/ibotta/android/async/LocationRetriever;->zipCache:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    const/16 p2, 0x9

    if-lt p1, p2, :cond_1

    .line 182
    sget-object p1, Lcom/ibotta/android/async/LocationRetriever;->zipCache:Ljava/util/Map;

    sget-object p2, Lcom/ibotta/android/async/LocationRetriever;->zipCache:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 185
    :cond_1
    sget-object p1, Lcom/ibotta/android/async/LocationRetriever;->zipCache:Ljava/util/Map;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "Added zip to cache: geohash=%1$s, zip=%2$s"

    .line 186
    new-array p2, v5, [Ljava/lang/Object;

    aput-object v0, p2, v2

    aput-object v1, p2, v3

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    const-string p1, "Zip not found using geocoder."

    .line 188
    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    const-string p1, "Zip not found using geocoder."

    .line 191
    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string p2, "Failed to get zip for lat/long."

    .line 196
    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception p1

    const-string p2, "Failed to get zip for lat/long."

    .line 194
    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_1
    if-nez v1, :cond_6

    .line 202
    iget-object p1, p0, Lcom/ibotta/android/async/LocationRetriever;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCustomerZip()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    :cond_6
    :goto_2
    return-object v1
.end method

.method protected requestFreshLocationForLaterUse()V
    .locals 3

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    iget-object v1, p0, Lcom/ibotta/android/async/LocationRetriever;->client:Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;

    invoke-interface {v1}, Lcom/ibotta/android/async/LocationRetriever$LocationRetrieverClient;->getMaxLocationAge()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->requestUpdate(J)V

    return-void
.end method

.method protected tryForFreshLocation(JJJ)Landroid/location/Location;
    .locals 7

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/async/LocationRetriever;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    invoke-interface/range {v0 .. v6}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->waitForFreshLocation(JJJ)Landroid/location/Location;

    move-result-object p1

    return-object p1
.end method
