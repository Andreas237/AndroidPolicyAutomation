.class Lo/alj$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alj;->c(Landroid/content/Context;Lo/alj$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/alj$d;

.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Lo/alj;


# direct methods
.method constructor <init>(Lo/alj;Landroid/content/Context;Lo/alj$d;)V
    .locals 0

    .line 326
    iput-object p1, p0, Lo/alj$3;->e:Lo/alj;

    iput-object p2, p0, Lo/alj$3;->d:Landroid/content/Context;

    iput-object p3, p0, Lo/alj$3;->b:Lo/alj$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 329
    iget-object v0, p0, Lo/alj$3;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/alj$3;->b:Lo/alj$d;

    const/4 v2, 0x2

    invoke-static {v0, v2, v1}, Lo/alj;->d(Landroid/content/Context;ILo/alj$d;)V

    .line 330
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 331
    iget-object v0, p0, Lo/alj$3;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 332
    const-string v0, "msgId"

    iget-object v1, p0, Lo/alj$3;->b:Lo/alj$d;

    iget-object v1, v1, Lo/alj$d;->b:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 333
    const-string v0, "detailUri"

    iget-object v1, p0, Lo/alj$3;->b:Lo/alj$d;

    iget-object v1, v1, Lo/alj$d;->c:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 334
    const-string v0, "EXTRA_BI_NAME"

    iget-object v1, p0, Lo/alj$3;->b:Lo/alj$d;

    iget-object v1, v1, Lo/alj$d;->a:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 335
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "ADDIALOG"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 336
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 337
    iget-object v0, p0, Lo/alj$3;->d:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 338
    return-void
.end method
