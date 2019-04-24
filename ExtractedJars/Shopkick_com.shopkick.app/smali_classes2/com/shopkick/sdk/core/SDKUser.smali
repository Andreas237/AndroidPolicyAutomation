.class public Lcom/shopkick/sdk/core/SDKUser;
.super Lcom/shopkick/app/application/Account;
.source "SDKUser.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/shopkick/app/application/Account;-><init>()V

    return-void
.end method


# virtual methods
.method public accountExists()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getExperimentId()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSessionKey()[B
    .locals 1

    const/4 v0, 0x0

    .line 26
    new-array v0, v0, [B

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public matchesEncryptedSessionKey(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
