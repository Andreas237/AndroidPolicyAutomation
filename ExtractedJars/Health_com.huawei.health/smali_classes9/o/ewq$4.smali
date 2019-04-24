.class Lo/ewq$4;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ewq;-><init>(III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic e:Lo/ewq;


# direct methods
.method constructor <init>(Lo/ewq;JJI)V
    .locals 0

    .line 19
    iput-object p1, p0, Lo/ewq$4;->e:Lo/ewq;

    iput p6, p0, Lo/ewq$4;->c:I

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    .line 26
    iget-object v0, p0, Lo/ewq$4;->e:Lo/ewq;

    invoke-static {v0}, Lo/ewq;->b(Lo/ewq;)Lo/ewq$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Lo/ewq$4;->e:Lo/ewq;

    invoke-static {v0}, Lo/ewq;->b(Lo/ewq;)Lo/ewq$c;

    move-result-object v0

    invoke-interface {v0}, Lo/ewq$c;->b()V

    .line 29
    :cond_0
    return-void
.end method

.method public onTick(J)V
    .locals 4

    .line 22
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "flag="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ewq$4;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    return-void
.end method
