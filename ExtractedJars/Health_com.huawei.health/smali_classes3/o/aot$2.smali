.class Lo/aot$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aot;->b(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic c:J

.field final synthetic d:Lo/aot;


# direct methods
.method constructor <init>(Lo/aot;JJ)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/aot$2;->d:Lo/aot;

    iput-wide p2, p0, Lo/aot$2;->a:J

    iput-wide p4, p0, Lo/aot$2;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 106
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/aot$2$2;

    invoke-direct {v1, p0}, Lo/aot$2$2;-><init>(Lo/aot$2;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 125
    return-void
.end method

.method public e(II)V
    .locals 3

    .line 130
    move v2, p1

    .line 131
    if-nez v2, :cond_0

    .line 133
    move v2, p2

    .line 135
    :cond_0
    iget-object v0, p0, Lo/aot$2;->d:Lo/aot;

    invoke-static {v0, v2}, Lo/aot;->b(Lo/aot;I)V

    .line 136
    const-string v0, "FollowPublicUserTask"

    const-string v1, "unfollowPublicUser onLoginError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    return-void
.end method
