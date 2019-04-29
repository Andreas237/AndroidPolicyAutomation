.class public abstract Lio/sentry/connection/AbstractConnection;
.super Ljava/lang/Object;
.source "AbstractConnection.java"

# interfaces
.implements Lio/sentry/connection/Connection;


# static fields
.field public static final SENTRY_PROTOCOL_VERSION:Ljava/lang/String; = "6"

.field private static final lockdownLogger:Lorg/slf4j/Logger;

.field private static final logger:Lorg/slf4j/Logger;


# instance fields
.field private final authHeader:Ljava/lang/String;

.field private eventSendCallbacks:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/sentry/connection/EventSendCallback;",
            ">;"
        }
    .end annotation
.end field

.field private lockdownManager:Lio/sentry/connection/LockdownManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 24
    const-class v0, Lio/sentry/connection/AbstractConnection;

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/Class;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lio/sentry/connection/AbstractConnection;->logger:Lorg/slf4j/Logger;

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lio/sentry/connection/AbstractConnection;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".lockdown"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/String;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lio/sentry/connection/AbstractConnection;->lockdownLogger:Lorg/slf4j/Logger;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lio/sentry/connection/LockdownManager;

    invoke-direct {v0}, Lio/sentry/connection/LockdownManager;-><init>()V

    iput-object v0, p0, Lio/sentry/connection/AbstractConnection;->lockdownManager:Lio/sentry/connection/LockdownManager;

    .line 48
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/sentry/connection/AbstractConnection;->eventSendCallbacks:Ljava/util/Set;

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sentry sentry_version=6,sentry_client="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->getSentryName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "sentry_key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ",sentry_secret="

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/connection/AbstractConnection;->authHeader:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public addEventSendCallback(Lio/sentry/connection/EventSendCallback;)V
    .locals 1

    .line 123
    iget-object v0, p0, Lio/sentry/connection/AbstractConnection;->eventSendCallbacks:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected abstract doSend(Lio/sentry/event/Event;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/sentry/connection/ConnectionException;
        }
    .end annotation
.end method

.method protected getAuthHeader()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lio/sentry/connection/AbstractConnection;->authHeader:Ljava/lang/String;

    return-object v0
.end method

.method public final send(Lio/sentry/event/Event;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/sentry/connection/ConnectionException;
        }
    .end annotation

    .line 67
    :try_start_0
    iget-object v0, p0, Lio/sentry/connection/AbstractConnection;->lockdownManager:Lio/sentry/connection/LockdownManager;

    invoke-virtual {v0}, Lio/sentry/connection/LockdownManager;->isLockedDown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    new-instance v0, Lio/sentry/connection/LockedDownException;

    invoke-direct {v0}, Lio/sentry/connection/LockedDownException;-><init>()V

    throw v0

    .line 76
    :cond_0
    invoke-virtual {p0, p1}, Lio/sentry/connection/AbstractConnection;->doSend(Lio/sentry/event/Event;)V

    .line 79
    iget-object v0, p0, Lio/sentry/connection/AbstractConnection;->lockdownManager:Lio/sentry/connection/LockdownManager;

    invoke-virtual {v0}, Lio/sentry/connection/LockdownManager;->unlock()V

    .line 81
    iget-object v0, p0, Lio/sentry/connection/AbstractConnection;->eventSendCallbacks:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/connection/EventSendCallback;
    :try_end_0
    .catch Lio/sentry/connection/ConnectionException; {:try_start_0 .. :try_end_0} :catch_1

    .line 83
    :try_start_1
    invoke-interface {v1, p1}, Lio/sentry/connection/EventSendCallback;->onSuccess(Lio/sentry/event/Event;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lio/sentry/connection/ConnectionException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v2

    .line 85
    :try_start_2
    sget-object v3, Lio/sentry/connection/AbstractConnection;->logger:Lorg/slf4j/Logger;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "An exception occurred while running an EventSendCallback.onSuccess: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1, v2}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Lio/sentry/connection/ConnectionException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :cond_1
    return-void

    :catch_1
    move-exception v0

    .line 90
    iget-object v1, p0, Lio/sentry/connection/AbstractConnection;->eventSendCallbacks:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/connection/EventSendCallback;

    .line 92
    :try_start_3
    invoke-interface {v2, p1, v0}, Lio/sentry/connection/EventSendCallback;->onFailure(Lio/sentry/event/Event;Ljava/lang/Exception;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_2
    move-exception v3

    .line 94
    sget-object v4, Lio/sentry/connection/AbstractConnection;->logger:Lorg/slf4j/Logger;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "An exception occurred while running an EventSendCallback.onFailure: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v2, v3}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 99
    :cond_2
    iget-object p1, p0, Lio/sentry/connection/AbstractConnection;->lockdownManager:Lio/sentry/connection/LockdownManager;

    invoke-virtual {p1, v0}, Lio/sentry/connection/LockdownManager;->lockdown(Lio/sentry/connection/ConnectionException;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 101
    sget-object p1, Lio/sentry/connection/AbstractConnection;->lockdownLogger:Lorg/slf4j/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Initiated a temporary lockdown because of exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lio/sentry/connection/ConnectionException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lorg/slf4j/Logger;->warn(Ljava/lang/String;)V

    .line 104
    :cond_3
    throw v0
.end method
