.class public Lorg/researchstack/backbone/storage/file/aes/AesEncrypter;
.super Ljava/lang/Object;
.source "AesEncrypter.java"

# interfaces
.implements Lorg/researchstack/backbone/storage/file/aes/Encrypter;


# instance fields
.field private secretKeys:Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;


# direct methods
.method public constructor <init>(Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)V
    .locals 0
    .param p1, "secretKeys"    # Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lorg/researchstack/backbone/storage/file/aes/AesEncrypter;->secretKeys:Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    .line 16
    return-void
.end method


# virtual methods
.method public decrypt([B)[B
    .locals 3
    .param p1, "data"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .prologue
    .line 27
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([B)V

    .line 28
    .local v1, "encrypted":Ljava/lang/String;
    new-instance v0, Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;

    invoke-direct {v0, v1}, Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;-><init>(Ljava/lang/String;)V

    .line 30
    .local v0, "cipherText":Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;
    iget-object v2, p0, Lorg/researchstack/backbone/storage/file/aes/AesEncrypter;->secretKeys:Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    invoke-static {v0, v2}, Lcom/tozny/crypto/android/AesCbcWithIntegrity;->decrypt(Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)[B

    move-result-object v2

    return-object v2
.end method

.method public encrypt([B)[B
    .locals 1
    .param p1, "data"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .prologue
    .line 21
    iget-object v0, p0, Lorg/researchstack/backbone/storage/file/aes/AesEncrypter;->secretKeys:Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    invoke-static {p1, v0}, Lcom/tozny/crypto/android/AesCbcWithIntegrity;->encrypt([BLcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    return-object v0
.end method

.method public getDbKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lorg/researchstack/backbone/storage/file/aes/AesEncrypter;->secretKeys:Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    invoke-virtual {v0}, Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
