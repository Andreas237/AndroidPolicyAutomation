.class public Lo/ccv;
.super Lo/ccw;
.source "SourceFile"


# instance fields
.field private a:Lo/cde;


# direct methods
.method public constructor <init>(Lo/cdk;)V
    .locals 1

    .line 9
    invoke-direct {p0, p1}, Lo/ccw;-><init>(Lo/cdk;)V

    .line 10
    invoke-virtual {p0}, Lo/ccv;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->d()Lo/cde;

    move-result-object v0

    iput-object v0, p0, Lo/ccv;->a:Lo/cde;

    .line 11
    return-void
.end method


# virtual methods
.method public a(Lo/cgn;)I
    .locals 3

    .line 15
    invoke-virtual {p1}, Lo/cgn;->a()F

    move-result v0

    iget-object v1, p0, Lo/ccv;->a:Lo/cde;

    invoke-virtual {v1}, Lo/cde;->d()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 16
    const/4 v0, 0x2

    return v0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lo/ccv;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->k()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; GpsTime="

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/cgn;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",acc="

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/cgn;->a()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">>>FilterAlgoAcc"

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    const/4 v0, 0x1

    return v0
.end method
