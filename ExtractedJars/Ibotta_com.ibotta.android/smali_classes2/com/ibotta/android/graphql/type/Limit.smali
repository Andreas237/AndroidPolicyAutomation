.class public final Lcom/ibotta/android/graphql/type/Limit;
.super Ljava/lang/Object;
.source "Limit.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/type/Limit$Builder;
    }
.end annotation


# instance fields
.field private final limit:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final limitStrategy:Lcom/apollographql/apollo/api/Input;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Input<",
            "Lcom/ibotta/android/graphql/type/LimitStrategy;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/apollographql/apollo/api/Input;Lcom/apollographql/apollo/api/Input;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Input<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/apollographql/apollo/api/Input<",
            "Lcom/ibotta/android/graphql/type/LimitStrategy;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/graphql/type/Limit;->limit:Lcom/apollographql/apollo/api/Input;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/graphql/type/Limit;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/graphql/type/Limit;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/ibotta/android/graphql/type/Limit;->limit:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/type/Limit;)Lcom/apollographql/apollo/api/Input;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/ibotta/android/graphql/type/Limit;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    return-object p0
.end method

.method public static builder()Lcom/ibotta/android/graphql/type/Limit$Builder;
    .locals 1

    .line 40
    new-instance v0, Lcom/ibotta/android/graphql/type/Limit$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/type/Limit$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public limit()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/graphql/type/Limit;->limit:Lcom/apollographql/apollo/api/Input;

    iget-object v0, v0, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    return-object v0
.end method

.method public limitStrategy()Lcom/ibotta/android/graphql/type/LimitStrategy;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/graphql/type/Limit;->limitStrategy:Lcom/apollographql/apollo/api/Input;

    iget-object v0, v0, Lcom/apollographql/apollo/api/Input;->value:Ljava/lang/Object;

    check-cast v0, Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-object v0
.end method

.method public marshaller()Lcom/apollographql/apollo/api/InputFieldMarshaller;
    .locals 1

    .line 44
    new-instance v0, Lcom/ibotta/android/graphql/type/Limit$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/type/Limit$1;-><init>(Lcom/ibotta/android/graphql/type/Limit;)V

    return-object v0
.end method
