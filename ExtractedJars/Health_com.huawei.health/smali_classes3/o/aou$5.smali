.class final Lo/aou$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aou;->c(Landroid/os/Handler;Ljava/lang/String;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Landroid/os/Handler;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/os/Handler;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lo/aou$5;->e:Ljava/lang/String;

    iput-object p2, p0, Lo/aou$5;->c:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 45
    invoke-virtual {p0, p1}, Lo/aou$5;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 49
    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    iget-object v1, p0, Lo/aou$5;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/apg;->e(Ljava/lang/String;)J

    move-result-wide v4

    .line 50
    const-wide/16 v0, -0x1

    cmp-long v0, v4, v0

    if-nez v0, :cond_0

    .line 52
    const-string v0, "AssistantUtil"

    const-string v1, "publicUID is -1, assist is not exist"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 55
    :cond_0
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lo/ast;->a(J)Lo/axv;

    move-result-object v6

    .line 56
    if-eqz v6, :cond_1

    .line 58
    invoke-virtual {v6}, Lo/axv;->m()I

    move-result v0

    if-lez v0, :cond_1

    .line 60
    iget-object v0, p0, Lo/aou$5;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/aou$5;->c:Landroid/os/Handler;

    .line 61
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 60
    const/16 v3, 0x131

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 64
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
