.class Lo/atg$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atg;->a(JLo/atl;Z)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/atg;

.field final synthetic c:J

.field final synthetic d:Z

.field final synthetic e:Lo/atl;


# direct methods
.method constructor <init>(Lo/atg;ZJLo/atl;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lo/atg$1;->a:Lo/atg;

    iput-boolean p2, p0, Lo/atg$1;->d:Z

    iput-wide p3, p0, Lo/atg$1;->c:J

    iput-object p5, p0, Lo/atg$1;->e:Lo/atl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 102
    iget-boolean v0, p0, Lo/atg$1;->d:Z

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lo/atg$1;->a:Lo/atg;

    iget-wide v1, p0, Lo/atg$1;->c:J

    iget-object v3, p0, Lo/atg$1;->e:Lo/atl;

    invoke-static {v0, v1, v2, v3}, Lo/atg;->d(Lo/atg;JLo/atl;)V

    goto :goto_0

    .line 108
    :cond_0
    iget-object v0, p0, Lo/atg$1;->a:Lo/atg;

    iget-wide v1, p0, Lo/atg$1;->c:J

    iget-object v3, p0, Lo/atg$1;->e:Lo/atl;

    invoke-static {v0, v1, v2, v3}, Lo/atg;->c(Lo/atg;JLo/atl;)V

    .line 110
    :goto_0
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 115
    if-eqz p1, :cond_0

    .line 117
    iget-object v0, p0, Lo/atg$1;->a:Lo/atg;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/atg;->d(Lo/atg;III)V

    .line 119
    :cond_0
    iget-object v0, p0, Lo/atg$1;->e:Lo/atl;

    if-eqz v0, :cond_1

    .line 121
    iget-object v0, p0, Lo/atg$1;->e:Lo/atl;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lo/atl;->d(I)V

    .line 123
    :cond_1
    return-void
.end method
