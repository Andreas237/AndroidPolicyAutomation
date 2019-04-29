.class public Lio/sentry/marshaller/json/SentryJsonGenerator;
.super Lcom/fasterxml/jackson/core/JsonGenerator;
.source "SentryJsonGenerator.java"


# static fields
.field private static final ELIDED:Ljava/lang/String; = "..."

.field private static final MAX_LENGTH_LIST:I = 0xa

.field private static final MAX_LENGTH_STRING:I = 0x190

.field private static final MAX_NESTING:I = 0x3

.field private static final MAX_SIZE_MAP:I = 0x32

.field private static final RECURSION_LIMIT_HIT:Ljava/lang/String; = "<recursion limit hit>"

.field private static final logger:Lorg/slf4j/Logger;


# instance fields
.field private generator:Lcom/fasterxml/jackson/core/JsonGenerator;

.field private maxLengthList:I

.field private maxLengthString:I

.field private maxNesting:I

.field private maxSizeMap:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-class v0, Lio/sentry/util/Util;

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/Class;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lio/sentry/marshaller/json/SentryJsonGenerator;->logger:Lorg/slf4j/Logger;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonGenerator;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/JsonGenerator;-><init>()V

    .line 45
    iput-object p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    const/16 p1, 0xa

    .line 47
    iput p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    const/16 p1, 0x190

    .line 48
    iput p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthString:I

    const/16 p1, 0x32

    .line 49
    iput p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxSizeMap:I

    const/4 p1, 0x3

    .line 50
    iput p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxNesting:I

    return-void
.end method

