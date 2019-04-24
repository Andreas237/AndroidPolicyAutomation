.class public Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/CustomerPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private address:Ljava/lang/String;

.field private authType:Lcom/ibotta/api/model/auth/AuthType;

.field private birthDate:Ljava/lang/String;

.field private city:Ljava/lang/String;

.field private customerSocialExpiration:J

.field private customerSocialIdentifier:Ljava/lang/String;

.field private customerSocialSecret:Ljava/lang/String;

.field private customerSocialToken:Ljava/lang/String;

.field private deviceUdid:Ljava/lang/String;

.field private email:Ljava/lang/String;

.field private firstName:Ljava/lang/String;

.field private friend:Ljava/lang/String;

.field private gender:Lcom/ibotta/api/call/customer/Gender;

.field private installedApps:Ljava/lang/String;

.field private inviteCode:Ljava/lang/String;

.field private lastName:Ljava/lang/String;

.field private password:Ljava/lang/String;

.field private passwordConfirmation:Ljava/lang/String;

.field private phone:Ljava/lang/String;

.field private state:Ljava/lang/String;

.field private udid:Ljava/lang/String;

.field private zip:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddress()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthType()Lcom/ibotta/api/model/auth/AuthType;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    return-object v0
.end method

.method public getBirthDate()Ljava/lang/String;
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->birthDate:Ljava/lang/String;

    return-object v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->city:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerSocialExpiration()J
    .locals 2

    .line 314
    iget-wide v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->customerSocialExpiration:J

    return-wide v0
.end method

.method public getCustomerSocialIdentifier()Ljava/lang/String;
    .locals 1

    .line 290
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->customerSocialIdentifier:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerSocialSecret()Ljava/lang/String;
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->customerSocialSecret:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerSocialToken()Ljava/lang/String;
    .locals 1

    .line 298
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->customerSocialToken:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceUdid()Ljava/lang/String;
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->deviceUdid:Ljava/lang/String;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstName()Ljava/lang/String;
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public getFriend()Ljava/lang/String;
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->friend:Ljava/lang/String;

    return-object v0
.end method

.method public getGender()Lcom/ibotta/api/call/customer/Gender;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->gender:Lcom/ibotta/api/call/customer/Gender;

    return-object v0
.end method

.method public getInstalledApps()Ljava/lang/String;
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->installedApps:Ljava/lang/String;

    return-object v0
.end method

.method public getInviteCode()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->inviteCode:Ljava/lang/String;

    return-object v0
.end method

.method public getLastName()Ljava/lang/String;
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getPasswordConfirmation()Ljava/lang/String;
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->passwordConfirmation:Ljava/lang/String;

    return-object v0
.end method

.method public getPhone()Ljava/lang/String;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->phone:Ljava/lang/String;

    return-object v0
.end method

.method public getState()Ljava/lang/String;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->state:Ljava/lang/String;

    return-object v0
.end method

.method public getUdid()Ljava/lang/String;
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->udid:Ljava/lang/String;

    return-object v0
.end method

.method public getZip()Ljava/lang/String;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->zip:Ljava/lang/String;

    return-object v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->address:Ljava/lang/String;

    return-void
.end method

.method public setAuthType(Lcom/ibotta/api/model/auth/AuthType;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    .line 148
    iget-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    if-nez p1, :cond_0

    .line 149
    sget-object p1, Lcom/ibotta/api/model/auth/AuthType;->IBOTTA:Lcom/ibotta/api/model/auth/AuthType;

    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->authType:Lcom/ibotta/api/model/auth/AuthType;

    :cond_0
    return-void
.end method

.method public setBirthDate(Ljava/lang/String;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->birthDate:Ljava/lang/String;

    return-void
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->city:Ljava/lang/String;

    return-void
.end method

.method public setCustomerSocialExpiration(J)V
    .locals 0

    .line 318
    iput-wide p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->customerSocialExpiration:J

    return-void
.end method

.method public setCustomerSocialIdentifier(Ljava/lang/String;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->customerSocialIdentifier:Ljava/lang/String;

    return-void
.end method

.method public setCustomerSocialSecret(Ljava/lang/String;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->customerSocialSecret:Ljava/lang/String;

    return-void
.end method

.method public setCustomerSocialToken(Ljava/lang/String;)V
    .locals 0

    .line 302
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->customerSocialToken:Ljava/lang/String;

    return-void
.end method

.method public setDeviceUdid(Ljava/lang/String;)V
    .locals 0

    .line 278
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->deviceUdid:Ljava/lang/String;

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->email:Ljava/lang/String;

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->firstName:Ljava/lang/String;

    return-void
.end method

.method public setFriend(Ljava/lang/String;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->friend:Ljava/lang/String;

    return-void
.end method

.method public setGender(Lcom/ibotta/api/call/customer/Gender;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->gender:Lcom/ibotta/api/call/customer/Gender;

    return-void
.end method

.method public setInstalledApps(Ljava/lang/String;)V
    .locals 0

    .line 286
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->installedApps:Ljava/lang/String;

    return-void
.end method

.method public setInviteCode(Ljava/lang/String;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->inviteCode:Ljava/lang/String;

    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->lastName:Ljava/lang/String;

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->password:Ljava/lang/String;

    return-void
.end method

.method public setPasswordConfirmation(Ljava/lang/String;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->passwordConfirmation:Ljava/lang/String;

    return-void
.end method

.method public setPhone(Ljava/lang/String;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->phone:Ljava/lang/String;

    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->state:Ljava/lang/String;

    return-void
.end method

.method public setUdid(Ljava/lang/String;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->udid:Ljava/lang/String;

    return-void
.end method

.method public setZip(Ljava/lang/String;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->zip:Ljava/lang/String;

    return-void
.end method
