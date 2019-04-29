.class public Lio/sentry/event/EventBuilder;
.super Ljava/lang/Object;
.source "EventBuilder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/event/EventBuilder$HostnameCache;
    }
.end annotation


# static fields
.field public static final DEFAULT_HOSTNAME:Ljava/lang/String; = "unavailable"

.field public static final DEFAULT_PLATFORM:Ljava/lang/String; = "java"

.field private static final HOSTNAME_CACHE:Lio/sentry/event/EventBuilder$HostnameCache;

.field public static final HOSTNAME_CACHE_DURATION:J

.field private static final UTF_8:Ljava/nio/charset/Charset;


# instance fields
.field private alreadyBuilt:Z

.field private final event:Lio/sentry/event/Event;

.field private sdkIntegrations:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 36
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lio/sentry/event/EventBuilder;->HOSTNAME_CACHE_DURATION:J

    const-string v0, "UTF-8"

    .line 37
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lio/sentry/event/EventBuilder;->UTF_8:Ljava/nio/charset/Charset;

    .line 38
    new-instance v0, Lio/sentry/event/EventBuilder$HostnameCache;

    sget-wide v1, Lio/sentry/event/EventBuilder;->HOSTNAME_CACHE_DURATION:J

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/event/EventBuilder$HostnameCache;-><init>(JLio/sentry/event/EventBuilder$1;)V

    sput-object v0, Lio/sentry/event/EventBuilder;->HOSTNAME_CACHE:Lio/sentry/event/EventBuilder$HostnameCache;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/sentry/event/EventBuilder;-><init>(Ljava/util/UUID;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;)V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput-boolean v0, p0, Lio/sentry/event/EventBuilder;->alreadyBuilt:Z

    .line 41
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/sentry/event/EventBuilder;->sdkIntegrations:Ljava/util/Set;

    .line 58
    new-instance v0, Lio/sentry/event/Event;

    invoke-direct {v0, p1}, Lio/sentry/event/Event;-><init>(Ljava/util/UUID;)V

    iput-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    return-void
.end method

