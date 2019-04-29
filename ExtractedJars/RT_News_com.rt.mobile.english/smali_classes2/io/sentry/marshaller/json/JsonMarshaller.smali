.class public Lio/sentry/marshaller/json/JsonMarshaller;
.super Ljava/lang/Object;
.source "JsonMarshaller.java"

# interfaces
.implements Lio/sentry/marshaller/Marshaller;


# static fields
.field public static final BREADCRUMBS:Ljava/lang/String; = "breadcrumbs"

.field public static final CHECKSUM:Ljava/lang/String; = "checksum"

.field public static final CONTEXTS:Ljava/lang/String; = "contexts"

.field public static final CULPRIT:Ljava/lang/String; = "culprit"

.field public static final DEFAULT_MAX_MESSAGE_LENGTH:I = 0x3e8

.field public static final DIST:Ljava/lang/String; = "dist"

.field public static final ENVIRONMENT:Ljava/lang/String; = "environment"

.field public static final EVENT_ID:Ljava/lang/String; = "event_id"

.field public static final EXTRA:Ljava/lang/String; = "extra"

.field public static final FINGERPRINT:Ljava/lang/String; = "fingerprint"

.field private static final ISO_FORMAT:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/DateFormat;",
            ">;"
        }
    .end annotation
.end field

.field public static final LEVEL:Ljava/lang/String; = "level"

.field public static final LOGGER:Ljava/lang/String; = "logger"

.field public static final MESSAGE:Ljava/lang/String; = "message"

.field public static final MODULES:Ljava/lang/String; = "modules"

.field public static final PLATFORM:Ljava/lang/String; = "platform"

.field public static final RELEASE:Ljava/lang/String; = "release"

.field public static final SDK:Ljava/lang/String; = "sdk"

.field public static final SERVER_NAME:Ljava/lang/String; = "server_name"

.field public static final TAGS:Ljava/lang/String; = "tags"

.field public static final TIMESTAMP:Ljava/lang/String; = "timestamp"

.field public static final TRANSACTION:Ljava/lang/String; = "transaction"

.field private static final logger:Lorg/slf4j/Logger;


# instance fields
.field private compression:Z

.field private final interfaceBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/sentry/event/interfaces/SentryInterface;",
            ">;",
            "Lio/sentry/marshaller/json/InterfaceBinding<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final jsonFactory:Lcom/fasterxml/jackson/core/JsonFactory;

.field private final maxMessageLength:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 114
    new-instance v0, Lio/sentry/marshaller/json/JsonMarshaller$1;

    invoke-direct {v0}, Lio/sentry/marshaller/json/JsonMarshaller$1;-><init>()V

    sput-object v0, Lio/sentry/marshaller/json/JsonMarshaller;->ISO_FORMAT:Ljava/lang/ThreadLocal;

    .line 123
    const-class v0, Lio/sentry/marshaller/json/JsonMarshaller;

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/Class;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lio/sentry/marshaller/json/JsonMarshaller;->logger:Lorg/slf4j/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x3e8

    .line 139
    invoke-direct {p0, v0}, Lio/sentry/marshaller/json/JsonMarshaller;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    new-instance v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>()V

    iput-object v0, p0, Lio/sentry/marshaller/json/JsonMarshaller;->jsonFactory:Lcom/fasterxml/jackson/core/JsonFactory;

    .line 125
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/marshaller/json/JsonMarshaller;->interfaceBindings:Ljava/util/Map;

    const/4 v0, 0x1

    .line 129
    iput-boolean v0, p0, Lio/sentry/marshaller/json/JsonMarshaller;->compression:Z

    .line 148
    iput p1, p0, Lio/sentry/marshaller/json/JsonMarshaller;->maxMessageLength:I

    return-void
.end method

