.class public Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;
.super Ljava/lang/Object;
.source "ShortNumberInfo.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;
    }
.end annotation


# static fields
.field private static final REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final logger:Ljava/util/logging/Logger;


# instance fields
.field private final countryCallingCodeToRegionCodeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final matcherApi:Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;

.field private final metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 44
    const-class v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->logger:Ljava/util/logging/Logger;

    .line 48
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT:Ljava/util/Set;

    .line 51
    sget-object v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT:Ljava/util/Set;

    const-string v1, "BR"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 52
    sget-object v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT:Ljava/util/Set;

    const-string v1, "CL"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 53
    sget-object v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT:Ljava/util/Set;

    const-string v1, "NI"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 54
    return-void
.end method

.method constructor <init>(Lio/michaelrocks/libphonenumber/android/MetadataSource;Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;)V
    .locals 1
    .param p1, "metadataSource"    # Lio/michaelrocks/libphonenumber/android/MetadataSource;
    .param p2, "matcherApi"    # Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    .line 79
    iput-object p2, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matcherApi:Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;

    .line 82
    invoke-static {}, Lio/michaelrocks/libphonenumber/android/CountryCodeToRegionCodeMap;->getCountryCodeToRegionCodeMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->countryCallingCodeToRegionCodeMap:Ljava/util/Map;

    .line 83
    return-void
.end method

