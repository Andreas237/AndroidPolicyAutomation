.class public final Lo/fnm;
.super Lo/fnh;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lo/fnh;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/fpq;)Lo/fnf;
    .locals 12

    .line 42
    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lo/fpq;->c(I)I

    move-result v7

    .line 43
    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lo/fpq;->c(I)I

    move-result v8

    .line 44
    const/4 v9, 0x0

    .line 45
    invoke-static {v8}, Lo/fnm;->c(I)V

    .line 47
    const/16 v0, 0xd

    if-ne v7, v0, :cond_0

    .line 48
    const/4 v9, 0x1

    goto :goto_0

    .line 49
    :cond_0
    const/16 v0, 0xe

    if-ne v7, v0, :cond_1

    .line 50
    const/4 v9, 0x2

    goto :goto_0

    .line 51
    :cond_1
    const/16 v0, 0xf

    if-ne v7, v0, :cond_2

    .line 52
    const/4 v9, 0x4

    .line 54
    :cond_2
    :goto_0
    invoke-virtual {p1, v9}, Lo/fpq;->d(I)[B

    .line 55
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lo/fpq;->c(I)I

    move-result v10

    .line 56
    invoke-virtual {p1, v8}, Lo/fpq;->d(I)[B

    move-result-object v0

    invoke-static {v0}, Lo/flz;->c([B)Lo/flz;

    move-result-object v11

    .line 59
    new-instance v0, Lo/fnf;

    sget-object v2, Lo/flj$e;->c:Lo/flj$e;

    const/4 v1, 0x1

    move-object v3, v11

    move v4, v10

    const/4 v5, -0x1

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lo/fnf;-><init>(ILo/flj$e;Lo/flz;III)V

    return-object v0
.end method
