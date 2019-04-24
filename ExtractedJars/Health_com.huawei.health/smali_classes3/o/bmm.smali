.class public Lo/bmm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/app/ActionBar;)Landroid/view/ViewGroup;
    .locals 4

    .line 20
    if-nez p0, :cond_0

    .line 22
    const/4 v0, 0x0

    return-object v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 28
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 30
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/ActionBar;->setDisplayShowHomeEnabled(Z)V

    .line 32
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 34
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/ActionBar;->setDisplayShowCustomEnabled(Z)V

    .line 35
    invoke-virtual {p0}, Landroid/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    .line 36
    const/4 v0, 0x0

    return-object v0

    .line 38
    :cond_1
    invoke-virtual {p0}, Landroid/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_actionbar_custom_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout;

    .line 40
    invoke-virtual {p0, v3}, Landroid/app/ActionBar;->setCustomView(Landroid/view/View;)V

    .line 42
    return-object v3
.end method

.method public static a(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 66
    invoke-static {}, Lo/bom;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 75
    :goto_0
    return-void
.end method

.method public static b(Landroid/app/ActionBar;IF)V
    .locals 1

    .line 88
    invoke-static {}, Lo/bom;->c()Z

    move-result v0

    .line 93
    return-void
.end method

.method public static b(Landroid/app/ActionBar;Landroid/view/View;)V
    .locals 2

    .line 47
    invoke-static {}, Lo/bom;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    invoke-static {p0}, Lo/bmm;->a(Landroid/app/ActionBar;)Landroid/view/ViewGroup;

    move-result-object v1

    .line 56
    if-eqz v1, :cond_1

    .line 58
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 59
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 62
    :cond_1
    :goto_0
    return-void
.end method

.method public static b(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 79
    invoke-static {}, Lo/bom;->c()Z

    move-result v0

    .line 84
    return-void
.end method
