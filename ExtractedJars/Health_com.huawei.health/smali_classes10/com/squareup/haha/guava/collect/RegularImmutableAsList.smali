.class final Lcom/squareup/haha/guava/collect/RegularImmutableAsList;
.super Lcom/squareup/haha/guava/collect/ImmutableAsList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:Ljava/lang/Object;>Lcom/squareup/haha/guava/collect/ImmutableAsList<TE;>;"
    }
.end annotation


# instance fields
.field private final delegate:Lcom/squareup/haha/guava/collect/ImmutableCollection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/guava/collect/ImmutableCollection<TE;>;"
        }
    .end annotation
.end field

.field private final delegateList:Lcom/squareup/haha/guava/collect/ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/guava/collect/ImmutableList<+TE;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/squareup/haha/guava/collect/ImmutableCollection;Lcom/squareup/haha/guava/collect/ImmutableList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/guava/collect/ImmutableCollection<TE;>;Lcom/squareup/haha/guava/collect/ImmutableList<+TE;>;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/ImmutableAsList;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/RegularImmutableAsList;->delegate:Lcom/squareup/haha/guava/collect/ImmutableCollection;

    .line 36
    iput-object p2, p0, Lcom/squareup/haha/guava/collect/RegularImmutableAsList;->delegateList:Lcom/squareup/haha/guava/collect/ImmutableList;

    .line 37
    return-void
.end method

.method constructor <init>(Lcom/squareup/haha/guava/collect/ImmutableCollection;[Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/guava/collect/ImmutableCollection<TE;>;[Ljava/lang/Object;)V"
        }
    .end annotation

    .line 40
    invoke-static {p2}, Lcom/squareup/haha/guava/collect/ImmutableList;->asImmutableList([Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/squareup/haha/guava/collect/RegularImmutableAsList;-><init>(Lcom/squareup/haha/guava/collect/ImmutableCollection;Lcom/squareup/haha/guava/collect/ImmutableList;)V

    .line 41
    return-void
.end method


# virtual methods
.method final copyIntoArray([Ljava/lang/Object;I)I
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/RegularImmutableAsList;->delegateList:Lcom/squareup/haha/guava/collect/ImmutableList;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/haha/guava/collect/ImmutableList;->copyIntoArray([Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method final delegateCollection()Lcom/squareup/haha/guava/collect/ImmutableCollection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/squareup/haha/guava/collect/ImmutableCollection<TE;>;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/RegularImmutableAsList;->delegate:Lcom/squareup/haha/guava/collect/ImmutableCollection;

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/RegularImmutableAsList;->delegateList:Lcom/squareup/haha/guava/collect/ImmutableList;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/guava/collect/ImmutableList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final listIterator(I)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator<TE;>;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/RegularImmutableAsList;->delegateList:Lcom/squareup/haha/guava/collect/ImmutableList;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/guava/collect/ImmutableList;->listIterator(I)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 28
    invoke-virtual {p0, p1}, Lcom/squareup/haha/guava/collect/RegularImmutableAsList;->listIterator(I)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator;

    move-result-object v0

    return-object v0
.end method
