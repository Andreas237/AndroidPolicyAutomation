.class Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialSerializer;
.super Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;
.source "ConfidentialTypeModule.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ConfidentialSerializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer<",
        "TO;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;


# direct methods
.method constructor <init>(Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TO;>;)V"
        }
    .end annotation

    .line 92
    iput-object p1, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialSerializer;->this$0:Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;

    .line 93
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TO;",
            "Lcom/fasterxml/jackson/core/JsonGenerator;",
            "Lcom/fasterxml/jackson/databind/SerializerProvider;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 98
    sget-object p3, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "Serializing confidential class: %1$s"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-interface {p3, v0, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 102
    :try_start_0
    iget-object p3, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialSerializer;->this$0:Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;

    iget-object v0, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialSerializer;->this$0:Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;

    invoke-static {v0}, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->access$000(Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 103
    invoke-virtual {p2, p1}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNull()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 108
    sget-object p3, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "Failed to serialize Confidential object"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p3, p1, v0, v1}, Lcom/ibotta/android/logging/Logger;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-virtual {p2}, Lcom/fasterxml/jackson/core/JsonGenerator;->writeNull()V

    :goto_0
    return-void
.end method
