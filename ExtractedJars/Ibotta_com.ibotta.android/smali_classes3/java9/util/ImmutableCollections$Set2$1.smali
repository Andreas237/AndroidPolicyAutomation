.class Ljava9/util/ImmutableCollections$Set2$1;
.super Ljava9/util/Iterators$ImmutableIt;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljava9/util/ImmutableCollections$Set2;->iterator()Ljava/util/Iterator;
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

.field final synthetic this$0:Ljava9/util/ImmutableCollections$Set2;


# direct methods
.method constructor <init>(Ljava9/util/ImmutableCollections$Set2;)V
    .locals 0

    .line 401
    iput-object p1, p0, Ljava9/util/ImmutableCollections$Set2$1;->this$0:Ljava9/util/ImmutableCollections$Set2;

    invoke-direct {p0}, Ljava9/util/Iterators$ImmutableIt;-><init>()V

    const/4 p1, 0x0

    .line 402
    iput p1, p0, Ljava9/util/ImmutableCollections$Set2$1;->idx:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .line 406
    iget v0, p0, Ljava9/util/ImmutableCollections$Set2$1;->idx:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 411
    iget v0, p0, Ljava9/util/ImmutableCollections$Set2$1;->idx:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 412
    iput v1, p0, Ljava9/util/ImmutableCollections$Set2$1;->idx:I

    .line 413
    iget-object v0, p0, Ljava9/util/ImmutableCollections$Set2$1;->this$0:Ljava9/util/ImmutableCollections$Set2;

    iget-object v0, v0, Ljava9/util/ImmutableCollections$Set2;->e0:Ljava/lang/Object;

    return-object v0

    :cond_0
    if-ne v0, v1, :cond_1

    const/4 v0, 0x2

    .line 415
    iput v0, p0, Ljava9/util/ImmutableCollections$Set2$1;->idx:I

    .line 416
    iget-object v0, p0, Ljava9/util/ImmutableCollections$Set2$1;->this$0:Ljava9/util/ImmutableCollections$Set2;

    iget-object v0, v0, Ljava9/util/ImmutableCollections$Set2;->e1:Ljava/lang/Object;

    return-object v0

    .line 418
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
