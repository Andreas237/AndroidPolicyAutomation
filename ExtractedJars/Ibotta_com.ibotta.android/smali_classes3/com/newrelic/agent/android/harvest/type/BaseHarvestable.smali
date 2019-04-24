.class public Lcom/newrelic/agent/android/harvest/type/BaseHarvestable;
.super Ljava/lang/Object;
.source "BaseHarvestable.java"

# interfaces
.implements Lcom/newrelic/agent/android/harvest/type/Harvestable;


# static fields
.field protected static final GSON_STRING_MAP_TYPE:Ljava/lang/reflect/Type;


# instance fields
.field private final type:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable$1;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable$1;-><init>()V

    .line 21
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable;->GSON_STRING_MAP_TYPE:Ljava/lang/reflect/Type;

    return-void
.end method

.method public constructor <init>(Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable;->type:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    return-void
.end method


# virtual methods
.method public asJson()Lcom/newrelic/com/google/gson/JsonElement;
    .locals 2

    .line 29
    sget-object v0, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable$2;->$SwitchMap$com$newrelic$agent$android$harvest$type$Harvestable$Type:[I

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable;->type:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    .line 35
    :pswitch_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable;->asJsonPrimitive()Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v0

    return-object v0

    .line 33
    :pswitch_1
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable;->asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object v0

    return-object v0

    .line 31
    :pswitch_2
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable;->asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public asJsonPrimitive()Lcom/newrelic/com/google/gson/JsonPrimitive;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getType()Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable;->type:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    return-object v0
.end method

.method protected notEmpty(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 89
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing Harvestable field."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected notNull(Ljava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_0

    return-void

    .line 99
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Null field in Harvestable object"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected optional(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    return-object p1
.end method

.method public toJsonString()Ljava/lang/String;
    .locals 1

    .line 53
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/type/BaseHarvestable;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonElement;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
