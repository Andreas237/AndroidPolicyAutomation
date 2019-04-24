.class public Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$SASLServiceTokenFailure;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SASLServiceTokenFailure"
.end annotation


# static fields
.field public static final NODENAME:Ljava/lang/String; = "failure"


# instance fields
.field private final condition:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    iput-object p1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$SASLServiceTokenFailure;->condition:Ljava/lang/String;

    .line 184
    return-void
.end method


# virtual methods
.method public getCondition()Ljava/lang/String;
    .locals 1

    .line 193
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$SASLServiceTokenFailure;->condition:Ljava/lang/String;

    return-object v0
.end method

.method public toXML()Ljava/lang/String;
    .locals 3

    .line 198
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    const-string v0, "<failure xmlns=\"urn:ietf:params:xml:ns:xmpp-sasl\">"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$SASLServiceTokenFailure;->condition:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$SASLServiceTokenFailure;->condition:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 202
    const-string v0, "<"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$SASLServiceTokenFailure;->condition:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    :cond_0
    const-string v0, "</failure>"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
