.class public abstract Lcom/huawei/hwid/core/encrypt/AES128_ECB;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PART_CODE_KEY:Ljava/lang/String; = "2994807A3"

.field public static final PART_CODE_KEY_SEC:Ljava/lang/String; = "F6A10EDFAEDEB663"

.field public static final PART_KEY_CODE_KEY:Ljava/lang/String; = "dbGd"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a([BI[BI)[B
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/crypto/BadPaddingException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;
        }
    .end annotation

    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x0

    .line 47
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 48
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 51
    :cond_1
    if-lez p1, :cond_2

    array-length v0, p0

    if-le p1, v0, :cond_3

    .line 52
    :cond_2
    array-length p1, p0

    .line 55
    :cond_3
    if-lez p3, :cond_4

    array-length v0, p2

    if-le p3, v0, :cond_5

    .line 56
    :cond_4
    array-length p3, p2

    .line 59
    :cond_5
    const/16 v0, 0x10

    if-le p3, v0, :cond_6

    .line 61
    const/16 p3, 0x10

    .line 64
    :cond_6
    const/16 v0, 0x10

    new-array v6, v0, [B

    .line 66
    const/4 v4, 0x0

    :goto_0
    const/16 v0, 0x10

    if-ge v4, v0, :cond_7

    .line 67
    const/4 v0, 0x0

    aput-byte v0, v6, v4

    .line 66
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 70
    :cond_7
    const/4 v4, 0x0

    :goto_1
    if-ge v4, p3, :cond_8

    .line 71
    aget-byte v0, p2, v4

    aput-byte v0, v6, v4

    .line 70
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 74
    :cond_8
    const-string v0, "AES/ECB/PKCS5Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v7

    .line 76
    const/4 v5, 0x2

    .line 78
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-direct {v0, v6, v2, v3, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v7, v5, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 80
    const/4 v0, 0x0

    invoke-virtual {v7, p0, v0, p1}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object v0

    return-object v0
.end method

.method public static decode([BI[BI)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/crypto/BadPaddingException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;
        }
    .end annotation

    .line 37
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hwid/core/encrypt/AES128_ECB;->a([BI[BI)[B

    move-result-object v0

    return-object v0
.end method
