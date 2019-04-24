.class public abstract Lorg/jivesoftware/smack/sasl/SASLMechanism;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/lang/Comparable<Lorg/jivesoftware/smack/sasl/SASLMechanism;>;"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final CRAMMD5:Ljava/lang/String; = "CRAM-MD5"

.field public static final DIGESTMD5:Ljava/lang/String; = "DIGEST-MD5"

.field public static final EXTERNAL:Ljava/lang/String; = "EXTERNAL"

.field public static final GSSAPI:Ljava/lang/String; = "GSSAPI"

.field public static final PLAIN:Ljava/lang/String; = "PLAIN"

.field private static saslPrepTransformer:Lorg/jivesoftware/smack/util/StringTransformer; = null


# instance fields
.field protected authenticationId:Ljava/lang/String;

.field protected authorizationId:Lo/fth;

.field protected connection:Lorg/jivesoftware/smack/XMPPConnection;

.field protected connectionConfiguration:Lorg/jivesoftware/smack/ConnectionConfiguration;

.field protected host:Ljava/lang/String;

.field protected password:Ljava/lang/String;

.field protected serviceName:Lo/fsz;

.field protected sslSession:Ljavax/net/ssl/SSLSession;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    const-class v0, Lorg/jivesoftware/smack/sasl/SASLMechanism;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->$assertionsDisabled:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final authenticate()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;,
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 205
    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->getAuthenticationText()[B

    move-result-object v3

    .line 210
    if-eqz v3, :cond_0

    array-length v0, v3

    if-lez v0, :cond_0

    .line 211
    invoke-static {v3}, Lorg/jivesoftware/smack/util/stringencoder/Base64;->encodeToString([B)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 216
    :cond_0
    const-string v4, "="

    .line 219
    :goto_0
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    new-instance v1, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$AuthMechanism;

    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v4}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$AuthMechanism;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lorg/jivesoftware/smack/XMPPConnection;->sendNonza(Lorg/jivesoftware/smack/packet/Nonza;)V

    .line 220
    return-void
.end method

.method protected static saslPrep(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 314
    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLMechanism;->saslPrepTransformer:Lorg/jivesoftware/smack/util/StringTransformer;

    .line 315
    if-eqz v1, :cond_0

    .line 316
    invoke-interface {v1, p0}, Lorg/jivesoftware/smack/util/StringTransformer;->transform(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 318
    :cond_0
    return-object p0
.end method

.method public static setSaslPrepTransformer(Lorg/jivesoftware/smack/util/StringTransformer;)V
    .locals 0

    .line 68
    sput-object p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->saslPrepTransformer:Lorg/jivesoftware/smack/util/StringTransformer;

    .line 69
    return-void
.end method

.method protected static toBytes(Ljava/lang/String;)[B
    .locals 1

    .line 303
    invoke-static {p0}, Lorg/jivesoftware/smack/util/StringUtils;->toBytes(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final authenticate(Ljava/lang/String;Ljava/lang/String;Lo/fsz;Ljava/lang/String;Lo/fth;Ljavax/net/ssl/SSLSession;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;,
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 161
    iput-object p1, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->authenticationId:Ljava/lang/String;

    .line 162
    iput-object p2, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->host:Ljava/lang/String;

    .line 163
    iput-object p3, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->serviceName:Lo/fsz;

    .line 164
    iput-object p4, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->password:Ljava/lang/String;

    .line 165
    iput-object p5, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->authorizationId:Lo/fth;

    .line 166
    iput-object p6, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->sslSession:Ljavax/net/ssl/SSLSession;

    .line 167
    sget-boolean v0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->authorizationId:Lo/fth;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->authzidSupported()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 168
    :cond_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->authenticateInternal()V

    .line 169
    invoke-direct {p0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->authenticate()V

    .line 170
    return-void
.end method

.method public authenticate(Ljava/lang/String;Lo/fsz;Ljavax/security/auth/callback/CallbackHandler;Lo/fth;Ljavax/net/ssl/SSLSession;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;,
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 193
    iput-object p1, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->host:Ljava/lang/String;

    .line 194
    iput-object p2, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->serviceName:Lo/fsz;

    .line 195
    iput-object p4, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->authorizationId:Lo/fth;

    .line 196
    iput-object p5, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->sslSession:Ljavax/net/ssl/SSLSession;

    .line 197
    sget-boolean v0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->authorizationId:Lo/fth;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->authzidSupported()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 198
    :cond_0
    invoke-virtual {p0, p3}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->authenticateInternal(Ljavax/security/auth/callback/CallbackHandler;)V

    .line 199
    invoke-direct {p0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->authenticate()V

    .line 200
    return-void
.end method

.method protected authenticateInternal()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 176
    return-void
.end method

.method protected abstract authenticateInternal(Ljavax/security/auth/callback/CallbackHandler;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation
.end method

.method public authzidSupported()Z
    .locals 1

    .line 297
    const/4 v0, 0x0

    return v0
.end method

.method public final challengeReceived(Ljava/lang/String;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;,
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 243
    if-eqz p1, :cond_0

    const-string v0, "="

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    move-object p1, v0

    .line 244
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 245
    invoke-static {p1}, Lorg/jivesoftware/smack/util/stringencoder/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v1

    .line 246
    invoke-virtual {p0, v1}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->evaluateChallenge([B)[B

    move-result-object v2

    .line 247
    if-eqz p2, :cond_1

    .line 248
    return-void

    .line 252
    :cond_1
    if-nez v2, :cond_2

    .line 253
    new-instance v3, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Response;

    invoke-direct {v3}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Response;-><init>()V

    goto :goto_1

    .line 256
    :cond_2
    new-instance v3, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Response;

    invoke-static {v2}, Lorg/jivesoftware/smack/util/stringencoder/Base64;->encodeToString([B)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Response;-><init>(Ljava/lang/String;)V

    .line 260
    :goto_1
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    invoke-interface {v0, v3}, Lorg/jivesoftware/smack/XMPPConnection;->sendNonza(Lorg/jivesoftware/smack/packet/Nonza;)V

    .line 262
    :cond_3
    return-void
.end method

.method public abstract checkIfSuccessfulOrThrow()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 47
    move-object v0, p1

    check-cast v0, Lorg/jivesoftware/smack/sasl/SASLMechanism;

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->compareTo(Lorg/jivesoftware/smack/sasl/SASLMechanism;)I

    move-result v0

    return v0
.end method

.method public final compareTo(Lorg/jivesoftware/smack/sasl/SASLMechanism;)I
    .locals 2

    .line 274
    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->getPriority()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 275
    invoke-virtual {p1}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->getPriority()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method protected evaluateChallenge([B)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 268
    const/4 v0, 0x0

    return-object v0
.end method

.method protected abstract getAuthenticationText()[B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getPriority()I
.end method

.method public instanceForAuthentication(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/ConnectionConfiguration;)Lorg/jivesoftware/smack/sasl/SASLMechanism;
    .locals 1

    .line 290
    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;->newInstance()Lorg/jivesoftware/smack/sasl/SASLMechanism;

    move-result-object v0

    .line 291
    iput-object p1, v0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    .line 292
    iput-object p2, v0, Lorg/jivesoftware/smack/sasl/SASLMechanism;->connectionConfiguration:Lorg/jivesoftware/smack/ConnectionConfiguration;

    .line 293
    return-object v0
.end method

.method protected abstract newInstance()Lorg/jivesoftware/smack/sasl/SASLMechanism;
.end method