.method private writeArray(Ljava/lang/Object;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 127
    instance-of v0, p1, [B

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 128
    check-cast p1, [B

    .line 129
    :goto_0
    array-length p2, p1

    if-ge v1, p2, :cond_0

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-ge v1, p2, :cond_0

    .line 130
    iget-object p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    aget-byte v0, p1, v1

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 132
    :cond_0
    array-length p1, p1

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-le p1, p2, :cond_11

    .line 133
    invoke-direct {p0}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeElided()V

    goto/16 :goto_9

    .line 135
    :cond_1
    instance-of v0, p1, [S

    if-eqz v0, :cond_3

    .line 136
    check-cast p1, [S

    .line 137
    :goto_1
    array-length p2, p1

    if-ge v1, p2, :cond_2

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-ge v1, p2, :cond_2

    .line 138
    iget-object p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    aget-short v0, p1, v1

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 140
    :cond_2
    array-length p1, p1

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-le p1, p2, :cond_11

    .line 141
    invoke-direct {p0}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeElided()V

    goto/16 :goto_9

    .line 143
    :cond_3
    instance-of v0, p1, [I

    if-eqz v0, :cond_5

    .line 144
    check-cast p1, [I

    .line 145
    :goto_2
    array-length p2, p1

    if-ge v1, p2, :cond_4

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-ge v1, p2, :cond_4

    .line 146
    iget-object p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    aget v0, p1, v1

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 148
    :cond_4
    array-length p1, p1

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-le p1, p2, :cond_11

    .line 149
    invoke-direct {p0}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeElided()V

    goto/16 :goto_9

    .line 151
    :cond_5
    instance-of v0, p1, [J

    if-eqz v0, :cond_7

    .line 152
    check-cast p1, [J

    .line 153
    :goto_3
    array-length p2, p1

    if-ge v1, p2, :cond_6

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-ge v1, p2, :cond_6

    .line 154
    iget-object p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    aget-wide v2, p1, v1

    invoke-virtual {p2, v2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 156
    :cond_6
    array-length p1, p1

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-le p1, p2, :cond_11

    .line 157
    invoke-direct {p0}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeElided()V

    goto/16 :goto_9

    .line 159
    :cond_7
    instance-of v0, p1, [F

    if-eqz v0, :cond_9

    .line 160
    check-cast p1, [F

    .line 161
    :goto_4
    array-length p2, p1

    if-ge v1, p2, :cond_8

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-ge v1, p2, :cond_8

    .line 162
    iget-object p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    aget v0, p1, v1

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 164
    :cond_8
    array-length p1, p1

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-le p1, p2, :cond_11

    .line 165
    invoke-direct {p0}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeElided()V

    goto/16 :goto_9

    .line 167
    :cond_9
    instance-of v0, p1, [D

    if-eqz v0, :cond_b

    .line 168
    check-cast p1, [D

    .line 169
    :goto_5
    array-length p2, p1

    if-ge v1, p2, :cond_a

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-ge v1, p2, :cond_a

    .line 170
    iget-object p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    aget-wide v2, p1, v1

    invoke-virtual {p2, v2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(D)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 172
    :cond_a
    array-length p1, p1

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-le p1, p2, :cond_11

    .line 173
    invoke-direct {p0}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeElided()V

    goto :goto_9

    .line 175
    :cond_b
    instance-of v0, p1, [C

    if-eqz v0, :cond_d

    .line 176
    check-cast p1, [C

    .line 177
    :goto_6
    array-length p2, p1

    if-ge v1, p2, :cond_c

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-ge v1, p2, :cond_c

    .line 178
    iget-object p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    aget-char v0, p1, v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 180
    :cond_c
    array-length p1, p1

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-le p1, p2, :cond_11

    .line 181
    invoke-direct {p0}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeElided()V

    goto :goto_9

    .line 183
    :cond_d
    instance-of v0, p1, [Z

    if-eqz v0, :cond_f

    .line 184
    check-cast p1, [Z

    .line 185
    :goto_7
    array-length p2, p1

    if-ge v1, p2, :cond_e

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-ge v1, p2, :cond_e

    .line 186
    iget-object p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    aget-boolean v0, p1, v1

    invoke-virtual {p2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeBoolean(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 188
    :cond_e
    array-length p1, p1

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-le p1, p2, :cond_11

    .line 189
    invoke-direct {p0}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeElided()V

    goto :goto_9

    .line 192
    :cond_f
    check-cast p1, [Ljava/lang/Object;

    .line 193
    :goto_8
    array-length v0, p1

    if-ge v1, v0, :cond_10

    iget v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-ge v1, v0, :cond_10

    .line 194
    aget-object v0, p1, v1

    add-int/lit8 v2, p2, 0x1

    invoke-direct {p0, v0, v2}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeObject(Ljava/lang/Object;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 196
    :cond_10
    array-length p1, p1

    iget p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-le p1, p2, :cond_11

    .line 197
    invoke-direct {p0}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeElided()V

    :cond_11
    :goto_9
    return-void
.end method

.method private writeElided()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 203
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    const-string v1, "..."

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method private writeObject(Ljava/lang/Object;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 64
    iget v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxNesting:I

    if-lt p2, v0, :cond_0

    .line 65
    iget-object p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    const-string p2, "<recursion limit hit>"

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 70
    iget-object p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNull()V

    goto/16 :goto_5

    .line 71
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 72
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 73
    invoke-direct {p0, p1, p2}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeArray(Ljava/lang/Object;I)V

    .line 74
    iget-object p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    goto/16 :goto_5

    .line 75
    :cond_2
    instance-of v0, p1, Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 76
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 78
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 79
    iget v2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxSizeMap:I

    if-lt v1, v2, :cond_3

    goto :goto_2

    .line 83
    :cond_3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    .line 84
    iget-object v2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    const-string v3, "null"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    goto :goto_1

    .line 86
    :cond_4
    iget-object v2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthString:I

    invoke-static {v3, v4}, Lio/sentry/util/Util;->trimString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 88
    :goto_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v2, p2, 0x1

    invoke-direct {p0, v0, v2}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeObject(Ljava/lang/Object;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 92
    :cond_5
    :goto_2
    iget-object p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    goto :goto_5

    .line 93
    :cond_6
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_9

    .line 94
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 96
    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 97
    iget v2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    if-lt v1, v2, :cond_7

    .line 98
    invoke-direct {p0}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeElided()V

    goto :goto_4

    :cond_7
    add-int/lit8 v2, p2, 0x1

    .line 102
    invoke-direct {p0, v0, v2}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeObject(Ljava/lang/Object;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 106
    :cond_8
    :goto_4
    iget-object p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    goto :goto_5

    .line 107
    :cond_9
    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_a

    .line 108
    iget-object p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    check-cast p1, Ljava/lang/String;

    iget v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthString:I

    invoke-static {p1, v0}, Lio/sentry/util/Util;->trimString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    goto :goto_5

    .line 112
    :cond_a
    :try_start_0
    iget-object p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObject(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 114
    :catch_0
    sget-object p2, Lio/sentry/marshaller/json/SentryJsonGenerator;->logger:Lorg/slf4j/Logger;

    const-string v0, "Couldn\'t marshal \'{}\' of type \'{}\', had to be converted into a String"

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    :try_start_1
    iget-object p2, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthString:I

    invoke-static {p1, v0}, Lio/sentry/util/Util;->trimString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    .line 119
    :catch_1
    iget-object p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    const-string p2, "<exception calling toString on object>"

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    :goto_5
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 434
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->close()V

    return-void
.end method

.method public disable(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 1

    .line 244
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->disable(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object p1

    return-object p1
.end method

.method public enable(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 1

    .line 239
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->enable(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object p1

    return-object p1
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 424
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->flush()V

    return-void
.end method

.method public getCodec()Lcom/fasterxml/jackson/core/ObjectCodec;
    .locals 1

    .line 229
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->getCodec()Lcom/fasterxml/jackson/core/ObjectCodec;

    move-result-object v0

    return-object v0
.end method

.method public getFeatureMask()I
    .locals 1

    .line 254
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->getFeatureMask()I

    move-result v0

    return v0
.end method

.method public getOutputContext()Lcom/fasterxml/jackson/core/JsonStreamContext;
    .locals 1

    .line 419
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->getOutputContext()Lcom/fasterxml/jackson/core/JsonStreamContext;

    move-result-object v0

    return-object v0
.end method

.method public isClosed()Z
    .locals 1

    .line 429
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->isClosed()Z

    move-result v0

    return v0
.end method

.method public isEnabled(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z
    .locals 1

    .line 249
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->isEnabled(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)Z

    move-result p1

    return p1
.end method

.method public setCodec(Lcom/fasterxml/jackson/core/ObjectCodec;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 1

    .line 224
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->setCodec(Lcom/fasterxml/jackson/core/ObjectCodec;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object p1

    return-object p1
.end method

.method public setFeatureMask(I)Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 1

    .line 259
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->setFeatureMask(I)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object p1

    return-object p1
.end method

.method public setMaxLengthList(I)V
    .locals 0

    .line 207
    iput p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthList:I

    return-void
.end method

.method public setMaxLengthString(I)V
    .locals 0

    .line 211
    iput p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxLengthString:I

    return-void
.end method

.method public setMaxNesting(I)V
    .locals 0

    .line 219
    iput p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxNesting:I

    return-void
.end method

.method public setMaxSizeMap(I)V
    .locals 0

    .line 215
    iput p1, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->maxSizeMap:I

    return-void
.end method

.method public useDefaultPrettyPrinter()Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 1

    .line 264
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->useDefaultPrettyPrinter()Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object v0

    return-object v0
.end method

.method public version()Lcom/fasterxml/jackson/core/Version;
    .locals 1

    .line 234
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->version()Lcom/fasterxml/jackson/core/Version;

    move-result-object v0

    return-object v0
.end method

.method public writeBinary(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/InputStream;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 364
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeBinary(Lcom/fasterxml/jackson/core/Base64Variant;Ljava/io/InputStream;I)I

    move-result p1

    return p1
.end method

.method public writeBinary(Lcom/fasterxml/jackson/core/Base64Variant;[BII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 359
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeBinary(Lcom/fasterxml/jackson/core/Base64Variant;[BII)V

    return-void
.end method

.method public writeBoolean(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 404
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeBoolean(Z)V

    return-void
.end method

.method public writeEndArray()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 274
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    return-void
.end method

.method public writeEndObject()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 284
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method

.method public writeFieldName(Lcom/fasterxml/jackson/core/SerializableString;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 294
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Lcom/fasterxml/jackson/core/SerializableString;)V

    return-void
.end method

.method public writeFieldName(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 289
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    return-void
.end method

.method public writeNull()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 409
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNull()V

    return-void
.end method

.method public writeNumber(D)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 384
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(D)V

    return-void
.end method

.method public writeNumber(F)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 389
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(F)V

    return-void
.end method

.method public writeNumber(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 369
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(I)V

    return-void
.end method

.method public writeNumber(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 374
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(J)V

    return-void
.end method

.method public writeNumber(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 399
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(Ljava/lang/String;)V

    return-void
.end method

.method public writeNumber(Ljava/math/BigDecimal;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 394
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(Ljava/math/BigDecimal;)V

    return-void
.end method

.method public writeNumber(Ljava/math/BigInteger;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 379
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumber(Ljava/math/BigInteger;)V

    return-void
.end method

.method public writeObject(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, p1, v0}, Lio/sentry/marshaller/json/SentryJsonGenerator;->writeObject(Ljava/lang/Object;I)V

    return-void
.end method

.method public writeRaw(C)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 339
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRaw(C)V

    return-void
.end method

.method public writeRaw(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 324
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRaw(Ljava/lang/String;)V

    return-void
.end method

.method public writeRaw(Ljava/lang/String;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 329
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRaw(Ljava/lang/String;II)V

    return-void
.end method

.method public writeRaw([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 334
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRaw([CII)V

    return-void
.end method

.method public writeRawUTF8String([BII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 314
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRawUTF8String([BII)V

    return-void
.end method

.method public writeRawValue(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 344
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRawValue(Ljava/lang/String;)V

    return-void
.end method

.method public writeRawValue(Ljava/lang/String;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 349
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRawValue(Ljava/lang/String;II)V

    return-void
.end method

.method public writeRawValue([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 354
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeRawValue([CII)V

    return-void
.end method

.method public writeStartArray()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 269
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    return-void
.end method

.method public writeStartObject()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 279
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    return-void
.end method

.method public writeString(Lcom/fasterxml/jackson/core/SerializableString;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 309
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Lcom/fasterxml/jackson/core/SerializableString;)V

    return-void
.end method

.method public writeString(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 299
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method public writeString([CII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 304
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString([CII)V

    return-void
.end method

.method public writeTree(Lcom/fasterxml/jackson/core/TreeNode;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 414
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeTree(Lcom/fasterxml/jackson/core/TreeNode;)V

    return-void
.end method

.method public writeUTF8String([BII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 319
    iget-object v0, p0, Lio/sentry/marshaller/json/SentryJsonGenerator;->generator:Lcom/fasterxml/jackson/core/JsonGenerator;

    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeUTF8String([BII)V

    return-void
.end method
