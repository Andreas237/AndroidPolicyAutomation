.class public final Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
.super Ljava/lang/Object;
.source "AlsoViewedQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/AlsoViewedQuery;
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

.field private includeAvailableRetailers:Z

.field private limit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private limitStrategy:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Lcom/ibotta/android/graphql/type/LimitStrategy;",
            ">;"
        }
    .end annotation
.end field

.field private products:Z

.field private retailerId:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    .line 117
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    .line 119
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/AlsoViewedQuery;
    .locals 9

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->id:Ljava/lang/String;

    const-string v1, "id == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    new-instance v0, Lcom/ibotta/android/graphql/AlsoViewedQuery;

    iget-object v3, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->id:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    iget-object v5, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    iget-object v6, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    iget-boolean v7, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->products:Z

    iget-boolean v8, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->includeAvailableRetailers:Z

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/ibotta/android/graphql/AlsoViewedQuery;-><init>(Ljava/lang/String;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V

    return-object v0
.end method

.method public id(Ljava/lang/String;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 129
    iput-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->id:Ljava/lang/String;

    return-object p0
.end method

.method public includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
    .locals 0

    .line 154
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->includeAvailableRetailers:Z

    return-object p0
.end method

.method public limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 139
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public limitInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;"
        }
    .end annotation

    const-string v0, "limit == null"

    .line 164
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public limitStrategy(Lcom/ibotta/android/graphql/type/LimitStrategy;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/type/LimitStrategy;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 144
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public limitStrategyInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Lcom/ibotta/android/graphql/type/LimitStrategy;",
            ">;)",
            "Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;"
        }
    .end annotation

    const-string v0, "limitStrategy == null"

    .line 169
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public products(Z)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
    .locals 0

    .line 149
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->products:Z

    return-object p0
.end method

.method public retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 134
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public retailerIdInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;"
        }
    .end annotation

    const-string v0, "retailerId == null"

    .line 159
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/AlsoViewedQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method
