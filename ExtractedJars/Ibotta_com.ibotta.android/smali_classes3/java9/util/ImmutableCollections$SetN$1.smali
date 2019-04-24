.class Ljava9/util/ImmutableCollections$SetN$1;
.super Ljava9/util/Iterators$ImmutableIt;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljava9/util/ImmutableCollections$SetN;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava9/util/Iterators$ImmutableIt<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private idx:I

.field final synthetic this$0:Ljava9/util/ImmutableCollections$SetN;


# direct methods
.method constructor <init>(Ljava9/util/ImmutableCollections$SetN;)V
    .locals 0

    .line 471
    iput-object p1, p0, Ljava9/util/ImmutableCollections$SetN$1;->this$0:Ljava9/util/ImmutableCollections$SetN;

    invoke-direct {p0}, Ljava9/util/Iterators$ImmutableIt;-><init>()V

    const/4 p1, 0x0

    .line 472
    iput p1, p0, Ljava9/util/ImmutableCollections$SetN$1;->idx:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .line 476
    :goto_0
    iget v0, p0, Ljava9/util/ImmutableCollections$SetN$1;->idx:I

    iget-object v1, p0, Ljava9/util/ImmutableCollections$SetN$1;->this$0:Ljava9/util/ImmutableCollections$SetN;

    iget-object v1, v1, Ljava9/util/ImmutableCollections$SetN;->elements:[Ljava/lang/Object;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 477
    iget-object v0, p0, Ljava9/util/ImmutableCollections$SetN$1;->this$0:Ljava9/util/ImmutableCollections$SetN;

    iget-object v0, v0, Ljava9/util/ImmutableCollections$SetN;->elements:[Ljava/lang/Object;

    iget v1, p0, Ljava9/util/ImmutableCollections$SetN$1;->idx:I

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 479
    iput v1, p0, Ljava9/util/ImmutableCollections$SetN$1;->idx:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 486
    invoke-virtual {p0}, Ljava9/util/ImmutableCollections$SetN$1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 489
    iget-object v0, p0, Ljava9/util/ImmutableCollections$SetN$1;->this$0:Ljava9/util/ImmutableCollections$SetN;

    iget-object v0, v0, Ljava9/util/ImmutableCollections$SetN;->elements:[Ljava/lang/Object;

    iget v1, p0, Ljava9/util/ImmutableCollections$SetN$1;->idx:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ljava9/util/ImmutableCollections$SetN$1;->idx:I

    aget-object v0, v0, v1

    return-object v0

    .line 487
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
