.class Lo/erl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/erl;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

.field final synthetic d:Lo/erl;


# direct methods
.method constructor <init>(Lo/erl;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lo/erl$2;->d:Lo/erl;

    iput-object p2, p0, Lo/erl$2;->b:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 118
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/erl$2;->d:Lo/erl;

    invoke-static {v0}, Lo/erl;->c(Lo/erl;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 119
    const-string v0, "url"

    iget-object v1, p0, Lo/erl$2;->b:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 120
    iget-object v0, p0, Lo/erl$2;->d:Lo/erl;

    invoke-static {v0}, Lo/erl;->c(Lo/erl;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 121
    return-void
.end method
