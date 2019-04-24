.class public Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerSocialsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private authType:Lcom/ibotta/api/model/auth/AuthType;

.field private customerId:I

.field private customerSocialAuthCode:Ljava/lang/String;

.field private customerSocialExpiration:Ljava/lang/Long;

.field private customerSocialIdentifier:Ljava/lang/String;

.field private customerSocialSecret:Ljava/lang/String;

.field private customerSocialToken:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAuthType()Lcom/ibotta/api/model/auth/AuthType;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    return-object v0
.end method

.method public getCustomerId()I
    .locals 1

    .line 86
    iget v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerId:I

    return v0
.end method

.method public getCustomerSocialAuthCode()Ljava/lang/String;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerSocialAuthCode:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerSocialExpiration()Ljava/lang/Long;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerSocialExpiration:Ljava/lang/Long;

    return-object v0
.end method

.method public getCustomerSocialIdentifier()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerSocialIdentifier:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerSocialSecret()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerSocialSecret:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerSocialToken()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerSocialToken:Ljava/lang/String;

    return-object v0
.end method

.method public setAuthType(Lcom/ibotta/api/model/auth/AuthType;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    .line 95
    iget-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    if-nez p1, :cond_0

    .line 96
    sget-object p1, Lcom/ibotta/api/model/auth/AuthType;->IBOTTA:Lcom/ibotta/api/model/auth/AuthType;

    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    :cond_0
    return-void
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 82
    iput p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerId:I

    return-void
.end method

.method public setCustomerSocialAuthCode(Ljava/lang/String;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerSocialAuthCode:Ljava/lang/String;

    return-void
.end method

.method public setCustomerSocialExpiration(Ljava/lang/Long;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerSocialExpiration:Ljava/lang/Long;

    return-void
.end method

.method public setCustomerSocialIdentifier(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerSocialIdentifier:Ljava/lang/String;

    return-void
.end method

.method public setCustomerSocialSecret(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerSocialSecret:Ljava/lang/String;

    return-void
.end method

.method public setCustomerSocialToken(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->customerSocialToken:Ljava/lang/String;

    return-void
.end method
