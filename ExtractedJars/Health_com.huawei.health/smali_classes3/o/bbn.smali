.class public Lo/bbn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lo/bbp;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 44
    new-instance v0, Lo/bbg;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bbg;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/bbn;->c:Lo/bbp;

    .line 45
    sget-object v0, Lo/bbn;->c:Lo/bbp;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_message_head_portrait:I

    invoke-virtual {v1, v2}, Lo/bbe;->e(I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbp;->c(Landroid/graphics/Bitmap;)V

    .line 47
    sget-object v0, Lo/bbn;->c:Lo/bbp;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbe;->d()Lo/bbj;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbp;->a(Lo/bbj;)V

    .line 48
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 7

    .line 215
    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lo/bbn;->c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static a(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 102
    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lo/bbn;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 103
    return-void
.end method

.method private static b(Lo/bbf;ZZZ)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 193
    invoke-virtual {p0, p3}, Lo/bbf;->c(Z)V

    .line 194
    if-eqz p3, :cond_0

    const/16 v0, 0x438

    goto :goto_0

    :cond_0
    const/16 v0, 0xb4

    :goto_0
    iput v0, p0, Lo/bbf;->d:I

    .line 195
    if-eqz p3, :cond_1

    const/16 v0, 0x438

    goto :goto_1

    :cond_1
    const/16 v0, 0xb4

    :goto_1
    iput v0, p0, Lo/bbf;->a:I

    .line 196
    if-eqz p1, :cond_2

    .line 198
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/bbf;->d(Z)V

    .line 200
    :cond_2
    sget-object v0, Lo/bbn;->c:Lo/bbp;

    invoke-virtual {v0, p0, p2}, Lo/bbp;->c(Lo/bbi;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 2

    .line 58
    if-eqz p0, :cond_1

    .line 60
    if-eqz p1, :cond_0

    .line 62
    new-instance v1, Lo/bbr;

    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lo/bbr;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const/16 v0, 0x438

    iput v0, v1, Lo/bbi;->a:I

    .line 64
    const/16 v0, 0x438

    iput v0, v1, Lo/bbi;->d:I

    .line 66
    sget-object v0, Lo/bbn;->c:Lo/bbp;

    invoke-virtual {v0, v1, p0}, Lo/bbp;->e(Lo/bbi;Landroid/widget/ImageView;)V

    .line 67
    goto :goto_0

    .line 70
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_nopic_white:I

    invoke-static {p0, v0}, Lo/bbq;->a(Landroid/widget/ImageView;I)V

    .line 73
    :cond_1
    :goto_0
    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .line 302
    sget-object v0, Lo/bbn;->c:Lo/bbp;

    invoke-virtual {v0, p0}, Lo/bbp;->c(Ljava/lang/String;)V

    .line 303
    return-void
.end method

.method public static b(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 281
    sget-object v0, Lo/bbn;->c:Lo/bbp;

    invoke-virtual {v0, p0, p1}, Lo/bbp;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    .line 282
    return-void
.end method

.method public static b(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 292
    sget-object v0, Lo/bbn;->c:Lo/bbp;

    invoke-virtual {v0, p0, p1}, Lo/bbp;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 293
    return-void
.end method

.method private static c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;
    .locals 7

    .line 248
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 250
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 252
    :cond_2
    new-instance v0, Lo/bbf;

    move-wide v1, p0

    move-object v3, p4

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/bbf;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v0

    .line 253
    const/16 v0, 0xb4

    iput v0, v6, Lo/bbf;->d:I

    .line 254
    const/16 v0, 0xb4

    iput v0, v6, Lo/bbf;->a:I

    .line 255
    if-eqz p5, :cond_3

    .line 257
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/bbf;->d(Z)V

    .line 259
    :cond_3
    sget-object v0, Lo/bbn;->c:Lo/bbp;

    invoke-virtual {v0, v6, p6}, Lo/bbp;->b(Lo/bbi;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private static c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7

    .line 119
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_message_head_portrait:I

    invoke-static {p2, v0}, Lo/bbq;->a(Landroid/widget/ImageView;I)V

    .line 122
    return-void

    .line 125
    :cond_0
    if-eqz p2, :cond_1

    .line 127
    new-instance v0, Lo/bbf;

    move-wide v1, p0

    move-object v3, p5

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/bbf;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v0

    .line 128
    invoke-static {v6, p6, p2}, Lo/bbn;->d(Lo/bbf;ZLandroid/widget/ImageView;)V

    .line 130
    :cond_1
    return-void
.end method

.method public static d(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 7

    .line 230
    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lo/bbn;->c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private static d(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Landroid/graphics/drawable/Drawable;
    .locals 7

    .line 174
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    const/4 v0, 0x0

    return-object v0

    .line 178
    :cond_0
    new-instance v0, Lo/bbf;

    move-wide v1, p0

    move-object v3, p4

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/bbf;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v0

    .line 179
    const/4 v0, 0x1

    invoke-static {v6, p5, p6, v0}, Lo/bbn;->b(Lo/bbf;ZZZ)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 270
    sget-object v0, Lo/bbn;->c:Lo/bbp;

    invoke-virtual {v0, p0}, Lo/bbp;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private static d(Lo/bbf;ZLandroid/widget/ImageView;)V
    .locals 1

    .line 134
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/bbf;->c(Z)V

    .line 135
    const/16 v0, 0x438

    iput v0, p0, Lo/bbf;->d:I

    .line 136
    const/16 v0, 0x438

    iput v0, p0, Lo/bbf;->a:I

    .line 137
    if-eqz p1, :cond_0

    .line 139
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/bbf;->d(Z)V

    .line 141
    :cond_0
    sget-object v0, Lo/bbn;->c:Lo/bbp;

    invoke-virtual {v0, p0, p2}, Lo/bbp;->e(Lo/bbi;Landroid/widget/ImageView;)V

    .line 142
    return-void
.end method

.method public static e(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 7

    .line 156
    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lo/bbn;->d(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public static e(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 87
    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lo/bbn;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 88
    return-void
.end method
