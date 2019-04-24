.class public abstract Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;
.super Ljava/lang/Object;
.source "PinProtectedProvider.java"

# interfaces
.implements Lorg/researchstack/backbone/storage/file/EncryptionProvider;


# instance fields
.field private encrypter:Lorg/researchstack/backbone/storage/file/aes/Encrypter;

.field private lastAuthTime:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    return-void
.end method

.method private createMasterKeyFile(Landroid/content/Context;)Ljava/io/File;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .prologue
    .line 152
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->createSecureDirectory(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    .line 153
    .local v0, "secure":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    const-string v2, "__encrypted"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method

.method private createSaltFile(Landroid/content/Context;)Ljava/io/File;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .prologue
    .line 166
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->createSecureDirectory(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    .line 167
    .local v0, "secure":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    const-string v2, "__sodium"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method

.method private createSecureDirectory(Landroid/content/Context;)Ljava/io/File;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .prologue
    .line 173
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "secure"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 174
    .local v0, "file":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 175
    return-object v0
.end method

.method private decryptFile(Ljava/io/File;Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)[B
    .locals 3
    .param p1, "file"    # Ljava/io/File;
    .param p2, "secretKeys"    # Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .prologue
    .line 195
    new-instance v1, Ljava/lang/String;

    invoke-static {p1}, Lorg/researchstack/backbone/utils/FileUtils;->readAll(Ljava/io/File;)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    .line 196
    .local v1, "encrypted":Ljava/lang/String;
    new-instance v0, Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;

    invoke-direct {v0, v1}, Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;-><init>(Ljava/lang/String;)V

    .line 198
    .local v0, "cipherText":Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;
    invoke-static {v0, p2}, Lcom/tozny/crypto/android/AesCbcWithIntegrity;->decrypt(Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)[B

    move-result-object v2

    return-object v2
.end method

.method private encrypt([BLcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)[B
    .locals 1
    .param p1, "data"    # [B
    .param p2, "secretKeys"    # Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .prologue
    .line 203
    invoke-static {p1, p2}, Lcom/tozny/crypto/android/AesCbcWithIntegrity;->encrypt([BLcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tozny/crypto/android/AesCbcWithIntegrity$CipherTextIvMac;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    return-object v0
.end method

.method private generatePassphraseKey(Landroid/content/Context;Ljava/lang/String;)Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "passphrase"    # Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 209
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->getSalt(Landroid/content/Context;)[B

    move-result-object v0

    invoke-static {p2, v0}, Lcom/tozny/crypto/android/AesCbcWithIntegrity;->generateKeyFromPassword(Ljava/lang/String;[B)Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    move-result-object v0

    return-object v0
.end method

.method private getSalt(Landroid/content/Context;)[B
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 214
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->createSaltFile(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    .line 215
    .local v0, "salt":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 217
    invoke-static {}, Lcom/tozny/crypto/android/AesCbcWithIntegrity;->generateSalt()[B

    move-result-object v1

    .line 218
    .local v1, "saltBytes":[B
    invoke-static {v0, v1}, Lorg/researchstack/backbone/utils/FileUtils;->writeSafe(Ljava/io/File;[B)V

    .line 221
    .end local v1    # "saltBytes":[B
    :cond_0
    invoke-static {v0}, Lorg/researchstack/backbone/utils/FileUtils;->readAll(Ljava/io/File;)[B

    move-result-object v2

    return-object v2
.end method

.method private initWithMasterKey(Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)V
    .locals 1
    .param p1, "masterKey"    # Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    .prologue
    .line 105
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->createEncrypter(Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)Lorg/researchstack/backbone/storage/file/aes/Encrypter;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->encrypter:Lorg/researchstack/backbone/storage/file/aes/Encrypter;

    .line 106
    invoke-virtual {p0}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->logAccessTime()V

    .line 107
    return-void
.end method

.method private readMasterKey(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "file"    # Ljava/io/File;
    .param p3, "passphrase"    # Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .prologue
    .line 181
    invoke-direct {p0, p1, p3}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->generatePassphraseKey(Landroid/content/Context;Ljava/lang/String;)Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    move-result-object v1

    invoke-direct {p0, p2, v1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->decryptFile(Ljava/io/File;Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)[B

    move-result-object v0

    .line 182
    .local v0, "decrypted":[B
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1
.end method

.method private removeMasterKeyFile(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 157
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->createMasterKeyFile(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    .line 158
    .local v0, "masterKeyFile":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 159
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 161
    :cond_0
    return-void
.end method

.method private validateKeyForTimeOut(J)V
    .locals 7
    .param p1, "autoLockTime"    # J

    .prologue
    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 45
    .local v2, "now":J
    iget-wide v4, p0, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->lastAuthTime:J

    sub-long v4, v2, v4

    cmp-long v1, v4, p1

    if-lez v1, :cond_1

    const/4 v0, 0x1

    .line 47
    .local v0, "isPastMinIgnoreTime":Z
    :goto_0
    if-eqz v0, :cond_0

    .line 49
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->encrypter:Lorg/researchstack/backbone/storage/file/aes/Encrypter;

    .line 51
    :cond_0
    return-void

    .line 45
    .end local v0    # "isPastMinIgnoreTime":Z
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private writeMasterKey(Landroid/content/Context;Ljava/io/File;Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "file"    # Ljava/io/File;
    .param p3, "masterKey"    # Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;
    .param p4, "passphrase"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 187
    invoke-virtual {p3}, Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    .line 188
    invoke-direct {p0, p1, p4}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->generatePassphraseKey(Landroid/content/Context;Ljava/lang/String;)Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    move-result-object v2

    .line 187
    invoke-direct {p0, v1, v2}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->encrypt([BLcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)[B

    move-result-object v0

    .line 189
    .local v0, "encrypted":[B
    invoke-static {p2, v0}, Lorg/researchstack/backbone/utils/FileUtils;->writeSafe(Ljava/io/File;[B)V

    .line 190
    return-void
.end method


# virtual methods
.method public changePinCode(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "oldPin"    # Ljava/lang/String;
    .param p3, "newPin"    # Ljava/lang/String;

    .prologue
    .line 86
    :try_start_0
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->createMasterKeyFile(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    .line 87
    .local v2, "masterKeyFile":Ljava/io/File;
    invoke-direct {p0, p1, v2, p2}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->readMasterKey(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 88
    .local v3, "masterKeyString":Ljava/lang/String;
    invoke-static {v3}, Lcom/tozny/crypto/android/AesCbcWithIntegrity;->keys(Ljava/lang/String;)Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    move-result-object v1

    .line 90
    .local v1, "masterKey":Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;
    invoke-direct {p0, p1, v2, v1, p3}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->writeMasterKey(Landroid/content/Context;Ljava/io/File;Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;Ljava/lang/String;)V

    .line 91
    invoke-direct {p0, v1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->initWithMasterKey(Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 97
    return-void

    .line 93
    .end local v1    # "masterKey":Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;
    .end local v2    # "masterKeyFile":Ljava/io/File;
    .end local v3    # "masterKeyString":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 95
    .local v0, "e":Ljava/lang/Exception;
    :goto_0
    new-instance v4, Lorg/researchstack/backbone/storage/file/StorageAccessException;

    invoke-direct {v4, v0}, Lorg/researchstack/backbone/storage/file/StorageAccessException;-><init>(Ljava/lang/Throwable;)V

    throw v4

    .line 93
    .end local v0    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected abstract createEncrypter(Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)Lorg/researchstack/backbone/storage/file/aes/Encrypter;
.end method

.method public createPinCode(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "pin"    # Ljava/lang/String;

    .prologue
    .line 70
    :try_start_0
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->createMasterKeyFile(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    .line 71
    .local v2, "masterKeyFile":Ljava/io/File;
    invoke-static {}, Lcom/tozny/crypto/android/AesCbcWithIntegrity;->generateKey()Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    move-result-object v1

    .line 72
    .local v1, "masterKey":Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;
    invoke-direct {p0, p1, v2, v1, p2}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->writeMasterKey(Landroid/content/Context;Ljava/io/File;Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;Ljava/lang/String;)V

    .line 73
    invoke-direct {p0, v1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->initWithMasterKey(Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 79
    return-void

    .line 75
    .end local v1    # "masterKey":Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;
    .end local v2    # "masterKeyFile":Ljava/io/File;
    :catch_0
    move-exception v0

    .line 77
    .local v0, "e":Ljava/lang/Exception;
    :goto_0
    new-instance v3, Lorg/researchstack/backbone/storage/file/StorageAccessException;

    invoke-direct {v3, v0}, Lorg/researchstack/backbone/storage/file/StorageAccessException;-><init>(Ljava/lang/Throwable;)V

    throw v3

    .line 75
    .end local v0    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public getEncrypter()Lorg/researchstack/backbone/storage/file/aes/Encrypter;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->encrypter:Lorg/researchstack/backbone/storage/file/aes/Encrypter;

    return-object v0
.end method

.method public hasPinCode(Landroid/content/Context;)Z
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 62
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->passphraseExists(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public logAccessTime()V
    .locals 2

    .prologue
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->lastAuthTime:J

    .line 57
    return-void
.end method

.method public needsAuth(Landroid/content/Context;Lorg/researchstack/backbone/storage/file/PinCodeConfig;)Z
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "codeConfig"    # Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    .prologue
    .line 227
    invoke-virtual {p2}, Lorg/researchstack/backbone/storage/file/PinCodeConfig;->getPinAutoLockTime()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->validateKeyForTimeOut(J)V

    .line 229
    iget-object v0, p0, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->encrypter:Lorg/researchstack/backbone/storage/file/aes/Encrypter;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public passphraseExists(Landroid/content/Context;)Z
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 139
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->createMasterKeyFile(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    .line 140
    .local v0, "masterKeyFile":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    return v1
.end method

.method public removePassphrase(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 144
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->passphraseExists(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->removeMasterKeyFile(Landroid/content/Context;)V

    .line 147
    :cond_0
    return-void
.end method

.method public removePinCode(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 100
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->removePassphrase(Landroid/content/Context;)V

    .line 101
    return-void
.end method

.method public startWithPassphrase(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "passphrase"    # Ljava/lang/String;

    .prologue
    .line 115
    :try_start_0
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->createMasterKeyFile(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    .line 117
    .local v2, "masterKeyFile":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_0

    .line 119
    new-instance v4, Ljava/lang/IllegalAccessException;

    const-string v5, "Master-key file does not exist. You should callcreatePinCode(String pin) to create a Master-key file and encrypt w/ pin-code"

    invoke-direct {v4, v5}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_2

    .line 131
    .end local v2    # "masterKeyFile":Ljava/io/File;
    :catch_0
    move-exception v0

    .line 133
    .local v0, "e":Ljava/lang/Exception;
    :goto_0
    new-instance v4, Lorg/researchstack/backbone/storage/file/StorageAccessException;

    invoke-direct {v4, v0}, Lorg/researchstack/backbone/storage/file/StorageAccessException;-><init>(Ljava/lang/Throwable;)V

    throw v4

    .line 126
    .end local v0    # "e":Ljava/lang/Exception;
    .restart local v2    # "masterKeyFile":Ljava/io/File;
    :cond_0
    :try_start_1
    invoke-direct {p0, p1, v2, p2}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->readMasterKey(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 127
    .local v3, "masterKeyString":Ljava/lang/String;
    invoke-static {v3}, Lcom/tozny/crypto/android/AesCbcWithIntegrity;->keys(Ljava/lang/String;)Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;

    move-result-object v1

    .line 129
    .local v1, "masterKey":Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;
    invoke-direct {p0, v1}, Lorg/researchstack/backbone/storage/file/aes/PinProtectedProvider;->initWithMasterKey(Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_2

    .line 135
    return-void

    .line 131
    .end local v1    # "masterKey":Lcom/tozny/crypto/android/AesCbcWithIntegrity$SecretKeys;
    .end local v2    # "masterKeyFile":Ljava/io/File;
    .end local v3    # "masterKeyString":Ljava/lang/String;
    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_0
.end method
