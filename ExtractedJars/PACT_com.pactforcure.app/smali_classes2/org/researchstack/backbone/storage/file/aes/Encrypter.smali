.class public interface abstract Lorg/researchstack/backbone/storage/file/aes/Encrypter;
.super Ljava/lang/Object;
.source "Encrypter.java"


# virtual methods
.method public abstract decrypt([B)[B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation
.end method

.method public abstract encrypt([B)[B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation
.end method

.method public abstract getDbKey()Ljava/lang/String;
.end method
