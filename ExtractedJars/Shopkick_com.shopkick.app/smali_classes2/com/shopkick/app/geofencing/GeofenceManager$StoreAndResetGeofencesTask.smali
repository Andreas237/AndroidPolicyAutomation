.class Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;
.super Landroid/os/AsyncTask;
.source "GeofenceManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/geofencing/GeofenceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "StoreAndResetGeofencesTask"
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

    .line 259
    iput-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/geofencing/GeofenceManager;Lcom/shopkick/app/geofencing/GeofenceManager$1;)V
    .locals 0

    .line 259
    invoke-direct {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;-><init>(Lcom/shopkick/app/geofencing/GeofenceManager;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;)Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;
    .locals 7

    .line 264
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    .line 265
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v0, "StoreGeofencesTask should be called with exactly one parameter!"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 268
    aget-object p1, p1, v0

    .line 269
    iget-object v2, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    monitor-enter v2

    .line 271
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 272
    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;->nearbyLocationInfoList:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;

    .line 273
    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "("

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->chainId:Ljava/lang/String;

    .line 274
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ") :"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v5, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->latitude:Ljava/lang/Double;

    .line 275
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ","

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/NearbyLocationInfo;->longitude:Ljava/lang/Double;

    .line 276
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "//"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 278
    :cond_1
    iget-object v4, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 279
    iget-object v3, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {v3}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$000(Lcom/shopkick/app/geofencing/GeofenceManager;)Landroid/content/Context;

    move-result-object v3

    const-string/jumbo v4, "shopkick_geofences.json"

    invoke-virtual {v3, v4, v0}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 281
    :try_start_1
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 283
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 285
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-object p1

    :catchall_0
    move-exception p1

    .line 283
    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    throw p1
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    goto :goto_2

    .line 289
    :catch_0
    :try_start_5
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v0, "Failed to write stored geofences."

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    goto :goto_1

    .line 287
    :catch_1
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v0, "Failed to open stored geofences for writing."

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    .line 291
    :goto_1
    monitor-exit v2

    return-object v1

    :goto_2
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 259
    check-cast p1, [Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->doInBackground([Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;)Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;)V
    .locals 3

    if-eqz p1, :cond_3

    .line 299
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;->nearbyLocationInfoList:Ljava/util/List;

    .line 300
    invoke-static {v0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$100(Lcom/shopkick/app/geofencing/GeofenceManager;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$200(Lcom/shopkick/app/geofencing/GeofenceManager;)Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 303
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 304
    iget-object v2, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {v2}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$300(Lcom/shopkick/app/geofencing/GeofenceManager;)Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->removeGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    .line 305
    iget-object v2, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {v2}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$200(Lcom/shopkick/app/geofencing/GeofenceManager;)Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 309
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/sensor/GeoFence;

    .line 310
    iget-object v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {v1}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$200(Lcom/shopkick/app/geofencing/GeofenceManager;)Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 311
    iget-object v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {v1}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$200(Lcom/shopkick/app/geofencing/GeofenceManager;)Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    .line 312
    iget-object v1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    invoke-static {v1}, Lcom/shopkick/app/geofencing/GeofenceManager;->access$300(Lcom/shopkick/app/geofencing/GeofenceManager;)Lcom/shopkick/sdk/sensor/GeoFenceSensor;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/sdk/sensor/GeoFenceSensor;->addGeoFence(Lcom/shopkick/sdk/sensor/GeoFence;)V

    goto :goto_1

    .line 316
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->this$0:Lcom/shopkick/app/geofencing/GeofenceManager;

    const-string v0, "post StoreGeofencesTask, fences == null "

    invoke-virtual {p1, v0}, Lcom/shopkick/app/geofencing/GeofenceManager;->geofenceLog(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 259
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/geofencing/GeofenceManager$StoreAndResetGeofencesTask;->onPostExecute(Lcom/shopkick/app/fetchers/api/skapi/GeofencingDynamicResponse;)V

    return-void
.end method
