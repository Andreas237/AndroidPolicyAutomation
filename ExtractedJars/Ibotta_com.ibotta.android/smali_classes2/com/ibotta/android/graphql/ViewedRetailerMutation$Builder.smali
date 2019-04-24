.class public final Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;
.super Ljava/lang/Object;
.source "ViewedRetailerMutation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/ViewedRetailerMutation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private id:J

.field private limit:Lcom/ibotta/android/graphql/type/Limit;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/graphql/ViewedRetailerMutation;
    .locals 4

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;->limit:Lcom/ibotta/android/graphql/type/Limit;

    const-string v1, "limit == null"

    invoke-static {v0, v1}, Lcom/apollographql/apollo/api/internal/Utils;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    new-instance v0, Lcom/ibotta/android/graphql/ViewedRetailerMutation;

    iget-wide v1, p0, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;->id:J

    iget-object v3, p0, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;->limit:Lcom/ibotta/android/graphql/type/Limit;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/graphql/ViewedRetailerMutation;-><init>(JLcom/ibotta/android/graphql/type/Limit;)V

    return-object v0
.end method

.method public id(J)Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;
    .locals 0

    .line 119
    iput-wide p1, p0, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;->id:J

    return-object p0
.end method

.method public limit(Lcom/ibotta/android/graphql/type/Limit;)Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/android/graphql/type/Limit;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 124
    iput-object p1, p0, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;->limit:Lcom/ibotta/android/graphql/type/Limit;

    return-object p0
.end method
