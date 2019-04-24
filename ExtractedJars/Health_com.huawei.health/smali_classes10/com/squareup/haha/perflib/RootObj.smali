.class public Lcom/squareup/haha/perflib/RootObj;
.super Lcom/squareup/haha/perflib/Instance;
.source "SourceFile"


# static fields
.field public static final UNDEFINED_CLASS_NAME:Ljava/lang/String; = "no class defined!!"


# instance fields
.field mIndex:I

.field mThread:I

.field mType:Lcom/squareup/haha/perflib/RootType;


# direct methods
.method public constructor <init>(Lcom/squareup/haha/perflib/RootType;)V
    .locals 6

    .line 32
    move-object v0, p0

    move-object v1, p1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/squareup/haha/perflib/RootObj;-><init>(Lcom/squareup/haha/perflib/RootType;JILcom/squareup/haha/perflib/StackTrace;)V

    .line 33
    return-void
.end method

.method public constructor <init>(Lcom/squareup/haha/perflib/RootType;J)V
    .locals 6

    .line 36
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/squareup/haha/perflib/RootObj;-><init>(Lcom/squareup/haha/perflib/RootType;JILcom/squareup/haha/perflib/StackTrace;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Lcom/squareup/haha/perflib/RootType;JILcom/squareup/haha/perflib/StackTrace;)V
    .locals 1

    .line 40
    invoke-direct {p0, p2, p3, p5}, Lcom/squareup/haha/perflib/Instance;-><init>(JLcom/squareup/haha/perflib/StackTrace;)V

    .line 25
    sget-object v0, Lcom/squareup/haha/perflib/RootType;->UNKNOWN:Lcom/squareup/haha/perflib/RootType;

    iput-object v0, p0, Lcom/squareup/haha/perflib/RootObj;->mType:Lcom/squareup/haha/perflib/RootType;

    .line 41
    iput-object p1, p0, Lcom/squareup/haha/perflib/RootObj;->mType:Lcom/squareup/haha/perflib/RootType;

    .line 42
    iput p4, p0, Lcom/squareup/haha/perflib/RootObj;->mThread:I

    .line 43
    return-void
.end method


# virtual methods
.method public final accept(Lcom/squareup/haha/perflib/Visitor;)V
    .locals 2

    .line 63
    invoke-interface {p1, p0}, Lcom/squareup/haha/perflib/Visitor;->visitRootObj(Lcom/squareup/haha/perflib/RootObj;)V

    .line 64
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/RootObj;->getReferredInstance()Lcom/squareup/haha/perflib/Instance;

    move-result-object v1

    .line 65
    if-eqz v1, :cond_0

    .line 66
    const/4 v0, 0x0

    invoke-interface {p1, v0, v1}, Lcom/squareup/haha/perflib/Visitor;->visitLater(Lcom/squareup/haha/perflib/Instance;Lcom/squareup/haha/perflib/Instance;)V

    .line 68
    :cond_0
    return-void
.end method

.method public final getClassName(Lcom/squareup/haha/perflib/Snapshot;)Ljava/lang/String;
    .locals 3

    .line 48
    iget-object v0, p0, Lcom/squareup/haha/perflib/RootObj;->mType:Lcom/squareup/haha/perflib/RootType;

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->SYSTEM_CLASS:Lcom/squareup/haha/perflib/RootType;

    if-ne v0, v1, :cond_0

    .line 49
    iget-wide v0, p0, Lcom/squareup/haha/perflib/RootObj;->mId:J

    invoke-virtual {p1, v0, v1}, Lcom/squareup/haha/perflib/Snapshot;->findClass(J)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v2

    goto :goto_0

    .line 51
    :cond_0
    iget-wide v0, p0, Lcom/squareup/haha/perflib/RootObj;->mId:J

    invoke-virtual {p1, v0, v1}, Lcom/squareup/haha/perflib/Snapshot;->findInstance(J)Lcom/squareup/haha/perflib/Instance;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Instance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v2

    .line 54
    :goto_0
    if-nez v2, :cond_1

    .line 55
    const-string v0, "no class defined!!"

    return-object v0

    .line 58
    :cond_1
    iget-object v0, v2, Lcom/squareup/haha/perflib/ClassObj;->mClassName:Ljava/lang/String;

    return-object v0
.end method

.method public getReferredInstance()Lcom/squareup/haha/perflib/Instance;
    .locals 3

    .line 76
    iget-object v0, p0, Lcom/squareup/haha/perflib/RootObj;->mType:Lcom/squareup/haha/perflib/RootType;

    sget-object v1, Lcom/squareup/haha/perflib/RootType;->SYSTEM_CLASS:Lcom/squareup/haha/perflib/RootType;

    if-ne v0, v1, :cond_0

    .line 77
    iget-object v0, p0, Lcom/squareup/haha/perflib/RootObj;->mHeap:Lcom/squareup/haha/perflib/Heap;

    iget-object v0, v0, Lcom/squareup/haha/perflib/Heap;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    iget-wide v1, p0, Lcom/squareup/haha/perflib/RootObj;->mId:J

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/perflib/Snapshot;->findClass(J)Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    return-object v0

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/perflib/RootObj;->mHeap:Lcom/squareup/haha/perflib/Heap;

    iget-object v0, v0, Lcom/squareup/haha/perflib/Heap;->mSnapshot:Lcom/squareup/haha/perflib/Snapshot;

    iget-wide v1, p0, Lcom/squareup/haha/perflib/RootObj;->mId:J

    invoke-virtual {v0, v1, v2}, Lcom/squareup/haha/perflib/Snapshot;->findInstance(J)Lcom/squareup/haha/perflib/Instance;

    move-result-object v0

    return-object v0
.end method

.method public getRootType()Lcom/squareup/haha/perflib/RootType;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/squareup/haha/perflib/RootObj;->mType:Lcom/squareup/haha/perflib/RootType;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 71
    const-string v0, "%s@0x%08x"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/squareup/haha/perflib/RootObj;->mType:Lcom/squareup/haha/perflib/RootType;

    invoke-virtual {v2}, Lcom/squareup/haha/perflib/RootType;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/squareup/haha/perflib/RootObj;->mId:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
