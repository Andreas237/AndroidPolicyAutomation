.class Lo/ahc$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lo/ahc;

.field private b:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Lo/ahc;)V
    .locals 1

    .line 309
    iput-object p1, p0, Lo/ahc$c;->a:Lo/ahc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 310
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lo/ahc$c;->b:Ljava/lang/Thread;

    .line 311
    iget-object v0, p0, Lo/ahc$c;->b:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 312
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 314
    :goto_0
    iget-object v0, p0, Lo/ahc$c;->a:Lo/ahc;

    invoke-static {v0}, Lo/ahc;->a(Lo/ahc;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 315
    iget-object v0, p0, Lo/ahc$c;->a:Lo/ahc;

    invoke-virtual {v0}, Lo/ahc;->postInvalidate()V

    .line 317
    const-wide/16 v0, 0x32

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 318
    iget-object v0, p0, Lo/ahc$c;->a:Lo/ahc;

    iget-object v1, p0, Lo/ahc$c;->a:Lo/ahc;

    invoke-static {v1}, Lo/ahc;->c(Lo/ahc;)F

    move-result v1

    const v2, 0x4122353f    # 10.138f

    add-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/ahc;->e(Lo/ahc;F)F
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    goto :goto_0

    .line 319
    :catch_0
    move-exception v4

    .line 320
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

    .line 321
    goto :goto_0

    .line 323
    :cond_0
    return-void
.end method
