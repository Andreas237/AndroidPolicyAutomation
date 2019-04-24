.class Lcom/tencent/connect/avatar/ImageActivity$a;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/connect/avatar/ImageActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/connect/avatar/ImageActivity;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/avatar/ImageActivity;Landroid/content/Context;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lcom/tencent/connect/avatar/ImageActivity$a;->a:Lcom/tencent/connect/avatar/ImageActivity;

    .line 298
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 299
    return-void
.end method


# virtual methods
.method public a(Landroid/widget/Button;)V
    .locals 6

    .line 302
    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 304
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$a;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "com.tencent.plus.blue_normal.png"

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/ImageActivity;->a(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 305
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$a;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "com.tencent.plus.blue_down.png"

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/ImageActivity;->a(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 306
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$a;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "com.tencent.plus.blue_disable.png"

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/ImageActivity;->a(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 308
    sget-object v0, Landroid/view/View;->PRESSED_ENABLED_STATE_SET:[I

    invoke-virtual {v2, v0, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 309
    sget-object v0, Landroid/view/View;->ENABLED_FOCUSED_STATE_SET:[I

    invoke-virtual {v2, v0, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 310
    sget-object v0, Landroid/view/View;->ENABLED_STATE_SET:[I

    invoke-virtual {v2, v0, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 311
    sget-object v0, Landroid/view/View;->FOCUSED_STATE_SET:[I

    invoke-virtual {v2, v0, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 312
    sget-object v0, Landroid/view/View;->EMPTY_STATE_SET:[I

    invoke-virtual {v2, v0, v5}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 313
    invoke-virtual {p1, v2}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 314
    return-void
.end method

.method public b(Landroid/widget/Button;)V
    .locals 6

    .line 317
    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 319
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$a;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "com.tencent.plus.gray_normal.png"

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/ImageActivity;->a(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 320
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$a;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "com.tencent.plus.gray_down.png"

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/ImageActivity;->a(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 321
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$a;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "com.tencent.plus.gray_disable.png"

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/ImageActivity;->a(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 323
    sget-object v0, Landroid/view/View;->PRESSED_ENABLED_STATE_SET:[I

    invoke-virtual {v2, v0, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 324
    sget-object v0, Landroid/view/View;->ENABLED_FOCUSED_STATE_SET:[I

    invoke-virtual {v2, v0, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 325
    sget-object v0, Landroid/view/View;->ENABLED_STATE_SET:[I

    invoke-virtual {v2, v0, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 326
    sget-object v0, Landroid/view/View;->FOCUSED_STATE_SET:[I

    invoke-virtual {v2, v0, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 327
    sget-object v0, Landroid/view/View;->EMPTY_STATE_SET:[I

    invoke-virtual {v2, v0, v5}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 329
    invoke-virtual {p1, v2}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 330
    return-void
.end method
