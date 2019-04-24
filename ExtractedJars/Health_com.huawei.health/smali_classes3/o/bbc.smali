.class public Lo/bbc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo/bbp;

.field private static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 34
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v3

    .line 35
    new-instance v0, Lo/bbg;

    invoke-direct {v0, v3}, Lo/bbg;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/bbc;->a:Lo/bbp;

    .line 36
    sget-object v0, Lo/bbc;->a:Lo/bbp;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_ic_picture_def:I

    invoke-virtual {v1, v2}, Lo/bbe;->e(I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbp;->c(Landroid/graphics/Bitmap;)V

    .line 37
    sget-object v0, Lo/bbc;->a:Lo/bbp;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbe;->d()Lo/bbj;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbp;->a(Lo/bbj;)V

    .line 38
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_dynamic_pic_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    sput v0, Lo/bbc;->d:I

    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 3

    .line 48
    if-eqz p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->k()Ljava/lang/String;

    move-result-object v1

    .line 51
    new-instance v2, Lo/bbd;

    const/4 v0, 0x1

    invoke-direct {v2, p1, v1, v0}, Lo/bbd;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 52
    sget v0, Lo/bbc;->d:I

    iput v0, v2, Lo/bbi;->a:I

    .line 53
    sget v0, Lo/bbc;->d:I

    iput v0, v2, Lo/bbi;->d:I

    .line 54
    sget-object v0, Lo/bbc;->a:Lo/bbp;

    invoke-virtual {v0, v2, p0}, Lo/bbp;->e(Lo/bbi;Landroid/widget/ImageView;)V

    .line 56
    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 2

    .line 75
    sget-object v0, Lo/bbc;->a:Lo/bbp;

    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbh;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lo/bbp;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    .line 65
    sget-object v0, Lo/bbc;->a:Lo/bbp;

    invoke-virtual {v0, p0}, Lo/bbp;->c(Ljava/lang/String;)V

    .line 66
    return-void
.end method
