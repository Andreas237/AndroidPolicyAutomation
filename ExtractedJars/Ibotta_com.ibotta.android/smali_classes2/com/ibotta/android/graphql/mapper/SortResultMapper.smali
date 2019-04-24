.class public Lcom/ibotta/android/graphql/mapper/SortResultMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "SortResultMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/SortResultFragment;",
        "Lcom/ibotta/api/model/content/SortResultContent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/SortResultFragment;)Lcom/ibotta/api/model/content/SortResultContent;
    .locals 2
    .param p1    # Lcom/ibotta/android/graphql/fragment/SortResultFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 25
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/content/SortResultContent;

    invoke-direct {v0}, Lcom/ibotta/api/model/content/SortResultContent;-><init>()V

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/SortResultContent;->setName(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->rank()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/content/SortResultContent;->setRank(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/SortResultFragment;->value()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/content/SortResultContent;->setValue(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 13
    check-cast p1, Lcom/ibotta/android/graphql/fragment/SortResultFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/SortResultMapper;->map(Lcom/ibotta/android/graphql/fragment/SortResultFragment;)Lcom/ibotta/api/model/content/SortResultContent;

    move-result-object p1

    return-object p1
.end method
