.class public Lcom/usebutton/sdk/internal/user/UserProfile;
.super Ljava/lang/Object;
.source "UserProfile.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final PHONE_NUMBER_REGEX:Ljava/lang/String; = "[^0-9]"

.field private static final TAG:Ljava/lang/String; = "UserProfile"


# instance fields
.field private addressLineOne:Ljava/lang/String;

.field private addressLineTwo:Ljava/lang/String;

.field private billingAddressLineOne:Ljava/lang/String;

.field private billingAddressLineTwo:Ljava/lang/String;

.field private billingCity:Ljava/lang/String;

.field private billingCountry:Ljava/lang/String;

.field private billingPostalCode:Ljava/lang/String;

.field private billingState:Ljava/lang/String;

.field private city:Ljava/lang/String;

.field private country:Ljava/lang/String;

.field private email:Ljava/lang/String;

.field private firstName:Ljava/lang/String;

.field private lastName:Ljava/lang/String;

.field private phoneNumber:Ljava/lang/String;

.field private postalCode:Ljava/lang/String;

.field private state:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;)Lcom/usebutton/sdk/internal/user/UserProfile;
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 192
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-static {p0}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    .line 193
    new-instance v0, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    const-string v1, "PersonalDetails.FirstName"

    .line 196
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "PersonalDetails.FirstName"

    .line 197
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setFirstName(Ljava/lang/String;)V

    :cond_0
    const-string v1, "PersonalDetails.LastName"

    .line 201
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "PersonalDetails.LastName"

    .line 202
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setLastName(Ljava/lang/String;)V

    :cond_1
    const-string v1, "ContactDetails.Emails.Email.Address"

    .line 206
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "ContactDetails.Emails.Email.Address"

    .line 207
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setEmail(Ljava/lang/String;)V

    :cond_2
    const-string v1, "ContactDetails.CellPhones.CellPhone.Number"

    .line 211
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "ContactDetails.CellPhones.CellPhone.Number"

    .line 212
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setPhoneNumber(Ljava/lang/String;)V

    :cond_3
    const-string v1, "AddressDetails.PostalAddress.AddressLine1"

    .line 216
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "AddressDetails.PostalAddress.AddressLine1"

    .line 217
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineOne(Ljava/lang/String;)V

    :cond_4
    const-string v1, "AddressDetails.PostalAddress.AddressLine2"

    .line 221
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "AddressDetails.PostalAddress.AddressLine2"

    .line 222
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineTwo(Ljava/lang/String;)V

    :cond_5
    const-string v1, "AddressDetails.PostalAddress.Suburb"

    .line 226
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "AddressDetails.PostalAddress.Suburb"

    .line 227
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setCity(Ljava/lang/String;)V

    :cond_6
    const-string v1, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 231
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 232
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setState(Ljava/lang/String;)V

    :cond_7
    const-string v1, "AddressDetails.PostalAddress.PostalCode"

    .line 236
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v1, "AddressDetails.PostalAddress.PostalCode"

    .line 237
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setPostalCode(Ljava/lang/String;)V

    :cond_8
    const-string v1, "AddressDetails.PostalAddress.Country"

    .line 241
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    const-string v1, "AddressDetails.PostalAddress.Country"

    .line 242
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setCountry(Ljava/lang/String;)V

    :cond_9
    const-string v1, "AddressDetails.BillingAddress.AddressLine1"

    .line 246
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    const-string v1, "AddressDetails.BillingAddress.AddressLine1"

    .line 248
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 247
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingAddressLineOne(Ljava/lang/String;)V

    :cond_a
    const-string v1, "AddressDetails.BillingAddress.AddressLine2"

    .line 252
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "AddressDetails.BillingAddress.AddressLine2"

    .line 254
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 253
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingAddressLineTwo(Ljava/lang/String;)V

    :cond_b
    const-string v1, "AddressDetails.BillingAddress.Suburb"

    .line 258
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    const-string v1, "AddressDetails.BillingAddress.Suburb"

    .line 259
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingCity(Ljava/lang/String;)V

    :cond_c
    const-string v1, "AddressDetails.BillingAddress.AdministrativeArea"

    .line 263
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v1, "AddressDetails.BillingAddress.AdministrativeArea"

    .line 264
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingState(Ljava/lang/String;)V

    :cond_d
    const-string v1, "AddressDetails.BillingAddress.PostalCode"

    .line 268
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "AddressDetails.BillingAddress.PostalCode"

    .line 269
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingPostalCode(Ljava/lang/String;)V

    :cond_e
    const-string v1, "AddressDetails.BillingAddress.Country"

    .line 273
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    const-string v1, "AddressDetails.BillingAddress.Country"

    .line 274
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->setBillingCountry(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_f
    return-object v0

    :catch_0
    move-exception p0

    .line 279
    sget-object v0, Lcom/usebutton/sdk/internal/user/UserProfile;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to convert JSON String into a UserProfile: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 279
    invoke-static {v0, p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 325
    instance-of v0, p1, Lcom/usebutton/sdk/internal/user/UserProfile;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 330
    :cond_0
    check-cast p1, Lcom/usebutton/sdk/internal/user/UserProfile;

    .line 331
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    .line 332
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    .line 333
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    .line 334
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineTwo:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineTwo:Ljava/lang/String;

    .line 335
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->city:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->city:Ljava/lang/String;

    .line 336
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->state:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->state:Ljava/lang/String;

    .line 337
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->postalCode:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->postalCode:Ljava/lang/String;

    .line 338
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->country:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->country:Ljava/lang/String;

    .line 339
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingAddressLineOne:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->billingAddressLineOne:Ljava/lang/String;

    .line 340
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingAddressLineTwo:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->billingAddressLineTwo:Ljava/lang/String;

    .line 341
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingCity:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->billingCity:Ljava/lang/String;

    .line 342
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingState:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->billingState:Ljava/lang/String;

    .line 343
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingPostalCode:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->billingPostalCode:Ljava/lang/String;

    .line 344
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingCountry:Ljava/lang/String;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->billingCountry:Ljava/lang/String;

    .line 345
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getAddressLineOne()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    return-object v0
.end method

.method public getAddressLineTwo()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineTwo:Ljava/lang/String;

    return-object v0
.end method

.method public getBillingAddressLineOne()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingAddressLineOne:Ljava/lang/String;

    return-object v0
.end method

.method public getBillingAddressLineTwo()Ljava/lang/String;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingAddressLineTwo:Ljava/lang/String;

    return-object v0
.end method

.method public getBillingCity()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingCity:Ljava/lang/String;

    return-object v0
.end method

.method public getBillingCountry()Ljava/lang/String;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingCountry:Ljava/lang/String;

    return-object v0
.end method

.method public getBillingPostalCode()Ljava/lang/String;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingPostalCode:Ljava/lang/String;

    return-object v0
.end method

.method public getBillingState()Ljava/lang/String;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingState:Ljava/lang/String;

    return-object v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->city:Ljava/lang/String;

    return-object v0
.end method

.method public getCountry()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->country:Ljava/lang/String;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstName()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public getFullName()Ljava/lang/String;
    .locals 4

    .line 61
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v0, "%s %s"

    const/4 v1, 0x2

    .line 63
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, ""

    :goto_0
    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, ""

    :goto_1
    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLastName()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->phoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getPostalCode()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->postalCode:Ljava/lang/String;

    return-object v0
.end method

.method public getState()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->state:Ljava/lang/String;

    return-object v0
.end method

.method public hasUserDataForFillCard()Z
    .locals 1

    .line 362
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 363
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 364
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 365
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0xe

    .line 350
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineTwo:Ljava/lang/String;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->city:Ljava/lang/String;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->state:Ljava/lang/String;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->postalCode:Ljava/lang/String;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingAddressLineOne:Ljava/lang/String;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingAddressLineTwo:Ljava/lang/String;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingCity:Ljava/lang/String;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingState:Ljava/lang/String;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingPostalCode:Ljava/lang/String;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingCountry:Ljava/lang/String;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public setAddressLineOne(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    return-void
.end method

.method public setAddressLineTwo(Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineTwo:Ljava/lang/String;

    return-void
.end method

.method public setBillingAddressLineOne(Ljava/lang/String;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingAddressLineOne:Ljava/lang/String;

    return-void
.end method

.method public setBillingAddressLineTwo(Ljava/lang/String;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingAddressLineTwo:Ljava/lang/String;

    return-void
.end method

.method public setBillingCity(Ljava/lang/String;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingCity:Ljava/lang/String;

    return-void
.end method

.method public setBillingCountry(Ljava/lang/String;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingCountry:Ljava/lang/String;

    return-void
.end method

.method public setBillingPostalCode(Ljava/lang/String;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingPostalCode:Ljava/lang/String;

    return-void
.end method

.method public setBillingState(Ljava/lang/String;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->billingState:Ljava/lang/String;

    return-void
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->city:Ljava/lang/String;

    return-void
.end method

.method public setCountry(Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->country:Ljava/lang/String;

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "[^0-9]"

    const-string v1, ""

    .line 129
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->phoneNumber:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 131
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->phoneNumber:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public setPostalCode(Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->postalCode:Ljava/lang/String;

    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->state:Ljava/lang/String;

    return-void
.end method

.method public toJson()Ljava/lang/String;
    .locals 4

    .line 293
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "PersonalDetails.FirstName"

    .line 296
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "PersonalDetails.LastName"

    .line 297
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ContactDetails.Emails.Email.Address"

    .line 298
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ContactDetails.CellPhones.CellPhone.Number"

    .line 299
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPhoneNumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.PostalAddress.AddressLine1"

    .line 300
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineOne()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.PostalAddress.AddressLine2"

    .line 301
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineTwo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.PostalAddress.Suburb"

    .line 302
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCity()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.PostalAddress.AdministrativeArea"

    .line 303
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getState()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.PostalAddress.PostalCode"

    .line 304
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPostalCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.PostalAddress.Country"

    .line 305
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.BillingAddress.AddressLine1"

    .line 306
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingAddressLineOne()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.BillingAddress.AddressLine2"

    .line 307
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingAddressLineTwo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.BillingAddress.Suburb"

    .line 308
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingCity()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.BillingAddress.AdministrativeArea"

    .line 309
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingState()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.BillingAddress.PostalCode"

    .line 310
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingPostalCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "AddressDetails.BillingAddress.Country"

    .line 311
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getBillingCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 314
    instance-of v1, v0, Lorg/json/JSONObject;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    check-cast v0, Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->toString(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    .line 316
    sget-object v1, Lcom/usebutton/sdk/internal/user/UserProfile;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to convert UserProfile into JSON String: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 316
    invoke-static {v1, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    return-object v0
.end method
