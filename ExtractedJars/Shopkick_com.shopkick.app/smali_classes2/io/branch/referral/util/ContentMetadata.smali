.class public Lio/branch/referral/util/ContentMetadata;
.super Ljava/lang/Object;
.source "ContentMetadata.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/referral/util/ContentMetadata$CONDITION;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public addressCity:Ljava/lang/String;

.field public addressCountry:Ljava/lang/String;

.field public addressPostalCode:Ljava/lang/String;

.field public addressRegion:Ljava/lang/String;

.field public addressStreet:Ljava/lang/String;

.field public condition:Lio/branch/referral/util/ContentMetadata$CONDITION;

.field contentSchema:Lio/branch/referral/util/BranchContentSchema;

.field public currencyType:Lio/branch/referral/util/CurrencyType;

.field private final customMetadata:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final imageCaptions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public latitude:Ljava/lang/Double;

.field public longitude:Ljava/lang/Double;

.field public price:Ljava/lang/Double;

.field public productBrand:Ljava/lang/String;

.field public productCategory:Lio/branch/referral/util/ProductCategory;

.field public productName:Ljava/lang/String;

.field public productVariant:Ljava/lang/String;

.field public quantity:Ljava/lang/Double;

.field public rating:Ljava/lang/Double;

.field public ratingAverage:Ljava/lang/Double;

.field public ratingCount:Ljava/lang/Integer;

.field public ratingMax:Ljava/lang/Double;

