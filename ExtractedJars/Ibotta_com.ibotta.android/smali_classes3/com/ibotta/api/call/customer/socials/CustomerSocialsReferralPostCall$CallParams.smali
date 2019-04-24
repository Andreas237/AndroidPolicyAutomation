.class public Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerSocialsReferralPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private authType:Lcom/ibotta/api/model/auth/AuthType;

.field private customerId:I

.field private requestId:Ljava/lang/String;

.field private userId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAuthType()Lcom/ibotta/api/model/auth/AuthType;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    return-object v0
.end method

.method public getCustomerId()I
    .locals 1

    .line 68
    iget v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall$CallParams;->customerId:I

    return v0
.end method

.method public getRequestId()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall$CallParams;->requestId:Ljava/lang/String;

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall$CallParams;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public setAuthType(Lcom/ibotta/api/model/auth/AuthType;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    .line 77
    iget-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    if-nez p1, :cond_0

    .line 78
    sget-object p1, Lcom/ibotta/api/model/auth/AuthType;->IBOTTA:Lcom/ibotta/api/model/auth/AuthType;

    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    :cond_0
    return-void
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 64
    iput p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall$CallParams;->customerId:I

    return-void
.end method

.method public setRequestId(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall$CallParams;->requestId:Ljava/lang/String;

    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostCall$CallParams;->userId:Ljava/lang/String;

    return-void
.end method
