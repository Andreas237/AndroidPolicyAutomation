.class public final Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "DealGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/DealGraphQLQuery;
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

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/DealGraphQLQuery;
    .locals 2

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;->id:Ljava/lang/String;

    const-string v1, "id == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    new-instance v0, Lcom/ibotta/android/graphql/DealGraphQLQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;->id:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/ibotta/android/graphql/DealGraphQLQuery;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public id(Ljava/lang/String;)Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 100
    iput-object p1, p0, Lcom/ibotta/android/graphql/DealGraphQLQuery$Builder;->id:Ljava/lang/String;

    return-object p0
.end method
