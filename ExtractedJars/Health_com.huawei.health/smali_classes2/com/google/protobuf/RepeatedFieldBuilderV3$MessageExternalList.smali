.class Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/RepeatedFieldBuilderV3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MessageExternalList"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MType:Lcom/google/protobuf/AbstractMessage;BType:Lcom/google/protobuf/AbstractMessage$Builder;IType::Lcom/google/protobuf/MessageOrBuilder;>Ljava/util/AbstractList<TMType;>;Ljava/util/List<TMType;>;"
    }
.end annotation


# instance fields
.field builder:Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilderV3<TMType;TBType;TIType;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/protobuf/RepeatedFieldBuilderV3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/RepeatedFieldBuilderV3<TMType;TBType;TIType;>;)V"
        }
    .end annotation

    .line 614
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 615
    iput-object p1, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;->builder:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 616
    return-void
.end method


# virtual methods
.method public get(I)Lcom/google/protobuf/AbstractMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TMType;"
        }
    .end annotation

    .line 625
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;->builder:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessage(I)Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    .line 605
    invoke-virtual {p0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;->get(I)Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    return-object v0
.end method

.method incrementModCount()V
    .locals 2

    .line 629
    iget v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;->modCount:I

    .line 630
    return-void
.end method

.method public size()I
    .locals 1

    .line 620
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;->builder:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    move-result v0

    return v0
.end method
