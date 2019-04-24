.class Lcom/google/protobuf/RopeByteString$PieceIterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/RopeByteString;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "PieceIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Iterator<Lcom/google/protobuf/ByteString$LeafByteString;>;"
    }
.end annotation


# instance fields
.field private final breadCrumbs:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<Lcom/google/protobuf/RopeByteString;>;"
        }
    .end annotation
.end field

.field private next:Lcom/google/protobuf/ByteString$LeafByteString;


# direct methods
.method private constructor <init>(Lcom/google/protobuf/ByteString;)V
    .locals 1

    .line 685
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 681
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/RopeByteString$PieceIterator;->breadCrumbs:Ljava/util/Stack;

    .line 686
    invoke-direct {p0, p1}, Lcom/google/protobuf/RopeByteString$PieceIterator;->getLeafByLeft(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/ByteString$LeafByteString;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/RopeByteString$PieceIterator;->next:Lcom/google/protobuf/ByteString$LeafByteString;

    .line 687
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/RopeByteString$1;)V
    .locals 0

    .line 679
    invoke-direct {p0, p1}, Lcom/google/protobuf/RopeByteString$PieceIterator;-><init>(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method private getLeafByLeft(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/ByteString$LeafByteString;
    .locals 3

    .line 690
    move-object v1, p1

    .line 691
    :goto_0
    instance-of v0, v1, Lcom/google/protobuf/RopeByteString;

    if-eqz v0, :cond_0

    .line 692
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/RopeByteString;

    .line 693
    iget-object v0, p0, Lcom/google/protobuf/RopeByteString$PieceIterator;->breadCrumbs:Ljava/util/Stack;

    invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    invoke-static {v2}, Lcom/google/protobuf/RopeByteString;->access$400(Lcom/google/protobuf/RopeByteString;)Lcom/google/protobuf/ByteString;

    move-result-object v1

    .line 695
    goto :goto_0

    .line 696
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString$LeafByteString;

    return-object v0
.end method

.method private getNextNonEmptyLeaf()Lcom/google/protobuf/ByteString$LeafByteString;
    .locals 2

    .line 703
    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/RopeByteString$PieceIterator;->breadCrumbs:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 704
    const/4 v0, 0x0

    return-object v0

    .line 706
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RopeByteString$PieceIterator;->breadCrumbs:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/RopeByteString;

    invoke-static {v0}, Lcom/google/protobuf/RopeByteString;->access$500(Lcom/google/protobuf/RopeByteString;)Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/RopeByteString$PieceIterator;->getLeafByLeft(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/ByteString$LeafByteString;

    move-result-object v1

    .line 707
    invoke-virtual {v1}, Lcom/google/protobuf/ByteString$LeafByteString;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 708
    return-object v1

    .line 710
    :cond_1
    goto :goto_0
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 716
    iget-object v0, p0, Lcom/google/protobuf/RopeByteString$PieceIterator;->next:Lcom/google/protobuf/ByteString$LeafByteString;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Lcom/google/protobuf/ByteString$LeafByteString;
    .locals 2

    .line 727
    iget-object v0, p0, Lcom/google/protobuf/RopeByteString$PieceIterator;->next:Lcom/google/protobuf/ByteString$LeafByteString;

    if-nez v0, :cond_0

    .line 728
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 730
    :cond_0
    iget-object v1, p0, Lcom/google/protobuf/RopeByteString$PieceIterator;->next:Lcom/google/protobuf/ByteString$LeafByteString;

    .line 731
    invoke-direct {p0}, Lcom/google/protobuf/RopeByteString$PieceIterator;->getNextNonEmptyLeaf()Lcom/google/protobuf/ByteString$LeafByteString;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/RopeByteString$PieceIterator;->next:Lcom/google/protobuf/ByteString$LeafByteString;

    .line 732
    return-object v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 679
    invoke-virtual {p0}, Lcom/google/protobuf/RopeByteString$PieceIterator;->next()Lcom/google/protobuf/ByteString$LeafByteString;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    .line 737
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
