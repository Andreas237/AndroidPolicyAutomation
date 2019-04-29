.class public Lio/sentry/marshaller/json/MessageInterfaceBinding;
.super Ljava/lang/Object;
.source "MessageInterfaceBinding.java"

# interfaces
.implements Lio/sentry/marshaller/json/InterfaceBinding;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/marshaller/json/InterfaceBinding<",
        "Lio/sentry/event/interfaces/MessageInterface;",
        ">;"
    }
.end annotation


# static fields
.field public static final DEFAULT_MAX_MESSAGE_LENGTH:I = 0x3e8

.field private static final FORMATTED_PARAMETER:Ljava/lang/String; = "formatted"

.field private static final MESSAGE_PARAMETER:Ljava/lang/String; = "message"

.field private static final PARAMS_PARAMETER:Ljava/lang/String; = "params"


# instance fields
.field private final maxMessageLength:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3e8

    .line 30
    iput v0, p0, Lio/sentry/marshaller/json/MessageInterfaceBinding;->maxMessageLength:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput p1, p0, Lio/sentry/marshaller/json/MessageInterfaceBinding;->maxMessageLength:I

    return-void
.end method


# virtual methods
.method public writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/MessageInterface;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 44
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    const-string v0, "message"

    .line 45
    invoke-virtual {p2}, Lio/sentry/event/interfaces/MessageInterface;->getMessage()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lio/sentry/marshaller/json/MessageInterfaceBinding;->maxMessageLength:I

    invoke-static {v1, v2}, Lio/sentry/util/Util;->trimString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "params"

    .line 46
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 47
    invoke-virtual {p2}, Lio/sentry/event/interfaces/MessageInterface;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 48
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    .line 51
    invoke-virtual {p2}, Lio/sentry/event/interfaces/MessageInterface;->getFormatted()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v0, "formatted"

    .line 52
    invoke-virtual {p2}, Lio/sentry/event/interfaces/MessageInterface;->getFormatted()Ljava/lang/String;

    move-result-object p2

    iget v1, p0, Lio/sentry/marshaller/json/MessageInterfaceBinding;->maxMessageLength:I

    invoke-static {p2, v1}, Lio/sentry/util/Util;->trimString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    :cond_1
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

    .line 12
    check-cast p2, Lio/sentry/event/interfaces/MessageInterface;

    invoke-virtual {p0, p1, p2}, Lio/sentry/marshaller/json/MessageInterfaceBinding;->writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/MessageInterface;)V

    return-void
.end method
