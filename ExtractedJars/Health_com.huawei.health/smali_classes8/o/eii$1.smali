.class Lo/eii$1;
.super Lo/ekh;
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
.field final synthetic a:Lo/eih$g;

.field final synthetic c:Lo/eii;


# direct methods
.method constructor <init>(Lo/eii;Landroid/os/Handler;Lo/eih$g;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/eii$1;->c:Lo/eii;

    iput-object p3, p0, Lo/eii$1;->a:Lo/eih$g;

    invoke-direct {p0, p2}, Lo/ekh;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/util/Map;)V
    .locals 4

    .line 93
    const-string v0, "HwHealthBaseBarLineDataSet"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "process fillBuffer end onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lo/eii$1;->a:Lo/eih$g;

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lo/eii$1;->a:Lo/eih$g;

    invoke-interface {v0}, Lo/eih$g;->b()V

    .line 98
    :cond_0
    return-void
.end method

.method protected b(I)V
    .locals 4

    .line 88
    const-string v0, "HwHealthBaseBarLineDataSet"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "process fillBuffer end onFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    return-void
.end method
