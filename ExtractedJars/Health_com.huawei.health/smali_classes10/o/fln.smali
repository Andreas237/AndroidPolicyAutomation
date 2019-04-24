.class public Lo/fln;
.super Lo/flm;
.source "SourceFile"


# instance fields
.field private final c:Z

.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZ)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lo/flm;-><init>(Ljava/lang/String;)V

    .line 44
    iput p2, p0, Lo/fln;->e:I

    .line 45
    iput p3, p0, Lo/fln;->d:I

    .line 46
    iput-boolean p4, p0, Lo/fln;->c:Z

    .line 47
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 63
    iget v0, p0, Lo/fln;->e:I

    return v0
.end method

.method public final b()Z
    .locals 2

    .line 56
    iget v0, p0, Lo/fln;->e:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lo/fln;->c:Z

    return v0
.end method
