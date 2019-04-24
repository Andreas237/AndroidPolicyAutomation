.class Lo/fbd$d$1;
.super Lo/fbs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbd$d;->d(Lo/fbd$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fbd$d;

.field final synthetic c:Lo/fbd$c;


# direct methods
.method constructor <init>(Lo/fbd$d;Landroid/os/Handler;Lo/fbd$c;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lo/fbd$d$1;->a:Lo/fbd$d;

    iput-object p3, p0, Lo/fbd$d$1;->c:Lo/fbd$c;

    invoke-direct {p0, p2}, Lo/fbs;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected b(Ljava/util/Map;)V
    .locals 1

    .line 226
    iget-object v0, p0, Lo/fbd$d$1;->c:Lo/fbd$c;

    invoke-interface {v0}, Lo/fbd$c;->a()V

    .line 227
    return-void
.end method

.method protected e(I)V
    .locals 0

    .line 222
    return-void
.end method
