.class public Lcom/stripe/android/model/Card;
.super Lcom/stripe/android/model/StripeJsonModel;
.source "Card.java"

# interfaces
.implements Lcom/stripe/android/model/StripePaymentSource;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/Card$Builder;,
        Lcom/stripe/android/model/Card$FundingType;,
        Lcom/stripe/android/model/Card$CardBrand;
    }
.end annotation


# static fields
.field public static final BRAND_RESOURCE_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final PREFIXES_AMERICAN_EXPRESS:[Ljava/lang/String;

.field public static final PREFIXES_DINERS_CLUB:[Ljava/lang/String;

.field public static final PREFIXES_DISCOVER:[Ljava/lang/String;

.field public static final PREFIXES_JCB:[Ljava/lang/String;

.field public static final PREFIXES_MASTERCARD:[Ljava/lang/String;

.field public static final PREFIXES_UNIONPAY:[Ljava/lang/String;

.field public static final PREFIXES_VISA:[Ljava/lang/String;


# instance fields
.field private addressCity:Ljava/lang/String;

.field private addressCountry:Ljava/lang/String;

.field private addressLine1:Ljava/lang/String;

.field private addressLine1Check:Ljava/lang/String;

.field private addressLine2:Ljava/lang/String;

.field private addressState:Ljava/lang/String;

.field private addressZip:Ljava/lang/String;

.field private addressZipCheck:Ljava/lang/String;

.field private brand:Ljava/lang/String;

.field private country:Ljava/lang/String;

.field private currency:Ljava/lang/String;

.field private customerId:Ljava/lang/String;

.field private cvc:Ljava/lang/String;

.field private cvcCheck:Ljava/lang/String;

.field private expMonth:Ljava/lang/Integer;

.field private expYear:Ljava/lang/Integer;

.field private fingerprint:Ljava/lang/String;

.field private funding:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private last4:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Size;
        value = 0x4L
    .end annotation
.end field

.field private loggingTokens:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private name:Ljava/lang/String;

.field private number:Ljava/lang/String;

.field private tokenizationMethod:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 31

    .line 74
    new-instance v0, Lcom/stripe/android/model/Card$1;

    invoke-direct {v0}, Lcom/stripe/android/model/Card$1;-><init>()V

    sput-object v0, Lcom/stripe/android/model/Card;->BRAND_RESOURCE_MAP:Ljava/util/Map;

    const-string v0, "34"

    const-string v1, "37"

    .line 87
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/Card;->PREFIXES_AMERICAN_EXPRESS:[Ljava/lang/String;

    const-string v0, "60"

    const-string v1, "64"

    const-string v2, "65"

    .line 88
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/Card;->PREFIXES_DISCOVER:[Ljava/lang/String;

    const-string v0, "35"

    .line 89
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/Card;->PREFIXES_JCB:[Ljava/lang/String;

    const-string v1, "300"

    const-string v2, "301"

    const-string v3, "302"

    const-string v4, "303"

    const-string v5, "304"

    const-string v6, "305"

    const-string v7, "309"

    const-string v8, "36"

    const-string v9, "38"

    const-string v10, "39"

    .line 90
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/Card;->PREFIXES_DINERS_CLUB:[Ljava/lang/String;

    const-string v0, "4"

    .line 92
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/Card;->PREFIXES_VISA:[Ljava/lang/String;

    const-string v1, "2221"

    const-string v2, "2222"

    const-string v3, "2223"

    const-string v4, "2224"

    const-string v5, "2225"

    const-string v6, "2226"

    const-string v7, "2227"

    const-string v8, "2228"

    const-string v9, "2229"

    const-string v10, "223"

    const-string v11, "224"

    const-string v12, "225"

    const-string v13, "226"

    const-string v14, "227"

    const-string v15, "228"

    const-string v16, "229"

    const-string v17, "23"

    const-string v18, "24"

    const-string v19, "25"

    const-string v20, "26"

    const-string v21, "270"

    const-string v22, "271"

    const-string v23, "2720"

    const-string v24, "50"

    const-string v25, "51"

    const-string v26, "52"

    const-string v27, "53"

    const-string v28, "54"

    const-string v29, "55"

    const-string v30, "67"

    .line 93
    filled-new-array/range {v1 .. v30}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/Card;->PREFIXES_MASTERCARD:[Ljava/lang/String;

    const-string v0, "62"

    .line 100
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/Card;->PREFIXES_UNIONPAY:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/model/Card$Builder;)V
    .locals 1

    .line 1046
    invoke-direct {p0}, Lcom/stripe/android/model/StripeJsonModel;-><init>()V

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/model/Card;->loggingTokens:Ljava/util/List;

    .line 1047
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$100(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/model/Card;->normalizeCardNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->number:Ljava/lang/String;

    .line 1048
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$200(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->expMonth:Ljava/lang/Integer;

    .line 1049
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$300(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->expYear:Ljava/lang/Integer;

    .line 1050
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$400(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->cvc:Ljava/lang/String;

    .line 1051
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$500(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->name:Ljava/lang/String;

    .line 1052
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$600(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->addressLine1:Ljava/lang/String;

    .line 1053
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$700(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->addressLine1Check:Ljava/lang/String;

    .line 1054
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$800(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->addressLine2:Ljava/lang/String;

    .line 1055
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$900(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->addressCity:Ljava/lang/String;

    .line 1056
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1000(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->addressState:Ljava/lang/String;

    .line 1057
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1100(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->addressZip:Ljava/lang/String;

    .line 1058
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1200(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->addressZipCheck:Ljava/lang/String;

    .line 1059
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1300(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->addressCountry:Ljava/lang/String;

    .line 1060
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1400(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1061
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getLast4()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1062
    :cond_0
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1400(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/stripe/android/model/Card;->last4:Ljava/lang/String;

    .line 1063
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1500(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/model/Card;->asCardBrand(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1064
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getBrand()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 1065
    :cond_1
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1500(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/stripe/android/model/Card;->brand:Ljava/lang/String;

    .line 1066
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1600(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->fingerprint:Ljava/lang/String;

    .line 1067
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1700(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/model/Card;->asFundingType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->funding:Ljava/lang/String;

    .line 1068
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1800(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->country:Ljava/lang/String;

    .line 1069
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$1900(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->currency:Ljava/lang/String;

    .line 1070
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$2000(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->customerId:Ljava/lang/String;

    .line 1071
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$2100(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->cvcCheck:Ljava/lang/String;

    .line 1072
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$2200(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->id:Ljava/lang/String;

    .line 1073
    invoke-static {p1}, Lcom/stripe/android/model/Card$Builder;->access$2300(Lcom/stripe/android/model/Card$Builder;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/model/Card;->tokenizationMethod:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/model/Card$Builder;Lcom/stripe/android/model/Card$1;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/stripe/android/model/Card;-><init>(Lcom/stripe/android/model/Card$Builder;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 569
    invoke-direct/range {v0 .. v18}, Lcom/stripe/android/model/Card;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p13    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Size;
            value = 0x4L
        .end annotation
    .end param

    move-object v0, p0

    .line 485
    invoke-direct {p0}, Lcom/stripe/android/model/StripeJsonModel;-><init>()V

    .line 153
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/stripe/android/model/Card;->loggingTokens:Ljava/util/List;

    .line 486
    invoke-direct {p0, p1}, Lcom/stripe/android/model/Card;->normalizeCardNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->number:Ljava/lang/String;

    move-object v1, p2

    .line 487
    iput-object v1, v0, Lcom/stripe/android/model/Card;->expMonth:Ljava/lang/Integer;

    move-object v1, p3

    .line 488
    iput-object v1, v0, Lcom/stripe/android/model/Card;->expYear:Ljava/lang/Integer;

    .line 489
    invoke-static {p4}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->cvc:Ljava/lang/String;

    .line 490
    invoke-static {p5}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->name:Ljava/lang/String;

    .line 491
    invoke-static {p6}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->addressLine1:Ljava/lang/String;

    .line 492
    invoke-static {p7}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->addressLine2:Ljava/lang/String;

    .line 493
    invoke-static {p8}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->addressCity:Ljava/lang/String;

    .line 494
    invoke-static {p9}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->addressState:Ljava/lang/String;

    .line 495
    invoke-static {p10}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->addressZip:Ljava/lang/String;

    .line 496
    invoke-static {p11}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->addressCountry:Ljava/lang/String;

    .line 497
    invoke-static {p12}, Lcom/stripe/android/model/Card;->asCardBrand(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getBrand()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p12

    :goto_0
    iput-object v1, v0, Lcom/stripe/android/model/Card;->brand:Ljava/lang/String;

    .line 498
    invoke-static {p13}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getLast4()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, p13

    :goto_1
    iput-object v1, v0, Lcom/stripe/android/model/Card;->last4:Ljava/lang/String;

    .line 499
    invoke-static/range {p14 .. p14}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->fingerprint:Ljava/lang/String;

    .line 500
    invoke-static/range {p15 .. p15}, Lcom/stripe/android/model/Card;->asFundingType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->funding:Ljava/lang/String;

    .line 501
    invoke-static/range {p16 .. p16}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->country:Ljava/lang/String;

    .line 502
    invoke-static/range {p17 .. p17}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->currency:Ljava/lang/String;

    .line 503
    invoke-static/range {p18 .. p18}, Lcom/stripe/android/StripeTextUtils;->nullIfBlank(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Card;->id:Ljava/lang/String;

    return-void
.end method

.method public static asCardBrand(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-eqz p0, :cond_8

    .line 336
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "American Express"

    .line 340
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "American Express"

    return-object p0

    :cond_1
    const-string v0, "MasterCard"

    .line 342
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "MasterCard"

    return-object p0

    :cond_2
    const-string v0, "Diners Club"

    .line 344
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "Diners Club"

    return-object p0

    :cond_3
    const-string v0, "Discover"

    .line 346
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p0, "Discover"

    return-object p0

    :cond_4
    const-string v0, "JCB"

    .line 348
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p0, "JCB"

    return-object p0

    :cond_5
    const-string v0, "Visa"

    .line 350
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string p0, "Visa"

    return-object p0

    :cond_6
    const-string v0, "UnionPay"

    .line 352
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_7

    const-string p0, "UnionPay"

    return-object p0

    :cond_7
    const-string p0, "Unknown"

    return-object p0

    :cond_8
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static asFundingType(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-eqz p0, :cond_4

    .line 368
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "credit"

    .line 372
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "credit"

    return-object p0

    :cond_1
    const-string v0, "debit"

    .line 374
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "debit"

    return-object p0

    :cond_2
    const-string v0, "prepaid"

    .line 376
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    const-string p0, "prepaid"

    return-object p0

    :cond_3
    const-string p0, "unknown"

    return-object p0

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Card;
    .locals 5
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    const-string v1, "card"

    const-string v2, "object"

    .line 402
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v1, "exp_month"

    .line 406
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optInteger(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "exp_year"

    .line 407
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optInteger(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v1, :cond_2

    .line 412
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x1

    if-lt v3, v4, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0xc

    if-le v3, v4, :cond_2

    :cond_1
    move-object v1, v0

    :cond_2
    if-eqz v2, :cond_3

    .line 416
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-gez v3, :cond_3

    move-object v2, v0

    .line 421
    :cond_3
    new-instance v3, Lcom/stripe/android/model/Card$Builder;

    invoke-direct {v3, v0, v1, v2, v0}, Lcom/stripe/android/model/Card$Builder;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v0, "address_city"

    .line 422
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->addressCity(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "address_line1"

    .line 423
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->addressLine1(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "address_line1_check"

    .line 424
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->addressLine1Check(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "address_line2"

    .line 425
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->addressLine2(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "address_country"

    .line 426
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->addressCountry(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "address_state"

    .line 427
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->addressState(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "address_zip"

    .line 428
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->addressZip(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "address_zip_check"

    .line 429
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->addressZipCheck(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "brand"

    .line 430
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/model/Card;->asCardBrand(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->brand(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "country"

    .line 431
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optCountryCode(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->country(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "customer"

    .line 432
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->customer(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "currency"

    .line 433
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optCurrency(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->currency(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "cvc_check"

    .line 434
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->cvcCheck(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "funding"

    .line 435
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/model/Card;->asFundingType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->funding(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "fingerprint"

    .line 436
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->fingerprint(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "id"

    .line 437
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->id(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "last4"

    .line 438
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->last4(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "name"

    .line 439
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/Card$Builder;->name(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    const-string v0, "tokenization_method"

    .line 440
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Lcom/stripe/android/model/Card$Builder;->tokenizationMethod(Ljava/lang/String;)Lcom/stripe/android/model/Card$Builder;

    .line 442
    invoke-virtual {v3}, Lcom/stripe/android/model/Card$Builder;->build()Lcom/stripe/android/model/Card;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_0
    return-object v0
.end method

.method private normalizeCardNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1080
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v0, "\\s+|-"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public addLoggingToken(Ljava/lang/String;)Lcom/stripe/android/model/Card;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 678
    iget-object v0, p0, Lcom/stripe/android/model/Card;->loggingTokens:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getAddressCity()Ljava/lang/String;
    .locals 1

    .line 788
    iget-object v0, p0, Lcom/stripe/android/model/Card;->addressCity:Ljava/lang/String;

    return-object v0
.end method

.method public getAddressCountry()Ljava/lang/String;
    .locals 1

    .line 830
    iget-object v0, p0, Lcom/stripe/android/model/Card;->addressCountry:Ljava/lang/String;

    return-object v0
.end method

.method public getAddressLine1()Ljava/lang/String;
    .locals 1

    .line 760
    iget-object v0, p0, Lcom/stripe/android/model/Card;->addressLine1:Ljava/lang/String;

    return-object v0
.end method

.method public getAddressLine2()Ljava/lang/String;
    .locals 1

    .line 774
    iget-object v0, p0, Lcom/stripe/android/model/Card;->addressLine2:Ljava/lang/String;

    return-object v0
.end method

.method public getAddressState()Ljava/lang/String;
    .locals 1

    .line 816
    iget-object v0, p0, Lcom/stripe/android/model/Card;->addressState:Ljava/lang/String;

    return-object v0
.end method

.method public getAddressZip()Ljava/lang/String;
    .locals 1

    .line 802
    iget-object v0, p0, Lcom/stripe/android/model/Card;->addressZip:Ljava/lang/String;

    return-object v0
.end method

.method public getBrand()Ljava/lang/String;
    .locals 1

    .line 891
    iget-object v0, p0, Lcom/stripe/android/model/Card;->brand:Ljava/lang/String;

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->isBlank(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/model/Card;->number:Ljava/lang/String;

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->isBlank(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 892
    iget-object v0, p0, Lcom/stripe/android/model/Card;->number:Ljava/lang/String;

    invoke-static {v0}, Lcom/stripe/android/CardUtils;->getPossibleCardType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->brand:Ljava/lang/String;

    .line 895
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/model/Card;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public getCVC()Ljava/lang/String;
    .locals 1

    .line 699
    iget-object v0, p0, Lcom/stripe/android/model/Card;->cvc:Ljava/lang/String;

    return-object v0
.end method

.method public getExpMonth()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/IntRange;
        from = 0x1L
        to = 0xcL
    .end annotation

    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 716
    iget-object v0, p0, Lcom/stripe/android/model/Card;->expMonth:Ljava/lang/Integer;

    return-object v0
.end method

.method public getExpYear()Ljava/lang/Integer;
    .locals 1

    .line 731
    iget-object v0, p0, Lcom/stripe/android/model/Card;->expYear:Ljava/lang/Integer;

    return-object v0
.end method

.method public getFunding()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 911
    iget-object v0, p0, Lcom/stripe/android/model/Card;->funding:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 926
    iget-object v0, p0, Lcom/stripe/android/model/Card;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLast4()Ljava/lang/String;
    .locals 3

    .line 859
    iget-object v0, p0, Lcom/stripe/android/model/Card;->last4:Ljava/lang/String;

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->isBlank(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 860
    iget-object v0, p0, Lcom/stripe/android/model/Card;->last4:Ljava/lang/String;

    return-object v0

    .line 863
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/model/Card;->number:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    .line 864
    iget-object v0, p0, Lcom/stripe/android/model/Card;->number:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v1

    iget-object v1, p0, Lcom/stripe/android/model/Card;->number:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/model/Card;->last4:Ljava/lang/String;

    .line 865
    iget-object v0, p0, Lcom/stripe/android/model/Card;->last4:Ljava/lang/String;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 746
    iget-object v0, p0, Lcom/stripe/android/model/Card;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNumber()Ljava/lang/String;
    .locals 1

    .line 659
    iget-object v0, p0, Lcom/stripe/android/model/Card;->number:Ljava/lang/String;

    return-object v0
.end method

.method getTokenizationMethod()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 1025
    iget-object v0, p0, Lcom/stripe/android/model/Card;->tokenizationMethod:Ljava/lang/String;

    return-object v0
.end method

.method public setAddressZip(Ljava/lang/String;)V
    .locals 0

    .line 809
    iput-object p1, p0, Lcom/stripe/android/model/Card;->addressZip:Ljava/lang/String;

    return-void
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 967
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "name"

    .line 968
    iget-object v2, p0, Lcom/stripe/android/model/Card;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "address_city"

    .line 969
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressCity:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "address_country"

    .line 970
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressCountry:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "address_line1"

    .line 971
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressLine1:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "address_line1_check"

    .line 972
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressLine1Check:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "address_line2"

    .line 973
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressLine2:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "address_state"

    .line 974
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressState:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "address_zip"

    .line 975
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressZip:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "address_zip_check"

    .line 976
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressZipCheck:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "brand"

    .line 977
    iget-object v2, p0, Lcom/stripe/android/model/Card;->brand:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "currency"

    .line 978
    iget-object v2, p0, Lcom/stripe/android/model/Card;->currency:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "country"

    .line 979
    iget-object v2, p0, Lcom/stripe/android/model/Card;->country:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "customer"

    .line 980
    iget-object v2, p0, Lcom/stripe/android/model/Card;->customerId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "exp_month"

    .line 981
    iget-object v2, p0, Lcom/stripe/android/model/Card;->expMonth:Ljava/lang/Integer;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putIntegerIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "exp_year"

    .line 982
    iget-object v2, p0, Lcom/stripe/android/model/Card;->expYear:Ljava/lang/Integer;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putIntegerIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "fingerprint"

    .line 983
    iget-object v2, p0, Lcom/stripe/android/model/Card;->fingerprint:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "funding"

    .line 984
    iget-object v2, p0, Lcom/stripe/android/model/Card;->funding:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "cvc_check"

    .line 985
    iget-object v2, p0, Lcom/stripe/android/model/Card;->cvcCheck:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "last4"

    .line 986
    iget-object v2, p0, Lcom/stripe/android/model/Card;->last4:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "id"

    .line 987
    iget-object v2, p0, Lcom/stripe/android/model/Card;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "tokenization_method"

    .line 988
    iget-object v2, p0, Lcom/stripe/android/model/Card;->tokenizationMethod:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "object"

    const-string v2, "card"

    .line 989
    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public toMap()Ljava/util/Map;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 996
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "name"

    .line 997
    iget-object v2, p0, Lcom/stripe/android/model/Card;->name:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "address_city"

    .line 998
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressCity:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "address_country"

    .line 999
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressCountry:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "address_line1"

    .line 1000
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressLine1:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "address_line1_check"

    .line 1001
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressLine1Check:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "address_line2"

    .line 1002
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressLine2:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "address_state"

    .line 1003
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressState:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "address_zip"

    .line 1004
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressZip:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "address_zip_check"

    .line 1005
    iget-object v2, p0, Lcom/stripe/android/model/Card;->addressZipCheck:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "brand"

    .line 1006
    iget-object v2, p0, Lcom/stripe/android/model/Card;->brand:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "currency"

    .line 1007
    iget-object v2, p0, Lcom/stripe/android/model/Card;->currency:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "country"

    .line 1008
    iget-object v2, p0, Lcom/stripe/android/model/Card;->country:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "customer"

    .line 1009
    iget-object v2, p0, Lcom/stripe/android/model/Card;->customerId:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "cvc_check"

    .line 1010
    iget-object v2, p0, Lcom/stripe/android/model/Card;->cvcCheck:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "exp_month"

    .line 1011
    iget-object v2, p0, Lcom/stripe/android/model/Card;->expMonth:Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "exp_year"

    .line 1012
    iget-object v2, p0, Lcom/stripe/android/model/Card;->expYear:Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "fingerprint"

    .line 1013
    iget-object v2, p0, Lcom/stripe/android/model/Card;->fingerprint:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "funding"

    .line 1014
    iget-object v2, p0, Lcom/stripe/android/model/Card;->funding:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "id"

    .line 1015
    iget-object v2, p0, Lcom/stripe/android/model/Card;->id:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last4"

    .line 1016
    iget-object v2, p0, Lcom/stripe/android/model/Card;->last4:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "tokenization_method"

    .line 1017
    iget-object v2, p0, Lcom/stripe/android/model/Card;->tokenizationMethod:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "object"

    const-string v2, "card"

    .line 1018
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1019
    invoke-static {v0}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    return-object v0
.end method
