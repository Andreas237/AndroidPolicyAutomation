.class public Lo/agh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;I)V
    .locals 6

    .line 85
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 86
    const-string v0, "UiCommonUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toastPrompt context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    return-void

    .line 89
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 90
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 91
    const-string v0, "UiCommonUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toastPrompt context.getResources() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void

    .line 94
    :cond_1
    invoke-virtual {v4, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 95
    invoke-static {p0, v5}, Lo/agh;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 98
    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    .line 52
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 53
    const-string v0, "UiCommonUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toastPrompt context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    return-void

    .line 56
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 57
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 58
    new-instance v5, Landroid/widget/Toast;

    invoke-direct {v5, p0}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 59
    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 60
    sget v0, Lcom/huawei/plugindevice/R$drawable;->common_ui_toast_frame_emui:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 61
    sget v0, Lcom/huawei/plugindevice/R$color;->common_ui_text_white:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    const/4 v0, 0x1

    const/high16 v1, 0x41400000    # 12.0f

    invoke-virtual {v6, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 63
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    const/16 v0, 0x11

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 65
    invoke-virtual {v5, v6}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 66
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/Toast;->setDuration(I)V

    .line 67
    invoke-virtual {v5}, Landroid/widget/Toast;->show()V

    .line 68
    const-string v0, "UiCommonUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toastPrompt toast is showing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    :cond_1
    return-void
.end method
