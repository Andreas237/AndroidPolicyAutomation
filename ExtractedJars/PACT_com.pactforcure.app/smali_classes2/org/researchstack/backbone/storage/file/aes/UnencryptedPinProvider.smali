.class public Lorg/researchstack/backbone/storage/file/aes/UnencryptedPinProvider;
.super Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;
.source "UnencryptedPinProvider.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;-><init>()V

    .line 15
    return-void
.end method


# virtual methods
.method protected createEncrypter(Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)Lorg/researchstack/backbone/storage/file/aes/Encrypter;
    .locals 1
    .param p1, "masterKey"    # Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    .prologue
    .line 21
    new-instance v0, Lorg/researchstack/backbone/storage/file/aes/ClearEncrypter;

    invoke-direct {v0}, Lorg/researchstack/backbone/storage/file/aes/ClearEncrypter;-><init>()V

    return-object v0
.end method
