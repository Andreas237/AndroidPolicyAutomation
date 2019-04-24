.class final Lcom/newrelic/com/google/gson/TreeTypeAdapter;
.super Lcom/newrelic/com/google/gson/TypeAdapter;
.source "TreeTypeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/com/google/gson/TreeTypeAdapter$SingleTypeFactory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/newrelic/com/google/gson/TypeAdapter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private delegate:Lcom/newrelic/com/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/newrelic/com/google/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final deserializer:Lcom/newrelic/com/google/gson/JsonDeserializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/newrelic/com/google/gson/JsonDeserializer<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final gson:Lcom/newrelic/com/google/gson/Gson;

.field private final serializer:Lcom/newrelic/com/google/gson/JsonSerializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/newrelic/com/google/gson/JsonSerializer<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final skipPast:Lcom/newrelic/com/google/gson/TypeAdapterFactory;

.field private final typeToken:Lcom/newrelic/com/google/gson/reflect/TypeToken;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/newrelic/com/google/gson/reflect/TypeToken<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/newrelic/com/google/gson/JsonSerializer;Lcom/newrelic/com/google/gson/JsonDeserializer;Lcom/newrelic/com/google/gson/Gson;Lcom/newrelic/com/google/gson/reflect/TypeToken;Lcom/newrelic/com/google/gson/TypeAdapterFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/com/google/gson/JsonSerializer<",
            "TT;>;",
            "Lcom/newrelic/com/google/gson/JsonDeserializer<",
            "TT;>;",
            "Lcom/newrelic/com/google/gson/Gson;",
            "Lcom/newrelic/com/google/gson/reflect/TypeToken<",
            "TT;>;",
            "Lcom/newrelic/com/google/gson/TypeAdapterFactory;",
            ")V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Lcom/newrelic/com/google/gson/TypeAdapter;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->serializer:Lcom/newrelic/com/google/gson/JsonSerializer;

    .line 44
    iput-object p2, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->deserializer:Lcom/newrelic/com/google/gson/JsonDeserializer;

    .line 45
    iput-object p3, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->gson:Lcom/newrelic/com/google/gson/Gson;

    .line 46
    iput-object p4, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->typeToken:Lcom/newrelic/com/google/gson/reflect/TypeToken;

    .line 47
    iput-object p5, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->skipPast:Lcom/newrelic/com/google/gson/TypeAdapterFactory;

    return-void
.end method

.method synthetic constructor <init>(Lcom/newrelic/com/google/gson/JsonSerializer;Lcom/newrelic/com/google/gson/JsonDeserializer;Lcom/newrelic/com/google/gson/Gson;Lcom/newrelic/com/google/gson/reflect/TypeToken;Lcom/newrelic/com/google/gson/TypeAdapterFactory;Lcom/newrelic/com/google/gson/TreeTypeAdapter$1;)V
    .locals 0

    .line 31
    invoke-direct/range {p0 .. p5}, Lcom/newrelic/com/google/gson/TreeTypeAdapter;-><init>(Lcom/newrelic/com/google/gson/JsonSerializer;Lcom/newrelic/com/google/gson/JsonDeserializer;Lcom/newrelic/com/google/gson/Gson;Lcom/newrelic/com/google/gson/reflect/TypeToken;Lcom/newrelic/com/google/gson/TypeAdapterFactory;)V

    return-void
.end method

.method private delegate()Lcom/newrelic/com/google/gson/TypeAdapter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/newrelic/com/google/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->delegate:Lcom/newrelic/com/google/gson/TypeAdapter;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->gson:Lcom/newrelic/com/google/gson/Gson;

    iget-object v1, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->skipPast:Lcom/newrelic/com/google/gson/TypeAdapterFactory;

    iget-object v2, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->typeToken:Lcom/newrelic/com/google/gson/reflect/TypeToken;

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/Gson;->getDelegateAdapter(Lcom/newrelic/com/google/gson/TypeAdapterFactory;Lcom/newrelic/com/google/gson/reflect/TypeToken;)Lcom/newrelic/com/google/gson/TypeAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->delegate:Lcom/newrelic/com/google/gson/TypeAdapter;

    :goto_0
    return-object v0
.end method

