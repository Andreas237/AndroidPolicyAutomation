.class public Lio/sentry/marshaller/json/HttpInterfaceBinding;
.super Ljava/lang/Object;
.source "HttpInterfaceBinding.java"

# interfaces
.implements Lio/sentry/marshaller/json/InterfaceBinding;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/marshaller/json/InterfaceBinding<",
        "Lio/sentry/event/interfaces/HttpInterface;",
        ">;"
    }
.end annotation


# static fields
.field private static final BODY:Ljava/lang/String; = "body"

.field private static final COOKIES:Ljava/lang/String; = "cookies"

.field private static final DATA:Ljava/lang/String; = "data"

.field private static final ENVIRONMENT:Ljava/lang/String; = "env"

.field private static final ENV_AUTH_TYPE:Ljava/lang/String; = "AUTH_TYPE"

.field private static final ENV_LOCAL_ADDR:Ljava/lang/String; = "LOCAL_ADDR"

.field private static final ENV_LOCAL_NAME:Ljava/lang/String; = "LOCAL_NAME"

.field private static final ENV_LOCAL_PORT:Ljava/lang/String; = "LOCAL_PORT"

.field private static final ENV_REMOTE_ADDR:Ljava/lang/String; = "REMOTE_ADDR"

.field private static final ENV_REMOTE_USER:Ljava/lang/String; = "REMOTE_USER"

.field private static final ENV_REQUEST_ASYNC:Ljava/lang/String; = "REQUEST_ASYNC"

.field private static final ENV_REQUEST_SECURE:Ljava/lang/String; = "REQUEST_SECURE"

.field private static final ENV_SERVER_NAME:Ljava/lang/String; = "SERVER_NAME"

.field private static final ENV_SERVER_PORT:Ljava/lang/String; = "SERVER_PORT"

.field private static final ENV_SERVER_PROTOCOL:Ljava/lang/String; = "SERVER_PROTOCOL"

.field private static final HEADERS:Ljava/lang/String; = "headers"

.field public static final MAX_BODY_LENGTH:I = 0x800

.field private static final METHOD:Ljava/lang/String; = "method"

.field private static final QUERY_STRING:Ljava/lang/String; = "query_string"

.field private static final URL:Ljava/lang/String; = "url"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private writeCookies(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V
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

    .line 92
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNull()V

    return-void

    .line 97
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 98
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

    .line 99
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 101
    :cond_1
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method

.method private writeData(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    .line 108
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNull()V

    return-void

    .line 112
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    if-eqz p3, :cond_1

    const-string v0, "body"

    const/16 v1, 0x800

    .line 114
    invoke-static {p3, v1}, Lio/sentry/util/Util;->trimString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, v0, p3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-eqz p2, :cond_3

    .line 117
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 118
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 119
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 120
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    goto :goto_1

    .line 122
    :cond_2
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    goto :goto_0

    .line 125
    :cond_3
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method

.method private writeEnvironment(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/HttpInterface;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 61
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    const-string v0, "REMOTE_ADDR"

    .line 62
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getRemoteAddr()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "SERVER_NAME"

    .line 63
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getServerName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "SERVER_PORT"

    .line 64
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getServerPort()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumberField(Ljava/lang/String;I)V

    const-string v0, "LOCAL_ADDR"

    .line 65
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getLocalAddr()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "LOCAL_NAME"

    .line 66
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getLocalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "LOCAL_PORT"

    .line 67
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getLocalPort()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNumberField(Ljava/lang/String;I)V

    const-string v0, "SERVER_PROTOCOL"

    .line 68
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "REQUEST_SECURE"

    .line 69
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->isSecure()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeBooleanField(Ljava/lang/String;Z)V

    const-string v0, "REQUEST_ASYNC"

    .line 70
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->isAsyncStarted()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeBooleanField(Ljava/lang/String;Z)V

    const-string v0, "AUTH_TYPE"

    .line 71
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getAuthType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "REMOTE_USER"

    .line 73
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getRemoteUser()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method

.method private writeHeaders(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 78
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 79
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 80
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 81
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 82
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    .line 84
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    return-void
.end method


# virtual methods
.method public writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/HttpInterface;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 45
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    const-string v0, "url"

    .line 46
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getRequestUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "method"

    .line 47
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getMethod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "data"

    .line 48
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getParameters()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getBody()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lio/sentry/marshaller/json/HttpInterfaceBinding;->writeData(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;Ljava/lang/String;)V

    const-string v0, "query_string"

    .line 50
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getQueryString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "cookies"

    .line 51
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getCookies()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/sentry/marshaller/json/HttpInterfaceBinding;->writeCookies(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V

    const-string v0, "headers"

    .line 53
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p2}, Lio/sentry/event/interfaces/HttpInterface;->getHeaders()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/sentry/marshaller/json/HttpInterfaceBinding;->writeHeaders(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/util/Map;)V

    const-string v0, "env"

    .line 55
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 56
    invoke-direct {p0, p1, p2}, Lio/sentry/marshaller/json/HttpInterfaceBinding;->writeEnvironment(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/HttpInterface;)V

    .line 57
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method

.method public bridge synthetic writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/SentryInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14
    check-cast p2, Lio/sentry/event/interfaces/HttpInterface;

    invoke-virtual {p0, p1, p2}, Lio/sentry/marshaller/json/HttpInterfaceBinding;->writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/HttpInterface;)V

    return-void
.end method
