.class public Lcom/ibotta/api/model/store/Store;
.super Ljava/lang/Object;
.source "Store.java"


# instance fields
.field private events:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/store/Event;",
            ">;"
        }
    .end annotation
.end field

.field private id:I

.field private latitude:F
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lat"
    .end annotation
.end field

.field private longitude:F
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "long"
    .end annotation
.end field

.field private retailerId:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/store/Store;->events:Ljava/util/Map;

    return-void
.end method

.method public static getEvent(Lcom/ibotta/api/model/store/Store;Lcom/ibotta/api/model/store/Retailer;Lcom/ibotta/api/model/store/GeofenceEventType;)Lcom/ibotta/api/model/store/Event;
    .locals 1

    if-eqz p0, :cond_0

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    if-eqz p1, :cond_1

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 71
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    :cond_1
    return-object p0
.end method

.method public static getMessage(Lcom/ibotta/api/model/store/Store;Lcom/ibotta/api/model/store/Retailer;Lcom/ibotta/api/model/store/GeofenceEventType;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_0

    .line 131
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    if-eqz p0, :cond_0

    .line 134
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Event;->getMessage()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    if-eqz p1, :cond_1

    .line 140
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 141
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 142
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    .line 143
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Event;->getMessage()Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static getPriority(Lcom/ibotta/api/model/store/Store;Lcom/ibotta/api/model/store/Retailer;)Ljava/lang/Integer;
    .locals 2

    if-eqz p0, :cond_1

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/store/Event;

    .line 81
    invoke-virtual {v0}, Lcom/ibotta/api/model/store/Event;->getPriority()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 82
    invoke-virtual {v0}, Lcom/ibotta/api/model/store/Event;->getPriority()Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_3

    if-eqz p1, :cond_3

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 91
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 92
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/store/Event;

    .line 93
    invoke-virtual {v0}, Lcom/ibotta/api/model/store/Event;->getPriority()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 94
    invoke-virtual {v0}, Lcom/ibotta/api/model/store/Event;->getPriority()Ljava/lang/Integer;

    move-result-object p0

    :cond_3
    return-object p0
.end method

.method public static getRadius(Lcom/ibotta/api/model/store/Store;Lcom/ibotta/api/model/store/Retailer;)Ljava/lang/Float;
    .locals 2

    if-eqz p0, :cond_1

    .line 105
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 106
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/store/Event;

    .line 107
    invoke-virtual {v0}, Lcom/ibotta/api/model/store/Event;->getRadius()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 108
    invoke-virtual {v0}, Lcom/ibotta/api/model/store/Event;->getRadius()Ljava/lang/Float;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_3

    if-eqz p1, :cond_3

    .line 116
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 117
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 118
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/store/Event;

    .line 119
    invoke-virtual {v0}, Lcom/ibotta/api/model/store/Event;->getRadius()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 120
    invoke-virtual {v0}, Lcom/ibotta/api/model/store/Event;->getRadius()Ljava/lang/Float;

    move-result-object p0

    :cond_3
    return-object p0
.end method

.method public static getReporting(Lcom/ibotta/api/model/store/Store;Lcom/ibotta/api/model/store/Retailer;Lcom/ibotta/api/model/store/GeofenceEventType;)Ljava/lang/Boolean;
    .locals 1

    if-eqz p0, :cond_0

    .line 192
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 193
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    if-eqz p0, :cond_0

    .line 195
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Event;->getReporting()Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    if-eqz p1, :cond_1

    .line 201
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 202
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 203
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    .line 204
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Event;->getReporting()Ljava/lang/Boolean;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static getRoute(Lcom/ibotta/api/model/store/Store;Lcom/ibotta/api/model/store/Retailer;Lcom/ibotta/api/model/store/GeofenceEventType;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_0

    .line 212
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 213
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    if-eqz p0, :cond_0

    .line 215
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Event;->getRoute()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    if-eqz p1, :cond_1

    .line 221
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 222
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 223
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    .line 224
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Event;->getRoute()Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static getSendThroughAppboy(Lcom/ibotta/api/model/store/Store;Lcom/ibotta/api/model/store/Retailer;Lcom/ibotta/api/model/store/GeofenceEventType;)Ljava/lang/Boolean;
    .locals 1

    if-eqz p0, :cond_0

    .line 171
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    if-eqz p0, :cond_0

    .line 174
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Event;->getSendThroughAppboy()Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    if-eqz p1, :cond_1

    .line 180
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 181
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 182
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    .line 183
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Event;->getSendThroughAppboy()Ljava/lang/Boolean;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static getServerMessage(Lcom/ibotta/api/model/store/Store;Lcom/ibotta/api/model/store/Retailer;Lcom/ibotta/api/model/store/GeofenceEventType;)Ljava/lang/Boolean;
    .locals 1

    if-eqz p0, :cond_0

    .line 151
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 152
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Store;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    if-eqz p0, :cond_0

    .line 154
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Event;->getServerMessage()Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    if-eqz p1, :cond_1

    .line 160
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 161
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 162
    invoke-virtual {p1}, Lcom/ibotta/api/model/store/Retailer;->getEvents()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {p2}, Lcom/ibotta/api/model/store/GeofenceEventType;->toApiName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/Event;

    .line 163
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/Event;->getServerMessage()Ljava/lang/Boolean;

    move-result-object p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public getEvents()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/store/Event;",
            ">;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/ibotta/api/model/store/Store;->events:Ljava/util/Map;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/ibotta/api/model/store/Store;->id:I

    return v0
.end method

.method public getLatitude()F
    .locals 1

    .line 38
    iget v0, p0, Lcom/ibotta/api/model/store/Store;->latitude:F

    return v0
.end method

.method public getLongitude()F
    .locals 1

    .line 46
    iget v0, p0, Lcom/ibotta/api/model/store/Store;->longitude:F

    return v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/ibotta/api/model/store/Store;->retailerId:I

    return v0
.end method

.method public setEvents(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/store/Event;",
            ">;)V"
        }
    .end annotation

    .line 58
    iput-object p1, p0, Lcom/ibotta/api/model/store/Store;->events:Ljava/util/Map;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 26
    iput p1, p0, Lcom/ibotta/api/model/store/Store;->id:I

    return-void
.end method

.method public setLatitude(F)V
    .locals 0

    .line 42
    iput p1, p0, Lcom/ibotta/api/model/store/Store;->latitude:F

    return-void
.end method

.method public setLongitude(F)V
    .locals 0

    .line 50
    iput p1, p0, Lcom/ibotta/api/model/store/Store;->longitude:F

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 34
    iput p1, p0, Lcom/ibotta/api/model/store/Store;->retailerId:I

    return-void
.end method
