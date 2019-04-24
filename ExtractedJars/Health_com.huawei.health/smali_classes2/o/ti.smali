.class final Lo/ti;
.super Lo/tg;
.source "SourceFile"


# instance fields
.field private final c:I

.field private final d:I


# direct methods
.method constructor <init>(III)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 43
    invoke-direct {p0, p1}, Lo/tg;-><init>(I)V

    .line 45
    if-ltz p2, :cond_0

    const/16 v0, 0xa

    if-gt p2, v0, :cond_0

    if-ltz p3, :cond_0

    const/16 v0, 0xa

    if-le p3, v0, :cond_1

    .line 46
    :cond_0
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 49
    :cond_1
    iput p2, p0, Lo/ti;->d:I

    .line 50
    iput p3, p0, Lo/ti;->c:I

    .line 51
    return-void
.end method


# virtual methods
.method a()Z
    .locals 2

    .line 66
    iget v0, p0, Lo/ti;->d:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method c()I
    .locals 1

    .line 58
    iget v0, p0, Lo/ti;->c:I

    return v0
.end method

.method d()I
    .locals 1

    .line 54
    iget v0, p0, Lo/ti;->d:I

    return v0
.end method

.method e()Z
    .locals 2

    .line 70
    iget v0, p0, Lo/ti;->c:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
