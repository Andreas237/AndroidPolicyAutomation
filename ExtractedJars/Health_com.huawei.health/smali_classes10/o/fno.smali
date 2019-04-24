.class public final Lo/fno;
.super Lo/fnh;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/fnh;-><init>()V

    return-void
.end method

.method private d(I)V
    .locals 3

    .line 52
    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 53
    new-instance v0, Lo/flm;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Message has invalid version: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/flm;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_0
    return-void
.end method


# virtual methods
.method protected d(Lo/fpq;)Lo/fnf;
    .locals 13

    .line 39
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lo/fpq;->c(I)I

    move-result v7

    .line 40
    invoke-direct {p0, v7}, Lo/fno;->d(I)V

    .line 41
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lo/fpq;->c(I)I

    move-result v8

    .line 42
    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lo/fpq;->c(I)I

    move-result v9

    .line 43
    invoke-static {v9}, Lo/fno;->c(I)V

    .line 44
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lo/fpq;->c(I)I

    move-result v10

    .line 45
    const/16 v0, 0x10

    invoke-virtual {p1, v0}, Lo/fpq;->c(I)I

    move-result v11

    .line 46
    invoke-virtual {p1, v9}, Lo/fpq;->d(I)[B

    move-result-object v0

    invoke-static {v0}, Lo/flz;->c([B)Lo/flz;

    move-result-object v12

    .line 48
    new-instance v0, Lo/fnf;

    invoke-static {v8}, Lo/flj$e;->b(I)Lo/flj$e;

    move-result-object v2

    move v1, v7

    move-object v3, v12

    move v4, v10

    move v5, v11

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lo/fnf;-><init>(ILo/flj$e;Lo/flz;III)V

    return-object v0
.end method
