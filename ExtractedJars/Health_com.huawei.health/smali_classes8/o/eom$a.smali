.class Lo/eom$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eom;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lo/eom;

.field private e:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Lo/eom;)V
    .locals 1

    .line 303
    iput-object p1, p0, Lo/eom$a;->c:Lo/eom;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 304
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lo/eom$a;->e:Ljava/lang/Thread;

    .line 305
    iget-object v0, p0, Lo/eom$a;->e:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 306
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 308
    :goto_0
    iget-object v0, p0, Lo/eom$a;->c:Lo/eom;

    invoke-static {v0}, Lo/eom;->d(Lo/eom;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    iget-object v0, p0, Lo/eom$a;->c:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->postInvalidate()V

    .line 311
    const-wide/16 v0, 0x32

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 312
    iget-object v0, p0, Lo/eom$a;->c:Lo/eom;

    iget-object v1, p0, Lo/eom$a;->c:Lo/eom;

    invoke-static {v1}, Lo/eom;->c(Lo/eom;)F

    move-result v1

    const v2, 0x4122353f    # 10.138f

    add-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/eom;->d(Lo/eom;F)F
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 315
    goto :goto_0

    .line 313
    :catch_0
    move-exception v4

    .line 314
    const-string v0, "ProgressBarView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InterruptedException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    goto :goto_0

    .line 317
    :cond_0
    return-void
.end method
