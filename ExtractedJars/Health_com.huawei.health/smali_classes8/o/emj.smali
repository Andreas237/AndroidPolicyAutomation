.class public Lo/emj;
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
    invoke-virtual {p1, v2}, Lo/emi;->e(Lo/eit$b;)Lo/eid;

    move-result-object v3

    .line 26
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/eid;->b(Z)V

    .line 28
    invoke-virtual {p1, v2}, Lo/emi;->a(Lo/eit$b;)Lo/eit;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->b(Lo/mf;)V

    .line 30
    invoke-virtual {v3, p0}, Lo/eid;->c(Lo/ejn;)V

    .line 31
    return-void
.end method
