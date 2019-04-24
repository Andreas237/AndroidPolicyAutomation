.class public Lorg/researchstack/backbone/storage/database/sqlite/UpdatablePassphraseProvider;
.super Ljava/lang/Object;
.source "UpdatablePassphraseProvider.java"

# interfaces
.implements Lco/touchlab/squeaky/db/sqlcipher/PassphraseProvider;


# instance fields
.field private passphrase:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/researchstack/backbone/storage/database/sqlite/UpdatablePassphraseProvider;->passphrase:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getPassphrase()Ljava/lang/String;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lorg/researchstack/backbone/storage/database/sqlite/UpdatablePassphraseProvider;->passphrase:Ljava/lang/String;

    return-object v0
.end method

.method public setPassphrase(Ljava/lang/String;)V
    .locals 0
    .param p1, "passphrase"    # Ljava/lang/String;

    .prologue
    .line 12
    iput-object p1, p0, Lorg/researchstack/backbone/storage/database/sqlite/UpdatablePassphraseProvider;->passphrase:Ljava/lang/String;

    .line 13
    return-void
.end method
