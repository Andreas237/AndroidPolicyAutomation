.class public Lo/bwd;
.super Landroid/widget/CheckBox;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    .line 20
    invoke-direct {p0}, Lo/bwd;->e()V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    invoke-direct {p0}, Lo/bwd;->e()V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    return-void
.end method

.method private e()V
    .locals 1

    .line 29
    const/16 v0, 0x11

    invoke-virtual {p0, v0}, Lo/bwd;->setGravity(I)V

    .line 30
    invoke-static {}, Lo/bzp;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->sug_download_w_selector:I

    invoke-virtual {p0, v0}, Lo/bwd;->setBackgroundResource(I)V

    goto :goto_0

    .line 33
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->sug_download_selector:I

    invoke-virtual {p0, v0}, Lo/bwd;->setBackgroundResource(I)V

    .line 35
    :goto_0
    return-void
.end method
