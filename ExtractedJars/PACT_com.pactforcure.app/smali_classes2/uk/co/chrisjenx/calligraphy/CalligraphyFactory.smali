.class Luk/co/chrisjenx/calligraphy/CalligraphyFactory;
.super Ljava/lang/Object;
.source "CalligraphyFactory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luk/co/chrisjenx/calligraphy/CalligraphyFactory$ToolbarLayoutListener;
    }
.end annotation


# static fields
.field private static final ACTION_BAR_SUBTITLE:Ljava/lang/String; = "action_bar_subtitle"

.field private static final ACTION_BAR_TITLE:Ljava/lang/String; = "action_bar_title"


# instance fields
.field private final mAttributeId:[I


# direct methods
.method public constructor <init>(I)V
    .locals 2
    .param p1, "attributeId"    # I

    .prologue
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p1, v0, v1

    iput-object v0, p0, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->mAttributeId:[I

    .line 101
    return-void
.end method

.method private getDefaultTypeface(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "fontPath"    # Ljava/lang/String;

    .prologue
    .line 174
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    invoke-static {}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->get()Luk/co/chrisjenx/calligraphy/CalligraphyConfig;

    move-result-object v0

    invoke-virtual {v0}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->getFontPath()Ljava/lang/String;

    move-result-object p2

    .line 177
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 178
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-static {v0, p2}, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->load(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 180
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected static getStyleForTextView(Landroid/widget/TextView;)[I
    .locals 5
    .param p0, "view"    # Landroid/widget/TextView;

    .prologue
    const v4, 0x10102ce

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 30
    const/4 v1, 0x2

    new-array v0, v1, [I

    fill-array-data v0, :array_0

    .line 32
    .local v0, "styleIds":[I
    invoke-static {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->isActionBarTitle(Landroid/widget/TextView;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 33
    aput v4, v0, v3

    .line 34
    const v1, 0x10102f8

    aput v1, v0, v2

    .line 39
    :cond_0
    :goto_0
    aget v1, v0, v3

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 41
    invoke-static {}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->get()Luk/co/chrisjenx/calligraphy/CalligraphyConfig;

    move-result-object v1

    invoke-virtual {v1}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->getClassStyles()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 42
    invoke-static {}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->get()Luk/co/chrisjenx/calligraphy/CalligraphyConfig;

    move-result-object v1

    invoke-virtual {v1}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->getClassStyles()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_1
    aput v1, v0, v3

    .line 45
    :cond_1
    return-object v0

    .line 35
    :cond_2
    invoke-static {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->isActionBarSubTitle(Landroid/widget/TextView;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 36
    aput v4, v0, v3

    .line 37
    const v1, 0x10102f9

    aput v1, v0, v2

    goto :goto_0

    .line 42
    :cond_3
    const v1, 0x1010034

    goto :goto_1

    .line 30
    :array_0
    .array-data 4
        -0x1
        -0x1
    .end array-data
.end method

.method protected static isActionBarSubTitle(Landroid/widget/TextView;)Z
    .locals 3
    .param p0, "view"    # Landroid/widget/TextView;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 72
    const-string v1, "action_bar_subtitle"

    invoke-static {p0, v1}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->matchesResourceIdName(Landroid/view/View;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 77
    :goto_0
    return v1

    .line 73
    :cond_0
    invoke-static {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->parentIsToolbarV7(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 74
    invoke-virtual {p0}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    .line 75
    .local v0, "parent":Landroid/support/v7/widget/Toolbar;
    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    goto :goto_0

    .line 77
    .end local v0    # "parent":Landroid/support/v7/widget/Toolbar;
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method protected static isActionBarTitle(Landroid/widget/TextView;)Z
    .locals 3
    .param p0, "view"    # Landroid/widget/TextView;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 56
    const-string v1, "action_bar_title"

    invoke-static {p0, v1}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->matchesResourceIdName(Landroid/view/View;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 61
    :goto_0
    return v1

    .line 57
    :cond_0
    invoke-static {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->parentIsToolbarV7(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 58
    invoke-virtual {p0}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    .line 59
    .local v0, "parent":Landroid/support/v7/widget/Toolbar;
    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    goto :goto_0

    .line 61
    .end local v0    # "parent":Landroid/support/v7/widget/Toolbar;
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method protected static matchesResourceIdName(Landroid/view/View;Ljava/lang/String;)Z
    .locals 3
    .param p0, "view"    # Landroid/view/View;
    .param p1, "matches"    # Ljava/lang/String;

    .prologue
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 94
    :goto_0
    return v1

    .line 93
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    .line 94
    .local v0, "resourceEntryName":Ljava/lang/String;
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    goto :goto_0
.end method

.method protected static parentIsToolbarV7(Landroid/view/View;)Z
    .locals 1
    .param p0, "view"    # Landroid/view/View;

    .prologue
    .line 81
    invoke-static {}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->canCheckForV7Toolbar()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/Toolbar;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private resolveFontPath(Landroid/content/Context;Landroid/util/AttributeSet;)Ljava/lang/String;
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 188
    iget-object v1, p0, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->mAttributeId:[I

    invoke-static {p1, p2, v1}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->pullFontPathFromView(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ljava/lang/String;

    move-result-object v0

    .line 191
    .local v0, "textViewFont":Ljava/lang/String;
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 192
    iget-object v1, p0, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->mAttributeId:[I

    invoke-static {p1, p2, v1}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->pullFontPathFromStyle(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ljava/lang/String;

    move-result-object v0

    .line 196
    :cond_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 197
    iget-object v1, p0, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->mAttributeId:[I

    invoke-static {p1, p2, v1}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->pullFontPathFromTextAppearance(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ljava/lang/String;

    move-result-object v0

    .line 200
    :cond_1
    return-object v0
.end method


# virtual methods
.method public onViewCreated(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 113
    if-eqz p1, :cond_0

    sget v0, Luk/co/chrisjenx/calligraphy/R$id;->calligraphy_tag_id:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-eq v0, v1, :cond_0

    .line 114
    invoke-virtual {p0, p1, p2, p3}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->onViewCreatedInternal(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 115
    sget v0, Luk/co/chrisjenx/calligraphy/R$id;->calligraphy_tag_id:I

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 117
    :cond_0
    return-object p1
.end method

.method onViewCreatedInternal(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 12
    .param p1, "view"    # Landroid/view/View;
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 121
    instance-of v7, p1, Landroid/widget/TextView;

    if-eqz v7, :cond_4

    move-object v7, p1

    .line 125
    check-cast v7, Landroid/widget/TextView;

    invoke-virtual {v7}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v7

    invoke-static {v7}, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->isLoaded(Landroid/graphics/Typeface;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 171
    .end local p1    # "view":Landroid/view/View;
    :cond_0
    :goto_0
    return-void

    .line 132
    .restart local p1    # "view":Landroid/view/View;
    :cond_1
    invoke-direct {p0, p2, p3}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->resolveFontPath(Landroid/content/Context;Landroid/util/AttributeSet;)Ljava/lang/String;

    move-result-object v4

    .line 135
    .local v4, "textViewFont":Ljava/lang/String;
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v7, p1

    .line 136
    check-cast v7, Landroid/widget/TextView;

    invoke-static {v7}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->getStyleForTextView(Landroid/widget/TextView;)[I

    move-result-object v3

    .line 137
    .local v3, "styleForTextView":[I
    aget v7, v3, v9

    const/4 v10, -0x1

    if-eq v7, v10, :cond_6

    .line 138
    aget v7, v3, v8

    aget v10, v3, v9

    iget-object v11, p0, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->mAttributeId:[I

    invoke-static {p2, v7, v10, v11}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->pullFontPathFromTheme(Landroid/content/Context;II[I)Ljava/lang/String;

    move-result-object v4

    .line 144
    .end local v3    # "styleForTextView":[I
    :cond_2
    :goto_1
    const-string v7, "action_bar_title"

    invoke-static {p1, v7}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->matchesResourceIdName(Landroid/view/View;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_3

    const-string v7, "action_bar_subtitle"

    invoke-static {p1, v7}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->matchesResourceIdName(Landroid/view/View;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    :cond_3
    move v0, v9

    .local v0, "deferred":Z
    :goto_2
    move-object v7, p1

    .line 146
    check-cast v7, Landroid/widget/TextView;

    invoke-static {}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->get()Luk/co/chrisjenx/calligraphy/CalligraphyConfig;

    move-result-object v10

    invoke-static {p2, v7, v10, v4, v0}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Luk/co/chrisjenx/calligraphy/CalligraphyConfig;Ljava/lang/String;Z)V

    .line 151
    .end local v0    # "deferred":Z
    .end local v4    # "textViewFont":Ljava/lang/String;
    :cond_4
    invoke-static {}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->canCheckForV7Toolbar()Z

    move-result v7

    if-eqz v7, :cond_5

    instance-of v7, p1, Landroid/support/v7/widget/Toolbar;

    if-eqz v7, :cond_5

    move-object v5, p1

    .line 152
    check-cast v5, Landroid/support/v7/widget/Toolbar;

    .line 153
    .local v5, "toolbar":Landroid/support/v7/widget/Toolbar;
    invoke-virtual {v5}, Landroid/support/v7/widget/Toolbar;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v7

    new-instance v10, Luk/co/chrisjenx/calligraphy/CalligraphyFactory$ToolbarLayoutListener;

    const/4 v11, 0x0

    invoke-direct {v10, p0, p2, v5, v11}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory$ToolbarLayoutListener;-><init>(Luk/co/chrisjenx/calligraphy/CalligraphyFactory;Landroid/content/Context;Landroid/support/v7/widget/Toolbar;Luk/co/chrisjenx/calligraphy/CalligraphyFactory$1;)V

    invoke-virtual {v7, v10}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 157
    .end local v5    # "toolbar":Landroid/support/v7/widget/Toolbar;
    :cond_5
    instance-of v7, p1, Luk/co/chrisjenx/calligraphy/HasTypeface;

    if-eqz v7, :cond_8

    .line 158
    invoke-direct {p0, p2, p3}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->resolveFontPath(Landroid/content/Context;Landroid/util/AttributeSet;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, p2, v7}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->getDefaultTypeface(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v6

    .line 159
    .local v6, "typeface":Landroid/graphics/Typeface;
    if-eqz v6, :cond_0

    .line 160
    check-cast p1, Luk/co/chrisjenx/calligraphy/HasTypeface;

    .end local p1    # "view":Landroid/view/View;
    invoke-interface {p1, v6}, Luk/co/chrisjenx/calligraphy/HasTypeface;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_0

    .line 140
    .end local v6    # "typeface":Landroid/graphics/Typeface;
    .restart local v3    # "styleForTextView":[I
    .restart local v4    # "textViewFont":Ljava/lang/String;
    .restart local p1    # "view":Landroid/view/View;
    :cond_6
    aget v7, v3, v8

    iget-object v10, p0, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->mAttributeId:[I

    invoke-static {p2, v7, v10}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->pullFontPathFromTheme(Landroid/content/Context;I[I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .end local v3    # "styleForTextView":[I
    :cond_7
    move v0, v8

    .line 144
    goto :goto_2

    .line 162
    .end local v4    # "textViewFont":Ljava/lang/String;
    :cond_8
    invoke-static {}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->get()Luk/co/chrisjenx/calligraphy/CalligraphyConfig;

    move-result-object v7

    invoke-virtual {v7}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->isCustomViewTypefaceSupport()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-static {}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->get()Luk/co/chrisjenx/calligraphy/CalligraphyConfig;

    move-result-object v7

    invoke-virtual {v7, p1}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->isCustomViewHasTypeface(Landroid/view/View;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 163
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-string v10, "setTypeface"

    invoke-static {v7, v10}, Luk/co/chrisjenx/calligraphy/ReflectionUtils;->getMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 164
    .local v2, "setTypeface":Ljava/lang/reflect/Method;
    invoke-direct {p0, p2, p3}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->resolveFontPath(Landroid/content/Context;Landroid/util/AttributeSet;)Ljava/lang/String;

    move-result-object v1

    .line 165
    .local v1, "fontPath":Ljava/lang/String;
    invoke-direct {p0, p2, v1}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->getDefaultTypeface(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v6

    .line 166
    .restart local v6    # "typeface":Landroid/graphics/Typeface;
    if-eqz v2, :cond_0

    if-eqz v6, :cond_0

    .line 167
    new-array v7, v9, [Ljava/lang/Object;

    aput-object v6, v7, v8

    invoke-static {p1, v2, v7}, Luk/co/chrisjenx/calligraphy/ReflectionUtils;->invokeMethod(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    goto/16 :goto_0
.end method
