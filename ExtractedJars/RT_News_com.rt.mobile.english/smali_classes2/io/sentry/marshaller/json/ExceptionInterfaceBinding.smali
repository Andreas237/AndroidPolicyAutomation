.class public Lio/sentry/marshaller/json/ExceptionInterfaceBinding;
.super Ljava/lang/Object;
.source "ExceptionInterfaceBinding.java"

# interfaces
.implements Lio/sentry/marshaller/json/InterfaceBinding;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/marshaller/json/InterfaceBinding<",
        "Lio/sentry/event/interfaces/ExceptionInterface;",
        ">;"
    }
.end annotation


# static fields
.field private static final MODULE_PARAMETER:Ljava/lang/String; = "module"

.field private static final STACKTRACE_PARAMETER:Ljava/lang/String; = "stacktrace"

.field private static final TYPE_PARAMETER:Ljava/lang/String; = "type"

.field private static final VALUE_PARAMETER:Ljava/lang/String; = "value"


# instance fields
.field private final stackTraceInterfaceBinding:Lio/sentry/marshaller/json/InterfaceBinding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/sentry/marshaller/json/InterfaceBinding<",
            "Lio/sentry/event/interfaces/StackTraceInterface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/sentry/marshaller/json/InterfaceBinding;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/marshaller/json/InterfaceBinding<",
            "Lio/sentry/event/interfaces/StackTraceInterface;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lio/sentry/marshaller/json/ExceptionInterfaceBinding;->stackTraceInterfaceBinding:Lio/sentry/marshaller/json/InterfaceBinding;

    return-void
.end method

.method private writeException(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/SentryException;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 54
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    const-string v0, "type"

    .line 55
    invoke-virtual {p2}, Lio/sentry/event/interfaces/SentryException;->getExceptionClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "value"

    .line 56
    invoke-virtual {p2}, Lio/sentry/event/interfaces/SentryException;->getExceptionMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "module"

    .line 57
    invoke-virtual {p2}, Lio/sentry/event/interfaces/SentryException;->getExceptionPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "stacktrace"

    .line 58
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeFieldName(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lio/sentry/marshaller/json/ExceptionInterfaceBinding;->stackTraceInterfaceBinding:Lio/sentry/marshaller/json/InterfaceBinding;

    invoke-virtual {p2}, Lio/sentry/event/interfaces/SentryException;->getStackTraceInterface()Lio/sentry/event/interfaces/StackTraceInterface;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lio/sentry/marshaller/json/InterfaceBinding;->writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/SentryInterface;)V

    .line 60
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    return-void
.end method


# virtual methods
.method public writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/ExceptionInterface;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 37
    invoke-virtual {p2}, Lio/sentry/event/interfaces/ExceptionInterface;->getExceptions()Ljava/util/Deque;

    move-result-object p2

    .line 39
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartArray()V

    .line 40
    invoke-interface {p2}, Ljava/util/Deque;->descendingIterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/event/interfaces/SentryException;

    invoke-direct {p0, p1, v0}, Lio/sentry/marshaller/json/ExceptionInterfaceBinding;->writeException(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/SentryException;)V

    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    return-void
.end method

.method public bridge synthetic writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/SentryInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15
    check-cast p2, Lio/sentry/event/interfaces/ExceptionInterface;

    invoke-virtual {p0, p1, p2}, Lio/sentry/marshaller/json/ExceptionInterfaceBinding;->writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/ExceptionInterface;)V

    return-void
.end method
