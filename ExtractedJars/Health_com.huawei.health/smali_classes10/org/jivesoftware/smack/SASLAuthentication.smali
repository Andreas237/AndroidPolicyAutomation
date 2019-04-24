.class public final Lorg/jivesoftware/smack/SASLAuthentication;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BLACKLISTED_MECHANISMS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static final REGISTERED_MECHANISMS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/jivesoftware/smack/sasl/SASLMechanism;>;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "SASLAuthentication"


# instance fields
.field private authenticationSuccessful:Z

.field private final configuration:Lorg/jivesoftware/smack/ConnectionConfiguration;

.field private final connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

.field private currentMechanism:Lorg/jivesoftware/smack/sasl/SASLMechanism;

.field private saslException:Ljava/lang/Exception;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/SASLAuthentication;->REGISTERED_MECHANISMS:Ljava/util/List;

    .line 62
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/SASLAuthentication;->BLACKLISTED_MECHANISMS:Ljava/util/Set;

    return-void
.end method

.method constructor <init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Lorg/jivesoftware/smack/ConnectionConfiguration;)V
    .locals 1

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->currentMechanism:Lorg/jivesoftware/smack/sasl/SASLMechanism;

    .line 156
    iput-object p2, p0, Lorg/jivesoftware/smack/SASLAuthentication;->configuration:Lorg/jivesoftware/smack/ConnectionConfiguration;

    .line 157
    iput-object p1, p0, Lorg/jivesoftware/smack/SASLAuthentication;->connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    .line 158
    invoke-virtual {p0}, Lorg/jivesoftware/smack/SASLAuthentication;->init()V

    .line 159
    return-void
.end method

.method public static blacklistSASLMechanism(Ljava/lang/String;)Z
    .locals 3

    .line 124
    sget-object v1, Lorg/jivesoftware/smack/SASLAuthentication;->BLACKLISTED_MECHANISMS:Ljava/util/Set;

    monitor-enter v1

    .line 125
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/SASLAuthentication;->BLACKLISTED_MECHANISMS:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    .line 126
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static getBlacklistedSASLMechanisms()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 136
    sget-object v1, Lorg/jivesoftware/smack/SASLAuthentication;->BLACKLISTED_MECHANISMS:Ljava/util/Set;

    monitor-enter v1

    .line 137
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/SASLAuthentication;->BLACKLISTED_MECHANISMS:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 138
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static getRegisterdSASLMechanisms()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 82
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 83
    sget-object v3, Lorg/jivesoftware/smack/SASLAuthentication;->REGISTERED_MECHANISMS:Ljava/util/List;

    monitor-enter v3

    .line 84
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/SASLAuthentication;->REGISTERED_MECHANISMS:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/jivesoftware/smack/sasl/SASLMechanism;

    .line 85
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    goto :goto_0

    .line 87
    :cond_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    .line 88
    :goto_1
    return-object v2
.end method

.method public static isSaslMechanismRegistered(Ljava/lang/String;)Z
    .locals 5

    .line 92
    sget-object v1, Lorg/jivesoftware/smack/SASLAuthentication;->REGISTERED_MECHANISMS:Ljava/util/List;

    monitor-enter v1

    .line 93
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/SASLAuthentication;->REGISTERED_MECHANISMS:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/jivesoftware/smack/sasl/SASLMechanism;

    .line 94
    invoke-virtual {v3}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    monitor-exit v1

    const/4 v0, 0x1

    return v0

    .line 97
    :cond_0
    goto :goto_0

    .line 98
    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 99
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public static registerSASLMechanism(Lorg/jivesoftware/smack/sasl/SASLMechanism;)V
    .locals 3

    .line 70
    sget-object v1, Lorg/jivesoftware/smack/SASLAuthentication;->REGISTERED_MECHANISMS:Ljava/util/List;

    monitor-enter v1

    .line 71
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/SASLAuthentication;->REGISTERED_MECHANISMS:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    sget-object v0, Lorg/jivesoftware/smack/SASLAuthentication;->REGISTERED_MECHANISMS:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 74
    :goto_0
    return-void
.end method

.method private selectMechanism()Lorg/jivesoftware/smack/sasl/SASLMechanism;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 268
    new-instance v0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;

    iget-object v1, p0, Lorg/jivesoftware/smack/SASLAuthentication;->connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    iget-object v2, p0, Lorg/jivesoftware/smack/SASLAuthentication;->configuration:Lorg/jivesoftware/smack/ConnectionConfiguration;

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;-><init>(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/ConnectionConfiguration;)V

    return-object v0
.end method

