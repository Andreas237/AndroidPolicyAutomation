.class public final Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery;
.super Ljava/lang/Object;
.source "BuyableGiftCardRetailersQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/Query;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$BuyableGiftCard;,
        Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;,
        Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/Query<",
        "Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;",
        "Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;",
        "Lcom/apollographql/apollo/api/Operation$Variables;",
        ">;"
    }
.end annotation


# static fields
.field public static final OPERATION_DEFINITION:Ljava/lang/String; = "query BuyableGiftCardRetailers {\n  buyableGiftCards {\n    __typename\n    ...BuyableGiftCardRetailersFragment\n  }\n}"

.field public static final OPERATION_ID:Ljava/lang/String; = "d332277ae771b5d7d21a5d47cf27f5d636c893b2959bdca44a6a276e15ff7d89"

.field public static final OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

.field public static final QUERY_DOCUMENT:Ljava/lang/String; = "query BuyableGiftCardRetailers {\n  buyableGiftCards {\n    __typename\n    ...BuyableGiftCardRetailersFragment\n  }\n}\nfragment BuyableGiftCardRetailersFragment on BuyableGiftCard {\n  __typename\n  retailer_id\n}"


# instance fields
.field private final variables:Lcom/apollographql/apollo/api/Operation$Variables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$1;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    sget-object v0, Lcom/apollographql/apollo/api/Operation;->EMPTY_VARIABLES:Lcom/apollographql/apollo/api/Operation$Variables;

    iput-object v0, p0, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery;->variables:Lcom/apollographql/apollo/api/Operation$Variables;

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Builder;
    .locals 1

    .line 77
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public name()Lcom/apollographql/apollo/api/OperationName;
    .locals 1

    .line 82
    sget-object v0, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery;->OPERATION_NAME:Lcom/apollographql/apollo/api/OperationName;

    return-object v0
.end method

.method public operationId()Ljava/lang/String;
    .locals 1

    const-string v0, "d332277ae771b5d7d21a5d47cf27f5d636c893b2959bdca44a6a276e15ff7d89"

    return-object v0
.end method

.method public queryDocument()Ljava/lang/String;
    .locals 1

    const-string v0, "query BuyableGiftCardRetailers {\n  buyableGiftCards {\n    __typename\n    ...BuyableGiftCardRetailersFragment\n  }\n}\nfragment BuyableGiftCardRetailersFragment on BuyableGiftCard {\n  __typename\n  retailer_id\n}"

    return-object v0
.end method

.method public responseFieldMapper()Lcom/apollographql/apollo/api/ResponseFieldMapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
            "Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;",
            ">;"
        }
    .end annotation

    .line 73
    new-instance v0, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data$Mapper;-><init>()V

    return-object v0
.end method

.method public variables()Lcom/apollographql/apollo/api/Operation$Variables;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery;->variables:Lcom/apollographql/apollo/api/Operation$Variables;

    return-object v0
.end method

.method public wrapData(Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;)Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic wrapData(Lcom/apollographql/apollo/api/Operation$Data;)Ljava/lang/Object;
    .locals 0

    .line 24
    check-cast p1, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery;->wrapData(Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;)Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;

    move-result-object p1

    return-object p1
.end method
