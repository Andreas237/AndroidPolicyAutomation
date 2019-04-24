.class Lo/dnu$1;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnu;->c(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dnu;

.field final synthetic d:Lo/doi;


# direct methods
.method constructor <init>(Lo/dnu;Lo/doi;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lo/dnu$1;->b:Lo/dnu;

    iput-object p2, p0, Lo/dnu$1;->d:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 2

    .line 81
    iget-object v0, p0, Lo/dnu$1;->b:Lo/dnu;

    invoke-static {v0}, Lo/dnu;->e(Lo/dnu;)Lo/dod$e;

    move-result-object v0

    new-instance v1, Lo/dnu$1$3;

    invoke-direct {v1, p0}, Lo/dnu$1$3;-><init>(Lo/dnu$1;)V

    invoke-interface {v0, v1}, Lo/dod$e;->e(Lo/dod$e$b;)V

    .line 102
    return-void
.end method
