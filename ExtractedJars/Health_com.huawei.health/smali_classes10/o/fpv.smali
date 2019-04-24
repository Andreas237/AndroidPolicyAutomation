.class public Lo/fpv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/security/Principal;


# instance fields
.field private final a:Ljava/security/PublicKey;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/security/PublicKey;)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    if-nez p1, :cond_0

    .line 48
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Public key must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50
    :cond_0
    iput-object p1, p0, Lo/fpv;->a:Ljava/security/PublicKey;

    .line 51
    iget-object v0, p0, Lo/fpv;->a:Ljava/security/PublicKey;

    invoke-interface {v0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fpv;->d([B)V

    .line 53
    return-void
.end method

.method private d([B)V
    .locals 6

    .line 74
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 75
    invoke-virtual {v2, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 76
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    .line 77
    const/16 v0, 0x51

    invoke-static {v3, v0}, Lo/fss;->c([BI)Ljava/lang/String;

    move-result-object v4

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ni:///sha-256;"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 79
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fpv;->d:Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    goto :goto_0

    .line 80
    :catch_0
    move-exception v2

    .line 84
    :goto_0
    return-void
.end method


# virtual methods
.method public final b()[B
    .locals 1

    .line 115
    iget-object v0, p0, Lo/fpv;->a:Ljava/security/PublicKey;

    invoke-interface {v0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 152
    if-ne p0, p1, :cond_0

    .line 153
    const/4 v0, 0x1

    return v0

    .line 154
    :cond_0
    if-nez p1, :cond_1

    .line 155
    const/4 v0, 0x0

    return v0

    .line 156
    :cond_1
    instance-of v0, p1, Lo/fpv;

    if-nez v0, :cond_2

    .line 157
    const/4 v0, 0x0

    return v0

    .line 159
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/fpv;

    .line 160
    iget-object v0, p0, Lo/fpv;->a:Ljava/security/PublicKey;

    if-nez v0, :cond_3

    .line 161
    iget-object v0, v2, Lo/fpv;->a:Ljava/security/PublicKey;

    if-eqz v0, :cond_4

    .line 162
    const/4 v0, 0x0

    return v0

    .line 164
    :cond_3
    invoke-virtual {p0}, Lo/fpv;->b()[B

    move-result-object v0

    invoke-virtual {v2}, Lo/fpv;->b()[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_4

    .line 165
    const/4 v0, 0x0

    return v0

    .line 167
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lo/fpv;->d:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 138
    const/16 v2, 0x1f

    .line 139
    const/4 v3, 0x1

    .line 140
    iget-object v0, p0, Lo/fpv;->a:Ljava/security/PublicKey;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo/fpv;->b()[B

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    :goto_0
    add-int/lit8 v3, v0, 0x1f

    .line 141
    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RawPublicKey Identity ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lo/fpv;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
