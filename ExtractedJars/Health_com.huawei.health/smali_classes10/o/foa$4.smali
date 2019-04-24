.class Lo/foa$4;
.super Lo/foa$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/foa;->e(Lo/fmb;Lo/fma;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fma;

.field final synthetic b:Lo/fmb;

.field final synthetic e:Lo/foa;


# direct methods
.method constructor <init>(Lo/foa;Lo/fmb;Lo/flq;Lo/fmb;Lo/fma;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lo/foa$4;->e:Lo/foa;

    iput-object p4, p0, Lo/foa$4;->b:Lo/fmb;

    iput-object p5, p0, Lo/foa$4;->a:Lo/fma;

    invoke-direct {p0, p1, p2, p3}, Lo/foa$b;-><init>(Lo/foa;Lo/fmb;Lo/flq;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 98
    iget-object v0, p0, Lo/foa$4;->e:Lo/foa;

    iget-object v1, p0, Lo/foa$4;->b:Lo/fmb;

    iget-object v2, p0, Lo/foa$4;->a:Lo/fma;

    invoke-virtual {v0, v1, v2}, Lo/foa;->e(Lo/fmb;Lo/fma;)V

    .line 99
    return-void
.end method