.method private autoSetMissingValues()V
    .locals 5

    .line 79
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0}, Lio/sentry/event/Event;->getTimestamp()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_0

    .line 80
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Lio/sentry/event/Event;->setTimestamp(Ljava/util/Date;)V

    .line 84
    :cond_0
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0}, Lio/sentry/event/Event;->getPlatform()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 85
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    const-string v1, "java"

    invoke-virtual {v0, v1}, Lio/sentry/event/Event;->setPlatform(Ljava/lang/String;)V

    .line 89
    :cond_1
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0}, Lio/sentry/event/Event;->getSdk()Lio/sentry/event/Sdk;

    move-result-object v0

    if-nez v0, :cond_2

    .line 90
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    new-instance v1, Lio/sentry/event/Sdk;

    const-string v2, "sentry-java"

    const-string v3, "1.7.9-4b3bd"

    iget-object v4, p0, Lio/sentry/event/EventBuilder;->sdkIntegrations:Ljava/util/Set;

    invoke-direct {v1, v2, v3, v4}, Lio/sentry/event/Sdk;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Lio/sentry/event/Event;->setSdk(Lio/sentry/event/Sdk;)V

    .line 95
    :cond_2
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0}, Lio/sentry/event/Event;->getServerName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    .line 96
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    sget-object v1, Lio/sentry/event/EventBuilder;->HOSTNAME_CACHE:Lio/sentry/event/EventBuilder$HostnameCache;

    invoke-virtual {v1}, Lio/sentry/event/EventBuilder$HostnameCache;->getHostname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/event/Event;->setServerName(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private buildCulpritString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_1

    .line 259
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "("

    .line 260
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ltz p4, :cond_0

    const-string p1, ":"

    .line 262
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    const-string p1, ")"

    .line 264
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static calculateChecksum(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 68
    sget-object v0, Lio/sentry/event/EventBuilder;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 69
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    const/4 v1, 0x0

    .line 70
    array-length v2, p0

    invoke-interface {v0, p0, v1, v2}, Ljava/util/zip/Checksum;->update([BII)V

    .line 71
    invoke-interface {v0}, Ljava/util/zip/Checksum;->getValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private makeImmutable()V
    .locals 4

    .line 105
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    iget-object v1, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v1}, Lio/sentry/event/Event;->getTags()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/event/Event;->setTags(Ljava/util/Map;)V

    .line 108
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    iget-object v1, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v1}, Lio/sentry/event/Event;->getBreadcrumbs()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/event/Event;->setBreadcrumbs(Ljava/util/List;)V

    .line 111
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 112
    iget-object v1, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v1}, Lio/sentry/event/Event;->getContexts()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 113
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 115
    :cond_0
    iget-object v1, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/sentry/event/Event;->setContexts(Ljava/util/Map;)V

    .line 118
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    iget-object v1, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v1}, Lio/sentry/event/Event;->getExtra()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/event/Event;->setExtra(Ljava/util/Map;)V

    .line 121
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    iget-object v1, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v1}, Lio/sentry/event/Event;->getSentryInterfaces()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/event/Event;->setSentryInterfaces(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized build()Lio/sentry/event/Event;
    .locals 2

    monitor-enter p0

    .line 439
    :try_start_0
    iget-boolean v0, p0, Lio/sentry/event/EventBuilder;->alreadyBuilt:Z

    if-eqz v0, :cond_0

    .line 440
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "A message can\'t be built twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 443
    :cond_0
    invoke-direct {p0}, Lio/sentry/event/EventBuilder;->autoSetMissingValues()V

    .line 444
    invoke-direct {p0}, Lio/sentry/event/EventBuilder;->makeImmutable()V

    const/4 v0, 0x1

    .line 447
    iput-boolean v0, p0, Lio/sentry/event/EventBuilder;->alreadyBuilt:Z

    .line 448
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 438
    monitor-exit p0

    throw v0
.end method

.method public getEvent()Lio/sentry/event/Event;
    .locals 1

    .line 452
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 457
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EventBuilder{event="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alreadyBuilt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/sentry/event/EventBuilder;->alreadyBuilt:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withBreadcrumbs(Ljava/util/List;)Lio/sentry/event/EventBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/sentry/event/Breadcrumb;",
            ">;)",
            "Lio/sentry/event/EventBuilder;"
        }
    .end annotation

    .line 315
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setBreadcrumbs(Ljava/util/List;)V

    return-object p0
.end method

.method public withChecksum(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 396
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setChecksum(Ljava/lang/String;)V

    return-object p0
.end method

.method public withChecksumFor(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 0

    .line 384
    invoke-static {p1}, Lio/sentry/event/EventBuilder;->calculateChecksum(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/sentry/event/EventBuilder;->withChecksum(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    return-object p1
.end method

.method public withContexts(Ljava/util/Map;)Lio/sentry/event/EventBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)",
            "Lio/sentry/event/EventBuilder;"
        }
    .end annotation

    .line 326
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setContexts(Ljava/util/Map;)V

    return-object p0
.end method

.method public withCulprit(Lio/sentry/event/interfaces/SentryStackTraceElement;)Lio/sentry/event/EventBuilder;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 234
    invoke-virtual {p1}, Lio/sentry/event/interfaces/SentryStackTraceElement;->getModule()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/event/interfaces/SentryStackTraceElement;->getFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/sentry/event/interfaces/SentryStackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/sentry/event/interfaces/SentryStackTraceElement;->getLineno()I

    move-result p1

    invoke-direct {p0, v0, v1, v2, p1}, Lio/sentry/event/EventBuilder;->buildCulpritString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/sentry/event/EventBuilder;->withCulprit(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    return-object p1
.end method

.method public withCulprit(Ljava/lang/StackTraceElement;)Lio/sentry/event/EventBuilder;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 248
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p1

    invoke-direct {p0, v0, v1, v2, p1}, Lio/sentry/event/EventBuilder;->buildCulpritString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/sentry/event/EventBuilder;->withCulprit(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    return-object p1
.end method

.method public withCulprit(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 279
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setCulprit(Ljava/lang/String;)V

    return-object p0
.end method

.method public withDist(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 175
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setDist(Ljava/lang/String;)V

    return-object p0
.end method

.method public withEnvironment(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 186
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setEnvironment(Ljava/lang/String;)V

    return-object p0
.end method

.method public withExtra(Ljava/lang/String;Ljava/lang/Object;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 349
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0}, Lio/sentry/event/Event;->getExtra()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public withFingerprint(Ljava/util/List;)Lio/sentry/event/EventBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/sentry/event/EventBuilder;"
        }
    .end annotation

    .line 373
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setFingerprint(Ljava/util/List;)V

    return-object p0
.end method

.method public varargs withFingerprint([Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 2

    .line 360
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 361
    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 362
    iget-object p1, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {p1, v0}, Lio/sentry/event/Event;->setFingerprint(Ljava/util/List;)V

    return-object p0
.end method

.method public withLevel(Lio/sentry/event/Event$Level;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 153
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setLevel(Lio/sentry/event/Event$Level;)V

    return-object p0
.end method

.method public withLogger(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 197
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setLogger(Ljava/lang/String;)V

    return-object p0
.end method

.method public withMessage(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 131
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setMessage(Ljava/lang/String;)V

    return-object p0
.end method

.method public withPlatform(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 208
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setPlatform(Ljava/lang/String;)V

    return-object p0
.end method

.method public withRelease(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 164
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setRelease(Ljava/lang/String;)V

    return-object p0
.end method

.method public withSdkIntegration(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 219
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->sdkIntegrations:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public withSentryInterface(Lio/sentry/event/interfaces/SentryInterface;)Lio/sentry/event/EventBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 410
    invoke-virtual {p0, p1, v0}, Lio/sentry/event/EventBuilder;->withSentryInterface(Lio/sentry/event/interfaces/SentryInterface;Z)Lio/sentry/event/EventBuilder;

    move-result-object p1

    return-object p1
.end method

.method public withSentryInterface(Lio/sentry/event/interfaces/SentryInterface;Z)Lio/sentry/event/EventBuilder;
    .locals 1

    if-nez p2, :cond_0

    .line 425
    iget-object p2, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {p2}, Lio/sentry/event/Event;->getSentryInterfaces()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1}, Lio/sentry/event/interfaces/SentryInterface;->getInterfaceName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 426
    :cond_0
    iget-object p2, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {p2}, Lio/sentry/event/Event;->getSentryInterfaces()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1}, Lio/sentry/event/interfaces/SentryInterface;->getInterfaceName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object p0
.end method

.method public withServerName(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 337
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setServerName(Ljava/lang/String;)V

    return-object p0
.end method

.method public withTag(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 304
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0}, Lio/sentry/event/Event;->getTags()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public withTimestamp(Ljava/util/Date;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 142
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setTimestamp(Ljava/util/Date;)V

    return-object p0
.end method

.method public withTransaction(Ljava/lang/String;)Lio/sentry/event/EventBuilder;
    .locals 1

    .line 290
    iget-object v0, p0, Lio/sentry/event/EventBuilder;->event:Lio/sentry/event/Event;

    invoke-virtual {v0, p1}, Lio/sentry/event/Event;->setTransaction(Ljava/lang/String;)V

    return-object p0
.end method
