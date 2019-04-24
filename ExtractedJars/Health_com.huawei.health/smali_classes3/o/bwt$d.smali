.class Lo/bwt$d;
.super Lo/cah;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bwt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/cah<Lo/bwt;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/bwt;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/cah;-><init>(Ljava/lang/Object;)V

    .line 40
    return-void
.end method


# virtual methods
.method public a(Lo/bwt;Landroid/os/Message;)V
    .locals 4

    .line 44
    if-nez p1, :cond_0

    .line 45
    invoke-static {}, Lo/bwt;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handle\u4e2d\u7684TimeProgressPlus\u4e3anull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void

    .line 48
    :cond_0
    invoke-static {p1}, Lo/bwt;->b(Lo/bwt;)F

    .line 49
    invoke-static {p1}, Lo/bwt;->c(Lo/bwt;)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Lo/bwt;->setAutoProgress(I)V

    .line 50
    invoke-static {p1}, Lo/bwt;->c(Lo/bwt;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 51
    const/4 v0, 0x1

    const-wide/16 v1, 0x3e8

    invoke-virtual {p0, v0, v1, v2}, Lo/bwt$d;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 53
    :cond_1
    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {p1, v0}, Lo/bwt;->b(Lo/bwt;F)F

    .line 54
    invoke-static {p1}, Lo/bwt;->a(Lo/bwt;)Lo/bwt$a;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 55
    invoke-static {p1}, Lo/bwt;->a(Lo/bwt;)Lo/bwt$a;

    move-result-object v0

    invoke-interface {v0}, Lo/bwt$a;->a()V

    .line 58
    :cond_2
    :goto_0
    return-void
.end method

.method public synthetic c(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 36
    move-object v0, p1

    check-cast v0, Lo/bwt;

    invoke-virtual {p0, v0, p2}, Lo/bwt$d;->a(Lo/bwt;Landroid/os/Message;)V

    return-void
.end method
