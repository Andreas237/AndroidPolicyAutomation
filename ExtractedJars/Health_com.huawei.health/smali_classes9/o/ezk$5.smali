.class Lo/ezk$5;
.super Lo/ekh;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ezk;->d(Lo/eih;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ezk;


# direct methods
.method constructor <init>(Lo/ezk;Landroid/os/Handler;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lo/ezk$5;->b:Lo/ezk;

    invoke-direct {p0, p2}, Lo/ekh;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/util/Map;)V
    .locals 0

    .line 86
    return-void
.end method

.method protected b(I)V
    .locals 4

    .line 82
    const-string v0, "ScrollChartObserverTotalDataView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "process onRangeShow end onFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    return-void
.end method
