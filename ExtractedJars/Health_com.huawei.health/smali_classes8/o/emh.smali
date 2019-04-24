.class public Lo/emh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejn;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/emi;Lo/elb;)V
    .locals 4

    .line 22
    invoke-virtual {p2}, Lo/elb;->e()Lo/eit$b;

    move-result-object v2

    .line 23
    invoke-virtual {p1, v2}, Lo/emi;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    new-instance v1, Lo/emh$4;

    invoke-direct {v1, p0}, Lo/emh$4;-><init>(Lo/emh;)V

    invoke-virtual {v0, v1}, Lo/eim;->e(Lo/eim$e;)V

    .line 31
    invoke-virtual {p1, v2}, Lo/emi;->a(Lo/eit$b;)Lo/eit;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->b(Lo/mf;)V

    .line 33
    invoke-virtual {p1, v2}, Lo/emi;->e(Lo/eit$b;)Lo/eid;

    move-result-object v3

    .line 35
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/eid;->b(Z)V

    .line 37
    invoke-virtual {v3, p0}, Lo/eid;->c(Lo/ejn;)V

    .line 38
    return-void
.end method
