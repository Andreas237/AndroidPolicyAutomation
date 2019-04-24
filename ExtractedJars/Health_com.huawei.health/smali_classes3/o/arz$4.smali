.class Lo/arz$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arz;->d()V
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
.field final synthetic e:Lo/arz;


# direct methods
.method constructor <init>(Lo/arz;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lo/arz$4;->e:Lo/arz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 91
    invoke-virtual {p0, p1}, Lo/arz$4;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 95
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0}, Lo/arz;->d(Lo/arz;)Lo/ars;

    move-result-object v0

    if-nez v0, :cond_1

    .line 97
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0}, Lo/arz;->c(Lo/arz;)Lo/bqu;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0}, Lo/arz;->c(Lo/arz;)Lo/bqu;

    move-result-object v0

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lo/bqu;->c(I)V

    .line 101
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 104
    :cond_1
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    iget-object v1, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v1}, Lo/arz;->d(Lo/arz;)Lo/ars;

    move-result-object v1

    invoke-virtual {v1}, Lo/ars;->d()I

    move-result v1

    invoke-static {v0, v1}, Lo/arz;->b(Lo/arz;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    invoke-static {}, Lo/apl;->d()Lo/apl;

    move-result-object v0

    iget-object v1, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v1}, Lo/arz;->e(Lo/arz;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v2}, Lo/arz;->d(Lo/arz;)Lo/ars;

    move-result-object v2

    invoke-virtual {v2}, Lo/ars;->e()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/apl;->c(Landroid/content/Context;Ljava/util/ArrayList;)I

    move-result v3

    .line 108
    const/4 v0, -0x3

    if-ne v3, v0, :cond_2

    .line 110
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0}, Lo/arz;->c(Lo/arz;)Lo/bqu;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lo/bqu;->c(I)V

    .line 111
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 115
    :cond_2
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0}, Lo/arz;->b(Lo/arz;)I

    move-result v3

    .line 117
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0, v3}, Lo/arz;->a(Lo/arz;I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 119
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0}, Lo/arz;->c(Lo/arz;)Lo/bqu;

    move-result-object v0

    invoke-interface {v0, v3}, Lo/bqu;->c(I)V

    .line 120
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 125
    :cond_3
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0}, Lo/arz;->c(Lo/arz;)Lo/bqu;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 127
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0}, Lo/arz;->c(Lo/arz;)Lo/bqu;

    move-result-object v0

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lo/bqu;->d(I)V

    .line 134
    :cond_4
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 136
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0}, Lo/arz;->c(Lo/arz;)Lo/bqu;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 138
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0}, Lo/arz;->c(Lo/arz;)Lo/bqu;

    move-result-object v0

    invoke-interface {v0}, Lo/bqu;->a()V

    .line 140
    :cond_5
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 144
    :cond_6
    iget-object v0, p0, Lo/arz$4;->e:Lo/arz;

    invoke-static {v0, p1}, Lo/arz;->e(Lo/arz;Lo/bra;)V

    .line 146
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
