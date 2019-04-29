.class public Lio/sentry/SentryClient;
.super Ljava/lang/Object;
.source "SentryClient.java"


# static fields
.field private static final lockdownLogger:Lorg/slf4j/Logger;

.field private static final logger:Lorg/slf4j/Logger;


# instance fields
.field private final builderHelpers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/event/helper/EventBuilderHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final connection:Lio/sentry/connection/Connection;

.field private final contextManager:Lio/sentry/context/ContextManager;

.field protected dist:Ljava/lang/String;

.field protected environment:Ljava/lang/String;

.field protected extra:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected mdcTags:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected release:Ljava/lang/String;

.field protected serverName:Ljava/lang/String;

.field private final shouldSendEventCallbacks:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/sentry/event/helper/ShouldSendEventCallback;",
            ">;"
        }
    .end annotation
.end field

.field protected tags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private uncaughtExceptionHandler:Lio/sentry/SentryUncaughtExceptionHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 29
    const-class v0, Lio/sentry/SentryClient;

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/Class;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lio/sentry/SentryClient;->logger:Lorg/slf4j/Logger;

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lio/sentry/SentryClient;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".lockdown"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/String;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lio/sentry/SentryClient;->lockdownLogger:Lorg/slf4j/Logger;

    return-void
.end method

.method public constructor <init>(Lio/sentry/connection/Connection;Lio/sentry/context/ContextManager;)V
    .locals 1

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/SentryClient;->tags:Ljava/util/Map;

    .line 66
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/sentry/SentryClient;->mdcTags:Ljava/util/Set;

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/SentryClient;->extra:Ljava/util/Map;

    .line 76
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/sentry/SentryClient;->shouldSendEventCallbacks:Ljava/util/Set;

    .line 84
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/SentryClient;->builderHelpers:Ljava/util/List;

    .line 105
    iput-object p1, p0, Lio/sentry/SentryClient;->connection:Lio/sentry/connection/Connection;

    .line 106
    iput-object p2, p0, Lio/sentry/SentryClient;->contextManager:Lio/sentry/context/ContextManager;

    return-void
.end method


