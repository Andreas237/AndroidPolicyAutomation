.class public Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;
.super Ljava/lang/Object;
.source "StoresManyPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/store/StoresManyPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private activity:Ljava/lang/String;

.field private eventType:Lcom/ibotta/api/model/store/GeofenceEventType;

.field private latitude:Ljava/lang/Float;

.field private longitude:Ljava/lang/Float;

.field private storeId:I

.field private timestamp:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActivity()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->activity:Ljava/lang/String;

    return-object v0
.end method

.method public getEventType()Lcom/ibotta/api/model/store/GeofenceEventType;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->eventType:Lcom/ibotta/api/model/store/GeofenceEventType;

    return-object v0
.end method

.method public getLatitude()Ljava/lang/Float;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->latitude:Ljava/lang/Float;

    return-object v0
.end method

.method public getLongitude()Ljava/lang/Float;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->longitude:Ljava/lang/Float;

    return-object v0
.end method

.method public getStoreId()I
    .locals 1

    .line 94
    iget v0, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->storeId:I

    return v0
.end method

.method public getTimestamp()Ljava/util/Date;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->timestamp:Ljava/util/Date;

    return-object v0
.end method

.method public setActivity(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->activity:Ljava/lang/String;

    return-void
.end method

.method public setEventType(Lcom/ibotta/api/model/store/GeofenceEventType;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->eventType:Lcom/ibotta/api/model/store/GeofenceEventType;

    return-void
.end method

.method public setLatitude(Ljava/lang/Float;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->latitude:Ljava/lang/Float;

    return-void
.end method

.method public setLongitude(Ljava/lang/Float;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->longitude:Ljava/lang/Float;

    return-void
.end method

.method public setStoreId(I)V
    .locals 0

    .line 98
    iput p1, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->storeId:I

    return-void
.end method

.method public setTimestamp(Ljava/util/Date;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/ibotta/api/call/store/StoresManyPostCall$CallParams;->timestamp:Ljava/util/Date;

    return-void
.end method
