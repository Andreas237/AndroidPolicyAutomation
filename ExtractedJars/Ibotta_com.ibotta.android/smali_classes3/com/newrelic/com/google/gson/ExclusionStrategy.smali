.class public interface abstract Lcom/newrelic/com/google/gson/ExclusionStrategy;
.super Ljava/lang/Object;
.source "ExclusionStrategy.java"


# virtual methods
.method public abstract shouldSkipClass(Ljava/lang/Class;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation
.end method

.method public abstract shouldSkipField(Lcom/newrelic/com/google/gson/FieldAttributes;)Z
.end method
