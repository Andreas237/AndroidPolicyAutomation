.class public final Lo/oj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/qr;

.field private final b:Lo/ob;


# direct methods
.method public constructor <init>(Lo/ob;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    if-nez p1, :cond_0

    .line 35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Binarizer must be non-null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_0
    iput-object p1, p0, Lo/oj;->b:Lo/ob;

    .line 38
    return-void
.end method


# virtual methods
.method public a(ILo/qm;)Lo/qm;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lo/oj;->b:Lo/ob;

    invoke-virtual {v0, p1, p2}, Lo/ob;->a(ILo/qm;)Lo/qm;

    move-result-object v0

    return-object v0
.end method

.method public a()Z
    .locals 1

    .line 116
    iget-object v0, p0, Lo/oj;->b:Lo/ob;

    invoke-virtual {v0}, Lo/ob;->a()Lo/om;

    move-result-object v0

    invoke-virtual {v0}, Lo/om;->isRotateSupported()Z

    move-result v0

    return v0
.end method

.method public b()Lo/oj;
    .locals 3

    .line 126
    iget-object v0, p0, Lo/oj;->b:Lo/ob;

    invoke-virtual {v0}, Lo/ob;->a()Lo/om;

    move-result-object v0

    invoke-virtual {v0}, Lo/om;->rotateCounterClockwise()Lo/om;

    move-result-object v2

    .line 127
    new-instance v0, Lo/oj;

    iget-object v1, p0, Lo/oj;->b:Lo/ob;

    invoke-virtual {v1, v2}, Lo/ob;->d(Lo/om;)Lo/ob;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/oj;-><init>(Lo/ob;)V

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 44
    iget-object v0, p0, Lo/oj;->b:Lo/ob;

    invoke-virtual {v0}, Lo/ob;->e()I

    move-result v0

    return v0
.end method

.method public d()Lo/qr;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lo/oj;->a:Lo/qr;

    if-nez v0, :cond_0

    .line 85
    iget-object v0, p0, Lo/oj;->b:Lo/ob;

    invoke-virtual {v0}, Lo/ob;->b()Lo/qr;

    move-result-object v0

    iput-object v0, p0, Lo/oj;->a:Lo/qr;

    .line 87
    :cond_0
    iget-object v0, p0, Lo/oj;->a:Lo/qr;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 51
    iget-object v0, p0, Lo/oj;->b:Lo/ob;

    invoke-virtual {v0}, Lo/ob;->d()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 144
    :try_start_0
    invoke-virtual {p0}, Lo/oj;->d()Lo/qr;

    move-result-object v0

    invoke-virtual {v0}, Lo/qr;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lo/oo; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 145
    :catch_0
    move-exception v1

    .line 146
    const-string v0, ""

    return-object v0
.end method
