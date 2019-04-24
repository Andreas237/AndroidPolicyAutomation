.class Lo/cir$1;
.super Lo/cfi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cir;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lo/cir$1;->d:Lo/cir;

    invoke-direct {p0}, Lo/cfi;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 185
    invoke-super {p0}, Lo/cfi;->b()V

    .line 187
    iget-object v0, p0, Lo/cir$1;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->e(Lo/cir;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 188
    iget-boolean v0, p0, Lo/cir$1;->e:Z

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lo/cir$1;->d:Lo/cir;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cir;->b(Lo/cir;Z)V

    goto :goto_0

    .line 191
    :cond_0
    iget-object v0, p0, Lo/cir$1;->d:Lo/cir;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cir;->b(Lo/cir;Z)V

    .line 194
    :cond_1
    :goto_0
    return-void
.end method
