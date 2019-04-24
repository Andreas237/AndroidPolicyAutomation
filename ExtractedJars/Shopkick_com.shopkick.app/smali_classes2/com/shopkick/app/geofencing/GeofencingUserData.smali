.class public Lcom/shopkick/app/geofencing/GeofencingUserData;
.super Ljava/lang/Object;
.source "GeofencingUserData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/geofencing/GeofencingUserData$DynamicUpdateInfo;
    }
.end annotation


# static fields
.field private static final GEOFENCING_DYNAMIC_UPDATE_LAST_LATITUDE:Ljava/lang/String; = "geofencing.dynamic.lastlat"

.field private static final GEOFENCING_DYNAMIC_UPDATE_LAST_LONGITUDE:Ljava/lang/String; = "geofencing.dynamic.lastlng"

.field private static final GEOFENCING_DYNAMIC_UPDATE_LAST_TIME:Ljava/lang/String; = "geofencing.dynamic.lasttime"

.field private static final GEOFENCING_LAST_BACKGROUNDED:Ljava/lang/String; = "geofencing.lastbackgrounded"

.field private static final GEOFENCING_LAST_CLEARED:Ljava/lang/String; = "geofencing.lastcleared"

.field private static final GEOFENCING_LAST_MESSAGED:Ljava/lang/String; = "geofencing.lastmessaged"

.field private static final GEOFENCING_LAST_NOTIFICATION_FORMATTED_DATE:Ljava/lang/String; = "geofencing.last_notification_formated_date"

.field private static final GEOFENCING_NOTIFICATION_COUNT:Ljava/lang/String; = "geofencing.notification_count"

.field private static final GEOFENCING_PNS_SENT:Ljava/lang/String; = "geofencing.pnssent"

.field private static final GEOFENCING_STATE_IDS_NOTIFIED:Ljava/lang/String; = "geofencing.state_ids_notified"

.field private static final GEOFENCING_STORES_MESSAGED:Ljava/lang/String; = "geofencing.storelist"

.field private static final PREFERENES_NAME:Ljava/lang/String; = "com.shopkick.geofencing.preferences"


# instance fields
.field private sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "com.shopkick.geofencing.preferences"

    const/4 v1, 0x0

    .line 43
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public clearLastDynamicGeofencesUpdateInfo()V
    .locals 2

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "geofencing.dynamic.lasttime"

    .line 182
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "geofencing.dynamic.lastlat"

    .line 183
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "geofencing.dynamic.lastlng"

    .line 184
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 185
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public getGeofencingStateIdsNotified()Ljava/util/HashSet;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "geofencing.state_ids_notified"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-ne v0, v1, :cond_0

    .line 95
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0

    :cond_0
    const-string v1, ","

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 98
    new-instance v1, Ljava/util/HashSet;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v1
.end method

.method public getLastBackgroundedTimestamp()J
    .locals 4

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "geofencing.lastbackgrounded"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getLastClearedTimestamp()J
    .locals 4

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "geofencing.lastcleared"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getLastDynamicGeofencesUpdateInfo()Lcom/shopkick/app/geofencing/GeofencingUserData$DynamicUpdateInfo;
    .locals 6

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "geofencing.dynamic.lasttime"

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    .line 159
    iget-object v2, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v3, "geofencing.dynamic.lastlat"

    const v4, -0x800001

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v2

    .line 160
    iget-object v3, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v5, "geofencing.dynamic.lastlng"

    invoke-interface {v3, v5, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v3

    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-ltz v4, :cond_0

    const/high16 v4, -0x3d4c0000    # -90.0f

    cmpl-float v4, v2, v4

    if-ltz v4, :cond_0

    const/high16 v4, -0x3ccc0000    # -180.0f

    cmpl-float v4, v3, v4

    if-ltz v4, :cond_0

    float-to-double v4, v2

    float-to-double v2, v3

    .line 162
    invoke-static {v4, v5, v2, v3}, Lcom/shopkick/app/location/LocationNotifier;->locationFromCoordinates(DD)Landroid/location/Location;

    move-result-object v2

    .line 163
    new-instance v3, Lcom/shopkick/app/geofencing/GeofencingUserData$DynamicUpdateInfo;

    invoke-direct {v3, v0, v1, v2}, Lcom/shopkick/app/geofencing/GeofencingUserData$DynamicUpdateInfo;-><init>(JLandroid/location/Location;)V

    return-object v3

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getLastNotificationFormattedDate()Ljava/lang/String;
    .locals 3

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "geofencing.last_notification_formated_date"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLastSentTimestamp()J
    .locals 4

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "geofencing.lastmessaged"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getNotificationCount()I
    .locals 3

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "geofencing.notification_count"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getPNSCount()I
    .locals 3

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "geofencing.pnssent"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getStorelist()[Ljava/lang/String;
    .locals 3

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "geofencing.storelist"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v1, ","

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public putStorelist(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 59
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 65
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "geofencing.storelist"

    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 67
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setGeofencingStateIdsNotified(Ljava/util/HashSet;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 108
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v1, "geofencing.state_ids_notified"

    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 110
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setLastBackgroundedTimestamp(J)V
    .locals 2

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "geofencing.lastbackgrounded"

    .line 153
    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 154
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setLastClearedTimestamp(J)V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "geofencing.lastcleared"

    .line 142
    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 143
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setLastDynamicGeofencesUpdateInfo(Lcom/shopkick/app/geofencing/GeofencingUserData$DynamicUpdateInfo;)V
    .locals 4

    if-eqz p1, :cond_0

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "geofencing.dynamic.lasttime"

    .line 171
    iget-wide v2, p1, Lcom/shopkick/app/geofencing/GeofencingUserData$DynamicUpdateInfo;->requestTime:J

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const-string v1, "geofencing.dynamic.lastlat"

    .line 172
    iget-object v2, p1, Lcom/shopkick/app/geofencing/GeofencingUserData$DynamicUpdateInfo;->requestLocation:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    const-string v1, "geofencing.dynamic.lastlng"

    .line 173
    iget-object p1, p1, Lcom/shopkick/app/geofencing/GeofencingUserData$DynamicUpdateInfo;->requestLocation:Landroid/location/Location;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    double-to-float p1, v2

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 174
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 176
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/geofencing/GeofencingUserData;->clearLastDynamicGeofencesUpdateInfo()V

    :goto_0
    return-void
.end method

.method public setLastNotificationFormattedDate(Ljava/lang/String;)V
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "geofencing.last_notification_formated_date"

    .line 77
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 78
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setLastSentTimestamp(J)V
    .locals 2

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "geofencing.lastmessaged"

    .line 131
    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 132
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setNotificationCount(I)V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "geofencing.notification_count"

    .line 88
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 89
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setPNSCount(I)V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/geofencing/GeofencingUserData;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "geofencing.pnssent"

    .line 120
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 121
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
