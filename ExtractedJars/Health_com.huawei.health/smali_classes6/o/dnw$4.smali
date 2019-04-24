.class Lo/dnw$4;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw;->c(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/doi;

.field final synthetic d:Lo/dnw;


# direct methods
.method constructor <init>(Lo/dnw;Lo/doi;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lo/dnw$4;->d:Lo/dnw;

    iput-object p2, p0, Lo/dnw$4;->b:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 2

    .line 92
    iget-object v0, p0, Lo/dnw$4;->d:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->a(Lo/dnw;)Lo/dod$e;

    move-result-object v0

    new-instance v1, Lo/dnw$4$5;

    invoke-direct {v1, p0}, Lo/dnw$4$5;-><init>(Lo/dnw$4;)V

    invoke-interface {v0, v1}, Lo/dod$e;->e(Lo/dod$e$b;)V

    .line 113
    return-void
.end method
