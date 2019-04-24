.class public Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;
.super Ljava/lang/Object;
.source "PhoneNumberUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency;,
        Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;,
        Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;,
        Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;,
        Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;
    }
.end annotation


# static fields
.field private static final ALL_PLUS_NUMBER_GROUPING_SYMBOLS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Character;",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field private static final ALPHA_MAPPINGS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Character;",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field private static final ALPHA_PHONE_MAPPINGS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Character;",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field private static final CAPTURING_DIGIT_PATTERN:Ljava/util/regex/Pattern;

.field private static final CAPTURING_EXTN_DIGITS:Ljava/lang/String; = "(\\p{Nd}{1,7})"

.field private static final CC_PATTERN:Ljava/util/regex/Pattern;

.field private static final COLOMBIA_MOBILE_TO_FIXED_LINE_PREFIX:Ljava/lang/String; = "3"

.field private static final DEFAULT_EXTN_PREFIX:Ljava/lang/String; = " ext. "

.field private static final DIALLABLE_CHAR_MAPPINGS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Character;",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field private static final DIGITS:Ljava/lang/String; = "\\p{Nd}"

.field private static final EXTN_PATTERN:Ljava/util/regex/Pattern;

.field static final EXTN_PATTERNS_FOR_MATCHING:Ljava/lang/String;

.field private static final EXTN_PATTERNS_FOR_PARSING:Ljava/lang/String;

.field private static final FG_PATTERN:Ljava/util/regex/Pattern;

.field private static final FIRST_GROUP_ONLY_PREFIX_PATTERN:Ljava/util/regex/Pattern;

.field private static final FIRST_GROUP_PATTERN:Ljava/util/regex/Pattern;

.field private static final GEO_MOBILE_COUNTRIES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final MAX_INPUT_STRING_LENGTH:I = 0xfa

.field static final MAX_LENGTH_COUNTRY_CODE:I = 0x3

.field static final MAX_LENGTH_FOR_NSN:I = 0x11

.field private static final MIN_LENGTH_FOR_NSN:I = 0x2

.field private static final MOBILE_TOKEN_MAPPINGS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final NANPA_COUNTRY_CODE:I = 0x1

.field static final NON_DIGITS_PATTERN:Ljava/util/regex/Pattern;

.field private static final NP_PATTERN:Ljava/util/regex/Pattern;

.field static final PLUS_CHARS:Ljava/lang/String; = "+\uff0b"

.field static final PLUS_CHARS_PATTERN:Ljava/util/regex/Pattern;

.field static final PLUS_SIGN:C = '+'

.field static final REGEX_FLAGS:I = 0x42

.field public static final REGION_CODE_FOR_NON_GEO_ENTITY:Ljava/lang/String; = "001"

.field private static final RFC3966_EXTN_PREFIX:Ljava/lang/String; = ";ext="

.field private static final RFC3966_ISDN_SUBADDRESS:Ljava/lang/String; = ";isub="

.field private static final RFC3966_PHONE_CONTEXT:Ljava/lang/String; = ";phone-context="

.field private static final RFC3966_PREFIX:Ljava/lang/String; = "tel:"

.field private static final SECOND_NUMBER_START:Ljava/lang/String; = "[\\\\/] *x"

.field static final SECOND_NUMBER_START_PATTERN:Ljava/util/regex/Pattern;

.field private static final SEPARATOR_PATTERN:Ljava/util/regex/Pattern;

.field private static final STAR_SIGN:C = '*'

.field private static final UNIQUE_INTERNATIONAL_PREFIX:Ljava/util/regex/Pattern;

.field private static final UNKNOWN_REGION:Ljava/lang/String; = "ZZ"

.field private static final UNWANTED_END_CHARS:Ljava/lang/String; = "[[\\P{N}&&\\P{L}]&&[^#]]+$"

.field static final UNWANTED_END_CHAR_PATTERN:Ljava/util/regex/Pattern;

.field private static final VALID_ALPHA:Ljava/lang/String;

.field private static final VALID_ALPHA_PHONE_PATTERN:Ljava/util/regex/Pattern;

.field private static final VALID_PHONE_NUMBER:Ljava/lang/String;

.field private static final VALID_PHONE_NUMBER_PATTERN:Ljava/util/regex/Pattern;

.field static final VALID_PUNCTUATION:Ljava/lang/String; = "-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e"

.field private static final VALID_START_CHAR:Ljava/lang/String; = "[+\uff0b\\p{Nd}]"

.field private static final VALID_START_CHAR_PATTERN:Ljava/util/regex/Pattern;

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

.field private final countryCodesForNonGeographicalRegion:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

.field private final nanpaRegions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

.field private volatile shortNumberInfo:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;

