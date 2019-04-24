.class public Lo/ccz;
.super Lo/ccw;
.source "SourceFile"


# instance fields
.field private d:Ljava/util/LinkedList;
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
    invoke-direct {p0, p1}, Lo/ccw;-><init>(Lo/cdk;)V

    .line 14
    invoke-virtual {p0}, Lo/ccz;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->d()Lo/cde;

    move-result-object v0

    iput-object v0, p0, Lo/ccz;->e:Lo/cde;

    .line 15
    return-void
.end method


# virtual methods
.method public a(Lo/cgn;)I
    .locals 6

    .line 20
    invoke-virtual {p0}, Lo/ccz;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->f()I

    move-result v3

    .line 27
    invoke-virtual {p0}, Lo/ccz;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->c()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lo/ccz;->d:Ljava/util/LinkedList;

    .line 28
    iget-object v0, p0, Lo/ccz;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 29
    const/4 v0, 0x2

    return v0

    .line 32
    :cond_0
    iget-object v0, p0, Lo/ccz;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cgn;

    .line 33
    invoke-static {v4, p1}, Lo/cdm;->b(Lo/cgn;Lo/cgn;)F

    move-result v5

    .line 36
    iget-object v0, p0, Lo/ccz;->e:Lo/cde;

    invoke-virtual {v0, v3}, Lo/cde;->b(I)F

    move-result v0

    cmpl-float v0, v5, v0

    if-gtz v0, :cond_1

    .line 37
    invoke-virtual {p1}, Lo/cgn;->g()F

    move-result v0

    iget-object v1, p0, Lo/ccz;->e:Lo/cde;

    invoke-virtual {v1}, Lo/cde;->k()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    iget-object v0, p0, Lo/ccz;->e:Lo/cde;

    .line 38
    invoke-virtual {v0}, Lo/cde;->i()F

    move-result v0

    invoke-virtual {p1}, Lo/cgn;->g()F

    move-result v1

    mul-float/2addr v0, v1

    cmpl-float v0, v5, v0

    if-lez v0, :cond_2

    .line 39
    :cond_1
    invoke-virtual {p0}, Lo/ccz;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->k()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; GpsTime="

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/cgn;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",GpsSpeed="

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/cgn;->g()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",speed="

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">>>FilterAlgoOverSpeed"

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    const/4 v0, 0x1

    return v0

    .line 46
    :cond_2
    const/4 v0, 0x2

    return v0
.end method
