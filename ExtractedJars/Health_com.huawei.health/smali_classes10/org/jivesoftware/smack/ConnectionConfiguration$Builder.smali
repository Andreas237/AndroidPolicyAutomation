.class public abstract Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/ConnectionConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B:Lorg/jivesoftware/smack/ConnectionConfiguration$Builder<TB;TC;>;C:Lorg/jivesoftware/smack/ConnectionConfiguration;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private allowEmptyOrNullUsername:Z

.field private appVersion:Ljava/lang/String;

.field private authzid:Lo/fth;

.field private callbackHandler:Ljavax/security/auth/callback/CallbackHandler;

.field private customSSLContext:Ljavax/net/ssl/SSLContext;

.field private customX509TrustManager:Ljavax/net/ssl/X509TrustManager;

.field private debuggerEnabled:Z

.field private dnssecMode:Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

.field private enabledSSLCiphers:[Ljava/lang/String;

.field private enabledSSLProtocols:[Ljava/lang/String;

.field private enabledSaslMechanisms:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private host:Ljava/lang/String;

.field private hostAddress:Ljava/net/InetAddress;

.field private hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

.field private keystorePath:Ljava/lang/String;

.field private keystoreType:Ljava/lang/String;

.field private legacySessionDisabled:Z

.field private password:Ljava/lang/String;

.field private pkcs11Library:Ljava/lang/String;

.field private port:I

.field private proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

.field private resource:Lo/ftp;

.field private saslMechanismsSealed:Z

.field private securityMode:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

.field private sendPresence:Z

.field private socketFactory:Ljavax/net/SocketFactory;

.field private username:Ljava/lang/CharSequence;

.field private xmppServiceDomain:Lo/fsz;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 551
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 522
    sget-object v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->ifpossible:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->securityMode:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    .line 523
    sget-object v0, Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;->disabled:Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->dnssecMode:Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

    .line 524
    const-string v0, "javax.net.ssl.keyStore"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->keystorePath:Ljava/lang/String;

    .line 525
    const-string v0, "jks"

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->keystoreType:Ljava/lang/String;

    .line 526
    const-string v0, "pkcs11.config"

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->pkcs11Library:Ljava/lang/String;

    .line 535
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->sendPresence:Z

    .line 536
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->legacySessionDisabled:Z

    .line 539
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->debuggerEnabled:Z

    .line 544
    const/16 v0, 0x1466

    iput v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->port:I

    .line 545
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->allowEmptyOrNullUsername:Z

    .line 552
    return-void
.end method

.method static synthetic access$000(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lo/fth;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->authzid:Lo/fth;

    return-object v0
.end method

.method static synthetic access$100(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/CharSequence;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->username:Ljava/lang/CharSequence;

    return-object v0
.end method

.method static synthetic access$1000(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljavax/net/SocketFactory;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->socketFactory:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method static synthetic access$1100(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->dnssecMode:Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

    return-object v0
.end method

.method static synthetic access$1200(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->customX509TrustManager:Ljavax/net/ssl/X509TrustManager;

    return-object v0
.end method

.method static synthetic access$1300(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->securityMode:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    return-object v0
.end method

.method static synthetic access$1400(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->keystoreType:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1500(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->keystorePath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1600(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->pkcs11Library:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1700(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljavax/net/ssl/SSLContext;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->customSSLContext:Ljavax/net/ssl/SSLContext;

    return-object v0
.end method

.method static synthetic access$1800(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)[Ljava/lang/String;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->enabledSSLProtocols:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1900(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)[Ljava/lang/String;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->enabledSSLCiphers:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->password:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2000(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method static synthetic access$2100(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Z
    .locals 1

    .line 521
    iget-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->sendPresence:Z

    return v0
.end method

.method static synthetic access$2200(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Z
    .locals 1

    .line 521
    iget-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->legacySessionDisabled:Z

    return v0
.end method

.method static synthetic access$2300(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Z
    .locals 1

    .line 521
    iget-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->debuggerEnabled:Z

    return v0
.end method

.method static synthetic access$2400(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Z
    .locals 1

    .line 521
    iget-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->allowEmptyOrNullUsername:Z

    return v0
.end method

.method static synthetic access$2500(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/util/Set;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->enabledSaslMechanisms:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic access$2600(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->appVersion:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljavax/security/auth/callback/CallbackHandler;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->callbackHandler:Ljavax/security/auth/callback/CallbackHandler;

    return-object v0
.end method

.method static synthetic access$400(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lo/ftp;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->resource:Lo/ftp;

    return-object v0
.end method

.method static synthetic access$500(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lo/fsz;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->xmppServiceDomain:Lo/fsz;

    return-object v0
.end method

.method static synthetic access$600(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/net/InetAddress;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->hostAddress:Ljava/net/InetAddress;

    return-object v0
.end method

.method static synthetic access$700(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->host:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$800(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)I
    .locals 1

    .line 521
    iget v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->port:I

    return v0
.end method

.method static synthetic access$900(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lorg/jivesoftware/smack/proxy/ProxyInfo;
    .locals 1

    .line 521
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    return-object v0
.end method

.method private throwIfEnabledSaslMechanismsSet()V
    .locals 2

    .line 929
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->enabledSaslMechanisms:Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 930
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Enabled SASL mechanisms found"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 932
    :cond_0
    return-void
.end method


# virtual methods
.method public addEnabledSaslMechanism(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TB;"
        }
    .end annotation

    .line 941
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "saslMechanism must not be null or empty"

    invoke-static {p1, v1}, Lorg/jivesoftware/smack/util/StringUtils;->requireNotNullOrEmpty(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->addEnabledSaslMechanism(Ljava/util/Collection;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addEnabledSaslMechanism(Ljava/util/Collection;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Ljava/lang/String;>;)TB;"
        }
    .end annotation

    .line 954
    iget-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->saslMechanismsSealed:Z

    if-eqz v0, :cond_0

    .line 955
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The enabled SASL mechanisms are sealed, you can not add new ones"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 957
    :cond_0
    const-string v0, "saslMechanisms"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/CollectionUtil;->requireNotEmpty(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/Collection;

    .line 958
    invoke-static {}, Lorg/jivesoftware/smack/SASLAuthentication;->getBlacklistedSASLMechanisms()Ljava/util/Set;

    move-result-object v3

    .line 959
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 960
    invoke-static {v5}, Lorg/jivesoftware/smack/SASLAuthentication;->isSaslMechanismRegistered(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 961
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SASL "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not avaiable. Consider registering it with Smack"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 963
    :cond_1
    invoke-interface {v3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 964
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SALS "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is blacklisted."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 966
    :cond_2
    goto :goto_0

    .line 967
    :cond_3
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->enabledSaslMechanisms:Ljava/util/Set;

    if-nez v0, :cond_4

    .line 968
    new-instance v0, Ljava/util/HashSet;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->enabledSaslMechanisms:Ljava/util/Set;

    .line 970
    :cond_4
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->enabledSaslMechanisms:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 971
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public allowEmptyOrNullUsernames()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TB;"
        }
    .end annotation

    .line 884
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->allowEmptyOrNullUsername:Z

    .line 885
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public abstract build()Lorg/jivesoftware/smack/ConnectionConfiguration;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation
.end method

.method protected abstract getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TB;"
        }
    .end annotation
.end method

.method public performSaslAnonymousAuthentication()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TB;"
        }
    .end annotation

    .line 895
    const-string v0, "ANONYMOUS"

    invoke-static {v0}, Lorg/jivesoftware/smack/SASLAuthentication;->isSaslMechanismRegistered(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 896
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SASL ANONYMOUS is not registered"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 898
    :cond_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->throwIfEnabledSaslMechanismsSet()V

    .line 900
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->allowEmptyOrNullUsernames()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 901
    const-string v0, "ANONYMOUS"

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->addEnabledSaslMechanism(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 902
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->saslMechanismsSealed:Z

    .line 903
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public performSaslExternalAuthentication(Ljavax/net/ssl/SSLContext;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljavax/net/ssl/SSLContext;)TB;"
        }
    .end annotation

    .line 915
    const-string v0, "EXTERNAL"

    invoke-static {v0}, Lorg/jivesoftware/smack/SASLAuthentication;->isSaslMechanismRegistered(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 916
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SASL EXTERNAL is not registered"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 918
    :cond_0
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->setCustomSSLContext(Ljavax/net/ssl/SSLContext;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 919
    invoke-direct {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->throwIfEnabledSaslMechanismsSet()V

    .line 921
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->allowEmptyOrNullUsernames()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 922
    sget-object v0, Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;->required:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->setSecurityMode(Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 923
    const-string v0, "EXTERNAL"

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->addEnabledSaslMechanism(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    .line 924
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->saslMechanismsSealed:Z

    .line 925
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setAppVersion(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TB;"
        }
    .end annotation

    .line 679
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->appVersion:Ljava/lang/String;

    .line 680
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setAuthzid(Lo/fth;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fth;)TB;"
        }
    .end annotation

    .line 989
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->authzid:Lo/fth;

    .line 990
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setCallbackHandler(Ljavax/security/auth/callback/CallbackHandler;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljavax/security/auth/callback/CallbackHandler;)TB;"
        }
    .end annotation

    .line 694
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->callbackHandler:Ljavax/security/auth/callback/CallbackHandler;

    .line 695
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setCustomSSLContext(Ljavax/net/ssl/SSLContext;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljavax/net/ssl/SSLContext;)TB;"
        }
    .end annotation

    .line 767
    const-string v0, "The SSLContext must not be null"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/SSLContext;

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->customSSLContext:Ljavax/net/ssl/SSLContext;

    .line 768
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setCustomX509TrustManager(Ljavax/net/ssl/X509TrustManager;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljavax/net/ssl/X509TrustManager;)TB;"
        }
    .end annotation

    .line 704
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->customX509TrustManager:Ljavax/net/ssl/X509TrustManager;

    .line 705
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setDebuggerEnabled(Z)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TB;"
        }
    .end annotation

    .line 848
    iput-boolean p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->debuggerEnabled:Z

    .line 849
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setDnssecMode(Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;)TB;"
        }
    .end annotation

    .line 699
    const-string v0, "DNSSEC mode must not be null"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->dnssecMode:Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

    .line 700
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setEnabledSSLCiphers([Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)TB;"
        }
    .end annotation

    .line 789
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->enabledSSLCiphers:[Ljava/lang/String;

    .line 790
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setEnabledSSLProtocols([Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)TB;"
        }
    .end annotation

    .line 778
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->enabledSSLProtocols:[Ljava/lang/String;

    .line 779
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setHost(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TB;"
        }
    .end annotation

    .line 659
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->host:Ljava/lang/String;

    .line 660
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setHostAddress(Ljava/net/InetAddress;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/net/InetAddress;)TB;"
        }
    .end annotation

    .line 646
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->hostAddress:Ljava/net/InetAddress;

    .line 647
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljavax/net/ssl/HostnameVerifier;)TB;"
        }
    .end annotation

    .line 801
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 802
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setKeystorePath(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TB;"
        }
    .end annotation

    .line 729
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->keystorePath:Ljava/lang/String;

    .line 730
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setKeystoreType(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TB;"
        }
    .end annotation

    .line 740
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->keystoreType:Ljava/lang/String;

    .line 741
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setLegacySessionDisabled(Z)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TB;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 822
    iput-boolean p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->legacySessionDisabled:Z

    .line 823
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setPKCS11Library(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TB;"
        }
    .end annotation

    .line 752
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->pkcs11Library:Ljava/lang/String;

    .line 753
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setPort(I)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TB;"
        }
    .end annotation

    .line 664
    if-ltz p1, :cond_0

    const v0, 0xffff

    if-le p1, v0, :cond_1

    .line 665
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Port must be a 16-bit unsiged integer (i.e. between 0-65535. Port was: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 668
    :cond_1
    iput p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->port:I

    .line 669
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setProxyInfo(Lorg/jivesoftware/smack/proxy/ProxyInfo;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/jivesoftware/smack/proxy/ProxyInfo;)TB;"
        }
    .end annotation

    .line 871
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    .line 872
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setResource(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/CharSequence;)TB;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 633
    const-string v0, "resource must not be null"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 634
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ftp;->b(Ljava/lang/String;)Lo/ftp;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->setResource(Lo/ftp;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setResource(Lo/ftp;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ftp;)TB;"
        }
    .end annotation

    .line 620
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->resource:Lo/ftp;

    .line 621
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setSecurityMode(Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;)TB;"
        }
    .end annotation

    .line 716
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->securityMode:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    .line 717
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setSendPresence(Z)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TB;"
        }
    .end annotation

    .line 836
    iput-boolean p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->sendPresence:Z

    .line 837
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setServiceName(Lo/fsz;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fsz;)TB;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 580
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->setXmppDomain(Lo/fsz;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setSocketFactory(Ljavax/net/SocketFactory;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljavax/net/SocketFactory;)TB;"
        }
    .end annotation

    .line 860
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->socketFactory:Ljavax/net/SocketFactory;

    .line 861
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setUsernameAndPassword(Ljava/lang/CharSequence;Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/CharSequence;Ljava/lang/String;)TB;"
        }
    .end annotation

    .line 566
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->username:Ljava/lang/CharSequence;

    .line 567
    iput-object p2, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->password:Ljava/lang/String;

    .line 568
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setXmppDomain(Ljava/lang/String;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TB;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 602
    invoke-static {p1}, Lo/ftj;->c(Ljava/lang/String;)Lo/fsz;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->xmppServiceDomain:Lo/fsz;

    .line 603
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setXmppDomain(Lo/fsz;)Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fsz;)TB;"
        }
    .end annotation

    .line 590
    iput-object p1, p0, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->xmppServiceDomain:Lo/fsz;

    .line 591
    invoke-virtual {p0}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->getThis()Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;

    move-result-object v0

    return-object v0
.end method
