.class Lo/aot$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aot;->c(IJJZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lo/aot;

.field final synthetic c:I

.field final synthetic d:Z

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/aot;JJZI)V
    .locals 0

    .line 258
    iput-object p1, p0, Lo/aot$3;->b:Lo/aot;

    iput-wide p2, p0, Lo/aot$3;->a:J

    iput-wide p4, p0, Lo/aot$3;->e:J

    iput-boolean p6, p0, Lo/aot$3;->d:Z

    iput p7, p0, Lo/aot$3;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 262
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/aot$3$5;

    invoke-direct {v1, p0}, Lo/aot$3$5;-><init>(Lo/aot$3;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 276
    return-void
.end method

.method public e(II)V
    .locals 3

    .line 281
    move v2, p1

    .line 282
    if-nez v2, :cond_0

    .line 284
    move v2, p2

    .line 286
    :cond_0
    iget-object v0, p0, Lo/aot$3;->b:Lo/aot;

    invoke-static {v0, v2}, Lo/aot;->c(Lo/aot;I)V

    .line 287
    const-string v0, "FollowPublicUserTask"

    const-string v1, "followPublicUser onLoginError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    return-void
.end method
