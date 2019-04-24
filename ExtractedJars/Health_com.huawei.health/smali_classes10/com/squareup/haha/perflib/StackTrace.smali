.class public Lcom/squareup/haha/perflib/StackTrace;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field mFrames:[Lcom/squareup/haha/perflib/StackFrame;

.field mOffset:I

.field mParent:Lcom/squareup/haha/perflib/StackTrace;

.field mSerialNumber:I

.field mThreadSerialNumber:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/squareup/haha/perflib/StackTrace;->mParent:Lcom/squareup/haha/perflib/StackTrace;

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/squareup/haha/perflib/StackTrace;->mOffset:I

    .line 43
    return-void
.end method

.method public constructor <init>(II[Lcom/squareup/haha/perflib/StackFrame;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/squareup/haha/perflib/StackTrace;->mParent:Lcom/squareup/haha/perflib/StackTrace;

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/squareup/haha/perflib/StackTrace;->mOffset:I

    .line 46
    iput p1, p0, Lcom/squareup/haha/perflib/StackTrace;->mSerialNumber:I

    .line 47
    iput p2, p0, Lcom/squareup/haha/perflib/StackTrace;->mThreadSerialNumber:I

    .line 48
    iput-object p3, p0, Lcom/squareup/haha/perflib/StackTrace;->mFrames:[Lcom/squareup/haha/perflib/StackFrame;

    .line 49
    return-void
.end method


# virtual methods
.method public final dump()V
    .locals 4

    .line 67
    iget-object v0, p0, Lcom/squareup/haha/perflib/StackTrace;->mFrames:[Lcom/squareup/haha/perflib/StackFrame;

    array-length v2, v0

    .line 69
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 70
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    iget-object v1, p0, Lcom/squareup/haha/perflib/StackTrace;->mFrames:[Lcom/squareup/haha/perflib/StackFrame;

    aget-object v1, v1, v3

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/StackFrame;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 69
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 72
    :cond_0
    return-void
.end method

.method public final fromDepth(I)Lcom/squareup/haha/perflib/StackTrace;
    .locals 2

    .line 53
    new-instance v1, Lcom/squareup/haha/perflib/StackTrace;

    invoke-direct {v1}, Lcom/squareup/haha/perflib/StackTrace;-><init>()V

    .line 55
    iget-object v0, p0, Lcom/squareup/haha/perflib/StackTrace;->mParent:Lcom/squareup/haha/perflib/StackTrace;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/squareup/haha/perflib/StackTrace;->mParent:Lcom/squareup/haha/perflib/StackTrace;

    iput-object v0, v1, Lcom/squareup/haha/perflib/StackTrace;->mParent:Lcom/squareup/haha/perflib/StackTrace;

    goto :goto_0

    .line 58
    :cond_0
    iput-object p0, v1, Lcom/squareup/haha/perflib/StackTrace;->mParent:Lcom/squareup/haha/perflib/StackTrace;

    .line 61
    :goto_0
    iget v0, p0, Lcom/squareup/haha/perflib/StackTrace;->mOffset:I

    add-int/2addr v0, p1

    iput v0, v1, Lcom/squareup/haha/perflib/StackTrace;->mOffset:I

    .line 63
    return-object v1
.end method
