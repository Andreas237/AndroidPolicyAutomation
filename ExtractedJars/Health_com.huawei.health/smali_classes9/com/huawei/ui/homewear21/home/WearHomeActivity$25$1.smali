.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$25$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Z

.field final synthetic d:Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;Z)V
    .locals 0

    .line 3076
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$25$1;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;

    iput-boolean p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$25$1;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 3079
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onClick: HOME_1010024"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3081
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 3082
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3083
    iget-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$25$1;->c:Z

    if-eqz v0, :cond_0

    .line 3084
    const-string v0, "status"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 3086
    :cond_0
    const-string v0, "status"

    const-string v1, "0"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3088
    :goto_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ih:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 3089
    return-void
.end method
