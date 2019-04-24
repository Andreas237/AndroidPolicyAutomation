.class public Lorg/researchstack/backbone/storage/file/aes/ClearEncrypter;
.super Ljava/lang/Object;
.source "ClearEncrypter.java"

# interfaces
.implements Lorg/researchstack/backbone/storage/file/aes/Encrypter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public decrypt([B)[B
    .locals 0
    .param p1, "data"    # [B

    .prologue
    .line 18
    return-object p1
.end method

.method public encrypt([B)[B
    .locals 0
    .param p1, "data"    # [B

    .prologue
    .line 12
    return-object p1
.end method

.method public getDbKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    return-object v0
.end method
