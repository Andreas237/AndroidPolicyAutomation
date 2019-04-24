.class Lo/ezm$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ezm;->d(Lo/eih;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ezm;


# direct methods
.method constructor <init>(Lo/ezm;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lo/ezm$5;->d:Lo/ezm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)F
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;)F"
        }
    .end annotation

    .line 151
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 152
    :cond_0
    iget-object v0, p0, Lo/ezm$5;->d:Lo/ezm;

    invoke-static {v0}, Lo/ezm;->e(Lo/ezm;)Lo/ezm$d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ezm$d;->c(Ljava/util/List;)V

    .line 153
    iget-object v0, p0, Lo/ezm$5;->d:Lo/ezm;

    invoke-static {v0}, Lo/ezm;->a(Lo/ezm;)Lo/ezm$e;

    move-result-object v0

    iget-object v1, p0, Lo/ezm$5;->d:Lo/ezm;

    invoke-static {v1}, Lo/ezm;->b(Lo/ezm;)Lo/ezm$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ezm$e;->c(Landroid/view/View;)V

    .line 154
    iget-object v0, p0, Lo/ezm$5;->d:Lo/ezm;

    invoke-static {v0}, Lo/ezm;->b(Lo/ezm;)Lo/ezm$a;

    move-result-object v0

    invoke-static {v0}, Lo/ezm$a;->c(Lo/ezm$a;)V

    .line 155
    const/4 v0, 0x0

    return v0

    .line 157
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 158
    instance-of v0, v2, Lo/ejt;

    if-nez v0, :cond_2

    .line 159
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "visitShowModels not instanceof IStorageModelProvider! logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 163
    :cond_2
    iget-object v0, p0, Lo/ezm$5;->d:Lo/ezm;

    invoke-static {v0, p1}, Lo/ezm;->e(Lo/ezm;Ljava/util/List;)V

    .line 164
    iget-object v0, p0, Lo/ezm$5;->d:Lo/ezm;

    invoke-static {v0}, Lo/ezm;->a(Lo/ezm;)Lo/ezm$e;

    move-result-object v0

    iget-object v1, p0, Lo/ezm$5;->d:Lo/ezm;

    invoke-static {v1}, Lo/ezm;->e(Lo/ezm;)Lo/ezm$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ezm$e;->c(Landroid/view/View;)V

    .line 167
    iget-object v0, p0, Lo/ezm$5;->d:Lo/ezm;

    invoke-static {v0, p1}, Lo/ezm;->b(Lo/ezm;Ljava/util/List;)V

    .line 169
    const/4 v0, 0x0

    return v0
.end method