.field private final supportedRegions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .prologue
    .line 58
    const-class v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    .line 125
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 126
    .local v8, "mobileTokenMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/String;>;"
    const/16 v11, 0x34

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const-string v12, "1"

    invoke-virtual {v8, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    const/16 v11, 0x36

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const-string v12, "9"

    invoke-virtual {v8, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    invoke-static {v8}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->MOBILE_TOKEN_MAPPINGS:Ljava/util/Map;

    .line 130
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 131
    .local v7, "geoMobileCountriesWithoutMobileAreaCodes":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/Integer;>;"
    const/16 v11, 0x56

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 133
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES:Ljava/util/Set;

    .line 135
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 136
    .local v6, "geoMobileCountries":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/Integer;>;"
    const/16 v11, 0x34

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 137
    const/16 v11, 0x36

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 138
    const/16 v11, 0x37

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 139
    const/16 v11, 0x3e

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 140
    invoke-virtual {v6, v7}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    .line 141
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->GEO_MOBILE_COUNTRIES:Ljava/util/Set;

    .line 145
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 146
    .local v2, "asciiDigitMappings":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Character;Ljava/lang/Character;>;"
    const/16 v11, 0x30

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x30

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v2, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    const/16 v11, 0x31

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x31

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v2, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    const/16 v11, 0x32

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x32

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v2, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    const/16 v11, 0x33

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x33

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v2, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    const/16 v11, 0x34

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x34

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v2, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    const/16 v11, 0x35

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x35

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v2, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    const/16 v11, 0x36

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x36

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v2, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    const/16 v11, 0x37

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x37

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v2, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    const/16 v11, 0x38

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x38

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v2, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    const/16 v11, 0x39

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x39

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v2, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    new-instance v1, Ljava/util/HashMap;

    const/16 v11, 0x28

    invoke-direct {v1, v11}, Ljava/util/HashMap;-><init>(I)V

    .line 158
    .local v1, "alphaMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Character;Ljava/lang/Character;>;"
    const/16 v11, 0x41

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x32

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    const/16 v11, 0x42

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x32

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    const/16 v11, 0x43

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x32

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    const/16 v11, 0x44

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x33

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    const/16 v11, 0x45

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x33

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    const/16 v11, 0x46

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x33

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    const/16 v11, 0x47

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x34

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    const/16 v11, 0x48

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x34

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    const/16 v11, 0x49

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x34

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    const/16 v11, 0x4a

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x35

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    const/16 v11, 0x4b

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x35

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    const/16 v11, 0x4c

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x35

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    const/16 v11, 0x4d

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x36

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    const/16 v11, 0x4e

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x36

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    const/16 v11, 0x4f

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x36

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    const/16 v11, 0x50

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x37

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    const/16 v11, 0x51

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x37

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    const/16 v11, 0x52

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x37

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    const/16 v11, 0x53

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x37

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    const/16 v11, 0x54

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x38

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    const/16 v11, 0x55

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x38

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    const/16 v11, 0x56

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x38

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    const/16 v11, 0x57

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x39

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    const/16 v11, 0x58

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x39

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    const/16 v11, 0x59

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x39

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    const/16 v11, 0x5a

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x39

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->ALPHA_MAPPINGS:Ljava/util/Map;

    .line 186
    new-instance v4, Ljava/util/HashMap;

    const/16 v11, 0x64

    invoke-direct {v4, v11}, Ljava/util/HashMap;-><init>(I)V

    .line 187
    .local v4, "combinedMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Character;Ljava/lang/Character;>;"
    sget-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->ALPHA_MAPPINGS:Ljava/util/Map;

    invoke-virtual {v4, v11}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 188
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 189
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->ALPHA_PHONE_MAPPINGS:Ljava/util/Map;

    .line 191
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 192
    .local v5, "diallableCharMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Character;Ljava/lang/Character;>;"
    invoke-virtual {v5, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 193
    const/16 v11, 0x2b

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2b

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v5, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    const/16 v11, 0x2a

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2a

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v5, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    const/16 v11, 0x23

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x23

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v5, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->DIALLABLE_CHAR_MAPPINGS:Ljava/util/Map;

    .line 198
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 200
    .local v0, "allPlusNumberGroupings":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Character;Ljava/lang/Character;>;"
    sget-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->ALPHA_MAPPINGS:Ljava/util/Map;

    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Character;

    invoke-virtual {v11}, Ljava/lang/Character;->charValue()C

    move-result v3

    .line 201
    .local v3, "c":C
    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v11

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v13

    invoke-virtual {v0, v11, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v13

    invoke-virtual {v0, v11, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 204
    .end local v3    # "c":C
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 206
    const/16 v11, 0x2d

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2d

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    const v11, 0xff0d

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2d

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    const/16 v11, 0x2010

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2d

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    const/16 v11, 0x2011

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2d

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    const/16 v11, 0x2012

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2d

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    const/16 v11, 0x2013

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2d

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    const/16 v11, 0x2014

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2d

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    const/16 v11, 0x2015

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2d

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    const/16 v11, 0x2212

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2d

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    const/16 v11, 0x2f

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2f

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    const v11, 0xff0f

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2f

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    const/16 v11, 0x20

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x20

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    const/16 v11, 0x3000

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x20

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    const/16 v11, 0x2060

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x20

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    const/16 v11, 0x2e

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2e

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    const v11, 0xff0e

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v12, 0x2e

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->ALL_PLUS_NUMBER_GROUPING_SYMBOLS:Ljava/util/Map;

    .line 231
    const-string v11, "[\\d]+(?:[~\u2053\u223c\uff5e][\\d]+)?"

    .line 232
    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->UNIQUE_INTERNATIONAL_PREFIX:Ljava/util/regex/Pattern;

    .line 245
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->ALPHA_MAPPINGS:Ljava/util/Map;

    .line 246
    invoke-interface {v12}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "[, \\[\\]]"

    const-string v14, ""

    invoke-virtual {v12, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    sget-object v12, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->ALPHA_MAPPINGS:Ljava/util/Map;

    .line 247
    invoke-interface {v12}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 248
    invoke-virtual {v12}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v12

    const-string v13, "[, \\[\\]]"

    const-string v14, ""

    invoke-virtual {v12, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->VALID_ALPHA:Ljava/lang/String;

    .line 250
    const-string v11, "[+\uff0b]+"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->PLUS_CHARS_PATTERN:Ljava/util/regex/Pattern;

    .line 251
    const-string v11, "[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e]+"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->SEPARATOR_PATTERN:Ljava/util/regex/Pattern;

    .line 252
    const-string v11, "(\\p{Nd})"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->CAPTURING_DIGIT_PATTERN:Ljava/util/regex/Pattern;

    .line 261
    const-string v11, "[+\uff0b\\p{Nd}]"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->VALID_START_CHAR_PATTERN:Ljava/util/regex/Pattern;

    .line 269
    const-string v11, "[\\\\/] *x"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->SECOND_NUMBER_START_PATTERN:Ljava/util/regex/Pattern;

    .line 275
    const-string v11, "[[\\P{N}&&\\P{L}]&&[^#]]+$"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->UNWANTED_END_CHAR_PATTERN:Ljava/util/regex/Pattern;

    .line 279
    const-string v11, "(?:.*?[A-Za-z]){3}.*"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->VALID_ALPHA_PHONE_PATTERN:Ljava/util/regex/Pattern;

    .line 297
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\\p{Nd}{2}|[+\uff0b]*+(?:[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e*]*\\p{Nd}){3,}[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e*"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    sget-object v12, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->VALID_ALPHA:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "\\p{Nd}"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "]*"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->VALID_PHONE_NUMBER:Ljava/lang/String;

    .line 318
    const-string v9, "x\uff58#\uff03~\uff5e"

    .line 322
    .local v9, "singleExtnSymbolsForMatching":Ljava/lang/String;
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, ",;"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 324
    .local v10, "singleExtnSymbolsForParsing":Ljava/lang/String;
    invoke-static {v10}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->createExtnPattern(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->EXTN_PATTERNS_FOR_PARSING:Ljava/lang/String;

    .line 325
    invoke-static {v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->createExtnPattern(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->EXTN_PATTERNS_FOR_MATCHING:Ljava/lang/String;

    .line 352
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "(?:"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    sget-object v12, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->EXTN_PATTERNS_FOR_PARSING:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, ")$"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x42

    .line 353
    invoke-static {v11, v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->EXTN_PATTERN:Ljava/util/regex/Pattern;

    .line 357
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->VALID_PHONE_NUMBER:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "(?:"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    sget-object v12, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->EXTN_PATTERNS_FOR_PARSING:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, ")?"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x42

    .line 358
    invoke-static {v11, v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->VALID_PHONE_NUMBER_PATTERN:Ljava/util/regex/Pattern;

    .line 360
    const-string v11, "(\\D+)"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->NON_DIGITS_PATTERN:Ljava/util/regex/Pattern;

    .line 366
    const-string v11, "(\\$\\d)"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->FIRST_GROUP_PATTERN:Ljava/util/regex/Pattern;

    .line 367
    const-string v11, "\\$NP"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->NP_PATTERN:Ljava/util/regex/Pattern;

    .line 368
    const-string v11, "\\$FG"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->FG_PATTERN:Ljava/util/regex/Pattern;

    .line 369
    const-string v11, "\\$CC"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->CC_PATTERN:Ljava/util/regex/Pattern;

    .line 374
    const-string v11, "\\(?\\$1\\)?"

    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v11

    sput-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->FIRST_GROUP_ONLY_PREFIX_PATTERN:Ljava/util/regex/Pattern;

    return-void
.end method

.method constructor <init>(Lio/michaelrocks/libphonenumber/android/MetadataSource;Ljava/util/Map;)V
    .locals 6
    .param p1, "metadataSource"    # Lio/michaelrocks/libphonenumber/android/MetadataSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/michaelrocks/libphonenumber/android/MetadataSource;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .local p2, "countryCallingCodeToRegionCodeMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/String;>;>;"
    const/4 v5, 0x1

    .line 588
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 567
    new-instance v2, Ljava/util/HashSet;

    const/16 v3, 0x23

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    iput-object v2, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->nanpaRegions:Ljava/util/Set;

    .line 572
    new-instance v2, Lio/michaelrocks/libphonenumber/android/RegexCache;

    const/16 v3, 0x64

    invoke-direct {v2, v3}, Lio/michaelrocks/libphonenumber/android/RegexCache;-><init>(I)V

    iput-object v2, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    .line 577
    new-instance v2, Ljava/util/HashSet;

    const/16 v3, 0x140

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    iput-object v2, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->supportedRegions:Ljava/util/Set;

    .line 581
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->countryCodesForNonGeographicalRegion:Ljava/util/Set;

    .line 589
    iput-object p1, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    .line 590
    iput-object p2, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->countryCallingCodeToRegionCodeMap:Ljava/util/Map;

    .line 591
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 592
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 595
    .local v1, "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v5, :cond_0

    const-string v3, "001"

    const/4 v4, 0x0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 597
    iget-object v3, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->countryCodesForNonGeographicalRegion:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 600
    :cond_0
    iget-object v3, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->supportedRegions:Ljava/util/Set;

    invoke-interface {v3, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 606
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/String;>;>;"
    .end local v1    # "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_1
    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->supportedRegions:Ljava/util/Set;

    const-string v3, "001"

    invoke-interface {v2, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 607
    sget-object v2, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v4, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))"

    invoke-virtual {v2, v3, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 610
    :cond_2
    iget-object v3, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->nanpaRegions:Ljava/util/Set;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v3, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 611
    return-void
.end method

.method private buildNationalNumberForParsing(Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 8
    .param p1, "numberToParse"    # Ljava/lang/String;
    .param p2, "nationalNumber"    # Ljava/lang/StringBuilder;

    .prologue
    .line 3062
    const-string v6, ";phone-context="

    invoke-virtual {p1, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    .line 3063
    .local v2, "indexOfPhoneContext":I
    if-lez v2, :cond_4

    .line 3064
    const-string v6, ";phone-context="

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int v5, v2, v6

    .line 3067
    .local v5, "phoneContextStart":I
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x2b

    if-ne v6, v7, :cond_0

    .line 3071
    const/16 v6, 0x3b

    invoke-virtual {p1, v6, v5}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 3072
    .local v4, "phoneContextEnd":I
    if-lez v4, :cond_2

    .line 3073
    invoke-virtual {p1, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3083
    .end local v4    # "phoneContextEnd":I
    :cond_0
    :goto_0
    const-string v6, "tel:"

    invoke-virtual {p1, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 3084
    .local v3, "indexOfRfc3966Prefix":I
    if-ltz v3, :cond_3

    const-string v6, "tel:"

    .line 3085
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int v1, v3, v6

    .line 3086
    .local v1, "indexOfNationalNumber":I
    :goto_1
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3095
    .end local v1    # "indexOfNationalNumber":I
    .end local v3    # "indexOfRfc3966Prefix":I
    .end local v5    # "phoneContextStart":I
    :goto_2
    const-string v6, ";isub="

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 3096
    .local v0, "indexOfIsdn":I
    if-lez v0, :cond_1

    .line 3097
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    invoke-virtual {p2, v0, v6}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 3103
    :cond_1
    return-void

    .line 3075
    .end local v0    # "indexOfIsdn":I
    .restart local v4    # "phoneContextEnd":I
    .restart local v5    # "phoneContextStart":I
    :cond_2
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 3085
    .end local v4    # "phoneContextEnd":I
    .restart local v3    # "indexOfRfc3966Prefix":I
    :cond_3
    const/4 v1, 0x0

    goto :goto_1

    .line 3090
    .end local v3    # "indexOfRfc3966Prefix":I
    .end local v5    # "phoneContextStart":I
    :cond_4
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->extractPossibleNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2
.end method

.method private checkRegionForParsing(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .param p1, "numberToParse"    # Ljava/lang/String;
    .param p2, "defaultRegion"    # Ljava/lang/String;

    .prologue
    .line 2794
    invoke-direct {p0, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2796
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->PLUS_CHARS_PATTERN:Ljava/util/regex/Pattern;

    .line 2797
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2798
    :cond_0
    const/4 v0, 0x0

    .line 2801
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static convertAlphaCharactersInNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "number"    # Ljava/lang/String;

    .prologue
    .line 760
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->ALPHA_PHONE_MAPPINGS:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeHelper(Ljava/lang/String;Ljava/util/Map;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static createExtnPattern(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "singleExtnSymbols"    # Ljava/lang/String;

    .prologue
    .line 343
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ";ext=(\\p{Nd}{1,7})|[ \u00a0\\t,]*(?:e?xt(?:ensi(?:o\u0301?|\u00f3))?n?|\uff45?\uff58\uff54\uff4e?|["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]|int|anexo|\uff49\uff4e\uff54)[:\\.\uff0e]?[ \u00a0\\t,-]*"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(\\p{Nd}{1,7})"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#?|[- ]+("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\\p{Nd}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "{1,5})#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static createInstance(Landroid/content/Context;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 973
    if-nez p0, :cond_0

    .line 974
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context could not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 976
    :cond_0
    new-instance v0, Lio/michaelrocks/libphonenumber/android/AssetsMetadataLoader;

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/michaelrocks/libphonenumber/android/AssetsMetadataLoader;-><init>(Landroid/content/res/AssetManager;)V

    invoke-static {v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->createInstance(Lio/michaelrocks/libphonenumber/android/MetadataLoader;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;

    move-result-object v0

    return-object v0
.end method

.method public static createInstance(Lio/michaelrocks/libphonenumber/android/MetadataLoader;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;
    .locals 2
    .param p0, "metadataLoader"    # Lio/michaelrocks/libphonenumber/android/MetadataLoader;

    .prologue
    .line 1012
    if-nez p0, :cond_0

    .line 1013
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "metadataLoader could not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1015
    :cond_0
    new-instance v0, Lio/michaelrocks/libphonenumber/android/MultiFileMetadataSourceImpl;

    invoke-direct {v0, p0}, Lio/michaelrocks/libphonenumber/android/MultiFileMetadataSourceImpl;-><init>(Lio/michaelrocks/libphonenumber/android/MetadataLoader;)V

    invoke-static {v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->createInstance(Lio/michaelrocks/libphonenumber/android/MetadataSource;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;

    move-result-object v0

    return-object v0
.end method

.method public static createInstance(Lio/michaelrocks/libphonenumber/android/MetadataSource;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;
    .locals 2
    .param p0, "metadataSource"    # Lio/michaelrocks/libphonenumber/android/MetadataSource;

    .prologue
    .line 992
    if-nez p0, :cond_0

    .line 993
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "metadataSource could not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 995
    :cond_0
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;

    .line 996
    invoke-static {}, Lio/michaelrocks/libphonenumber/android/CountryCodeToRegionCodeMap;->getCountryCodeToRegionCodeMap()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;-><init>(Lio/michaelrocks/libphonenumber/android/MetadataSource;Ljava/util/Map;)V

    .line 995
    return-object v0
.end method

.method static extractPossibleNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0, "number"    # Ljava/lang/String;

    .prologue
    const/4 v7, 0x0

    .line 644
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->VALID_START_CHAR_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v3, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 645
    .local v0, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 646
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 648
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->UNWANTED_END_CHAR_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v3, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 649
    .local v2, "trailingCharsMatcher":Ljava/util/regex/Matcher;
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 650
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    invoke-virtual {p0, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 651
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Stripped trailing characters: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 654
    :cond_0
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->SECOND_NUMBER_START_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v3, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 655
    .local v1, "secondNumber":Ljava/util/regex/Matcher;
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 656
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    invoke-virtual {p0, v7, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 660
    .end local v1    # "secondNumber":Ljava/util/regex/Matcher;
    .end local v2    # "trailingCharsMatcher":Ljava/util/regex/Matcher;
    .end local p0    # "number":Ljava/lang/String;
    :cond_1
    :goto_0
    return-object p0

    .restart local p0    # "number":Ljava/lang/String;
    :cond_2
    const-string p0, ""

    goto :goto_0
.end method

.method private formatNsn(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
    .locals 1
    .param p1, "number"    # Ljava/lang/String;
    .param p2, "metadata"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .param p3, "numberFormat"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    .prologue
    .line 1751
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatNsn(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private formatNsn(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "number"    # Ljava/lang/String;
    .param p2, "metadata"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .param p3, "numberFormat"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;
    .param p4, "carrierCode"    # Ljava/lang/String;

    .prologue
    .line 1762
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->intlNumberFormats()Ljava/util/List;

    move-result-object v2

    .line 1766
    .local v2, "intlNumberFormats":Ljava/util/List;, "Ljava/util/List<Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;>;"
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    if-ne p3, v3, :cond_1

    .line 1767
    :cond_0
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->numberFormats()Ljava/util/List;

    move-result-object v0

    .line 1769
    .local v0, "availableFormats":Ljava/util/List;, "Ljava/util/List<Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;>;"
    :goto_0
    invoke-virtual {p0, v0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->chooseFormattingPatternForNumber(Ljava/util/List;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;

    move-result-object v1

    .line 1770
    .local v1, "formattingPattern":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    if-nez v1, :cond_2

    .end local p1    # "number":Ljava/lang/String;
    :goto_1
    return-object p1

    .line 1768
    .end local v0    # "availableFormats":Ljava/util/List;, "Ljava/util/List<Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;>;"
    .end local v1    # "formattingPattern":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    .restart local p1    # "number":Ljava/lang/String;
    :cond_1
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->intlNumberFormats()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 1772
    .restart local v0    # "availableFormats":Ljava/util/List;, "Ljava/util/List<Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;>;"
    .restart local v1    # "formattingPattern":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    :cond_2
    invoke-direct {p0, p1, v1, p3, p4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatNsnUsingPattern(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1
.end method

.method private formatNsnUsingPattern(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/String;)Ljava/lang/String;
    .locals 9
    .param p1, "nationalNumber"    # Ljava/lang/String;
    .param p2, "formattingPattern"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    .param p3, "numberFormat"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;
    .param p4, "carrierCode"    # Ljava/lang/String;

    .prologue
    .line 1804
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->getFormat()Ljava/lang/String;

    move-result-object v6

    .line 1805
    .local v6, "numberFormatRule":Ljava/lang/String;
    iget-object v7, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    .line 1806
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->getPattern()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lio/michaelrocks/libphonenumber/android/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 1807
    .local v3, "m":Ljava/util/regex/Matcher;
    const-string v2, ""

    .line 1808
    .local v2, "formattedNationalNumber":Ljava/lang/String;
    sget-object v7, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    if-ne p3, v7, :cond_2

    if-eqz p4, :cond_2

    .line 1809
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_2

    .line 1810
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->getDomesticCarrierCodeFormattingRule()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_2

    .line 1812
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->getDomesticCarrierCodeFormattingRule()Ljava/lang/String;

    move-result-object v0

    .line 1813
    .local v0, "carrierCodeFormattingRule":Ljava/lang/String;
    sget-object v7, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->CC_PATTERN:Ljava/util/regex/Pattern;

    .line 1814
    invoke-virtual {v7, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7, p4}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1817
    sget-object v7, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->FIRST_GROUP_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    .line 1818
    invoke-virtual {v7, v0}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1819
    invoke-virtual {v3, v6}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1833
    .end local v0    # "carrierCodeFormattingRule":Ljava/lang/String;
    :goto_0
    sget-object v7, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->RFC3966:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    if-ne p3, v7, :cond_1

    .line 1835
    sget-object v7, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->SEPARATOR_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 1836
    .local v4, "matcher":Ljava/util/regex/Matcher;
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 1837
    const-string v7, ""

    invoke-virtual {v4, v7}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1840
    :cond_0
    invoke-virtual {v4, v2}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    const-string v8, "-"

    invoke-virtual {v7, v8}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1842
    .end local v4    # "matcher":Ljava/util/regex/Matcher;
    :cond_1
    return-object v2

    .line 1822
    :cond_2
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->getNationalPrefixFormattingRule()Ljava/lang/String;

    move-result-object v5

    .line 1823
    .local v5, "nationalPrefixFormattingRule":Ljava/lang/String;
    sget-object v7, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    if-ne p3, v7, :cond_3

    if-eqz v5, :cond_3

    .line 1825
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_3

    .line 1826
    sget-object v7, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->FIRST_GROUP_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 1828
    .local v1, "firstGroupMatcher":Ljava/util/regex/Matcher;
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1829
    goto :goto_0

    .line 1830
    .end local v1    # "firstGroupMatcher":Ljava/util/regex/Matcher;
    :cond_3
    invoke-virtual {v3, v6}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method static formattingRuleHasFirstGroupOnly(Ljava/lang/String;)Z
    .locals 1
    .param p0, "nationalPrefixFormattingRule"    # Ljava/lang/String;

    .prologue
    .line 1023
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->FIRST_GROUP_ONLY_PREFIX_PATTERN:Ljava/util/regex/Pattern;

    .line 1024
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 1023
    :goto_0
    return v0

    .line 1024
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private getCountryCodeForValidRegion(Ljava/lang/String;)I
    .locals 4
    .param p1, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 2289
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    .line 2290
    .local v0, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-nez v0, :cond_0

    .line 2291
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid region code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 2293
    :cond_0
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getCountryCode()I

    move-result v1

    return v1
.end method

.method public static getCountryMobileToken(I)Ljava/lang/String;
    .locals 2
    .param p0, "countryCallingCode"    # I

    .prologue
    .line 911
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->MOBILE_TOKEN_MAPPINGS:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 912
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->MOBILE_TOKEN_MAPPINGS:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 914
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method private getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .locals 1
    .param p1, "countryCallingCode"    # I
    .param p2, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 1230
    const-string v0, "001"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1231
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForNonGeographicalRegion(I)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    .line 1230
    :goto_0
    return-object v0

    .line 1232
    :cond_0
    invoke-virtual {p0, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    goto :goto_0
.end method

.method private getNumberTypeHelper(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;
    .locals 2
    .param p1, "nationalNumber"    # Ljava/lang/String;
    .param p2, "metadata"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    .prologue
    .line 2069
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2070
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->UNKNOWN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 2113
    :goto_0
    return-object v1

    .line 2073
    :cond_0
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPremiumRate()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2074
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->PREMIUM_RATE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto :goto_0

    .line 2076
    :cond_1
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getTollFree()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2077
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->TOLL_FREE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto :goto_0

    .line 2079
    :cond_2
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getSharedCost()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2080
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->SHARED_COST:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto :goto_0

    .line 2082
    :cond_3
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getVoip()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2083
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->VOIP:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto :goto_0

    .line 2085
    :cond_4
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPersonalNumber()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 2086
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->PERSONAL_NUMBER:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto :goto_0

    .line 2088
    :cond_5
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPager()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 2089
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->PAGER:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto :goto_0

    .line 2091
    :cond_6
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getUan()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 2092
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->UAN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto :goto_0

    .line 2094
    :cond_7
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getVoicemail()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 2095
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->VOICEMAIL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto :goto_0

    .line 2098
    :cond_8
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getFixedLine()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v0

    .line 2099
    .local v0, "isFixedLine":Z
    if-eqz v0, :cond_b

    .line 2100
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->isSameMobileAndFixedLinePattern()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 2101
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE_OR_MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto :goto_0

    .line 2102
    :cond_9
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getMobile()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 2103
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE_OR_MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto/16 :goto_0

    .line 2105
    :cond_a
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto/16 :goto_0

    .line 2109
    :cond_b
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->isSameMobileAndFixedLinePattern()Z

    move-result v1

    if-nez v1, :cond_c

    .line 2110
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getMobile()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 2111
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto/16 :goto_0

    .line 2113
    :cond_c
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->UNKNOWN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    goto/16 :goto_0
.end method

.method private getRegionCodeForNumberFromRegionList(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/util/List;)Ljava/lang/String;
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
    .line 2221
    .local p2, "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v1

    .line 2222
    .local v1, "nationalNumber":Ljava/lang/String;
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 2225
    .local v2, "regionCode":Ljava/lang/String;
    invoke-virtual {p0, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    .line 2226
    .local v0, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->hasLeadingDigits()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 2227
    iget-object v4, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getLeadingDigits()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/michaelrocks/libphonenumber/android/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 2228
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 2235
    .end local v0    # "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .end local v2    # "regionCode":Ljava/lang/String;
    :goto_0
    return-object v2

    .line 2231
    .restart local v0    # "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .restart local v2    # "regionCode":Ljava/lang/String;
    :cond_1
    invoke-direct {p0, v1, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNumberTypeHelper(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    move-result-object v4

    sget-object v5, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->UNKNOWN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-eq v4, v5, :cond_0

    goto :goto_0

    .line 2235
    .end local v0    # "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .end local v2    # "regionCode":Ljava/lang/String;
    :cond_2
    const/4 v2, 0x0

    goto :goto_0
.end method

.method private hasFormattingPatternForNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 7
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    const/4 v5, 0x0

    .line 1579
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    .line 1580
    .local v0, "countryCallingCode":I
    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v4

    .line 1582
    .local v4, "phoneNumberRegion":Ljava/lang/String;
    invoke-direct {p0, v0, v4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v2

    .line 1583
    .local v2, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-nez v2, :cond_1

    .line 1589
    :cond_0
    :goto_0
    return v5

    .line 1586
    :cond_1
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v3

    .line 1588
    .local v3, "nationalNumber":Ljava/lang/String;
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->numberFormats()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0, v6, v3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->chooseFormattingPatternForNumber(Ljava/util/List;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;

    move-result-object v1

    .line 1589
    .local v1, "formatRule":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    if-eqz v1, :cond_0

    const/4 v5, 0x1

    goto :goto_0
.end method

.method private hasUnexpectedItalianLeadingZero(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 1
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 1575
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->isItalianLeadingZero()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isLeadingZeroPossible(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hasValidCountryCallingCode(I)Z
    .locals 2
    .param p1, "countryCallingCode"    # I

    .prologue
    .line 1061
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->countryCallingCodeToRegionCodeMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private isNationalNumberSuffixOfTheOther(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 4
    .param p1, "firstNumber"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "secondNumber"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 3184
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNationalNumber()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    .line 3185
    .local v0, "firstNumberNationalNumber":Ljava/lang/String;
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNationalNumber()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    .line 3187
    .local v1, "secondNumberNationalNumber":Ljava/lang/String;
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 3188
    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const/4 v2, 0x1

    .line 3187
    :goto_0
    return v2

    .line 3188
    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method

.method private isValidRegionCode(Ljava/lang/String;)Z
    .locals 1
    .param p1, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 1054
    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->supportedRegions:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static isViablePhoneNumber(Ljava/lang/String;)Z
    .locals 3
    .param p0, "number"    # Ljava/lang/String;

    .prologue
    .line 676
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    .line 677
    const/4 v1, 0x0

    .line 680
    :goto_0
    return v1

    .line 679
    :cond_0
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->VALID_PHONE_NUMBER_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 680
    .local v0, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    goto :goto_0
.end method

.method private maybeAppendFormattedExtension(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V
    .locals 2
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "metadata"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .param p3, "numberFormat"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;
    .param p4, "formattedNumber"    # Ljava/lang/StringBuilder;

    .prologue
    .line 2011
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 2012
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->RFC3966:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    if-ne p3, v0, :cond_1

    .line 2013
    const-string v0, ";ext="

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2022
    :cond_0
    :goto_0
    return-void

    .line 2015
    :cond_1
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->hasPreferredExtnPrefix()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2016
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPreferredExtnPrefix()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 2018
    :cond_2
    const-string v0, " ext. "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method static normalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "number"    # Ljava/lang/String;

    .prologue
    .line 700
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->VALID_ALPHA_PHONE_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 701
    .local v0, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 702
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->ALPHA_PHONE_MAPPINGS:Ljava/util/Map;

    const/4 v2, 0x1

    invoke-static {p0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeHelper(Ljava/lang/String;Ljava/util/Map;Z)Ljava/lang/String;

    move-result-object v1

    .line 704
    :goto_0
    return-object v1

    :cond_0
    invoke-static {p0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeDigitsOnly(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method static normalize(Ljava/lang/StringBuilder;)V
    .locals 3
    .param p0, "number"    # Ljava/lang/StringBuilder;

    .prologue
    .line 716
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 717
    .local v0, "normalizedNumber":Ljava/lang/String;
    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual {p0, v1, v2, v0}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 718
    return-void
.end method

.method static normalizeDiallableCharsOnly(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "number"    # Ljava/lang/String;

    .prologue
    .line 752
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->DIALLABLE_CHAR_MAPPINGS:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeHelper(Ljava/lang/String;Ljava/util/Map;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static normalizeDigits(Ljava/lang/String;Z)Ljava/lang/StringBuilder;
    .locals 7
    .param p0, "number"    # Ljava/lang/String;
    .param p1, "keepNonDigits"    # Z

    .prologue
    .line 732
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 733
    .local v2, "normalizedDigits":Ljava/lang/StringBuilder;
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    array-length v5, v4

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v5, :cond_2

    aget-char v0, v4, v3

    .line 734
    .local v0, "c":C
    const/16 v6, 0xa

    invoke-static {v0, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v1

    .line 735
    .local v1, "digit":I
    const/4 v6, -0x1

    if-eq v1, v6, :cond_1

    .line 736
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 733
    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 737
    :cond_1
    if-eqz p1, :cond_0

    .line 738
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 741
    .end local v0    # "c":C
    .end local v1    # "digit":I
    :cond_2
    return-object v2
.end method

.method public static normalizeDigitsOnly(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "number"    # Ljava/lang/String;

    .prologue
    .line 728
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeDigits(Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static normalizeHelper(Ljava/lang/String;Ljava/util/Map;Z)Ljava/lang/String;
    .locals 5
    .param p0, "number"    # Ljava/lang/String;
    .param p2, "removeNonMatches"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Character;",
            "Ljava/lang/Character;",
            ">;Z)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 932
    .local p1, "normalizationReplacements":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Character;Ljava/lang/Character;>;"
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 933
    .local v3, "normalizedNumber":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v1, v4, :cond_2

    .line 934
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 935
    .local v0, "character":C
    invoke-static {v0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Character;

    .line 936
    .local v2, "newDigit":Ljava/lang/Character;
    if-eqz v2, :cond_1

    .line 937
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 933
    :cond_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 938
    :cond_1
    if-nez p2, :cond_0

    .line 939
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 943
    .end local v0    # "character":C
    .end local v2    # "newDigit":Ljava/lang/Character;
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4
.end method

.method private parseHelper(Ljava/lang/String;Ljava/lang/String;ZZLio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V
    .locals 17
    .param p1, "numberToParse"    # Ljava/lang/String;
    .param p2, "defaultRegion"    # Ljava/lang/String;
    .param p3, "keepRawInput"    # Z
    .param p4, "checkRegion"    # Z
    .param p5, "phoneNumber"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/michaelrocks/libphonenumber/android/NumberParseException;
        }
    .end annotation

    .prologue
    .line 2947
    if-nez p1, :cond_0

    .line 2948
    new-instance v2, Lio/michaelrocks/libphonenumber/android/NumberParseException;

    sget-object v3, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->NOT_A_NUMBER:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    const-string v6, "The phone number supplied was null."

    invoke-direct {v2, v3, v6}, Lio/michaelrocks/libphonenumber/android/NumberParseException;-><init>(Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;Ljava/lang/String;)V

    throw v2

    .line 2950
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xfa

    if-le v2, v3, :cond_1

    .line 2951
    new-instance v2, Lio/michaelrocks/libphonenumber/android/NumberParseException;

    sget-object v3, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->TOO_LONG:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    const-string v6, "The string supplied was too long to parse."

    invoke-direct {v2, v3, v6}, Lio/michaelrocks/libphonenumber/android/NumberParseException;-><init>(Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;Ljava/lang/String;)V

    throw v2

    .line 2955
    :cond_1
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 2956
    .local v14, "nationalNumber":Ljava/lang/StringBuilder;
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v14}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->buildNationalNumberForParsing(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 2958
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isViablePhoneNumber(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 2959
    new-instance v2, Lio/michaelrocks/libphonenumber/android/NumberParseException;

    sget-object v3, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->NOT_A_NUMBER:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    const-string v6, "The string supplied did not seem to be a phone number."

    invoke-direct {v2, v3, v6}, Lio/michaelrocks/libphonenumber/android/NumberParseException;-><init>(Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;Ljava/lang/String;)V

    throw v2

    .line 2965
    :cond_2
    if-eqz p4, :cond_3

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v2, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->checkRegionForParsing(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 2966
    new-instance v2, Lio/michaelrocks/libphonenumber/android/NumberParseException;

    sget-object v3, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->INVALID_COUNTRY_CODE:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    const-string v6, "Missing or invalid default region."

    invoke-direct {v2, v3, v6}, Lio/michaelrocks/libphonenumber/android/NumberParseException;-><init>(Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;Ljava/lang/String;)V

    throw v2

    .line 2970
    :cond_3
    if-eqz p3, :cond_4

    .line 2971
    move-object/from16 v0, p5

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setRawInput(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 2975
    :cond_4
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeStripExtension(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v11

    .line 2976
    .local v11, "extension":Ljava/lang/String;
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_5

    .line 2977
    move-object/from16 v0, p5

    invoke-virtual {v0, v11}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setExtension(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 2980
    :cond_5
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v4

    .line 2983
    .local v4, "regionMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 2984
    .local v5, "normalizedNationalNumber":Ljava/lang/StringBuilder;
    const/4 v9, 0x0

    .line 2989
    .local v9, "countryCode":I
    :try_start_0
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v2, p0

    move/from16 v6, p3

    move-object/from16 v7, p5

    invoke-virtual/range {v2 .. v7}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeExtractCountryCode(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Ljava/lang/StringBuilder;ZLio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)I
    :try_end_0
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v9

    .line 3007
    :cond_6
    if-eqz v9, :cond_9

    .line 3008
    move-object/from16 v0, p0

    invoke-virtual {v0, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v15

    .line 3009
    .local v15, "phoneNumberRegion":Ljava/lang/String;
    move-object/from16 v0, p2

    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 3011
    move-object/from16 v0, p0

    invoke-direct {v0, v9, v15}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v4

    .line 3025
    .end local v15    # "phoneNumberRegion":Ljava/lang/String;
    :cond_7
    :goto_0
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v3, 0x2

    if-ge v2, v3, :cond_b

    .line 3026
    new-instance v2, Lio/michaelrocks/libphonenumber/android/NumberParseException;

    sget-object v3, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->TOO_SHORT_NSN:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    const-string v6, "The string supplied is too short to be a phone number."

    invoke-direct {v2, v3, v6}, Lio/michaelrocks/libphonenumber/android/NumberParseException;-><init>(Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;Ljava/lang/String;)V

    throw v2

    .line 2991
    :catch_0
    move-exception v10

    .line 2992
    .local v10, "e":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    sget-object v2, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->PLUS_CHARS_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v13

    .line 2993
    .local v13, "matcher":Ljava/util/regex/Matcher;
    invoke-virtual {v10}, Lio/michaelrocks/libphonenumber/android/NumberParseException;->getErrorType()Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    move-result-object v2

    sget-object v3, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->INVALID_COUNTRY_CODE:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    if-ne v2, v3, :cond_8

    .line 2994
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 2996
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->end()I

    move-result v2

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v2, p0

    move/from16 v6, p3

    move-object/from16 v7, p5

    invoke-virtual/range {v2 .. v7}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeExtractCountryCode(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Ljava/lang/StringBuilder;ZLio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)I

    move-result v9

    .line 2999
    if-nez v9, :cond_6

    .line 3000
    new-instance v2, Lio/michaelrocks/libphonenumber/android/NumberParseException;

    sget-object v3, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->INVALID_COUNTRY_CODE:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    const-string v6, "Could not interpret numbers after plus-sign."

    invoke-direct {v2, v3, v6}, Lio/michaelrocks/libphonenumber/android/NumberParseException;-><init>(Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;Ljava/lang/String;)V

    throw v2

    .line 3004
    :cond_8
    new-instance v2, Lio/michaelrocks/libphonenumber/android/NumberParseException;

    invoke-virtual {v10}, Lio/michaelrocks/libphonenumber/android/NumberParseException;->getErrorType()Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    move-result-object v3

    invoke-virtual {v10}, Lio/michaelrocks/libphonenumber/android/NumberParseException;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v3, v6}, Lio/michaelrocks/libphonenumber/android/NumberParseException;-><init>(Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;Ljava/lang/String;)V

    throw v2

    .line 3016
    .end local v10    # "e":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    .end local v13    # "matcher":Ljava/util/regex/Matcher;
    :cond_9
    invoke-static {v14}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalize(Ljava/lang/StringBuilder;)V

    .line 3017
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 3018
    if-eqz p2, :cond_a

    .line 3019
    invoke-virtual {v4}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getCountryCode()I

    move-result v9

    .line 3020
    move-object/from16 v0, p5

    invoke-virtual {v0, v9}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setCountryCode(I)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    goto :goto_0

    .line 3021
    :cond_a
    if-eqz p3, :cond_7

    .line 3022
    invoke-virtual/range {p5 .. p5}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearCountryCodeSource()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    goto :goto_0

    .line 3029
    :cond_b
    if-eqz v4, :cond_c

    .line 3030
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 3031
    .local v8, "carrierCode":Ljava/lang/StringBuilder;
    new-instance v16, Ljava/lang/StringBuilder;

    move-object/from16 v0, v16

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 3032
    .local v16, "potentialNationalNumber":Ljava/lang/StringBuilder;
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1, v4, v8}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeStripNationalPrefixAndCarrierCode(Ljava/lang/StringBuilder;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Ljava/lang/StringBuilder;)Z

    .line 3036
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v3

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->testNumberLength(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    move-result-object v2

    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->TOO_SHORT:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    if-eq v2, v3, :cond_c

    .line 3038
    move-object/from16 v5, v16

    .line 3039
    if-eqz p3, :cond_c

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_c

    .line 3040
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p5

    invoke-virtual {v0, v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setPreferredDomesticCarrierCode(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3044
    .end local v8    # "carrierCode":Ljava/lang/StringBuilder;
    .end local v16    # "potentialNationalNumber":Ljava/lang/StringBuilder;
    :cond_c
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v12

    .line 3045
    .local v12, "lengthOfNationalNumber":I
    const/4 v2, 0x2

    if-ge v12, v2, :cond_d

    .line 3046
    new-instance v2, Lio/michaelrocks/libphonenumber/android/NumberParseException;

    sget-object v3, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->TOO_SHORT_NSN:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    const-string v6, "The string supplied is too short to be a phone number."

    invoke-direct {v2, v3, v6}, Lio/michaelrocks/libphonenumber/android/NumberParseException;-><init>(Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;Ljava/lang/String;)V

    throw v2

    .line 3049
    :cond_d
    const/16 v2, 0x11

    if-le v12, v2, :cond_e

    .line 3050
    new-instance v2, Lio/michaelrocks/libphonenumber/android/NumberParseException;

    sget-object v3, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->TOO_LONG:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    const-string v6, "The string supplied is too long to be a phone number."

    invoke-direct {v2, v3, v6}, Lio/michaelrocks/libphonenumber/android/NumberParseException;-><init>(Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;Ljava/lang/String;)V

    throw v2

    .line 3053
    :cond_e
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p5

    invoke-static {v2, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->setItalianLeadingZerosForPhoneNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V

    .line 3054
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    move-object/from16 v0, p5

    invoke-virtual {v0, v2, v3}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setNationalNumber(J)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3055
    return-void
.end method

.method private parsePrefixAsIdd(Ljava/util/regex/Pattern;Ljava/lang/StringBuilder;)Z
    .locals 8
    .param p1, "iddPattern"    # Ljava/util/regex/Pattern;
    .param p2, "number"    # Ljava/lang/StringBuilder;

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 2647
    invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 2648
    .local v1, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 2649
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->end()I

    move-result v2

    .line 2652
    .local v2, "matchEnd":I
    sget-object v6, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->CAPTURING_DIGIT_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 2653
    .local v0, "digitMatcher":Ljava/util/regex/Matcher;
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 2654
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeDigitsOnly(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2655
    .local v3, "normalizedGroup":Ljava/lang/String;
    const-string v6, "0"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 2662
    .end local v0    # "digitMatcher":Ljava/util/regex/Matcher;
    .end local v2    # "matchEnd":I
    .end local v3    # "normalizedGroup":Ljava/lang/String;
    :cond_0
    :goto_0
    return v4

    .line 2659
    .restart local v0    # "digitMatcher":Ljava/util/regex/Matcher;
    .restart local v2    # "matchEnd":I
    :cond_1
    invoke-virtual {p2, v4, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    move v4, v5

    .line 2660
    goto :goto_0
.end method

.method private prefixNumberWithCountryCallingCode(ILio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V
    .locals 4
    .param p1, "countryCallingCode"    # I
    .param p2, "numberFormat"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;
    .param p3, "formattedNumber"    # Ljava/lang/StringBuilder;

    .prologue
    const/16 v3, 0x2b

    const/4 v2, 0x0

    .line 1732
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$2;->$SwitchMap$io$michaelrocks$libphonenumber$android$PhoneNumberUtil$PhoneNumberFormat:[I

    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1745
    :goto_0
    return-void

    .line 1734
    :pswitch_0
    invoke-virtual {p3, v2, p1}, Ljava/lang/StringBuilder;->insert(II)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1737
    :pswitch_1
    const-string v0, " "

    invoke-virtual {p3, v2, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, p1}, Ljava/lang/StringBuilder;->insert(II)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1740
    :pswitch_2
    const-string v0, "-"

    invoke-virtual {p3, v2, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, p1}, Ljava/lang/StringBuilder;->insert(II)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "tel:"

    .line 1741
    invoke-virtual {v0, v2, v1}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1732
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private rawInputContainsNationalPrefix(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4
    .param p1, "rawInput"    # Ljava/lang/String;
    .param p2, "nationalPrefix"    # Ljava/lang/String;
    .param p3, "regionCode"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 1554
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeDigitsOnly(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1555
    .local v1, "normalizedNationalNumber":Ljava/lang/String;
    invoke-virtual {v1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1562
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, p3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move-result-object v3

    .line 1561
    invoke-virtual {p0, v3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    :try_end_0
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 1567
    :cond_0
    :goto_0
    return v2

    .line 1563
    :catch_0
    move-exception v0

    .line 1564
    .local v0, "e":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    goto :goto_0
.end method

.method static setItalianLeadingZerosForPhoneNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V
    .locals 4
    .param p0, "nationalNumber"    # Ljava/lang/String;
    .param p1, "phoneNumber"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    const/16 v3, 0x30

    const/4 v2, 0x1

    .line 2923
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v2, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v3, :cond_1

    .line 2924
    invoke-virtual {p1, v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setItalianLeadingZero(Z)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 2925
    const/4 v0, 0x1

    .line 2928
    .local v0, "numberOfLeadingZeros":I
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    .line 2929
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v3, :cond_0

    .line 2930
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2932
    :cond_0
    if-eq v0, v2, :cond_1

    .line 2933
    invoke-virtual {p1, v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setNumberOfLeadingZeros(I)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 2936
    .end local v0    # "numberOfLeadingZeros":I
    :cond_1
    return-void
.end method

.method private testNumberLength(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;
    .locals 6
    .param p1, "number"    # Ljava/lang/String;
    .param p2, "phoneNumberDesc"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    .prologue
    .line 2393
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLengthList()Ljava/util/List;

    move-result-object v3

    .line 2394
    .local v3, "possibleLengths":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLengthLocalOnlyList()Ljava/util/List;

    move-result-object v1

    .line 2395
    .local v1, "localLengths":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 2396
    .local v0, "actualLength":I
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 2397
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->IS_POSSIBLE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    .line 2414
    :goto_0
    return-object v4

    .line 2401
    :cond_0
    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 2402
    .local v2, "minimumLength":I
    if-ne v2, v0, :cond_1

    .line 2403
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->IS_POSSIBLE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    goto :goto_0

    .line 2404
    :cond_1
    if-le v2, v0, :cond_2

    .line 2405
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->TOO_SHORT:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    goto :goto_0

    .line 2406
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ge v4, v0, :cond_3

    .line 2407
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->TOO_LONG:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    goto :goto_0

    .line 2414
    :cond_3
    const/4 v4, 0x1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v3, v4, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->IS_POSSIBLE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    goto :goto_0

    :cond_4
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->TOO_LONG:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    goto :goto_0
.end method


# virtual methods
.method canBeInternationallyDialled(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 4
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    const/4 v2, 0x1

    .line 3287
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    .line 3288
    .local v0, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-nez v0, :cond_1

    .line 3294
    :cond_0
    :goto_0
    return v2

    .line 3293
    :cond_1
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v1

    .line 3294
    .local v1, "nationalSignificantNumber":Ljava/lang/String;
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getNoInternationalDialling()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v3

    invoke-virtual {p0, v1, v3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x0

    goto :goto_0
.end method

.method chooseFormattingPatternForNumber(Ljava/util/List;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    .locals 6
    .param p2, "nationalNumber"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;"
        }
    .end annotation

    .prologue
    .line 1777
    .local p1, "availableFormats":Ljava/util/List;, "Ljava/util/List<Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;

    .line 1778
    .local v1, "numFormat":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->leadingDigitsPatternSize()I

    move-result v2

    .line 1779
    .local v2, "size":I
    if-eqz v2, :cond_1

    iget-object v4, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    add-int/lit8 v5, v2, -0x1

    .line 1781
    invoke-virtual {v1, v5}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->getLeadingDigitsPattern(I)Ljava/lang/String;

    move-result-object v5

    .line 1779
    invoke-virtual {v4, v5}, Lio/michaelrocks/libphonenumber/android/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 1781
    invoke-virtual {v4, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1782
    :cond_1
    iget-object v4, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->getPattern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/michaelrocks/libphonenumber/android/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 1783
    .local v0, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1788
    .end local v0    # "m":Ljava/util/regex/Matcher;
    .end local v1    # "numFormat":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    .end local v2    # "size":I
    :goto_0
    return-object v1

    :cond_2
    const/4 v1, 0x0

    goto :goto_0
.end method

.method extractCountryCode(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)I
    .locals 6
    .param p1, "fullNumber"    # Ljava/lang/StringBuilder;
    .param p2, "nationalNumber"    # Ljava/lang/StringBuilder;

    .prologue
    const/4 v3, 0x0

    .line 2524
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    if-ne v4, v5, :cond_1

    :cond_0
    move v2, v3

    .line 2537
    :goto_0
    return v2

    .line 2529
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    .line 2530
    .local v1, "numberLength":I
    const/4 v0, 0x1

    .local v0, "i":I
    :goto_1
    const/4 v4, 0x3

    if-gt v0, v4, :cond_3

    if-gt v0, v1, :cond_3

    .line 2531
    invoke-virtual {p1, v3, v0}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 2532
    .local v2, "potentialCountryCode":I
    iget-object v4, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->countryCallingCodeToRegionCodeMap:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 2533
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 2530
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .end local v2    # "potentialCountryCode":I
    :cond_3
    move v2, v3

    .line 2537
    goto :goto_0
.end method

.method public findNumbers(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/Iterable;
    .locals 6
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "defaultRegion"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Iterable",
            "<",
            "Lio/michaelrocks/libphonenumber/android/PhoneNumberMatch;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2890
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency;->VALID:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency;

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->findNumbers(Ljava/lang/CharSequence;Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency;J)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public findNumbers(Ljava/lang/CharSequence;Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency;J)Ljava/lang/Iterable;
    .locals 8
    .param p1, "text"    # Ljava/lang/CharSequence;
    .param p2, "defaultRegion"    # Ljava/lang/String;
    .param p3, "leniency"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency;
    .param p4, "maxTries"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/String;",
            "Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency;",
            "J)",
            "Ljava/lang/Iterable",
            "<",
            "Lio/michaelrocks/libphonenumber/android/PhoneNumberMatch;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2910
    new-instance v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$1;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$1;-><init>(Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;Ljava/lang/CharSequence;Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency;J)V

    return-object v1
.end method

.method public format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
    .locals 6
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "numberFormat"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    .prologue
    .line 1079
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNationalNumber()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasRawInput()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1085
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getRawInput()Ljava/lang/String;

    move-result-object v1

    .line 1086
    .local v1, "rawInput":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 1092
    .end local v1    # "rawInput":Ljava/lang/String;
    :goto_0
    return-object v1

    .line 1090
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1091
    .local v0, "formattedNumber":Ljava/lang/StringBuilder;
    invoke-virtual {p0, p1, p2, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    .line 1092
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V
    .locals 5
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "numberFormat"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;
    .param p3, "formattedNumber"    # Ljava/lang/StringBuilder;

    .prologue
    .line 1102
    const/4 v4, 0x0

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1103
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    .line 1104
    .local v0, "countryCallingCode":I
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v2

    .line 1106
    .local v2, "nationalSignificantNumber":Ljava/lang/String;
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->E164:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    if-ne p2, v4, :cond_0

    .line 1109
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1110
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->E164:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-direct {p0, v0, v4, p3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->prefixNumberWithCountryCallingCode(ILio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    .line 1129
    :goto_0
    return-void

    .line 1114
    :cond_0
    invoke-direct {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->hasValidCountryCallingCode(I)Z

    move-result v4

    if-nez v4, :cond_1

    .line 1115
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1121
    :cond_1
    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v3

    .line 1125
    .local v3, "regionCode":Ljava/lang/String;
    invoke-direct {p0, v0, v3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v1

    .line 1126
    .local v1, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    invoke-direct {p0, v2, v1, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatNsn(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1127
    invoke-direct {p0, p1, v1, p2, p3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeAppendFormattedExtension(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    .line 1128
    invoke-direct {p0, v0, p2, p3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->prefixNumberWithCountryCallingCode(ILio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    goto :goto_0
.end method

.method public formatByPattern(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/util/List;)Ljava/lang/String;
    .locals 11
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "numberFormat"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;",
            "Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;",
            "Ljava/util/List",
            "<",
            "Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 1145
    .local p3, "userDefinedFormats":Ljava/util/List;, "Ljava/util/List<Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;>;"
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    .line 1146
    .local v0, "countryCallingCode":I
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v6

    .line 1147
    .local v6, "nationalSignificantNumber":Ljava/lang/String;
    invoke-direct {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->hasValidCountryCallingCode(I)Z

    move-result v9

    if-nez v9, :cond_0

    .line 1191
    .end local v6    # "nationalSignificantNumber":Ljava/lang/String;
    :goto_0
    return-object v6

    .line 1153
    .restart local v6    # "nationalSignificantNumber":Ljava/lang/String;
    :cond_0
    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v8

    .line 1156
    .local v8, "regionCode":Ljava/lang/String;
    invoke-direct {p0, v0, v8}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v3

    .line 1158
    .local v3, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v9, 0x14

    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1161
    .local v1, "formattedNumber":Ljava/lang/StringBuilder;
    invoke-virtual {p0, p3, v6}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->chooseFormattingPatternForNumber(Ljava/util/List;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;

    move-result-object v2

    .line 1162
    .local v2, "formattingPattern":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    if-nez v2, :cond_1

    .line 1164
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1189
    :goto_1
    invoke-direct {p0, p1, v3, p2, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeAppendFormattedExtension(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    .line 1190
    invoke-direct {p0, v0, p2, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->prefixNumberWithCountryCallingCode(ILio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    .line 1191
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 1166
    :cond_1
    invoke-static {}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->newBuilder()Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;

    move-result-object v7

    .line 1170
    .local v7, "numFormatCopy":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;
    invoke-virtual {v7, v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;->mergeFrom(Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;

    .line 1171
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->getNationalPrefixFormattingRule()Ljava/lang/String;

    move-result-object v5

    .line 1172
    .local v5, "nationalPrefixFormattingRule":Ljava/lang/String;
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_2

    .line 1173
    invoke-virtual {v3}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getNationalPrefix()Ljava/lang/String;

    move-result-object v4

    .line 1174
    .local v4, "nationalPrefix":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_3

    .line 1176
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->NP_PATTERN:Ljava/util/regex/Pattern;

    .line 1177
    invoke-virtual {v9, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1178
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->FG_PATTERN:Ljava/util/regex/Pattern;

    .line 1179
    invoke-virtual {v9, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    const-string v10, "\\$1"

    invoke-virtual {v9, v10}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1180
    invoke-virtual {v7, v5}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;->setNationalPrefixFormattingRule(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;

    .line 1187
    .end local v4    # "nationalPrefix":Ljava/lang/String;
    :cond_2
    :goto_2
    invoke-virtual {p0, v6, v7, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatNsnUsingPattern(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v9

    .line 1186
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1183
    .restart local v4    # "nationalPrefix":Ljava/lang/String;
    :cond_3
    invoke-virtual {v7}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;->clearNationalPrefixFormattingRule()Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;

    goto :goto_2
.end method

.method public formatInOriginalFormat(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;
    .locals 19
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "regionCallingFrom"    # Ljava/lang/String;

    .prologue
    .line 1455
    invoke-virtual/range {p1 .. p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasRawInput()Z

    move-result v17

    if-eqz v17, :cond_2

    .line 1456
    invoke-direct/range {p0 .. p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->hasUnexpectedItalianLeadingZero(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v17

    if-nez v17, :cond_0

    invoke-direct/range {p0 .. p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->hasFormattingPatternForNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v17

    if-nez v17, :cond_2

    .line 1459
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getRawInput()Ljava/lang/String;

    move-result-object v5

    .line 1547
    :cond_1
    :goto_0
    return-object v5

    .line 1461
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasCountryCodeSource()Z

    move-result v17

    if-nez v17, :cond_3

    .line 1462
    sget-object v17, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 1465
    :cond_3
    sget-object v17, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$2;->$SwitchMap$io$michaelrocks$libphonenumber$android$Phonenumber$PhoneNumber$CountryCodeSource:[I

    invoke-virtual/range {p1 .. p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCodeSource()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->ordinal()I

    move-result v18

    aget v17, v17, v18

    packed-switch v17, :pswitch_data_0

    .line 1478
    invoke-virtual/range {p1 .. p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v17

    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v16

    .line 1481
    .local v16, "regionCode":Ljava/lang/String;
    const/16 v17, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNddPrefixForRegion(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v10

    .line 1482
    .local v10, "nationalPrefix":Ljava/lang/String;
    sget-object v17, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v8

    .line 1483
    .local v8, "nationalFormat":Ljava/lang/String;
    if-eqz v10, :cond_4

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v17

    if-nez v17, :cond_5

    .line 1486
    :cond_4
    move-object v5, v8

    .line 1537
    .end local v8    # "nationalFormat":Ljava/lang/String;
    .end local v10    # "nationalPrefix":Ljava/lang/String;
    .end local v16    # "regionCode":Ljava/lang/String;
    .local v5, "formattedNumber":Ljava/lang/String;
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getRawInput()Ljava/lang/String;

    move-result-object v15

    .line 1540
    .local v15, "rawInput":Ljava/lang/String;
    if-eqz v5, :cond_1

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v17

    if-lez v17, :cond_1

    .line 1541
    invoke-static {v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeDiallableCharsOnly(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 1542
    .local v11, "normalizedFormattedNumber":Ljava/lang/String;
    invoke-static {v15}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeDiallableCharsOnly(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 1543
    .local v12, "normalizedRawInput":Ljava/lang/String;
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_1

    .line 1544
    move-object v5, v15

    goto :goto_0

    .line 1467
    .end local v5    # "formattedNumber":Ljava/lang/String;
    .end local v11    # "normalizedFormattedNumber":Ljava/lang/String;
    .end local v12    # "normalizedRawInput":Ljava/lang/String;
    .end local v15    # "rawInput":Ljava/lang/String;
    :pswitch_0
    sget-object v17, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v5

    .line 1468
    .restart local v5    # "formattedNumber":Ljava/lang/String;
    goto :goto_1

    .line 1470
    .end local v5    # "formattedNumber":Ljava/lang/String;
    :pswitch_1
    invoke-virtual/range {p0 .. p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatOutOfCountryCallingNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1471
    .restart local v5    # "formattedNumber":Ljava/lang/String;
    goto :goto_1

    .line 1473
    .end local v5    # "formattedNumber":Ljava/lang/String;
    :pswitch_2
    sget-object v17, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v17

    const/16 v18, 0x1

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    .line 1474
    .restart local v5    # "formattedNumber":Ljava/lang/String;
    goto :goto_1

    .line 1491
    .end local v5    # "formattedNumber":Ljava/lang/String;
    .restart local v8    # "nationalFormat":Ljava/lang/String;
    .restart local v10    # "nationalPrefix":Ljava/lang/String;
    .restart local v16    # "regionCode":Ljava/lang/String;
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getRawInput()Ljava/lang/String;

    move-result-object v17

    .line 1490
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    move-object/from16 v2, v16

    invoke-direct {v0, v1, v10, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->rawInputContainsNationalPrefix(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_6

    .line 1493
    move-object v5, v8

    .line 1494
    .restart local v5    # "formattedNumber":Ljava/lang/String;
    goto :goto_1

    .line 1498
    .end local v5    # "formattedNumber":Ljava/lang/String;
    :cond_6
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v7

    .line 1499
    .local v7, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    invoke-virtual/range {p0 .. p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v9

    .line 1501
    .local v9, "nationalNumber":Ljava/lang/String;
    invoke-virtual {v7}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->numberFormats()Ljava/util/List;

    move-result-object v17

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->chooseFormattingPatternForNumber(Ljava/util/List;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;

    move-result-object v4

    .line 1505
    .local v4, "formatRule":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    if-nez v4, :cond_7

    .line 1506
    move-object v5, v8

    .line 1507
    .restart local v5    # "formattedNumber":Ljava/lang/String;
    goto :goto_1

    .line 1513
    .end local v5    # "formattedNumber":Ljava/lang/String;
    :cond_7
    invoke-virtual {v4}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->getNationalPrefixFormattingRule()Ljava/lang/String;

    move-result-object v3

    .line 1515
    .local v3, "candidateNationalPrefixRule":Ljava/lang/String;
    const-string v17, "$1"

    move-object/from16 v0, v17

    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    .line 1516
    .local v6, "indexOfFirstGroup":I
    if-gtz v6, :cond_8

    .line 1517
    move-object v5, v8

    .line 1518
    .restart local v5    # "formattedNumber":Ljava/lang/String;
    goto :goto_1

    .line 1520
    .end local v5    # "formattedNumber":Ljava/lang/String;
    :cond_8
    const/16 v17, 0x0

    .line 1521
    move/from16 v0, v17

    invoke-virtual {v3, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 1522
    invoke-static {v3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeDigitsOnly(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1523
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v17

    if-nez v17, :cond_9

    .line 1525
    move-object v5, v8

    .line 1526
    .restart local v5    # "formattedNumber":Ljava/lang/String;
    goto/16 :goto_1

    .line 1529
    .end local v5    # "formattedNumber":Ljava/lang/String;
    :cond_9
    invoke-static {}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->newBuilder()Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;

    move-result-object v13

    .line 1530
    .local v13, "numFormatCopy":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;
    invoke-virtual {v13, v4}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;->mergeFrom(Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;

    .line 1531
    invoke-virtual {v13}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;->clearNationalPrefixFormattingRule()Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;

    .line 1532
    new-instance v14, Ljava/util/ArrayList;

    const/16 v17, 0x1

    move/from16 v0, v17

    invoke-direct {v14, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1533
    .local v14, "numberFormats":Ljava/util/List;, "Ljava/util/List<Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;>;"
    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1534
    sget-object v17, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2, v14}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatByPattern(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/util/List;)Ljava/lang/String;

    move-result-object v5

    .restart local v5    # "formattedNumber":Ljava/lang/String;
    goto/16 :goto_1

    .line 1465
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public formatNationalNumberWithCarrierCode(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "carrierCode"    # Ljava/lang/String;

    .prologue
    .line 1206
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    .line 1207
    .local v0, "countryCallingCode":I
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v3

    .line 1208
    .local v3, "nationalSignificantNumber":Ljava/lang/String;
    invoke-direct {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->hasValidCountryCallingCode(I)Z

    move-result v5

    if-nez v5, :cond_0

    .line 1225
    .end local v3    # "nationalSignificantNumber":Ljava/lang/String;
    :goto_0
    return-object v3

    .line 1215
    .restart local v3    # "nationalSignificantNumber":Ljava/lang/String;
    :cond_0
    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v4

    .line 1217
    .local v4, "regionCode":Ljava/lang/String;
    invoke-direct {p0, v0, v4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v2

    .line 1219
    .local v2, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v5, 0x14

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1220
    .local v1, "formattedNumber":Ljava/lang/StringBuilder;
    sget-object v5, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-direct {p0, v3, v2, v5, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatNsn(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1222
    sget-object v5, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-direct {p0, p1, v2, v5, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeAppendFormattedExtension(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    .line 1223
    sget-object v5, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-direct {p0, v0, v5, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->prefixNumberWithCountryCallingCode(ILio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    .line 1225
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0
.end method

.method public formatNationalNumberWithPreferredCarrierCode(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "fallbackCarrierCode"    # Ljava/lang/String;

    .prologue
    .line 1254
    .line 1258
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getPreferredDomesticCarrierCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 1259
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getPreferredDomesticCarrierCode()Ljava/lang/String;

    move-result-object p2

    .line 1254
    .end local p2    # "fallbackCarrierCode":Ljava/lang/String;
    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatNationalNumberWithCarrierCode(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method formatNsnUsingPattern(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
    .locals 1
    .param p1, "nationalNumber"    # Ljava/lang/String;
    .param p2, "formattingPattern"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    .param p3, "numberFormat"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    .prologue
    .line 1795
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatNsnUsingPattern(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public formatNumberForMobileDialing(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 12
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "regionCallingFrom"    # Ljava/lang/String;
    .param p3, "withFormatting"    # Z

    .prologue
    const/4 v10, 0x0

    const/4 v9, 0x1

    .line 1277
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    .line 1278
    .local v0, "countryCallingCode":I
    invoke-direct {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->hasValidCountryCallingCode(I)Z

    move-result v11

    if-nez v11, :cond_1

    .line 1279
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasRawInput()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getRawInput()Ljava/lang/String;

    move-result-object v9

    .line 1354
    :goto_0
    return-object v9

    .line 1279
    :cond_0
    const-string v9, ""

    goto :goto_0

    .line 1282
    :cond_1
    const-string v1, ""

    .line 1284
    .local v1, "formattedNumber":Ljava/lang/String;
    new-instance v11, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    invoke-direct {v11}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;-><init>()V

    invoke-virtual {v11, p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->mergeFrom(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move-result-object v11

    invoke-virtual {v11}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearExtension()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move-result-object v5

    .line 1285
    .local v5, "numberNoExt":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v7

    .line 1286
    .local v7, "regionCode":Ljava/lang/String;
    invoke-virtual {p0, v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNumberType(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    move-result-object v6

    .line 1287
    .local v6, "numberType":Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;
    sget-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->UNKNOWN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-eq v6, v11, :cond_4

    move v4, v9

    .line 1288
    .local v4, "isValidNumber":Z
    :goto_1
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    .line 1289
    sget-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-eq v6, v11, :cond_2

    sget-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-eq v6, v11, :cond_2

    sget-object v11, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE_OR_MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-ne v6, v11, :cond_5

    :cond_2
    move v3, v9

    .line 1293
    .local v3, "isFixedLineOrMobile":Z
    :goto_2
    const-string v10, "CO"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    sget-object v10, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-ne v6, v10, :cond_6

    .line 1294
    const-string v9, "3"

    .line 1295
    invoke-virtual {p0, v5, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatNationalNumberWithCarrierCode(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1354
    .end local v3    # "isFixedLineOrMobile":Z
    :cond_3
    :goto_3
    if-eqz p3, :cond_11

    .end local v1    # "formattedNumber":Ljava/lang/String;
    :goto_4
    move-object v9, v1

    goto :goto_0

    .end local v4    # "isValidNumber":Z
    .restart local v1    # "formattedNumber":Ljava/lang/String;
    :cond_4
    move v4, v10

    .line 1287
    goto :goto_1

    .restart local v4    # "isValidNumber":Z
    :cond_5
    move v3, v10

    .line 1289
    goto :goto_2

    .line 1296
    .restart local v3    # "isFixedLineOrMobile":Z
    :cond_6
    const-string v10, "BR"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    if-eqz v3, :cond_8

    .line 1300
    invoke-virtual {v5}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getPreferredDomesticCarrierCode()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_7

    const-string v9, ""

    .line 1301
    invoke-virtual {p0, v5, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatNationalNumberWithPreferredCarrierCode(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    .end local v1    # "formattedNumber":Ljava/lang/String;
    .local v2, "formattedNumber":Ljava/lang/String;
    :goto_5
    move-object v1, v2

    .end local v2    # "formattedNumber":Ljava/lang/String;
    .restart local v1    # "formattedNumber":Ljava/lang/String;
    goto :goto_3

    :cond_7
    const-string v2, ""

    goto :goto_5

    .line 1306
    :cond_8
    if-eqz v4, :cond_9

    const-string v10, "HU"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    .line 1311
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1312
    invoke-virtual {p0, v7, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNddPrefixForRegion(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    sget-object v10, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    .line 1313
    invoke-virtual {p0, v5, v10}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    .line 1314
    :cond_9
    if-ne v0, v9, :cond_b

    .line 1318
    invoke-virtual {p0, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v8

    .line 1319
    .local v8, "regionMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    invoke-virtual {p0, v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->canBeInternationallyDialled(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v9

    if-eqz v9, :cond_a

    .line 1320
    invoke-virtual {p0, v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v9

    .line 1321
    invoke-virtual {v8}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v10

    .line 1320
    invoke-direct {p0, v9, v10}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->testNumberLength(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    move-result-object v9

    sget-object v10, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->TOO_SHORT:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    if-eq v9, v10, :cond_a

    .line 1322
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {p0, v5, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    .line 1324
    :cond_a
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {p0, v5, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    .line 1330
    .end local v8    # "regionMetadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    :cond_b
    const-string v9, "001"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_d

    const-string v9, "MX"

    .line 1339
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    const-string v9, "CL"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    :cond_c
    if-eqz v3, :cond_e

    .line 1341
    :cond_d
    invoke-virtual {p0, v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->canBeInternationallyDialled(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v9

    if-eqz v9, :cond_e

    .line 1342
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {p0, v5, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_3

    .line 1344
    :cond_e
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {p0, v5, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_3

    .line 1347
    .end local v3    # "isFixedLineOrMobile":Z
    :cond_f
    if-eqz v4, :cond_3

    invoke-virtual {p0, v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->canBeInternationallyDialled(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 1351
    if-eqz p3, :cond_10

    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {p0, v5, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_0

    :cond_10
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->E164:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    .line 1352
    invoke-virtual {p0, v5, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_0

    .line 1355
    :cond_11
    invoke-static {v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeDiallableCharsOnly(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_4
.end method

.method public formatOutOfCountryCallingNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;
    .locals 13
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "regionCallingFrom"    # Ljava/lang/String;

    .prologue
    const/4 v11, 0x0

    .line 1377
    invoke-direct {p0, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    .line 1378
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v10, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Trying to format number from invalid region "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, ". International formatting applied."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 1382
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {p0, p1, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v7

    .line 1435
    :cond_0
    :goto_0
    return-object v7

    .line 1384
    :cond_1
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    .line 1385
    .local v0, "countryCallingCode":I
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v7

    .line 1386
    .local v7, "nationalSignificantNumber":Ljava/lang/String;
    invoke-direct {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->hasValidCountryCallingCode(I)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 1389
    const/4 v9, 0x1

    if-ne v0, v9, :cond_2

    .line 1390
    invoke-virtual {p0, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNANPACountry(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 1393
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    sget-object v10, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {p0, p1, v10}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 1395
    :cond_2
    invoke-direct {p0, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getCountryCodeForValidRegion(Ljava/lang/String;)I

    move-result v9

    if-ne v0, v9, :cond_3

    .line 1402
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {p0, p1, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 1405
    :cond_3
    invoke-virtual {p0, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v6

    .line 1406
    .local v6, "metadataForRegionCallingFrom":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    invoke-virtual {v6}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getInternationalPrefix()Ljava/lang/String;

    move-result-object v3

    .line 1410
    .local v3, "internationalPrefix":Ljava/lang/String;
    const-string v4, ""

    .line 1411
    .local v4, "internationalPrefixForFormatting":Ljava/lang/String;
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->UNIQUE_INTERNATIONAL_PREFIX:Ljava/util/regex/Pattern;

    invoke-virtual {v9, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/regex/Matcher;->matches()Z

    move-result v9

    if-eqz v9, :cond_5

    .line 1412
    move-object v4, v3

    .line 1418
    :cond_4
    :goto_1
    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v8

    .line 1421
    .local v8, "regionCode":Ljava/lang/String;
    invoke-direct {p0, v0, v8}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v5

    .line 1422
    .local v5, "metadataForRegion":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    .line 1423
    invoke-direct {p0, v7, v5, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatNsn(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v1

    .line 1424
    .local v1, "formattedNationalNumber":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1425
    .local v2, "formattedNumber":Ljava/lang/StringBuilder;
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-direct {p0, p1, v5, v9, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeAppendFormattedExtension(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    .line 1427
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_6

    .line 1428
    const-string v9, " "

    invoke-virtual {v2, v11, v9}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v11, v0}, Ljava/lang/StringBuilder;->insert(II)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " "

    invoke-virtual {v9, v11, v10}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 1429
    invoke-virtual {v9, v11, v4}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1435
    :goto_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_0

    .line 1413
    .end local v1    # "formattedNationalNumber":Ljava/lang/String;
    .end local v2    # "formattedNumber":Ljava/lang/StringBuilder;
    .end local v5    # "metadataForRegion":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .end local v8    # "regionCode":Ljava/lang/String;
    :cond_5
    invoke-virtual {v6}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->hasPreferredInternationalPrefix()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 1415
    invoke-virtual {v6}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPreferredInternationalPrefix()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 1431
    .restart local v1    # "formattedNationalNumber":Ljava/lang/String;
    .restart local v2    # "formattedNumber":Ljava/lang/StringBuilder;
    .restart local v5    # "metadataForRegion":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .restart local v8    # "regionCode":Ljava/lang/String;
    :cond_6
    sget-object v9, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-direct {p0, v0, v9, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->prefixNumberWithCountryCallingCode(ILio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    goto :goto_2
.end method

.method public formatOutOfCountryKeepingAlphaChars(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;
    .locals 18
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "regionCallingFrom"    # Ljava/lang/String;

    .prologue
    .line 1618
    invoke-virtual/range {p1 .. p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getRawInput()Ljava/lang/String;

    move-result-object v12

    .line 1621
    .local v12, "rawInput":Ljava/lang/String;
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v14

    if-nez v14, :cond_0

    .line 1622
    invoke-virtual/range {p0 .. p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatOutOfCountryCallingNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 1704
    :goto_0
    return-object v14

    .line 1624
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v2

    .line 1625
    .local v2, "countryCode":I
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->hasValidCountryCallingCode(I)Z

    move-result v14

    if-nez v14, :cond_1

    move-object v14, v12

    .line 1626
    goto :goto_0

    .line 1632
    :cond_1
    sget-object v14, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->ALL_PLUS_NUMBER_GROUPING_SYMBOLS:Ljava/util/Map;

    const/4 v15, 0x1

    invoke-static {v12, v14, v15}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalizeHelper(Ljava/lang/String;Ljava/util/Map;Z)Ljava/lang/String;

    move-result-object v12

    .line 1637
    invoke-virtual/range {p0 .. p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v10

    .line 1638
    .local v10, "nationalNumber":Ljava/lang/String;
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v14

    const/4 v15, 0x3

    if-le v14, v15, :cond_2

    .line 1639
    const/4 v14, 0x0

    const/4 v15, 0x3

    invoke-virtual {v10, v14, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 1640
    .local v3, "firstNationalNumberDigit":I
    const/4 v14, -0x1

    if-eq v3, v14, :cond_2

    .line 1641
    invoke-virtual {v12, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    .line 1644
    .end local v3    # "firstNationalNumberDigit":I
    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v9

    .line 1645
    .local v9, "metadataForRegionCallingFrom":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    const/4 v14, 0x1

    if-ne v2, v14, :cond_3

    .line 1646
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNANPACountry(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_5

    .line 1647
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string v15, " "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    goto :goto_0

    .line 1649
    :cond_3
    if-eqz v9, :cond_5

    .line 1650
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getCountryCodeForValidRegion(Ljava/lang/String;)I

    move-result v14

    if-ne v2, v14, :cond_5

    .line 1652
    invoke-virtual {v9}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->numberFormats()Ljava/util/List;

    move-result-object v14

    move-object/from16 v0, p0

    invoke-virtual {v0, v14, v10}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->chooseFormattingPatternForNumber(Ljava/util/List;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;

    move-result-object v5

    .line 1654
    .local v5, "formattingPattern":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    if-nez v5, :cond_4

    move-object v14, v12

    .line 1656
    goto :goto_0

    .line 1658
    :cond_4
    invoke-static {}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;->newBuilder()Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;

    move-result-object v11

    .line 1659
    .local v11, "newFormat":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;
    invoke-virtual {v11, v5}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;->mergeFrom(Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;

    .line 1661
    const-string v14, "(\\d+)(.*)"

    invoke-virtual {v11, v14}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;->setPattern(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;

    .line 1663
    const-string v14, "$1$2"

    invoke-virtual {v11, v14}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;->setFormat(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;

    .line 1669
    sget-object v14, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    move-object/from16 v0, p0

    invoke-virtual {v0, v12, v11, v14}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->formatNsnUsingPattern(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v14

    goto/16 :goto_0

    .line 1671
    .end local v5    # "formattingPattern":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat;
    .end local v11    # "newFormat":Lio/michaelrocks/libphonenumber/android/Phonemetadata$NumberFormat$Builder;
    :cond_5
    const-string v7, ""

    .line 1675
    .local v7, "internationalPrefixForFormatting":Ljava/lang/String;
    if-eqz v9, :cond_6

    .line 1676
    invoke-virtual {v9}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getInternationalPrefix()Ljava/lang/String;

    move-result-object v6

    .line 1677
    .local v6, "internationalPrefix":Ljava/lang/String;
    sget-object v14, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->UNIQUE_INTERNATIONAL_PREFIX:Ljava/util/regex/Pattern;

    .line 1678
    invoke-virtual {v14, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v14

    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    move-result v14

    if-eqz v14, :cond_7

    move-object v7, v6

    .line 1682
    .end local v6    # "internationalPrefix":Ljava/lang/String;
    :cond_6
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1683
    .local v4, "formattedNumber":Ljava/lang/StringBuilder;
    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v13

    .line 1685
    .local v13, "regionCode":Ljava/lang/String;
    move-object/from16 v0, p0

    invoke-direct {v0, v2, v13}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v8

    .line 1686
    .local v8, "metadataForRegion":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    sget-object v14, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v8, v14, v4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeAppendFormattedExtension(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    .line 1688
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v14

    if-lez v14, :cond_8

    .line 1689
    const/4 v14, 0x0

    const-string v15, " "

    invoke-virtual {v4, v14, v15}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    const/4 v15, 0x0

    invoke-virtual {v14, v15, v2}, Ljava/lang/StringBuilder;->insert(II)Ljava/lang/StringBuilder;

    move-result-object v14

    const/4 v15, 0x0

    const-string v16, " "

    invoke-virtual/range {v14 .. v16}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    const/4 v15, 0x0

    .line 1690
    invoke-virtual {v14, v15, v7}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1704
    :goto_2
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    goto/16 :goto_0

    .line 1680
    .end local v4    # "formattedNumber":Ljava/lang/StringBuilder;
    .end local v8    # "metadataForRegion":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .end local v13    # "regionCode":Ljava/lang/String;
    .restart local v6    # "internationalPrefix":Ljava/lang/String;
    :cond_7
    invoke-virtual {v9}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPreferredInternationalPrefix()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 1694
    .end local v6    # "internationalPrefix":Ljava/lang/String;
    .restart local v4    # "formattedNumber":Ljava/lang/StringBuilder;
    .restart local v8    # "metadataForRegion":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .restart local v13    # "regionCode":Ljava/lang/String;
    :cond_8
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_9

    .line 1695
    sget-object v14, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v15, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    const-string v17, "Trying to format number from invalid region "

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    const-string v17, ". International formatting applied."

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v14 .. v16}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 1700
    :cond_9
    sget-object v14, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v14, v4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->prefixNumberWithCountryCallingCode(ILio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuilder;)V

    goto :goto_2
.end method

.method public getAsYouTypeFormatter(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/AsYouTypeFormatter;
    .locals 1
    .param p1, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 2516
    new-instance v0, Lio/michaelrocks/libphonenumber/android/AsYouTypeFormatter;

    invoke-direct {v0, p0, p1}, Lio/michaelrocks/libphonenumber/android/AsYouTypeFormatter;-><init>(Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;Ljava/lang/String;)V

    return-object v0
.end method

.method public getCountryCodeForRegion(Ljava/lang/String;)I
    .locals 4
    .param p1, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 2270
    invoke-direct {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2271
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid or missing region code ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-nez p1, :cond_0

    const-string p1, "null"

    .end local p1    # "regionCode":Ljava/lang/String;
    :cond_0
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") provided."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 2275
    const/4 v0, 0x0

    .line 2277
    :goto_0
    return v0

    .restart local p1    # "regionCode":Ljava/lang/String;
    :cond_1
    invoke-direct {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getCountryCodeForValidRegion(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public getExampleNumber(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1
    .param p1, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 1854
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    invoke-virtual {p0, p1, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getExampleNumberForType(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move-result-object v0

    return-object v0
.end method

.method public getExampleNumberForNonGeoEntity(I)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 7
    .param p1, "countryCallingCode"    # I

    .prologue
    .line 1980
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForNonGeographicalRegion(I)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v2

    .line 1981
    .local v2, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-eqz v2, :cond_1

    .line 1986
    const/4 v3, 0x7

    new-array v3, v3, [Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    const/4 v4, 0x0

    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getMobile()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getTollFree()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    .line 1987
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getSharedCost()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x3

    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getVoip()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x4

    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getVoicemail()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x5

    .line 1988
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getUan()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x6

    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPremiumRate()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v5

    aput-object v5, v3, v4

    .line 1986
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    .line 1990
    .local v0, "desc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->hasExampleNumber()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1991
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "+"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getExampleNumber()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "ZZ"

    invoke-virtual {p0, v4, v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    :try_end_0
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 2001
    .end local v0    # "desc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    :goto_1
    return-object v3

    .line 1993
    .restart local v0    # "desc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    :catch_0
    move-exception v1

    .line 1994
    .local v1, "e":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v5, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/NumberParseException;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    goto :goto_0

    .line 1998
    .end local v0    # "desc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    .end local v1    # "e":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    :cond_1
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Invalid or unknown country calling code provided: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 2001
    :cond_2
    const/4 v3, 0x0

    goto :goto_1
.end method

.method public getExampleNumberForType(Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 9
    .param p1, "type"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .prologue
    .line 1949
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getSupportedRegions()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 1950
    .local v4, "regionCode":Ljava/lang/String;
    invoke-virtual {p0, v4, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getExampleNumberForType(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move-result-object v3

    .line 1951
    .local v3, "exampleNumber":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    if-eqz v3, :cond_0

    .line 1968
    .end local v3    # "exampleNumber":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .end local v4    # "regionCode":Ljava/lang/String;
    :goto_0
    return-object v3

    .line 1956
    :cond_1
    invoke-virtual {p0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getSupportedGlobalNetworkCallingCodes()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1958
    .local v0, "countryCallingCode":I
    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForNonGeographicalRegion(I)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v5

    .line 1957
    invoke-virtual {p0, v5, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNumberDescByType(Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v1

    .line 1960
    .local v1, "desc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    :try_start_0
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->hasExampleNumber()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 1961
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "+"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getExampleNumber()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "ZZ"

    invoke-virtual {p0, v5, v7}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    :try_end_0
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    goto :goto_0

    .line 1963
    :catch_0
    move-exception v2

    .line 1964
    .local v2, "e":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    sget-object v5, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/NumberParseException;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    goto :goto_1

    .line 1968
    .end local v0    # "countryCallingCode":I
    .end local v1    # "desc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    .end local v2    # "e":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    :cond_3
    const/4 v3, 0x0

    goto :goto_0
.end method

.method public getExampleNumberForType(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 7
    .param p1, "regionCode"    # Ljava/lang/String;
    .param p2, "type"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .prologue
    const/4 v2, 0x0

    .line 1925
    invoke-direct {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 1926
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Invalid or unknown region code provided: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 1937
    :cond_0
    :goto_0
    return-object v2

    .line 1929
    :cond_1
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v3

    invoke-virtual {p0, v3, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNumberDescByType(Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    .line 1931
    .local v0, "desc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    :try_start_0
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->hasExampleNumber()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1932
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getExampleNumber()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    :try_end_0
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 1934
    :catch_0
    move-exception v1

    .line 1935
    .local v1, "e":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/NumberParseException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public getInvalidExampleNumber(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 10
    .param p1, "regionCode"    # Ljava/lang/String;

    .prologue
    const/4 v5, 0x0

    .line 1869
    invoke-direct {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 1870
    sget-object v6, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Invalid or unknown region code provided: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    move-object v4, v5

    .line 1910
    :cond_0
    :goto_0
    return-object v4

    .line 1877
    :cond_1
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v6

    sget-object v7, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    invoke-virtual {p0, v6, v7}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNumberDescByType(Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    .line 1879
    .local v0, "desc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->hasExampleNumber()Z

    move-result v6

    if-nez v6, :cond_2

    move-object v4, v5

    .line 1881
    goto :goto_0

    .line 1883
    :cond_2
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getExampleNumber()Ljava/lang/String;

    move-result-object v1

    .line 1895
    .local v1, "exampleNumber":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v3, v6, -0x1

    .line 1896
    .local v3, "phoneNumberLength":I
    :goto_1
    const/4 v6, 0x2

    if-lt v3, v6, :cond_3

    .line 1898
    const/4 v6, 0x0

    invoke-virtual {v1, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 1900
    .local v2, "numberToTry":Ljava/lang/String;
    :try_start_0
    invoke-virtual {p0, v2, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move-result-object v4

    .line 1901
    .local v4, "possiblyValidNumber":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    invoke-virtual {p0, v4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    :try_end_0
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    if-eqz v6, :cond_0

    .line 1897
    .end local v4    # "possiblyValidNumber":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    :goto_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .end local v2    # "numberToTry":Ljava/lang/String;
    :cond_3
    move-object v4, v5

    .line 1910
    goto :goto_0

    .line 1904
    .restart local v2    # "numberToTry":Ljava/lang/String;
    :catch_0
    move-exception v6

    goto :goto_2
.end method

.method public getLengthOfGeographicalAreaCode(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)I
    .locals 6
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    const/4 v3, 0x0

    .line 805
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v1

    .line 806
    .local v1, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-nez v1, :cond_1

    .line 829
    :cond_0
    :goto_0
    return v3

    .line 811
    :cond_1
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->hasNationalPrefix()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->isItalianLeadingZero()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 815
    :cond_2
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNumberType(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    move-result-object v2

    .line 816
    .local v2, "type":Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    .line 817
    .local v0, "countryCallingCode":I
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-ne v2, v4, :cond_3

    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES:Ljava/util/Set;

    .line 821
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 825
    :cond_3
    invoke-virtual {p0, v2, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberGeographical(Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 829
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getLengthOfNationalDestinationCode(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)I

    move-result v3

    goto :goto_0
.end method

.method public getLengthOfNationalDestinationCode(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)I
    .locals 8
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    .line 868
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasExtension()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 871
    new-instance v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    invoke-direct {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;-><init>()V

    .line 872
    .local v0, "copiedProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    invoke-virtual {v0, p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->mergeFrom(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 873
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearExtension()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 878
    :goto_0
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {p0, v0, v4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->format(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v2

    .line 880
    .local v2, "nationalSignificantNumber":Ljava/lang/String;
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->NON_DIGITS_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v3

    .line 884
    .local v3, "numberGroups":[Ljava/lang/String;
    array-length v4, v3

    if-gt v4, v7, :cond_1

    .line 885
    const/4 v4, 0x0

    .line 899
    :goto_1
    return v4

    .line 875
    .end local v0    # "copiedProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .end local v2    # "nationalSignificantNumber":Ljava/lang/String;
    .end local v3    # "numberGroups":[Ljava/lang/String;
    :cond_0
    move-object v0, p1

    .restart local v0    # "copiedProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    goto :goto_0

    .line 888
    .restart local v2    # "nationalSignificantNumber":Ljava/lang/String;
    .restart local v3    # "numberGroups":[Ljava/lang/String;
    :cond_1
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNumberType(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    move-result-object v4

    sget-object v5, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-ne v4, v5, :cond_2

    .line 894
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v4

    invoke-static {v4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getCountryMobileToken(I)Ljava/lang/String;

    move-result-object v1

    .line 895
    .local v1, "mobileToken":Ljava/lang/String;
    const-string v4, ""

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 896
    aget-object v4, v3, v6

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    aget-object v5, v3, v7

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_1

    .line 899
    .end local v1    # "mobileToken":Ljava/lang/String;
    :cond_2
    aget-object v4, v3, v6

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    goto :goto_1
.end method

.method getMetadataForNonGeographicalRegion(I)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .locals 2
    .param p1, "countryCallingCode"    # I

    .prologue
    .line 2128
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->countryCallingCodeToRegionCodeMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2129
    const/4 v0, 0x0

    .line 2131
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    invoke-interface {v0, p1}, Lio/michaelrocks/libphonenumber/android/MetadataSource;->getMetadataForNonGeographicalRegion(I)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    goto :goto_0
.end method

.method getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .locals 1
    .param p1, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 2121
    invoke-direct {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2122
    const/4 v0, 0x0

    .line 2124
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    invoke-interface {v0, p1}, Lio/michaelrocks/libphonenumber/android/MetadataSource;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    goto :goto_0
.end method

.method getMetadataSource()Lio/michaelrocks/libphonenumber/android/MetadataSource;
    .locals 1

    .prologue
    .line 614
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    return-object v0
.end method

.method public getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;
    .locals 4
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 1716
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1717
    .local v0, "nationalNumber":Ljava/lang/StringBuilder;
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->isItalianLeadingZero()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1718
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNumberOfLeadingZeros()I

    move-result v2

    new-array v1, v2, [C

    .line 1719
    .local v1, "zeros":[C
    const/16 v2, 0x30

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([CC)V

    .line 1720
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1722
    .end local v1    # "zeros":[C
    :cond_0
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNationalNumber()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1723
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public getNddPrefixForRegion(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 7
    .param p1, "regionCode"    # Ljava/lang/String;
    .param p2, "stripNonDigits"    # Z

    .prologue
    const/4 v2, 0x0

    .line 2311
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    .line 2312
    .local v0, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-nez v0, :cond_2

    .line 2313
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Invalid or missing region code ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    if-nez p1, :cond_0

    const-string p1, "null"

    .end local p1    # "regionCode":Ljava/lang/String;
    :cond_0
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ") provided."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    move-object v1, v2

    .line 2329
    :cond_1
    :goto_0
    return-object v1

    .line 2319
    .restart local p1    # "regionCode":Ljava/lang/String;
    :cond_2
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getNationalPrefix()Ljava/lang/String;

    move-result-object v1

    .line 2321
    .local v1, "nationalPrefix":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_3

    move-object v1, v2

    .line 2322
    goto :goto_0

    .line 2324
    :cond_3
    if-eqz p2, :cond_1

    .line 2327
    const-string v2, "~"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method getNumberDescByType(Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    .locals 2
    .param p1, "metadata"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .param p2, "type"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .prologue
    .line 2025
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$2;->$SwitchMap$io$michaelrocks$libphonenumber$android$PhoneNumberUtil$PhoneNumberType:[I

    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 2048
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    :goto_0
    return-object v0

    .line 2027
    :pswitch_0
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPremiumRate()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    goto :goto_0

    .line 2029
    :pswitch_1
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getTollFree()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    goto :goto_0

    .line 2031
    :pswitch_2
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getMobile()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    goto :goto_0

    .line 2034
    :pswitch_3
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getFixedLine()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    goto :goto_0

    .line 2036
    :pswitch_4
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getSharedCost()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    goto :goto_0

    .line 2038
    :pswitch_5
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getVoip()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    goto :goto_0

    .line 2040
    :pswitch_6
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPersonalNumber()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    goto :goto_0

    .line 2042
    :pswitch_7
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getPager()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    goto :goto_0

    .line 2044
    :pswitch_8
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getUan()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    goto :goto_0

    .line 2046
    :pswitch_9
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getVoicemail()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v0

    goto :goto_0

    .line 2025
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method public getNumberType(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;
    .locals 4
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 2059
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v2

    .line 2060
    .local v2, "regionCode":Ljava/lang/String;
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v3

    invoke-direct {p0, v3, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    .line 2061
    .local v0, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-nez v0, :cond_0

    .line 2062
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->UNKNOWN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 2065
    :goto_0
    return-object v3

    .line 2064
    :cond_0
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v1

    .line 2065
    .local v1, "nationalSignificantNumber":Ljava/lang/String;
    invoke-direct {p0, v1, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNumberTypeHelper(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    move-result-object v3

    goto :goto_0
.end method

.method public getRegionCodeForCountryCode(I)Ljava/lang/String;
    .locals 3
    .param p1, "countryCallingCode"    # I

    .prologue
    .line 2247
    iget-object v1, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->countryCallingCodeToRegionCodeMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 2248
    .local v0, "regionCodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-nez v0, :cond_0

    const-string v1, "ZZ"

    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_0
.end method

.method public getRegionCodeForNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;
    .locals 7
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 2204
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    .line 2205
    .local v0, "countryCode":I
    iget-object v3, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->countryCallingCodeToRegionCodeMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 2206
    .local v2, "regions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-nez v2, :cond_0

    .line 2207
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v1

    .line 2208
    .local v1, "numberString":Ljava/lang/String;
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Missing/invalid country_code ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ") for number "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 2210
    const/4 v3, 0x0

    .line 2215
    .end local v1    # "numberString":Ljava/lang/String;
    :goto_0
    return-object v3

    .line 2212
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 2213
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_0

    .line 2215
    :cond_1
    invoke-direct {p0, p1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForNumberFromRegionList(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0
.end method

.method public getRegionCodesForCountryCode(I)Ljava/util/List;
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
    .line 2257
    iget-object v1, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->countryCallingCodeToRegionCodeMap:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 2258
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

.method public getShortNumberInfo()Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;
    .locals 3

    .prologue
    .line 618
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->shortNumberInfo:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;

    if-nez v0, :cond_1

    .line 619
    monitor-enter p0

    .line 620
    :try_start_0
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->shortNumberInfo:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;

    if-nez v0, :cond_0

    .line 621
    new-instance v0, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;

    iget-object v1, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->metadataSource:Lio/michaelrocks/libphonenumber/android/MetadataSource;

    invoke-static {}, Lio/michaelrocks/libphonenumber/android/internal/RegexBasedMatcher;->create()Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;-><init>(Lio/michaelrocks/libphonenumber/android/MetadataSource;Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;)V

    iput-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->shortNumberInfo:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;

    .line 623
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 625
    :cond_1
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->shortNumberInfo:Lio/michaelrocks/libphonenumber/android/ShortNumberInfo;

    return-object v0

    .line 623
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public getSupportedGlobalNetworkCallingCodes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 958
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->countryCodesForNonGeographicalRegion:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getSupportedRegions()Ljava/util/Set;
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
    .line 950
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->supportedRegions:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public isAlphaNumber(Ljava/lang/String;)Z
    .locals 2
    .param p1, "number"    # Ljava/lang/String;

    .prologue
    .line 2367
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isViablePhoneNumber(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2369
    const/4 v1, 0x0

    .line 2373
    :goto_0
    return v1

    .line 2371
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2372
    .local v0, "strippedNumber":Ljava/lang/StringBuilder;
    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeStripExtension(Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 2373
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->VALID_ALPHA_PHONE_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    goto :goto_0
.end method

.method isLeadingZeroPossible(I)Z
    .locals 2
    .param p1, "countryCallingCode"    # I

    .prologue
    .line 2347
    .line 2349
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v1

    .line 2348
    invoke-direct {p0, p1, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    .line 2350
    .local v0, "mainMetadataForCallingCode":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-nez v0, :cond_0

    .line 2351
    const/4 v1, 0x0

    .line 2353
    :goto_0
    return v1

    :cond_0
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->isLeadingZeroPossible()Z

    move-result v1

    goto :goto_0
.end method

.method public isMobileNumberPortableRegion(Ljava/lang/String;)Z
    .locals 5
    .param p1, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 3305
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v0

    .line 3306
    .local v0, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-nez v0, :cond_0

    .line 3307
    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->logger:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid or unknown region code provided: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 3308
    const/4 v1, 0x0

    .line 3310
    :goto_0
    return v1

    :cond_0
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->isMobileNumberPortableRegion()Z

    move-result v1

    goto :goto_0
.end method

.method public isNANPACountry(Ljava/lang/String;)Z
    .locals 1
    .param p1, "regionCode"    # Ljava/lang/String;

    .prologue
    .line 2338
    iget-object v0, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->nanpaRegions:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isNumberGeographical(Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;I)Z
    .locals 2
    .param p1, "numberType"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;
    .param p2, "countryCallingCode"    # I

    .prologue
    .line 1044
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-eq p1, v0, :cond_0

    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE_OR_MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-eq p1, v0, :cond_0

    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->GEO_MOBILE_COUNTRIES:Ljava/util/Set;

    .line 1046
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 1044
    :goto_0
    return v0

    .line 1046
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isNumberGeographical(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 2
    .param p1, "phoneNumber"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 1033
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNumberType(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    move-result-object v0

    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberGeographical(Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;I)Z

    move-result v0

    return v0
.end method

.method public isNumberMatch(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;
    .locals 6
    .param p1, "firstNumberIn"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "secondNumberIn"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 3127
    new-instance v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    invoke-direct {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;-><init>()V

    .line 3128
    .local v0, "firstNumber":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    invoke-virtual {v0, p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->mergeFrom(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3129
    new-instance v2, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    invoke-direct {v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;-><init>()V

    .line 3130
    .local v2, "secondNumber":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    invoke-virtual {v2, p2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->mergeFrom(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3133
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearRawInput()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3134
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearCountryCodeSource()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3135
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearPreferredDomesticCarrierCode()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3136
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearRawInput()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3137
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearCountryCodeSource()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3138
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearPreferredDomesticCarrierCode()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3139
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasExtension()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 3140
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    .line 3141
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearExtension()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3143
    :cond_0
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasExtension()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 3144
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    .line 3145
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->clearExtension()Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3148
    :cond_1
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasExtension()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->hasExtension()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 3149
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 3150
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;->NO_MATCH:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    .line 3178
    :goto_0
    return-object v4

    .line 3152
    :cond_2
    invoke-virtual {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v1

    .line 3153
    .local v1, "firstNumberCountryCode":I
    invoke-virtual {v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v3

    .line 3155
    .local v3, "secondNumberCountryCode":I
    if-eqz v1, :cond_5

    if-eqz v3, :cond_5

    .line 3156
    invoke-virtual {v0, v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->exactlySameAs(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 3157
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;->EXACT_MATCH:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    goto :goto_0

    .line 3158
    :cond_3
    if-ne v1, v3, :cond_4

    .line 3159
    invoke-direct {p0, v0, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNationalNumberSuffixOfTheOther(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 3163
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;->SHORT_NSN_MATCH:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    goto :goto_0

    .line 3166
    :cond_4
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;->NO_MATCH:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    goto :goto_0

    .line 3170
    :cond_5
    invoke-virtual {v0, v3}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setCountryCode(I)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 3172
    invoke-virtual {v0, v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->exactlySameAs(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 3173
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;->NSN_MATCH:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    goto :goto_0

    .line 3175
    :cond_6
    invoke-direct {p0, v0, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNationalNumberSuffixOfTheOther(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 3176
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;->SHORT_NSN_MATCH:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    goto :goto_0

    .line 3178
    :cond_7
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;->NO_MATCH:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    goto :goto_0
.end method

.method public isNumberMatch(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;
    .locals 11
    .param p1, "firstNumber"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "secondNumber"    # Ljava/lang/String;

    .prologue
    .line 3244
    :try_start_0
    const-string v0, "ZZ"

    invoke-virtual {p0, p2, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move-result-object v9

    .line 3245
    .local v9, "secondNumberAsProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    invoke-virtual {p0, p1, v9}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatch(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;
    :try_end_0
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    .line 3273
    .end local v9    # "secondNumberAsProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    :cond_0
    :goto_0
    return-object v8

    .line 3246
    :catch_0
    move-exception v6

    .line 3247
    .local v6, "e":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    invoke-virtual {v6}, Lio/michaelrocks/libphonenumber/android/NumberParseException;->getErrorType()Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    move-result-object v0

    sget-object v1, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->INVALID_COUNTRY_CODE:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    if-ne v0, v1, :cond_2

    .line 3251
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v7

    .line 3253
    .local v7, "firstNumberRegion":Ljava/lang/String;
    :try_start_1
    const-string v0, "ZZ"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3254
    invoke-virtual {p0, p2, v7}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move-result-object v10

    .line 3255
    .local v10, "secondNumberWithFirstNumberRegion":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    invoke-virtual {p0, p1, v10}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatch(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    move-result-object v8

    .line 3256
    .local v8, "match":Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;->EXACT_MATCH:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    if-ne v8, v0, :cond_0

    .line 3257
    sget-object v8, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;->NSN_MATCH:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    goto :goto_0

    .line 3263
    .end local v8    # "match":Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;
    .end local v10    # "secondNumberWithFirstNumberRegion":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    :cond_1
    new-instance v5, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    invoke-direct {v5}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;-><init>()V

    .line 3264
    .local v5, "secondNumberProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parseHelper(Ljava/lang/String;Ljava/lang/String;ZZLio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V

    .line 3265
    invoke-virtual {p0, p1, v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatch(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;
    :try_end_1
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v8

    goto :goto_0

    .line 3267
    .end local v5    # "secondNumberProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    :catch_1
    move-exception v0

    .line 3273
    .end local v7    # "firstNumberRegion":Ljava/lang/String;
    :cond_2
    sget-object v8, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;->NOT_A_NUMBER:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    goto :goto_0
.end method

.method public isNumberMatch(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;
    .locals 19
    .param p1, "firstNumber"    # Ljava/lang/String;
    .param p2, "secondNumber"    # Ljava/lang/String;

    .prologue
    .line 3204
    :try_start_0
    const-string v3, "ZZ"

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move-result-object v17

    .line 3205
    .local v17, "firstNumberAsProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatch(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;
    :try_end_0
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 3227
    .end local v17    # "firstNumberAsProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    :goto_0
    return-object v3

    .line 3206
    :catch_0
    move-exception v15

    .line 3207
    .local v15, "e":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    invoke-virtual {v15}, Lio/michaelrocks/libphonenumber/android/NumberParseException;->getErrorType()Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    move-result-object v3

    sget-object v4, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->INVALID_COUNTRY_CODE:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    if-ne v3, v4, :cond_0

    .line 3209
    :try_start_1
    const-string v3, "ZZ"

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, v3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move-result-object v18

    .line 3210
    .local v18, "secondNumberAsProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, p1

    invoke-virtual {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatch(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;
    :try_end_1
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v3

    goto :goto_0

    .line 3211
    .end local v18    # "secondNumberAsProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    :catch_1
    move-exception v16

    .line 3212
    .local v16, "e2":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    invoke-virtual/range {v16 .. v16}, Lio/michaelrocks/libphonenumber/android/NumberParseException;->getErrorType()Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    move-result-object v3

    sget-object v4, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->INVALID_COUNTRY_CODE:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    if-ne v3, v4, :cond_0

    .line 3214
    :try_start_2
    new-instance v8, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    invoke-direct {v8}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;-><init>()V

    .line 3215
    .local v8, "firstNumberProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    new-instance v14, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    invoke-direct {v14}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;-><init>()V

    .line 3216
    .local v14, "secondNumberProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct/range {v3 .. v8}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parseHelper(Ljava/lang/String;Ljava/lang/String;ZZLio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V

    .line 3217
    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p0

    move-object/from16 v10, p2

    invoke-direct/range {v9 .. v14}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parseHelper(Ljava/lang/String;Ljava/lang/String;ZZLio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V

    .line 3218
    move-object/from16 v0, p0

    invoke-virtual {v0, v8, v14}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isNumberMatch(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;
    :try_end_2
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v3

    goto :goto_0

    .line 3219
    .end local v8    # "firstNumberProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .end local v14    # "secondNumberProto":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    :catch_2
    move-exception v3

    .line 3227
    .end local v16    # "e2":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    :cond_0
    sget-object v3, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;->NOT_A_NUMBER:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$MatchType;

    goto :goto_0
.end method

.method isNumberMatchingDesc(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Z
    .locals 5
    .param p1, "nationalNumber"    # Ljava/lang/String;
    .param p2, "numberDesc"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    .prologue
    .line 2138
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 2139
    .local v0, "actualLength":I
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getPossibleLengthList()Ljava/util/List;

    move-result-object v2

    .line 2140
    .local v2, "possibleLengths":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 2141
    const/4 v3, 0x0

    .line 2146
    :goto_0
    return v3

    .line 2143
    :cond_0
    iget-object v3, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    .line 2144
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getNationalNumberPattern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/michaelrocks/libphonenumber/android/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    .line 2145
    invoke-virtual {v3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 2146
    .local v1, "nationalNumberPatternMatcher":Ljava/util/regex/Matcher;
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    goto :goto_0
.end method

.method public isPossibleNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 2
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 2383
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isPossibleNumberWithReason(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    move-result-object v0

    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->IS_POSSIBLE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isPossibleNumber(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .param p1, "number"    # Ljava/lang/String;
    .param p2, "regionDialingFrom"    # Ljava/lang/String;

    .prologue
    .line 2476
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isPossibleNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    :try_end_0
    .catch Lio/michaelrocks/libphonenumber/android/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 2478
    :goto_0
    return v1

    .line 2477
    :catch_0
    move-exception v0

    .line 2478
    .local v0, "e":Lio/michaelrocks/libphonenumber/android/NumberParseException;
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public isPossibleNumberWithReason(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;
    .locals 5
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 2440
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v2

    .line 2441
    .local v2, "nationalNumber":Ljava/lang/String;
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    .line 2446
    .local v0, "countryCode":I
    invoke-direct {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->hasValidCountryCallingCode(I)Z

    move-result v4

    if-nez v4, :cond_0

    .line 2447
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->INVALID_COUNTRY_CODE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    .line 2452
    :goto_0
    return-object v4

    .line 2449
    :cond_0
    invoke-virtual {p0, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;

    move-result-object v3

    .line 2451
    .local v3, "regionCode":Ljava/lang/String;
    invoke-direct {p0, v0, v3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v1

    .line 2452
    .local v1, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    invoke-virtual {v1}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v4

    invoke-direct {p0, v2, v4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->testNumberLength(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    move-result-object v4

    goto :goto_0
.end method

.method public isValidNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 2
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    .line 2161
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getRegionCodeForNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v0

    .line 2162
    .local v0, "regionCode":Ljava/lang/String;
    invoke-virtual {p0, p1, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidNumberForRegion(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Z

    move-result v1

    return v1
.end method

.method public isValidNumberForRegion(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;)Z
    .locals 6
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "regionCode"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 2182
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    .line 2183
    .local v0, "countryCode":I
    invoke-direct {p0, v0, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getMetadataForRegionOrCallingCode(ILjava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;

    move-result-object v1

    .line 2184
    .local v1, "metadata":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    if-eqz v1, :cond_0

    const-string v4, "001"

    .line 2185
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 2186
    invoke-direct {p0, p2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getCountryCodeForValidRegion(Ljava/lang/String;)I

    move-result v4

    if-eq v0, v4, :cond_1

    .line 2192
    :cond_0
    :goto_0
    return v3

    .line 2191
    :cond_1
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNationalSignificantNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Ljava/lang/String;

    move-result-object v2

    .line 2192
    .local v2, "nationalSignificantNumber":Ljava/lang/String;
    invoke-direct {p0, v2, v1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->getNumberTypeHelper(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    move-result-object v4

    sget-object v5, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->UNKNOWN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    if-eq v4, v5, :cond_0

    const/4 v3, 0x1

    goto :goto_0
.end method

.method maybeExtractCountryCode(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Ljava/lang/StringBuilder;ZLio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)I
    .locals 14
    .param p1, "number"    # Ljava/lang/String;
    .param p2, "defaultRegionMetadata"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .param p3, "nationalNumber"    # Ljava/lang/StringBuilder;
    .param p4, "keepRawInput"    # Z
    .param p5, "phoneNumber"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/michaelrocks/libphonenumber/android/NumberParseException;
        }
    .end annotation

    .prologue
    .line 2576
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_0

    .line 2577
    const/4 v8, 0x0

    .line 2639
    :goto_0
    return v8

    .line 2579
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2581
    .local v4, "fullNumber":Ljava/lang/StringBuilder;
    const-string v7, "NonMatch"

    .line 2582
    .local v7, "possibleCountryIddPrefix":Ljava/lang/String;
    if-eqz p2, :cond_1

    .line 2583
    invoke-virtual/range {p2 .. p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getInternationalPrefix()Ljava/lang/String;

    move-result-object v7

    .line 2587
    :cond_1
    invoke-virtual {p0, v4, v7}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeStripInternationalPrefixAndNormalize(Ljava/lang/StringBuilder;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    move-result-object v1

    .line 2588
    .local v1, "countryCodeSource":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;
    if-eqz p4, :cond_2

    .line 2589
    move-object/from16 v0, p5

    invoke-virtual {v0, v1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setCountryCodeSource(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 2591
    :cond_2
    sget-object v11, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_DEFAULT_COUNTRY:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    if-eq v1, v11, :cond_5

    .line 2592
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v11

    const/4 v12, 0x2

    if-gt v11, v12, :cond_3

    .line 2593
    new-instance v11, Lio/michaelrocks/libphonenumber/android/NumberParseException;

    sget-object v12, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->TOO_SHORT_AFTER_IDD:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    const-string v13, "Phone number had an IDD, but after this was not long enough to be a viable phone number."

    invoke-direct {v11, v12, v13}, Lio/michaelrocks/libphonenumber/android/NumberParseException;-><init>(Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;Ljava/lang/String;)V

    throw v11

    .line 2597
    :cond_3
    move-object/from16 v0, p3

    invoke-virtual {p0, v4, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->extractCountryCode(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)I

    move-result v8

    .line 2598
    .local v8, "potentialCountryCode":I
    if-eqz v8, :cond_4

    .line 2599
    move-object/from16 v0, p5

    invoke-virtual {v0, v8}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setCountryCode(I)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    goto :goto_0

    .line 2605
    :cond_4
    new-instance v11, Lio/michaelrocks/libphonenumber/android/NumberParseException;

    sget-object v12, Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;->INVALID_COUNTRY_CODE:Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;

    const-string v13, "Country calling code supplied was not recognised."

    invoke-direct {v11, v12, v13}, Lio/michaelrocks/libphonenumber/android/NumberParseException;-><init>(Lio/michaelrocks/libphonenumber/android/NumberParseException$ErrorType;Ljava/lang/String;)V

    throw v11

    .line 2607
    .end local v8    # "potentialCountryCode":I
    :cond_5
    if-eqz p2, :cond_9

    .line 2611
    invoke-virtual/range {p2 .. p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getCountryCode()I

    move-result v2

    .line 2612
    .local v2, "defaultCountryCode":I
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 2613
    .local v3, "defaultCountryCodeString":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 2614
    .local v6, "normalizedNumber":Ljava/lang/String;
    invoke-virtual {v6, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_9

    .line 2615
    new-instance v9, Ljava/lang/StringBuilder;

    .line 2616
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v11

    invoke-virtual {v6, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2617
    .local v9, "potentialNationalNumber":Ljava/lang/StringBuilder;
    invoke-virtual/range {p2 .. p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v5

    .line 2618
    .local v5, "generalDesc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    iget-object v11, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    .line 2619
    invoke-virtual {v5}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getNationalNumberPattern()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Lio/michaelrocks/libphonenumber/android/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v10

    .line 2620
    .local v10, "validNumberPattern":Ljava/util/regex/Pattern;
    const/4 v11, 0x0

    move-object/from16 v0, p2

    invoke-virtual {p0, v9, v0, v11}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->maybeStripNationalPrefixAndCarrierCode(Ljava/lang/StringBuilder;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Ljava/lang/StringBuilder;)Z

    .line 2625
    invoke-virtual {v10, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    move-result v11

    if-nez v11, :cond_6

    .line 2626
    invoke-virtual {v10, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    move-result v11

    if-nez v11, :cond_7

    .line 2627
    :cond_6
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {p0, v11, v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->testNumberLength(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    move-result-object v11

    sget-object v12, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->TOO_LONG:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    if-ne v11, v12, :cond_9

    .line 2628
    :cond_7
    move-object/from16 v0, p3

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 2629
    if-eqz p4, :cond_8

    .line 2630
    sget-object v11, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITHOUT_PLUS_SIGN:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    move-object/from16 v0, p5

    invoke-virtual {v0, v11}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setCountryCodeSource(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 2632
    :cond_8
    move-object/from16 v0, p5

    invoke-virtual {v0, v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setCountryCode(I)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    move v8, v2

    .line 2633
    goto/16 :goto_0

    .line 2638
    .end local v2    # "defaultCountryCode":I
    .end local v3    # "defaultCountryCodeString":Ljava/lang/String;
    .end local v5    # "generalDesc":Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    .end local v6    # "normalizedNumber":Ljava/lang/String;
    .end local v9    # "potentialNationalNumber":Ljava/lang/StringBuilder;
    .end local v10    # "validNumberPattern":Ljava/util/regex/Pattern;
    :cond_9
    const/4 v11, 0x0

    move-object/from16 v0, p5

    invoke-virtual {v0, v11}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setCountryCode(I)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 2639
    const/4 v8, 0x0

    goto/16 :goto_0
.end method

.method maybeStripExtension(Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 6
    .param p1, "number"    # Ljava/lang/StringBuilder;

    .prologue
    .line 2770
    sget-object v4, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->EXTN_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v4, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 2773
    .local v3, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->start()I

    move-result v5

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isViablePhoneNumber(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 2775
    const/4 v1, 0x1

    .local v1, "i":I
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v2

    .local v2, "length":I
    :goto_0
    if-gt v1, v2, :cond_1

    .line 2776
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 2779
    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 2780
    .local v0, "extension":Ljava/lang/String;
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->start()I

    move-result v4

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 2785
    .end local v0    # "extension":Ljava/lang/String;
    .end local v1    # "i":I
    .end local v2    # "length":I
    :goto_1
    return-object v0

    .line 2775
    .restart local v1    # "i":I
    .restart local v2    # "length":I
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2785
    .end local v1    # "i":I
    .end local v2    # "length":I
    :cond_1
    const-string v0, ""

    goto :goto_1
.end method

.method maybeStripInternationalPrefixAndNormalize(Ljava/lang/StringBuilder;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;
    .locals 4
    .param p1, "number"    # Ljava/lang/StringBuilder;
    .param p2, "possibleIddPrefix"    # Ljava/lang/String;

    .prologue
    .line 2681
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-nez v2, :cond_0

    .line 2682
    sget-object v2, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_DEFAULT_COUNTRY:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    .line 2695
    :goto_0
    return-object v2

    .line 2685
    :cond_0
    sget-object v2, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->PLUS_CHARS_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 2686
    .local v1, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2687
    const/4 v2, 0x0

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->end()I

    move-result v3

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 2689
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalize(Ljava/lang/StringBuilder;)V

    .line 2690
    sget-object v2, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_PLUS_SIGN:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    goto :goto_0

    .line 2693
    :cond_1
    iget-object v2, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    invoke-virtual {v2, p2}, Lio/michaelrocks/libphonenumber/android/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 2694
    .local v0, "iddPattern":Ljava/util/regex/Pattern;
    invoke-static {p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->normalize(Ljava/lang/StringBuilder;)V

    .line 2695
    invoke-direct {p0, v0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parsePrefixAsIdd(Ljava/util/regex/Pattern;Ljava/lang/StringBuilder;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_IDD:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    goto :goto_0

    :cond_2
    sget-object v2, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_DEFAULT_COUNTRY:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    goto :goto_0
.end method

.method maybeStripNationalPrefixAndCarrierCode(Ljava/lang/StringBuilder;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;Ljava/lang/StringBuilder;)Z
    .locals 12
    .param p1, "number"    # Ljava/lang/StringBuilder;
    .param p2, "metadata"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;
    .param p3, "carrierCode"    # Ljava/lang/StringBuilder;

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 2712
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    .line 2713
    .local v3, "numberLength":I
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getNationalPrefixForParsing()Ljava/lang/String;

    move-result-object v4

    .line 2714
    .local v4, "possibleNationalPrefix":Ljava/lang/String;
    if-eqz v3, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v10

    if-nez v10, :cond_1

    .line 2758
    :cond_0
    :goto_0
    return v8

    .line 2719
    :cond_1
    iget-object v10, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    invoke-virtual {v10, v4}, Lio/michaelrocks/libphonenumber/android/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v10

    invoke-virtual {v10, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 2720
    .local v5, "prefixMatcher":Ljava/util/regex/Matcher;
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v10

    if-eqz v10, :cond_0

    .line 2721
    iget-object v10, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    .line 2722
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;

    move-result-object v11

    invoke-virtual {v11}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getNationalNumberPattern()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lio/michaelrocks/libphonenumber/android/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 2724
    .local v1, "nationalNumberRule":Ljava/util/regex/Pattern;
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    .line 2728
    .local v0, "isViableOriginalNumber":Z
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v2

    .line 2729
    .local v2, "numOfGroups":I
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneMetadata;->getNationalPrefixTransformRule()Ljava/lang/String;

    move-result-object v6

    .line 2730
    .local v6, "transformRule":Ljava/lang/String;
    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v10

    if-eqz v10, :cond_2

    .line 2731
    invoke-virtual {v5, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_5

    .line 2733
    :cond_2
    if-eqz v0, :cond_3

    .line 2734
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->end()I

    move-result v10

    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    move-result v10

    if-eqz v10, :cond_0

    .line 2737
    :cond_3
    if-eqz p3, :cond_4

    if-lez v2, :cond_4

    invoke-virtual {v5, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_4

    .line 2738
    invoke-virtual {v5, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2740
    :cond_4
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->end()I

    move-result v10

    invoke-virtual {p1, v8, v10}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    move v8, v9

    .line 2741
    goto :goto_0

    .line 2745
    :cond_5
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 2746
    .local v7, "transformedNumber":Ljava/lang/StringBuilder;
    invoke-virtual {v5, v6}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v8, v3, v10}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 2747
    if-eqz v0, :cond_6

    .line 2748
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    move-result v10

    if-eqz v10, :cond_0

    .line 2751
    :cond_6
    if-eqz p3, :cond_7

    if-le v2, v9, :cond_7

    .line 2752
    invoke-virtual {v5, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2754
    :cond_7
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p1, v8, v10, v11}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    move v8, v9

    .line 2755
    goto/16 :goto_0
.end method

.method public parse(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1
    .param p1, "numberToParse"    # Ljava/lang/String;
    .param p2, "defaultRegion"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/michaelrocks/libphonenumber/android/NumberParseException;
        }
    .end annotation

    .prologue
    .line 2833
    new-instance v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    invoke-direct {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;-><init>()V

    .line 2834
    .local v0, "phoneNumber":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    invoke-virtual {p0, p1, p2, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V

    .line 2835
    return-object v0
.end method

.method public parse(Ljava/lang/String;Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V
    .locals 6
    .param p1, "numberToParse"    # Ljava/lang/String;
    .param p2, "defaultRegion"    # Ljava/lang/String;
    .param p3, "phoneNumber"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/michaelrocks/libphonenumber/android/NumberParseException;
        }
    .end annotation

    .prologue
    .line 2844
    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parseHelper(Ljava/lang/String;Ljava/lang/String;ZZLio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V

    .line 2845
    return-void
.end method

.method public parseAndKeepRawInput(Ljava/lang/String;Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .locals 1
    .param p1, "numberToParse"    # Ljava/lang/String;
    .param p2, "defaultRegion"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/michaelrocks/libphonenumber/android/NumberParseException;
        }
    .end annotation

    .prologue
    .line 2863
    new-instance v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    invoke-direct {v0}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;-><init>()V

    .line 2864
    .local v0, "phoneNumber":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    invoke-virtual {p0, p1, p2, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parseAndKeepRawInput(Ljava/lang/String;Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V

    .line 2865
    return-object v0
.end method

.method public parseAndKeepRawInput(Ljava/lang/String;Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V
    .locals 6
    .param p1, "numberToParse"    # Ljava/lang/String;
    .param p2, "defaultRegion"    # Ljava/lang/String;
    .param p3, "phoneNumber"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/michaelrocks/libphonenumber/android/NumberParseException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 2875
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, v3

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->parseHelper(Ljava/lang/String;Ljava/lang/String;ZZLio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)V

    .line 2876
    return-void
.end method

.method public truncateTooLongNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z
    .locals 6
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .prologue
    const/4 v3, 0x1

    .line 2490
    invoke-virtual {p0, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 2505
    :goto_0
    return v3

    .line 2493
    :cond_0
    new-instance v2, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    invoke-direct {v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;-><init>()V

    .line 2494
    .local v2, "numberCopy":Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    invoke-virtual {v2, p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->mergeFrom(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 2495
    invoke-virtual {p1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->getNationalNumber()J

    move-result-wide v0

    .line 2497
    .local v0, "nationalNumber":J
    :cond_1
    const-wide/16 v4, 0xa

    div-long/2addr v0, v4

    .line 2498
    invoke-virtual {v2, v0, v1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setNationalNumber(J)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    .line 2499
    invoke-virtual {p0, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isPossibleNumberWithReason(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    move-result-object v4

    sget-object v5, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;->TOO_SHORT:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$ValidationResult;

    if-eq v4, v5, :cond_2

    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-nez v4, :cond_3

    .line 2501
    :cond_2
    const/4 v3, 0x0

    goto :goto_0

    .line 2503
    :cond_3
    invoke-virtual {p0, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 2504
    invoke-virtual {p1, v0, v1}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;->setNationalNumber(J)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;

    goto :goto_0
.end method
