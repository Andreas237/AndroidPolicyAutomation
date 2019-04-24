.class Lo/dnu$3;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnu;->e(Landroid/os/Message;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/doi;

.field final synthetic d:Lcom/huawei/up/model/UserInfomation;

.field final synthetic e:Lo/dnu;


# direct methods
.method constructor <init>(Lo/dnu;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lo/dnu$3;->e:Lo/dnu;

    iput-object p2, p0, Lo/dnu$3;->d:Lcom/huawei/up/model/UserInfomation;

    iput-object p3, p0, Lo/dnu$3;->a:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 3

    .line 180
    iget-object v0, p0, Lo/dnu$3;->e:Lo/dnu;

    invoke-static {v0}, Lo/dnu;->c(Lo/dnu;)Lo/dod$b;

    move-result-object v0

    iget-object v1, p0, Lo/dnu$3;->d:Lcom/huawei/up/model/UserInfomation;

    new-instance v2, Lo/dnu$3$2;

    invoke-direct {v2, p0}, Lo/dnu$3$2;-><init>(Lo/dnu$3;)V

    invoke-interface {v0, v1, v2}, Lo/dod$b;->e(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V

    .line 193
    return-void
.end method
