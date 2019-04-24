.class public abstract Lcom/squareup/haha/perflib/Instance;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/perflib/Instance$1;,
        Lcom/squareup/haha/perflib/Instance$CompositeSizeVisitor;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field mClassId:J

.field mDistanceToGcRoot:I

.field private final mHardReferences:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation
.end field

.field mHeap:Lcom/squareup/haha/perflib/Heap;

.field protected final mId:J

.field private mImmediateDominator:Lcom/squareup/haha/perflib/Instance;

.field mNextInstanceToGcRoot:Lcom/squareup/haha/perflib/Instance;

.field mReferencesAdded:Z

.field private mRetainedSizes:[J

.field mSize:I

.field private mSoftReferences:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation
.end field

.field protected final mStack:Lcom/squareup/haha/perflib/StackTrace;

.field mTopologicalOrder:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const-class v0, Lcom/squareup/haha/perflib/Instance;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/squareup/haha/perflib/Instance;->$assertionsDisabled:Z

    return-void
.end method

.method constructor <init>(JLcom/squareup/haha/perflib/StackTrace;)V
    .locals 1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const v0, 0x7fffffff

    iput v0, p0, Lcom/squareup/haha/perflib/Instance;->mDistanceToGcRoot:I

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/squareup/haha/perflib/Instance;->mReferencesAdded:Z

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mNextInstanceToGcRoot:Lcom/squareup/haha/perflib/Instance;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mHardReferences:Ljava/util/ArrayList;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mSoftReferences:Ljava/util/ArrayList;

    .line 73
    iput-wide p1, p0, Lcom/squareup/haha/perflib/Instance;->mId:J

    .line 74
    iput-object p3, p0, Lcom/squareup/haha/perflib/Instance;->mStack:Lcom/squareup/haha/perflib/StackTrace;

    .line 75
    return-void
.end method


# virtual methods
.method public abstract accept(Lcom/squareup/haha/perflib/Visitor;)V
.end method

.method public addReference(Lcom/squareup/haha/perflib/Field;Lcom/squareup/haha/perflib/Instance;)V
    .locals 2

    .line 190
    invoke-virtual {p2}, Lcom/squareup/haha/perflib/Instance;->getIsSoftReference()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/squareup/haha/perflib/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "referent"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 191
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mSoftReferences:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 192
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mSoftReferences:Ljava/util/ArrayList;

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mSoftReferences:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 197
    :cond_1
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mHardReferences:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    return-void
.end method

.method public addRetainedSize(IJ)V
    .locals 3

    .line 163
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mRetainedSizes:[J

    aget-wide v1, v0, p1

    add-long/2addr v1, p2

    aput-wide v1, v0, p1

    .line 164
    return-void
.end method

.method protected getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;
    .locals 1

    .line 270
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mHeap:Lcom/squareup/haha/perflib/Heap;

    iget-object v0, v0, Lcom/squareup/haha/perflib/Heap;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    iget-object v0, v0, Lcom/squareup/haha/perflib/Snapshot;->mBuffer:Lcom/squareup/haha/perflib/io/HprofBuffer;

    return-object v0
.end method

.method public getClassObj()Lcom/squareup/haha/perflib/ClassObj;
    .locals 3

    .line 92
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mHeap:Lcom/squareup/haha/perflib/Heap;

    iget-object v0, v0, Lcom/squareup/haha/perflib/Heap;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    iget-wide v1, p0, Lcom/squareup/haha/perflib/Instance;->mClassId:J

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/perflib/Snapshot;->findClass(J)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    return-object v0
.end method

.method public final getCompositeSize()I
    .locals 2

    .line 96
    new-instance v1, Lcom/squareup/haha/perflib/Instance$CompositeSizeVisitor;

    invoke-direct {v1}, Lcom/squareup/haha/perflib/Instance$CompositeSizeVisitor;-><init>()V

    .line 97
    invoke-static {p0}, Lcom/squareup/haha/guava/collect/ImmutableList;->of(Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/squareup/haha/perflib/Instance$CompositeSizeVisitor;->doVisit(Ljava/lang/Iterable;)V

    .line 98
    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Instance$CompositeSizeVisitor;->getCompositeSize()I

    move-result v0

    return v0
.end method

.method public getDistanceToGcRoot()I
    .locals 1

    .line 136
    iget v0, p0, Lcom/squareup/haha/perflib/Instance;->mDistanceToGcRoot:I

    return v0
.end method

.method public getHardReferences()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation

    .line 203
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mHardReferences:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getHeap()Lcom/squareup/haha/perflib/Heap;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mHeap:Lcom/squareup/haha/perflib/Heap;

    return-object v0
.end method

.method public getId()J
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/squareup/haha/perflib/Instance;->mId:J

    return-wide v0
.end method

.method public getImmediateDominator()Lcom/squareup/haha/perflib/Instance;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mImmediateDominator:Lcom/squareup/haha/perflib/Instance;

    return-object v0
.end method

.method public getIsSoftReference()Z
    .locals 1

    .line 217
    const/4 v0, 0x0

    return v0
.end method

.method public getNextInstanceToGcRoot()Lcom/squareup/haha/perflib/Instance;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mNextInstanceToGcRoot:Lcom/squareup/haha/perflib/Instance;

    return-object v0
.end method

.method public getRetainedSize(I)J
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mRetainedSizes:[J

    aget-wide v0, v0, p1

    return-wide v0
.end method

.method public getSize()I
    .locals 1

    .line 103
    iget v0, p0, Lcom/squareup/haha/perflib/Instance;->mSize:I

    return v0
.end method

.method public getSoftReferences()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/squareup/haha/perflib/Instance;>;"
        }
    .end annotation

    .line 208
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mSoftReferences:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getTopologicalOrder()I
    .locals 1

    .line 119
    iget v0, p0, Lcom/squareup/haha/perflib/Instance;->mTopologicalOrder:I

    return v0
.end method

.method public getTotalRetainedSize()J
    .locals 9

    .line 171
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mRetainedSizes:[J

    if-nez v0, :cond_0

    .line 172
    const-wide/16 v0, 0x0

    return-wide v0

    .line 175
    :cond_0
    const-wide/16 v2, 0x0

    .line 176
    iget-object v4, p0, Lcom/squareup/haha/perflib/Instance;->mRetainedSizes:[J

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-wide v7, v4, v6

    .line 177
    add-long/2addr v2, v7

    .line 176
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 179
    :cond_1
    return-wide v2
.end method

.method public getUniqueId()J
    .locals 4

    .line 82
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/squareup/haha/perflib/Instance;->mHeap:Lcom/squareup/haha/perflib/Heap;

    iget-object v2, v2, Lcom/squareup/haha/perflib/Heap;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v2}, Lcom/squareup/haha/perflib/Snapshot;->getIdSizeMask()J

    move-result-wide v2

    and-long/2addr v0, v2

    return-wide v0
.end method

.method protected readId()J
    .locals 2

    .line 248
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mHeap:Lcom/squareup/haha/perflib/Heap;

    iget-object v0, v0, Lcom/squareup/haha/perflib/Heap;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    sget-object v1, Lcom/squareup/haha/perflib/Type;->OBJECT:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v0, v1}, Lcom/squareup/haha/perflib/Snapshot;->getTypeSize(Lcom/squareup/haha/perflib/Type;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 250
    :pswitch_0
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readByte()B

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 252
    :pswitch_1
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readShort()S

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 254
    :pswitch_2
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 256
    :pswitch_3
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readLong()J

    move-result-wide v0

    return-wide v0

    .line 258
    :goto_0
    :pswitch_4
    const-wide/16 v0, 0x0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method protected readUnsignedByte()I
    .locals 3

    .line 262
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readByte()B

    move-result v0

    .line 1075
    move v2, v0

    and-int/lit16 v0, v0, 0xff

    .line 262
    return v0
.end method

.method protected readUnsignedShort()I
    .locals 2

    .line 266
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readShort()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    return v0
.end method

.method protected readValue(Lcom/squareup/haha/perflib/Type;)Ljava/lang/Object;
    .locals 4

    .line 222
    sget-object v0, Lcom/squareup/haha/perflib/Instance$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    invoke-virtual {p1}, Lcom/squareup/haha/perflib/Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 224
    :pswitch_0
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->readId()J

    move-result-wide v2

    .line 225
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mHeap:Lcom/squareup/haha/perflib/Heap;

    iget-object v0, v0, Lcom/squareup/haha/perflib/Heap;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    invoke-virtual {v0, v2, v3}, Lcom/squareup/haha/perflib/Snapshot;->findInstance(J)Lcom/squareup/haha/perflib/Instance;

    move-result-object v0

    return-object v0

    .line 227
    :pswitch_1
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 229
    :pswitch_2
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readChar()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0

    .line 231
    :pswitch_3
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readFloat()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    .line 233
    :pswitch_4
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    .line 235
    :pswitch_5
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readByte()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    .line 237
    :pswitch_6
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readShort()S

    move-result v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    return-object v0

    .line 239
    :pswitch_7
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 241
    :pswitch_8
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    invoke-interface {v0}, Lcom/squareup/haha/perflib/io/HprofBuffer;->readLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 243
    :goto_1
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public resetRetainedSize()V
    .locals 5

    .line 153
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mHeap:Lcom/squareup/haha/perflib/Heap;

    iget-object v0, v0, Lcom/squareup/haha/perflib/Heap;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    iget-object v4, v0, Lcom/squareup/haha/perflib/Snapshot;->mHeaps:Ljava/util/ArrayList;

    .line 154
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mRetainedSizes:[J

    if-nez v0, :cond_0

    .line 155
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mRetainedSizes:[J

    goto :goto_0

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mRetainedSizes:[J

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->fill([JJ)V

    .line 159
    :goto_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mRetainedSizes:[J

    iget-object v1, p0, Lcom/squareup/haha/perflib/Instance;->mHeap:Lcom/squareup/haha/perflib/Heap;

    invoke-interface {v4, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Instance;->getSize()I

    move-result v2

    int-to-long v2, v2

    aput-wide v2, v0, v1

    .line 160
    return-void
.end method

.method public setClassId(J)V
    .locals 0

    .line 88
    iput-wide p1, p0, Lcom/squareup/haha/perflib/Instance;->mClassId:J

    .line 89
    return-void
.end method

.method public setDistanceToGcRoot(I)V
    .locals 1

    .line 144
    sget-boolean v0, Lcom/squareup/haha/perflib/Instance;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/squareup/haha/perflib/Instance;->mDistanceToGcRoot:I

    if-lt p1, v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 145
    :cond_0
    iput p1, p0, Lcom/squareup/haha/perflib/Instance;->mDistanceToGcRoot:I

    .line 146
    return-void
.end method

.method public setHeap(Lcom/squareup/haha/perflib/Heap;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/squareup/haha/perflib/Instance;->mHeap:Lcom/squareup/haha/perflib/Heap;

    .line 112
    return-void
.end method

.method public setImmediateDominator(Lcom/squareup/haha/perflib/Instance;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/squareup/haha/perflib/Instance;->mImmediateDominator:Lcom/squareup/haha/perflib/Instance;

    .line 133
    return-void
.end method

.method public setNextInstanceToGcRoot(Lcom/squareup/haha/perflib/Instance;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/squareup/haha/perflib/Instance;->mNextInstanceToGcRoot:Lcom/squareup/haha/perflib/Instance;

    .line 150
    return-void
.end method

.method public setSize(I)V
    .locals 0

    .line 107
    iput p1, p0, Lcom/squareup/haha/perflib/Instance;->mSize:I

    .line 108
    return-void
.end method

.method public setTopologicalOrder(I)V
    .locals 0

    .line 123
    iput p1, p0, Lcom/squareup/haha/perflib/Instance;->mTopologicalOrder:I

    .line 124
    return-void
.end method
