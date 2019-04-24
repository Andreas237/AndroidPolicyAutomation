.class public Lo/ekc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lo/eix;Lo/eih;Lo/ekd;)Lo/eih$h;
    .locals 2

    .line 15
    sget-object v0, Lo/eix;->c:Lo/eix;

    if-ne p0, v0, :cond_0

    .line 16
    new-instance v0, Lo/eka;

    invoke-direct {v0, p1, p2}, Lo/eka;-><init>(Lo/eih;Lo/ekd;)V

    return-object v0

    .line 17
    :cond_0
    sget-object v0, Lo/eix;->a:Lo/eix;

    if-ne p0, v0, :cond_1

    .line 18
    new-instance v0, Lo/ejz;

    invoke-direct {v0, p1, p2}, Lo/ejz;-><init>(Lo/eih;Lo/ekd;)V

    return-object v0

    .line 19
    :cond_1
    sget-object v0, Lo/eix;->d:Lo/eix;

    if-ne p0, v0, :cond_2

    .line 20
    new-instance v0, Lo/ekb;

    invoke-direct {v0, p1, p2}, Lo/ekb;-><init>(Lo/eih;Lo/ekd;)V

    return-object v0

    .line 21
    :cond_2
    sget-object v0, Lo/eix;->e:Lo/eix;

    if-ne p0, v0, :cond_3

    .line 22
    new-instance v0, Lo/ekf;

    invoke-direct {v0, p1, p2}, Lo/ekf;-><init>(Lo/eih;Lo/ekd;)V

    return-object v0

    .line 23
    :cond_3
    sget-object v0, Lo/eix;->f:Lo/eix;

    if-ne p0, v0, :cond_4

    .line 24
    new-instance v0, Lo/ejy;

    invoke-direct {v0, p1, p2}, Lo/ejy;-><init>(Lo/eih;Lo/ekd;)V

    return-object v0

    .line 26
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "getAdapter unknown type"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
