.class Lcom/ibotta/android/graphql/ProductGraphQLQuery$1;
.super Ljava/lang/Object;
.source "ProductGraphQLQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/OperationName;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/ProductGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public name()Ljava/lang/String;
    .locals 1

    const-string v0, "ProductGraphQL"

    return-object v0
.end method