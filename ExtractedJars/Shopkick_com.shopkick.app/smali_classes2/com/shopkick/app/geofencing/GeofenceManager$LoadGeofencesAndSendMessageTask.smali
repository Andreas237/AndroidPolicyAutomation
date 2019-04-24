.class Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;
.super Landroid/os/AsyncTask;
.source "GeofenceManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/geofencing/GeofenceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LoadGeofencesAndSendMessageTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;",
        "Ljava/lang/Void;",
        "Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/geofencing/GeofenceManager;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/geofencing/GeofenceManager;)V
    .locals 0

    .line 336
    iput-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/geofencing/GeofenceManager;Lcom/shopkick/app/geofencing/GeofenceManager$1;)V
    .locals 0

    .line 336
    invoke-direct {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;-><init>(Lcom/shopkick/app/geofencing/GeofenceManager;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;)Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;
    .locals 5

    .line 340
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    .line 341
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v0, "StoreGeofencesTask should be called with a GeofencingDynamicResponse!"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 344
    aget-object p1, p1, v0

    if-eqz p1, :cond_1

    return-object p1

    .line 348
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 350
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 351
    :try_start_1
    iget-object v2, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {v2}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$000(Lcom/shopkick/app/geofencing/GeofenceManager;)Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "shopkick_geofences.json"

    invoke-virtual {v2, v3}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v2

    .line 352
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 355
    :goto_0
    :try_start_2
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 356
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 359
    :cond_2
    :try_start_3
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 361
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 362
    :try_start_4
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-class v2, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    invoke-virtual {v0, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 359
    :try_start_5
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    throw p1

    :catchall_1
    move-exception p1

    .line 361
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 368
    :catch_0
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v0, "Failed to decode stored geofences."

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    goto :goto_1

    .line 366
    :catch_1
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v0, "Failed to read stored geofences."

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    goto :goto_1

    .line 364
    :catch_2
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v0, "Failed to open stored geofences."

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    :goto_1
    return-object v1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 336
    check-cast p1, [Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->doInBackground([Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;)Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;)V
    .locals 8

    .line 377
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v1, "Geofence/Location Matching process start ... "

    invoke-virtual {v0, v1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    if-eqz p1, :cond_7

    const/4 v0, 0x0

    const/high16 v1, -0x40800000    # -1.0f

    .line 382
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;->nearbyLocationInfoList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;

    .line 383
    iget-object v3, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {v3}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$400(Lcom/shopkick/app/geofencing/GeofenceManager;)Landroid/location/Location;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/shopkick/app/geofencing/GeofenceManager;->userDistanceTo(Landroid/location/Location;Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;)Ljava/lang/Float;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/high16 v4, 0x42c80000    # 100.0f

    .line 389
    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->fencingRadius:Ljava/lang/Integer;

    if-eqz v5, :cond_2

    .line 390
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->fencingRadius:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-float v4, v4

    .line 392
    :cond_2
    iget-object v5, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "checking location:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " distance:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " radius: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 396
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v5

    cmpg-float v4, v5, v4

    if-gtz v4, :cond_0

    const/4 v4, 0x0

    cmpg-float v4, v1, v4

    if-ltz v4, :cond_3

    .line 398
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v4

    cmpl-float v4, v1, v4

    if-lez v4, :cond_0

    .line 399
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v0

    move v1, v0

    move-object v0, v2

    goto :goto_0

    .line 404
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$400(Lcom/shopkick/app/geofencing/GeofenceManager;)Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 405
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lastLocation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {v2}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$400(Lcom/shopkick/app/geofencing/GeofenceManager;)Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {v2}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$400(Lcom/shopkick/app/geofencing/GeofenceManager;)Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    goto :goto_1

    .line 407
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v1, "lastLocation == null"

    invoke-virtual {p1, v1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    :goto_1
    if-eqz v0, :cond_6

    .line 411
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "closestLocationInfo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->latitude:Ljava/lang/Double;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->longitude:Ljava/lang/Double;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 413
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->validateAndSendMessage(Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;)V

    goto :goto_2

    .line 415
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v0, "closest location is null"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    goto :goto_2

    .line 418
    :cond_7
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v0, "fences == null"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 336
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager$LoadGeofencesAndSendMessageTask;->onPostExecute(Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;)V

    return-void
.end method
