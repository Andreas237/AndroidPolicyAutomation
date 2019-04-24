.class Lo/esv$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esv;->k(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/esv;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/esv;Ljava/lang/String;)V
    .locals 0

    .line 1880
    iput-object p1, p0, Lo/esv$15;->a:Lo/esv;

    iput-object p2, p0, Lo/esv$15;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 1883
    iget-object v0, p0, Lo/esv$15;->a:Lo/esv;

    invoke-static {v0}, Lo/esv;->a(Lo/esv;)Lo/esx;

    move-result-object v0

    iget-object v0, v0, Lo/esx;->y:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1885
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1886
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lo/esv$15;->a:Lo/esv;

    iget-object v0, v0, Lo/esv;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1887
    const/4 v6, 0x0

    .line 1888
    iget-object v0, p0, Lo/esv$15;->b:Ljava/lang/String;

    const-string v1, "OPPO"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1889
    iget-object v0, p0, Lo/esv$15;->a:Lo/esv;

    iget-object v0, v0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1890
    const-string v6, "https://resourcephs1.vmall.com/OPPO_note/EMUI9.0/C001B001/zh-CN/index.html"

    goto :goto_0

    .line 1892
    :cond_0
    const-string v6, "https://resourcephs2.vmall.com/handbook/OPPO_note/EMUI9.0/C001B001/en-US/index.html"

    .line 1894
    :goto_0
    const-string v0, "phone_type"

    const-string v1, "oppo"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1896
    :cond_1
    iget-object v0, p0, Lo/esv$15;->b:Ljava/lang/String;

    const-string v1, "vivo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1897
    iget-object v0, p0, Lo/esv$15;->a:Lo/esv;

    iget-object v0, v0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1898
    const-string v6, "https://resourcephs1.vmall.com/vivo_note/EMUI9.0/C001B001/zh-CN/index.html"

    goto :goto_1

    .line 1900
    :cond_2
    const-string v6, "https://resourcephs2.vmall.com/handbook/vivo_note/EMUI9.0/C001B001/en-US/index.html"

    .line 1902
    :goto_1
    const-string v0, "phone_type"

    const-string v1, "oppo"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1904
    :cond_3
    sget-object v0, Lo/dae;->jc:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 1905
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1906
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openWebviewActivity url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1907
    const-string v0, "url"

    invoke-virtual {v5, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1908
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1909
    iget-object v0, p0, Lo/esv$15;->a:Lo/esv;

    iget-object v0, v0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1911
    return-void
.end method
