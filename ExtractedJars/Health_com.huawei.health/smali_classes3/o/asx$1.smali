.class final Lo/asx$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asx;->d(Lo/asx;IJZZ)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:I

.field final synthetic c:Lo/asx;

.field final synthetic d:Z

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/asx;IJZZ)V
    .locals 0

    .line 195
    iput-object p1, p0, Lo/asx$1;->c:Lo/asx;

    iput p2, p0, Lo/asx$1;->b:I

    iput-wide p3, p0, Lo/asx$1;->e:J

    iput-boolean p5, p0, Lo/asx$1;->d:Z

    iput-boolean p6, p0, Lo/asx$1;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 199
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/asx$1;->c:Lo/asx;

    iget v2, p0, Lo/asx$1;->b:I

    iget-wide v3, p0, Lo/asx$1;->e:J

    iget-boolean v5, p0, Lo/asx$1;->d:Z

    iget-boolean v6, p0, Lo/asx$1;->a:Z

    invoke-static/range {v1 .. v6}, Lo/asx;->b(Lo/asx;IJZZ)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 200
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 205
    if-eqz p1, :cond_0

    .line 207
    iget-object v0, p0, Lo/asx$1;->c:Lo/asx;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/asx;->e(Lo/asx;III)V

    .line 209
    :cond_0
    return-void
.end method
