.class public Lorg/researchstack/backbone/utils/ViewUtils;
.super Ljava/lang/Object;
.source "ViewUtils.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addFilter([Landroid/text/InputFilter;Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 6
    .param p0, "filters"    # [Landroid/text/InputFilter;
    .param p1, "filter"    # Landroid/text/InputFilter;

    .prologue
    const/4 v5, 0x0

    .line 21
    if-eqz p0, :cond_0

    array-length v4, p0

    if-nez v4, :cond_1

    .line 23
    :cond_0
    const/4 v4, 0x1

    new-array p0, v4, [Landroid/text/InputFilter;

    .end local p0    # "filters":[Landroid/text/InputFilter;
    aput-object p1, p0, v5

    .line 44
    :goto_0
    return-object p0

    .line 28
    .restart local p0    # "filters":[Landroid/text/InputFilter;
    :cond_1
    const/4 v0, 0x0

    .local v0, "i":I
    array-length v3, p0

    .local v3, "size":I
    :goto_1
    if-ge v0, v3, :cond_3

    .line 30
    aget-object v4, p0, v0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 32
    aput-object p1, p0, v0

    goto :goto_0

    .line 28
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 39
    :cond_3
    array-length v4, p0

    add-int/lit8 v2, v4, 0x1

    .line 40
    .local v2, "newSize":I
    new-array v1, v2, [Landroid/text/InputFilter;

    .line 41
    .local v1, "newFilters":[Landroid/text/InputFilter;
    array-length v4, p0

    invoke-static {p0, v5, v1, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 42
    add-int/lit8 v4, v2, -0x1

    aput-object p1, v1, v4

    move-object p0, v1

    .line 44
    goto :goto_0
.end method

.method public static createFragment(Ljava/lang/Class;)Landroid/support/v4/app/Fragment;
    .locals 4
    .param p0, "fragmentClass"    # Ljava/lang/Class;

    .prologue
    .line 102
    const/4 v3, 0x0

    :try_start_0
    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {p0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 103
    .local v1, "fragConstructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 104
    .local v2, "fragment":Ljava/lang/Object;
    check-cast v2, Landroid/support/v4/app/Fragment;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .end local v2    # "fragment":Ljava/lang/Object;
    return-object v2

    .line 106
    .end local v1    # "fragConstructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    :catch_0
    move-exception v0

    .line 108
    .local v0, "e":Ljava/lang/Throwable;
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
.end method

.method public static createFragment(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    .locals 3
    .param p0, "className"    # Ljava/lang/String;

    .prologue
    .line 88
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 89
    .local v1, "fragmentClass":Ljava/lang/Class;
    invoke-static {v1}, Lorg/researchstack/backbone/utils/ViewUtils;->createFragment(Ljava/lang/Class;)Landroid/support/v4/app/Fragment;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    return-object v2

    .line 91
    .end local v1    # "fragmentClass":Ljava/lang/Class;
    :catch_0
    move-exception v0

    .line 93
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public static disableSoftInputFromAppearing(Landroid/widget/EditText;)V
    .locals 3
    .param p0, "editText"    # Landroid/widget/EditText;

    .prologue
    const/4 v2, 0x1

    .line 50
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 52
    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setRawInputType(I)V

    .line 53
    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setTextIsSelectable(Z)V

    .line 60
    :goto_0
    return-void

    .line 57
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setRawInputType(I)V

    .line 58
    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setFocusable(Z)V

    goto :goto_0
.end method

.method public static hideSoftInputMethod(Landroid/content/Context;)V
    .locals 4
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 64
    instance-of v2, p0, Landroid/app/Activity;

    if-eqz v2, :cond_0

    move-object v2, p0

    .line 66
    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    .line 68
    .local v0, "currentFocus":Landroid/view/View;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 70
    const-string v2, "input_method"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 71
    .local v1, "imm":Landroid/view/inputmethod/InputMethodManager;
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromInputMethod(Landroid/os/IBinder;I)V

    .line 74
    .end local v0    # "currentFocus":Landroid/view/View;
    .end local v1    # "imm":Landroid/view/inputmethod/InputMethodManager;
    :cond_0
    return-void
.end method

.method public static showSoftInputMethod(Landroid/widget/EditText;)V
    .locals 3
    .param p0, "editText"    # Landroid/widget/EditText;

    .prologue
    .line 78
    invoke-virtual {p0}, Landroid/widget/EditText;->requestFocus()Z

    .line 79
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    .line 80
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 81
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 82
    return-void
.end method
