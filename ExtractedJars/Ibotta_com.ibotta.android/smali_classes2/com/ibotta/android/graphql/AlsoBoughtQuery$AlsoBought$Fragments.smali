.class public Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;
.super Ljava/lang/Object;
.source "AlsoBoughtQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Fragments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments$Mapper;
    }
.end annotation


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/fragment/OfferFragment;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/graphql/fragment/OfferFragment;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 460
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "offerFragment == null"

    .line 461
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iput-object p1, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 495
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;

    if-eqz v0, :cond_1

    .line 496
    check-cast p1, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;

    .line 497
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    iget-object p1, p1, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 504
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->$hashCodeMemoized:Z

    if-nez v0, :cond_0

    const v0, 0xf4243

    .line 507
    iget-object v1, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/OfferFragment;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 508
    iput v0, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->$hashCode:I

    const/4 v0, 0x1

    .line 509
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->$hashCodeMemoized:Z

    .line 511
    :cond_0
    iget v0, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 469
    new-instance v0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments$1;-><init>(Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;)V

    return-object v0
.end method

.method public offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 465
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 482
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 483
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragments{offerFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->offerFragment:Lcom/ibotta/android/graphql/fragment/OfferFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->$toString:Ljava/lang/String;

    .line 487
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;->$toString:Ljava/lang/String;

    return-object v0
.end method
