.class Lo/fbv$4$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbv$4;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fbv$4;


# direct methods
.method constructor <init>(Lo/fbv$4;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lo/fbv$4$5;->c:Lo/fbv$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 118
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/fbv$4$5;->c:Lo/fbv$4;

    iget-object v0, v0, Lo/fbv$4;->e:Lo/fbv;

    invoke-static {v0}, Lo/fbv;->d(Lo/fbv;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/PressureCalibrateActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 119
    const-string v0, "pressure_is_have_datas"

    iget-object v1, p0, Lo/fbv$4$5;->c:Lo/fbv$4;

    iget-object v1, v1, Lo/fbv$4;->e:Lo/fbv;

    invoke-static {v1}, Lo/fbv;->a(Lo/fbv;)Z

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 120
    iget-object v0, p0, Lo/fbv$4$5;->c:Lo/fbv$4;

    iget-object v0, v0, Lo/fbv$4;->e:Lo/fbv;

    invoke-static {v0}, Lo/fbv;->d(Lo/fbv;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 121
    return-void
.end method
