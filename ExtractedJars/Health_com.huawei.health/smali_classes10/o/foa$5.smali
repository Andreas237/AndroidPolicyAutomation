.class Lo/foa$5;
.super Lo/foa$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/foa;->a(Lo/fmb;Lo/fly;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/foa;

.field final synthetic c:Lo/fly;

.field final synthetic d:Lo/fmb;


# direct methods
.method constructor <init>(Lo/foa;Lo/fmb;Lo/flq;Lo/fmb;Lo/fly;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lo/foa$5;->a:Lo/foa;

    iput-object p4, p0, Lo/foa$5;->d:Lo/fmb;

    iput-object p5, p0, Lo/foa$5;->c:Lo/fly;

    invoke-direct {p0, p1, p2, p3}, Lo/foa$b;-><init>(Lo/foa;Lo/fmb;Lo/flq;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 149
    iget-object v0, p0, Lo/foa$5;->a:Lo/foa;

    iget-object v1, p0, Lo/foa$5;->d:Lo/fmb;

    iget-object v2, p0, Lo/foa$5;->c:Lo/fly;

    invoke-virtual {v0, v1, v2}, Lo/foa;->a(Lo/fmb;Lo/fly;)V

    .line 150
    return-void
.end method
