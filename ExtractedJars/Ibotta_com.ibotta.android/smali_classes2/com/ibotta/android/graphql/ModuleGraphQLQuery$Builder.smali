.class public final Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "ModuleGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/ModuleGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private expand:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private heroBoost:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private id:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private includeAvailableRetailers:Z

.field private products:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->expand:Lcom/apollographql/apollo/api/Input;

    .line 139
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->heroBoost:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/ModuleGraphQLQuery;
    .locals 8

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->id:Ljava/lang/String;

    const-string v1, "id == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    new-instance v0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery;

    iget-object v3, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->id:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->expand:Lcom/apollographql/apollo/api/Input;

    iget-object v5, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->heroBoost:Lcom/apollographql/apollo/api/Input;

    iget-boolean v6, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->products:Z

    iget-boolean v7, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->includeAvailableRetailers:Z

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery;-><init>(Ljava/lang/String;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;ZZ)V

    return-object v0
.end method

.method public expand(Ljava/lang/Boolean;)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 154
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->expand:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public expandInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "expand == null"

    .line 174
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->expand:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public heroBoost(Ljava/lang/Boolean;)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 159
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->heroBoost:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public heroBoostInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "heroBoost == null"

    .line 179
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->heroBoost:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public id(Ljava/lang/String;)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 149
    iput-object p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->id:Ljava/lang/String;

    return-object p0
.end method

.method public includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;
    .locals 0

    .line 169
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->includeAvailableRetailers:Z

    return-object p0
.end method

.method public products(Z)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;
    .locals 0

    .line 164
    iput-boolean p1, p0, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->products:Z

    return-object p0
.end method
