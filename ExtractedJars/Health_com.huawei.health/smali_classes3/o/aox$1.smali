.class Lo/aox$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aox;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lo/aox;


# direct methods
.method constructor <init>(Lo/aox;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lo/aox$1;->e:Lo/aox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/bra;)Ljava/lang/Object;
    .locals 6

    .line 89
    new-instance v2, Lo/bca;

    invoke-direct {v2}, Lo/bca;-><init>()V

    .line 91
    invoke-virtual {v2}, Lo/bca;->l()J

    move-result-wide v3

    .line 92
    invoke-virtual {v2}, Lo/bca;->n()Ljava/lang/String;

    move-result-object v5

    .line 94
    iget-object v0, p0, Lo/aox$1;->e:Lo/aox;

    invoke-static {v0, v3, v4, v5}, Lo/aox;->b(Lo/aox;JLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lo/aox$1;->e:Lo/aox;

    invoke-static {v0, v2}, Lo/aox;->e(Lo/aox;Lo/bca;)V

    goto :goto_0

    .line 102
    :cond_0
    iget-object v0, p0, Lo/aox$1;->e:Lo/aox;

    iget-object v1, p0, Lo/aox$1;->e:Lo/aox;

    invoke-static {v1, v5}, Lo/aox;->c(Lo/aox;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aox;->b(Lo/aox;Ljava/util/ArrayList;)V

    .line 104
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
