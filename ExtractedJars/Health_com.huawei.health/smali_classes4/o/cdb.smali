.class public Lo/cdb;
.super Lo/ccw;
.source "SourceFile"


# instance fields
.field private a:Lo/cde;

.field private c:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<Lo/cgn;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/cdk;)V
    .locals 1

    .line 13
    invoke-direct {p0, p1}, Lo/ccw;-><init>(Lo/cdk;)V

    .line 14
    invoke-virtual {p0}, Lo/cdb;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->d()Lo/cde;

    move-result-object v0

    iput-object v0, p0, Lo/cdb;->a:Lo/cde;

    .line 15
    return-void
.end method


# virtual methods
.method public a(Lo/cgn;)I
    .locals 7

    .line 19
    invoke-virtual {p0}, Lo/cdb;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->c()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lo/cdb;->c:Ljava/util/LinkedList;

    .line 20
    iget-object v0, p0, Lo/cdb;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 21
    const/4 v0, 0x2

    return v0

    .line 24
    :cond_0
    iget-object v0, p0, Lo/cdb;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cgn;

    .line 26
    invoke-virtual {p1}, Lo/cgn;->c()J

    move-result-wide v0

    invoke-virtual {v4}, Lo/cgn;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    double-to-float v5, v0

    .line 27
    invoke-static {v4, p1}, Lo/cdm;->a(Lo/cgn;Lo/cgn;)F

    move-result v6

    .line 30
    iget-object v0, p0, Lo/cdb;->a:Lo/cde;

    invoke-virtual {v0}, Lo/cde;->e()F

    move-result v0

    cmpg-float v0, v6, v0

    if-gez v0, :cond_1

    .line 31
    invoke-virtual {p0}, Lo/cdb;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->k()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; GpsTime="

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/cgn;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",timeInterval="

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",disInterval="

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">>>FilterAlgoShortDis"

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    const/4 v0, 0x1

    return v0

    .line 39
    :cond_1
    const/4 v0, 0x2

    return v0
.end method
