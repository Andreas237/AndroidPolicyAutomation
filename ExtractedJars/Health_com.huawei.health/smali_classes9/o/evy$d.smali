.class Lo/evy$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/evy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/evy;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/evy;)V
    .locals 1

    .line 406
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 407
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/evy$d;->b:Ljava/lang/ref/WeakReference;

    .line 408
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 412
    iget-object v0, p0, Lo/evy$d;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/evy;

    .line 413
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 414
    const-string v0, "SleepRefreshDataInteator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " IBaseResponseCallbackCoreSleep in SleepCardData, sleepCardData= null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    return-void

    .line 418
    :cond_0
    invoke-static {v4, p1, p2}, Lo/evy;->c(Lo/evy;ILjava/lang/Object;)V

    .line 419
    return-void
.end method
