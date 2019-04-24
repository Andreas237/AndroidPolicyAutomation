.class public final enum Lcom/ibotta/android/json/IbottaJsonFactory;
.super Ljava/lang/Enum;
.source "IbottaJsonFactory.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/json/IbottaJsonFactory;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/json/IbottaJsonFactory;

.field public static final enum INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 17
    new-instance v0, Lcom/ibotta/android/json/IbottaJsonFactory;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/json/IbottaJsonFactory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v0, 0x1

    .line 16
    new-array v0, v0, [Lcom/ibotta/android/json/IbottaJsonFactory;

    sget-object v1, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->$VALUES:[Lcom/ibotta/android/json/IbottaJsonFactory;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static deepPullOverlay(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/node/ObjectNode;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 1

    .line 32
    invoke-static {}, Lcom/ibotta/android/json/IbottaJsonFactory;->newObjectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    .line 33
    invoke-static {p0, p1, v0, p2}, Lcom/ibotta/android/json/IbottaJsonFactory;->deepPullOverlay(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/node/ObjectNode;Z)V

    return-object v0
.end method

.method private static deepPullOverlay(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/node/ObjectNode;Z)V
    .locals 5

    .line 38
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->fields()Ljava/util/Iterator;

    move-result-object p0

    .line 40
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 42
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 44
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 46
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 48
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->has(Ljava/lang/String;)Z

    move-result v3

    .line 49
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v4

    if-nez v3, :cond_0

    if-eqz v4, :cond_0

    .line 53
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->deepCopy()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 54
    invoke-virtual {p2, v2, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->replace(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_0

    :cond_0
    if-eqz v3, :cond_1

    if-eqz v4, :cond_1

    .line 57
    invoke-static {}, Lcom/ibotta/android/json/IbottaJsonFactory;->newObjectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v3

    .line 58
    check-cast v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v4

    check-cast v4, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-static {v1, v4, v3, p3}, Lcom/ibotta/android/json/IbottaJsonFactory;->deepPullOverlay(Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/node/ObjectNode;Lcom/fasterxml/jackson/databind/node/ObjectNode;Z)V

    .line 59
    invoke-virtual {p2, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->replace(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {p2, v2, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->replace(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->fields()Ljava/util/Iterator;

    move-result-object p0

    .line 67
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 68
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    .line 69
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 70
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/JsonNode;

    if-nez p3, :cond_4

    .line 71
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v2

    if-nez v2, :cond_3

    :cond_4
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {v1}, Lcom/ibotta/android/json/IbottaJsonFactory;->isNumber(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 72
    invoke-virtual {p2, v1, p1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/JsonNode;

    goto :goto_1

    :cond_5
    return-void
.end method

.method private static isNumber(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 88
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 92
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2d

    const/4 v3, 0x1

    if-ne v1, v2, :cond_2

    .line 93
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    const/4 v1, 0x0

    .line 99
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 100
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    move-result v2

    if-nez v2, :cond_3

    return v0

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return v3

    :cond_5
    :goto_1
    return v0
.end method

.method private static newObjectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 2

    .line 78
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/json/jackson/JacksonJson;

    invoke-virtual {v0}, Lcom/ibotta/android/json/jackson/JacksonJson;->getObjectMapper()Lcom/fasterxml/jackson/databind/ObjectMapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->createObjectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/json/IbottaJsonFactory;
    .locals 1

    .line 16
    const-class v0, Lcom/ibotta/android/json/IbottaJsonFactory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/json/IbottaJsonFactory;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/json/IbottaJsonFactory;
    .locals 1

    .line 16
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->$VALUES:[Lcom/ibotta/android/json/IbottaJsonFactory;

    invoke-virtual {v0}, [Lcom/ibotta/android/json/IbottaJsonFactory;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/json/IbottaJsonFactory;

    return-object v0
.end method


# virtual methods
.method public getInstance(Lcom/ibotta/android/json/NamingPolicy;ZZ)Lcom/ibotta/android/json/IbottaJson;
    .locals 1

    .line 28
    sget-object v0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->INSTANCE:Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->getInstance(Lcom/ibotta/android/json/NamingPolicy;ZZ)Lcom/ibotta/android/json/jackson/JacksonJson;

    move-result-object p1

    return-object p1
.end method

.method public getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;
    .locals 1

    .line 24
    sget-object v0, Lcom/ibotta/android/json/NamingPolicy;->LOWER_CASE_WITH_UNDERSCORES:Lcom/ibotta/android/json/NamingPolicy;

    invoke-virtual {p0, v0, p1, p2}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(Lcom/ibotta/android/json/NamingPolicy;ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object p1

    return-object p1
.end method

.method public initEncryption(Ljava/lang/String;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    .line 20
    sget-object v0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->INSTANCE:Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->initEncryption(Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method
