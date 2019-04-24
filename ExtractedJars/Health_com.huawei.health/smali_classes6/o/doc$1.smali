.class Lo/doc$1;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/doc;->b(Lo/dod$e$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/doi;

.field final synthetic e:Lo/doc;


# direct methods
.method constructor <init>(Lo/doc;Lo/doi;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/doc$1;->e:Lo/doc;

    iput-object p2, p0, Lo/doc$1;->a:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 2

    .line 107
    iget-object v0, p0, Lo/doc$1;->e:Lo/doc;

    iget-object v1, p0, Lo/doc$1;->a:Lo/doi;

    invoke-static {v0, v1}, Lo/doc;->d(Lo/doc;Lo/doi;)V

    .line 108
    return-void
.end method
