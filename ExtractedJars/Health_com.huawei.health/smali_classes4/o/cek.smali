.class public Lo/cek;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private b:J

.field private c:F

.field private d:I

.field private e:F


# direct methods
.method public constructor <init>(FFJI)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput p1, p0, Lo/cek;->e:F

    .line 38
    iput p2, p0, Lo/cek;->c:F

    .line 39
    iput-wide p3, p0, Lo/cek;->b:J

    .line 40
    iput p5, p0, Lo/cek;->d:I

    .line 42
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 73
    iget v0, p0, Lo/cek;->d:I

    return v0
.end method

.method public d()J
    .locals 2

    .line 69
    iget-wide v0, p0, Lo/cek;->b:J

    return-wide v0
.end method

.method public e()F
    .locals 1

    .line 77
    iget v0, p0, Lo/cek;->e:F

    return v0
.end method
