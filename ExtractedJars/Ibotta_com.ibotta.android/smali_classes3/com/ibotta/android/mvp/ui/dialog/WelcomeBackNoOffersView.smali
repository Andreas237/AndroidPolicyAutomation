.class public Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackNoOffersView;
.super Landroid/support/constraint/ConstraintLayout;
.source "WelcomeBackNoOffersView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;)V

    .line 18
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackNoOffersView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackNoOffersView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackNoOffersView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 32
    new-instance v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/support/constraint/ConstraintLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackNoOffersView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackNoOffersView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01f7

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void
.end method
