.class Lo/bcf$2$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bcf$2;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lo/bcf$2;


# direct methods
.method constructor <init>(Lo/bcf$2;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lo/bcf$2$5;->e:Lo/bcf$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 79
    invoke-virtual {p0, p1}, Lo/bcf$2$5;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 83
    iget-object v0, p0, Lo/bcf$2$5;->e:Lo/bcf$2;

    iget-object v0, v0, Lo/bcf$2;->d:Lo/bcf;

    invoke-virtual {v0}, Lo/bcf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    new-instance v2, Lo/awr;

    invoke-direct {v2}, Lo/awr;-><init>()V

    .line 86
    invoke-virtual {v2, p1}, Lo/awr;->c(Lo/bra;)I

    .line 88
    :cond_0
    iget-object v0, p0, Lo/bcf$2$5;->e:Lo/bcf$2;

    iget-object v0, v0, Lo/bcf$2;->d:Lo/bcf;

    invoke-virtual {v0}, Lo/bcf;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 90
    new-instance v2, Lo/asz;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/asz;-><init>(Landroid/os/Handler;)V

    .line 91
    invoke-virtual {v2, p1}, Lo/asz;->d(Lo/bra;)V

    .line 93
    :cond_1
    iget-object v0, p0, Lo/bcf$2$5;->e:Lo/bcf$2;

    iget-object v0, v0, Lo/bcf$2;->d:Lo/bcf;

    invoke-static {v0}, Lo/bcf;->d(Lo/bcf;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 94
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
