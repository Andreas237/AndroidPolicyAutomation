.class interface abstract Lcom/shopkick/sdk/zone/DefaultZoneDetector;
.super Ljava/lang/Object;
.source "DefaultZoneDetector.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/zone/DefaultZoneDetector$Technology;
    }
.end annotation


# virtual methods
.method public abstract close()V
.end method

.method public abstract registerZone(Lcom/shopkick/sdk/zone/Zone;I)V
.end method

.method public abstract registerZones(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/AbstractMap$SimpleEntry<",
            "Lcom/shopkick/sdk/zone/Zone;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract setRelevantZones(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setZoneEventsListener(Lcom/shopkick/sdk/zone/ZoneEventsListener;)V
.end method

.method public abstract unregisterZone(Lcom/shopkick/sdk/zone/Zone;)V
.end method

.method public abstract unregisterZone(Lcom/shopkick/sdk/zone/Zone;I)V
.end method
