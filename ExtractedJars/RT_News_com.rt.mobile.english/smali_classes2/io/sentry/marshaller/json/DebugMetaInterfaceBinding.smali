.class public Lio/sentry/marshaller/json/DebugMetaInterfaceBinding;
.super Ljava/lang/Object;
.source "DebugMetaInterfaceBinding.java"

# interfaces
.implements Lio/sentry/marshaller/json/InterfaceBinding;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/sentry/marshaller/json/InterfaceBinding<",
        "Lio/sentry/event/interfaces/DebugMetaInterface;",
        ">;"
    }
.end annotation


# static fields
.field private static final IMAGES:Ljava/lang/String; = "images"

.field private static final TYPE:Ljava/lang/String; = "type"

.field private static final UUID:Ljava/lang/String; = "uuid"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private writeDebugImages(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/DebugMetaInterface;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "images"

    .line 24
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeArrayFieldStart(Ljava/lang/String;)V

    .line 25
    invoke-virtual {p2}, Lio/sentry/event/interfaces/DebugMetaInterface;->getDebugImages()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/event/interfaces/DebugMetaInterface$DebugImage;

    .line 26
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    const-string v1, "uuid"

    .line 27
    invoke-virtual {v0}, Lio/sentry/event/interfaces/DebugMetaInterface$DebugImage;->getUuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "type"

    .line 28
    invoke-virtual {v0}, Lio/sentry/event/interfaces/DebugMetaInterface$DebugImage;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStringField(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndObject()V

    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeEndArray()V

    return-void
.end method


# virtual methods
.method public writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/DebugMetaInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 18
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeStartObject()V

    .line 19
    invoke-direct {p0, p1, p2}, Lio/sentry/marshaller/json/DebugMetaInterfaceBinding;->writeDebugImages(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/DebugMetaInterface;)V

    .line 20
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

    .line 11
    check-cast p2, Lio/sentry/event/interfaces/DebugMetaInterface;

    invoke-virtual {p0, p1, p2}, Lio/sentry/marshaller/json/DebugMetaInterfaceBinding;->writeInterface(Lcom/fasterxml/jackson/core/JsonGenerator;Lio/sentry/event/interfaces/DebugMetaInterface;)V

    return-void
.end method
