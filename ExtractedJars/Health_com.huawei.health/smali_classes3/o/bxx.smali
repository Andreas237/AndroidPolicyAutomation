.class public Lo/bxx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private c:F

.field private d:F

.field private e:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 0

    .line 26
    iput p1, p0, Lo/bxx;->d:F

    .line 27
    return-void
.end method

.method public b()F
    .locals 1

    .line 38
    iget v0, p0, Lo/bxx;->e:F

    return v0
.end method

.method public b(F)V
    .locals 0

    .line 34
    iput p1, p0, Lo/bxx;->c:F

    .line 35
    return-void
.end method

.method public c()F
    .locals 1

    .line 14
    iget v0, p0, Lo/bxx;->a:F

    return v0
.end method

.method public d()F
    .locals 1

    .line 22
    iget v0, p0, Lo/bxx;->d:F

    return v0
.end method

.method public d(F)V
    .locals 0

    .line 18
    iput p1, p0, Lo/bxx;->a:F

    .line 19
    return-void
.end method

.method public e()F
    .locals 1

    .line 30
    iget v0, p0, Lo/bxx;->c:F

    return v0
.end method

.method public e(F)V
    .locals 0

    .line 42
    iput p1, p0, Lo/bxx;->e:F

    .line 43
    return-void
.end method
