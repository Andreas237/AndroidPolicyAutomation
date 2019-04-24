.class public Lo/bgc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/axv;)I
    .locals 1

    .line 45
    invoke-virtual {p1}, Lo/axv;->f()I

    move-result v0

    return v0
.end method

.method public b(Lo/axv;)Z
    .locals 2

    .line 27
    invoke-virtual {p1}, Lo/axv;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "0"

    invoke-virtual {p1}, Lo/axv;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 29
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 33
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public c(Lo/axv;)I
    .locals 1

    .line 56
    invoke-virtual {p1}, Lo/axv;->m()I

    move-result v0

    return v0
.end method

.method public d(Lo/axv;)V
    .locals 3

    .line 78
    invoke-virtual {p1}, Lo/axv;->i()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 79
    invoke-virtual {p1}, Lo/axv;->l()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 80
    invoke-virtual {p1}, Lo/axv;->l()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 81
    invoke-virtual {p1}, Lo/axv;->l()I

    move-result v0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    .line 83
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {p1}, Lo/axv;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/apm;->g(J)V

    .line 85
    :cond_0
    return-void
.end method

.method public e(Lo/axv;)I
    .locals 1

    .line 67
    invoke-virtual {p1}, Lo/axv;->n()I

    move-result v0

    return v0
.end method
