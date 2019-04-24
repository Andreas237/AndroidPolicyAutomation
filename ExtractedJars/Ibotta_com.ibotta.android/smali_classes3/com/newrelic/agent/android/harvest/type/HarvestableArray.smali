.class public abstract Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.super Lcom/newrelic/agent/android/harvest/type/BaseHarvestable;
.source "HarvestableArray.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    sget-object v0, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;->ARRAY:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable;-><init>(Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;)V

    return-void
.end method


# virtual methods
.method public abstract asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
.end method
