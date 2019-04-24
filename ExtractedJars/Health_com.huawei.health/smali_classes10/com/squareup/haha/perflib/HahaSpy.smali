.class public final Lcom/squareup/haha/perflib/HahaSpy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public static allocatingThread(Lcom/squareup/haha/perflib/Instance;)Lcom/squareup/haha/perflib/Instance;
    .locals 5

    .line 21
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mHeap:Lcom/squareup/haha/perflib/Heap;

    iget-object v2, v0, Lcom/squareup/haha/perflib/Heap;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    .line 23
    instance-of v0, p0, Lcom/squareup/haha/perflib/RootObj;

    if-eqz v0, :cond_0

    .line 24
    move-object v0, p0

    check-cast v0, Lcom/squareup/haha/perflib/RootObj;

    iget v3, v0, Lcom/squareup/haha/perflib/RootObj;->mThread:I

    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/Instance;->mStack:Lcom/squareup/haha/perflib/StackTrace;

    iget v3, v0, Lcom/squareup/haha/perflib/StackTrace;->mThreadSerialNumber:I

    .line 28
    :goto_0
    invoke-virtual {v2, v3}, Lcom/squareup/haha/perflib/Snapshot;->getThread(I)Lcom/squareup/haha/perflib/ThreadObj;

    move-result-object v4

    .line 29
    iget-wide v0, v4, Lcom/squareup/haha/perflib/ThreadObj;->mId:J

    invoke-virtual {v2, v0, v1}, Lcom/squareup/haha/perflib/Snapshot;->findInstance(J)Lcom/squareup/haha/perflib/Instance;

    move-result-object v0

    return-object v0
.end method
