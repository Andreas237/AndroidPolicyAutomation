.class Lo/fqo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljavax/crypto/SecretKey;

.field private b:Lo/fqh;

.field private c:Ljavax/crypto/SecretKey;

.field private d:Lo/fsf;

.field private e:Ljavax/crypto/spec/IvParameterSpec;


# direct methods
.method constructor <init>()V
    .locals 6

    .line 64
    move-object v0, p0

    sget-object v1, Lo/fsf;->b:Lo/fsf;

    sget-object v2, Lo/fqh;->e:Lo/fqh;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fqo;-><init>(Lo/fsf;Lo/fqh;Ljavax/crypto/SecretKey;Ljavax/crypto/spec/IvParameterSpec;Ljavax/crypto/SecretKey;)V

    .line 65
    return-void
.end method

.method constructor <init>(Lo/fsf;Lo/fqh;Ljavax/crypto/SecretKey;Ljavax/crypto/spec/IvParameterSpec;Ljavax/crypto/SecretKey;)V
    .locals 2

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    if-nez p1, :cond_0

    .line 85
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cipher suite must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_0
    if-nez p2, :cond_1

    .line 87
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Compression method must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_1
    iput-object p1, p0, Lo/fqo;->d:Lo/fsf;

    .line 90
    iput-object p2, p0, Lo/fqo;->b:Lo/fqh;

    .line 91
    iput-object p3, p0, Lo/fqo;->c:Ljavax/crypto/SecretKey;

    .line 92
    iput-object p4, p0, Lo/fqo;->e:Ljavax/crypto/spec/IvParameterSpec;

    .line 93
    iput-object p5, p0, Lo/fqo;->a:Ljavax/crypto/SecretKey;

    .line 94
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 108
    sget-object v0, Lo/fsf;->b:Lo/fsf;

    iget-object v1, p0, Lo/fqo;->d:Lo/fsf;

    invoke-virtual {v0, v1}, Lo/fsf;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method b()Lo/fqh;
    .locals 1

    .line 118
    iget-object v0, p0, Lo/fqo;->b:Lo/fqh;

    return-object v0
.end method

.method c()Ljavax/crypto/SecretKey;
    .locals 1

    .line 127
    iget-object v0, p0, Lo/fqo;->c:Ljavax/crypto/SecretKey;

    return-object v0
.end method

.method d()Ljavax/crypto/spec/IvParameterSpec;
    .locals 1

    .line 136
    iget-object v0, p0, Lo/fqo;->e:Ljavax/crypto/spec/IvParameterSpec;

    return-object v0
.end method

.method e()Lo/fsf;
    .locals 1

    .line 99
    iget-object v0, p0, Lo/fqo;->d:Lo/fsf;

    return-object v0
.end method

.method h()I
    .locals 1

    .line 170
    iget-object v0, p0, Lo/fqo;->d:Lo/fsf;

    invoke-virtual {v0}, Lo/fsf;->f()I

    move-result v0

    return v0
.end method

.method i()Ljavax/crypto/SecretKey;
    .locals 1

    .line 140
    iget-object v0, p0, Lo/fqo;->a:Ljavax/crypto/SecretKey;

    return-object v0
.end method

.method final k()I
    .locals 1

    .line 198
    iget-object v0, p0, Lo/fqo;->d:Lo/fsf;

    invoke-virtual {v0}, Lo/fsf;->b()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 203
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "DTLSConnectionState:"

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\tCipher suite: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqo;->d:Lo/fsf;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 205
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\tCompression method: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqo;->b:Lo/fqh;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\tIV: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqo;->e:Ljavax/crypto/spec/IvParameterSpec;

    if-nez v1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    const-string v1, "not null"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\tMAC key: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqo;->a:Ljavax/crypto/SecretKey;

    if-nez v1, :cond_1

    const-string v1, "null"

    goto :goto_1

    :cond_1
    const-string v1, "not null"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\tEncryption key: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqo;->c:Ljavax/crypto/SecretKey;

    if-nez v1, :cond_2

    const-string v1, "null"

    goto :goto_2

    :cond_2
    const-string v1, "not null"

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
