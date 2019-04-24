.class public Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
.super Ljava/lang/Object;
.source "Phonenumber.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/michaelrocks/libphonenumber/android/Phonenumber;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PhoneNumber"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private countryCodeSource_:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

.field private countryCode_:I

.field private extension_:Ljava/lang/String;

.field private hasCountryCode:Z

.field private hasCountryCodeSource:Z

.field private hasExtension:Z

.field private hasItalianLeadingZero:Z

.field private hasNationalNumber:Z

.field private hasNumberOfLeadingZeros:Z

.field private hasPreferredDomesticCarrierCode:Z

.field private hasRawInput:Z

.field private italianLeadingZero_:Z

.field private nationalNumber_:J

.field private numberOfLeadingZeros_:I

.field private preferredDomesticCarrierCode_:Ljava/lang/String;

.field private rawInput_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCode_:I

    .line 61
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->nationalNumber_:J

    .line 77
    const-string v0, ""

    iput-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->extension_:Ljava/lang/String;

    .line 96
    iput-boolean v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->italianLeadingZero_:Z

    .line 112
    const/4 v0, 0x1

    iput v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->numberOfLeadingZeros_:I

    .line 128
    const-string v0, ""

    iput-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->rawInput_:Ljava/lang/String;

    .line 166
    const-string v0, ""

    iput-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->preferredDomesticCarrierCode_:Ljava/lang/String;

    .line 40
    sget-object v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_PLUS_SIGN:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    iput-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCodeSource_:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    .line 41
    return-void
.end method


# virtual methods
.method public final clear()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 0

    .prologue
    .line 184
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearCountryCode()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 185
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearNationalNumber()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 186
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearExtension()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 187
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearItalianLeadingZero()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 188
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearNumberOfLeadingZeros()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 189
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearRawInput()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 190
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearCountryCodeSource()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 191
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearPreferredDomesticCarrierCode()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 192
    return-object p0
.end method

.method public clearCountryCode()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasCountryCode:Z

    .line 55
    iput v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCode_:I

    .line 56
    return-object p0
.end method

.method public clearCountryCodeSource()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1

    .prologue
    .line 159
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasCountryCodeSource:Z

    .line 160
    sget-object v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_PLUS_SIGN:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    iput-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCodeSource_:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    .line 161
    return-object p0
.end method

.method public clearExtension()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasExtension:Z

    .line 90
    const-string v0, ""

    iput-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->extension_:Ljava/lang/String;

    .line 91
    return-object p0
.end method

.method public clearItalianLeadingZero()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasItalianLeadingZero:Z

    .line 106
    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->italianLeadingZero_:Z

    .line 107
    return-object p0
.end method

.method public clearNationalNumber()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 2

    .prologue
    .line 70
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasNationalNumber:Z

    .line 71
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->nationalNumber_:J

    .line 72
    return-object p0
.end method

.method public clearNumberOfLeadingZeros()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasNumberOfLeadingZeros:Z

    .line 122
    const/4 v0, 0x1

    iput v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->numberOfLeadingZeros_:I

    .line 123
    return-object p0
.end method

.method public clearPreferredDomesticCarrierCode()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1

    .prologue
    .line 178
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasPreferredDomesticCarrierCode:Z

    .line 179
    const-string v0, ""

    iput-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->preferredDomesticCarrierCode_:Ljava/lang/String;

    .line 180
    return-object p0
.end method

.method public clearRawInput()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1

    .prologue
    .line 140
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasRawInput:Z

    .line 141
    const-string v0, ""

    iput-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->rawInput_:Ljava/lang/String;

    .line 142
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "that"    # Ljava/lang/Object;

    .prologue
    .line 240
    instance-of v0, p1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    if-eqz v0, :cond_0

    check-cast p1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .end local p1    # "that":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->exactlySameAs(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public exactlySameAs(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 6
    .param p1, "other"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 224
    if-nez p1, :cond_1

    move v0, v1

    .line 230
    :cond_0
    :goto_0
    return v0

    .line 227
    :cond_1
    if-eq p0, p1, :cond_0

    .line 230
    iget v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCode_:I

    iget v3, p1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCode_:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->nationalNumber_:J

    iget-wide v4, p1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->nationalNumber_:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->extension_:Ljava/lang/String;

    iget-object v3, p1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->extension_:Ljava/lang/String;

    .line 231
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->italianLeadingZero_:Z

    iget-boolean v3, p1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->italianLeadingZero_:Z

    if-ne v2, v3, :cond_2

    iget v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->numberOfLeadingZeros_:I

    iget v3, p1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->numberOfLeadingZeros_:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->rawInput_:Ljava/lang/String;

    iget-object v3, p1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->rawInput_:Ljava/lang/String;

    .line 233
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCodeSource_:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    iget-object v3, p1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCodeSource_:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->preferredDomesticCarrierCode_:Ljava/lang/String;

    iget-object v3, p1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->preferredDomesticCarrierCode_:Ljava/lang/String;

    .line 234
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 235
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasPreferredDomesticCarrierCode()Z

    move-result v2

    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasPreferredDomesticCarrierCode()Z

    move-result v3

    if-eq v2, v3, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public getCountryCode()I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCode_:I

    return v0
