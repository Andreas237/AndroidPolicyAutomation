.class Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;
.super Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;
.source "ConfidentialTypeModule.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ConfidentialDeserializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer<",
        "TO;>;"
    }
.end annotation


# instance fields
.field private final clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TO;>;"
        }
    .end annotation
.end field

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

    .line 117
    iput-object p1, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;->this$0:Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;

    .line 118
    invoke-direct {p0, p2}, Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;-><init>(Ljava/lang/Class;)V

    .line 119
    iput-object p2, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;->clazz:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            ")TO;"
        }
    .end annotation

    .line 124
    sget-object p2, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "Deserializing confidential class: %1$s"

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;->clazz:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {p2, v0, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p2, 0x0

    .line 128
    :try_start_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 130
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;->this$0:Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;

    invoke-static {v0}, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->access$000(Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;->this$0:Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;

    invoke-virtual {v2, p1}, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->decrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;->clazz:Ljava/lang/Class;

    invoke-interface {v0, p1, v2}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object p2, p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 134
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v2, "Failed to decrypt JSON: %1$s"

    new-array v3, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;->clazz:Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-interface {v0, p1, v2, v3}, Lcom/ibotta/android/logging/Logger;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    :try_start_1
    iget-object p1, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;->clazz:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 140
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v2, "Failed to create class instance: %1$s"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;->clazz:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v4

    invoke-interface {v0, p1, v2, v1}, Lcom/ibotta/android/logging/Logger;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-object p2
.end method
