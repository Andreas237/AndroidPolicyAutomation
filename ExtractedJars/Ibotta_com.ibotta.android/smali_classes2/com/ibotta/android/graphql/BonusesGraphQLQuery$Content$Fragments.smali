.class public Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;
.super Ljava/lang/Object;
.source "BonusesGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Fragments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments$Mapper;
    }
.end annotation


# instance fields
.field private volatile $hashCode:I

.field private volatile $hashCodeMemoized:Z

.field private volatile $toString:Ljava/lang/String;

.field final bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/fragment/BonusFragment;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/fragment/BonusFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 950
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 951
    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    return-void
.end method


# virtual methods
.method public bonusFragment()Lcom/ibotta/android/graphql/fragment/BonusFragment;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 955
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 985
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 986
    check-cast p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;

    .line 987
    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    if-nez v1, :cond_2

    iget-object p1, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 994
    iget-boolean v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->$hashCodeMemoized:Z

    if-nez v0, :cond_1

    const v0, 0xf4243

    .line 997
    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/fragment/BonusFragment;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    .line 998
    iput v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->$hashCode:I

    const/4 v0, 0x1

    .line 999
    iput-boolean v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->$hashCodeMemoized:Z

    .line 1001
    :cond_1
    iget v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->$hashCode:I

    return v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/ResponseFieldMarshaller;
    .locals 1

    .line 959
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments$1;-><init>(Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 972
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->$toString:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 973
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragments{bonusFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->bonusFragment:Lcom/ibotta/android/graphql/fragment/BonusFragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->$toString:Ljava/lang/String;

    .line 977
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Content$Fragments;->$toString:Ljava/lang/String;

    return-object v0
.end method