.end method

.method public getCountryCodeSource()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCodeSource_:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    return-object v0
.end method

.method public getExtension()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->extension_:Ljava/lang/String;

    return-object v0
.end method

.method public getNationalNumber()J
    .locals 2

    .prologue
    .line 63
    iget-wide v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->nationalNumber_:J

    return-wide v0
.end method

.method public getNumberOfLeadingZeros()I
    .locals 1

    .prologue
    .line 114
    iget v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->numberOfLeadingZeros_:I

    return v0
.end method

.method public getPreferredDomesticCarrierCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->preferredDomesticCarrierCode_:Ljava/lang/String;

    return-object v0
.end method

.method public getRawInput()Ljava/lang/String;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->rawInput_:Ljava/lang/String;

    return-object v0
.end method

.method public hasCountryCode()Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasCountryCode:Z

    return v0
.end method

.method public hasCountryCodeSource()Z
    .locals 1

    .prologue
    .line 148
    iget-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasCountryCodeSource:Z

    return v0
.end method

.method public hasExtension()Z
    .locals 1

    .prologue
    .line 78
    iget-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasExtension:Z

    return v0
.end method

.method public hasItalianLeadingZero()Z
    .locals 1

    .prologue
    .line 97
    iget-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasItalianLeadingZero:Z

    return v0
.end method

.method public hasNationalNumber()Z
    .locals 1

    .prologue
    .line 62
    iget-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasNationalNumber:Z

    return v0
.end method

.method public hasNumberOfLeadingZeros()Z
    .locals 1

    .prologue
    .line 113
    iget-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasNumberOfLeadingZeros:Z

    return v0
.end method

.method public hasPreferredDomesticCarrierCode()Z
    .locals 1

    .prologue
    .line 167
    iget-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasPreferredDomesticCarrierCode:Z

    return v0
.end method

.method public hasRawInput()Z
    .locals 1

    .prologue
    .line 129
    iget-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasRawInput:Z

    return v0
.end method

.method public hashCode()I
    .locals 6

    .prologue
    const/16 v3, 0x4d5

    const/16 v2, 0x4cf

    .line 249
    const/16 v0, 0x29

    .line 250
    .local v0, "hash":I
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v1

    add-int/lit16 v0, v1, 0x87d

    .line 251
    mul-int/lit8 v1, v0, 0x35

    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNationalNumber()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->hashCode()I

    move-result v4

    add-int v0, v1, v4

    .line 252
    mul-int/lit8 v1, v0, 0x35

    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    add-int v0, v1, v4

    .line 253
    mul-int/lit8 v4, v0, 0x35

    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->isItalianLeadingZero()Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    :goto_0
    add-int v0, v4, v1

    .line 254
    mul-int/lit8 v1, v0, 0x35

    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNumberOfLeadingZeros()I

    move-result v4

    add-int v0, v1, v4

    .line 255
    mul-int/lit8 v1, v0, 0x35

    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getRawInput()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    add-int v0, v1, v4

    .line 256
    mul-int/lit8 v1, v0, 0x35

    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCodeSource()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    move-result-object v4

    invoke-virtual {v4}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->hashCode()I

    move-result v4

    add-int v0, v1, v4

    .line 257
    mul-int/lit8 v1, v0, 0x35

    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getPreferredDomesticCarrierCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    add-int v0, v1, v4

    .line 258
    mul-int/lit8 v1, v0, 0x35

    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasPreferredDomesticCarrierCode()Z

    move-result v4

    if-eqz v4, :cond_1

    :goto_1
    add-int v0, v1, v2

    .line 259
    return v0

    :cond_0
    move v1, v3

    .line 253
    goto :goto_0

    :cond_1
    move v2, v3

    .line 258
    goto :goto_1
