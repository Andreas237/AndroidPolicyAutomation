.class public Lo/bmo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)I
    .locals 8

    .line 315
    const/4 v2, 0x0

    .line 316
    const/4 v3, 0x0

    .line 317
    const/4 v4, 0x0

    .line 318
    const/4 v5, 0x0

    .line 319
    const/4 v6, 0x0

    .line 322
    const-string v0, "com.android.internal.R$dimen"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 323
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    .line 324
    const-string v0, "status_bar_height"

    invoke-virtual {v2, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 325
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 326
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    move v6, v0

    .line 327
    return v6

    .line 329
    :catch_0
    move-exception v7

    .line 331
    const-string v0, "UiUtil"

    const-string v1, "getStatusBarHeight RuntimeException"

    invoke-static {v0, v1, v7}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 336
    goto :goto_0

    .line 333
    :catch_1
    move-exception v7

    .line 335
    const-string v0, "UiUtil"

    const-string v1, "getStatusBarHeight Exception"

    invoke-static {v0, v1, v7}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 337
    :goto_0
    return v6
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 6

    .line 177
    const-string v2, "androidhwext"

    .line 180
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 182
    if-nez v3, :cond_0

    .line 184
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".R$"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 185
    invoke-virtual {v4, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    .line 186
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    move-result v3

    .line 189
    :cond_0
    return v3

    .line 191
    :catch_0
    move-exception v3

    .line 193
    const-string v0, "UiUtil"

    const-string v1, "loadResourceId ClassNotFoundException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    goto :goto_0

    .line 195
    :catch_1
    move-exception v3

    .line 197
    const-string v0, "UiUtil"

    const-string v1, "loadResourceId NoSuchFieldException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    goto :goto_0

    .line 199
    :catch_2
    move-exception v3

    .line 201
    const-string v0, "UiUtil"

    const-string v1, "loadResourceId NumberFormatException:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    goto :goto_0

    .line 203
    :catch_3
    move-exception v3

    .line 205
    const-string v0, "UiUtil"

    const-string v1, "loadResourceId IllegalAccessException:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private static a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 224
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 226
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "class is null in staticFun"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 228
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 230
    if-eqz p4, :cond_3

    .line 232
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "paramsType is null, but params is not null"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 237
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p4, :cond_2

    .line 239
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "paramsType or params should be same"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 241
    :cond_2
    array-length v0, p3

    array-length v1, p4

    if-eq v0, v1, :cond_3

    .line 243
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "paramsType len:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " should equal params.len:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :cond_3
    const/4 v3, 0x0

    .line 249
    :try_start_0
    invoke-virtual {p0, p2, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v3

    .line 252
    :try_start_1
    invoke-virtual {v3, p1, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v0

    return-object v0

    .line 254
    :catch_0
    move-exception v4

    .line 256
    const-string v0, "UiUtil"

    const-string v1, "invokeFun IllegalAccessException:"

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    goto :goto_0

    .line 258
    :catch_1
    move-exception v4

    .line 260
    const-string v0, "UiUtil"

    const-string v1, "invokeFun IllegalArgumentException:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    goto :goto_0

    .line 262
    :catch_2
    move-exception v4

    .line 264
    const-string v0, "UiUtil"

    const-string v1, "invokeFun InvocationTargetException:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 274
    :goto_0
    goto :goto_1

    .line 267
    :catch_3
    move-exception v4

    .line 269
    throw v4

    .line 271
    :catch_4
    move-exception v4

    .line 273
    const-string v0, "UiUtil"

    const-string v1, "invokeFun Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a()Z
    .locals 1

    .line 54
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)I
    .locals 1

    .line 307
    const/high16 v0, 0x42920000    # 73.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method public static b(Landroid/widget/SearchView;)V
    .locals 8

    .line 363
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 365
    invoke-virtual {p0}, Landroid/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "android:id/search_src_text"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 366
    if-lez v4, :cond_0

    .line 368
    invoke-virtual {p0, v4}, Landroid/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 369
    instance-of v0, v5, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 371
    move-object v6, v5

    check-cast v6, Landroid/widget/TextView;

    .line 372
    invoke-virtual {p0}, Landroid/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 373
    invoke-virtual {p0}, Landroid/widget/SearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$dimen;->sns_search_view_textsize_five:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 372
    invoke-static {v0, v1}, Lo/boi;->a(Landroid/content/Context;F)I

    move-result v7

    .line 374
    int-to-float v0, v7

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 378
    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Context;)I
    .locals 1

    .line 151
    sget v0, Lcom/huawei/android/sns/R$color;->sns_tab_color_emui5_selected:I

    invoke-static {p0, v0}, Lo/bmo;->c(Landroid/content/Context;I)I

    move-result v0

    return v0
.end method

.method private static c(Landroid/content/Context;I)I
    .locals 1

    .line 164
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    return v0
.end method

.method public static c()Z
    .locals 2

    .line 387
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    .line 388
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "en"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 387
    return v0
.end method

.method public static d(Landroid/app/Activity;)V
    .locals 3

    .line 65
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 66
    const/high16 v0, 0x4000000

    const/high16 v1, 0x4000000

    invoke-virtual {v2, v0, v1}, Landroid/view/Window;->setFlags(II)V

    .line 68
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p0, v0}, Lo/bmo;->e(Landroid/app/Activity;Ljava/lang/Boolean;)Z

    .line 69
    return-void
.end method

.method public static e(Landroid/content/Context;)I
    .locals 5

    .line 345
    const/4 v3, 0x0

    .line 346
    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 347
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x10102eb

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 349
    iget v0, v4, Landroid/util/TypedValue;->data:I

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 350
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 349
    invoke-static {v0, v1}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v3

    .line 352
    :cond_0
    return v3
.end method

.method private static e(Landroid/app/Activity;Ljava/lang/Boolean;)Z
    .locals 6

    .line 129
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v5

    .line 130
    const-string v0, "UiUtil"

    const-string v1, "setHwFloating"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setHwFloating"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v0, v5, v1, v2, v3}, Lo/bmo;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    const/4 v0, 0x1

    return v0

    .line 136
    :catch_0
    move-exception v5

    .line 138
    const-string v0, "UiUtil"

    const-string v1, "setHwFloating Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const/4 v0, 0x0

    return v0
.end method
