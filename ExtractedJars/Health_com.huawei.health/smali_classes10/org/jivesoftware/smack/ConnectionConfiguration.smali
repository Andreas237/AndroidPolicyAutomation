.class public abstract Lorg/jivesoftware/smack/ConnectionConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;,
        Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;,
        Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field protected final allowNullOrEmptyUsername:Z

.field private appVersion:Ljava/lang/String;

.field private final authzid:Lo/fth;

.field private final callbackHandler:Ljavax/security/auth/callback/CallbackHandler;

.field private final customSSLContext:Ljavax/net/ssl/SSLContext;

.field private final customX509TrustManager:Ljavax/net/ssl/X509TrustManager;

.field private final debuggerEnabled:Z

.field private final dnssecMode:Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

.field private final enabledSSLCiphers:[Ljava/lang/String;

.field private final enabledSSLProtocols:[Ljava/lang/String;

.field private final enabledSaslMechanisms:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field protected host:Ljava/lang/String;

.field protected final hostAddress:Ljava/net/InetAddress;

.field private final hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

.field private final keystorePath:Ljava/lang/String;

.field private final keystoreType:Ljava/lang/String;

.field private final legacySessionDisabled:Z

.field private final password:Ljava/lang/String;

.field private final pkcs11Library:Ljava/lang/String;

.field protected port:I

.field protected final proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

.field private final resource:Lo/ftp;

.field private final securityMode:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

.field private final sendPresence:Z

.field private final socketFactory:Ljavax/net/SocketFactory;

.field private final username:Ljava/lang/CharSequence;

.field protected final xmppServiceDomain:Lo/fsz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    const-class v0, Lorg/jivesoftware/smack/ConnectionConfiguration;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lorg/jivesoftware/smack/ConnectionConfiguration;->$assertionsDisabled:Z

    .line 56
    invoke-static {}, Lorg/jivesoftware/smack/SmackConfiguration;->getVersion()Ljava/lang/String;

    .line 57
    return-void
.end method

.method protected constructor <init>(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder<**>;)V"
        }
    .end annotation

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$000(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lo/fth;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->authzid:Lo/fth;

    .line 133
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$100(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->username:Ljava/lang/CharSequence;

    .line 134
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$200(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->password:Ljava/lang/String;

    .line 135
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$300(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljavax/security/auth/callback/CallbackHandler;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->callbackHandler:Ljavax/security/auth/callback/CallbackHandler;

    .line 138
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$400(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lo/ftp;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->resource:Lo/ftp;

    .line 140
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$500(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lo/fsz;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->xmppServiceDomain:Lo/fsz;

    .line 141
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->xmppServiceDomain:Lo/fsz;

    if-nez v0, :cond_0

    .line 142
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must define the XMPP domain"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :cond_0
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$600(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/net/InetAddress;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->hostAddress:Ljava/net/InetAddress;

    .line 145
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$700(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->host:Ljava/lang/String;

    .line 146
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$800(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)I

    move-result v0

    iput v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->port:I

    .line 148
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$900(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lorg/jivesoftware/smack/proxy/ProxyInfo;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    .line 149
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$1000(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->socketFactory:Ljavax/net/SocketFactory;

    .line 151
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$1100(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->dnssecMode:Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

    .line 153
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$1200(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->customX509TrustManager:Ljavax/net/ssl/X509TrustManager;

    .line 155
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$1300(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->securityMode:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    .line 156
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$1400(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->keystoreType:Ljava/lang/String;

    .line 157
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$1500(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->keystorePath:Ljava/lang/String;

    .line 158
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$1600(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->pkcs11Library:Ljava/lang/String;

    .line 159
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$1700(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->customSSLContext:Ljavax/net/ssl/SSLContext;

    .line 160
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$1800(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->enabledSSLProtocols:[Ljava/lang/String;

    .line 161
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$1900(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->enabledSSLCiphers:[Ljava/lang/String;

    .line 162
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$2000(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 163
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$2100(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->sendPresence:Z

    .line 164
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$2200(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->legacySessionDisabled:Z

    .line 165
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$2300(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->debuggerEnabled:Z

    .line 166
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$2400(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->allowNullOrEmptyUsername:Z

    .line 167
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$2500(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->enabledSaslMechanisms:Ljava/util/Set;

    .line 168
    invoke-static {p1}, Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;->access$2600(Lorg/jivesoftware/smack/ConnectionConfiguration$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->appVersion:Ljava/lang/String;

    .line 171
    sget-boolean v0, Lorg/jivesoftware/smack/ConnectionConfiguration;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->enabledSaslMechanisms:Ljava/util/Set;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->enabledSaslMechanisms:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 173
    :cond_2
    :goto_0
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->dnssecMode:Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

    sget-object v1, Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;->disabled:Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->customSSLContext:Ljavax/net/ssl/SSLContext;

    if-eqz v0, :cond_3

    .line 174
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You can not use a custom SSL context with DNSSEC enabled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 177
    :cond_3
    return-void
.end method


# virtual methods
.method public getAppVersion()Ljava/lang/String;
    .locals 1

    .line 196
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->appVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthzid()Lo/fth;
    .locals 1

    .line 463
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->authzid:Lo/fth;

    return-object v0
.end method

.method public getCallbackHandler()Ljavax/security/auth/callback/CallbackHandler;
    .locals 1

    .line 331
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->callbackHandler:Ljavax/security/auth/callback/CallbackHandler;

    return-object v0
.end method

.method public getCustomSSLContext()Ljavax/net/ssl/SSLContext;
    .locals 1

    .line 263
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->customSSLContext:Ljavax/net/ssl/SSLContext;

    return-object v0
.end method

.method public getCustomX509TrustManager()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 223
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->customX509TrustManager:Ljavax/net/ssl/X509TrustManager;

    return-object v0
.end method

.method public getDnssecMode()Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;
    .locals 1

    .line 219
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->dnssecMode:Lorg/jivesoftware/smack/ConnectionConfiguration$DnssecMode;

    return-object v0
.end method

.method public getEnabledSSLCiphers()[Ljava/lang/String;
    .locals 1

    .line 281
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->enabledSSLCiphers:[Ljava/lang/String;

    return-object v0
.end method

.method public getEnabledSSLProtocols()[Ljava/lang/String;
    .locals 1

    .line 272
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->enabledSSLProtocols:[Ljava/lang/String;

    return-object v0
.end method

.method public getEnabledSaslMechanisms()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 503
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->enabledSaslMechanisms:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getHost()Ljava/lang/String;
    .locals 1

    .line 358
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->host:Ljava/lang/String;

    return-object v0
.end method

.method public getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 292
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    return-object v0

    .line 294
    :cond_0
    invoke-static {}, Lorg/jivesoftware/smack/SmackConfiguration;->getDefaultHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    return-object v0
.end method

.method public getKeystorePath()Ljava/lang/String;
    .locals 1

    .line 234
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->keystorePath:Ljava/lang/String;

    return-object v0
.end method

.method public getKeystoreType()Ljava/lang/String;
    .locals 1

    .line 243
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->keystoreType:Ljava/lang/String;

    return-object v0
.end method

.method public getPKCS11Library()Ljava/lang/String;
    .locals 1

    .line 253
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->pkcs11Library:Ljava/lang/String;

    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 443
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getPort()I
    .locals 1

    .line 362
    iget v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->port:I

    return v0
.end method

.method public getProxyInfo()Lorg/jivesoftware/smack/proxy/ProxyInfo;
    .locals 1

    .line 350
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->proxy:Lorg/jivesoftware/smack/proxy/ProxyInfo;

    return-object v0
.end method

.method public getResource()Lo/ftp;
    .locals 1

    .line 452
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->resource:Lo/ftp;

    return-object v0
.end method

.method public getSecurityMode()Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;
    .locals 1

    .line 215
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->securityMode:Lorg/jivesoftware/smack/ConnectionConfiguration$SecurityMode;

    return-object v0
.end method

.method public getServiceName()Lo/fsz;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 187
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->xmppServiceDomain:Lo/fsz;

    return-object v0
.end method

.method public getSocketFactory()Ljavax/net/SocketFactory;
    .locals 1

    .line 341
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->socketFactory:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public getUsername()Ljava/lang/CharSequence;
    .locals 1

    .line 434
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->username:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getXMPPServiceDomain()Lo/fsz;
    .locals 1

    .line 205
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->xmppServiceDomain:Lo/fsz;

    return-object v0
.end method

.method public isCompressionEnabled()Z
    .locals 1

    .line 485
    const/4 v0, 0x0

    return v0
.end method

.method public isDebuggerEnabled()Z
    .locals 1

    .line 304
    iget-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->debuggerEnabled:Z

    return v0
.end method

.method public isEnabledSaslMechanism(Ljava/lang/String;)Z
    .locals 1

    .line 496
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->enabledSaslMechanisms:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 497
    invoke-static {}, Lorg/jivesoftware/smack/SASLAuthentication;->getBlacklistedSASLMechanisms()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 499
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->enabledSaslMechanisms:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isLegacySessionDisabled()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 318
    iget-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->legacySessionDisabled:Z

    return v0
.end method

.method public isSendPresence()Z
    .locals 1

    .line 472
    iget-boolean v0, p0, Lorg/jivesoftware/smack/ConnectionConfiguration;->sendPresence:Z

    return v0
.end method
