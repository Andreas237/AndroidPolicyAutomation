.class public Lo/fhs;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field a:Landroid/content/Context;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fhs;->c:Ljava/lang/String;

    .line 22
    iput-object p1, p0, Lo/fhs;->a:Landroid/content/Context;

    .line 23
    iput-object p2, p0, Lo/fhs;->c:Ljava/lang/String;

    .line 25
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 28
    const-string v0, "MyClickableSpan"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClickableSpan_onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/fhs;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 31
    iget-object v0, p0, Lo/fhs;->a:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 32
    const-string v0, "MyClickableSpan"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClickableSpan_START"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    const-string v0, "Agreement_key"

    iget-object v1, p0, Lo/fhs;->c:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 34
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 35
    iget-object v0, p0, Lo/fhs;->a:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 37
    :cond_0
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 40
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 41
    const-string v0, "#fb6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 42
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 43
    return-void
.end method
