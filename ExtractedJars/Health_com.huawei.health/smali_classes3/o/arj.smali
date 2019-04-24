.class public Lo/arj;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    return-void
.end method

.method private static c(JLandroid/os/Handler;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLandroid/os/Handler;)Lo/brd<Ljava/lang/Object;>;"
        }
    .end annotation

    .line 61
    new-instance v0, Lo/arj$1;

    invoke-direct {v0, p0, p1, p2}, Lo/arj$1;-><init>(JLandroid/os/Handler;)V

    return-object v0
.end method

.method private c(JZ)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 109
    new-instance v0, Lo/arj$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/arj$2;-><init>(Lo/arj;JZ)V

    return-object v0
.end method


# virtual methods
.method public a(JLandroid/os/Handler;)V
    .locals 2

    .line 49
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2, p3}, Lo/arj;->c(JLandroid/os/Handler;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 50
    return-void
.end method

.method public d(JZ)V
    .locals 5

    .line 128
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ast;->a(J)Lo/axv;

    move-result-object v3

    .line 129
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/apm;->e(J)Z

    move-result v4

    .line 131
    if-eqz v3, :cond_0

    .line 133
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v3}, Lo/axv;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Lo/ast;->b(JLjava/lang/String;)Z

    .line 135
    :cond_0
    if-eqz v4, :cond_1

    .line 138
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/aqx;->d(Ljava/lang/String;)V

    .line 139
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x203

    invoke-static {v1, v2, v0}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 140
    if-eqz p3, :cond_2

    .line 142
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ast;->b(J)Z

    goto :goto_0

    .line 147
    :cond_1
    const-string v0, "AssistantLocalTask"

    const-string v1, "AssistantDetailActivity clearChatRecord error. delete record from DB error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    :cond_2
    :goto_0
    return-void
.end method

.method public e(JZ)V
    .locals 2

    .line 97
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3}, Lo/arj;->c(JZ)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 98
    return-void
.end method
