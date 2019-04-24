.class Lo/etn$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/etn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/etn;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lo/etn;)V
    .locals 1

    .line 296
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 294
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etn$d;->c:Ljava/lang/ref/WeakReference;

    .line 297
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/etn$d;->c:Ljava/lang/ref/WeakReference;

    .line 298
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 6

    .line 302
    iget-object v0, p0, Lo/etn$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/etn;

    .line 303
    if-nez v4, :cond_0

    .line 304
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepCallback mStepsCard == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    return-void

    .line 307
    :cond_0
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "report steps="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "step"

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    invoke-static {v4}, Lo/etn;->d(Lo/etn;)I

    move-result v5

    .line 309
    const-string v0, "step"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v4, v0}, Lo/etn;->a(Lo/etn;I)I

    .line 312
    invoke-static {v4}, Lo/etn;->e(Lo/etn;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v4}, Lo/etn;->d(Lo/etn;)I

    move-result v0

    if-eq v0, v5, :cond_1

    invoke-static {v4}, Lo/etn;->d(Lo/etn;)I

    move-result v0

    if-nez v0, :cond_1

    .line 313
    iget-object v0, v4, Lo/etn;->d:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 314
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update card steps= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/etn;->d(Lo/etn;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    iget-object v0, v4, Lo/etn;->d:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 319
    :cond_1
    return-void
.end method
