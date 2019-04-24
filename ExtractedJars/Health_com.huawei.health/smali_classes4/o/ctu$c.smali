.class Lo/ctu$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ctu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/ctu;>;"
        }
    .end annotation
.end field

.field b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lo/ctu;Landroid/util/SparseArray;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ctu;Landroid/util/SparseArray<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 244
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 245
    iput-object p2, p0, Lo/ctu$c;->b:Landroid/util/SparseArray;

    .line 246
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ctu$c;->a:Ljava/lang/ref/WeakReference;

    .line 247
    return-void
.end method

.method synthetic constructor <init>(Lo/ctu;Landroid/util/SparseArray;Lo/ctu$3;)V
    .locals 0

    .line 240
    invoke-direct {p0, p1, p2}, Lo/ctu$c;-><init>(Lo/ctu;Landroid/util/SparseArray;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 250
    iget-object v0, p0, Lo/ctu$c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ctu;

    .line 251
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 252
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StatDownloadRunnable() mSyncStat = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    return-void

    .line 256
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/ctu$c;->b:Landroid/util/SparseArray;

    invoke-static {v4, v0}, Lo/ctu;->d(Lo/ctu;Landroid/util/SparseArray;)V
    :try_end_0
    .catch Lo/csq; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    goto :goto_0

    .line 258
    :catch_0
    move-exception v5

    .line 259
    const-string v0, "Debug_HiSyncTotalSportStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneStatByTime error ! e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lo/csq;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    :goto_0
    return-void
.end method
