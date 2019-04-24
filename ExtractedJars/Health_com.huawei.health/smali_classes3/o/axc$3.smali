.class final Lo/axc$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axc;->b(Lo/axc;IJLjava/lang/String;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/axc;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/axc;IJLjava/lang/String;)V
    .locals 0

    .line 293
    iput-object p1, p0, Lo/axc$3;->b:Lo/axc;

    iput p2, p0, Lo/axc$3;->c:I

    iput-wide p3, p0, Lo/axc$3;->e:J

    iput-object p5, p0, Lo/axc$3;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 297
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/axc$3;->b:Lo/axc;

    iget v2, p0, Lo/axc$3;->c:I

    iget-wide v3, p0, Lo/axc$3;->e:J

    iget-object v5, p0, Lo/axc$3;->d:Ljava/lang/String;

    invoke-static {v1, v2, v3, v4, v5}, Lo/axc;->e(Lo/axc;IJLjava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 298
    return-void
.end method

.method public e(II)V
    .locals 6

    .line 303
    iget-object v0, p0, Lo/axc$3;->b:Lo/axc;

    iget v1, p0, Lo/axc$3;->c:I

    move v3, p1

    move v4, p2

    const/16 v2, 0x6b

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/axc;->e(Lo/axc;IIIILjava/lang/Object;)V

    .line 304
    return-void
.end method
