.class Lo/dop$1;
.super Lo/dot;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dop;-><init>(Landroid/content/Context;Ljava/lang/String;Lo/dnx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dop;


# direct methods
.method constructor <init>(Lo/dop;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/dop$1;->c:Lo/dop;

    invoke-direct {p0}, Lo/dot;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Message;)V
    .locals 4

    .line 83
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    .line 84
    iget-object v0, p0, Lo/dop$1;->c:Lo/dop;

    invoke-static {v0}, Lo/dop;->e(Lo/dop;)Lo/dnx;

    move-result-object v0

    const-string v1, "userInfo"

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/up/model/UserInfomation;

    const-string v2, "callback"

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/dod$b$d;

    invoke-interface {v0, p1, v1, v2}, Lo/dnx;->e(Landroid/os/Message;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V

    .line 85
    return-void
.end method
