.class Lo/csh$b;
.super Lo/czy$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/csh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field a:J

.field b:J

.field private c:I

.field final synthetic d:Lo/csh;

.field private e:I


# direct methods
.method public constructor <init>(Lo/csh;JJII)V
    .locals 0

    .line 572
    iput-object p1, p0, Lo/csh$b;->d:Lo/csh;

    invoke-direct {p0}, Lo/czy$a;-><init>()V

    .line 573
    iput-wide p2, p0, Lo/csh$b;->b:J

    .line 574
    iput-wide p4, p0, Lo/csh$b;->a:J

    .line 575
    iput p6, p0, Lo/csh$b;->c:I

    .line 576
    iput p7, p0, Lo/csh$b;->e:I

    .line 577
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 596
    iget v0, p0, Lo/csh$b;->e:I

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()J
    .locals 2

    .line 586
    iget-wide v0, p0, Lo/csh$b;->a:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    .line 581
    iget-wide v0, p0, Lo/csh$b;->b:J

    return-wide v0
.end method

.method public e()F
    .locals 1

    .line 591
    iget v0, p0, Lo/csh$b;->c:I

    int-to-float v0, v0

    return v0
.end method