.method private static getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;
    .locals 4
    .param p0, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 486
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 487
    .local v0, "nationalNumber":Ljava/lang/StringBuilder;
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->isItalianLeadingZero()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 488
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNumberOfLeadingZeros()I

    move-result v2

    new-array v1, v2, [C

    .line 489
    .local v1, "zeros":[C
    const/16 v2, 0x30

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([CC)V

    .line 490
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    .end local v1    # "zeros":[C
    :cond_0
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNationalNumber()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 493
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method private getRegionCodeForShortNumberFromRegionList(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .local p2, "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v3, 0x0

    .line 317
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_1

    .line 331
    :cond_0
    :goto_0
    return-object v3

    .line 319
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2

    .line 320
    const/4 v3, 0x0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_0

    .line 322
    :cond_2
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v0

    .line 323
    .local v0, "nationalNumber":Ljava/lang/String;
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 324
    .local v2, "regionCode":Ljava/lang/String;
    iget-object v5, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    invoke-interface {v5, v2}, Lio/michaelrocks/libphonenumber/android/MetadataSource;->getShortNumberMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v1

    .line 325
    .local v1, "phoneMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-eqz v1, :cond_3

    .line 326
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getShortCode()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v5

    invoke-direct {p0, v0, v5}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matchesPossibleNumberAndNationalNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v5

    if-eqz v5, :cond_3

    move-object v3, v2

    .line 328
    goto :goto_0
.end method

.method private getRegionCodesForCountryCode(I)Ljava/util/List;
    .locals 3
    .param p1, "countryCallingCode"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 91
    iget-object v1, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->countryCallingCodeToRegionCodeMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 92
    .local v0, "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    .end local v0    # "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method private matchesEmergencyNumberHelper(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 5
    .param p1, "number"    # Ljava/lang/String;
    .param p2, "regionCode"    # Ljava/lang/String;
    .param p3, "allowPrefixMatch"    # Z

    .prologue
    const/4 v0, 0x0

    .line 433
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->extractPossibleNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 434
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->PLUS_CHARS_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v4, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 449
    :cond_0
    :goto_0
    return v0

    .line 440
    :cond_1
    iget-object v4, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    invoke-interface {v4, p2}, Lio/michaelrocks/libphonenumber/android/MetadataSource;->getShortNumberMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v2

    .line 441
    .local v2, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->hasEmergency()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 445
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeDigitsOnly(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 446
    .local v3, "normalizedNumber":Ljava/lang/String;
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getEmergency()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    .line 447
    .local v1, "emergencyDesc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    if-eqz p3, :cond_2

    sget-object v4, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->REGIONS_WHERE_EMERGENCY_NUMBERS_MUST_BE_EXACT:Ljava/util/Set;

    .line 448
    invoke-interface {v4, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const/4 v0, 0x1

    .line 449
    .local v0, "allowPrefixMatchForRegion":Z
    :cond_2
    iget-object v4, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matcherApi:Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;

    invoke-interface {v4, v3, v1, v0}, Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;->matchesNationalNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;Z)Z

    move-result v0

    goto :goto_0
.end method

.method private matchesPossibleNumberAndNationalNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z
    .locals 3
    .param p1, "number"    # Ljava/lang/String;
    .param p2, "numberDesc"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    .prologue
    const/4 v0, 0x0

    .line 500
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLengthCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 501
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLengthList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 504
    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matcherApi:Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;

    invoke-interface {v1, p1, p2, v0}, Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;->matchesNationalNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;Z)Z

    move-result v0

    goto :goto_0
.end method

.method private regionDialingFromMatchesNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Z
    .locals 2
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "regionDialingFrom"    # Ljava/lang/String;

    .prologue
    .line 102
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v1

    invoke-direct {p0, v1}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getRegionCodesForCountryCode(I)Ljava/util/List;

    move-result-object v0

    .line 103
    .local v0, "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    return v1
.end method


# virtual methods
.method public connectsToEmergencyNumber(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .param p1, "number"    # Ljava/lang/String;
    .param p2, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 412
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matchesEmergencyNumberHelper(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method getExampleShortNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 351
    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    invoke-interface {v2, p1}, Lio/michaelrocks/libphonenumber/android/MetadataSource;->getShortNumberMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v1

    .line 352
    .local v1, "phoneMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-nez v1, :cond_0

    .line 353
    const-string v2, ""

    .line 359
    :goto_0
    return-object v2

    .line 355
    :cond_0
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getShortCode()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    .line 356
    .local v0, "desc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->hasExampleNumber()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 357
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getExampleNumber()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 359
    :cond_1
    const-string v2, ""

    goto :goto_0
.end method

.method getExampleShortNumberForCost(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;)Ljava/lang/String;
    .locals 4
    .param p1, "regionCode"    # Ljava/lang/String;
    .param p2, "cost"    # Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    .prologue
    .line 372
    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    invoke-interface {v2, p1}, Lio/michaelrocks/libphonenumber/android/MetadataSource;->getShortNumberMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v1

    .line 373
    .local v1, "phoneMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-nez v1, :cond_0

    .line 374
    const-string v2, ""

    .line 394
    :goto_0
    return-object v2

    .line 376
    :cond_0
    const/4 v0, 0x0

    .line 377
    .local v0, "desc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    sget-object v2, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$1;->$SwitchMap$io$michaelrocks$libphonenumber$android$ShortNumberInfo$ShortNumberCost:[I

    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 391
    :goto_1
    :pswitch_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->hasExampleNumber()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 392
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getExampleNumber()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 379
    :pswitch_1
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getTollFree()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    .line 380
    goto :goto_1

    .line 382
    :pswitch_2
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getStandardRate()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    .line 383
    goto :goto_1

    .line 385
    :pswitch_3
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPremiumRate()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    .line 386
    goto :goto_1

    .line 394
    :cond_1
    const-string v2, ""

    goto :goto_0

    .line 377
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public getExpectedCost(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;
    .locals 9
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 281
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v4

    invoke-direct {p0, v4}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getRegionCodesForCountryCode(I)Ljava/util/List;

    move-result-object v3

    .line 282
    .local v3, "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_1

    .line 283
    sget-object v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->UNKNOWN_COST:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    .line 309
    :cond_0
    :goto_0
    return-object v0

    .line 285
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2

    .line 286
    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p0, p1, v4}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getExpectedCostForRegion(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    move-result-object v0

    goto :goto_0

    .line 288
    :cond_2
    sget-object v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->TOLL_FREE:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    .line 289
    .local v0, "cost":Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    :pswitch_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 290
    .local v2, "regionCode":Ljava/lang/String;
    invoke-virtual {p0, p1, v2}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getExpectedCostForRegion(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    move-result-object v1

    .line 291
    .local v1, "costForRegion":Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;
    sget-object v5, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$1;->$SwitchMap$io$michaelrocks$libphonenumber$android$ShortNumberInfo$ShortNumberCost:[I

    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    .line 306
    sget-object v5, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->logger:Ljava/util/logging/Logger;

    sget-object v6, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unrecognised cost for region: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    goto :goto_1

    .line 293
    :pswitch_1
    sget-object v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->PREMIUM_RATE:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    goto :goto_0

    .line 295
    :pswitch_2
    sget-object v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->UNKNOWN_COST:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    .line 296
    goto :goto_1

    .line 298
    :pswitch_3
    sget-object v5, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->UNKNOWN_COST:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    if-eq v0, v5, :cond_3

    .line 299
    sget-object v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->STANDARD_RATE:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    goto :goto_1

    .line 291
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public getExpectedCostForRegion(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;
    .locals 4
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "regionDialingFrom"    # Ljava/lang/String;

    .prologue
    .line 222
    invoke-direct {p0, p1, p2}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->regionDialingFromMatchesNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 223
    sget-object v2, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->UNKNOWN_COST:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    .line 256
    :goto_0
    return-object v2

    .line 226
    :cond_0
    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    invoke-interface {v2, p2}, Lio/michaelrocks/libphonenumber/android/MetadataSource;->getShortNumberMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    .line 228
    .local v0, "phoneMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-nez v0, :cond_1

    .line 229
    sget-object v2, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->UNKNOWN_COST:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    goto :goto_0

    .line 232
    :cond_1
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v1

    .line 237
    .local v1, "shortNumber":Ljava/lang/String;
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v2

    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLengthList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 238
    sget-object v2, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->UNKNOWN_COST:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    goto :goto_0

    .line 243
    :cond_2
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPremiumRate()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matchesPossibleNumberAndNationalNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 244
    sget-object v2, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->PREMIUM_RATE:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    goto :goto_0

    .line 246
    :cond_3
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getStandardRate()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matchesPossibleNumberAndNationalNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 247
    sget-object v2, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->STANDARD_RATE:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    goto :goto_0

    .line 249
    :cond_4
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getTollFree()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matchesPossibleNumberAndNationalNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 250
    sget-object v2, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->TOLL_FREE:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    goto :goto_0

    .line 252
    :cond_5
    invoke-virtual {p0, v1, p2}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->isEmergencyNumber(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 254
    sget-object v2, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->TOLL_FREE:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    goto :goto_0

    .line 256
    :cond_6
    sget-object v2, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;->UNKNOWN_COST:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo$ShortNumberCost;

    goto :goto_0
.end method

.method getSupportedRegions()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 339
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public isCarrierSpecific(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 5
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 464
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v4

    invoke-direct {p0, v4}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getRegionCodesForCountryCode(I)Ljava/util/List;

    move-result-object v3

    .line 465
    .local v3, "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0, p1, v3}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getRegionCodeForShortNumberFromRegionList(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    .line 466
    .local v2, "regionCode":Ljava/lang/String;
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v0

    .line 467
    .local v0, "nationalNumber":Ljava/lang/String;
    iget-object v4, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    invoke-interface {v4, v2}, Lio/michaelrocks/libphonenumber/android/MetadataSource;->getShortNumberMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v1

    .line 468
    .local v1, "phoneMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-eqz v1, :cond_0

    .line 470
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getCarrierSpecific()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v4

    .line 469
    invoke-direct {p0, v0, v4}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matchesPossibleNumberAndNationalNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    .line 468
    :goto_0
    return v4

    .line 469
    :cond_0
    const/4 v4, 0x0

    goto :goto_0
.end method

.method public isEmergencyNumber(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .param p1, "number"    # Ljava/lang/String;
    .param p2, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 428
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matchesEmergencyNumberHelper(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public isPossibleShortNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 7
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 137
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v4

    invoke-direct {p0, v4}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getRegionCodesForCountryCode(I)Ljava/util/List;

    move-result-object v2

    .line 138
    .local v2, "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    .line 139
    .local v3, "shortNumberLength":I
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 140
    .local v1, "region":Ljava/lang/String;
    iget-object v5, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    invoke-interface {v5, v1}, Lio/michaelrocks/libphonenumber/android/MetadataSource;->getShortNumberMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    .line 141
    .local v0, "phoneMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-eqz v0, :cond_0

    .line 144
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v5

    invoke-virtual {v5}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLengthList()Ljava/util/List;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 145
    const/4 v4, 0x1

    .line 148
    .end local v0    # "phoneMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .end local v1    # "region":Ljava/lang/String;
    :goto_0
    return v4

    :cond_1
    const/4 v4, 0x0

    goto :goto_0
.end method

.method public isPossibleShortNumberForRegion(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Z
    .locals 4
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "regionDialingFrom"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 115
    invoke-direct {p0, p1, p2}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->regionDialingFromMatchesNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 124
    :cond_0
    :goto_0
    return v2

    .line 118
    :cond_1
    iget-object v3, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    .line 119
    invoke-interface {v3, p2}, Lio/michaelrocks/libphonenumber/android/MetadataSource;->getShortNumberMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v1

    .line 120
    .local v1, "phoneMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-eqz v1, :cond_0

    .line 123
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    .line 124
    .local v0, "numberLength":I
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v2

    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLengthList()Ljava/util/List;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0
.end method

.method public isValidShortNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 4
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    const/4 v2, 0x1

    .line 188
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v3

    invoke-direct {p0, v3}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getRegionCodesForCountryCode(I)Ljava/util/List;

    move-result-object v1

    .line 189
    .local v1, "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getRegionCodeForShortNumberFromRegionList(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 190
    .local v0, "regionCode":Ljava/lang/String;
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v2, :cond_0

    if-eqz v0, :cond_0

    .line 195
    :goto_0
    return v2

    :cond_0
    invoke-virtual {p0, p1, v0}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->isValidShortNumberForRegion(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Z

    move-result v2

    goto :goto_0
.end method

.method public isValidShortNumberForRegion(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Z
    .locals 6
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "regionDialingFrom"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x0

    .line 161
    invoke-direct {p0, p1, p2}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->regionDialingFromMatchesNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 175
    :cond_0
    :goto_0
    return v4

    .line 164
    :cond_1
    iget-object v5, p0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    .line 165
    invoke-interface {v5, p2}, Lio/michaelrocks/libphonenumber/android/MetadataSource;->getShortNumberMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v1

    .line 166
    .local v1, "phoneMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-eqz v1, :cond_0

    .line 169
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v2

    .line 170
    .local v2, "shortNumber":Ljava/lang/String;
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    .line 171
    .local v0, "generalDesc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    invoke-direct {p0, v2, v0}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matchesPossibleNumberAndNationalNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 174
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getShortCode()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v3

    .line 175
    .local v3, "shortNumberDesc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    invoke-direct {p0, v2, v3}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;->matchesPossibleNumberAndNationalNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v4

    goto :goto_0
.end method
