.class public Lo/fkd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:I

.field private d:J

.field private e:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput v0, p0, Lo/fkd;->c:I

    .line 18
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 44
    iget v0, p0, Lo/fkd;->c:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 47
    iput p1, p0, Lo/fkd;->c:I

    .line 48
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 41
    iput-wide p1, p0, Lo/fkd;->d:J

    .line 42
    return-void
.end method

.method public c()F
    .locals 1

    .line 26
    iget v0, p0, Lo/fkd;->e:F

    return v0
.end method

.method public c(F)V
    .locals 0

    .line 35
    iput p1, p0, Lo/fkd;->b:F

    .line 36
    return-void
.end method

.method public d()J
    .locals 2

    .line 38
    iget-wide v0, p0, Lo/fkd;->d:J

    return-wide v0
.end method

.method public d(F)V
    .locals 0

    .line 23
    iput p1, p0, Lo/fkd;->a:F

    .line 24
    return-void
.end method

.method public e()F
    .locals 1

    .line 20
    iget v0, p0, Lo/fkd;->a:F

    return v0
.end method

.method public e(F)V
    .locals 0

    .line 29
    iput p1, p0, Lo/fkd;->e:F

    .line 30
    return-void
.end method
