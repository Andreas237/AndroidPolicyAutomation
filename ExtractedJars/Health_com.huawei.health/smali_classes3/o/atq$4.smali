.class Lo/atq$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atq;->c(IJLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:J

.field final synthetic d:I

.field final synthetic e:Lo/atq;


# direct methods
.method constructor <init>(Lo/atq;JLjava/lang/String;I)V
    .locals 0

    .line 136
    iput-object p1, p0, Lo/atq$4;->e:Lo/atq;

    iput-wide p2, p0, Lo/atq$4;->c:J

    iput-object p4, p0, Lo/atq$4;->b:Ljava/lang/String;

    iput p5, p0, Lo/atq$4;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 140
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/atq$4$3;

    invoke-direct {v1, p0}, Lo/atq$4$3;-><init>(Lo/atq$4;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 183
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 188
    if-eqz p1, :cond_0

    .line 190
    iget-object v0, p0, Lo/atq$4;->e:Lo/atq;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/atq;->d(Lo/atq;III)V

    .line 192
    :cond_0
    return-void
.end method
