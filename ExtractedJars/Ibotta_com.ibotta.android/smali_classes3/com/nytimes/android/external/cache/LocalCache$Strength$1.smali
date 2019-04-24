.class final enum Lcom/nytimes/android/external/cache/LocalCache$Strength$1;
.super Lcom/nytimes/android/external/cache/LocalCache$Strength;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache$Strength;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 361
    invoke-direct {p0, p1, p2, v0}, Lcom/nytimes/android/external/cache/LocalCache$Strength;-><init>(Ljava/lang/String;ILcom/nytimes/android/external/cache/LocalCache$1;)V

    return-void
.end method


# virtual methods
.method defaultEquivalence()Lcom/nytimes/android/external/cache/Equivalence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/Equivalence<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 374
    invoke-static {}, Lcom/nytimes/android/external/cache/Equivalence;->equals()Lcom/nytimes/android/external/cache/Equivalence;

    move-result-object v0

    return-object v0
.end method

.method referenceValue(Lcom/nytimes/android/external/cache/LocalCache$Segment;Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;Ljava/lang/Object;I)Lcom/nytimes/android/external/cache/LocalCache$ValueReference;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/nytimes/android/external/cache/LocalCache$Segment<",
            "TK;TV;>;",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;TV;I)",
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    const/4 p1, 0x1

    if-ne p4, p1, :cond_0

    .line 367
    new-instance p1, Lcom/nytimes/android/external/cache/LocalCache$StrongValueReference;

    invoke-direct {p1, p3}, Lcom/nytimes/android/external/cache/LocalCache$StrongValueReference;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    .line 368
    :cond_0
    new-instance p1, Lcom/nytimes/android/external/cache/LocalCache$WeightedStrongValueReference;

    invoke-direct {p1, p3, p4}, Lcom/nytimes/android/external/cache/LocalCache$WeightedStrongValueReference;-><init>(Ljava/lang/Object;I)V

    :goto_0
    return-object p1
.end method
