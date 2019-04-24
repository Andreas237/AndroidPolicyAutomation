.class public final Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$Mapper;
.super Ljava/lang/Object;
.source "RetailerRedemptionMetaFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;
    .locals 9

    .line 207
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v2

    .line 208
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$Mapper$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object v3

    .line 214
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 215
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v5

    .line 216
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v6

    .line 217
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v7

    .line 218
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v8

    .line 219
    new-instance p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 204
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    move-result-object p1

    return-object p1
.end method
