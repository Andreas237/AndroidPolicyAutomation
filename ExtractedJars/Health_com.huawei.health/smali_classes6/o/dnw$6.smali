.class Lo/dnw$6;
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
.method constructor <init>(Lo/dnw;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lo/dnw$6;->c:Lo/dnw;

    iput-object p2, p0, Lo/dnw$6;->b:Lcom/huawei/up/model/UserInfomation;

    iput-object p3, p0, Lo/dnw$6;->a:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 4

    .line 281
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo write hihealth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnw$6;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    iget-object v0, p0, Lo/dnw$6;->c:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->c(Lo/dnw;)Lo/dod$b;

    move-result-object v0

    iget-object v1, p0, Lo/dnw$6;->b:Lcom/huawei/up/model/UserInfomation;

    new-instance v2, Lo/dnw$6$1;

    invoke-direct {v2, p0}, Lo/dnw$6$1;-><init>(Lo/dnw$6;)V

    invoke-interface {v0, v1, v2}, Lo/dod$b;->e(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V

    .line 295
    return-void
.end method
