.class public final Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$Mapper;
.super Ljava/lang/Object;
.source "RetailerNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;",
        ">;"
    }
.end annotation


# instance fields
.field final modelCImageFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 186
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 187
    new-instance v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$Mapper;->modelCImageFieldMapper:Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;
    .locals 8

    .line 191
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v2

    .line 192
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readCustomType(Lcom/apollographql/apollo/api/ResponseField$CustomTypeField;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 193
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v4

    .line 194
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$Mapper$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$Mapper$1;-><init>(Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    .line 200
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readBoolean(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Boolean;

    move-result-object v6

    .line 201
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v7

    .line 202
    new-instance p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 186
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    move-result-object p1

    return-object p1
.end method
