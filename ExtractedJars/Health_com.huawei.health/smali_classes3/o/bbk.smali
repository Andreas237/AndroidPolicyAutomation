.class public Lo/bbk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final e:Lo/bbb;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 32
    const-class v0, Lo/bbk;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bbk;->a:Ljava/lang/String;

    .line 46
    new-instance v0, Lo/bbb;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bbb;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/bbk;->e:Lo/bbb;

    .line 47
    new-instance v3, Lo/bbj$e;

    const-string v0, "SNS Head Cache"

    invoke-direct {v3, v0}, Lo/bbj$e;-><init>(Ljava/lang/String;)V

    .line 49
    const v0, 0x3d4ccccd    # 0.05f

    invoke-virtual {v3, v0}, Lo/bbj$e;->a(F)V

    .line 50
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    .line 51
    invoke-static {}, Lo/bbq;->d()I

    move-result v2

    .line 50
    invoke-virtual {v1, v2}, Lo/bbe;->e(I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbb;->c(Landroid/graphics/Bitmap;)V

    .line 52
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    new-instance v1, Lo/bbj;

    invoke-direct {v1, v3}, Lo/bbj;-><init>(Lo/bbj$e;)V

    invoke-virtual {v0, v1}, Lo/bbb;->a(Lo/bbj;)V

    .line 54
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 6

    .line 290
    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 329
    if-eqz p0, :cond_0

    .line 331
    invoke-static {p0}, Lo/boe;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 333
    :cond_0
    return-object p0
.end method

.method private static a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;
    .locals 7

    .line 224
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

    .line 226
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 228
    :cond_2
    new-instance v0, Lo/bbf;

    move-wide v1, p0

    move-object v3, p4

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/bbf;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v0

    .line 229
    const/16 v0, 0xb4

    iput v0, v6, Lo/bbf;->d:I

    .line 230
    const/16 v0, 0xb4

    iput v0, v6, Lo/bbf;->a:I

    .line 231
    if-eqz p5, :cond_3

    .line 233
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/bbf;->d(Z)V

    .line 235
    :cond_3
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Lo/bbb;->c(Lo/bbi;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public static a(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 123
    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Lo/bbk;->b(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 124
    return-void
.end method

.method public static a(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 2

    .line 94
    if-eqz p0, :cond_1

    .line 96
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 98
    new-instance v1, Lo/bbi;

    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lo/bbi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const/16 v0, 0xb4

    iput v0, v1, Lo/bbi;->d:I

    .line 100
    const/16 v0, 0xb4

    iput v0, v1, Lo/bbi;->a:I

    .line 102
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-virtual {v0, v1, p0}, Lo/bbb;->e(Lo/bbi;Landroid/widget/ImageView;)V

    .line 103
    goto :goto_0

    .line 106
    :cond_0
    invoke-static {}, Lo/bbq;->d()I

    move-result v0

    invoke-static {p0, v0}, Lo/bbq;->a(Landroid/widget/ImageView;I)V

    .line 109
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 355
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-virtual {v0, p0, p1}, Lo/bbb;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    .line 356
    return-void
.end method

.method public static a(Lo/bbf;)V
    .locals 4

    .line 63
    if-nez p0, :cond_0

    .line 65
    return-void

    .line 67
    :cond_0
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-virtual {p0}, Lo/bbf;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbb;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 69
    if-eqz v2, :cond_1

    .line 71
    sget-object v0, Lo/bbk;->a:Ljava/lang/String;

    const-string v1, "get image drawable from memCache."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    return-void

    .line 74
    :cond_1
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-virtual {v0, p0}, Lo/bbb;->e(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 76
    if-nez v3, :cond_2

    .line 78
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-virtual {v0, p0}, Lo/bbb;->d(Lo/bbf;)V

    goto :goto_0

    .line 82
    :cond_2
    sget-object v0, Lo/bbk;->a:Ljava/lang/String;

    const-string v1, "get image drawable from disk cache."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    :goto_0
    return-void
.end method

.method public static b(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 6

    .line 207
    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/bbk;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 344
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-virtual {v0, p0}, Lo/bbb;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private static b(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7

    .line 160
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 162
    :cond_1
    invoke-static {}, Lo/bbq;->d()I

    move-result v0

    invoke-static {p2, v0}, Lo/bbq;->a(Landroid/widget/ImageView;I)V

    .line 163
    return-void

    .line 166
    :cond_2
    if-eqz p2, :cond_4

    .line 168
    new-instance v0, Lo/bbf;

    move-wide v1, p0

    move-object v3, p5

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/bbf;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v0

    .line 169
    const/16 v0, 0xb4

    iput v0, v6, Lo/bbf;->d:I

    .line 170
    const/16 v0, 0xb4

    iput v0, v6, Lo/bbf;->a:I

    .line 171
    if-eqz p6, :cond_3

    .line 173
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/bbf;->d(Z)V

    .line 175
    :cond_3
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-virtual {v0, v6, p2}, Lo/bbb;->e(Lo/bbi;Landroid/widget/ImageView;)V

    .line 177
    :cond_4
    return-void
.end method

.method private static c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Landroid/graphics/Bitmap;
    .locals 7

    .line 307
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

    .line 309
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 311
    :cond_2
    new-instance v0, Lo/bbf;

    move-wide v1, p0

    move-object v3, p4

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/bbf;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v0

    .line 312
    const/16 v0, 0xb4

    iput v0, v6, Lo/bbf;->d:I

    .line 313
    const/16 v0, 0xb4

    iput v0, v6, Lo/bbf;->a:I

    .line 314
    if-eqz p5, :cond_3

    .line 316
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/bbf;->d(Z)V

    .line 318
    :cond_3
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Lo/bbb;->b(Lo/bbi;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 139
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    invoke-static {p0, p1, p3, p4, p5}, Lo/bbk;->e(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :cond_0
    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lo/bbk;->b(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 144
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    .line 376
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-virtual {v0, p0}, Lo/bbb;->c(Ljava/lang/String;)V

    .line 377
    return-void
.end method

.method public static c(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 366
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-virtual {v0, p0, p1}, Lo/bbb;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 367
    return-void
.end method

.method public static d(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 263
    new-instance v0, Lo/bbk$5;

    move-wide v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/bbk$5;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lo/bbp;->c:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    .line 275
    invoke-virtual {v0, v1, v2}, Lo/bbk$5;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 276
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 386
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-virtual {v0, p0, p1, p2}, Lo/bbb;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 387
    return-void
.end method

.method public static d(Lo/bbt;Landroid/widget/ImageView;)V
    .locals 1

    .line 187
    if-eqz p1, :cond_0

    .line 189
    const/16 v0, 0xb4

    iput v0, p0, Lo/bbt;->d:I

    .line 190
    const/16 v0, 0xb4

    iput v0, p0, Lo/bbt;->a:I

    .line 191
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-virtual {v0, p0, p1}, Lo/bbb;->e(Lo/bbi;Landroid/widget/ImageView;)V

    .line 193
    :cond_0
    return-void
.end method

.method public static e(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 248
    new-instance v0, Lo/bbf;

    move-wide v1, p0

    move-object v3, p4

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/bbf;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v0

    .line 249
    sget-object v0, Lo/bbk;->e:Lo/bbb;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v6, v0, v1}, Lo/bbo;->b(Lo/bbf;Lo/bbp;Landroid/content/Context;)V

    .line 250
    return-void
.end method
