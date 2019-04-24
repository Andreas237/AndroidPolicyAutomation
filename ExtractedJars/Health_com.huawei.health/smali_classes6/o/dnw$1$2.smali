.class Lo/dnw$1$2;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw$1;->c(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnw$1;

.field final synthetic c:Lo/doi;


# direct methods
.method constructor <init>(Lo/dnw$1;Lo/doi;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lo/dnw$1$2;->a:Lo/dnw$1;

    iput-object p2, p0, Lo/dnw$1$2;->c:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 2

    .line 192
    iget-object v0, p0, Lo/dnw$1$2;->a:Lo/dnw$1;

    iget-object v0, v0, Lo/dnw$1;->a:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->a(Lo/dnw;)Lo/dod$e;

    move-result-object v0

    new-instance v1, Lo/dnw$1$2$3;

    invoke-direct {v1, p0}, Lo/dnw$1$2$3;-><init>(Lo/dnw$1$2;)V

    invoke-interface {v0, v1}, Lo/dod$e;->e(Lo/dod$e$b;)V

    .line 213
    return-void
.end method
