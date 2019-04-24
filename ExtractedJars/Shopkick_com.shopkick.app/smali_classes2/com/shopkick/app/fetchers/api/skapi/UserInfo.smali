.class public Lcom/shopkick/app/fetchers/api/skapi/UserInfo;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "UserInfo.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public country:Ljava/lang/Integer;

.field public createdTsUtc:Ljava/lang/Long;

.field public email:Ljava/lang/String;

.field public enrolledLoyaltyProgramIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public firstName:Ljava/lang/String;

.field public gender:Ljava/lang/Integer;

.field public isBuyAndCollectEnrolled:Ljava/lang/Boolean;

.field public isEmailVerified:Ljava/lang/Boolean;

.field public isFacebookConnected:Ljava/lang/Boolean;

.field public isFacebookPrimaryHandle:Ljava/lang/Boolean;

.field public isGooglePlusConnected:Ljava/lang/Boolean;

.field public isPhoneNumberVerified:Ljava/lang/Boolean;

.field public isRegistered:Ljava/lang/Boolean;

.field public lastName:Ljava/lang/String;

.field public phoneNumber:Ljava/lang/String;

.field public zipCode:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserInfo;
    .locals 2

    .line 48
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    if-eqz p1, :cond_0

    .line 49
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/UserInfo;
    .locals 1

    .line 43
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isRegistered:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isRegistered:Ljava/lang/Boolean;

    .line 60
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isPhoneNumberVerified:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isPhoneNumberVerified:Ljava/lang/Boolean;

    .line 61
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isFacebookConnected:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isFacebookConnected:Ljava/lang/Boolean;

    .line 62
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isFacebookPrimaryHandle:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isFacebookPrimaryHandle:Ljava/lang/Boolean;

    .line 63
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isBuyAndCollectEnrolled:Ljava/lang/Boolean;

    if-nez v0, :cond_4

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isBuyAndCollectEnrolled:Ljava/lang/Boolean;

    .line 65
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isGooglePlusConnected:Ljava/lang/Boolean;

    if-nez v0, :cond_5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isGooglePlusConnected:Ljava/lang/Boolean;

    .line 66
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isEmailVerified:Ljava/lang/Boolean;

    if-nez v0, :cond_6

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isEmailVerified:Ljava/lang/Boolean;

    :cond_6
    return-void
.end method
