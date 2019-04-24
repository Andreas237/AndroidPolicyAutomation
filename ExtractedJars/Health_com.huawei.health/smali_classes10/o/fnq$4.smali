.class Lo/fnq$4;
.super Lo/flv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fnq;->d(Lo/fmb;Lo/fma;)Lo/fma;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fob;

.field final synthetic b:Lo/fnq;

.field final synthetic d:Lo/fma;

.field final synthetic e:Lo/fma;


# direct methods
.method constructor <init>(Lo/fnq;Lo/fma;Lo/fma;Lo/fob;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lo/fnq$4;->b:Lo/fnq;

    iput-object p2, p0, Lo/fnq$4;->e:Lo/fma;

    iput-object p3, p0, Lo/fnq$4;->d:Lo/fma;

    iput-object p4, p0, Lo/fnq$4;->a:Lo/fob;

    invoke-direct {p0}, Lo/flv;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 276
    invoke-virtual {p0}, Lo/fnq$4;->k()V

    .line 277
    return-void
.end method

.method public h()V
    .locals 2

    .line 271
    iget-object v0, p0, Lo/fnq$4;->e:Lo/fma;

    iget-object v1, p0, Lo/fnq$4;->d:Lo/fma;

    invoke-virtual {v1}, Lo/fma;->k()Lo/flz;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fma;->e(Lo/flz;)Lo/flq;

    .line 272
    return-void
.end method

.method public k()V
    .locals 2

    .line 281
    iget-object v0, p0, Lo/fnq$4;->b:Lo/fnq;

    iget-object v1, p0, Lo/fnq$4;->a:Lo/fob;

    invoke-static {v0, v1}, Lo/fnq;->d(Lo/fnq;Lo/fob;)Lo/fns;

    .line 282
    return-void
.end method
