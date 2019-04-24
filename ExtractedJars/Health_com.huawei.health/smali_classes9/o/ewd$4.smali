.class Lo/ewd$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ewd;


# direct methods
.method constructor <init>(Lo/ewd;)V
    .locals 0

    .line 360
    iput-object p1, p0, Lo/ewd$4;->b:Lo/ewd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 363
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 364
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 365
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pressureMeasureDetailInteractor setStressData err_code == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data storage success."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    iget-object v0, p0, Lo/ewd$4;->b:Lo/ewd;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ewd;->d(Lo/ewd;Z)V

    goto :goto_0

    .line 369
    :cond_0
    iget-object v0, p0, Lo/ewd$4;->b:Lo/ewd;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ewd;->d(Lo/ewd;Z)V

    goto :goto_0

    .line 372
    :cond_1
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data storage fail."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    iget-object v0, p0, Lo/ewd$4;->b:Lo/ewd;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ewd;->d(Lo/ewd;Z)V

    .line 375
    :goto_0
    iget-object v0, p0, Lo/ewd$4;->b:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->b(Lo/ewd;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 376
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "measureSemaphore.release()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    return-void
.end method
