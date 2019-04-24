.class public Lcom/ibotta/android/json/jackson/JacksonJson;
.super Ljava/lang/Object;
.source "JacksonJson.java"

# interfaces
.implements Lcom/ibotta/android/json/IbottaJson;


# instance fields
.field protected final objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/json/NamingPolicy;Z)V
    .locals 3

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    sget-object v1, Lcom/fasterxml/jackson/databind/DeserializationFeature;->FAIL_ON_UNKNOWN_PROPERTIES:Lcom/fasterxml/jackson/databind/DeserializationFeature;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->configure(Lcom/fasterxml/jackson/databind/DeserializationFeature;Z)Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 38
    new-instance v0, Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;-><init>()V

    .line 39
    sget-object v1, Lcom/ibotta/android/json/jackson/NullSerializer;->instance:Lcom/ibotta/android/json/jackson/NullSerializer;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;->setNullValueSerializer(Lcom/fasterxml/jackson/databind/JsonSerializer;)V

    .line 40
    iget-object v1, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->setSerializerProvider(Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    sget-object v1, Lcom/fasterxml/jackson/annotation/JsonInclude$Include;->NON_NULL:Lcom/fasterxml/jackson/annotation/JsonInclude$Include;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ObjectMapper;->setSerializationInclusion(Lcom/fasterxml/jackson/annotation/JsonInclude$Include;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 43
    sget-object v0, Lcom/ibotta/android/json/jackson/JacksonJson$1;->$SwitchMap$com$ibotta$android$json$NamingPolicy:[I

    invoke-virtual {p1}, Lcom/ibotta/android/json/NamingPolicy;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 45
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    sget-object v0, Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;->CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES:Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->setPropertyNamingStrategy(Lcom/fasterxml/jackson/databind/PropertyNamingStrategy;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    :goto_0
    if-eqz p2, :cond_1

    .line 52
    iget-object p1, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    new-instance p2, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;

    invoke-direct {p2}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;-><init>()V

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->registerModule(Lcom/fasterxml/jackson/databind/Module;)Lcom/fasterxml/jackson/databind/ObjectMapper;

    :cond_1
    return-void
.end method


# virtual methods
.method public fromJson(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            "TC;)TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 200
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 202
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJson(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Ljava/io/InputStream;",
            "TC;)TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 190
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 192
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Ljava/lang/String;",
            "TC;)TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 179
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 181
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJsonToArrayList(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Lcom/fasterxml/jackson/databind/JsonNode;",
            "TC;)",
            "Ljava/util/ArrayList<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 131
    :try_start_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->defaultInstance()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    const-class v1, Ljava/util/ArrayList;

    invoke-virtual {v0, v1, p2}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructCollectionType(Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/type/CollectionType;

    move-result-object p2

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 134
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJsonToArrayList(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Ljava/io/InputStream;",
            "TC;)",
            "Ljava/util/ArrayList<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 211
    :try_start_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->defaultInstance()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    const-class v1, Ljava/util/ArrayList;

    invoke-virtual {v0, v1, p2}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructCollectionType(Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/type/CollectionType;

    move-result-object p2

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 214
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJsonToArrayList(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Ljava/lang/String;",
            "TC;)",
            "Ljava/util/ArrayList<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 108
    :try_start_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->defaultInstance()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    const-class v1, Ljava/util/ArrayList;

    invoke-virtual {v0, v1, p2}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructCollectionType(Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/type/CollectionType;

    move-result-object p2

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 111
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJsonToHashMap(Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/io/InputStream;",
            "TC1;TC2;)",
            "Ljava/util/HashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 247
    :try_start_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->defaultInstance()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    const-class v1, Ljava/util/HashMap;

    invoke-virtual {v0, v1, p2, p3}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructMapType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/type/MapType;

    move-result-object p2

    .line 248
    iget-object p3, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 250
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJsonToHashMap(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/lang/String;",
            "TC1;TC2;)",
            "Ljava/util/HashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 155
    :try_start_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->defaultInstance()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    const-class v1, Ljava/util/HashMap;

    invoke-virtual {v0, v1, p2, p3}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructMapType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/type/MapType;

    move-result-object p2

    .line 156
    iget-object p3, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 158
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJsonToHashSet(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/HashSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Ljava/lang/String;",
            "TC;)",
            "Ljava/util/HashSet<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 120
    :try_start_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->defaultInstance()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    const-class v1, Ljava/util/HashSet;

    invoke-virtual {v0, v1, p2}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructCollectionType(Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/type/CollectionType;

    move-result-object p2

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashSet;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 123
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJsonToLinkedHashMap(Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/LinkedHashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/io/InputStream;",
            "TC1;TC2;)",
            "Ljava/util/LinkedHashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 223
    :try_start_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->defaultInstance()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    const-class v1, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1, p2, p3}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructMapType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/type/MapType;

    move-result-object p2

    .line 224
    iget-object p3, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/LinkedHashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 226
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJsonToLinkedHashMap(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/LinkedHashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/lang/String;",
            "TC1;TC2;)",
            "Ljava/util/LinkedHashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 143
    :try_start_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->defaultInstance()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    const-class v1, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1, p2, p3}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructMapType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/type/MapType;

    move-result-object p2

    .line 144
    iget-object p3, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/LinkedHashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 146
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJsonToTreeMap(Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/TreeMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/io/InputStream;",
            "TC1;TC2;)",
            "Ljava/util/TreeMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 235
    :try_start_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->defaultInstance()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    const-class v1, Ljava/util/TreeMap;

    invoke-virtual {v0, v1, p2, p3}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructMapType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/type/MapType;

    move-result-object p2

    .line 236
    iget-object p3, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/TreeMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 238
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public fromJsonToTreeMap(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/TreeMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/lang/String;",
            "TC1;TC2;)",
            "Ljava/util/TreeMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 167
    :try_start_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->defaultInstance()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    const-class v1, Ljava/util/TreeMap;

    invoke-virtual {v0, v1, p2, p3}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructMapType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/type/MapType;

    move-result-object p2

    .line 168
    iget-object p3, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p3, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/TreeMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 170
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public getGenerator(Ljava/io/OutputStream;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 75
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->getFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object v0

    sget-object v1, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    invoke-virtual {v0, p1, v1}, Lcom/fasterxml/jackson/core/JsonFactory;->createGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 77
    new-instance v0, Lcom/ibotta/android/json/IbottaJsonException;

    const-string v1, "Failed to create generator for OutputStream"

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public getObjectMapper()Lcom/fasterxml/jackson/databind/ObjectMapper;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    return-object v0
.end method

.method public getParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 64
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->getFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->createParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 66
    new-instance v0, Lcom/ibotta/android/json/IbottaJsonException;

    const-string v1, "Failed to create parser for file InputStream"

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 86
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writer()Lcom/fasterxml/jackson/databind/ObjectWriter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/ObjectWriter;->writeValueAsString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lcom/fasterxml/jackson/core/JsonProcessingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 88
    new-instance v0, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {v0, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public toOutputStream(Ljava/io/OutputStream;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 96
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/JacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writer()Lcom/fasterxml/jackson/databind/ObjectWriter;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/ObjectWriter;->writeValue(Ljava/io/OutputStream;Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/fasterxml/jackson/core/JsonProcessingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 100
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 98
    new-instance p2, Lcom/ibotta/android/json/IbottaJsonException;

    invoke-direct {p2, p1}, Lcom/ibotta/android/json/IbottaJsonException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
