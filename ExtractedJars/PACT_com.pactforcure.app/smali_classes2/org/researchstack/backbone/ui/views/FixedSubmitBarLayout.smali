.class public abstract Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;
.super Landroid/widget/RelativeLayout;
.source "FixedSubmitBarLayout.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/layout/StepLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 20
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->init()V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->init()V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 32
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->init()V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I
    .param p4, "defStyleRes"    # I
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .prologue
    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 40
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->init()V

    .line 41
    return-void
.end method

.method private init()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 48
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 49
    .local v2, "inflater":Landroid/view/LayoutInflater;
    sget v5, Lorg/researchstack/backbone/R$layout;->rsb_layout_fixed_submit_bar:I

    const/4 v6, 0x1

    invoke-virtual {v2, v5, p0, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 52
    sget v5, Lorg/researchstack/backbone/R$id;->rsb_content_container:I

    invoke-virtual {p0, v5}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 53
    .local v1, "contentContainer":Landroid/view/ViewGroup;
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->getContentResourceId()I

    move-result v5

    invoke-virtual {v2, v5, v1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 54
    .local v0, "content":Landroid/view/View;
    invoke-virtual {v1, v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 57
    sget v5, Lorg/researchstack/backbone/R$id;->rsb_submit_bar_guide:I

    invoke-virtual {p0, v5}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 58
    .local v4, "submitBarGuide":Landroid/view/View;
    sget v5, Lorg/researchstack/backbone/R$id;->rsb_submit_bar:I

    invoke-virtual {p0, v5}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lorg/researchstack/backbone/ui/views/SubmitBar;

    .line 79
    .local v3, "submitBar":Lorg/researchstack/backbone/ui/views/SubmitBar;
    return-void
.end method

.method public static toggleBackNavigation(Landroid/support/v7/app/ActionBar;Z)V
    .locals 0
    .param p0, "actionBar"    # Landroid/support/v7/app/ActionBar;
    .param p1, "backAllowed"    # Z

    .prologue
    .line 101
    invoke-virtual {p0, p1}, Landroid/support/v7/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 102
    invoke-virtual {p0, p1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 103
    invoke-virtual {p0, p1}, Landroid/support/v7/app/ActionBar;->setDisplayShowHomeEnabled(Z)V

    .line 104
    return-void
.end method


# virtual methods
.method public abstract getContentResourceId()I
.end method

.method protected toggleBackNavigation(Z)V
    .locals 2
    .param p1, "backAllowed"    # Z

    .prologue
    .line 107
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/support/v7/app/AppCompatActivity;

    .line 108
    .local v1, "activity":Landroid/support/v7/app/AppCompatActivity;
    invoke-virtual {v1}, Landroid/support/v7/app/AppCompatActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    .line 109
    .local v0, "actionBar":Landroid/support/v7/app/ActionBar;
    invoke-static {v0, p1}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;->toggleBackNavigation(Landroid/support/v7/app/ActionBar;Z)V

    .line 110
    return-void
.end method
