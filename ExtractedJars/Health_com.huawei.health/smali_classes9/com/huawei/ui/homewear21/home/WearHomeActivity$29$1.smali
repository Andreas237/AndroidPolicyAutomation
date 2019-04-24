.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$29;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/CompoundButton;

.field final synthetic c:Z

.field final synthetic d:Lcom/huawei/ui/homewear21/home/WearHomeActivity$29;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$29;ZLandroid/widget/CompoundButton;)V
    .locals 0

    .line 3186
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity$29;

    iput-boolean p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;->c:Z

    iput-object p3, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;->a:Landroid/widget/CompoundButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 3189
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onClick: HOME_1010052"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3191
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 3192
    iget-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;->c:Z

    if-eqz v0, :cond_0

    .line 3193
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity$29;

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_service_area_notice_title:I

    .line 3194
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_GPS_file_dialog_content:I

    .line 3195
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_apphelp_pwindows_continue_button:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$1;

    invoke-direct {v2, p0, v5}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$1;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;Ljava/util/Map;)V

    .line 3196
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$2;

    invoke-direct {v2, p0, v5}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$2;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;Ljava/util/Map;)V

    .line 3205
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v6

    .line 3213
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v7

    .line 3214
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/egv;->setCanceledOnTouchOutside(Z)V

    .line 3215
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/egv;->setCancelable(Z)V

    .line 3216
    invoke-virtual {v7}, Lo/egv;->show()V

    .line 3219
    goto :goto_0

    .line 3220
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lo/dqi;->g(Ljava/lang/String;)V

    .line 3221
    const-string v0, "click"

    const-string v1, "0"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3223
    :goto_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iD:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 3224
    return-void
.end method
