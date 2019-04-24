.class public Lo/fhh;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field private a:Z

.field b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 0

    .line 15
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 16
    iput-object p1, p0, Lo/fhh;->b:Landroid/content/Context;

    .line 17
    iput-boolean p2, p0, Lo/fhh;->a:Z

    .line 18
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 23
    iget-boolean v0, p0, Lo/fhh;->a:Z

    if-eqz v0, :cond_0

    .line 24
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/fhh;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfMaxHeartRateActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/fhh;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 28
    :goto_0
    iget-object v0, p0, Lo/fhh;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 29
    iget-object v0, p0, Lo/fhh;->b:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 31
    :cond_1
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 35
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 36
    const-string v0, "#fb6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 37
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 38
    return-void
.end method