.method private formatId(Ljava/util/UUID;)Ljava/lang/String;
    .locals 2

    .line 349
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "-"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private formatLevel(Lio/sentry/event/Event$Level;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 363
    :cond_0
    sget-object v1, Lio/sentry/marshaller/json/JsonMarshaller$2;->$SwitchMap$io$sentry$event$Event$Level:[I

    invoke-virtual {p1}, Lio/sentry/event/Event$Level;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 375
    sget-object v1, Lio/sentry/marshaller/json/JsonMarshaller;->logger:Lorg/slf4j/Logger;

    const-string v2, "The level \'{}\' isn\'t supported, this should NEVER happen, contact Sentry developers"

    invoke-virtual {p1}, Lio/sentry/event/Event$Level;->name()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0

    :pswitch_0
    const-string p1, "error"

    return-object p1

    :pswitch_1
    const-string p1, "info"

    return-object p1

    :pswitch_2
    const-string p1, "warning"

    return-object p1

    :pswitch_3
    const-string p1, "fatal"

    return-object p1

    :pswitch_4
    const-string p1, "debug"

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private getInterfaceBinding(Lio/sentry/event/interfaces/SentryInterface;)Lio/sentry/marshaller/json/InterfaceBinding;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lio/sentry/event/interfaces/SentryInterface;",
            ">(TT;)",
            "Lio/sentry/marshaller/json/InterfaceBinding<",
            "-TT;>;"
        }
    .end annotation

    .line 244
    iget-object v0, p0, Lio/sentry/marshaller/json/JsonMarshaller;->interfaceBindings:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/marshaller/json/InterfaceBinding;

    return-object p1
.end method

.method private writeBreadcumbs(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Ljava/util/List<",
            "Lio/sentry/event/Breadcrumb;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 290
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "breadcrumbs"

    .line 294
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    const-string v0, "values"

    .line 295
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 296
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/event/Breadcrumb;

    .line 297
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    const-string v1, "timestamp"

    .line 299
    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getTimestamp()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {p1, v1, v2, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumberField(Ljava/lang/String;J)V

    .line 301
    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getType()Lio/sentry/event/Breadcrumb$Type;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, "type"

    .line 302
    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getType()Lio/sentry/event/Breadcrumb$Type;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/event/Breadcrumb$Type;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    :cond_1
    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getLevel()Lio/sentry/event/Breadcrumb$Level;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v1, "level"

    .line 305
    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getLevel()Lio/sentry/event/Breadcrumb$Level;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/event/Breadcrumb$Level;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    :cond_2
    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v1, "message"

    .line 308
    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    :cond_3
    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getCategory()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v1, "category"

    .line 311
    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getCategory()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    :cond_4
    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getData()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getData()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "data"

    .line 314
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    .line 315
    invoke-virtual {v0}, Lio/sentry/event/Breadcrumb;->getData()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 316
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 318
    :cond_5
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    .line 320
    :cond_6
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    goto/16 :goto_0

    .line 322
    :cond_7
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 323
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method

.method private writeCollection(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/lang/String;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p3, :cond_1

    .line 257
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 258
    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 259
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    .line 260
    invoke-virtual {p1, p3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 262
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    :cond_1
    return-void
.end method

.method private writeContent(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/Event;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 200
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    const-string v0, "event_id"

    .line 202
    invoke-virtual {p2}, Lio/sentry/event/Event;->getId()Ljava/util/UUID;

    move-result-object v1

    invoke-direct {p0, v1}, Lio/sentry/marshaller/json/JsonMarshaller;->formatId(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "message"

    .line 203
    invoke-virtual {p2}, Lio/sentry/event/Event;->getMessage()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lio/sentry/marshaller/json/JsonMarshaller;->maxMessageLength:I

    invoke-static {v1, v2}, Lio/sentry/util/Util;->trimString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "timestamp"

    .line 204
    sget-object v1, Lio/sentry/marshaller/json/JsonMarshaller;->ISO_FORMAT:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/text/DateFormat;

    invoke-virtual {p2}, Lio/sentry/event/Event;->getTimestamp()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "level"

    .line 205
    invoke-virtual {p2}, Lio/sentry/event/Event;->getLevel()Lio/sentry/event/Event$Level;

    move-result-object v1

    invoke-direct {p0, v1}, Lio/sentry/marshaller/json/JsonMarshaller;->formatLevel(Lio/sentry/event/Event$Level;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "logger"

    .line 206
    invoke-virtual {p2}, Lio/sentry/event/Event;->getLogger()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "platform"

    .line 207
    invoke-virtual {p2}, Lio/sentry/event/Event;->getPlatform()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "culprit"

    .line 208
    invoke-virtual {p2}, Lio/sentry/event/Event;->getCulprit()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "transaction"

    .line 209
    invoke-virtual {p2}, Lio/sentry/event/Event;->getTransaction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    invoke-virtual {p2}, Lio/sentry/event/Event;->getSdk()Lio/sentry/event/Sdk;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/sentry/marshaller/json/JsonMarshaller;->writeSdk(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/Sdk;)V

    .line 211
    invoke-virtual {p2}, Lio/sentry/event/Event;->getTags()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/sentry/marshaller/json/JsonMarshaller;->writeTags(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V

    .line 212
    invoke-virtual {p2}, Lio/sentry/event/Event;->getBreadcrumbs()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/sentry/marshaller/json/JsonMarshaller;->writeBreadcumbs(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/List;)V

    .line 213
    invoke-virtual {p2}, Lio/sentry/event/Event;->getContexts()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/sentry/marshaller/json/JsonMarshaller;->writeContexts(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V

    const-string v0, "server_name"

    .line 214
    invoke-virtual {p2}, Lio/sentry/event/Event;->getServerName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "release"

    .line 215
    invoke-virtual {p2}, Lio/sentry/event/Event;->getRelease()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dist"

    .line 216
    invoke-virtual {p2}, Lio/sentry/event/Event;->getDist()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "environment"

    .line 217
    invoke-virtual {p2}, Lio/sentry/event/Event;->getEnvironment()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    invoke-virtual {p2}, Lio/sentry/event/Event;->getExtra()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/sentry/marshaller/json/JsonMarshaller;->writeExtras(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V

    const-string v0, "fingerprint"

    .line 219
    invoke-virtual {p2}, Lio/sentry/event/Event;->getFingerprint()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lio/sentry/marshaller/json/JsonMarshaller;->writeCollection(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/lang/String;Ljava/util/Collection;)V

    const-string v0, "checksum"

    .line 220
    invoke-virtual {p2}, Lio/sentry/event/Event;->getChecksum()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    invoke-virtual {p2}, Lio/sentry/event/Event;->getSentryInterfaces()Ljava/util/Map;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lio/sentry/marshaller/json/JsonMarshaller;->writeInterfaces(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V

    .line 223
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method

.method private writeContexts(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 327
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "contexts"

    .line 331
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    .line 332
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 333
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    .line 334
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 335
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectField(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 337
    :cond_1
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    goto :goto_0

    .line 339
    :cond_2
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method

.method private writeExtras(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "extra"

    .line 248
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    .line 249
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 250
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 251
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObject(Ljava/lang/Object;)V

    goto :goto_0

    .line 253
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method

.method private writeInterfaces(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/sentry/event/interfaces/SentryInterface;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 228
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

    .line 229
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/event/interfaces/SentryInterface;

    .line 231
    iget-object v2, p0, Lio/sentry/marshaller/json/JsonMarshaller;->interfaceBindings:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 232
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 233
    invoke-direct {p0, v1}, Lio/sentry/marshaller/json/JsonMarshaller;->getInterfaceBinding(Lio/sentry/event/interfaces/SentryInterface;)Lio/sentry/marshaller/json/InterfaceBinding;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/event/interfaces/SentryInterface;

    invoke-interface {v1, p1, v0}, Lio/sentry/marshaller/json/InterfaceBinding;->writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/SentryInterface;)V

    goto :goto_0

    .line 235
    :cond_0
    sget-object v2, Lio/sentry/marshaller/json/JsonMarshaller;->logger:Lorg/slf4j/Logger;

    const-string v3, "Couldn\'t parse the content of \'{}\' provided in {}."

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v3, v0, v1}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private writeSdk(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/Sdk;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sdk"

    .line 267
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    const-string v0, "name"

    .line 268
    invoke-virtual {p2}, Lio/sentry/event/Sdk;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "version"

    .line 269
    invoke-virtual {p2}, Lio/sentry/event/Sdk;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    invoke-virtual {p2}, Lio/sentry/event/Sdk;->getIntegrations()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lio/sentry/event/Sdk;->getIntegrations()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "integrations"

    .line 271
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 272
    invoke-virtual {p2}, Lio/sentry/event/Sdk;->getIntegrations()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 273
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 275
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 277
    :cond_1
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method

.method private writeTags(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "tags"

    .line 281
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeObjectFieldStart(Ljava/lang/String;)V

    .line 282
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 283
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 285
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method


# virtual methods
.method public addInterfaceBinding(Ljava/lang/Class;Lio/sentry/marshaller/json/InterfaceBinding;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lio/sentry/event/interfaces/SentryInterface;",
            "F:TT;>(",
            "Ljava/lang/Class<",
            "TF;>;",
            "Lio/sentry/marshaller/json/InterfaceBinding<",
            "TT;>;)V"
        }
    .end annotation

    .line 391
    iget-object v0, p0, Lio/sentry/marshaller/json/JsonMarshaller;->interfaceBindings:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected createJsonGenerator(Ljava/io/OutputStream;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 183
    new-instance v0, Lio/sentry/marshaller/json/SentryJsonGenerator;

    iget-object v1, p0, Lio/sentry/marshaller/json/JsonMarshaller;->jsonFactory:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {v1, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->createGenerator(Ljava/io/OutputStream;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/sentry/marshaller/json/SentryJsonGenerator;-><init>(Lcom/fasterxml/jackson/core/JsonGenerator;)V

    return-object v0
.end method

.method public getContentEncoding()Ljava/lang/String;
    .locals 1

    .line 193
    invoke-virtual {p0}, Lio/sentry/marshaller/json/JsonMarshaller;->isCompressed()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "gzip"

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    const-string v0, "application/json"

    return-object v0
.end method

.method public isCompressed()Z
    .locals 1

    .line 404
    iget-boolean v0, p0, Lio/sentry/marshaller/json/JsonMarshaller;->compression:Z

    return v0
.end method

.method public marshall(Lio/sentry/event/Event;Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 154
    new-instance v0, Lio/sentry/marshaller/Marshaller$UncloseableOutputStream;

    invoke-direct {v0, p2}, Lio/sentry/marshaller/Marshaller$UncloseableOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 156
    iget-boolean p2, p0, Lio/sentry/marshaller/json/JsonMarshaller;->compression:Z

    if-eqz p2, :cond_0

    .line 157
    new-instance p2, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {p2, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    goto :goto_0

    :cond_0
    move-object p2, v0

    .line 160
    :goto_0
    :try_start_0
    invoke-virtual {p0, p2}, Lio/sentry/marshaller/json/JsonMarshaller;->createJsonGenerator(Ljava/io/OutputStream;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    .line 161
    :try_start_1
    invoke-direct {p0, v0, p1}, Lio/sentry/marshaller/json/JsonMarshaller;->writeContent(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/Event;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    .line 162
    :try_start_2
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 166
    :cond_1
    :try_start_3
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    .line 168
    sget-object p2, Lio/sentry/marshaller/json/JsonMarshaller;->logger:Lorg/slf4j/Logger;

    const-string v0, "An exception occurred while serialising the event."

    invoke-interface {p2, v0, p1}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 160
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    if-eqz v0, :cond_3

    if-eqz v1, :cond_2

    .line 162
    :try_start_5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->close()V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catch_2
    move-exception v0

    :try_start_6
    invoke-static {v1, v0}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->close()V

    :cond_3
    :goto_2
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :catch_3
    move-exception p1

    .line 163
    :try_start_7
    sget-object v0, Lio/sentry/marshaller/json/JsonMarshaller;->logger:Lorg/slf4j/Logger;

    const-string v1, "An exception occurred while serialising the event."

    invoke-interface {v0, v1, p1}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 166
    :try_start_8
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    :goto_3
    return-void

    :goto_4
    :try_start_9
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    goto :goto_5

    :catch_4
    move-exception p2

    .line 168
    sget-object v0, Lio/sentry/marshaller/json/JsonMarshaller;->logger:Lorg/slf4j/Logger;

    const-string v1, "An exception occurred while serialising the event."

    invoke-interface {v0, v1, p2}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 169
    :goto_5
    throw p1
.end method

.method public setCompression(Z)V
    .locals 0

    .line 400
    iput-boolean p1, p0, Lio/sentry/marshaller/json/JsonMarshaller;->compression:Z

    return-void
.end method
