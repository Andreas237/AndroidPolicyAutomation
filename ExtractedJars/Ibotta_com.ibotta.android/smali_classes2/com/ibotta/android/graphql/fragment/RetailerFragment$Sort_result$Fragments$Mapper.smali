.class public final Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments$Mapper;
.super Ljava/lang/Object;
.source "RetailerFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/FragmentResponseFieldMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/FragmentResponseFieldMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments;",
        ">;"
    }
.end annotation


# instance fields
.field final sortResultFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/SortResultFragment$Mapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1648
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1649
    new-instance v0, Lcom/ibotta/android/graphql/fragment/SortResultFragment$Mapper;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/fragment/SortResultFragment$Mapper;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments$Mapper;->sortResultFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/SortResultFragment$Mapper;

    return-void
.end method


# virtual methods
.method public map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1654
    sget-object v0, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->POSSIBLE_TYPES:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 1655
    iget-object p2, p0, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments$Mapper;->sortResultFragmentFieldMapper:Lcom/ibotta/android/graphql/fragment/SortResultFragment$Mapper;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/graphql/fragment/SortResultFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1657
    :goto_0
    new-instance p2, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments;

    const-string v0, "sortResultFragment == null"

    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    invoke-direct {p2, p1}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments;-><init>(Lcom/ibotta/android/graphql/fragment/SortResultFragment;)V

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

    .line 1648
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Lcom/ibotta/android/graphql/fragment/RetailerFragment$Sort_result$Fragments;

    move-result-object p1

    return-object p1
.end method
