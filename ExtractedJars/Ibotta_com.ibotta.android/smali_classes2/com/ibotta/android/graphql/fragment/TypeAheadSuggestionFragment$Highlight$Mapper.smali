.class public final Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight$Mapper;
.super Ljava/lang/Object;
.source "TypeAheadSuggestionFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 253
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;
    .locals 7

    .line 256
    sget-object v0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readString(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/String;

    move-result-object v2

    .line 257
    sget-object v0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 258
    sget-object v0, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->$responseFields:[Lcom/apollographql/apollo/api/ResponseField;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/api/ResponseReader;->readLong(Lcom/apollographql/apollo/api/ResponseField;)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 259
    new-instance p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;-><init>(Ljava/lang/String;JJ)V

    return-object p1
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 253
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;

    move-result-object p1

    return-object p1
.end method