.method public static unBlacklistSASLMechanism(Ljava/lang/String;)Z
    .locals 3

    .line 130
    sget-object v1, Lorg/jivesoftware/smack/SASLAuthentication;->BLACKLISTED_MECHANISMS:Ljava/util/Set;

    monitor-enter v1

    .line 131
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/SASLAuthentication;->BLACKLISTED_MECHANISMS:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    .line 132
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static unregisterSASLMechanism(Ljava/lang/String;)Z
    .locals 5

    .line 110
    sget-object v1, Lorg/jivesoftware/smack/SASLAuthentication;->REGISTERED_MECHANISMS:Ljava/util/List;

    monitor-enter v1

    .line 111
    :try_start_0
    sget-object v0, Lorg/jivesoftware/smack/SASLAuthentication;->REGISTERED_MECHANISMS:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 112
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/jivesoftware/smack/sasl/SASLMechanism;

    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    monitor-exit v1

    const/4 v0, 0x1

    return v0

    .line 118
    :cond_0
    goto :goto_0

    .line 119
    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 120
    :goto_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public authenticate(Lorg/jivesoftware/smack/SASLConfiguration;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/sasl/SASLErrorException;,
            Lorg/jivesoftware/smack/SmackException;,
            Lorg/jivesoftware/smack/XMPPException$XMPPErrorException;
        }
    .end annotation

    .line 171
    invoke-direct {p0}, Lorg/jivesoftware/smack/SASLAuthentication;->selectMechanism()Lorg/jivesoftware/smack/sasl/SASLMechanism;

    move-result-object v4

    .line 172
    if-eqz v4, :cond_4

    .line 173
    iput-object v4, p0, Lorg/jivesoftware/smack/SASLAuthentication;->currentMechanism:Lorg/jivesoftware/smack/sasl/SASLMechanism;

    .line 174
    move-object v5, p0

    monitor-enter v5

    .line 175
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->currentMechanism:Lorg/jivesoftware/smack/sasl/SASLMechanism;

    instance-of v0, v0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->currentMechanism:Lorg/jivesoftware/smack/sasl/SASLMechanism;

    check-cast v0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;->authenticate(Lorg/jivesoftware/smack/SASLConfiguration;)V

    goto :goto_0

    .line 179
    :cond_0
    new-instance v0, Lorg/jivesoftware/smack/SmackException;

    const-string v1, "SASL Authentication failed. No known authentication mechanisims."

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    :goto_0
    const-string v0, "SASLAuthentication"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "authenticate wait max timeout:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/jivesoftware/smack/SASLAuthentication;->connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    invoke-virtual {v2}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getPacketReplyTimeout()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    iget-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/AbstractXMPPConnection;->getPacketReplyTimeout()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 188
    goto :goto_1

    .line 186
    :catch_0
    move-exception v6

    .line 189
    :goto_1
    const-string v0, "SASLAuthentication"

    const-string v1, "auth wait finish."

    :try_start_2
    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 190
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7

    .line 192
    :goto_2
    iget-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->saslException:Ljava/lang/Exception;

    if-eqz v0, :cond_3

    .line 193
    iget-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->saslException:Ljava/lang/Exception;

    instance-of v0, v0, Lorg/jivesoftware/smack/SmackException;

    if-eqz v0, :cond_1

    .line 194
    iget-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->saslException:Ljava/lang/Exception;

    check-cast v0, Lorg/jivesoftware/smack/SmackException;

    throw v0

    .line 195
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->saslException:Ljava/lang/Exception;

    instance-of v0, v0, Lorg/jivesoftware/smack/sasl/SASLErrorException;

    if-eqz v0, :cond_2

    .line 196
    iget-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->saslException:Ljava/lang/Exception;

    check-cast v0, Lorg/jivesoftware/smack/sasl/SASLErrorException;

    throw v0

    .line 198
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected exception type"

    iget-object v2, p0, Lorg/jivesoftware/smack/SASLAuthentication;->saslException:Ljava/lang/Exception;

    invoke-direct {v0, v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 202
    :cond_3
    iget-boolean v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->authenticationSuccessful:Z

    if-nez v0, :cond_5

    .line 203
    iget-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->connection:Lorg/jivesoftware/smack/AbstractXMPPConnection;

    const-string v1, "successful SASL authentication"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/SmackException$NoResponseException;->newWith(Lorg/jivesoftware/smack/XMPPConnection;Ljava/lang/String;)Lorg/jivesoftware/smack/SmackException$NoResponseException;

    move-result-object v0

    throw v0

    .line 206
    :cond_4
    new-instance v0, Lorg/jivesoftware/smack/SmackException;

    const-string v1, "SASL Authentication failed. No known authentication mechanisims."

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 208
    :cond_5
    return-void
.end method

.method public authenticated(Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$Success;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 217
    iget-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->currentMechanism:Lorg/jivesoftware/smack/sasl/SASLMechanism;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->checkIfSuccessfulOrThrow()V

    .line 218
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->authenticationSuccessful:Z

    .line 220
    move-object v1, p0

    monitor-enter v1

    .line 221
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 223
    :goto_0
    return-void
.end method

.method public authenticationFailed(Ljava/lang/Exception;)V
    .locals 2

    .line 237
    iput-object p1, p0, Lorg/jivesoftware/smack/SASLAuthentication;->saslException:Ljava/lang/Exception;

    .line 239
    move-object v0, p0

    monitor-enter v0

    .line 240
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 242
    :goto_0
    return-void
.end method

.method public authenticationFailed(Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;)V
    .locals 2

    .line 233
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLErrorException;

    iget-object v1, p0, Lorg/jivesoftware/smack/SASLAuthentication;->currentMechanism:Lorg/jivesoftware/smack/sasl/SASLMechanism;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/jivesoftware/smack/sasl/SASLErrorException;-><init>(Ljava/lang/String;Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;)V

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/SASLAuthentication;->authenticationFailed(Ljava/lang/Exception;)V

    .line 234
    return-void
.end method

.method public authenticationSuccessful()Z
    .locals 1

    .line 245
    iget-boolean v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->authenticationSuccessful:Z

    return v0
.end method

.method getNameOfLastUsedSaslMechansism()Ljava/lang/String;
    .locals 2

    .line 259
    iget-object v1, p0, Lorg/jivesoftware/smack/SASLAuthentication;->currentMechanism:Lorg/jivesoftware/smack/sasl/SASLMechanism;

    .line 260
    if-nez v1, :cond_0

    .line 261
    const/4 v0, 0x0

    return-object v0

    .line 263
    :cond_0
    invoke-virtual {v1}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method init()V
    .locals 1

    .line 254
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->authenticationSuccessful:Z

    .line 255
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/SASLAuthentication;->saslException:Ljava/lang/Exception;

    .line 256
    return-void
.end method
