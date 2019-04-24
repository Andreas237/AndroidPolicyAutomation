.class Lo/flw$4;
.super Lo/flv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/flw;->d(Lo/fma;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fma;

.field final synthetic b:Lo/flw;


# direct methods
.method constructor <init>(Lo/flw;Lo/fma;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lo/flw$4;->b:Lo/flw;

    iput-object p2, p0, Lo/flw$4;->a:Lo/fma;

    invoke-direct {p0}, Lo/flv;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 177
    invoke-virtual {p0}, Lo/flw$4;->k()V

    .line 178
    return-void
.end method

.method protected k()V
    .locals 2

    .line 182
    iget-object v0, p0, Lo/flw$4;->b:Lo/flw;

    iget-object v0, v0, Lo/flw;->e:Lo/fom;

    iget-object v1, p0, Lo/flw$4;->a:Lo/fma;

    invoke-virtual {v1}, Lo/fma;->k()Lo/flz;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fom;->b(Lo/flz;)V

    .line 183
    return-void
.end method
