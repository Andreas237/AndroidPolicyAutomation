.class Lo/byo$5;
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
.field final synthetic b:Lo/byo;


# direct methods
.method constructor <init>(Lo/byo;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/byo$5;->b:Lo/byo;

    invoke-direct {p0}, Lo/bzc$c;-><init>()V

    return-void
.end method


# virtual methods
.method public d(ILjava/lang/String;)V
    .locals 4

    .line 83
    iget-object v0, p0, Lo/byo$5;->b:Lo/byo;

    invoke-static {v0}, Lo/byo;->c(Lo/byo;)Lo/byo$c;

    move-result-object v0

    iget v0, v0, Lo/byo$c;->d:I

    sub-int v3, p1, v0

    .line 84
    if-eqz v3, :cond_0

    .line 85
    iget-object v0, p0, Lo/byo$5;->b:Lo/byo;

    invoke-static {v0}, Lo/byo;->c(Lo/byo;)Lo/byo$c;

    move-result-object v0

    iput p1, v0, Lo/byo$c;->d:I

    .line 86
    iget-object v0, p0, Lo/byo$5;->b:Lo/byo;

    invoke-static {v0}, Lo/byo;->a(Lo/byo;)Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->add(II)V

    .line 87
    iget-object v0, p0, Lo/byo$5;->b:Lo/byo;

    iget-object v1, p0, Lo/byo$5;->b:Lo/byo;

    invoke-static {v1}, Lo/byo;->a(Lo/byo;)Ljava/util/Calendar;

    move-result-object v1

    iget-object v2, p0, Lo/byo$5;->b:Lo/byo;

    invoke-static {v2}, Lo/byo;->e(Lo/byo;)Lo/bzc;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/byo;->e(Lo/byo;Ljava/util/Calendar;Lo/bzc;)V

    .line 89
    :cond_0
    return-void
.end method
