.class public interface abstract Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;
.super Ljava/lang/Object;
.source "EventBodyFactory.java"


# virtual methods
.method public abstract createEventBody(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
.end method

.method public abstract createEventBody(Ljava/lang/String;JZLjava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/ibotta/tracking/generated/model/Body;"
        }
    .end annotation
.end method

.method public abstract createEventBody(Ljava/lang/String;Ljava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/ibotta/tracking/generated/model/Body;"
        }
    .end annotation
.end method
