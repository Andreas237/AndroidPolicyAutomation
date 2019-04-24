.class public final Lo/fqs;
.super Lo/fqk;
.source "SourceFile"


# instance fields
.field private final d:[B


# direct methods
.method public constructor <init>(Ljava/security/PublicKey;Ljava/net/InetSocketAddress;)V
    .locals 4

    .line 62
    invoke-direct {p0, p2}, Lo/fqk;-><init>(Ljava/net/InetSocketAddress;)V

    .line 63
    move-object v1, p1

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    .line 64
    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v2

    .line 65
    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {v2, v0}, Lo/fsi;->c(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqs;->d:[B

    .line 68
    return-void
.end method

.method public constructor <init>([BLjava/net/InetSocketAddress;)V
    .locals 1

    .line 81
    invoke-direct {p0, p2}, Lo/fqk;-><init>(Ljava/net/InetSocketAddress;)V

    .line 82
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqs;->d:[B

    .line 83
    return-void
.end method

.method public static a([BLjava/net/InetSocketAddress;)Lo/fqy;
    .locals 4

    .line 102
    new-instance v1, Lo/fpq;

    invoke-direct {v1, p0}, Lo/fpq;-><init>([B)V

    .line 103
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v2

    .line 104
    invoke-virtual {v1, v2}, Lo/fpq;->d(I)[B

    move-result-object v3

    .line 106
    new-instance v0, Lo/fqs;

    invoke-direct {v0, v3, p1}, Lo/fqs;-><init>([BLjava/net/InetSocketAddress;)V

    return-object v0
.end method


# virtual methods
.method public d()I
    .locals 2

    .line 114
    iget-object v0, p0, Lo/fqs;->d:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public g()[B
    .locals 3

    .line 89
    new-instance v1, Lo/fpp;

    invoke-direct {v1}, Lo/fpp;-><init>()V

    .line 94
    iget-object v0, p0, Lo/fqs;->d:[B

    array-length v2, v0

    .line 95
    const/16 v0, 0x8

    invoke-virtual {v1, v2, v0}, Lo/fpp;->c(II)V

    .line 96
    iget-object v0, p0, Lo/fqs;->d:[B

    invoke-virtual {v1, v0}, Lo/fpp;->e([B)V

    .line 98
    invoke-virtual {v1}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public h()[B
    .locals 2

    .line 118
    iget-object v0, p0, Lo/fqs;->d:[B

    iget-object v1, p0, Lo/fqs;->d:[B

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 123
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    invoke-super {p0}, Lo/fqk;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    const-string v0, "\t\tDiffie-Hellman public value: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    iget-object v0, p0, Lo/fqs;->d:[B

    invoke-static {v0}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
