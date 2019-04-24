.class public Lorg/researchstack/backbone/storage/file/aes/AesProvider;
.super Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;
.source "AesProvider.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;-><init>()V

    .line 16
    return-void
.end method


# virtual methods
.method protected createEncrypter(Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)Lorg/researchstack/backbone/storage/file/aes/Encrypter;
    .locals 1
    .param p1, "masterKey"    # Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    .prologue
    .line 21
    new-instance v0, Lorg/researchstack/backbone/storage/file/aes/AesEncrypter;

    invoke-direct {v0, p1}, Lorg/researchstack/backbone/storage/file/aes/AesEncrypter;-><init>(Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)V

    return-object v0
.end method
