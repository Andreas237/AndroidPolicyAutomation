.class public Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;
.super Ljava/lang/Object;
.source "StoreSelectorReqsV5Config.java"


# instance fields
.field private mcomm:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

.field private stores:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getMcomm()Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;->mcomm:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    return-object v0
.end method

.method public getStores()Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;->stores:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    return-object v0
.end method

.method public setMcomm(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;->mcomm:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    return-void
.end method

.method public setStores(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;->stores:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    return-void
.end method
