.class public Lcom/ibotta/android/state/secure/SecureStateImpl;
.super Ljava/lang/Object;
.source "SecureStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/secure/SecureState;


# static fields
.field private static final KEY_LAST_CRYPTO_CLASS:Ljava/lang/String; = "last_crypto_class"


# instance fields
.field private final appContext:Landroid/content/Context;

.field private cryptography:Lcom/ibotta/android/security/crypto/Cryptography;

.field private prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->appContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/String;)Z
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method protected createCryptography()Lcom/ibotta/android/security/crypto/Cryptography;
    .locals 1

    .line 34
    invoke-static {}, Lcom/ibotta/android/security/crypto/CryptographyFactory;->newCrypto()Lcom/ibotta/android/security/crypto/Cryptography;

    move-result-object v0

    return-object v0
.end method

.method protected createPrefs(Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->appContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method

.method public getCryptography()Lcom/ibotta/android/security/crypto/Cryptography;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->cryptography:Lcom/ibotta/android/security/crypto/Cryptography;

    return-object v0
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    .line 122
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/state/secure/SecureStateImpl;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public getInt(Ljava/lang/String;I)I
    .locals 4

    .line 127
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/secure/SecureStateImpl;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 132
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to parse int string: %1$s"

    const/4 v2, 0x1

    .line 134
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return p2
.end method

.method public getLong(Ljava/lang/String;)J
    .locals 2

    const-wide/16 v0, 0x0

    .line 144
    invoke-virtual {p0, p1, v0, v1}, Lcom/ibotta/android/state/secure/SecureStateImpl;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getLong(Ljava/lang/String;J)J
    .locals 4

    .line 149
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/secure/SecureStateImpl;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 154
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to parse long string: %1$s"

    const/4 v2, 0x1

    .line 156
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-wide p2
.end method

.method public getPrefs()Landroid/content/SharedPreferences;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 99
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->cryptography:Lcom/ibotta/android/security/crypto/Cryptography;

    invoke-interface {v0, p1}, Lcom/ibotta/android/security/crypto/Cryptography;->decrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 111
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/secure/SecureStateImpl;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    move-object p1, p2

    :cond_0
    return-object p1
.end method

.method public init(Ljava/lang/String;)Z
    .locals 3

    .line 47
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/secure/SecureStateImpl;->createPrefs(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->prefs:Landroid/content/SharedPreferences;

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/android/state/secure/SecureStateImpl;->createCryptography()Lcom/ibotta/android/security/crypto/Cryptography;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->cryptography:Lcom/ibotta/android/security/crypto/Cryptography;

    .line 51
    iget-object p1, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v0, "last_crypto_class"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->cryptography:Lcom/ibotta/android/security/crypto/Cryptography;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/android/state/secure/SecureStateImpl;->removeAll()V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 60
    iget-object v1, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "last_crypto_class"

    .line 61
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 62
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :goto_0
    return p1
.end method

.method public putInt(Ljava/lang/String;I)V
    .locals 0

    .line 85
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/state/secure/SecureStateImpl;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putLong(Ljava/lang/String;J)V
    .locals 0

    .line 90
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/state/secure/SecureStateImpl;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 75
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/secure/SecureStateImpl;->remove(Ljava/lang/String;)V

    return-void

    .line 78
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 79
    iget-object v1, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->cryptography:Lcom/ibotta/android/security/crypto/Cryptography;

    invoke-interface {v1, p2}, Lcom/ibotta/android/security/crypto/Cryptography;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 80
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public remove(Ljava/lang/String;)V
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 167
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 168
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public removeAll()V
    .locals 3

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "last_crypto_class"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/state/secure/SecureStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 176
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    const-string v2, "last_crypto_class"

    .line 177
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 178
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
