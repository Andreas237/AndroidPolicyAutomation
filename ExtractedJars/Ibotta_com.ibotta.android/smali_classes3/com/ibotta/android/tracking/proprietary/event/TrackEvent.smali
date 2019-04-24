.class public Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;
.super Ljava/lang/Object;
.source "TrackEvent.java"


# instance fields
.field private params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Lcom/ibotta/android/tracking/proprietary/event/TrackType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/proprietary/event/TrackType;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->params:Ljava/util/Map;

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->type:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    return-void
.end method

.method private addHttpFormElement(ILjava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 73
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->makeHttpFormKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 75
    instance-of p2, p3, Lcom/ibotta/android/tracking/proprietary/event/enums/TrackContext;

    if-eqz p2, :cond_0

    .line 76
    check-cast p3, Lcom/ibotta/android/tracking/proprietary/event/enums/TrackContext;

    invoke-virtual {p3}, Lcom/ibotta/android/tracking/proprietary/event/enums/TrackContext;->getApiName()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    .line 77
    :cond_0
    instance-of p2, p3, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    if-eqz p2, :cond_1

    .line 78
    check-cast p3, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    invoke-virtual {p3}, Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;->getApiName()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    .line 79
    :cond_1
    instance-of p2, p3, Ljava/util/Date;

    if-eqz p2, :cond_2

    .line 80
    new-instance p2, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {p2, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v0, "UTC"

    .line 81
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 82
    check-cast p3, Ljava/util/Date;

    invoke-virtual {p2, p3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p3

    .line 85
    :cond_2
    :goto_0
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private addHttpFormElementSubLists(ILjava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 54
    check-cast p3, Ljava/util/List;

    .line 55
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->makeHttpFormKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 58
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 59
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 60
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "%1$s[%2$d][%3$s]"

    const/4 v4, 0x3

    .line 64
    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, p3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    const/4 v5, 0x2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 65
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private makeHttpFormKey(ILjava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "%1$s[%2$d][%3$s]"

    const/4 v1, 0x3

    .line 89
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->type:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    invoke-virtual {v2}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 p1, 0x2

    aput-object p2, v1, p1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private put(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    if-eqz p2, :cond_2

    .line 300
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 301
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->params:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 304
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->params:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 307
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->params:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 310
    :cond_2
    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->params:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method


# virtual methods
.method public getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getType()Lcom/ibotta/android/tracking/proprietary/event/TrackType;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->type:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    return-object v0
.end method

.method public setAmount(F)V
    .locals 1

    const-string v0, "amount"

    .line 275
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setAppNames(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 209
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "app_names"

    .line 210
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public setBonusId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "bonus_id"

    .line 133
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setCategoryId(I)V
    .locals 1

    const-string v0, "category_id"

    .line 231
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setCategoryType(Ljava/lang/String;)V
    .locals 1

    const-string v0, "category_type"

    .line 235
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setClickId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "click_id"

    .line 129
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setClickType(Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V
    .locals 1

    const-string v0, "click_type"

    .line 125
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setClicked(Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "clicked"

    .line 189
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setContext(Lcom/ibotta/android/tracking/proprietary/event/enums/TrackContext;)V
    .locals 1

    const-string v0, "context"

    .line 93
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setContextDetail(Ljava/lang/String;)V
    .locals 1

    const-string v0, "context_detail"

    .line 287
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setCounter(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "counter"

    .line 105
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setDealId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deal_id"

    .line 169
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setDuration(Ljava/lang/Float;)V
    .locals 1

    const-string v0, "duration"

    .line 149
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setEngaged(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "engaged"

    .line 153
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setEngagementId(Ljava/lang/Long;)V
    .locals 1

    const-string v0, "engagement_id"

    .line 243
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setEntryScreen(Ljava/lang/String;)V
    .locals 1

    const-string v0, "entry_screen"

    .line 263
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setEventAt(Ljava/util/Date;)V
    .locals 1

    const-string v0, "event_at"

    .line 101
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setExitScreen(Ljava/lang/String;)V
    .locals 1

    const-string v0, "exit_screen"

    .line 267
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setGiftCardId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "buyable_gift_card_id"

    .line 247
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setListIndex(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "list_index"

    .line 185
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setLocationPermissionStatus(Ljava/lang/String;)V
    .locals 1

    const-string v0, "location_permission_status"

    .line 291
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setMessageData(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message_data"

    .line 283
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setModuleId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "module_id"

    .line 173
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setModuleIndex(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "module_index"

    .line 181
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setModuleName(Ljava/lang/String;)V
    .locals 1

    const-string v0, "module_name"

    .line 177
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setNotificationId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "notification_id"

    .line 271
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setNotificationText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "notification_text"

    .line 255
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setNotificationType(Ljava/lang/String;)V
    .locals 1

    const-string v0, "notification_type"

    .line 259
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setOfferCategoryId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "offer_category_id"

    .line 141
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setOfferId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "offer_id"

    .line 137
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setOfferRewardId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "offer_reward_id"

    .line 145
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setOfferSegmentId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "offer_segment_id"

    .line 215
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "product_id"

    .line 165
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setPromoId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "promo_id"

    .line 157
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setPushPermissionStatus(Ljava/lang/String;)V
    .locals 1

    const-string v0, "push_permission_status"

    .line 295
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setQuestName(Ljava/lang/String;)V
    .locals 1

    const-string v0, "quest_name"

    .line 219
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setQuestState(Ljava/lang/String;)V
    .locals 1

    const-string v0, "quest_state"

    .line 223
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setQuestStep(I)V
    .locals 1

    const-string v0, "quest_step"

    .line 227
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setReferralCode(Ljava/lang/String;)V
    .locals 1

    const-string v0, "referral_code"

    .line 205
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setReferrer(Ljava/lang/String;)V
    .locals 1

    const-string v0, "referrer"

    .line 97
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setRetailerCategoryId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "retailer_category_id"

    .line 113
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "retailer_id"

    .line 109
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setSearchType(Ljava/lang/String;)V
    .locals 1

    const-string v0, "search_type"

    .line 239
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 1

    const-string v0, "status"

    .line 279
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setTerm(Ljava/lang/String;)V
    .locals 1

    const-string v0, "term"

    .line 117
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setTest(Ljava/lang/String;)V
    .locals 1

    const-string v0, "test"

    .line 193
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setThirdpartyId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "thirdparty_id"

    .line 201
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setTileId(Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "tile_id"

    .line 161
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setTransactionId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "transaction_id"

    .line 251
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setUpc(Ljava/lang/String;)V
    .locals 1

    const-string v0, "upc"

    .line 121
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setVariant(Ljava/lang/String;)V
    .locals 1

    const-string v0, "variant"

    .line 197
    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->put(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public toStringParts(I)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 34
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 36
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->params:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 37
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 38
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    const-string v4, "app_names"

    .line 40
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 43
    invoke-direct {p0, p1, v3, v2, v0}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->addHttpFormElementSubLists(ILjava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V

    goto :goto_0

    .line 45
    :cond_0
    invoke-direct {p0, p1, v3, v2, v0}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->addHttpFormElement(ILjava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public validate()Z
    .locals 1

    .line 315
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->type:Lcom/ibotta/android/tracking/proprietary/event/TrackType;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/proprietary/event/TrackType;->validate(Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;)Z

    move-result v0

    return v0
.end method
