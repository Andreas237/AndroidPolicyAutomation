.class Lo/bcj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bcj;->c()Lo/brd;
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
.field final synthetic c:Lo/bcj;


# direct methods
.method constructor <init>(Lo/bcj;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lo/bcj$4;->c:Lo/bcj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 91
    invoke-virtual {p0, p1}, Lo/bcj$4;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 1

    .line 97
    iget-object v0, p0, Lo/bcj$4;->c:Lo/bcj;

    invoke-static {v0}, Lo/bcj;->a(Lo/bcj;)V

    .line 100
    iget-object v0, p0, Lo/bcj$4;->c:Lo/bcj;

    invoke-static {v0}, Lo/bcj;->c(Lo/bcj;)V

    .line 103
    iget-object v0, p0, Lo/bcj$4;->c:Lo/bcj;

    invoke-static {v0}, Lo/bcj;->d(Lo/bcj;)V

    .line 106
    invoke-static {}, Lo/bcj;->b()V

    .line 109
    iget-object v0, p0, Lo/bcj$4;->c:Lo/bcj;

    invoke-static {v0}, Lo/bcj;->e(Lo/bcj;)V

    .line 112
    iget-object v0, p0, Lo/bcj$4;->c:Lo/bcj;

    invoke-static {v0}, Lo/bcj;->b(Lo/bcj;)V

    .line 114
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
