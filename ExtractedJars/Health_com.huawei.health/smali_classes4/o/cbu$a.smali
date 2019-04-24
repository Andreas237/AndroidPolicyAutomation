.class Lo/cbu$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cbu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/cbu;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/cbu;)V
    .locals 1

    .line 3516
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3517
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/cbu$a;->d:Ljava/lang/ref/WeakReference;

    .line 3518
    return-void
.end method


# virtual methods
.method public c(IJ)V
    .locals 5

    .line 3522
    iget-object v0, p0, Lo/cbu$a;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cbu;

    .line 3523
    if-nez v4, :cond_0

    .line 3524
    const-string v0, "Track_SportManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHeartRateListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3525
    return-void

    .line 3527
    :cond_0
    invoke-static {v4}, Lo/cbu;->u(Lo/cbu;)J

    move-result-wide v0

    sub-long v0, p2, v0

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    if-lez p1, :cond_1

    const/16 v0, 0xdc

    if-ge p1, v0, :cond_1

    .line 3528
    invoke-static {v4, p1}, Lo/cbu;->k(Lo/cbu;I)I

    .line 3529
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lo/cbu;->d(Lo/cbu;Z)Z

    .line 3530
    invoke-static {v4}, Lo/cbu;->t(Lo/cbu;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2, p3}, Lo/cds;->e(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3531
    invoke-static {v4, p2, p3}, Lo/cbu;->b(Lo/cbu;J)J

    .line 3534
    :cond_1
    if-nez p1, :cond_2

    invoke-static {v4}, Lo/cbu;->r(Lo/cbu;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 3535
    const-string v0, "0"

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v4, v0}, Lo/cbu;->k(Lo/cbu;I)I

    .line 3538
    :cond_2
    if-lez p1, :cond_3

    const/16 v0, 0xdc

    if-ge p1, v0, :cond_3

    .line 3539
    invoke-static {v4, p1}, Lo/cbu;->i(Lo/cbu;I)I

    .line 3540
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lo/cbu;->g(Lo/cbu;I)I

    .line 3542
    :cond_3
    return-void
.end method
