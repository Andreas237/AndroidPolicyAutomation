.class Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;->e:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 225
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRunningModePosition() dialog start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;->e:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 227
    sget v0, Lcom/huawei/ui/homewear21/R$layout;->fragment_aw70_select_auto_mode:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 228
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;->e:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;->e:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_auto_change_mode_title:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 230
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1$4;-><init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;)V

    .line 231
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;->e:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;Lo/egw;)Lo/egw;

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;->e:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    invoke-static {v0, v5}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 239
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRunningModePosition() dialog layout fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;->e:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;Lo/egw;)Lo/egw;

    .line 241
    return-void

    .line 243
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$1;->e:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 245
    return-void
.end method
