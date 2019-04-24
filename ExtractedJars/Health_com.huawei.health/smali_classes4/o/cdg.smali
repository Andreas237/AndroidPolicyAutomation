.class public Lo/cdg;
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

.field private d:Lo/cde;


# direct methods
.method public constructor <init>(Lo/cdk;)V
    .locals 1

    .line 13
    invoke-direct {p0, p1}, Lo/cdd;-><init>(Lo/cdk;)V

    .line 10
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/cdg;->b:Ljava/util/LinkedList;

    .line 14
    invoke-virtual {p0}, Lo/cdg;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->d()Lo/cde;

    move-result-object v0

    iput-object v0, p0, Lo/cdg;->d:Lo/cde;

    .line 15
    return-void
.end method


# virtual methods
.method public a(Lo/cgn;)I
    .locals 7

    .line 20
    invoke-virtual {p0}, Lo/cdg;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->f()I

    move-result v4

    .line 23
    invoke-virtual {p1}, Lo/cgn;->a()F

    move-result v0

    iget-object v1, p0, Lo/cdg;->d:Lo/cde;

    invoke-virtual {v1}, Lo/cde;->d()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 24
    const/4 v0, 0x0

    return v0

    .line 28
    :cond_0
    iget-object v0, p0, Lo/cdg;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Lo/cgn;->c()J

    move-result-wide v0

    iget-object v2, p0, Lo/cdg;->b:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/cgn;

    invoke-virtual {v2}, Lo/cgn;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-object v2, p0, Lo/cdg;->d:Lo/cde;

    invoke-virtual {v2}, Lo/cde;->h()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 29
    iget-object v0, p0, Lo/cdg;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 33
    :cond_1
    iget-object v0, p0, Lo/cdg;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 34
    iget-object v0, p0, Lo/cdg;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    iget-object v1, p0, Lo/cdg;->d:Lo/cde;

    invoke-virtual {v1}, Lo/cde;->b()I

    move-result v1

    if-le v0, v1, :cond_2

    .line 35
    iget-object v0, p0, Lo/cdg;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 39
    :cond_2
    iget-object v0, p0, Lo/cdg;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    iget-object v1, p0, Lo/cdg;->d:Lo/cde;

    invoke-virtual {v1}, Lo/cde;->b()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 40
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/cdg;->d:Lo/cde;

    invoke-virtual {v0}, Lo/cde;->b()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v5, v0, :cond_4

    .line 41
    iget-object v0, p0, Lo/cdg;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, v5}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cgn;

    iget-object v1, p0, Lo/cdg;->b:Ljava/util/LinkedList;

    add-int/lit8 v2, v5, 0x1

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cgn;

    invoke-static {v0, v1}, Lo/cdm;->b(Lo/cgn;Lo/cgn;)F

    move-result v6

    .line 42
    iget-object v0, p0, Lo/cdg;->d:Lo/cde;

    invoke-virtual {v0, v4}, Lo/cde;->b(I)F

    move-result v0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_3

    .line 48
    const/4 v0, 0x0

    return v0

    .line 40
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 52
    :cond_4
    invoke-virtual {p0}, Lo/cdg;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->k()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; GpsTime="

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/cgn;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">>>StartAlgoTriple find start"

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    const/4 v0, 0x1

    return v0

    .line 58
    :cond_5
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

    .line 63
    iget-object v0, p0, Lo/cdg;->b:Ljava/util/LinkedList;

    return-object v0
.end method
