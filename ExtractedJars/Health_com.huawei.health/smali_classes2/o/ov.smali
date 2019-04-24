.class public final Lo/ov;
.super Lo/qw;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final c:Z

.field private final d:I


# direct methods
.method public constructor <init>(Lo/qr;[Lo/ou;ZII)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Lo/qw;-><init>(Lo/qr;[Lo/ou;)V

    .line 35
    iput-boolean p3, p0, Lo/ov;->c:Z

    .line 36
    iput p4, p0, Lo/ov;->a:I

    .line 37
    iput p5, p0, Lo/ov;->d:I

    .line 38
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 41
    iget v0, p0, Lo/ov;->d:I

    return v0
.end method

.method public b()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lo/ov;->c:Z

    return v0
.end method

.method public e()I
    .locals 1

    .line 45
    iget v0, p0, Lo/ov;->a:I

    return v0
.end method
