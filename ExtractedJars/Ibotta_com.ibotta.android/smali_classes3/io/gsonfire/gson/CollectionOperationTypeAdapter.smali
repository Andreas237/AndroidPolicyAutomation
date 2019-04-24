.class final Lio/gsonfire/gson/CollectionOperationTypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "CollectionOperationTypeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Ljava/util/Collection;",
        ">;"
    }
.end annotation


# static fields
.field private static final EMPTY_ARRAY:Lcom/google/gson/JsonElement;


# instance fields
.field private final collectionTypeAdapter:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/util/Collection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Lcom/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/google/gson/JsonArray;-><init>()V

    sput-object v0, Lio/gsonfire/gson/CollectionOperationTypeAdapter;->EMPTY_ARRAY:Lcom/google/gson/JsonElement;

    return-void
.end method

.method public constructor <init>(Lcom/google/gson/TypeAdapter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/util/Collection;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 22
    iput-object p1, p0, Lio/gsonfire/gson/CollectionOperationTypeAdapter;->collectionTypeAdapter:Lcom/google/gson/TypeAdapter;

    return-void
.end method


# virtual methods
.method public bridge synthetic read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16
    invoke-virtual {p0, p1}, Lio/gsonfire/gson/CollectionOperationTypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 32
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    move-result-object v0

    .line 33
    sget-object v1, Lcom/google/gson/stream/JsonToken;->BEGIN_OBJECT:Lcom/google/gson/stream/JsonToken;

    if-ne v0, v1, :cond_2

    .line 34
    iget-object v0, p0, Lio/gsonfire/gson/CollectionOperationTypeAdapter;->collectionTypeAdapter:Lcom/google/gson/TypeAdapter;

    sget-object v1, Lio/gsonfire/gson/CollectionOperationTypeAdapter;->EMPTY_ARRAY:Lcom/google/gson/JsonElement;

    invoke-virtual {v0, v1}, Lcom/google/gson/TypeAdapter;->fromJsonTree(Lcom/google/gson/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 35
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginObject()V

    .line 36
    :goto_0
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 37
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->valueOf(Ljava/lang/String;)Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    move-result-object v1

    .line 39
    sget-object v2, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->$clear:Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;

    if-ne v1, v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    .line 42
    :cond_0
    iget-object v2, p0, Lio/gsonfire/gson/CollectionOperationTypeAdapter;->collectionTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v2, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    .line 44
    :goto_1
    invoke-virtual {v1, v0, v2}, Lio/gsonfire/gson/CollectionOperationTypeAdapter$Operator;->apply(Ljava/util/Collection;Ljava/util/Collection;)V

    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endObject()V

    return-object v0

    .line 49
    :cond_2
    iget-object v0, p0, Lio/gsonfire/gson/CollectionOperationTypeAdapter;->collectionTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16
    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lio/gsonfire/gson/CollectionOperationTypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Collection;)V

    return-void
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lio/gsonfire/gson/CollectionOperationTypeAdapter;->collectionTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    return-void
.end method
