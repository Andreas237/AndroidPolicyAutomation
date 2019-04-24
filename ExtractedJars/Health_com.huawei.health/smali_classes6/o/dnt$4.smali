.class Lo/dnt$4;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->e(Landroid/os/Message;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnt;

.field final synthetic c:Lcom/huawei/up/model/UserInfomation;

.field final synthetic e:Lo/doi;


# direct methods
.method constructor <init>(Lo/dnt;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V
    .locals 0

    .line 601
    iput-object p1, p0, Lo/dnt$4;->a:Lo/dnt;

    iput-object p2, p0, Lo/dnt$4;->c:Lcom/huawei/up/model/UserInfomation;

    iput-object p3, p0, Lo/dnt$4;->e:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 4

    .line 605
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo write hihealth:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnt$4;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 606
    iget-object v0, p0, Lo/dnt$4;->a:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->h(Lo/dnt;)Lo/dod$b;

    move-result-object v0

    iget-object v1, p0, Lo/dnt$4;->c:Lcom/huawei/up/model/UserInfomation;

    new-instance v2, Lo/dnt$4$3;

    invoke-direct {v2, p0}, Lo/dnt$4$3;-><init>(Lo/dnt$4;)V

    invoke-interface {v0, v1, v2}, Lo/dod$b;->e(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V

    .line 619
    return-void
.end method
