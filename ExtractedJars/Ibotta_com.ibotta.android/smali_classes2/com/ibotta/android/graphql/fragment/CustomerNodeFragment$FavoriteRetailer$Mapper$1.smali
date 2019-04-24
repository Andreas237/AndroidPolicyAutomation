.class Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Mapper$1;
.super Ljava/lang/Object;
.source "CustomerNodeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ConditionalTypeReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ConditionalTypeReader<",
        "Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Mapper;)V
    .locals 0

    .line 299
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Ljava/lang/String;Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;
    .locals 1

    .line 302
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Mapper;->fragmentsFieldMapper:Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments$Mapper;

    invoke-virtual {v0, p2, p1}, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Ljava/lang/String;Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 299
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Mapper$1;->read(Ljava/lang/String;Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/CustomerNodeFragment$FavoriteRetailer$Fragments;

    move-result-object p1

    return-object p1
.end method
