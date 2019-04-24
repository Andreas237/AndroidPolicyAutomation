.class public Lo/efr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:F

.field public c:F

.field public e:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p1, p1}, Lo/efr;-><init>(FFF)V

    .line 23
    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Lo/efr;->a:F

    .line 27
    iput p2, p0, Lo/efr;->e:F

    .line 28
    iput p3, p0, Lo/efr;->c:F

    .line 29
    return-void
.end method


# virtual methods
.method public a(Lo/efr;)Lo/efr;
    .locals 3

    .line 32
    new-instance v2, Lo/efr;

    invoke-direct {v2}, Lo/efr;-><init>()V

    .line 33
    iget v0, p0, Lo/efr;->a:F

    iget v1, p1, Lo/efr;->a:F

    add-float/2addr v0, v1

    iput v0, v2, Lo/efr;->a:F

    .line 34
    iget v0, p0, Lo/efr;->e:F

    iget v1, p1, Lo/efr;->e:F

    add-float/2addr v0, v1

    iput v0, v2, Lo/efr;->e:F

    .line 35
    iget v0, p0, Lo/efr;->c:F

    iget v1, p1, Lo/efr;->c:F

    add-float/2addr v0, v1

    iput v0, v2, Lo/efr;->c:F

    .line 36
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Vec3{x="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/efr;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", y="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/efr;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", z="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/efr;->c:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
