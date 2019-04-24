.class public Lcom/stripe/android/view/IconTextInputLayout;
.super Landroid/support/design/widget/TextInputLayout;
.source "IconTextInputLayout.java"


# instance fields
.field mBounds:Landroid/graphics/Rect;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field mCollapsingTextHelper:Ljava/lang/Object;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field mRecalculateMethod:Ljava/lang/reflect/Method;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/view/IconTextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p3}, Landroid/support/design/widget/TextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    invoke-virtual {p0}, Lcom/stripe/android/view/IconTextInputLayout;->init()V

    return-void
.end method

.method private adjustBounds()V
    .locals 3

    .line 78
    iget-object v0, p0, Lcom/stripe/android/view/IconTextInputLayout;->mCollapsingTextHelper:Ljava/lang/Object;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/view/IconTextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 83
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/stripe/android/view/IconTextInputLayout;->mBounds:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/stripe/android/view/IconTextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getLeft()I

    move-result v1

    invoke-virtual {p0}, Lcom/stripe/android/view/IconTextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getPaddingLeft()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 84
    iget-object v0, p0, Lcom/stripe/android/view/IconTextInputLayout;->mRecalculateMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lcom/stripe/android/view/IconTextInputLayout;->mCollapsingTextHelper:Ljava/lang/Object;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    .line 87
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void

    :cond_1
    :goto_2
    return-void
.end method


# virtual methods
.method init()V
    .locals 3
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 55
    :try_start_0
    const-class v0, Landroid/support/design/widget/TextInputLayout;

    const-string v1, "mCollapsingTextHelper"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/IconTextInputLayout;->mCollapsingTextHelper:Ljava/lang/Object;

    .line 59
    iget-object v0, p0, Lcom/stripe/android/view/IconTextInputLayout;->mCollapsingTextHelper:Ljava/lang/Object;

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "mCollapsedBounds"

    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 63
    iget-object v1, p0, Lcom/stripe/android/view/IconTextInputLayout;->mCollapsingTextHelper:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    iput-object v0, p0, Lcom/stripe/android/view/IconTextInputLayout;->mBounds:Landroid/graphics/Rect;

    .line 65
    iget-object v0, p0, Lcom/stripe/android/view/IconTextInputLayout;->mCollapsingTextHelper:Ljava/lang/Object;

    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "recalculate"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    .line 67
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/IconTextInputLayout;->mRecalculateMethod:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 70
    iput-object v1, p0, Lcom/stripe/android/view/IconTextInputLayout;->mCollapsingTextHelper:Ljava/lang/Object;

    .line 71
    iput-object v1, p0, Lcom/stripe/android/view/IconTextInputLayout;->mBounds:Landroid/graphics/Rect;

    .line 72
    iput-object v1, p0, Lcom/stripe/android/view/IconTextInputLayout;->mRecalculateMethod:Ljava/lang/reflect/Method;

    .line 73
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 42
    invoke-super/range {p0 .. p5}, Landroid/support/design/widget/TextInputLayout;->onLayout(ZIIII)V

    .line 43
    invoke-direct {p0}, Lcom/stripe/android/view/IconTextInputLayout;->adjustBounds()V

    return-void
.end method
