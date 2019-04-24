.class public Lhuawei/widget/effect/engine/HwBlurEngine;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BLUR:Ljava/lang/String; = "Blur"

.field public static final DARKBLUR:Ljava/lang/String; = "DarkBlur"

.field public static final LIGHTBLUR:Ljava/lang/String; = "LightBlur"

.field public static final LIGHTBLURWITHGRAY:Ljava/lang/String; = "LightBlurWithGray"

.field private static final TAG:Ljava/lang/String; = "HwBlurEngine"

.field private static mHwBlurEngine:Lo/fkx; = null

.field private static nHwBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Lhuawei/widget/effect/engine/HwBlurEngine;

    invoke-direct {v0}, Lhuawei/widget/effect/engine/HwBlurEngine;-><init>()V

    sput-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->nHwBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lo/fkx$a;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    return-void
.end method

.method public static blur(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 1

    .line 282
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 283
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-static {p0, p1, p2}, Lo/fkx;->c(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 285
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static blur(Landroid/view/View;II)Landroid/graphics/Bitmap;
    .locals 1

    .line 264
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 265
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-static {p0, p1, p2}, Lo/fkx;->e(Landroid/view/View;II)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 267
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getInstance()Lhuawei/widget/effect/engine/HwBlurEngine;
    .locals 2

    .line 70
    :try_start_0
    invoke-static {}, Lo/fkx;->c()Lo/fkx;

    move-result-object v0

    sput-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    goto :goto_0

    .line 71
    :catch_0
    move-exception v1

    .line 74
    :goto_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->nHwBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    return-object v0
.end method

.method public static getInstance(Landroid/view/View;Lo/fkx$a;)Lhuawei/widget/effect/engine/HwBlurEngine;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 58
    invoke-static {p0, p1}, Lo/fkx;->e(Landroid/view/View;Lo/fkx$a;)Lo/fkx;

    move-result-object v0

    sput-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    .line 59
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->nHwBlurEngine:Lhuawei/widget/effect/engine/HwBlurEngine;

    return-object v0
.end method

.method public static isEnable()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 86
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 87
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-static {}, Lo/fkx;->e()Z

    move-result v0

    return v0

    .line 89
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static setGlobalEnable(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 98
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 99
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-static {p0}, Lo/fkx;->e(Z)V

    .line 101
    :cond_0
    return-void
.end method


# virtual methods
.method public addBlurTargetView(Landroid/view/View;Lo/fkx$a;)V
    .locals 2

    .line 295
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 297
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1, p2}, Lo/fkx;->d(Landroid/view/View;Lo/fkx$a;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 300
    goto :goto_0

    .line 298
    :catch_0
    move-exception v1

    .line 302
    :cond_0
    :goto_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 144
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 145
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1}, Lo/fkx;->d(Landroid/graphics/Canvas;)V

    .line 147
    :cond_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;Landroid/view/View;)V
    .locals 1

    .line 203
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 204
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1, p2}, Lo/fkx;->c(Landroid/graphics/Canvas;Landroid/view/View;)V

    .line 206
    :cond_0
    return-void
.end method

.method public getBlurType(Ljava/lang/String;)Lo/fkx$a;
    .locals 1

    .line 28
    const-string v0, "LightBlurWithGray"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    sget-object v0, Lo/fkx$a;->e:Lo/fkx$a;

    return-object v0

    .line 30
    :cond_0
    const-string v0, "DarkBlur"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 31
    sget-object v0, Lo/fkx$a;->a:Lo/fkx$a;

    return-object v0

    .line 32
    :cond_1
    const-string v0, "LightBlur"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 33
    sget-object v0, Lo/fkx$a;->c:Lo/fkx$a;

    return-object v0

    .line 35
    :cond_2
    sget-object v0, Lo/fkx$a;->d:Lo/fkx$a;

    return-object v0
.end method

