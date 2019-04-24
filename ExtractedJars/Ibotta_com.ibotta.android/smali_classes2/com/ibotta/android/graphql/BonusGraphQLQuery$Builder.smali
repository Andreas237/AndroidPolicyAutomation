.class public final Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "BonusGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/BonusGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/BonusGraphQLQuery;
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;->id:Ljava/lang/String;

    const-string v1, "id == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    new-instance v0, Lcom/ibotta/android/graphql/BonusGraphQLQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;->id:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/BonusGraphQLQuery;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public id(Ljava/lang/String;)Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 104
    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusGraphQLQuery$Builder;->id:Ljava/lang/String;

    return-object p0
.end method
