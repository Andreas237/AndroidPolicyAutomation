.class public final Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage$Mapper;
.super Ljava/lang/Object;
.source "RetailerNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 286
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;
    .locals 3

    .line 289
    sget-object v0, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v0

    .line 290
    sget-object v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {p1, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object p1

    .line 291
    new-instance v1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    invoke-direct {v1, v0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 286
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment$ModelCImage;

    move-result-object p1

    return-object p1
.end method
