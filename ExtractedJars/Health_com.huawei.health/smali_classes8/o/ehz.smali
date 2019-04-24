.class public Lo/ehz;
.super Lo/eiw;
.source "SourceFile"


# instance fields
.field protected c:F

.field protected d:F


# direct methods
.method public constructor <init>(F)V
    .locals 1

    .line 20
    invoke-direct {p0}, Lo/eiw;-><init>()V

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lo/ehz;->c:F

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lo/ehz;->d:F

    .line 21
    iput p1, p0, Lo/ehz;->c:F

    .line 22
    return-void
.end method

.method public constructor <init>(FF)V
    .locals 1

    .line 15
    invoke-direct {p0}, Lo/eiw;-><init>()V

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lo/ehz;->c:F

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lo/ehz;->d:F

    .line 16
    iput p1, p0, Lo/ehz;->c:F

    .line 17
    iput p2, p0, Lo/ehz;->d:F

    .line 18
    return-void
.end method


# virtual methods
.method public c()F
    .locals 1

    .line 25
    iget v0, p0, Lo/ehz;->c:F

    return v0
.end method

.method public d()F
    .locals 1

    .line 33
    iget v0, p0, Lo/ehz;->d:F

    return v0
.end method

.method public e(F)V
    .locals 0

    .line 29
    iput p1, p0, Lo/ehz;->c:F

    .line 30
    return-void
.end method
