.class Lo/atv$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atv;->d(Ljava/lang/Long;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Long;

.field final synthetic c:Lo/atv;


# direct methods
.method constructor <init>(Lo/atv;Ljava/lang/Long;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lo/atv$3;->c:Lo/atv;

    iput-object p2, p0, Lo/atv$3;->a:Ljava/lang/Long;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 276
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/atv$3$2;

    invoke-direct {v1, p0}, Lo/atv$3$2;-><init>(Lo/atv$3;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 292
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 297
    if-eqz p1, :cond_0

    .line 299
    iget-object v0, p0, Lo/atv$3;->c:Lo/atv;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/atv;->d(Lo/atv;III)V

    .line 301
    :cond_0
    return-void
.end method
