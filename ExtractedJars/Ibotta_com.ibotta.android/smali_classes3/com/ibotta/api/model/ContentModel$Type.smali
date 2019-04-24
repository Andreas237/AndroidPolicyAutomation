.class public final enum Lcom/ibotta/api/model/ContentModel$Type;
.super Ljava/lang/Enum;
.source "ContentModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/ContentModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/ContentModel$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/ContentModel$Type;

.field public static final enum BONUS:Lcom/ibotta/api/model/ContentModel$Type;

.field public static final enum BUYABLE_GIFT_CARD:Lcom/ibotta/api/model/ContentModel$Type;

.field public static final enum DEAL:Lcom/ibotta/api/model/ContentModel$Type;

.field public static final enum FEATURE:Lcom/ibotta/api/model/ContentModel$Type;

.field public static final enum FEATURED_RETAILER:Lcom/ibotta/api/model/ContentModel$Type;

.field public static final enum NO_OP:Lcom/ibotta/api/model/ContentModel$Type;

.field public static final enum OFFER:Lcom/ibotta/api/model/ContentModel$Type;

.field public static final enum PRODUCT:Lcom/ibotta/api/model/ContentModel$Type;

.field public static final enum RETAILER:Lcom/ibotta/api/model/ContentModel$Type;


# instance fields
.field private final apiName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 18
    new-instance v0, Lcom/ibotta/api/model/ContentModel$Type;

    const-string v1, "BONUS"

    const-string v2, "Bonus"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/api/model/ContentModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/ContentModel$Type;->BONUS:Lcom/ibotta/api/model/ContentModel$Type;

    .line 19
    new-instance v0, Lcom/ibotta/api/model/ContentModel$Type;

    const-string v1, "BUYABLE_GIFT_CARD"

    const-string v2, "BuyableGiftCard"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/api/model/ContentModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/ContentModel$Type;->BUYABLE_GIFT_CARD:Lcom/ibotta/api/model/ContentModel$Type;

    .line 20
    new-instance v0, Lcom/ibotta/api/model/ContentModel$Type;

    const-string v1, "DEAL"

    const-string v2, "Deal"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/api/model/ContentModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/ContentModel$Type;->DEAL:Lcom/ibotta/api/model/ContentModel$Type;

    .line 21
    new-instance v0, Lcom/ibotta/api/model/ContentModel$Type;

    const-string v1, "FEATURE"

    const-string v2, "Feature"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/ibotta/api/model/ContentModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/ContentModel$Type;->FEATURE:Lcom/ibotta/api/model/ContentModel$Type;

    .line 22
    new-instance v0, Lcom/ibotta/api/model/ContentModel$Type;

    const-string v1, "FEATURED_RETAILER"

    const-string v2, "FeaturedRetailer"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/ibotta/api/model/ContentModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/ContentModel$Type;->FEATURED_RETAILER:Lcom/ibotta/api/model/ContentModel$Type;

    .line 23
    new-instance v0, Lcom/ibotta/api/model/ContentModel$Type;

    const-string v1, "OFFER"

    const-string v2, "Offer"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/ibotta/api/model/ContentModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/ContentModel$Type;->OFFER:Lcom/ibotta/api/model/ContentModel$Type;

    .line 24
    new-instance v0, Lcom/ibotta/api/model/ContentModel$Type;

    const-string v1, "PRODUCT"

    const-string v2, "Product"

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/ibotta/api/model/ContentModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/ContentModel$Type;->PRODUCT:Lcom/ibotta/api/model/ContentModel$Type;

    .line 25
    new-instance v0, Lcom/ibotta/api/model/ContentModel$Type;

    const-string v1, "RETAILER"

    const-string v2, "Retailer"

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lcom/ibotta/api/model/ContentModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/ContentModel$Type;->RETAILER:Lcom/ibotta/api/model/ContentModel$Type;

    .line 26
    new-instance v0, Lcom/ibotta/api/model/ContentModel$Type;

    const-string v1, "NO_OP"

    const-string v2, "NoOp"

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lcom/ibotta/api/model/ContentModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/ContentModel$Type;->NO_OP:Lcom/ibotta/api/model/ContentModel$Type;

    const/16 v0, 0x9

    .line 17
    new-array v0, v0, [Lcom/ibotta/api/model/ContentModel$Type;

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->BONUS:Lcom/ibotta/api/model/ContentModel$Type;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->BUYABLE_GIFT_CARD:Lcom/ibotta/api/model/ContentModel$Type;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->DEAL:Lcom/ibotta/api/model/ContentModel$Type;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->FEATURE:Lcom/ibotta/api/model/ContentModel$Type;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->FEATURED_RETAILER:Lcom/ibotta/api/model/ContentModel$Type;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->OFFER:Lcom/ibotta/api/model/ContentModel$Type;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->PRODUCT:Lcom/ibotta/api/model/ContentModel$Type;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->RETAILER:Lcom/ibotta/api/model/ContentModel$Type;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->NO_OP:Lcom/ibotta/api/model/ContentModel$Type;

    aput-object v1, v0, v11

    sput-object v0, Lcom/ibotta/api/model/ContentModel$Type;->$VALUES:[Lcom/ibotta/api/model/ContentModel$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 31
    iput-object p3, p0, Lcom/ibotta/api/model/ContentModel$Type;->apiName:Ljava/lang/String;

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/ContentModel$Type;
    .locals 5

    .line 35
    invoke-static {}, Lcom/ibotta/api/model/ContentModel$Type;->values()[Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 36
    invoke-virtual {v3}, Lcom/ibotta/api/model/ContentModel$Type;->getApiName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 40
    :cond_1
    sget-object p0, Lcom/ibotta/api/model/ContentModel$Type;->NO_OP:Lcom/ibotta/api/model/ContentModel$Type;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/ContentModel$Type;
    .locals 1

    .line 17
    const-class v0, Lcom/ibotta/api/model/ContentModel$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/ContentModel$Type;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/ContentModel$Type;
    .locals 1

    .line 17
    sget-object v0, Lcom/ibotta/api/model/ContentModel$Type;->$VALUES:[Lcom/ibotta/api/model/ContentModel$Type;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/ContentModel$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/ContentModel$Type;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/model/ContentModel$Type;->apiName:Ljava/lang/String;

    return-object v0
.end method