.method public static newFactory(Lcom/newrelic/com/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/newrelic/com/google/gson/TypeAdapterFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/com/google/gson/reflect/TypeToken<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/newrelic/com/google/gson/TypeAdapterFactory;"
        }
    .end annotation

    .line 85
    new-instance v6, Lcom/newrelic/com/google/gson/TreeTypeAdapter$SingleTypeFactory;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Lcom/newrelic/com/google/gson/TreeTypeAdapter$SingleTypeFactory;-><init>(Ljava/lang/Object;Lcom/newrelic/com/google/gson/reflect/TypeToken;ZLjava/lang/Class;Lcom/newrelic/com/google/gson/TreeTypeAdapter$1;)V

    return-object v6
.end method

.method public static newFactoryWithMatchRawType(Lcom/newrelic/com/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/newrelic/com/google/gson/TypeAdapterFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/com/google/gson/reflect/TypeToken<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/newrelic/com/google/gson/TypeAdapterFactory;"
        }
    .end annotation

    .line 95
    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v4, 0x0

    .line 96
    :goto_0
    new-instance v0, Lcom/newrelic/com/google/gson/TreeTypeAdapter$SingleTypeFactory;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Lcom/newrelic/com/google/gson/TreeTypeAdapter$SingleTypeFactory;-><init>(Ljava/lang/Object;Lcom/newrelic/com/google/gson/reflect/TypeToken;ZLjava/lang/Class;Lcom/newrelic/com/google/gson/TreeTypeAdapter$1;)V

    return-object v0
.end method

.method public static newTypeHierarchyFactory(Ljava/lang/Class;Ljava/lang/Object;)Lcom/newrelic/com/google/gson/TypeAdapterFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/newrelic/com/google/gson/TypeAdapterFactory;"
        }
    .end annotation

    .line 105
    new-instance v6, Lcom/newrelic/com/google/gson/TreeTypeAdapter$SingleTypeFactory;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lcom/newrelic/com/google/gson/TreeTypeAdapter$SingleTypeFactory;-><init>(Ljava/lang/Object;Lcom/newrelic/com/google/gson/reflect/TypeToken;ZLjava/lang/Class;Lcom/newrelic/com/google/gson/TreeTypeAdapter$1;)V

    return-object v6
.end method


# virtual methods
.method public read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/com/google/gson/stream/JsonReader;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->deserializer:Lcom/newrelic/com/google/gson/JsonDeserializer;

    if-nez v0, :cond_0

    .line 52
    invoke-direct {p0}, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->delegate()Lcom/newrelic/com/google/gson/TypeAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/newrelic/com/google/gson/TypeAdapter;->read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 54
    :cond_0
    invoke-static {p1}, Lcom/newrelic/com/google/gson/internal/Streams;->parse(Lcom/newrelic/com/google/gson/stream/JsonReader;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/JsonElement;->isJsonNull()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 58
    :cond_1
    iget-object v0, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->deserializer:Lcom/newrelic/com/google/gson/JsonDeserializer;

    iget-object v1, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->typeToken:Lcom/newrelic/com/google/gson/reflect/TypeToken;

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->gson:Lcom/newrelic/com/google/gson/Gson;

    iget-object v2, v2, Lcom/newrelic/com/google/gson/Gson;->deserializationContext:Lcom/newrelic/com/google/gson/JsonDeserializationContext;

    invoke-interface {v0, p1, v1, v2}, Lcom/newrelic/com/google/gson/JsonDeserializer;->deserialize(Lcom/newrelic/com/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/newrelic/com/google/gson/JsonDeserializationContext;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/com/google/gson/stream/JsonWriter;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->serializer:Lcom/newrelic/com/google/gson/JsonSerializer;

    if-nez v0, :cond_0

    .line 63
    invoke-direct {p0}, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->delegate()Lcom/newrelic/com/google/gson/TypeAdapter;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/newrelic/com/google/gson/TypeAdapter;->write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 67
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->nullValue()Lcom/newrelic/com/google/gson/stream/JsonWriter;

    return-void

    .line 70
    :cond_1
    iget-object v1, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->typeToken:Lcom/newrelic/com/google/gson/reflect/TypeToken;

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->gson:Lcom/newrelic/com/google/gson/Gson;

    iget-object v2, v2, Lcom/newrelic/com/google/gson/Gson;->serializationContext:Lcom/newrelic/com/google/gson/JsonSerializationContext;

    invoke-interface {v0, p2, v1, v2}, Lcom/newrelic/com/google/gson/JsonSerializer;->serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/newrelic/com/google/gson/JsonSerializationContext;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object p2

    .line 71
    invoke-static {p2, p1}, Lcom/newrelic/com/google/gson/internal/Streams;->write(Lcom/newrelic/com/google/gson/JsonElement;Lcom/newrelic/com/google/gson/stream/JsonWriter;)V

    return-void
.end method
