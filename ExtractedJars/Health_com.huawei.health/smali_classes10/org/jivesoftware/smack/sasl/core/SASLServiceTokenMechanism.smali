.class public Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;
.super Lorg/jivesoftware/smack/sasl/SASLMechanism;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$SASLServiceTokenFailure;,
        Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$Success;,
        Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;
    }
.end annotation


# static fields
.field public static final NAME:Ljava/lang/String; = "SERVICE-TOKEN"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;-><init>()V

    .line 47
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/XMPPConnection;Lorg/jivesoftware/smack/ConnectionConfiguration;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lorg/jivesoftware/smack/sasl/SASLMechanism;-><init>()V

    .line 51
    iput-object p1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    .line 52
    iput-object p2, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;->connectionConfiguration:Lorg/jivesoftware/smack/ConnectionConfiguration;

    .line 53
    return-void
.end method


# virtual methods
.method public authenticate(Lorg/jivesoftware/smack/SASLConfiguration;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 62
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;->connection:Lorg/jivesoftware/smack/XMPPConnection;

    new-instance v1, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;

    invoke-direct {v1, p1}, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;-><init>(Lorg/jivesoftware/smack/SASLConfiguration;)V

    invoke-interface {v0, v1}, Lorg/jivesoftware/smack/XMPPConnection;->sendStanza(Lorg/jivesoftware/smack/packet/Stanza;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    goto :goto_0

    .line 63
    :catch_0
    move-exception v2

    .line 64
    const-string v0, " InterruptedException "

    invoke-virtual {v2}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    :goto_0
    return-void
.end method

.method public authenticateInternal(Ljavax/security/auth/callback/CallbackHandler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 213
    return-void
.end method

.method public checkIfSuccessfulOrThrow()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 231
    return-void
.end method

.method public getAuthenticationText()[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 218
    const/4 v0, 0x0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 56
    const-string v0, "SERVICE-TOKEN"

    return-object v0
.end method

.method public getPriority()I
    .locals 1

    .line 224
    const/16 v0, 0x70

    return v0
.end method

.method public newInstance()Lorg/jivesoftware/smack/sasl/SASLMechanism;
    .locals 1

    .line 236
    new-instance v0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;

    invoke-direct {v0}, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;-><init>()V

    return-object v0
.end method
