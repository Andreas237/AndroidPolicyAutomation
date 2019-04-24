.class public Lnet/sourceforge/zbar/SymbolSet;
.super Ljava/util/AbstractCollection;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractCollection<",
        "Lnet/sourceforge/zbar/Symbol;",
        ">;"
    }
.end annotation


# instance fields
.field private peer:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "zbarjni"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-static {}, Lnet/sourceforge/zbar/SymbolSet;->init()V

    return-void
.end method

.method constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-wide p1, p0, Lnet/sourceforge/zbar/SymbolSet;->peer:J

    return-void
.end method

.method private native destroy(J)V
.end method

.method private native firstSymbol(J)J
.end method

.method private static native init()V
.end method


# virtual methods
.method public declared-synchronized destroy()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lnet/sourceforge/zbar/SymbolSet;->peer:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v0, p0, Lnet/sourceforge/zbar/SymbolSet;->peer:J

    invoke-direct {p0, v0, v1}, Lnet/sourceforge/zbar/SymbolSet;->destroy(J)V

    iput-wide v2, p0, Lnet/sourceforge/zbar/SymbolSet;->peer:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected finalize()V
    .locals 0

    invoke-virtual {p0}, Lnet/sourceforge/zbar/SymbolSet;->destroy()V

    return-void
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lnet/sourceforge/zbar/Symbol;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Lnet/sourceforge/zbar/SymbolSet;->peer:J

    invoke-direct {p0, v0, v1}, Lnet/sourceforge/zbar/SymbolSet;->firstSymbol(J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    new-instance v0, Lnet/sourceforge/zbar/SymbolIterator;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/sourceforge/zbar/SymbolIterator;-><init>(Lnet/sourceforge/zbar/Symbol;)V

    return-object v0

    :cond_0
    new-instance v2, Lnet/sourceforge/zbar/SymbolIterator;

    new-instance v3, Lnet/sourceforge/zbar/Symbol;

    invoke-direct {v3, v0, v1}, Lnet/sourceforge/zbar/Symbol;-><init>(J)V

    invoke-direct {v2, v3}, Lnet/sourceforge/zbar/SymbolIterator;-><init>(Lnet/sourceforge/zbar/Symbol;)V

    return-object v2
.end method

.method public native size()I
.end method
