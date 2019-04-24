.class Lo/dnw$9;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw;->e(Landroid/os/Message;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/doi;

.field final synthetic b:Lcom/huawei/up/model/UserInfomation;

.field final synthetic c:Lo/dnw;


# direct methods
.method constructor <init>(Lo/dnw;Lo/doi;Lcom/huawei/up/model/UserInfomation;)V
    .locals 0

    .line 298
    iput-object p1, p0, Lo/dnw$9;->c:Lo/dnw;

    iput-object p2, p0, Lo/dnw$9;->a:Lo/doi;

    iput-object p3, p0, Lo/dnw$9;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 2

    .line 302
    iget-object v0, p0, Lo/dnw$9;->c:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->e(Lo/dnw;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/dnw$9$4;

    invoke-direct {v1, p0}, Lo/dnw$9$4;-><init>(Lo/dnw$9;)V

    invoke-virtual {v0, v1}, Lo/clq;->a(Lo/clz;)V

    .line 338
    return-void
.end method
