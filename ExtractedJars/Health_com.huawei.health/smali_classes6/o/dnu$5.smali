.class Lo/dnu$5;
.super Lo/doi;
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
.field final synthetic b:Lo/dod$b$d;

.field final synthetic c:I

.field final synthetic d:Lo/dnu;


# direct methods
.method constructor <init>(Lo/dnu;Landroid/os/Handler;ILo/dod$b$d;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lo/dnu$5;->d:Lo/dnu;

    iput p3, p0, Lo/dnu$5;->c:I

    iput-object p4, p0, Lo/dnu$5;->b:Lo/dod$b$d;

    invoke-direct {p0, p2}, Lo/doi;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 3

    .line 163
    iget-object v0, p0, Lo/dnu$5;->d:Lo/dnu;

    invoke-static {v0}, Lo/dnu;->b(Lo/dnu;)Lo/dnu$b;

    move-result-object v0

    iget v1, p0, Lo/dnu$5;->c:I

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lo/dnu$b;->e(II)V

    .line 164
    iget-object v0, p0, Lo/dnu$5;->b:Lo/dod$b$d;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/doe;->a(Lo/dod$b$d;I)V

    .line 165
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 3

    .line 169
    iget-object v0, p0, Lo/dnu$5;->d:Lo/dnu;

    invoke-static {v0}, Lo/dnu;->b(Lo/dnu;)Lo/dnu$b;

    move-result-object v0

    iget v1, p0, Lo/dnu$5;->c:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/dnu$b;->e(II)V

    .line 170
    iget-object v0, p0, Lo/dnu$5;->b:Lo/dod$b$d;

    invoke-static {v0}, Lo/doe;->e(Lo/dod$b$d;)V

    .line 171
    return-void
.end method
