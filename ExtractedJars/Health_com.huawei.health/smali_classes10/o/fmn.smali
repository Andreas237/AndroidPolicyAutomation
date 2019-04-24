.class public Lo/fmn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmm;


# instance fields
.field private c:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lo/fmn;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 47
    iget-object v0, p0, Lo/fmn;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 48
    return-void
.end method


# virtual methods
.method public d()I
    .locals 2

    .line 57
    iget-object v0, p0, Lo/fmn;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    return v0
.end method
