.class public Lcom/ibotta/android/security/crypto/DefaultCryptography;
.super Lcom/ibotta/android/security/crypto/AbstractCryptography;
.source "DefaultCryptography.java"


# instance fields
.field private final keyProvider:Lcom/ibotta/android/security/crypto/key/KeyProvider;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;

    invoke-direct {v0}, Lcom/ibotta/android/security/crypto/key/DefaultKeyProvider;-><init>()V

    invoke-direct {p0, v0}, Lcom/ibotta/android/security/crypto/DefaultCryptography;-><init>(Lcom/ibotta/android/security/crypto/key/KeyProvider;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/security/crypto/key/KeyProvider;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/ibotta/android/security/crypto/AbstractCryptography;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/security/crypto/DefaultCryptography;->keyProvider:Lcom/ibotta/android/security/crypto/key/KeyProvider;

    return-void
.end method


# virtual methods
.method protected getSecretKey()[C
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/security/crypto/DefaultCryptography;->keyProvider:Lcom/ibotta/android/security/crypto/key/KeyProvider;

    invoke-interface {v0}, Lcom/ibotta/android/security/crypto/key/KeyProvider;->getKey()[C

    move-result-object v0

    return-object v0
.end method
