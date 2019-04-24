.class public Lo/cdf;
.super Lo/cdd;
.source "SourceFile"


# instance fields
.field private b:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<Lo/cgn;>;"
        }
    .end annotation
.end field

.field private e:Lo/cde;


# direct methods
.method public constructor <init>(Lo/cdk;)V
    .locals 1

    .line 13
    invoke-direct {p0, p1}, Lo/cdd;-><init>(Lo/cdk;)V

    .line 10
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/cdf;->b:Ljava/util/LinkedList;

    .line 14
    invoke-virtual {p0}, Lo/cdf;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->d()Lo/cde;

    move-result-object v0

    iput-object v0, p0, Lo/cdf;->e:Lo/cde;

    .line 15
    return-void
.end method


# virtual methods
.method public a(Lo/cgn;)I
    .locals 2

    .line 25
    invoke-virtual {p1}, Lo/cgn;->a()F

    move-result v0

    iget-object v1, p0, Lo/cdf;->e:Lo/cde;

    invoke-virtual {v1}, Lo/cde;->d()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 26
    const/4 v0, 0x0

    return v0

    .line 30
    :cond_0
    iget-object v0, p0, Lo/cdf;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 31
    iget-object v0, p0, Lo/cdf;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    iget-object v1, p0, Lo/cdf;->e:Lo/cde;

    invoke-virtual {v1}, Lo/cde;->b()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 32
    iget-object v0, p0, Lo/cdf;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 36
    :cond_1
    iget-object v0, p0, Lo/cdf;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    iget-object v1, p0, Lo/cdf;->e:Lo/cde;

    invoke-virtual {v1}, Lo/cde;->b()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 37
    const/4 v0, 0x1

    return v0

    .line 40
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/util/LinkedList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/LinkedList<Lo/cgn;>;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lo/cdf;->b:Ljava/util/LinkedList;

    return-object v0
.end method
