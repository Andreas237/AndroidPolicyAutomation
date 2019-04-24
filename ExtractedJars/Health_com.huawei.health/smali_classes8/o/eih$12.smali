.class Lo/eih$12;
.super Lo/eih$k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eih;->a(Lo/eih$k;Lo/eih$a;Lo/eih$d;)V
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

.field final synthetic c:Lo/eki$e;

.field final synthetic e:Lo/eih;


# direct methods
.method constructor <init>(Lo/eih;Lo/eki;Lo/eki$e;)V
    .locals 0

    .line 1153
    iput-object p1, p0, Lo/eih$12;->e:Lo/eih;

    iput-object p2, p0, Lo/eih$12;->b:Lo/eki;

    iput-object p3, p0, Lo/eih$12;->c:Lo/eki$e;

    invoke-direct {p0, p1}, Lo/eih$k;-><init>(Lo/eih;)V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    .line 1156
    invoke-super {p0}, Lo/eih$k;->e()V

    .line 1157
    iget-object v0, p0, Lo/eih$12;->b:Lo/eki;

    iget-object v1, p0, Lo/eih$12;->c:Lo/eki$e;

    invoke-virtual {v0, v1}, Lo/eki;->c(Lo/eki$b;)V

    .line 1158
    return-void
.end method
