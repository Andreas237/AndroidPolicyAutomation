.class final Lo/axc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axc;->a(Lo/axc;IJIZ)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/axc;

.field final synthetic b:I

.field final synthetic c:Z

.field final synthetic d:J

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/axc;JIIZ)V
    .locals 0

    .line 163
    iput-object p1, p0, Lo/axc$2;->a:Lo/axc;

    iput-wide p2, p0, Lo/axc$2;->d:J

    iput p4, p0, Lo/axc$2;->b:I

    iput p5, p0, Lo/axc$2;->e:I

    iput-boolean p6, p0, Lo/axc$2;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 167
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/axc$2;->a:Lo/axc;

    iget-wide v2, p0, Lo/axc$2;->d:J

    iget v4, p0, Lo/axc$2;->b:I

    iget v5, p0, Lo/axc$2;->e:I

    iget-boolean v6, p0, Lo/axc$2;->c:Z

    invoke-static/range {v1 .. v6}, Lo/axc;->d(Lo/axc;JIIZ)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 168
    return-void
.end method

.method public e(II)V
    .locals 6

    .line 173
    iget-object v0, p0, Lo/axc$2;->a:Lo/axc;

    iget v1, p0, Lo/axc$2;->b:I

    const/16 v2, 0x6a

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/axc;->e(Lo/axc;IIIILjava/lang/Object;)V

    .line 174
    return-void
.end method
