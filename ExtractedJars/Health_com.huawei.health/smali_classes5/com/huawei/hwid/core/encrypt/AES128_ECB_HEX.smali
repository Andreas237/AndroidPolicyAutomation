.class public abstract Lcom/huawei/hwid/core/encrypt/AES128_ECB_HEX;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static decode(Ljava/lang/String;[BI)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/crypto/BadPaddingException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;
        }
    .end annotation

    .line 27
    invoke-static {p0}, Lcom/huawei/hwid/core/encrypt/HEX;->decode(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, p2}, Lcom/huawei/hwid/core/encrypt/AES128_ECB;->decode([BI[BI)[B

    move-result-object v0

    return-object v0
.end method
