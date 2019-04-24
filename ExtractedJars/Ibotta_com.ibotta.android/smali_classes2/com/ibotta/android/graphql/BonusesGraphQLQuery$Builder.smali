.class public final Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;
.super Ljava/lang/Object;
.source "BonusesGraphQLQuery.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/BonusesGraphQLQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private availableLimit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private completedLimit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private featuredLimit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private retailerId:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    .line 118
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->availableLimit:Lcom/apollographql/apollo/api/Input;

    .line 120
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->completedLimit:Lcom/apollographql/apollo/api/Input;

    .line 122
    invoke-static {}, Lcom/apollographql/apollo/api/Input;->absent()Lcom/apollographql/apollo/api/Input;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->featuredLimit:Lcom/apollographql/apollo/api/Input;

    return-void
.end method


# virtual methods
.method public availableLimit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 133
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->availableLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public availableLimitInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "availableLimit == null"

    .line 153
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->availableLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public build()Lcom/ibotta/android/graphql/BonusesGraphQLQuery;
    .locals 5

    .line 168
    new-instance v0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery;

    iget-object v1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    iget-object v2, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->availableLimit:Lcom/apollographql/apollo/api/Input;

    iget-object v3, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->completedLimit:Lcom/apollographql/apollo/api/Input;

    iget-object v4, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->featuredLimit:Lcom/apollographql/apollo/api/Input;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/graphql/BonusesGraphQLQuery;-><init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V

    return-object v0
.end method

.method public completedLimit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 138
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->completedLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public completedLimitInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "completedLimit == null"

    .line 158
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->completedLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public featuredLimit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 143
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->featuredLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public featuredLimitInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;
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
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "featuredLimit == null"

    .line 163
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->featuredLimit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public retailerId(Ljava/lang/String;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 128
    invoke-static {p1}, Lcom/apollographql/apollo/api/Input;->fromNullable(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Input;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public retailerIdInput(Lcom/apollographql/apollo/api/Input;)Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;
    .locals 1
    .param p1    # Lcom/apollographql/apollo/api/Input;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;"
        }
    .end annotation

    const-string v0, "retailerId == null"

    .line 148
    invoke-static {p1, v0}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/api/Input;

    iput-object p1, p0, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$Builder;->retailerId:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method
