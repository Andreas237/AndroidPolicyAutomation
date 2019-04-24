.class final Lo/te;
.super Lo/tg;
.source "SourceFile"


# instance fields
.field private final d:C


# direct methods
.method constructor <init>(IC)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lo/tg;-><init>(I)V

    .line 41
    iput-char p2, p0, Lo/te;->d:C

    .line 42
    return-void
.end method


# virtual methods
.method a()Z
    .locals 2

    .line 49
    iget-char v0, p0, Lo/te;->d:C

    const/16 v1, 0x24

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method b()C
    .locals 1

    .line 45
    iget-char v0, p0, Lo/te;->d:C

    return v0
.end method
