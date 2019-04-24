.class public abstract Lcom/shopkick/app/application/Account;
.super Ljava/lang/Object;
.source "Account.java"


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract accountExists()Z
.end method

.method public getAdvertisingId(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 29
    new-instance v0, Lcom/shopkick/app/application/AdvertisingIDCaller;

    invoke-direct {v0, p1}, Lcom/shopkick/app/application/AdvertisingIDCaller;-><init>(Landroid/content/Context;)V

    .line 30
    invoke-virtual {v0}, Lcom/shopkick/app/application/AdvertisingIDCaller;->getCurrentAdvertisingIdValue()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract getExperimentId()Ljava/lang/String;
.end method

.method public abstract getSessionKey()[B
.end method

.method public abstract getUserId()Ljava/lang/String;
.end method

.method public abstract matchesEncryptedSessionKey(Ljava/lang/String;)Z
.end method