.method public isBlurEnable()Z
    .locals 3

    .line 166
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 167
    const/4 v1, 0x0

    .line 169
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0}, Lo/fkx;->a()Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 172
    goto :goto_0

    .line 170
    :catch_0
    move-exception v2

    .line 173
    :goto_0
    return v1

    .line 175
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isDrawingViewSelf()Z
    .locals 3

    .line 327
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 328
    const/4 v1, 0x0

    .line 330
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0}, Lo/fkx;->h()Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 333
    goto :goto_0

    .line 331
    :catch_0
    move-exception v2

    .line 334
    :goto_0
    return v1

    .line 336
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isSettingEnabledBlurEffect(Landroid/content/Context;)Z
    .locals 3

    .line 433
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 434
    const/4 v1, 0x0

    .line 436
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1}, Lo/fkx;->c(Landroid/content/Context;)Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 439
    goto :goto_0

    .line 437
    :catch_0
    move-exception v2

    .line 440
    :goto_0
    return v1

    .line 442
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isShowBlur(Landroid/content/Context;)Z
    .locals 3

    .line 394
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 395
    const/4 v1, 0x0

    .line 397
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1}, Lo/fkx;->e(Landroid/content/Context;)Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 400
    goto :goto_0

    .line 398
    :catch_0
    move-exception v2

    .line 401
    :goto_0
    return v1

    .line 403
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isShowHwBlur()Z
    .locals 3

    .line 184
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 185
    const/4 v1, 0x0

    .line 187
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0}, Lo/fkx;->g()Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 190
    goto :goto_0

    .line 188
    :catch_0
    move-exception v2

    .line 191
    :goto_0
    return v1

    .line 193
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isShowHwBlur(Landroid/view/View;)Z
    .locals 3

    .line 459
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 460
    const/4 v1, 0x0

    .line 462
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1}, Lo/fkx;->a(Landroid/view/View;)Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 465
    goto :goto_0

    .line 463
    :catch_0
    move-exception v2

    .line 466
    :goto_0
    return v1

    .line 468
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isThemeSupportedBlurEffect(Landroid/content/Context;)Z
    .locals 3

    .line 414
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 415
    const/4 v1, 0x0

    .line 417
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1}, Lo/fkx;->a(Landroid/content/Context;)Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 420
    goto :goto_0

    .line 418
    :catch_0
    move-exception v2

    .line 421
    :goto_0
    return v1

    .line 423
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 120
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 121
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0}, Lo/fkx;->b()V

    .line 123
    :cond_0
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 131
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 132
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0}, Lo/fkx;->d()V

    .line 134
    :cond_0
    return-void
.end method

.method public onWindowFocusChanged(Landroid/view/View;ZZ)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 247
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 248
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1, p2, p3}, Lo/fkx;->b(Landroid/view/View;ZZ)V

    .line 250
    :cond_0
    return-void
.end method

.method public onWindowVisibilityChanged(Landroid/view/View;Z)V
    .locals 1

    .line 234
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 235
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1, p2}, Lo/fkx;->e(Landroid/view/View;Z)V

    .line 237
    :cond_0
    return-void
.end method

.method public onWindowVisibilityChanged(Landroid/view/View;ZZ)V
    .locals 1

    .line 216
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 217
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1, p2, p3}, Lo/fkx;->d(Landroid/view/View;ZZ)V

    .line 219
    :cond_0
    return-void
.end method

.method public removeBlurTargetView(Landroid/view/View;)V
    .locals 2

    .line 310
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 312
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1}, Lo/fkx;->d(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 315
    goto :goto_0

    .line 313
    :catch_0
    move-exception v1

    .line 317
    :cond_0
    :goto_0
    return-void
.end method

.method public setBlurEnable(Z)V
    .locals 1

    .line 155
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 156
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1}, Lo/fkx;->b(Z)V

    .line 158
    :cond_0
    return-void
.end method

.method public setEnable(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 109
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 110
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1}, Lo/fkx;->a(Z)V

    .line 112
    :cond_0
    return-void
.end method

.method public setTargetViewBlurEnable(Landroid/view/View;Z)V
    .locals 2

    .line 346
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 348
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1, p2}, Lo/fkx;->d(Landroid/view/View;Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 351
    goto :goto_0

    .line 349
    :catch_0
    move-exception v1

    .line 353
    :cond_0
    :goto_0
    return-void
.end method

.method public setTargetViewCornerRadius(Landroid/view/View;I)V
    .locals 2

    .line 362
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 364
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1, p2}, Lo/fkx;->b(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 367
    goto :goto_0

    .line 365
    :catch_0
    move-exception v1

    .line 369
    :cond_0
    :goto_0
    return-void
.end method

.method public setTargetViewOverlayColor(Landroid/view/View;I)V
    .locals 2

    .line 378
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    if-eqz v0, :cond_0

    .line 380
    :try_start_0
    sget-object v0, Lhuawei/widget/effect/engine/HwBlurEngine;->mHwBlurEngine:Lo/fkx;

    invoke-virtual {v0, p1, p2}, Lo/fkx;->d(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 383
    goto :goto_0

    .line 381
    :catch_0
    move-exception v1

    .line 385
    :cond_0
    :goto_0
    return-void
.end method
