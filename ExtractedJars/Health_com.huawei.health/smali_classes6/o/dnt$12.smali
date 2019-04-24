.class Lo/dnt$12;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/doi;

.field final synthetic e:Lo/dnt;


# direct methods
.method constructor <init>(Lo/dnt;Lo/doi;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lo/dnt$12;->e:Lo/dnt;

    iput-object p2, p0, Lo/dnt$12;->b:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 2

    .line 275
    iget-object v0, p0, Lo/dnt$12;->e:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->f(Lo/dnt;)Lo/dod$e;

    move-result-object v0

    new-instance v1, Lo/dnt$12$1;

    invoke-direct {v1, p0}, Lo/dnt$12$1;-><init>(Lo/dnt$12;)V

    invoke-interface {v0, v1}, Lo/dod$e;->e(Lo/dod$e$b;)V

    .line 290
    return-void
.end method
