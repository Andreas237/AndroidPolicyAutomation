.class Lo/eof$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ahi$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eof;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eof;


# direct methods
.method constructor <init>(Lo/eof;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lo/eof$3;->a:Lo/eof;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEvent(Lo/ahi$a;)V
    .locals 3

    .line 170
    const-string v0, "set_scale_version_code"

    invoke-virtual {p1}, Lo/ahi$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 171
    iget-object v0, p0, Lo/eof$3;->a:Lo/eof;

    iget-object v0, v0, Lo/eof;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    return-void

    .line 174
    :cond_0
    invoke-virtual {p1}, Lo/ahi$a;->e()Landroid/content/Intent;

    move-result-object v2

    .line 175
    iget-object v0, p0, Lo/eof$3;->a:Lo/eof;

    invoke-virtual {v0, v2}, Lo/eof;->b(Landroid/content/Intent;)V

    .line 177
    :cond_1
    return-void
.end method
