.class public Lo/azk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e()Ljava/lang/String;
    .locals 7

    .line 20
    const-wide/16 v2, -0x1

    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v5

    .line 23
    if-eqz v5, :cond_0

    .line 25
    invoke-virtual {v5}, Lo/axr;->b()J

    move-result-wide v2

    .line 26
    invoke-virtual {v5}, Lo/axr;->c()I

    move-result v4

    .line 28
    :cond_0
    invoke-static {v2, v3, v4}, Lo/bpd;->c(JI)Ljava/lang/String;

    move-result-object v6

    .line 29
    return-object v6
.end method
