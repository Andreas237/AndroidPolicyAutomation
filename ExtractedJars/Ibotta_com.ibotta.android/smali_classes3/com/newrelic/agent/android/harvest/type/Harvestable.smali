.class public interface abstract Lcom/newrelic/agent/android/harvest/type/Harvestable;
.super Ljava/lang/Object;
.source "Harvestable.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;
    }
.end annotation


# virtual methods
.method public abstract asJson()Lcom/newrelic/com/google/gson/JsonElement;
.end method

.method public abstract asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
.end method

.method public abstract asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;
.end method

.method public abstract asJsonPrimitive()Lcom/newrelic/com/google/gson/JsonPrimitive;
.end method

.method public abstract getType()Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;
.end method

.method public abstract toJsonString()Ljava/lang/String;
.end method
