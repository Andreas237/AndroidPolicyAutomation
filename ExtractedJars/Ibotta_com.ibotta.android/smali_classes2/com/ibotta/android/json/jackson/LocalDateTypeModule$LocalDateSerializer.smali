.class Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;
.super Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;
.source "LocalDateTypeModule.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/json/jackson/LocalDateTypeModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LocalDateSerializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/util/Date;",
        ">",
        "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer<",
        "TD;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/json/jackson/LocalDateTypeModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TD;>;)V"
        }
    .end annotation

    .line 75
    iput-object p1, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;->this$0:Lcom/ibotta/android/json/jackson/LocalDateTypeModule;

    .line 76
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 74
    check-cast p1, Ljava/util/Date;

    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;->serialize(Ljava/util/Date;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V

    return-void
.end method

.method public serialize(Ljava/util/Date;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 81
    iget-object p3, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;->this$0:Lcom/ibotta/android/json/jackson/LocalDateTypeModule;

    invoke-static {p3}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->access$000(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;)Ljava/text/DateFormat;

    move-result-object p3

    monitor-enter p3

    if-eqz p1, :cond_0

    .line 83
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/LocalDateTypeModule$LocalDateSerializer;->this$0:Lcom/ibotta/android/json/jackson/LocalDateTypeModule;

    invoke-static {v0}, Lcom/ibotta/android/json/jackson/LocalDateTypeModule;->access$100(Lcom/ibotta/android/json/jackson/LocalDateTypeModule;)Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    .line 84
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNull()V

    .line 88
    :goto_0
    monitor-exit p3

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
