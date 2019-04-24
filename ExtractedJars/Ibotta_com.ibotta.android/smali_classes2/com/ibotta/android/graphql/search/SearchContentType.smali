.class public final enum Lcom/ibotta/android/graphql/search/SearchContentType;
.super Ljava/lang/Enum;
.source "SearchContentType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/graphql/search/SearchContentType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/graphql/search/SearchContentType;

.field public static final enum OFFER:Lcom/ibotta/android/graphql/search/SearchContentType;

.field public static final enum PRODUCT:Lcom/ibotta/android/graphql/search/SearchContentType;

.field public static final enum RETAILER:Lcom/ibotta/android/graphql/search/SearchContentType;


# instance fields
.field private final apiName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 8
    new-instance v0, Lcom/ibotta/android/graphql/search/SearchContentType;

    const-string v1, "RETAILER"

    const-string v2, "Retailer"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/android/graphql/search/SearchContentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/graphql/search/SearchContentType;->RETAILER:Lcom/ibotta/android/graphql/search/SearchContentType;

    .line 9
    new-instance v0, Lcom/ibotta/android/graphql/search/SearchContentType;

    const-string v1, "OFFER"

    const-string v2, "Offer"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/android/graphql/search/SearchContentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/graphql/search/SearchContentType;->OFFER:Lcom/ibotta/android/graphql/search/SearchContentType;

    .line 10
    new-instance v0, Lcom/ibotta/android/graphql/search/SearchContentType;

    const-string v1, "PRODUCT"

    const-string v2, "Product"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/android/graphql/search/SearchContentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/graphql/search/SearchContentType;->PRODUCT:Lcom/ibotta/android/graphql/search/SearchContentType;

    const/4 v0, 0x3

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/graphql/search/SearchContentType;

    sget-object v1, Lcom/ibotta/android/graphql/search/SearchContentType;->RETAILER:Lcom/ibotta/android/graphql/search/SearchContentType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/graphql/search/SearchContentType;->OFFER:Lcom/ibotta/android/graphql/search/SearchContentType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/graphql/search/SearchContentType;->PRODUCT:Lcom/ibotta/android/graphql/search/SearchContentType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/android/graphql/search/SearchContentType;->$VALUES:[Lcom/ibotta/android/graphql/search/SearchContentType;

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

    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    iput-object p3, p0, Lcom/ibotta/android/graphql/search/SearchContentType;->apiName:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/graphql/search/SearchContentType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/graphql/search/SearchContentType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/search/SearchContentType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/graphql/search/SearchContentType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/graphql/search/SearchContentType;->$VALUES:[Lcom/ibotta/android/graphql/search/SearchContentType;

    invoke-virtual {v0}, [Lcom/ibotta/android/graphql/search/SearchContentType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/graphql/search/SearchContentType;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/SearchContentType;->apiName:Ljava/lang/String;

    return-object v0
.end method
