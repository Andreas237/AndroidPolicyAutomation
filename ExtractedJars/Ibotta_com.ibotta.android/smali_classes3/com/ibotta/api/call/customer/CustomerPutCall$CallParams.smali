.class public Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerPutCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/CustomerPutCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private address:Ljava/lang/String;

.field private birthDate:Ljava/lang/String;

.field private city:Ljava/lang/String;

.field private currentPassword:Ljava/lang/String;

.field private customerId:I

.field private email:Ljava/lang/String;

.field private firstName:Ljava/lang/String;

.field private gender:Lcom/ibotta/api/call/customer/Gender;

.field private lastName:Ljava/lang/String;

.field private password:Ljava/lang/String;

.field private phone:Ljava/lang/String;

.field private state:Ljava/lang/String;

.field private udid:Ljava/lang/String;

.field private zip:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddress()Ljava/lang/String;
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getBirthDate()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->birthDate:Ljava/lang/String;

    return-object v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->city:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrentPassword()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->currentPassword:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerId()I
    .locals 1

    .line 118
    iget v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->customerId:I

    return v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstName()Ljava/lang/String;
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public getGender()Lcom/ibotta/api/call/customer/Gender;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->gender:Lcom/ibotta/api/call/customer/Gender;

    return-object v0
.end method

.method public getLastName()Ljava/lang/String;
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getPhone()Ljava/lang/String;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->phone:Ljava/lang/String;

    return-object v0
.end method

.method public getState()Ljava/lang/String;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->state:Ljava/lang/String;

    return-object v0
.end method

.method public getUdid()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->udid:Ljava/lang/String;

    return-object v0
.end method

.method public getZip()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->zip:Ljava/lang/String;

    return-object v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->address:Ljava/lang/String;

    return-void
.end method

.method public setBirthDate(Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->birthDate:Ljava/lang/String;

    return-void
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->city:Ljava/lang/String;

    return-void
.end method

.method public setCurrentPassword(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->currentPassword:Ljava/lang/String;

    return-void
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 122
    iput p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->customerId:I

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->email:Ljava/lang/String;

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 0

    .line 226
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->firstName:Ljava/lang/String;

    return-void
.end method

.method public setGender(Lcom/ibotta/api/call/customer/Gender;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->gender:Lcom/ibotta/api/call/customer/Gender;

    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->lastName:Ljava/lang/String;

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->password:Ljava/lang/String;

    return-void
.end method

.method public setPhone(Ljava/lang/String;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->phone:Ljava/lang/String;

    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 0

    .line 218
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->state:Ljava/lang/String;

    return-void
.end method

.method public setUdid(Ljava/lang/String;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->udid:Ljava/lang/String;

    return-void
.end method

.method public setZip(Ljava/lang/String;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->zip:Ljava/lang/String;

    return-void
.end method
