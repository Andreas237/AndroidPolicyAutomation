.class public Lcom/ibotta/api/UserLocation;
.super Ljava/lang/Object;
.source "UserLocation.java"


# static fields
.field private static final FORMAT_HEADER:Ljava/lang/String; = "%1$s,%2$s,%3$s,%4$s,%5$s"


# instance fields
.field private accuracy:Ljava/lang/Float;

.field private geohash:Ljava/lang/String;

.field private latitude:Ljava/lang/Float;

.field private locationOn:Z

.field private lock:Ljava/util/concurrent/locks/Lock;

.field private longitude:Ljava/lang/Float;

.field private zipCode:Ljava/lang/String;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    return-void
.end method


# virtual methods
.method public getHeaderValue()Ljava/lang/String;
    .locals 9

    .line 83
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 87
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->latitude:Ljava/lang/Float;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->longitude:Ljava/lang/Float;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->zipCode:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    .line 91
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->geohash:Ljava/lang/String;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const/4 v3, 0x0

    if-eqz v0, :cond_7

    const-string v0, ""

    const-string v3, ""

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    .line 103
    iget-object v7, p0, Lcom/ibotta/api/UserLocation;->latitude:Ljava/lang/Float;

    if-eqz v7, :cond_3

    iget-object v7, p0, Lcom/ibotta/api/UserLocation;->longitude:Ljava/lang/Float;

    if-eqz v7, :cond_3

    .line 104
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->latitude:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object v0

    .line 105
    iget-object v3, p0, Lcom/ibotta/api/UserLocation;->longitude:Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object v3

    .line 107
    :cond_3
    iget-object v7, p0, Lcom/ibotta/api/UserLocation;->zipCode:Ljava/lang/String;

    if-eqz v7, :cond_4

    .line 108
    iget-object v4, p0, Lcom/ibotta/api/UserLocation;->zipCode:Ljava/lang/String;

    .line 110
    :cond_4
    iget-object v7, p0, Lcom/ibotta/api/UserLocation;->geohash:Ljava/lang/String;

    if-eqz v7, :cond_5

    .line 111
    iget-object v5, p0, Lcom/ibotta/api/UserLocation;->geohash:Ljava/lang/String;

    .line 113
    :cond_5
    iget-object v7, p0, Lcom/ibotta/api/UserLocation;->accuracy:Ljava/lang/Float;

    if-eqz v7, :cond_6

    .line 114
    iget-object v6, p0, Lcom/ibotta/api/UserLocation;->accuracy:Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_6
    const-string v7, "%1$s,%2$s,%3$s,%4$s,%5$s"

    const/4 v8, 0x5

    .line 117
    new-array v8, v8, [Ljava/lang/Object;

    aput-object v0, v8, v1

    aput-object v3, v8, v2

    const/4 v0, 0x2

    aput-object v4, v8, v0

    const/4 v3, 0x3

    aput-object v5, v8, v3

    const/4 v3, 0x4

    aput-object v6, v8, v3

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 122
    sget-object v4, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v5, "Generated location header value: locationOn=%1$b, header=%2$s"

    new-array v0, v0, [Ljava/lang/Object;

    iget-boolean v6, p0, Lcom/ibotta/api/UserLocation;->locationOn:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v0, v1

    aput-object v3, v0, v2

    invoke-interface {v4, v5, v0}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v3

    :cond_7
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v3

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 127
    throw v0
.end method

.method public hasLatLong()Z
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 27
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->latitude:Ljava/lang/Float;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->longitude:Ljava/lang/Float;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    iget-object v1, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 30
    throw v0
.end method

.method public update(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 55
    :try_start_0
    iput-object p1, p0, Lcom/ibotta/api/UserLocation;->latitude:Ljava/lang/Float;

    .line 56
    iput-object p2, p0, Lcom/ibotta/api/UserLocation;->longitude:Ljava/lang/Float;

    goto :goto_0

    .line 58
    :cond_0
    iput-object v0, p0, Lcom/ibotta/api/UserLocation;->latitude:Ljava/lang/Float;

    .line 59
    iput-object v0, p0, Lcom/ibotta/api/UserLocation;->longitude:Ljava/lang/Float;

    :goto_0
    if-eqz p3, :cond_1

    .line 62
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    .line 63
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/UserLocation;->zipCode:Ljava/lang/String;

    goto :goto_1

    .line 65
    :cond_1
    iput-object v0, p0, Lcom/ibotta/api/UserLocation;->zipCode:Ljava/lang/String;

    :goto_1
    if-eqz p4, :cond_2

    .line 68
    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_2

    .line 69
    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/UserLocation;->geohash:Ljava/lang/String;

    goto :goto_2

    .line 71
    :cond_2
    iput-object v0, p0, Lcom/ibotta/api/UserLocation;->geohash:Ljava/lang/String;

    .line 74
    :goto_2
    iput-object p5, p0, Lcom/ibotta/api/UserLocation;->accuracy:Ljava/lang/Float;

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/api/UserLocation;->getHeaderValue()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    iget-object p2, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 79
    throw p1
.end method

.method public update(Z)Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 36
    :try_start_0
    iput-boolean p1, p0, Lcom/ibotta/api/UserLocation;->locationOn:Z

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/api/UserLocation;->getHeaderValue()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/api/UserLocation;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 40
    throw p1
.end method

.method public updateLocation(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Ljava/lang/String;
    .locals 6

    .line 44
    iget-object v3, p0, Lcom/ibotta/api/UserLocation;->zipCode:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/api/UserLocation;->geohash:Ljava/lang/String;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/api/UserLocation;->update(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public updateZipCodeAndGeohash(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 48
    iget-object v1, p0, Lcom/ibotta/api/UserLocation;->latitude:Ljava/lang/Float;

    iget-object v2, p0, Lcom/ibotta/api/UserLocation;->longitude:Ljava/lang/Float;

    iget-object v5, p0, Lcom/ibotta/api/UserLocation;->accuracy:Ljava/lang/Float;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/api/UserLocation;->update(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
