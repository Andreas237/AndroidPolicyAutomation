.class public final Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data$Mapper;
.super Ljava/lang/Object;
.source "ViewedRetailerMutation.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data;",
        ">;"
    }
.end annotation


# instance fields
.field final viewedFieldMapper:Lcom/ibotta/android/graphql/ViewedRetailerMutation$Viewed$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 238
    new-instance v0, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Viewed$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Viewed$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data$Mapper;->viewedFieldMapper:Lcom/ibotta/android/graphql/ViewedRetailerMutation$Viewed$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data;
    .locals 2

    .line 242
    sget-object v0, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data$Mapper$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data$Mapper$1;-><init>(Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readObject(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Viewed;

    .line 248
    new-instance v0, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data;

    invoke-direct {v0, p1}, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data;-><init>(Lcom/ibotta/android/graphql/ViewedRetailerMutation$Viewed;)V

    return-object v0
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 237
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data;

    move-result-object p1

    return-object p1
.end method
