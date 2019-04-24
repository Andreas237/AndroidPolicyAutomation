.class Lo/dnt$d$5;
.super Lo/dot;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt$d;-><init>(Lo/dnt;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnt$d;

.field final synthetic c:Lo/dnt;


# direct methods
.method constructor <init>(Lo/dnt$d;Lo/dnt;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lo/dnt$d$5;->a:Lo/dnt$d;

    iput-object p2, p0, Lo/dnt$d$5;->c:Lo/dnt;

    invoke-direct {p0}, Lo/dot;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Message;)V
    .locals 3

    .line 106
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 107
    iget-object v0, p0, Lo/dnt$d$5;->a:Lo/dnt$d;

    iget-object v0, v0, Lo/dnt$d;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->a(Lo/dnt;)Lo/dor;

    move-result-object v0

    iget-object v1, p0, Lo/dnt$d$5;->a:Lo/dnt$d;

    iget-object v1, v1, Lo/dnt$d;->b:Lo/dnt;

    invoke-virtual {v1}, Lo/dnt;->b()Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lo/dor;->c(ILcom/huawei/up/model/UserInfomation;)V

    .line 108
    if-nez v2, :cond_0

    .line 109
    iget-object v0, p0, Lo/dnt$d$5;->a:Lo/dnt$d;

    iget-object v0, v0, Lo/dnt$d;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->d(Lo/dnt;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED"

    invoke-static {v0, v1}, Lo/dol;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 111
    :cond_0
    return-void
.end method
