.class Lo/akh$1;
.super Lo/aka;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/akh;


# direct methods
.method constructor <init>(Lo/akh;JJ)V
    .locals 0

    .line 607
    iput-object p1, p0, Lo/akh$1;->c:Lo/akh;

    invoke-direct {p0, p2, p3, p4, p5}, Lo/aka;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 613
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mRegisterWaitTimer: \u6ce8\u518c\u8d85\u65f6"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 614
    iget-object v0, p0, Lo/akh$1;->c:Lo/akh;

    invoke-static {v0}, Lo/akh;->a(Lo/akh;)Lo/akh$d;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lo/akh$d;->sendEmptyMessage(I)Z

    .line 615
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 609
    return-void
.end method
