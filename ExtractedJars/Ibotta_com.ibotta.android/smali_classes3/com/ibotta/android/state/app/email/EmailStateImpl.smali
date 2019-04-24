.class public Lcom/ibotta/android/state/app/email/EmailStateImpl;
.super Ljava/lang/Object;
.source "EmailStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/email/EmailState;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static final KEY_LAST_EMAIL_USED:Ljava/lang/String; = "email"


# instance fields
.field private final secureState:Lcom/ibotta/android/state/secure/SecureState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/secure/SecureState;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/state/app/email/EmailStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    return-void
.end method


# virtual methods
.method protected createLastEmailUsedConfidential()Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;
    .locals 1

    .line 37
    new-instance v0, Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;-><init>()V

    return-object v0
.end method

.method protected getJsonParser(ZZ)Lcom/ibotta/android/json/IbottaJson;
    .locals 1

    .line 33
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object p1

    return-object p1
.end method

.method public getLastEmailUsed()Ljava/lang/String;
    .locals 4

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/state/app/email/EmailStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v1, "email"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/state/secure/SecureState;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    .line 45
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 47
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/state/app/email/EmailStateImpl;->parseJson(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed to decrypt last email used."

    const/4 v3, 0x0

    .line 49
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-object v1
.end method

.method public getSecureState()Lcom/ibotta/android/state/secure/SecureState;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/state/app/email/EmailStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    return-object v0
.end method

.method public migrateSecureData(Landroid/content/SharedPreferences;)V
    .locals 5

    const-string v0, "email"

    .line 72
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/state/app/email/EmailStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v2, "email"

    const-string v3, "email"

    const/4 v4, 0x0

    invoke-interface {p1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lcom/ibotta/android/state/secure/SecureState;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "email"

    .line 75
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 76
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method protected parseJson(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 81
    invoke-virtual {p0, v0, v0}, Lcom/ibotta/android/state/app/email/EmailStateImpl;->getJsonParser(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    .line 82
    const-class v1, Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;

    .line 84
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;->getEmail()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public setLastEmailUsed(Ljava/lang/String;)V
    .locals 3

    .line 59
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/email/EmailStateImpl;->createLastEmailUsedConfidential()Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;

    move-result-object v0

    .line 60
    invoke-virtual {v0, p1}, Lcom/ibotta/android/state/app/email/EmailStateImpl$LastEmailUsedConfidential;->setEmail(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 62
    invoke-virtual {p0, p1, p1}, Lcom/ibotta/android/state/app/email/EmailStateImpl;->getJsonParser(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object p1

    .line 63
    iget-object v1, p0, Lcom/ibotta/android/state/app/email/EmailStateImpl;->secureState:Lcom/ibotta/android/state/secure/SecureState;

    const-string v2, "email"

    invoke-interface {p1, v0}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lcom/ibotta/android/state/secure/SecureState;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to encrypt and save last email used."

    const/4 v1, 0x0

    .line 65
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