# virtual methods
.method public addBuilderHelper(Lio/sentry/event/helper/EventBuilderHelper;)V
    .locals 2

    .line 222
    sget-object v0, Lio/sentry/SentryClient;->logger:Lorg/slf4j/Logger;

    const-string v1, "Adding \'{}\' to the list of builder helpers."

    invoke-interface {v0, v1, p1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lio/sentry/SentryClient;->builderHelpers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addEventSendCallback(Lio/sentry/connection/EventSendCallback;)V
    .locals 1

    .line 396
    iget-object v0, p0, Lio/sentry/SentryClient;->connection:Lio/sentry/connection/Connection;

    invoke-interface {v0, p1}, Lio/sentry/connection/Connection;->addEventSendCallback(Lio/sentry/connection/EventSendCallback;)V

    return-void
.end method

.method public addExtra(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 374
    iget-object v0, p0, Lio/sentry/SentryClient;->extra:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public addExtraTag(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 355
    invoke-virtual {p0, p1}, Lio/sentry/SentryClient;->addMdcTag(Ljava/lang/String;)V

    return-void
.end method

.method public addMdcTag(Ljava/lang/String;)V
    .locals 1

    .line 364
    iget-object v0, p0, Lio/sentry/SentryClient;->mdcTags:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addShouldSendEventCallback(Lio/sentry/event/helper/ShouldSendEventCallback;)V
    .locals 1

    .line 405
    iget-object v0, p0, Lio/sentry/SentryClient;->shouldSendEventCallbacks:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addTag(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 307
    iget-object v0, p0, Lio/sentry/SentryClient;->tags:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public clearContext()V
    .locals 1

    .line 249
    iget-object v0, p0, Lio/sentry/SentryClient;->contextManager:Lio/sentry/context/ContextManager;

    invoke-interface {v0}, Lio/sentry/context/ContextManager;->clear()V

    return-void
.end method

.method public closeConnection()V
    .locals 3

    .line 234
    iget-object v0, p0, Lio/sentry/SentryClient;->uncaughtExceptionHandler:Lio/sentry/SentryUncaughtExceptionHandler;

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lio/sentry/SentryClient;->uncaughtExceptionHandler:Lio/sentry/SentryUncaughtExceptionHandler;

    invoke-virtual {v0}, Lio/sentry/SentryUncaughtExceptionHandler;->disable()V

    .line 239
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/SentryClient;->connection:Lio/sentry/connection/Connection;

    invoke-interface {v0}, Lio/sentry/connection/Connection;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 241
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Couldn\'t close the Sentry connection"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getBuilderHelpers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/event/helper/EventBuilderHelper;",
            ">;"
        }
    .end annotation

    .line 227
    iget-object v0, p0, Lio/sentry/SentryClient;->builderHelpers:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getContext()Lio/sentry/context/Context;
    .locals 1

    .line 253
    iget-object v0, p0, Lio/sentry/SentryClient;->contextManager:Lio/sentry/context/ContextManager;

    invoke-interface {v0}, Lio/sentry/context/ContextManager;->getContext()Lio/sentry/context/Context;

    move-result-object v0

    return-object v0
.end method

.method public getDist()Ljava/lang/String;
    .locals 1

    .line 261
    iget-object v0, p0, Lio/sentry/SentryClient;->dist:Ljava/lang/String;

    return-object v0
.end method

.method public getEnvironment()Ljava/lang/String;
    .locals 1

    .line 265
    iget-object v0, p0, Lio/sentry/SentryClient;->environment:Ljava/lang/String;

    return-object v0
.end method

.method public getExtra()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 281
    iget-object v0, p0, Lio/sentry/SentryClient;->extra:Ljava/util/Map;

    return-object v0
.end method

.method public getMdcTags()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 277
    iget-object v0, p0, Lio/sentry/SentryClient;->mdcTags:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getRelease()Ljava/lang/String;
    .locals 1

    .line 257
    iget-object v0, p0, Lio/sentry/SentryClient;->release:Ljava/lang/String;

    return-object v0
.end method

.method public getServerName()Ljava/lang/String;
    .locals 1

    .line 269
    iget-object v0, p0, Lio/sentry/SentryClient;->serverName:Ljava/lang/String;

    return-object v0
.end method

.method public getTags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 273
    iget-object v0, p0, Lio/sentry/SentryClient;->tags:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public removeBuilderHelper(Lio/sentry/event/helper/EventBuilderHelper;)V
    .locals 2

    .line 212
    sget-object v0, Lio/sentry/SentryClient;->logger:Lorg/slf4j/Logger;

    const-string v1, "Removing \'{}\' from the list of builder helpers."

    invoke-interface {v0, v1, p1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lio/sentry/SentryClient;->builderHelpers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public runBuilderHelpers(Lio/sentry/event/EventBuilder;)V
    .locals 2

    .line 116
    iget-object v0, p0, Lio/sentry/SentryClient;->builderHelpers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/event/helper/EventBuilderHelper;

    .line 117
    invoke-interface {v1, p1}, Lio/sentry/event/helper/EventBuilderHelper;->helpBuildingEvent(Lio/sentry/event/EventBuilder;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public sendEvent(Lio/sentry/event/Event;)V
    .locals 3

    .line 127
    iget-object v0, p0, Lio/sentry/SentryClient;->shouldSendEventCallbacks:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/event/helper/ShouldSendEventCallback;

    .line 128
    invoke-interface {v1, p1}, Lio/sentry/event/helper/ShouldSendEventCallback;->shouldSend(Lio/sentry/event/Event;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 129
    sget-object p1, Lio/sentry/SentryClient;->logger:Lorg/slf4j/Logger;

    const-string v0, "Not sending Event because of ShouldSendEventCallback: {}"

    invoke-interface {p1, v0, v1}, Lorg/slf4j/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 135
    :cond_1
    :try_start_0
    iget-object v0, p0, Lio/sentry/SentryClient;->connection:Lio/sentry/connection/Connection;

    invoke-interface {v0, p1}, Lio/sentry/connection/Connection;->send(Lio/sentry/event/Event;)V
    :try_end_0
    .catch Lio/sentry/connection/LockedDownException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/connection/TooManyRequestsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    :goto_0
    invoke-virtual {p0}, Lio/sentry/SentryClient;->getContext()Lio/sentry/context/Context;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/event/Event;->getId()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/sentry/context/Context;->setLastEventId(Ljava/util/UUID;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 139
    :try_start_1
    sget-object v1, Lio/sentry/SentryClient;->logger:Lorg/slf4j/Logger;

    const-string v2, "An exception occurred while sending the event to Sentry."

    invoke-interface {v1, v2, v0}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 137
    :catch_1
    sget-object v0, Lio/sentry/SentryClient;->logger:Lorg/slf4j/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Dropping an Event due to lockdown: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    .line 141
    :goto_2
    invoke-virtual {p0}, Lio/sentry/SentryClient;->getContext()Lio/sentry/context/Context;

    move-result-object v1

    invoke-virtual {p1}, Lio/sentry/event/Event;->getId()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/sentry/context/Context;->setLastEventId(Ljava/util/UUID;)V

    throw v0
.end method

.method public sendEvent(Lio/sentry/event/EventBuilder;)V
    .locals 3

    .line 151
    iget-object v0, p0, Lio/sentry/SentryClient;->release:Ljava/lang/String;

    invoke-static {v0}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 152
    iget-object v0, p0, Lio/sentry/SentryClient;->release:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/sentry/event/EventBuilder;->withRelease(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    .line 153
    iget-object v0, p0, Lio/sentry/SentryClient;->dist:Ljava/lang/String;

    invoke-static {v0}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 154
    iget-object v0, p0, Lio/sentry/SentryClient;->dist:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/sentry/event/EventBuilder;->withDist(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    .line 158
    :cond_0
    iget-object v0, p0, Lio/sentry/SentryClient;->environment:Ljava/lang/String;

    invoke-static {v0}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 159
    iget-object v0, p0, Lio/sentry/SentryClient;->environment:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/sentry/event/EventBuilder;->withEnvironment(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    .line 162
    :cond_1
    iget-object v0, p0, Lio/sentry/SentryClient;->serverName:Ljava/lang/String;

    invoke-static {v0}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 163
    iget-object v0, p0, Lio/sentry/SentryClient;->serverName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/sentry/event/EventBuilder;->withServerName(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    .line 166
    :cond_2
    iget-object v0, p0, Lio/sentry/SentryClient;->tags:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 167
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Lio/sentry/event/EventBuilder;->withTag(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    goto :goto_0

    .line 170
    :cond_3
    iget-object v0, p0, Lio/sentry/SentryClient;->extra:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 171
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Lio/sentry/event/EventBuilder;->withExtra(Ljava/lang/String;Ljava/lang/Object;)Lio/sentry/event/EventBuilder;

    goto :goto_1

    .line 174
    :cond_4
    invoke-virtual {p0, p1}, Lio/sentry/SentryClient;->runBuilderHelpers(Lio/sentry/event/EventBuilder;)V

    .line 175
    invoke-virtual {p1}, Lio/sentry/event/EventBuilder;->build()Lio/sentry/event/Event;

    move-result-object p1

    .line 176
    invoke-virtual {p0, p1}, Lio/sentry/SentryClient;->sendEvent(Lio/sentry/event/Event;)V

    return-void
.end method

.method public sendException(Ljava/lang/Throwable;)V
    .locals 2

    .line 200
    new-instance v0, Lio/sentry/event/EventBuilder;

    invoke-direct {v0}, Lio/sentry/event/EventBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/event/EventBuilder;->withMessage(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    move-result-object v0

    sget-object v1, Lio/sentry/event/Event$Level;->ERROR:Lio/sentry/event/Event$Level;

    invoke-virtual {v0, v1}, Lio/sentry/event/EventBuilder;->withLevel(Lio/sentry/event/Event$Level;)Lio/sentry/event/EventBuilder;

    move-result-object v0

    new-instance v1, Lio/sentry/event/interfaces/ExceptionInterface;

    invoke-direct {v1, p1}, Lio/sentry/event/interfaces/ExceptionInterface;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lio/sentry/event/EventBuilder;->withSentryInterface(Lio/sentry/event/interfaces/SentryInterface;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    .line 203
    invoke-virtual {p0, p1}, Lio/sentry/SentryClient;->sendEvent(Lio/sentry/event/EventBuilder;)V

    return-void
.end method

.method public sendMessage(Ljava/lang/String;)V
    .locals 1

    .line 187
    new-instance v0, Lio/sentry/event/EventBuilder;

    invoke-direct {v0}, Lio/sentry/event/EventBuilder;-><init>()V

    invoke-virtual {v0, p1}, Lio/sentry/event/EventBuilder;->withMessage(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    sget-object v0, Lio/sentry/event/Event$Level;->INFO:Lio/sentry/event/Event$Level;

    invoke-virtual {p1, v0}, Lio/sentry/event/EventBuilder;->withLevel(Lio/sentry/event/Event$Level;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    .line 189
    invoke-virtual {p0, p1}, Lio/sentry/SentryClient;->sendEvent(Lio/sentry/event/EventBuilder;)V

    return-void
.end method

.method public setDist(Ljava/lang/String;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lio/sentry/SentryClient;->dist:Ljava/lang/String;

    return-void
.end method

.method public setEnvironment(Ljava/lang/String;)V
    .locals 0

    .line 293
    iput-object p1, p0, Lio/sentry/SentryClient;->environment:Ljava/lang/String;

    return-void
.end method

.method public setExtra(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 384
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lio/sentry/SentryClient;->extra:Ljava/util/Map;

    goto :goto_0

    .line 386
    :cond_0
    iput-object p1, p0, Lio/sentry/SentryClient;->extra:Ljava/util/Map;

    :goto_0
    return-void
.end method

.method public setExtraTags(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 331
    invoke-virtual {p0, p1}, Lio/sentry/SentryClient;->setMdcTags(Ljava/util/Set;)V

    return-void
.end method

.method public setMdcTags(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 341
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lio/sentry/SentryClient;->mdcTags:Ljava/util/Set;

    goto :goto_0

    .line 343
    :cond_0
    iput-object p1, p0, Lio/sentry/SentryClient;->mdcTags:Ljava/util/Set;

    :goto_0
    return-void
.end method

.method public setRelease(Ljava/lang/String;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lio/sentry/SentryClient;->release:Ljava/lang/String;

    return-void
.end method

.method public setServerName(Ljava/lang/String;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lio/sentry/SentryClient;->serverName:Ljava/lang/String;

    return-void
.end method

.method public setTags(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 317
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lio/sentry/SentryClient;->tags:Ljava/util/Map;

    goto :goto_0

    .line 319
    :cond_0
    iput-object p1, p0, Lio/sentry/SentryClient;->tags:Ljava/util/Map;

    :goto_0
    return-void
.end method

.method protected setupUncaughtExceptionHandler()V
    .locals 1

    .line 413
    invoke-static {}, Lio/sentry/SentryUncaughtExceptionHandler;->setup()Lio/sentry/SentryUncaughtExceptionHandler;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/SentryClient;->uncaughtExceptionHandler:Lio/sentry/SentryUncaughtExceptionHandler;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 418
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SentryClient{release=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/SentryClient;->release:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", dist=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/SentryClient;->dist:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", environment=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/SentryClient;->environment:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", serverName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/SentryClient;->serverName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/SentryClient;->tags:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mdcTags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/SentryClient;->mdcTags:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extra="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/SentryClient;->extra:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/SentryClient;->connection:Lio/sentry/connection/Connection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", builderHelpers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/SentryClient;->builderHelpers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contextManager="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/SentryClient;->contextManager:Lio/sentry/context/ContextManager;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uncaughtExceptionHandler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/SentryClient;->uncaughtExceptionHandler:Lio/sentry/SentryUncaughtExceptionHandler;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