.field public sku:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 397
    new-instance v0, Lio/branch/referral/util/ContentMetadata$1;

    invoke-direct {v0}, Lio/branch/referral/util/ContentMetadata$1;-><init>()V

    sput-object v0, Lio/branch/referral/util/ContentMetadata;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->imageCaptions:Ljava/util/ArrayList;

    .line 135
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->customMetadata:Ljava/util/HashMap;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 437
    invoke-direct {p0}, Lio/branch/referral/util/ContentMetadata;-><init>()V

    .line 438
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/branch/referral/util/BranchContentSchema;->getValue(Ljava/lang/String;)Lio/branch/referral/util/BranchContentSchema;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->contentSchema:Lio/branch/referral/util/BranchContentSchema;

    .line 439
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->quantity:Ljava/lang/Double;

    .line 440
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->price:Ljava/lang/Double;

    .line 441
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/branch/referral/util/CurrencyType;->getValue(Ljava/lang/String;)Lio/branch/referral/util/CurrencyType;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->currencyType:Lio/branch/referral/util/CurrencyType;

    .line 442
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->sku:Ljava/lang/String;

    .line 443
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->productName:Ljava/lang/String;

    .line 444
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->productBrand:Ljava/lang/String;

    .line 445
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/branch/referral/util/ProductCategory;->getValue(Ljava/lang/String;)Lio/branch/referral/util/ProductCategory;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->productCategory:Lio/branch/referral/util/ProductCategory;

    .line 446
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/branch/referral/util/ContentMetadata$CONDITION;->getValue(Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata$CONDITION;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->condition:Lio/branch/referral/util/ContentMetadata$CONDITION;

    .line 447
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->productVariant:Ljava/lang/String;

    .line 448
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->rating:Ljava/lang/Double;

    .line 449
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->ratingAverage:Ljava/lang/Double;

    .line 450
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->ratingCount:Ljava/lang/Integer;

    .line 451
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->ratingMax:Ljava/lang/Double;

    .line 453
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->addressStreet:Ljava/lang/String;

    .line 454
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->addressCity:Ljava/lang/String;

    .line 455
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->addressRegion:Ljava/lang/String;

    .line 456
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->addressCountry:Ljava/lang/String;

    .line 457
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->addressPostalCode:Ljava/lang/String;

    .line 458
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->latitude:Ljava/lang/Double;

    .line 459
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    iput-object v0, p0, Lio/branch/referral/util/ContentMetadata;->longitude:Ljava/lang/Double;

    .line 461
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 462
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->imageCaptions:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 464
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    .line 465
    iget-object v0, p0, Lio/branch/referral/util/ContentMetadata;->customMetadata:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lio/branch/referral/util/ContentMetadata$1;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lio/branch/referral/util/ContentMetadata;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static createFromJson(Lio/branch/referral/BranchUtil$JsonReader;)Lio/branch/referral/util/ContentMetadata;
    .locals 5

    .line 347
    new-instance v0, Lio/branch/referral/util/ContentMetadata;

    invoke-direct {v0}, Lio/branch/referral/util/ContentMetadata;-><init>()V

    .line 348
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ContentSchema:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/branch/referral/util/BranchContentSchema;->getValue(Ljava/lang/String;)Lio/branch/referral/util/BranchContentSchema;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->contentSchema:Lio/branch/referral/util/BranchContentSchema;

    .line 349
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Quantity:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lio/branch/referral/BranchUtil$JsonReader;->readOutDouble(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->quantity:Ljava/lang/Double;

    .line 350
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Price:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Lio/branch/referral/BranchUtil$JsonReader;->readOutDouble(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->price:Ljava/lang/Double;

    .line 351
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->PriceCurrency:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/branch/referral/util/CurrencyType;->getValue(Ljava/lang/String;)Lio/branch/referral/util/CurrencyType;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->currencyType:Lio/branch/referral/util/CurrencyType;

    .line 352
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->SKU:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->sku:Ljava/lang/String;

    .line 353
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ProductName:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->productName:Ljava/lang/String;

    .line 354
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ProductBrand:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->productBrand:Ljava/lang/String;

    .line 355
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ProductCategory:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/branch/referral/util/ProductCategory;->getValue(Ljava/lang/String;)Lio/branch/referral/util/ProductCategory;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->productCategory:Lio/branch/referral/util/ProductCategory;

    .line 356
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Condition:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/branch/referral/util/ContentMetadata$CONDITION;->getValue(Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata$CONDITION;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->condition:Lio/branch/referral/util/ContentMetadata$CONDITION;

    .line 357
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ProductVariant:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->productVariant:Ljava/lang/String;

    .line 358
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Rating:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Lio/branch/referral/BranchUtil$JsonReader;->readOutDouble(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->rating:Ljava/lang/Double;

    .line 359
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->RatingAverage:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Lio/branch/referral/BranchUtil$JsonReader;->readOutDouble(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->ratingAverage:Ljava/lang/Double;

    .line 360
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->RatingCount:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Lio/branch/referral/BranchUtil$JsonReader;->readOutInt(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->ratingCount:Ljava/lang/Integer;

    .line 361
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->RatingMax:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Lio/branch/referral/BranchUtil$JsonReader;->readOutDouble(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->ratingMax:Ljava/lang/Double;

    .line 362
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AddressStreet:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->addressStreet:Ljava/lang/String;

    .line 363
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AddressCity:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->addressCity:Ljava/lang/String;

    .line 364
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AddressRegion:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->addressRegion:Ljava/lang/String;

    .line 365
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AddressCountry:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->addressCountry:Ljava/lang/String;

    .line 366
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AddressPostalCode:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->addressPostalCode:Ljava/lang/String;

    .line 367
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Latitude:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Lio/branch/referral/BranchUtil$JsonReader;->readOutDouble(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->latitude:Ljava/lang/Double;

    .line 368
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Longitude:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Lio/branch/referral/BranchUtil$JsonReader;->readOutDouble(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lio/branch/referral/util/ContentMetadata;->longitude:Ljava/lang/Double;

    .line 369
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ImageCaptions:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchUtil$JsonReader;->readOutJsonArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 371
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 372
    iget-object v3, v0, Lio/branch/referral/util/ContentMetadata;->imageCaptions:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 378
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lio/branch/referral/BranchUtil$JsonReader;->getJsonObject()Lorg/json/JSONObject;

    move-result-object p0

    .line 379
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 380
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 381
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 382
    iget-object v3, v0, Lio/branch/referral/util/ContentMetadata;->customMetadata:Ljava/util/HashMap;

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 385
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    return-object v0
.end method


# virtual methods
.method public addCustomMetadata(Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata;
    .locals 1

    .line 157
    iget-object v0, p0, Lio/branch/referral/util/ContentMetadata;->customMetadata:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public varargs addImageCaptions([Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata;
    .locals 1

    .line 145
    iget-object v0, p0, Lio/branch/referral/util/ContentMetadata;->imageCaptions:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object p0
.end method

.method public convertToJson()Lorg/json/JSONObject;
    .locals 4

    .line 262
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 264
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->contentSchema:Lio/branch/referral/util/BranchContentSchema;

    if-eqz v1, :cond_0

    .line 265
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ContentSchema:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->contentSchema:Lio/branch/referral/util/BranchContentSchema;

    invoke-virtual {v2}, Lio/branch/referral/util/BranchContentSchema;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 267
    :cond_0
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->quantity:Ljava/lang/Double;

    if-eqz v1, :cond_1

    .line 268
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Quantity:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->quantity:Ljava/lang/Double;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 270
    :cond_1
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->price:Ljava/lang/Double;

    if-eqz v1, :cond_2

    .line 271
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Price:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->price:Ljava/lang/Double;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 273
    :cond_2
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->currencyType:Lio/branch/referral/util/CurrencyType;

    if-eqz v1, :cond_3

    .line 274
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->PriceCurrency:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->currencyType:Lio/branch/referral/util/CurrencyType;

    invoke-virtual {v2}, Lio/branch/referral/util/CurrencyType;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 276
    :cond_3
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->sku:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 277
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->SKU:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->sku:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 279
    :cond_4
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->productName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 280
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ProductName:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->productName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 282
    :cond_5
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->productBrand:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 283
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ProductBrand:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->productBrand:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 285
    :cond_6
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->productCategory:Lio/branch/referral/util/ProductCategory;

    if-eqz v1, :cond_7

    .line 286
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ProductCategory:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->productCategory:Lio/branch/referral/util/ProductCategory;

    invoke-virtual {v2}, Lio/branch/referral/util/ProductCategory;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 288
    :cond_7
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->condition:Lio/branch/referral/util/ContentMetadata$CONDITION;

    if-eqz v1, :cond_8

    .line 289
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Condition:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->condition:Lio/branch/referral/util/ContentMetadata$CONDITION;

    invoke-virtual {v2}, Lio/branch/referral/util/ContentMetadata$CONDITION;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 291
    :cond_8
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->productVariant:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 292
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ProductVariant:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->productVariant:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 294
    :cond_9
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->rating:Ljava/lang/Double;

    if-eqz v1, :cond_a

    .line 295
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Rating:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->rating:Ljava/lang/Double;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 297
    :cond_a
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->ratingAverage:Ljava/lang/Double;

    if-eqz v1, :cond_b

    .line 298
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->RatingAverage:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->ratingAverage:Ljava/lang/Double;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 300
    :cond_b
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->ratingCount:Ljava/lang/Integer;

    if-eqz v1, :cond_c

    .line 301
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->RatingCount:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->ratingCount:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 303
    :cond_c
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->ratingMax:Ljava/lang/Double;

    if-eqz v1, :cond_d

    .line 304
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->RatingMax:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->ratingMax:Ljava/lang/Double;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 306
    :cond_d
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->addressStreet:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_e

    .line 307
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AddressStreet:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->addressStreet:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 309
    :cond_e
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->addressCity:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_f

    .line 310
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AddressCity:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->addressCity:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 312
    :cond_f
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->addressRegion:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_10

    .line 313
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AddressRegion:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->addressRegion:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 315
    :cond_10
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->addressCountry:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_11

    .line 316
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AddressCountry:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->addressCountry:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 318
    :cond_11
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->addressPostalCode:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_12

    .line 319
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AddressPostalCode:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->addressPostalCode:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 321
    :cond_12
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->latitude:Ljava/lang/Double;

    if-eqz v1, :cond_13

    .line 322
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Latitude:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->latitude:Ljava/lang/Double;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 324
    :cond_13
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->longitude:Ljava/lang/Double;

    if-eqz v1, :cond_14

    .line 325
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Longitude:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->longitude:Ljava/lang/Double;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 327
    :cond_14
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->imageCaptions:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_15

    .line 328
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 329
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->ImageCaptions:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 330
    iget-object v2, p0, Lio/branch/referral/util/ContentMetadata;->imageCaptions:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 331
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 335
    :cond_15
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->customMetadata:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    if-lez v1, :cond_16

    .line 336
    iget-object v1, p0, Lio/branch/referral/util/ContentMetadata;->customMetadata:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 337
    iget-object v3, p0, Lio/branch/referral/util/ContentMetadata;->customMetadata:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 341
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_16
    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCustomMetadata()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 256
    iget-object v0, p0, Lio/branch/referral/util/ContentMetadata;->customMetadata:Ljava/util/HashMap;

    return-object v0
.end method

.method public getImageCaptions()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 247
    iget-object v0, p0, Lio/branch/referral/util/ContentMetadata;->imageCaptions:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 172
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->addressStreet:Ljava/lang/String;

    .line 173
    iput-object p2, p0, Lio/branch/referral/util/ContentMetadata;->addressCity:Ljava/lang/String;

    .line 174
    iput-object p3, p0, Lio/branch/referral/util/ContentMetadata;->addressRegion:Ljava/lang/String;

    .line 175
    iput-object p4, p0, Lio/branch/referral/util/ContentMetadata;->addressCountry:Ljava/lang/String;

    .line 176
    iput-object p5, p0, Lio/branch/referral/util/ContentMetadata;->addressPostalCode:Ljava/lang/String;

    return-object p0
.end method

.method public setContentSchema(Lio/branch/referral/util/BranchContentSchema;)Lio/branch/referral/util/ContentMetadata;
    .locals 0

    .line 162
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->contentSchema:Lio/branch/referral/util/BranchContentSchema;

    return-object p0
.end method

.method public setLocation(Ljava/lang/Double;Ljava/lang/Double;)Lio/branch/referral/util/ContentMetadata;
    .locals 0
    .param p1    # Ljava/lang/Double;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Double;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 181
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->latitude:Ljava/lang/Double;

    .line 182
    iput-object p2, p0, Lio/branch/referral/util/ContentMetadata;->longitude:Ljava/lang/Double;

    return-object p0
.end method

.method public setPrice(Ljava/lang/Double;Lio/branch/referral/util/CurrencyType;)Lio/branch/referral/util/ContentMetadata;
    .locals 0
    .param p2    # Lio/branch/referral/util/CurrencyType;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 205
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->price:Ljava/lang/Double;

    .line 206
    iput-object p2, p0, Lio/branch/referral/util/ContentMetadata;->currencyType:Lio/branch/referral/util/CurrencyType;

    return-object p0
.end method

.method public setProductBrand(Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata;
    .locals 0

    .line 211
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->productBrand:Ljava/lang/String;

    return-object p0
.end method

.method public setProductCategory(Lio/branch/referral/util/ProductCategory;)Lio/branch/referral/util/ContentMetadata;
    .locals 0

    .line 216
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->productCategory:Lio/branch/referral/util/ProductCategory;

    return-object p0
.end method

.method public setProductCondition(Lio/branch/referral/util/ContentMetadata$CONDITION;)Lio/branch/referral/util/ContentMetadata;
    .locals 0

    .line 221
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->condition:Lio/branch/referral/util/ContentMetadata$CONDITION;

    return-object p0
.end method

.method public setProductName(Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata;
    .locals 0

    .line 226
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->productName:Ljava/lang/String;

    return-object p0
.end method

.method public setProductVariant(Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata;
    .locals 0

    .line 231
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->productVariant:Ljava/lang/String;

    return-object p0
.end method

.method public setQuantity(Ljava/lang/Double;)Lio/branch/referral/util/ContentMetadata;
    .locals 0

    .line 167
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->quantity:Ljava/lang/Double;

    return-object p0
.end method

.method public setRating(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)Lio/branch/referral/util/ContentMetadata;
    .locals 0
    .param p1    # Ljava/lang/Double;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Double;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Double;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 187
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->rating:Ljava/lang/Double;

    .line 188
    iput-object p2, p0, Lio/branch/referral/util/ContentMetadata;->ratingAverage:Ljava/lang/Double;

    .line 189
    iput-object p3, p0, Lio/branch/referral/util/ContentMetadata;->ratingMax:Ljava/lang/Double;

    .line 190
    iput-object p4, p0, Lio/branch/referral/util/ContentMetadata;->ratingCount:Ljava/lang/Integer;

    return-object p0
.end method

.method public setRating(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)Lio/branch/referral/util/ContentMetadata;
    .locals 0
    .param p1    # Ljava/lang/Double;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Double;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 198
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->ratingAverage:Ljava/lang/Double;

    .line 199
    iput-object p2, p0, Lio/branch/referral/util/ContentMetadata;->ratingMax:Ljava/lang/Double;

    .line 200
    iput-object p3, p0, Lio/branch/referral/util/ContentMetadata;->ratingCount:Ljava/lang/Integer;

    return-object p0
.end method

.method public setSku(Ljava/lang/String;)Lio/branch/referral/util/ContentMetadata;
    .locals 0

    .line 236
    iput-object p1, p0, Lio/branch/referral/util/ContentMetadata;->sku:Ljava/lang/String;

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 409
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->contentSchema:Lio/branch/referral/util/BranchContentSchema;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lio/branch/referral/util/BranchContentSchema;->name()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const-string p2, ""

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 410
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->quantity:Ljava/lang/Double;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 411
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->price:Ljava/lang/Double;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 412
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->currencyType:Lio/branch/referral/util/CurrencyType;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/branch/referral/util/CurrencyType;->name()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    const-string p2, ""

    :goto_1
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 413
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->sku:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 414
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->productName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 415
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->productBrand:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 416
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->productCategory:Lio/branch/referral/util/ProductCategory;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lio/branch/referral/util/ProductCategory;->getName()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_2
    const-string p2, ""

    :goto_2
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 417
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->condition:Lio/branch/referral/util/ContentMetadata$CONDITION;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lio/branch/referral/util/ContentMetadata$CONDITION;->name()Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :cond_3
    const-string p2, ""

    :goto_3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 418
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->productVariant:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 419
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->rating:Ljava/lang/Double;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 420
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->ratingAverage:Ljava/lang/Double;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 421
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->ratingCount:Ljava/lang/Integer;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 422
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->ratingMax:Ljava/lang/Double;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 424
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->addressStreet:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 425
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->addressCity:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 426
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->addressRegion:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 427
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->addressCountry:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 428
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->addressPostalCode:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 429
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->latitude:Ljava/lang/Double;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 430
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->longitude:Ljava/lang/Double;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 432
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->imageCaptions:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 433
    iget-object p2, p0, Lio/branch/referral/util/ContentMetadata;->customMetadata:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method
