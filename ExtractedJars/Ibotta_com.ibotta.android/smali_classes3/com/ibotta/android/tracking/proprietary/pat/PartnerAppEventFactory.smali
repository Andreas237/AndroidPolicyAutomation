.class public interface abstract Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;
.super Ljava/lang/Object;
.source "PartnerAppEventFactory.java"


# virtual methods
.method public abstract createEvent(Ljava/util/List;)Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;
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
.end method
