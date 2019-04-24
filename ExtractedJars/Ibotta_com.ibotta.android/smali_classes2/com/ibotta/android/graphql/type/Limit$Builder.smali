.class public final Lcom/ibotta/android/graphql/type/Limit$Builder;
.super Ljava/lang/Object;
.source "Limit.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/type/Limit;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
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


# direct methods
.method constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/type/Limit$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    .line 60
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/type/Limit$Builder;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/type/Limit;
    .locals 3

    .line 98
    new-instance v0, Lcom/ibotta/android/graphql/type/Limit;

    iget-object v1, p0, Lcom/ibotta/android/graphql/type/Limit$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    iget-object v2, p0, Lcom/ibotta/android/graphql/type/Limit$Builder;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/graphql/type/Limit;-><init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V

    return-object v0
.end method

.method public limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/type/Limit$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 69
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/type/Limit$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public limitInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/type/Limit$Builder;
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
            "Lcom/ibotta/android/graphql/type/Limit$Builder;"
        }
    .end annotation

    const-string v0, "limit == null"

    .line 85
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/type/Limit$Builder;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public limitStrategy(Lcom/ibotta/android/graphql/type/LimitStrategy;)Lcom/ibotta/android/graphql/type/Limit$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/type/LimitStrategy;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 77
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/type/Limit$Builder;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public limitStrategyInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/type/Limit$Builder;
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
            "Lcom/ibotta/android/graphql/type/Limit$Builder;"
        }
    .end annotation

    const-string v0, "limitStrategy == null"

    .line 93
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/type/Limit$Builder;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method
