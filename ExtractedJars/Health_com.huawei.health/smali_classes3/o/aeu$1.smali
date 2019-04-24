.class Lo/aeu$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ahi$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aeu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aeu;


# direct methods
.method constructor <init>(Lo/aeu;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lo/aeu$1;->a:Lo/aeu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEvent(Lo/ahi$a;)V
    .locals 2

    .line 112
    iget-object v0, p0, Lo/aeu$1;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->d(Lo/aeu;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "weight_measure_choose_user"

    invoke-virtual {p1}, Lo/ahi$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 113
    iget-object v0, p0, Lo/aeu$1;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->e(Lo/aeu;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/aeu$1;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->b(Lo/aeu;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/aeu$1;->a:Lo/aeu;

    invoke-static {v0}, Lo/aeu;->c(Lo/aeu;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 114
    :cond_0
    return-void

    .line 116
    :cond_1
    iget-object v0, p0, Lo/aeu$1;->a:Lo/aeu;

    invoke-virtual {p1}, Lo/ahi$a;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aeu;->b(Lo/aeu;Landroid/os/Bundle;)V

    .line 118
    :cond_2
    return-void
.end method
