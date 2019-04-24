.class public Lo/bom;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:I

.field private static c:Z

.field private static final d:Ljava/lang/String;

.field private static e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const-class v0, Lo/bom;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bom;->d:Ljava/lang/String;

    .line 85
    const/4 v0, -0x1

    sput v0, Lo/bom;->b:I

    .line 90
    const/4 v0, 0x0

    sput-boolean v0, Lo/bom;->c:Z

    .line 135
    const-string v0, "simpleui_mode"

    sput-object v0, Lo/bom;->a:Ljava/lang/String;

    .line 139
    invoke-static {}, Lo/bom;->f()V

    .line 140
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Z
    .locals 2

    .line 424
    sget v0, Lo/bom;->e:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 426
    const/4 v0, 0x1

    return v0

    .line 430
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b()Z
    .locals 2

    .line 442
    sget v0, Lo/bom;->e:I

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    .line 444
    const/4 v0, 0x1

    return v0

    .line 448
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Landroid/view/View;IILandroid/content/Context;)V
    .locals 10

    .line 349
    invoke-static {}, Lo/bom;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 351
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/Class;

    const-class v0, Landroid/content/Context;

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 354
    const-string v0, "com.huawei.android.immersion.ImmersionStyle"

    const-string v1, "getPrimaryColor"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p3, v2, v3

    invoke-static {v0, v1, v5, v2}, Lo/bon;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 355
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 357
    move-object v0, v6

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 358
    const-string v0, "com.huawei.android.immersion.ImmersionStyle"

    const-string v1, "getSuggestionForgroundColorStyle"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 359
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 358
    invoke-static {v0, v1, v2}, Lo/bon;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 360
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 362
    move-object v0, v8

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 363
    const/4 v0, 0x0

    if-ne v0, v9, :cond_0

    .line 365
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 369
    :cond_0
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 376
    :cond_1
    :goto_0
    invoke-static {}, Lo/bom;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 378
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 380
    :cond_2
    return-void
.end method

.method public static c()Z
    .locals 1

    .line 387
    sget-boolean v0, Lo/bom;->c:Z

    return v0
.end method

.method public static d()Z
    .locals 2

    .line 149
    sget v0, Lo/bom;->b:I

    const/16 v1, 0x29

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(Landroid/widget/TextView;IILandroid/content/Context;)V
    .locals 10

    .line 305
    invoke-static {}, Lo/bom;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 308
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/Class;

    const-class v0, Landroid/content/Context;

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 310
    const-string v0, "com.huawei.android.immersion.ImmersionStyle"

    const-string v1, "getPrimaryColor"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p3, v2, v3

    invoke-static {v0, v1, v6, v2}, Lo/bon;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 311
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 313
    move-object v0, v5

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 314
    const-string v0, "com.huawei.android.immersion.ImmersionStyle"

    const-string v1, "getSuggestionForgroundColorStyle"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 315
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 314
    invoke-static {v0, v1, v2}, Lo/bon;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 316
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 318
    move-object v0, v8

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 319
    const/4 v0, 0x0

    if-ne v0, v9, :cond_0

    .line 321
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 325
    :cond_0
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 332
    :cond_1
    :goto_0
    invoke-static {}, Lo/bom;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 334
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 336
    :cond_2
    return-void
.end method

.method public static e()Z
    .locals 2

    .line 159
    sget v0, Lo/bom;->b:I

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static f()V
    .locals 9

    .line 167
    invoke-static {}, Lo/bom;->h()I

    move-result v0

    sput v0, Lo/bom;->e:I

    .line 169
    sget-object v0, Lo/bom;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getEmuiType emuiVersionCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lo/bom;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    sget v0, Lo/bom;->e:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 174
    const/16 v0, 0x32

    sput v0, Lo/bom;->b:I

    goto :goto_0

    .line 176
    :cond_0
    sget v0, Lo/bom;->e:I

    const/16 v1, 0xa

    if-lt v0, v1, :cond_1

    .line 178
    const/16 v0, 0x29

    sput v0, Lo/bom;->b:I

    goto :goto_0

    .line 180
    :cond_1
    sget v0, Lo/bom;->e:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_2

    .line 182
    const/16 v0, 0x28

    sput v0, Lo/bom;->b:I

    goto :goto_0

    .line 184
    :cond_2
    sget v0, Lo/bom;->e:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_3

    .line 186
    const/16 v0, 0x1f

    sput v0, Lo/bom;->b:I

    goto :goto_0

    .line 188
    :cond_3
    sget v0, Lo/bom;->e:I

    const/4 v1, 0x7

    if-lt v0, v1, :cond_4

    .line 190
    const/16 v0, 0x1e

    sput v0, Lo/bom;->b:I

    .line 193
    :cond_4
    :goto_0
    sget v0, Lo/bom;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    .line 195
    const-string v3, "EmotionUI_3.0"

    .line 196
    const-string v4, "EmotionUI_3.1"

    .line 197
    const-string v5, "EmotionUI_4.0"

    .line 198
    const-string v6, "EmotionUI_4.1"

    .line 199
    const-string v7, "EmotionUI_5.0"

    .line 201
    sget-object v8, Lo/bps$a;->a:Ljava/lang/String;

    .line 203
    sget-object v0, Lo/bom;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isNeed2UseHwEmui :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    const-string v0, "EmotionUI_3.0"

    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 207
    const/16 v0, 0x1e

    sput v0, Lo/bom;->b:I

    goto :goto_1

    .line 209
    :cond_5
    const-string v0, "EmotionUI_3.1"

    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 211
    const/16 v0, 0x1f

    sput v0, Lo/bom;->b:I

    goto :goto_1

    .line 213
    :cond_6
    const-string v0, "EmotionUI_4.0"

    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 215
    const/16 v0, 0x28

    sput v0, Lo/bom;->b:I

    goto :goto_1

    .line 217
    :cond_7
    const-string v0, "EmotionUI_4.1"

    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 219
    const/16 v0, 0x29

    sput v0, Lo/bom;->b:I

    goto :goto_1

    .line 221
    :cond_8
    const-string v0, "EmotionUI_5.0"

    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 223
    const/16 v0, 0x32

    sput v0, Lo/bom;->b:I

    .line 227
    :cond_9
    :goto_1
    invoke-static {}, Lo/bom;->o()Z

    move-result v0

    sput-boolean v0, Lo/bom;->c:Z

    .line 228
    invoke-static {}, Lo/bom;->g()V

    .line 229
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 231
    sget-object v0, Lo/bom;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "init emui version is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lo/bom;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", hasActionBarEx="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-boolean v2, Lo/bom;->c:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    :cond_a
    return-void
.end method

.method private static g()V
    .locals 0

    .line 257
    return-void
.end method

.method private static h()I
    .locals 2

    .line 278
    const/4 v1, 0x0

    .line 290
    return v1
.end method

.method public static i()Z
    .locals 2

    .line 460
    sget v0, Lo/bom;->e:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 462
    const/4 v0, 0x1

    return v0

    .line 466
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static k()Z
    .locals 2

    .line 475
    const/4 v1, 0x0

    .line 486
    return v1
.end method

.method private static o()Z
    .locals 4

    .line 396
    const/4 v2, 0x0

    .line 401
    :try_start_0
    sget v0, Lo/bom;->b:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 404
    const/4 v2, 0x1

    .line 411
    :cond_0
    goto :goto_0

    .line 407
    :catch_0
    move-exception v3

    .line 410
    sget-object v0, Lo/bom;->d:Ljava/lang/String;

    const-string v1, "ActionBarEx class not found: "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    :goto_0
    return v2
.end method
