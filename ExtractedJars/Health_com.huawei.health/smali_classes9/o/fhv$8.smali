.class final Lo/fhv$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fhv;->a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0

    .line 227
    iput-object p1, p0, Lo/fhv$8;->b:Landroid/content/Context;

    iput-object p2, p0, Lo/fhv$8;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 230
    iget-object v0, p0, Lo/fhv$8;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/fhv$8;->a:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v1}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fhv;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 231
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/fhv$8;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 232
    const-string v0, "url"

    iget-object v1, p0, Lo/fhv$8;->a:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;

    invoke-virtual {v1}, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->getPurchaseUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 233
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x3

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 234
    iget-object v0, p0, Lo/fhv$8;->b:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 235
    return-void
.end method
