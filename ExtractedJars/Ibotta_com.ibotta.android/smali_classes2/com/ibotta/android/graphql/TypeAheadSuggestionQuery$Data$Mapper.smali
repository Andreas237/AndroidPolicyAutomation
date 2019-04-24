.class public final Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data$Mapper;
.super Ljava/lang/Object;
.source "TypeAheadSuggestionQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field final typeAheadSuggestionFieldMapper:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 294
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 295
    new-instance v0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data$Mapper;->typeAheadSuggestionFieldMapper:Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;
    .locals 2

    .line 299
    sget-object v0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    new-instance v1, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data$Mapper$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data$Mapper$1;-><init>(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data$Mapper;)V

    invoke-interface {p1, v0, v1}, Lcom/apollographql/apollo/api/ResponseReader;->readList(Lcom/apollographql/apollo/api/ResponseField;Lcom/apollographql/apollo/api/ResponseReader$ListReader;)Ljava/util/List;

    move-result-object p1

    .line 310
    new-instance v0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;

    invoke-direct {v0, p1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 294
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;

    move-result-object p1

    return-object p1
.end method
