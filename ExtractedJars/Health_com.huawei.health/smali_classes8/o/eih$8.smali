.class Lo/eih$8;
.super Lo/eih$k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eih;->a(ZLo/eih$k;Lo/eih$a;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eih<TT;>.k;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/eki;

.field final synthetic c:Lo/eih;

.field final synthetic d:Lo/eki$b;


# direct methods
.method constructor <init>(Lo/eih;Lo/eki;Lo/eki$b;)V
    .locals 0

    .line 956
    iput-object p1, p0, Lo/eih$8;->c:Lo/eih;

    iput-object p2, p0, Lo/eih$8;->b:Lo/eki;

    iput-object p3, p0, Lo/eih$8;->d:Lo/eki$b;

    invoke-direct {p0, p1}, Lo/eih$k;-><init>(Lo/eih;)V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    .line 959
    invoke-super {p0}, Lo/eih$k;->e()V

    .line 960
    iget-object v0, p0, Lo/eih$8;->b:Lo/eki;

    iget-object v1, p0, Lo/eih$8;->d:Lo/eki$b;

    invoke-virtual {v0, v1}, Lo/eki;->c(Lo/eki$b;)V

    .line 961
    return-void
.end method
