.class Lo/dnt$9;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->c(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dnt;

.field final synthetic e:Lo/doi;


# direct methods
.method constructor <init>(Lo/dnt;Lo/doi;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lo/dnt$9;->d:Lo/dnt;

    iput-object p2, p0, Lo/dnt$9;->e:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 2

    .line 178
    iget-object v0, p0, Lo/dnt$9;->d:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->i(Lo/dnt;)Lo/dod$e;

    move-result-object v0

    new-instance v1, Lo/dnt$9$5;

    invoke-direct {v1, p0}, Lo/dnt$9$5;-><init>(Lo/dnt$9;)V

    invoke-interface {v0, v1}, Lo/dod$e;->e(Lo/dod$e$b;)V

    .line 199
    return-void
.end method
