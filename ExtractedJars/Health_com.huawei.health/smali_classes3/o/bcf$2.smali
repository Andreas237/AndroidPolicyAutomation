.class Lo/bcf$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bcf;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bcf;


# direct methods
.method constructor <init>(Lo/bcf;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lo/bcf$2;->d:Lo/bcf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 78
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/bcf$2$5;

    invoke-direct {v1, p0}, Lo/bcf$2$5;-><init>(Lo/bcf$2;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 97
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 102
    iget-object v0, p0, Lo/bcf$2;->d:Lo/bcf;

    invoke-static {v0}, Lo/bcf;->d(Lo/bcf;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 103
    return-void
.end method
