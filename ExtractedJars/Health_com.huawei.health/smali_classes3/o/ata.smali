.class public final Lo/ata;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/ata;


# instance fields
.field private a:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray<Lo/ayc;>;"
        }
    .end annotation
.end field

.field private e:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray<Lo/ayc;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Lo/ata;

    invoke-direct {v0}, Lo/ata;-><init>()V

    sput-object v0, Lo/ata;->b:Lo/ata;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lo/ata;->a:Landroid/support/v4/util/LongSparseArray;

    .line 45
    new-instance v0, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v0}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lo/ata;->e:Landroid/support/v4/util/LongSparseArray;

    .line 25
    return-void
.end method

.method public static d()Lo/ata;
    .locals 1

    .line 34
    sget-object v0, Lo/ata;->b:Lo/ata;

    return-object v0
.end method


# virtual methods
.method public a(J)Lo/ayc;
    .locals 3

    .line 55
    iget-object v1, p0, Lo/ata;->a:Landroid/support/v4/util/LongSparseArray;

    monitor-enter v1

    .line 57
    :try_start_0
    iget-object v0, p0, Lo/ata;->a:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ayc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 58
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public b(J)Lo/ayc;
    .locals 3

    .line 97
    iget-object v1, p0, Lo/ata;->e:Landroid/support/v4/util/LongSparseArray;

    monitor-enter v1

    .line 99
    :try_start_0
    iget-object v0, p0, Lo/ata;->e:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ayc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 100
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public b(JLo/ayc;)V
    .locals 3

    .line 69
    iget-object v1, p0, Lo/ata;->a:Landroid/support/v4/util/LongSparseArray;

    monitor-enter v1

    .line 71
    :try_start_0
    iget-object v0, p0, Lo/ata;->a:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 73
    :goto_0
    return-void
.end method

.method public c(J)V
    .locals 3

    .line 82
    iget-object v1, p0, Lo/ata;->a:Landroid/support/v4/util/LongSparseArray;

    monitor-enter v1

    .line 84
    :try_start_0
    iget-object v0, p0, Lo/ata;->a:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->remove(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 86
    :goto_0
    return-void
.end method

.method public d(J)V
    .locals 3

    .line 125
    iget-object v1, p0, Lo/ata;->e:Landroid/support/v4/util/LongSparseArray;

    monitor-enter v1

    .line 127
    :try_start_0
    iget-object v0, p0, Lo/ata;->e:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->remove(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 129
    :goto_0
    return-void
.end method

.method public e(JLo/ayc;)V
    .locals 3

    .line 111
    iget-object v1, p0, Lo/ata;->e:Landroid/support/v4/util/LongSparseArray;

    monitor-enter v1

    .line 113
    :try_start_0
    iget-object v0, p0, Lo/ata;->e:Landroid/support/v4/util/LongSparseArray;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 115
    :goto_0
    return-void
.end method
