.class public Lo/dhm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    .line 205
    const-string v0, "location"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/location/LocationManager;

    .line 206
    if-eqz v1, :cond_0

    const-string v0, "network"

    .line 207
    invoke-virtual {v1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 208
    const/4 v0, 0x1

    return v0

    .line 209
    :cond_0
    if-eqz v1, :cond_1

    const-string v0, "GpsMockProvider"

    .line 210
    invoke-virtual {v1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    const/4 v0, 0x1

    return v0

    .line 214
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 5

    .line 168
    if-nez p0, :cond_0

    .line 169
    const/4 v0, 0x0

    return v0

    .line 172
    :cond_0
    const/4 v4, 0x3

    .line 173
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 174
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "location_mode"

    invoke-static {v0, v1, v4}, Landroid/provider/Settings$Secure;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    goto :goto_0

    .line 178
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "gps"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Secure;->setLocationProviderEnabled(Landroid/content/ContentResolver;Ljava/lang/String;Z)V

    .line 180
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "network"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Secure;->setLocationProviderEnabled(Landroid/content/ContentResolver;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    :goto_0
    goto :goto_1

    .line 183
    :catch_0
    move-exception v4

    .line 184
    const-string v0, "Track_DealGpsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openGPS: No permission or not release version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    :goto_1
    invoke-static {p0}, Lo/dhm;->c(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public static c(Ljava/util/List;)F
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;)F"
        }
    .end annotation

    .line 135
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 136
    const/4 v6, 0x0

    .line 137
    if-nez p0, :cond_0

    .line 139
    return v6

    .line 142
    :cond_0
    new-instance v0, Lo/dhm$5;

    invoke-direct {v0}, Lo/dhm$5;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 154
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v6

    .line 156
    sget-wide v0, Lo/dhp;->b:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 160
    sput-wide v4, Lo/dhp;->b:J

    .line 163
    :cond_1
    return v6
.end method

.method public static c(Lo/dhf;)I
    .locals 4

    .line 81
    const/4 v1, 0x2

    .line 83
    if-nez p0, :cond_0

    .line 84
    const/4 v0, 0x0

    return v0

    .line 87
    :cond_0
    invoke-virtual {p0}, Lo/dhf;->e()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/dhm;->c(Ljava/util/List;)F

    move-result v2

    .line 88
    invoke-virtual {p0}, Lo/dhf;->c()I

    move-result v3

    .line 94
    const/high16 v0, 0x41f00000    # 30.0f

    cmpl-float v0, v2, v0

    if-ltz v0, :cond_1

    const/16 v0, 0xb

    if-lt v3, v0, :cond_1

    .line 95
    const/4 v1, 0x6

    goto :goto_0

    .line 96
    :cond_1
    const/high16 v0, 0x41a00000    # 20.0f

    cmpl-float v0, v2, v0

    if-lez v0, :cond_2

    const/16 v0, 0x9

    if-lt v3, v0, :cond_2

    .line 97
    const/4 v1, 0x5

    goto :goto_0

    .line 98
    :cond_2
    const/high16 v0, 0x41a00000    # 20.0f

    cmpl-float v0, v2, v0

    if-lez v0, :cond_3

    const/4 v0, 0x4

    if-lt v3, v0, :cond_3

    .line 99
    const/4 v1, 0x4

    .line 102
    :cond_3
    :goto_0
    return v1
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 5

    .line 220
    const-string v0, "location"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/location/LocationManager;

    .line 221
    if-eqz v4, :cond_1

    const-string v0, "gps"

    .line 222
    invoke-virtual {v4, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 223
    const-string v0, "network"

    invoke-virtual {v4, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    const-string v0, "Track_DealGpsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isGpsEnabled current is gps & network provider support."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 226
    :cond_0
    const-string v0, "Track_DealGpsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isGpsEnabled current is only gps provider support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 229
    :cond_1
    if-eqz v4, :cond_2

    const-string v0, "GpsMockProvider"

    .line 230
    invoke-virtual {v4, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 231
    const-string v0, "Track_DealGpsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " Mock GPS provider running!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    const-string v0, " Mock GPS provider running!!!"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 233
    const/4 v0, 0x1

    return v0

    .line 235
    :cond_2
    const-string v0, "Track_DealGpsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isGpsEnabled gps disabled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/location/GpsStatus;)Lo/dhf;
    .locals 9

    .line 33
    const/4 v4, 0x0

    .line 34
    if-nez p0, :cond_0

    .line 36
    const-string v0, "Track_DealGpsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGpsSnr gpsStatus is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    return-object v4

    .line 40
    :cond_0
    invoke-virtual {p0}, Landroid/location/GpsStatus;->getMaxSatellites()I

    move-result v5

    .line 41
    const/4 v6, 0x0

    .line 42
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 44
    invoke-virtual {p0}, Landroid/location/GpsStatus;->getSatellites()Ljava/lang/Iterable;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 46
    invoke-virtual {p0}, Landroid/location/GpsStatus;->getSatellites()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 48
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    if-gt v6, v5, :cond_1

    .line 50
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/GpsSatellite;

    invoke-virtual {v0}, Landroid/location/GpsSatellite;->getSnr()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 53
    :cond_1
    if-eqz v6, :cond_2

    .line 55
    new-instance v4, Lo/dhf;

    invoke-direct {v4, v7, v6}, Lo/dhf;-><init>(Ljava/util/List;I)V

    .line 58
    :cond_2
    return-object v4
.end method

.method public static e(Landroid/content/Context;)V
    .locals 5

    .line 241
    if-nez p0, :cond_0

    .line 242
    return-void

    .line 245
    :cond_0
    const/4 v4, 0x3

    .line 246
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 247
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "location_mode"

    invoke-static {v0, v1, v4}, Landroid/provider/Settings$Secure;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    goto :goto_0

    .line 251
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "network"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Secure;->setLocationProviderEnabled(Landroid/content/ContentResolver;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 256
    :goto_0
    goto :goto_1

    .line 254
    :catch_0
    move-exception v4

    .line 255
    const-string v0, "Track_DealGpsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openNetworkLocation: No permission or not release version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    :goto_1
    return-void
.end method
