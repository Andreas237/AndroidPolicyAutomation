.class public Lcom/ibotta/android/security/crypto/CryptographyFactory;
.super Ljava/lang/Object;
.source "CryptographyFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static newCrypto()Lcom/ibotta/android/security/crypto/Cryptography;
    .locals 5

    .line 10
    new-instance v0, Lcom/ibotta/android/security/crypto/DefaultCryptography;

    invoke-direct {v0}, Lcom/ibotta/android/security/crypto/DefaultCryptography;-><init>()V

    .line 11
    invoke-interface {v0}, Lcom/ibotta/android/security/crypto/Cryptography;->init()V

    const-string v1, "Cryptography class: %1$s"

    const/4 v2, 0x1

    .line 13
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method
