.class public final Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments$Mapper;
.super Ljava/lang/Object;
.source "BonusGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/FragmentResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/FragmentResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments;",
        ">;"
    }
.end annotation


# instance fields
.field final bonusFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 372
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 373
    new-instance v0, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments$Mapper;->bonusFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 378
    sget-object v0, Lcom/ibotta/android/graphql/fragment/BonusFragment;->POSSIBLE_TYPES:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 379
    iget-object p2, p0, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments$Mapper;->bonusFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/BonusFragment;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 381
    :goto_0
    new-instance p2, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments;

    const-string v0, "bonusFragment == null"

    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/BonusFragment;

    invoke-direct {p2, p1}, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments;-><init>(Lcom/ibotta/android/graphql/fragment/BonusFragment;)V

    return-object p2
.end method

.method public bridge synthetic map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 372
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Lcom/ibotta/android/graphql/BonusGraphQLQuery$Bonus$Fragments;

    move-result-object p1

    return-object p1
.end method
