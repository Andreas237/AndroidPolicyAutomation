.class final Lcom/nytimes/android/external/cache/LocalCache$WeightedStrongValueReference;
.super Lcom/nytimes/android/external/cache/LocalCache$StrongValueReference;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "WeightedStrongValueReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/nytimes/android/external/cache/LocalCache$StrongValueReference<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field final weight:I


# direct methods
.method constructor <init>(Ljava/lang/Object;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;I)V"
        }
    .end annotation

    .line 1810
    invoke-direct {p0, p1}, Lcom/nytimes/android/external/cache/LocalCache$StrongValueReference;-><init>(Ljava/lang/Object;)V

    .line 1811
    iput p2, p0, Lcom/nytimes/android/external/cache/LocalCache$WeightedStrongValueReference;->weight:I

    return-void
.end method


# virtual methods
.method public getWeight()I
    .locals 1

    .line 1816
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$WeightedStrongValueReference;->weight:I

    return v0
.end method
