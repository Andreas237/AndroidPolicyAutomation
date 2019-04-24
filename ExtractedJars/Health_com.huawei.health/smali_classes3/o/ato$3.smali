.class Lo/ato$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ato;->c(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:J

.field final synthetic d:Lo/ato;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/ato;JJ)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/ato$3;->d:Lo/ato;

    iput-wide p2, p0, Lo/ato$3;->b:J

    iput-wide p4, p0, Lo/ato$3;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 97
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/ato$3$3;

    invoke-direct {v1, p0}, Lo/ato$3$3;-><init>(Lo/ato$3;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 129
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 134
    if-eqz p1, :cond_0

    .line 136
    iget-object v0, p0, Lo/ato$3;->d:Lo/ato;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/ato;->d(Lo/ato;III)V

    .line 138
    :cond_0
    return-void
.end method
