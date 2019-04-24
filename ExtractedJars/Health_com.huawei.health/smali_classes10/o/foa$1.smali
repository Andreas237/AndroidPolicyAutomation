.class Lo/foa$1;
.super Lo/flv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/foa;->d(Lo/fmb;Lo/foa$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/foa$b;

.field final synthetic b:Lo/foa;


# direct methods
.method constructor <init>(Lo/foa;Lo/foa$b;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lo/foa$1;->b:Lo/foa;

    iput-object p2, p0, Lo/foa$1;->a:Lo/foa$b;

    invoke-direct {p0}, Lo/flv;-><init>()V

    return-void
.end method


# virtual methods
.method public i()V
    .locals 1

    .line 178
    iget-object v0, p0, Lo/foa$1;->a:Lo/foa$b;

    invoke-static {v0}, Lo/foa$b;->c(Lo/foa$b;)Lo/flq;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/flq;->b(Lo/fls;)V

    .line 179
    iget-object v0, p0, Lo/foa$1;->a:Lo/foa$b;

    invoke-virtual {v0}, Lo/foa$b;->d()V

    .line 180
    return-void
.end method
