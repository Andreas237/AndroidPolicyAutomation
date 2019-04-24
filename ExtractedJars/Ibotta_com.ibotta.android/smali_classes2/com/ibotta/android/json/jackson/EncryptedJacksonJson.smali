.class public Lcom/ibotta/android/json/jackson/EncryptedJacksonJson;
.super Lcom/ibotta/android/json/jackson/JacksonJson;
.source "EncryptedJacksonJson.java"


# direct methods
.method constructor <init>(Lcom/ibotta/android/json/NamingPolicy;ZLjava/lang/String;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/json/NamingPolicy;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/json/jackson/JacksonJson;-><init>(Lcom/ibotta/android/json/NamingPolicy;Z)V

    .line 15
    :try_start_0
    iget-object p1, p0, Lcom/ibotta/android/json/jackson/EncryptedJacksonJson;->objMapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    new-instance p2, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;

    invoke-direct {p2, p3, p4}, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    invoke-virtual {p1, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->registerModule(Lcom/fasterxml/jackson/databind/Module;)Lcom/fasterxml/jackson/databind/ObjectMapper;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    sget-object p2, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string p3, "Failed to register ConfidentialTypeModule."

    const/4 p4, 0x0

    new-array p4, p4, [Ljava/lang/Object;

    invoke-interface {p2, p1, p3, p4}, Lcom/ibotta/android/logging/Logger;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
