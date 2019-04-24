.class public Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;
.super Lorg/jivesoftware/smack/packet/Stanza;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AuthMechanism"
.end annotation


# instance fields
.field private mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;


# direct methods
.method public constructor <init>(Lorg/jivesoftware/smack/SASLConfiguration;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lorg/jivesoftware/smack/packet/Stanza;-><init>()V

    .line 78
    iput-object p1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    .line 79
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 140
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 71
    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->toXML()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Ljava/lang/String;
    .locals 8

    .line 83
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x400

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 84
    const-string v0, "<auth mechanism=\"SERVICE-TOKEN\""

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    const-string v0, " version=\""

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "1.0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-boolean v0, v0, Lorg/jivesoftware/smack/SASLConfiguration;->check_online:Z

    if-eqz v0, :cond_0

    .line 90
    const-string v0, " check_online=\""

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-boolean v1, v1, Lorg/jivesoftware/smack/SASLConfiguration;->check_online:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    :cond_0
    const-string v0, " xmlns=\"urn:socialim:params:xml:ns:xmpp-sasl\">"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v0, 0x400

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 97
    const-string v0, "ServiceToken="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v1, v1, Lorg/jivesoftware/smack/SASLConfiguration;->ServiceToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&DeviceID="

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v1, v1, Lorg/jivesoftware/smack/SASLConfiguration;->deviceID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&UID="

    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-wide v1, v1, Lorg/jivesoftware/smack/SASLConfiguration;->uid:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    const/4 v6, 0x0

    .line 103
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/util/stringencoder/Base64;->encode(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 108
    goto :goto_0

    .line 105
    :catch_0
    move-exception v7

    .line 107
    const-string v0, " IllegalStateException "

    invoke-virtual {v7}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    :goto_0
    const-string v0, "<token>"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "</token>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    const-string v0, "<jid>"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-wide v2, v2, Lorg/jivesoftware/smack/SASLConfiguration;->uid:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "@"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v2, v2, Lorg/jivesoftware/smack/SASLConfiguration;->serviceName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v0, v0, Lorg/jivesoftware/smack/SASLConfiguration;->resource:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v1, v1, Lorg/jivesoftware/smack/SASLConfiguration;->resource:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    :cond_1
    const-string v0, "</jid>"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v0, v0, Lorg/jivesoftware/smack/SASLConfiguration;->PushToken:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v0, v0, Lorg/jivesoftware/smack/SASLConfiguration;->PushToken:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 122
    const-string v0, "<pushtoken>"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v1, v1, Lorg/jivesoftware/smack/SASLConfiguration;->PushToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "</pushtoken>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    :cond_2
    const-string v0, "<phonetype>"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v1, v1, Lorg/jivesoftware/smack/SASLConfiguration;->phoneType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "</phonetype>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    const-string v0, "<romversion>"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v1, v1, Lorg/jivesoftware/smack/SASLConfiguration;->romVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "</romversion>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    const-string v0, "<appversion>"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v1, v1, Lorg/jivesoftware/smack/SASLConfiguration;->clientVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "</appversion>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    const-string v0, "<appid>"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$AuthMechanism;->mSaslConfig:Lorg/jivesoftware/smack/SASLConfiguration;

    iget-object v1, v1, Lorg/jivesoftware/smack/SASLConfiguration;->appid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "</appid>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    const-string v0, "</auth>"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
