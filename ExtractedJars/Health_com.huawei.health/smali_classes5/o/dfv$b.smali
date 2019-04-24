.class Lo/dfv$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dfv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Z

.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/dfv;>;"
        }
    .end annotation
.end field

.field private e:I


# direct methods
.method constructor <init>(Lo/dfv;IZ)V
    .locals 5

    .line 369
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 366
    const/4 v0, 0x0

    iput v0, p0, Lo/dfv$b;->e:I

    .line 367
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dfv$b;->c:Z

    .line 370
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SyncCompleteRunRunable isNeedSyncwork:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 371
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dfv$b;->d:Ljava/lang/ref/WeakReference;

    .line 372
    iput p2, p0, Lo/dfv$b;->e:I

    .line 373
    iput-boolean p3, p0, Lo/dfv$b;->c:Z

    .line 374
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 378
    iget-object v0, p0, Lo/dfv$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/dfv;

    .line 379
    if-eqz v2, :cond_0

    .line 380
    iget v0, p0, Lo/dfv$b;->e:I

    iget-boolean v1, p0, Lo/dfv$b;->c:Z

    invoke-static {v2, v0, v1}, Lo/dfv;->d(Lo/dfv;IZ)V

    .line 382
    :cond_0
    return-void
.end method
