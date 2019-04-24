.class public Lo/bay;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo/bbp;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 33
    new-instance v0, Lo/bbg;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bbg;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/bay;->a:Lo/bbp;

    .line 34
    sget-object v0, Lo/bay;->a:Lo/bbp;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_assist_msg_default_img:I

    invoke-virtual {v1, v2}, Lo/bbe;->e(I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbp;->c(Landroid/graphics/Bitmap;)V

    .line 36
    sget-object v0, Lo/bay;->a:Lo/bbp;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbe;->d()Lo/bbj;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbp;->a(Lo/bbj;)V

    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lo/bbi;)Landroid/graphics/Bitmap;
    .locals 1

    .line 99
    sget-object v0, Lo/bay;->a:Lo/bbp;

    invoke-virtual {v0, p0}, Lo/bbp;->e(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 88
    sget-object v0, Lo/bay;->a:Lo/bbp;

    invoke-virtual {v0, p0}, Lo/bbp;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/widget/ImageView;Ljava/lang/String;J)V
    .locals 4

    .line 50
    if-eqz p0, :cond_1

    .line 52
    if-eqz p1, :cond_0

    .line 55
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lo/bbh;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 56
    new-instance v3, Lo/baw;

    invoke-direct {v3, p1, v2}, Lo/baw;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->n()I

    move-result v0

    iput v0, v3, Lo/bbi;->d:I

    .line 58
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->n()I

    move-result v0

    iput v0, v3, Lo/bbi;->a:I

    .line 60
    sget-object v0, Lo/bay;->a:Lo/bbp;

    invoke-virtual {v0, v3, p0}, Lo/bbp;->e(Lo/bbi;Landroid/widget/ImageView;)V

    .line 61
    goto :goto_0

    .line 64
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_assist_msg_default_img:I

    invoke-static {p0, v0}, Lo/bbq;->a(Landroid/widget/ImageView;I)V

    .line 67
    :cond_1
    :goto_0
    return-void
.end method

.method public static e(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 77
    sget-object v0, Lo/bay;->a:Lo/bbp;

    invoke-virtual {v0, p0, p1}, Lo/bbp;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    .line 78
    return-void
.end method
