.class Lo/byo$1;
.super Lo/bzc$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/byo;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/byo;


# direct methods
.method constructor <init>(Lo/byo;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lo/byo$1;->a:Lo/byo;

    invoke-direct {p0}, Lo/bzc$c;-><init>()V

    return-void
.end method


# virtual methods
.method public d(ILjava/lang/String;)V
    .locals 4

    .line 95
    iget-object v0, p0, Lo/byo$1;->a:Lo/byo;

    invoke-static {v0}, Lo/byo;->c(Lo/byo;)Lo/byo$c;

    move-result-object v0

    iget v0, v0, Lo/byo$c;->e:I

    sub-int v3, p1, v0

    .line 96
    if-eqz v3, :cond_0

    .line 97
    iget-object v0, p0, Lo/byo$1;->a:Lo/byo;

    invoke-static {v0}, Lo/byo;->c(Lo/byo;)Lo/byo$c;

    move-result-object v0

    iput p1, v0, Lo/byo$c;->e:I

    .line 98
    iget-object v0, p0, Lo/byo$1;->a:Lo/byo;

    invoke-static {v0}, Lo/byo;->a(Lo/byo;)Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->add(II)V

    .line 99
    iget-object v0, p0, Lo/byo$1;->a:Lo/byo;

    iget-object v1, p0, Lo/byo$1;->a:Lo/byo;

    invoke-static {v1}, Lo/byo;->a(Lo/byo;)Ljava/util/Calendar;

    move-result-object v1

    iget-object v2, p0, Lo/byo$1;->a:Lo/byo;

    invoke-static {v2}, Lo/byo;->d(Lo/byo;)Lo/bzc;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/byo;->e(Lo/byo;Ljava/util/Calendar;Lo/bzc;)V

    .line 101
    :cond_0
    return-void
.end method
