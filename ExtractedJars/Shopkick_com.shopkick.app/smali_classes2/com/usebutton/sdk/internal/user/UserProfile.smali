.class public Lcom/usebutton/sdk/internal/user/UserProfile;
.super Ljava/lang/Object;
.source "UserProfile.java"


# static fields
.field static final ADDRESS_LINE_ONE:Ljava/lang/String; = "address_line_one"

.field static final ADDRESS_LINE_TWO:Ljava/lang/String; = "address_line_two"

.field static final CITY:Ljava/lang/String; = "city"

.field static final COUNTRY:Ljava/lang/String; = "country"

.field static final EMAIL:Ljava/lang/String; = "email"

.field static final FIRST_NAME:Ljava/lang/String; = "first_name"

.field static final LAST_NAME:Ljava/lang/String; = "last_name"

.field static final POSTAL_CODE:Ljava/lang/String; = "postal_code"

.field static final STATE:Ljava/lang/String; = "state"

.field private static final TAG:Ljava/lang/String; = "UserProfile"


# instance fields
.field private addressLineOne:Ljava/lang/String;

.field private addressLineTwo:Ljava/lang/String;

.field private city:Ljava/lang/String;

.field private country:Ljava/lang/String;

.field private email:Ljava/lang/String;

.field private firstName:Ljava/lang/String;

.field private lastName:Ljava/lang/String;

.field private postalCode:Ljava/lang/String;

.field private state:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    .line 32
    iput-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    .line 33
    iput-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    .line 34
    iput-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    .line 35
    iput-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineTwo:Ljava/lang/String;

    .line 36
    iput-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->city:Ljava/lang/String;

    .line 37
    iput-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->state:Ljava/lang/String;

    .line 38
    iput-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->postalCode:Ljava/lang/String;

    .line 39
    iput-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->country:Ljava/lang/String;

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

    .line 122
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 123
    new-instance p0, Lcom/usebutton/sdk/internal/user/UserProfile;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;-><init>()V

    const-string v1, "first_name"

    .line 126
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "first_name"

    .line 127
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setFirstName(Ljava/lang/String;)V

    :cond_0
    const-string v1, "last_name"

    .line 131
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "last_name"

    .line 132
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setLastName(Ljava/lang/String;)V

    :cond_1
    const-string v1, "email"

    .line 136
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "email"

    .line 137
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setEmail(Ljava/lang/String;)V

    :cond_2
    const-string v1, "address_line_one"

    .line 141
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "address_line_one"

    .line 142
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineOne(Ljava/lang/String;)V

    :cond_3
    const-string v1, "address_line_two"

    .line 146
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "address_line_two"

    .line 147
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setAddressLineTwo(Ljava/lang/String;)V

    :cond_4
    const-string v1, "city"

    .line 151
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "city"

    .line 152
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setCity(Ljava/lang/String;)V

    :cond_5
    const-string/jumbo v1, "state"

    .line 156
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string/jumbo v1, "state"

    .line 157
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setState(Ljava/lang/String;)V

    :cond_6
    const-string v1, "postal_code"

    .line 161
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "postal_code"

    .line 162
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->setPostalCode(Ljava/lang/String;)V

    :cond_7
    const-string v1, "country"

    .line 166
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v1, "country"

    .line 167
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/user/UserProfile;->setCountry(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_8
    return-object p0

    :catch_0
    move-exception p0

    .line 172
    sget-object v0, Lcom/usebutton/sdk/internal/user/UserProfile;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to convert JSON String into a UserProfile: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    invoke-virtual {p0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 172
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

    .line 211
    instance-of v0, p1, Lcom/usebutton/sdk/internal/user/UserProfile;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 216
    :cond_0
    check-cast p1, Lcom/usebutton/sdk/internal/user/UserProfile;

    .line 217
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    .line 218
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    .line 219
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    .line 220
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineTwo:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineTwo:Ljava/lang/String;

    .line 221
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->city:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->city:Ljava/lang/String;

    .line 222
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->state:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->state:Ljava/lang/String;

    .line 223
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->postalCode:Ljava/lang/String;

    iget-object v2, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->postalCode:Ljava/lang/String;

    .line 224
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->country:Ljava/lang/String;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/user/UserProfile;->country:Ljava/lang/String;

    .line 225
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getAddressLineOne()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    return-object v0
.end method

.method public getAddressLineTwo()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineTwo:Ljava/lang/String;

    return-object v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->city:Ljava/lang/String;

    return-object v0
.end method

.method public getCountry()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->country:Ljava/lang/String;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstName()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public getLastName()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public getPostalCode()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->postalCode:Ljava/lang/String;

    return-object v0
.end method

.method public getState()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->state:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 230
    iget-object v0, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    .line 231
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    .line 232
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    .line 233
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineTwo:Ljava/lang/String;

    .line 234
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->city:Ljava/lang/String;

    .line 235
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->state:Ljava/lang/String;

    .line 236
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->postalCode:Ljava/lang/String;

    .line 237
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->country:Ljava/lang/String;

    .line 238
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public setAddressLineOne(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineOne:Ljava/lang/String;

    return-void
.end method

.method public setAddressLineTwo(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->addressLineTwo:Ljava/lang/String;

    return-void
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->city:Ljava/lang/String;

    return-void
.end method

.method public setCountry(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->country:Ljava/lang/String;

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->email:Ljava/lang/String;

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->firstName:Ljava/lang/String;

    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->lastName:Ljava/lang/String;

    return-void
.end method

.method public setPostalCode(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->postalCode:Ljava/lang/String;

    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/usebutton/sdk/internal/user/UserProfile;->state:Ljava/lang/String;

    return-void
.end method

.method public toJson()Ljava/lang/String;
    .locals 4

    .line 186
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "first_name"

    .line 189
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFirstName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "last_name"

    .line 190
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "email"

    .line 191
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "address_line_one"

    .line 192
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineOne()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "address_line_two"

    .line 193
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineTwo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "city"

    .line 194
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCity()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v1, "state"

    .line 195
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getState()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "postal_code"

    .line 196
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getPostalCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "country"

    .line 197
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/user/UserProfile;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 200
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 202
    sget-object v1, Lcom/usebutton/sdk/internal/user/UserProfile;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to convert UserProfile into JSON String: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 202
    invoke-static {v1, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    return-object v0
.end method
