.class public Lcom/ibotta/api/model/retailer/ButtonInfo;
.super Ljava/lang/Object;
.source "ButtonInfo.java"


# static fields
.field private static final PLATFORM_ANDROID:Ljava/lang/String; = "android"

.field private static final PLATFORM_IOS:Ljava/lang/String; = "ios"


# instance fields
.field private android:Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

.field private ios:Lcom/ibotta/api/model/retailer/ButtonInfoDetails;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAndroid()Lcom/ibotta/api/model/retailer/ButtonInfoDetails;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/ButtonInfo;->android:Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    return-object v0
.end method

.method public getButtonId(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, "ios"

    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/ButtonInfo;->getIos()Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/ButtonInfo;->getIos()Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v1, "android"

    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/ButtonInfo;->getAndroid()Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/ButtonInfo;->getAndroid()Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->getId()Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public getIos()Lcom/ibotta/api/model/retailer/ButtonInfoDetails;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/ButtonInfo;->ios:Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    return-object v0
.end method

.method public setAndroid(Lcom/ibotta/api/model/retailer/ButtonInfoDetails;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/ButtonInfo;->android:Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    return-void
.end method

.method public setIos(Lcom/ibotta/api/model/retailer/ButtonInfoDetails;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/ButtonInfo;->ios:Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    return-void
.end method
