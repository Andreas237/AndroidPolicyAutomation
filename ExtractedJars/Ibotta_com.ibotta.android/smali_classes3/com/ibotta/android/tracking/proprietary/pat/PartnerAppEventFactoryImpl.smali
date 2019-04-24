.class public Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactoryImpl;
.super Ljava/lang/Object;
.source "PartnerAppEventFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;


# instance fields
.field private final currentTimeSupplier:Lcom/ibotta/android/abstractions/CurrentTimeSupplier;

.field private final ibottaJson:Lcom/ibotta/android/json/IbottaJson;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/json/IbottaJson;Lcom/ibotta/android/abstractions/CurrentTimeSupplier;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactoryImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactoryImpl;->currentTimeSupplier:Lcom/ibotta/android/abstractions/CurrentTimeSupplier;

    return-void
.end method


# virtual methods
.method public createEvent(Ljava/util/List;)Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactoryImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    invoke-interface {v0, p1}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 34
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;-><init>()V

    .line 35
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->ACTIVE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 36
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;->setAppNames(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 37
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;->setCounter(I)V

    .line 38
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactoryImpl;->currentTimeSupplier:Lcom/ibotta/android/abstractions/CurrentTimeSupplier;

    invoke-interface {p1}, Lcom/ibotta/android/abstractions/CurrentTimeSupplier;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;->setEventAt(J)V

    return-object v0
.end method
