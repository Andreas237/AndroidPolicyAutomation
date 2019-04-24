.class public Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;
    }
.end annotation


# instance fields
.field private resultCode:Ljava/lang/String;

.field private thirdUserToken:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getResultCode()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->resultCode:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdUserToken()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->thirdUserToken:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    return-object v0
.end method

.method public setResultCode(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->resultCode:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public setThirdUserToken(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->thirdUserToken:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    .line 30
    return-void
.end method
