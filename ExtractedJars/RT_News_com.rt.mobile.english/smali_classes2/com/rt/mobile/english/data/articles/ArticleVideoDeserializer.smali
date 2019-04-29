.class public Lcom/rt/mobile/english/data/articles/ArticleVideoDeserializer;
.super Ljava/lang/Object;
.source "ArticleVideoDeserializer.java"

# interfaces
.implements Lcom/google/gson/JsonDeserializer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/gson/JsonDeserializer<",
        "Lcom/rt/mobile/english/data/articles/Article$Video;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/rt/mobile/english/data/articles/Article$Video;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonParseException;
        }
    .end annotation

    .line 24
    new-instance p2, Lcom/rt/mobile/english/data/articles/Article$Video;

    invoke-direct {p2}, Lcom/rt/mobile/english/data/articles/Article$Video;-><init>()V

    .line 25
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->isJsonPrimitive()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 26
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/rt/mobile/english/data/articles/Article$Video;->setUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object p1

    const-string p3, "url"

    .line 29
    invoke-virtual {p1, p3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/data/articles/Article$Video;->setUrl(Ljava/lang/String;)V

    const-string p3, "size"

    .line 30
    invoke-virtual {p1, p3}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    const-string p3, "size"

    .line 31
    invoke-virtual {p1, p3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsLong()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/rt/mobile/english/data/articles/Article$Video;->setSize(J)V

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    .line 33
    invoke-virtual {p2, v0, v1}, Lcom/rt/mobile/english/data/articles/Article$Video;->setSize(J)V

    :goto_0
    return-object p2
.end method

.method public bridge synthetic deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonParseException;
        }
    .end annotation

    .line 21
    invoke-virtual {p0, p1, p2, p3}, Lcom/rt/mobile/english/data/articles/ArticleVideoDeserializer;->deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object p1

    return-object p1
.end method
