.class Lo/dnq$2;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnq;->a(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/doi;

.field final synthetic b:Lo/dnq;

.field final synthetic d:Lcom/huawei/up/model/UserInfomation;


# direct methods
.method constructor <init>(Lo/dnq;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lo/dnq$2;->b:Lo/dnq;

    iput-object p2, p0, Lo/dnq$2;->d:Lcom/huawei/up/model/UserInfomation;

    iput-object p3, p0, Lo/dnq$2;->a:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 4

    .line 248
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modify AccountData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    iget-object v0, p0, Lo/dnq$2;->b:Lo/dnq;

    invoke-static {v0}, Lo/dnq;->d(Lo/dnq;)Lo/dnr;

    move-result-object v0

    iget-object v1, p0, Lo/dnq$2;->d:Lcom/huawei/up/model/UserInfomation;

    new-instance v2, Lo/dnq$2$1;

    invoke-direct {v2, p0}, Lo/dnq$2$1;-><init>(Lo/dnq$2;)V

    invoke-interface {v0, v1, v2}, Lo/dnr;->d(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V

    .line 262
    return-void
.end method
