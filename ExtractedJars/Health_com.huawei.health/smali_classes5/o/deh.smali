.class public final Lo/deh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static c([B[BLjava/lang/String;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/crypto/BadPaddingException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/InvalidAlgorithmParameterException;
        }
    .end annotation

    .line 35
    invoke-static {p2}, Lo/del;->b(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lo/deb;->c([BI)Ljavax/crypto/spec/SecretKeySpec;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lo/deb;->e([B[BLjavax/crypto/spec/SecretKeySpec;)[B

    move-result-object v0

    return-object v0
.end method
