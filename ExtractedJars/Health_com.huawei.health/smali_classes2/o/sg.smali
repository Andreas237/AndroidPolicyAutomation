.class public final Lo/sg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[I

.field private final d:[Lo/ou;

.field private final e:I


# direct methods
.method public constructor <init>(I[IIII)V
    .locals 4

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput p1, p0, Lo/sg;->e:I

    .line 29
    iput-object p2, p0, Lo/sg;->a:[I

    .line 30
    const/4 v0, 0x2

    new-array v0, v0, [Lo/ou;

    new-instance v1, Lo/ou;

    int-to-float v2, p3

    int-to-float v3, p5

    invoke-direct {v1, v2, v3}, Lo/ou;-><init>(FF)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lo/ou;

    int-to-float v2, p4

    int-to-float v3, p5

    invoke-direct {v1, v2, v3}, Lo/ou;-><init>(FF)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/sg;->d:[Lo/ou;

    .line 34
    return-void
.end method


# virtual methods
.method public a()[I
    .locals 1

    .line 41
    iget-object v0, p0, Lo/sg;->a:[I

    return-object v0
.end method

.method public c()[Lo/ou;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/sg;->d:[Lo/ou;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 37
    iget v0, p0, Lo/sg;->e:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 50
    instance-of v0, p1, Lo/sg;

    if-nez v0, :cond_0

    .line 51
    const/4 v0, 0x0

    return v0

    .line 53
    :cond_0
    move-object v2, p1

    check-cast v2, Lo/sg;

    .line 54
    iget v0, p0, Lo/sg;->e:I

    iget v1, v2, Lo/sg;->e:I

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 59
    iget v0, p0, Lo/sg;->e:I

    return v0
.end method
