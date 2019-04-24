.class public Lo/cqw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 11
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 12
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 14
    :cond_1
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 15
    invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 17
    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 18
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;)V
    .locals 1

    .line 22
    invoke-static {p0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    invoke-virtual {v0}, Lo/cqz;->e()V

    .line 23
    invoke-static {p0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    invoke-virtual {v0}, Lo/cqy;->c()V

    .line 24
    invoke-static {p0}, Lo/crc;->b(Landroid/content/Context;)Lo/crc;

    move-result-object v0

    invoke-virtual {v0}, Lo/crc;->d()V

    .line 25
    invoke-static {p0}, Lo/cqx;->d(Landroid/content/Context;)Lo/cqx;

    move-result-object v0

    invoke-virtual {v0}, Lo/cqx;->d()V

    .line 26
    invoke-static {}, Lo/cqr;->a()Lo/cqr;

    move-result-object v0

    invoke-virtual {v0}, Lo/cqr;->e()V

    .line 27
    return-void
.end method
