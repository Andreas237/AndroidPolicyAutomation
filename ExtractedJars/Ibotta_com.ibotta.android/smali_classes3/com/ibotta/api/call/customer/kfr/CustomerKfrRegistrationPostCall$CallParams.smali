.class public Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerKfrRegistrationPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private acceptedTos:Z

.field private address1:Ljava/lang/String;

.field private address2:Ljava/lang/String;

.field private birthdate:Ljava/lang/String;

.field private city:Ljava/lang/String;

.field private final customerId:I

.field private email:Ljava/lang/String;

.field private firstName:Ljava/lang/String;

.field private lastName:Ljava/lang/String;

.field private password:Ljava/lang/String;

.field private state:Ljava/lang/String;

.field private zipCode:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->customerId:I

    return-void
.end method


# virtual methods
.method public getAddress1()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->address1:Ljava/lang/String;

    return-object v0
.end method

.method public getAddress2()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->address2:Ljava/lang/String;

    return-object v0
.end method

.method public getBirthdate()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->birthdate:Ljava/lang/String;

    return-object v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->city:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerId()I
    .locals 1

    .line 90
    iget v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->customerId:I

    return v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstName()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public getLastName()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getState()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->state:Ljava/lang/String;

    return-object v0
.end method

.method public getZipCode()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->zipCode:Ljava/lang/String;

    return-object v0
.end method

.method public isAcceptedTos()Z
    .locals 1

    .line 174
    iget-boolean v0, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->acceptedTos:Z

    return v0
.end method

.method public setAcceptedTos(Z)V
    .locals 0

    .line 178
    iput-boolean p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->acceptedTos:Z

    return-void
.end method

.method public setAddress1(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->address1:Ljava/lang/String;

    return-void
.end method

.method public setAddress2(Ljava/lang/String;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->address2:Ljava/lang/String;

    return-void
.end method

.method public setBirthdate(Ljava/lang/String;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->birthdate:Ljava/lang/String;

    return-void
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->city:Ljava/lang/String;

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->email:Ljava/lang/String;

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->firstName:Ljava/lang/String;

    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->lastName:Ljava/lang/String;

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->password:Ljava/lang/String;

    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->state:Ljava/lang/String;

    return-void
.end method

.method public setZipCode(Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/ibotta/api/call/customer/kfr/CustomerKfrRegistrationPostCall$CallParams;->zipCode:Ljava/lang/String;

    return-void
.end method
