.class public Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;
.super Ljava/lang/Object;
.source "TypeAheadSuggestionQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Fragments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments$Mapper;
    }
.end annotation


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final typeAheadSuggestionFragment:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 401
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "typeAheadSuggestionFragment == null"

    .line 402
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;

    iput-object p1, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->typeAheadSuggestionFragment:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 436
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;

    if-eqz v0, :cond_1

    .line 437
    check-cast p1, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;

    .line 438
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->typeAheadSuggestionFragment:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;

    iget-object p1, p1, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->typeAheadSuggestionFragment:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 445
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->$hashCodeMemoized:Z

    if-nez v0, :cond_0

    const v0, 0xf4243

    .line 448
    iget-object v1, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->typeAheadSuggestionFragment:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 449
    iput v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->$hashCode:I

    const/4 v0, 0x1

    .line 450
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->$hashCodeMemoized:Z

    .line 452
    :cond_0
    iget v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 410
    new-instance v0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments$1;-><init>(Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 423
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 424
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragments{typeAheadSuggestionFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->typeAheadSuggestionFragment:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->$toString:Ljava/lang/String;

    .line 428
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->$toString:Ljava/lang/String;

    return-object v0
.end method

.method public typeAheadSuggestionFragment()Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 406
    iget-object v0, p0, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->typeAheadSuggestionFragment:Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;

    return-object v0
.end method
