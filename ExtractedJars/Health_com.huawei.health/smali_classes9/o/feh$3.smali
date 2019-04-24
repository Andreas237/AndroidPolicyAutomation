.class final Lo/feh$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/feh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lo/ewj;


# direct methods
.method constructor <init>(Lo/ewj;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lo/feh$3;->c:Lo/ewj;

    iput-object p2, p0, Lo/feh$3;->b:Landroid/content/Context;

    iput-object p3, p0, Lo/feh$3;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 79
    const-string v0, "WeightDevicePressureUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onItemClick position = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lo/feh$3;->c:Lo/ewj;

    invoke-virtual {v0, p3}, Lo/ewj;->e(I)Lo/afa;

    move-result-object v4

    .line 81
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 82
    iget-object v0, p0, Lo/feh$3;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/feh$3;->a:Ljava/lang/String;

    invoke-virtual {v4}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj;

    iget-object v2, v2, Lo/afj;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/feh;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    :cond_0
    invoke-static {}, Lo/feh;->a()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-static {}, Lo/feh;->a()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    invoke-static {}, Lo/feh;->a()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 86
    const/4 v0, 0x0

    invoke-static {v0}, Lo/feh;->c(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 88
    :cond_1
    return-void
.end method
