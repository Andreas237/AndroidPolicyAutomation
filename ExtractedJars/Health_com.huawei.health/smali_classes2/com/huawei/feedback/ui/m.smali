.class Lcom/huawei/feedback/ui/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/huawei/feedback/ui/j;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/j;Ljava/lang/String;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lcom/huawei/feedback/ui/m;->b:Lcom/huawei/feedback/ui/j;

    iput-object p2, p0, Lcom/huawei/feedback/ui/m;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 244
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 245
    iget-object v0, p0, Lcom/huawei/feedback/ui/m;->b:Lcom/huawei/feedback/ui/j;

    invoke-static {v0}, Lcom/huawei/feedback/ui/j;->a(Lcom/huawei/feedback/ui/j;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/feedback/ui/FeedbackPicShowActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 246
    const-string v0, "picture_path"

    iget-object v1, p0, Lcom/huawei/feedback/ui/m;->a:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 247
    iget-object v0, p0, Lcom/huawei/feedback/ui/m;->b:Lcom/huawei/feedback/ui/j;

    invoke-static {v0}, Lcom/huawei/feedback/ui/j;->a(Lcom/huawei/feedback/ui/j;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 248
    return-void
.end method
