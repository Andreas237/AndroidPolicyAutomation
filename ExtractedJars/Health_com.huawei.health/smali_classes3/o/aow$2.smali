.class Lo/aow$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aow;->d(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/aow;


# direct methods
.method constructor <init>(Lo/aow;)V
    .locals 0

    .line 675
    iput-object p1, p0, Lo/aow$2;->c:Lo/aow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 675
    invoke-virtual {p0, p1}, Lo/aow$2;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 679
    const/4 v2, 0x0

    .line 680
    new-instance v3, Lo/bca;

    invoke-direct {v3}, Lo/bca;-><init>()V

    .line 681
    invoke-virtual {v3}, Lo/bca;->m()J

    move-result-wide v4

    .line 682
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-eqz v0, :cond_2

    .line 684
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v6, v0, v4

    .line 685
    const-wide/32 v0, 0x5265c00

    cmp-long v0, v6, v0

    if-gez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-gez v0, :cond_1

    .line 687
    :cond_0
    const/4 v2, 0x1

    .line 689
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 690
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/bca;->c(Ljava/lang/Long;)V

    .line 692
    :cond_1
    goto :goto_0

    .line 696
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 697
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/bca;->c(Ljava/lang/Long;)V

    .line 700
    :goto_0
    if-eqz v2, :cond_3

    .line 703
    iget-object v0, p0, Lo/aow$2;->c:Lo/aow;

    invoke-static {v0}, Lo/aow;->c(Lo/aow;)V

    .line 705
    :cond_3
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