.end method

.method public isItalianLeadingZero()Z
    .locals 1

    .prologue
    .line 98
    iget-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->italianLeadingZero_:Z

    return v0
.end method

.method public mergeFrom(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 2
    .param p1, "other"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 196
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasCountryCode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setCountryCode(I)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 199
    :cond_0
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasNationalNumber()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNationalNumber()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setNationalNumber(J)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 202
    :cond_1
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasExtension()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 203
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setExtension(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 205
    :cond_2
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasItalianLeadingZero()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 206
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->isItalianLeadingZero()Z

    move-result v0

    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setItalianLeadingZero(Z)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 208
    :cond_3
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasNumberOfLeadingZeros()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 209
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNumberOfLeadingZeros()I

    move-result v0

    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setNumberOfLeadingZeros(I)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 211
    :cond_4
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasRawInput()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 212
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getRawInput()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setRawInput(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 214
    :cond_5
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasCountryCodeSource()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 215
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCodeSource()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setCountryCodeSource(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 217
    :cond_6
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasPreferredDomesticCarrierCode()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 218
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getPreferredDomesticCarrierCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setPreferredDomesticCarrierCode(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 220
    :cond_7
    return-object p0
.end method

.method public setCountryCode(I)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1
    .param p1, "value"    # I

    .prologue
    .line 49
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasCountryCode:Z

    .line 50
    iput p1, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCode_:I

    .line 51
    return-object p0
.end method

.method public setCountryCodeSource(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1
    .param p1, "value"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    .prologue
    .line 151
    if-nez p1, :cond_0

    .line 152
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 154
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasCountryCodeSource:Z

    .line 155
    iput-object p1, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCodeSource_:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    .line 156
    return-object p0
.end method

.method public setExtension(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 81
    if-nez p1, :cond_0

    .line 82
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 84
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasExtension:Z

    .line 85
    iput-object p1, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->extension_:Ljava/lang/String;

    .line 86
    return-object p0
.end method

.method public setItalianLeadingZero(Z)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1
    .param p1, "value"    # Z

    .prologue
    .line 100
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasItalianLeadingZero:Z

    .line 101
    iput-boolean p1, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->italianLeadingZero_:Z

    .line 102
    return-object p0
.end method

.method public setNationalNumber(J)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1
    .param p1, "value"    # J

    .prologue
    .line 65
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasNationalNumber:Z

    .line 66
    iput-wide p1, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->nationalNumber_:J

    .line 67
    return-object p0
.end method

.method public setNumberOfLeadingZeros(I)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1
    .param p1, "value"    # I

    .prologue
    .line 116
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasNumberOfLeadingZeros:Z

    .line 117
    iput p1, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->numberOfLeadingZeros_:I

    .line 118
    return-object p0
.end method

.method public setPreferredDomesticCarrierCode(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 170
    if-nez p1, :cond_0

    .line 171
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 173
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasPreferredDomesticCarrierCode:Z

    .line 174
    iput-object p1, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->preferredDomesticCarrierCode_:Ljava/lang/String;

    .line 175
    return-object p0
.end method

.method public setRawInput(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 132
    if-nez p1, :cond_0

    .line 133
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 135
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasRawInput:Z

    .line 136
    iput-object p1, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->rawInput_:Ljava/lang/String;

    .line 137
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 264
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 265
    .local v0, "outputString":Ljava/lang/StringBuilder;
    const-string v1, "Country Code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 266
    const-string v1, " National Number: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->nationalNumber_:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 267
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasItalianLeadingZero()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->isItalianLeadingZero()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 268
    const-string v1, " Leading Zero(s): true"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    :cond_0
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasNumberOfLeadingZeros()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 271
    const-string v1, " Number of leading zeros: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->numberOfLeadingZeros_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 273
    :cond_1
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasExtension()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 274
    const-string v1, " Extension: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->extension_:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    :cond_2
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasCountryCodeSource()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 277
    const-string v1, " Country Code Source: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->countryCodeSource_:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 279
    :cond_3
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasPreferredDomesticCarrierCode()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 280
    const-string v1, " Preferred Domestic Carrier Code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->preferredDomesticCarrierCode_:Ljava/lang/String;

    .line 281
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method
