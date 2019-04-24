.class Lo/enw$2$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enw$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/enw$2;


# direct methods
.method constructor <init>(Lo/enw$2;)V
    .locals 0

    .line 455
    iput-object p1, p0, Lo/enw$2$4;->d:Lo/enw$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 458
    const-string v0, "CompatibilityInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogToMigrate setNegativeButton onclick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    iget-object v0, p0, Lo/enw$2$4;->d:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->c:Lo/enw;

    invoke-static {v0}, Lo/enw;->e(Lo/enw;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 460
    iget-object v0, p0, Lo/enw$2$4;->d:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->c:Lo/enw;

    invoke-static {v0}, Lo/enw;->e(Lo/enw;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 461
    iget-object v0, p0, Lo/enw$2$4;->d:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->c:Lo/enw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/enw;->e(Lo/enw;Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 463
    :cond_0
    iget-object v0, p0, Lo/enw$2$4;->d:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 464
    iget-object v0, p0, Lo/enw$2$4;->d:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "CANCLE"

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 466
    :cond_1
    return-void
.end method
