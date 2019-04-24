.class Lo/eii$5;
.super Lo/ekh$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eii;->c(Landroid/content/Context;IIIILo/eih;Lo/eic;Lo/ehe$a;Lo/eih$g;Lo/ejk;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/ekh;

.field final synthetic c:Lo/eih;

.field final synthetic d:Lo/eic;

.field final synthetic e:Lo/ejk;

.field final synthetic f:Lo/eii;

.field final synthetic h:Lo/ehe$a;

.field final synthetic i:Landroid/content/Context;

.field final synthetic k:I


# direct methods
.method constructor <init>(Lo/eii;Lo/eic;ILo/ekh;Lo/eih;Lo/ejk;Landroid/content/Context;ILo/ehe$a;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lo/eii$5;->f:Lo/eii;

    iput-object p2, p0, Lo/eii$5;->d:Lo/eic;

    iput p3, p0, Lo/eii$5;->a:I

    iput-object p4, p0, Lo/eii$5;->b:Lo/ekh;

    iput-object p5, p0, Lo/eii$5;->c:Lo/eih;

    iput-object p6, p0, Lo/eii$5;->e:Lo/ejk;

    iput-object p7, p0, Lo/eii$5;->i:Landroid/content/Context;

    iput p8, p0, Lo/eii$5;->k:I

    iput-object p9, p0, Lo/eii$5;->h:Lo/ehe$a;

    invoke-direct {p0}, Lo/ekh$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 12

    .line 109
    iget-object v0, p0, Lo/eii$5;->d:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/eii$5;->d:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 110
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v9

    .line 111
    iget v0, p0, Lo/eii$5;->a:I

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 112
    const/16 v0, 0xb

    invoke-virtual {v9, v0}, Ljava/util/Calendar;->get(I)I

    move-result v10

    .line 113
    const/16 v0, 0xc

    invoke-virtual {v9, v0}, Ljava/util/Calendar;->get(I)I

    move-result v11

    .line 114
    if-nez v10, :cond_0

    if-eqz v11, :cond_1

    .line 115
    :cond_0
    iget-object v0, p0, Lo/eii$5;->b:Lo/ekh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekh;->e(Ljava/util/Map;)V

    .line 116
    return-void

    .line 120
    :cond_1
    iget-object v0, p0, Lo/eii$5;->f:Lo/eii;

    invoke-static {v0}, Lo/eii;->e(Lo/eii;)Lo/eii$e;

    move-result-object v0

    invoke-virtual {v0}, Lo/eii$e;->e()I

    move-result v9

    .line 121
    iget-object v0, p0, Lo/eii$5;->c:Lo/eih;

    if-eqz v0, :cond_2

    .line 123
    iget-object v0, p0, Lo/eii$5;->c:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->T()Lo/eiz;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lo/eiz;->e(J)V

    .line 127
    :cond_2
    iget-object v0, p0, Lo/eii$5;->e:Lo/ejk;

    iget-object v1, p0, Lo/eii$5;->i:Landroid/content/Context;

    iget v2, p0, Lo/eii$5;->a:I

    int-to-long v2, v2

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    iget v4, p0, Lo/eii$5;->k:I

    int-to-long v4, v4

    const-wide/16 v6, 0x3c

    mul-long/2addr v4, v6

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    iget-object v6, p0, Lo/eii$5;->d:Lo/eic;

    iget-object v7, p0, Lo/eii$5;->h:Lo/ehe$a;

    new-instance v8, Lo/eii$5$5;

    invoke-direct {v8, p0, v9}, Lo/eii$5$5;-><init>(Lo/eii$5;I)V

    invoke-interface/range {v0 .. v8}, Lo/ejk;->d(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr;)V

    .line 144
    return-void
.end method
