.class final Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;
.super Lcom/newrelic/com/google/gson/TypeAdapter;
.source "MapTypeAdapterFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Adapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/newrelic/com/google/gson/TypeAdapter<",
        "Ljava/util/Map<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field private final constructor:Lcom/newrelic/com/google/gson/internal/ObjectConstructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/newrelic/com/google/gson/internal/ObjectConstructor<",
            "+",
            "Ljava/util/Map<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field private final keyTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/newrelic/com/google/gson/TypeAdapter<",
            "TK;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory;

.field private final valueTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/newrelic/com/google/gson/TypeAdapter<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory;Lcom/newrelic/com/google/gson/Gson;Ljava/lang/reflect/Type;Lcom/newrelic/com/google/gson/TypeAdapter;Ljava/lang/reflect/Type;Lcom/newrelic/com/google/gson/TypeAdapter;Lcom/newrelic/com/google/gson/internal/ObjectConstructor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/com/google/gson/Gson;",
            "Ljava/lang/reflect/Type;",
            "Lcom/newrelic/com/google/gson/TypeAdapter<",
            "TK;>;",
            "Ljava/lang/reflect/Type;",
            "Lcom/newrelic/com/google/gson/TypeAdapter<",
            "TV;>;",
            "Lcom/newrelic/com/google/gson/internal/ObjectConstructor<",
            "+",
            "Ljava/util/Map<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    .line 152
    iput-object p1, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->this$0:Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory;

    invoke-direct {p0}, Lcom/newrelic/com/google/gson/TypeAdapter;-><init>()V

    .line 153
    new-instance p1, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;

    invoke-direct {p1, p2, p4, p3}, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;-><init>(Lcom/newrelic/com/google/gson/Gson;Lcom/newrelic/com/google/gson/TypeAdapter;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->keyTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    .line 155
    new-instance p1, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;

    invoke-direct {p1, p2, p6, p5}, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;-><init>(Lcom/newrelic/com/google/gson/Gson;Lcom/newrelic/com/google/gson/TypeAdapter;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    .line 157
    iput-object p7, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->constructor:Lcom/newrelic/com/google/gson/internal/ObjectConstructor;

    return-void
.end method

.method private keyToString(Lcom/newrelic/com/google/gson/JsonElement;)Ljava/lang/String;
    .locals 1

    .line 246
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/JsonElement;->isJsonPrimitive()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 247
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object p1

    .line 248
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 250
    :cond_0
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->isBoolean()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->getAsBoolean()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 252
    :cond_1
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->isString()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 253
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 255
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 257
    :cond_3
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/JsonElement;->isJsonNull()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "null"

    return-object p1

    .line 260
    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 145
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/com/google/gson/stream/JsonReader;",
            ")",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 161
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->peek()Lcom/newrelic/com/google/gson/stream/JsonToken;

    move-result-object v0

    .line 162
    sget-object v1, Lcom/newrelic/com/google/gson/stream/JsonToken;->NULL:Lcom/newrelic/com/google/gson/stream/JsonToken;

    if-ne v0, v1, :cond_0

    .line 163
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->nextNull()V

    const/4 p1, 0x0

    return-object p1

    .line 167
    :cond_0
    iget-object v1, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->constructor:Lcom/newrelic/com/google/gson/internal/ObjectConstructor;

    invoke-interface {v1}, Lcom/newrelic/com/google/gson/internal/ObjectConstructor;->construct()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 169
    sget-object v2, Lcom/newrelic/com/google/gson/stream/JsonToken;->BEGIN_ARRAY:Lcom/newrelic/com/google/gson/stream/JsonToken;

    if-ne v0, v2, :cond_3

    .line 170
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->beginArray()V

    .line 171
    :goto_0
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 172
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->beginArray()V

    .line 173
    iget-object v0, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->keyTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-virtual {v0, p1}, Lcom/newrelic/com/google/gson/TypeAdapter;->read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object v0

    .line 174
    iget-object v2, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-virtual {v2, p1}, Lcom/newrelic/com/google/gson/TypeAdapter;->read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    .line 175
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    .line 179
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->endArray()V

    goto :goto_0

    .line 177
    :cond_1
    new-instance p1, Lcom/newrelic/com/google/gson/JsonSyntaxException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "duplicate key: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/newrelic/com/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 181
    :cond_2
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->endArray()V

    goto :goto_2

    .line 183
    :cond_3
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->beginObject()V

    .line 184
    :goto_1
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 185
    sget-object v0, Lcom/newrelic/com/google/gson/internal/JsonReaderInternalAccess;->INSTANCE:Lcom/newrelic/com/google/gson/internal/JsonReaderInternalAccess;

    invoke-virtual {v0, p1}, Lcom/newrelic/com/google/gson/internal/JsonReaderInternalAccess;->promoteNameToValue(Lcom/newrelic/com/google/gson/stream/JsonReader;)V

    .line 186
    iget-object v0, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->keyTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-virtual {v0, p1}, Lcom/newrelic/com/google/gson/TypeAdapter;->read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object v0

    .line 187
    iget-object v2, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-virtual {v2, p1}, Lcom/newrelic/com/google/gson/TypeAdapter;->read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    .line 188
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_1

    .line 190
    :cond_4
    new-instance p1, Lcom/newrelic/com/google/gson/JsonSyntaxException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "duplicate key: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/newrelic/com/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 193
    :cond_5
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->endObject()V

    :goto_2
    return-object v1
.end method

.method public bridge synthetic write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 145
    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/util/Map;)V

    return-void
.end method

.method public write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/com/google/gson/stream/JsonWriter;",
            "Ljava/util/Map<",
            "TK;TV;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 200
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->nullValue()Lcom/newrelic/com/google/gson/stream/JsonWriter;

    return-void

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->this$0:Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory;

    invoke-static {v0}, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory;->access$000(Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 205
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->beginObject()Lcom/newrelic/com/google/gson/stream/JsonWriter;

    .line 206
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 207
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/newrelic/com/google/gson/stream/JsonWriter;

    .line 208
    iget-object v1, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lcom/newrelic/com/google/gson/TypeAdapter;->write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    goto :goto_0

    .line 210
    :cond_1
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->endObject()Lcom/newrelic/com/google/gson/stream/JsonWriter;

    return-void

    .line 215
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 217
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 218
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 219
    iget-object v5, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->keyTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/newrelic/com/google/gson/TypeAdapter;->toJsonTree(Ljava/lang/Object;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v5

    .line 220
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    invoke-virtual {v5}, Lcom/newrelic/com/google/gson/JsonElement;->isJsonArray()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v5}, Lcom/newrelic/com/google/gson/JsonElement;->isJsonObject()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v4, 0x1

    :goto_3
    or-int/2addr v3, v4

    goto :goto_1

    :cond_5
    if-eqz v3, :cond_7

    .line 226
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->beginArray()Lcom/newrelic/com/google/gson/stream/JsonWriter;

    .line 227
    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    if-ge v2, p2, :cond_6

    .line 228
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->beginArray()Lcom/newrelic/com/google/gson/stream/JsonWriter;

    .line 229
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/newrelic/com/google/gson/JsonElement;

    invoke-static {p2, p1}, Lcom/newrelic/com/google/gson/internal/Streams;->write(Lcom/newrelic/com/google/gson/JsonElement;Lcom/newrelic/com/google/gson/stream/JsonWriter;)V

    .line 230
    iget-object p2, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p2, p1, v3}, Lcom/newrelic/com/google/gson/TypeAdapter;->write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    .line 231
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->endArray()Lcom/newrelic/com/google/gson/stream/JsonWriter;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 233
    :cond_6
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->endArray()Lcom/newrelic/com/google/gson/stream/JsonWriter;

    goto :goto_6

    .line 235
    :cond_7
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->beginObject()Lcom/newrelic/com/google/gson/stream/JsonWriter;

    .line 236
    :goto_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    if-ge v2, p2, :cond_8

    .line 237
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/newrelic/com/google/gson/JsonElement;

    .line 238
    invoke-direct {p0, p2}, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->keyToString(Lcom/newrelic/com/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->name(Ljava/lang/String;)Lcom/newrelic/com/google/gson/stream/JsonWriter;

    .line 239
    iget-object p2, p0, Lcom/newrelic/com/google/gson/internal/bind/MapTypeAdapterFactory$Adapter;->valueTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p2, p1, v3}, Lcom/newrelic/com/google/gson/TypeAdapter;->write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 241
    :cond_8
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->endObject()Lcom/newrelic/com/google/gson/stream/JsonWriter;

    :goto_6
    return-void
.end method
