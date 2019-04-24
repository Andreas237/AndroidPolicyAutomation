.class public Lo/faz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public b:F

.field public c:I

.field public d:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lo/faz;->d:F

    .line 14
    iput p2, p0, Lo/faz;->b:F

    .line 15
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 38
    iget v0, p0, Lo/faz;->b:F

    return v0
.end method

.method public c(F)V
    .locals 0

    .line 34
    iput p1, p0, Lo/faz;->b:F

    .line 35
    return-void
.end method

.method public d(F)V
    .locals 0

    .line 26
    iput p1, p0, Lo/faz;->d:F

    .line 27
    return-void
.end method

.method public e()F
    .locals 1

    .line 30
    iget v0, p0, Lo/faz;->d:F

    return v0
.end method
