.class Lo/bqt$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bqe;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bqt;->a(Lo/bqb;)[B
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final a:I

.field final synthetic b:Ljava/lang/Thread;

.field c:I

.field final synthetic e:Lo/bqt;


# direct methods
.method constructor <init>(Lo/bqt;Ljava/lang/Thread;)V
    .locals 2

    .line 313
    iput-object p1, p0, Lo/bqt$3;->e:Lo/bqt;

    iput-object p2, p0, Lo/bqt$3;->b:Ljava/lang/Thread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 314
    const/4 v0, 0x1

    iput v0, p0, Lo/bqt$3;->c:I

    .line 315
    iget-object v0, p0, Lo/bqt$3;->e:Lo/bqt;

    invoke-static {v0}, Lo/bqt;->d(Lo/bqt;)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x64

    iput v0, p0, Lo/bqt$3;->a:I

    return-void
.end method


# virtual methods
.method public onProgress(JJ)V
    .locals 5

    .line 320
    iget-object v0, p0, Lo/bqt$3;->e:Lo/bqt;

    invoke-static {v0}, Lo/bqt;->b(Lo/bqt;)Lo/bqu;

    move-result-object v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-lez v0, :cond_0

    .line 322
    iget v0, p0, Lo/bqt$3;->c:I

    int-to-long v0, v0

    const-wide/16 v2, 0x32

    div-long v2, p3, v2

    mul-long/2addr v0, v2

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 324
    iget v0, p0, Lo/bqt$3;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqt$3;->c:I

    .line 327
    iget v0, p0, Lo/bqt$3;->a:I

    int-to-long v0, v0

    mul-long/2addr v0, p1

    div-long/2addr v0, p3

    long-to-int v4, v0

    .line 330
    iget-object v0, p0, Lo/bqt$3;->e:Lo/bqt;

    invoke-static {v0}, Lo/bqt;->b(Lo/bqt;)Lo/bqu;

    move-result-object v0

    iget-object v1, p0, Lo/bqt$3;->e:Lo/bqt;

    invoke-static {v1}, Lo/bqt;->d(Lo/bqt;)I

    move-result v1

    add-int/2addr v1, v4

    invoke-interface {v0, v1}, Lo/bqu;->d(I)V

    .line 335
    :cond_0
    iget-object v0, p0, Lo/bqt$3;->e:Lo/bqt;

    invoke-static {v0}, Lo/bqt;->c(Lo/bqt;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 339
    iget-object v0, p0, Lo/bqt$3;->b:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 341
    :cond_1
    return-void
.end method
