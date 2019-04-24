.class public Lo/ehj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Lo/eii<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;>Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/eih;Lo/eic;Lo/ekd;)V
    .locals 2

    .line 33
    invoke-virtual {p2}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 34
    sget-object v0, Lo/eix;->c:Lo/eix;

    invoke-virtual {p1, v0, p3}, Lo/eih;->d(Lo/eix;Lo/ekd;)V

    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p2}, Lo/eic;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 36
    sget-object v0, Lo/eix;->a:Lo/eix;

    invoke-virtual {p1, v0, p3}, Lo/eih;->d(Lo/eix;Lo/ekd;)V

    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p2}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 38
    sget-object v0, Lo/eix;->d:Lo/eix;

    invoke-virtual {p1, v0, p3}, Lo/eih;->d(Lo/eix;Lo/ekd;)V

    goto :goto_0

    .line 39
    :cond_2
    invoke-virtual {p2}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 40
    sget-object v0, Lo/eix;->e:Lo/eix;

    invoke-virtual {p1, v0, p3}, Lo/eih;->d(Lo/eix;Lo/ekd;)V

    goto :goto_0

    .line 41
    :cond_3
    invoke-virtual {p2}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 42
    sget-object v0, Lo/eix;->f:Lo/eix;

    invoke-virtual {p1, v0, p3}, Lo/eih;->d(Lo/eix;Lo/ekd;)V

    goto :goto_0

    .line 44
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "enableScroll dataType not support"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 47
    :goto_0
    return-void
.end method
