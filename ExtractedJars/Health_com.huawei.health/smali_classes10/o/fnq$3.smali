.class Lo/fnq$3;
.super Lo/flv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fnq;->a(Lo/flq;Lo/fob;)Lo/fls;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fnq;

.field final synthetic d:Lo/fob;


# direct methods
.method constructor <init>(Lo/fnq;Lo/fob;)V
    .locals 0

    .line 1124
    iput-object p1, p0, Lo/fnq$3;->b:Lo/fnq;

    iput-object p2, p0, Lo/fnq$3;->d:Lo/fob;

    invoke-direct {p0}, Lo/flv;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1128
    iget-object v0, p0, Lo/fnq$3;->b:Lo/fnq;

    iget-object v1, p0, Lo/fnq$3;->d:Lo/fob;

    invoke-static {v0, v1}, Lo/fnq;->d(Lo/fnq;Lo/fob;)Lo/fns;

    .line 1129
    return-void
.end method

.method protected k()V
    .locals 2

    .line 1133
    iget-object v0, p0, Lo/fnq$3;->b:Lo/fnq;

    iget-object v1, p0, Lo/fnq$3;->d:Lo/fob;

    invoke-static {v0, v1}, Lo/fnq;->d(Lo/fnq;Lo/fob;)Lo/fns;

    .line 1134
    return-void
.end method
