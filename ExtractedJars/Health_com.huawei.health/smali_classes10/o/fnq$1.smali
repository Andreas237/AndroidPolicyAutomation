.class Lo/fnq$1;
.super Lo/flv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fnq;->e(Lo/flq;Lo/fob;)Lo/fls;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fob;

.field final synthetic c:Lo/fnq;


# direct methods
.method constructor <init>(Lo/fnq;Lo/fob;)V
    .locals 0

    .line 1142
    iput-object p1, p0, Lo/fnq$1;->c:Lo/fnq;

    iput-object p2, p0, Lo/fnq$1;->b:Lo/fob;

    invoke-direct {p0}, Lo/flv;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1146
    iget-object v0, p0, Lo/fnq$1;->c:Lo/fnq;

    iget-object v1, p0, Lo/fnq$1;->b:Lo/fob;

    invoke-static {v0, v1}, Lo/fnq;->c(Lo/fnq;Lo/fob;)Lo/fnp;

    .line 1147
    return-void
.end method

.method protected k()V
    .locals 2

    .line 1151
    iget-object v0, p0, Lo/fnq$1;->c:Lo/fnq;

    iget-object v1, p0, Lo/fnq$1;->b:Lo/fob;

    invoke-static {v0, v1}, Lo/fnq;->c(Lo/fnq;Lo/fob;)Lo/fnp;

    .line 1152
    return-void
.end method
