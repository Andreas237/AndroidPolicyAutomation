.class public Lcom/ibotta/api/ApiErrorDetails;
.super Ljava/lang/Object;
.source "ApiErrorDetails.java"


# instance fields
.field private error:Z

.field private fields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private messages:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;)Lcom/ibotta/api/ApiErrorDetails;
    .locals 11

    .line 25
    new-instance v0, Lcom/ibotta/api/ApiErrorDetails;

    invoke-direct {v0}, Lcom/ibotta/api/ApiErrorDetails;-><init>()V

    .line 27
    :try_start_0
    sget-object v1, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v2}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v1

    const-class v3, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-interface {v1, p0, v3}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/JsonNode;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    .line 30
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 31
    check-cast p0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_b

    const-string v3, "error"

    .line 35
    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->has(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    const-string v3, "error"

    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->asBoolean(Z)Z

    move-result v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const-string v5, "message"

    .line 38
    invoke-virtual {p0, v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v1, "message"

    .line 39
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    .line 42
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_4

    .line 44
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->isArray()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 45
    move-object v6, v1

    check-cast v6, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    const/4 v7, 0x0

    .line 47
    :goto_2
    invoke-virtual {v6}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->size()I

    move-result v8

    if-ge v7, v8, :cond_4

    .line 48
    invoke-virtual {v6, v7}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 50
    :try_start_1
    invoke-virtual {v8}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 57
    :cond_3
    :try_start_2
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 64
    :catch_1
    :cond_4
    :try_start_3
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v7, "fields"

    .line 65
    invoke-virtual {p0, v7}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    const-string v1, "fields"

    .line 66
    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    :cond_5
    if-eqz v1, :cond_a

    .line 68
    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result p0

    if-eqz p0, :cond_a

    .line 69
    check-cast v1, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->fields()Ljava/util/Iterator;

    move-result-object p0

    .line 70
    :catch_2
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 71
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 72
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 73
    invoke-virtual {v7}, Lcom/fasterxml/jackson/databind/JsonNode;->isArray()Z

    move-result v8

    if-eqz v8, :cond_9

    .line 74
    check-cast v7, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    .line 75
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    .line 76
    :goto_4
    invoke-virtual {v7}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->size()I

    move-result v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    if-ge v9, v10, :cond_6

    .line 78
    :try_start_4
    invoke-virtual {v7, v9}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->get(I)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v10

    invoke-virtual {v10}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 85
    :cond_6
    :try_start_5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_8

    .line 86
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_8

    const-string v7, ""

    .line 88
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v9

    if-le v9, v2, :cond_7

    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 91
    :cond_7
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v1

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 93
    :cond_8
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v7

    new-array v7, v7, [Ljava/lang/String;

    invoke-interface {v8, v7}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_3

    .line 98
    :cond_9
    :try_start_6
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    new-array v8, v2, [Ljava/lang/String;

    invoke-virtual {v7}, Lcom/fasterxml/jackson/databind/JsonNode;->asText()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v8, v4

    invoke-interface {v6, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3

    .line 103
    :cond_a
    invoke-virtual {v0, v3}, Lcom/ibotta/api/ApiErrorDetails;->setError(Z)V

    .line 104
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    invoke-interface {v5, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    invoke-virtual {v0, p0}, Lcom/ibotta/api/ApiErrorDetails;->setMessages([Ljava/lang/String;)V

    .line 105
    invoke-virtual {v0, v6}, Lcom/ibotta/api/ApiErrorDetails;->setFields(Ljava/util/Map;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    :catch_4
    :cond_b
    return-object v0
.end method


# virtual methods
.method public getFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 134
    iget-object v0, p0, Lcom/ibotta/api/ApiErrorDetails;->fields:Ljava/util/Map;

    return-object v0
.end method

.method public getFirstMessage()Ljava/lang/String;
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/ibotta/api/ApiErrorDetails;->messages:[Ljava/lang/String;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getMessages()[Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/api/ApiErrorDetails;->messages:[Ljava/lang/String;

    return-object v0
.end method

.method public isError()Z
    .locals 1

    .line 114
    iget-boolean v0, p0, Lcom/ibotta/api/ApiErrorDetails;->error:Z

    return v0
.end method

.method public setError(Z)V
    .locals 0

    .line 118
    iput-boolean p1, p0, Lcom/ibotta/api/ApiErrorDetails;->error:Z

    return-void
.end method

.method public setFields(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 138
    iput-object p1, p0, Lcom/ibotta/api/ApiErrorDetails;->fields:Ljava/util/Map;

    return-void
.end method

.method public setMessages([Ljava/lang/String;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/ibotta/api/ApiErrorDetails;->messages:[Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 142
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    invoke-virtual {p0}, Lcom/ibotta/api/ApiErrorDetails;->getMessages()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v3, 0x0

    .line 145
    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_0

    .line 146
    aget-object v4, v1, v3

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n"

    .line 147
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const-string v1, "\n"

    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/api/ApiErrorDetails;->getFields()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 154
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 155
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    .line 156
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    if-eqz v3, :cond_3

    const/4 v4, 0x0

    .line 160
    :goto_2
    array-length v5, v3

    if-ge v4, v5, :cond_3

    .line 161
    aget-object v5, v3, v4

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    array-length v5, v3

    add-int/lit8 v5, v5, -0x1

    if-ge v4, v5, :cond_2

    const-string v5, ", "

    .line 163
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    const-string v3, "\n"

    .line 168
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 171
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
