.class public Lo/bgh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bgh$c;,
        Lo/bgh$e;
    }
.end annotation


# static fields
.field private static a:Ljava/util/regex/Pattern;

.field private static e:Lo/bgh;


# instance fields
.field private b:Landroid/content/Context;

.field public c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache<Ljava/lang/String;Lo/bgh$e;>;"
        }
    .end annotation
.end field

.field private f:[Ljava/lang/String;

.field private g:I

.field private h:[Ljava/lang/String;

.field private k:[Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 71
    new-instance v0, Lo/bgh;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bgh;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/bgh;->e:Lo/bgh;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgh;->k:[Landroid/graphics/drawable/Drawable;

    .line 106
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/bgh;->c:Ljava/util/HashMap;

    .line 115
    iput-object p1, p0, Lo/bgh;->b:Landroid/content/Context;

    .line 117
    new-instance v0, Landroid/support/v4/util/LruCache;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Landroid/support/v4/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lo/bgh;->d:Landroid/support/v4/util/LruCache;

    .line 119
    iget-object v0, p0, Lo/bgh;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->chatListLineSpacingExtra:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lo/bgh;->g:I

    .line 123
    :try_start_0
    invoke-direct {p0}, Lo/bgh;->h()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 132
    goto :goto_0

    .line 125
    :catch_0
    move-exception v2

    .line 127
    const-string v0, "FaceManager"

    const-string v1, "FaceManager SecurityException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    goto :goto_0

    .line 129
    :catch_1
    move-exception v2

    .line 131
    const-string v0, "FaceManager"

    const-string v1, "FaceManager IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    :goto_0
    invoke-direct {p0}, Lo/bgh;->k()Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-static {v0}, Lo/bgh;->a(Ljava/util/regex/Pattern;)V

    .line 135
    return-void
.end method

.method public static a()Lo/bgh;
    .locals 1

    .line 184
    sget-object v0, Lo/bgh;->e:Lo/bgh;

    return-object v0
.end method

.method private static a(Ljava/util/regex/Pattern;)V
    .locals 0

    .line 85
    sput-object p0, Lo/bgh;->a:Ljava/util/regex/Pattern;

    .line 86
    return-void
.end method

.method private b([Ljava/lang/String;)[Ljava/lang/String;
    .locals 4

    .line 513
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 515
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0

    .line 519
    :cond_0
    array-length v0, p1

    new-array v3, v0, [Ljava/lang/String;

    .line 520
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 521
    return-object v3
.end method

.method private c(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 501
    iget-object v0, p0, Lo/bgh;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 502
    return-object v1
.end method

.method private e(Ljava/lang/String;Lo/bgh$c;)Lo/bnt;
    .locals 11

    .line 276
    const/4 v3, 0x0

    .line 277
    const/4 v4, 0x0

    .line 278
    iget-object v0, p0, Lo/bgh;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v5, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 280
    sget-object v0, Lo/bgh$c;->e:Lo/bgh$c;

    if-ne v0, p2, :cond_0

    .line 282
    invoke-direct {p0}, Lo/bgh;->i()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v5

    float-to-int v3, v0

    goto :goto_0

    .line 284
    :cond_0
    sget-object v0, Lo/bgh$c;->a:Lo/bgh$c;

    if-ne v0, p2, :cond_1

    .line 286
    invoke-direct {p0}, Lo/bgh;->g()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v5

    float-to-int v3, v0

    .line 287
    iget v0, p0, Lo/bgh;->g:I

    int-to-float v0, v0

    mul-float/2addr v0, v5

    float-to-int v4, v0

    goto :goto_0

    .line 291
    :cond_1
    invoke-direct {p0}, Lo/bgh;->f()I

    move-result v3

    .line 294
    :goto_0
    iget-object v0, p0, Lo/bgh;->d:Landroid/support/v4/util/LruCache;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "face_bitmap_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/bgh$e;

    .line 296
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 298
    iget-object v7, v6, Lo/bgh$e;->c:Landroid/graphics/drawable/Drawable;

    .line 299
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    iget-object v0, v6, Lo/bgh$e;->b:Lo/bgh$c;

    if-ne v0, p2, :cond_2

    iget v0, v6, Lo/bgh$e;->a:I

    if-ne v0, v3, :cond_2

    .line 301
    new-instance v8, Lo/bnt;

    invoke-direct {v8, v7, v4}, Lo/bnt;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 302
    return-object v8

    .line 308
    :cond_2
    :try_start_0
    const-class v0, Lcom/huawei/android/sns/R$drawable;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    .line 309
    const-class v0, Lcom/huawei/android/sns/R$drawable;

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v8

    .line 310
    invoke-direct {p0, v8}, Lo/bgh;->c(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 312
    if-eqz v9, :cond_5

    .line 314
    sget-object v0, Lo/bgh$c;->a:Lo/bgh$c;

    if-ne v0, p2, :cond_3

    .line 317
    div-int/lit8 v0, v3, 0x10

    mul-int/lit8 v1, v3, 0x11

    div-int/lit8 v1, v1, 0x10

    const/4 v2, 0x0

    invoke-virtual {v9, v2, v0, v3, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_1

    .line 319
    :cond_3
    sget-object v0, Lo/bgh$c;->b:Lo/bgh$c;

    if-ne v0, p2, :cond_4

    .line 321
    div-int/lit8 v0, v3, 0x6

    mul-int/lit8 v1, v3, 0x7

    div-int/lit8 v1, v1, 0x6

    const/4 v2, 0x0

    invoke-virtual {v9, v2, v0, v3, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_1

    .line 325
    :cond_4
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1, v3, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 328
    :goto_1
    new-instance v6, Lo/bgh$e;

    invoke-direct {v6, v9, p2, v3}, Lo/bgh$e;-><init>(Landroid/graphics/drawable/Drawable;Lo/bgh$c;I)V

    .line 329
    iget-object v0, p0, Lo/bgh;->d:Landroid/support/v4/util/LruCache;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "face_bitmap_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    new-instance v10, Lo/bnt;

    invoke-direct {v10, v9, v4}, Lo/bnt;-><init>(Landroid/graphics/drawable/Drawable;I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 332
    return-object v10

    .line 342
    :cond_5
    goto :goto_2

    .line 335
    :catch_0
    move-exception v7

    .line 337
    const-string v0, "FaceManager"

    const-string v1, "createImageSpan, RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    goto :goto_2

    .line 339
    :catch_1
    move-exception v7

    .line 341
    const-string v0, "FaceManager"

    const-string v1, "createImageSpan, Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private e([Landroid/graphics/drawable/Drawable;)[Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 533
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 535
    const/4 v0, 0x0

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    return-object v0

    .line 539
    :cond_0
    array-length v0, p1

    new-array v3, v0, [Landroid/graphics/drawable/Drawable;

    .line 540
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 541
    return-object v3
.end method

.method private f()I
    .locals 3

    .line 144
    const/4 v1, 0x0

    .line 145
    iget-object v0, p0, Lo/bgh;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 146
    if-eqz v2, :cond_0

    .line 148
    sget v0, Lcom/huawei/android/sns/R$dimen;->face_chat_list_size:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    .line 150
    :cond_0
    return v1
.end method

.method private g()I
    .locals 3

    .line 172
    const/4 v1, 0x0

    .line 173
    iget-object v0, p0, Lo/bgh;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 174
    if-eqz v2, :cond_0

    .line 176
    sget v0, Lcom/huawei/android/sns/R$dimen;->face_chat_message_size:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    .line 178
    :cond_0
    return v1
.end method

.method private h()V
    .locals 5

    .line 258
    iget-object v0, p0, Lo/bgh;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$array;->huawei_face_image_name_array:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bgh;->f:[Ljava/lang/String;

    .line 260
    iget-object v0, p0, Lo/bgh;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$array;->huawei_face_code_array:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bgh;->h:[Ljava/lang/String;

    .line 262
    iget-object v0, p0, Lo/bgh;->h:[Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bgh;->f:[Ljava/lang/String;

    if-nez v0, :cond_1

    .line 264
    :cond_0
    return-void

    .line 267
    :cond_1
    iget-object v0, p0, Lo/bgh;->h:[Ljava/lang/String;

    array-length v3, v0

    .line 268
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    .line 270
    iget-object v0, p0, Lo/bgh;->c:Ljava/util/HashMap;

    iget-object v1, p0, Lo/bgh;->h:[Ljava/lang/String;

    aget-object v1, v1, v4

    iget-object v2, p0, Lo/bgh;->f:[Ljava/lang/String;

    aget-object v2, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 272
    :cond_2
    return-void
.end method

.method private i()I
    .locals 3

    .line 158
    const/4 v1, 0x0

    .line 159
    iget-object v0, p0, Lo/bgh;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 160
    if-eqz v2, :cond_0

    .line 162
    sget v0, Lcom/huawei/android/sns/R$dimen;->face_chat_edit_size:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    .line 164
    :cond_0
    return v1
.end method

.method private k()Ljava/util/regex/Pattern;
    .locals 8

    .line 189
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    const/16 v0, 0x28

    :try_start_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 195
    iget-object v4, p0, Lo/bgh;->h:[Ljava/lang/String;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v4, v6

    .line 197
    invoke-static {v7}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    const/16 v0, 0x7c

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 195
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 201
    :cond_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const-string v2, ")"

    invoke-virtual {v3, v0, v1, v2}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 207
    goto :goto_1

    .line 204
    :catch_0
    move-exception v4

    .line 206
    const-string v0, "FaceManager"

    const-string v1, "buildPattern StringIndexOutOfBoundsException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    :goto_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;Lo/bgh$c;)Ljava/lang/CharSequence;
    .locals 9

    .line 222
    if-nez p1, :cond_0

    .line 224
    const-string p1, ""

    .line 227
    :cond_0
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 228
    sget-object v0, Lo/bgh;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 232
    :goto_0
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 234
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v5

    .line 235
    iget-object v0, p0, Lo/bgh;->c:Ljava/util/HashMap;

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 237
    move-object v7, v5

    .line 238
    if-eqz v6, :cond_1

    .line 240
    invoke-direct {p0, v6, p2}, Lo/bgh;->e(Ljava/lang/String;Lo/bgh$c;)Lo/bnt;

    move-result-object v8

    .line 241
    if-eqz v8, :cond_1

    .line 243
    move-object v7, v8

    .line 247
    :cond_1
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->start()I

    move-result v0

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->end()I

    move-result v1

    const/16 v2, 0x21

    invoke-virtual {v3, v7, v0, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 248
    goto :goto_0

    .line 250
    :cond_2
    return-object v3
.end method

.method public b()[Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 548
    iget-object v0, p0, Lo/bgh;->k:[Landroid/graphics/drawable/Drawable;

    .line 549
    return-object v0
.end method

.method public c()[Ljava/lang/String;
    .locals 1

    .line 409
    iget-object v0, p0, Lo/bgh;->h:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/bgh;->b([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()[Landroid/graphics/drawable/Drawable;
    .locals 6

    .line 354
    iget-object v0, p0, Lo/bgh;->f:[Ljava/lang/String;

    array-length v2, v0

    .line 356
    iget-object v0, p0, Lo/bgh;->k:[Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bgh;->k:[Landroid/graphics/drawable/Drawable;

    array-length v0, v0

    if-ne v2, v0, :cond_0

    .line 358
    invoke-virtual {p0}, Lo/bgh;->b()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 361
    :cond_0
    new-array v0, v2, [Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lo/bgh;->k:[Landroid/graphics/drawable/Drawable;

    .line 364
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    .line 368
    :try_start_0
    const-class v0, Lcom/huawei/android/sns/R$drawable;

    iget-object v1, p0, Lo/bgh;->f:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 370
    const-class v0, Lcom/huawei/android/sns/R$drawable;

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v5

    .line 371
    iget-object v0, p0, Lo/bgh;->k:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v5}, Lo/bgh;->c(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    aput-object v1, v0, v4
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    .line 388
    goto :goto_1

    .line 373
    :catch_0
    move-exception v5

    .line 375
    const-string v0, "FaceManager"

    const-string v1, "getHuaweiFaceImages SecurityException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    goto :goto_1

    .line 377
    :catch_1
    move-exception v5

    .line 379
    const-string v0, "FaceManager"

    const-string v1, "getHuaweiFaceImages NoSuchFieldException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    goto :goto_1

    .line 381
    :catch_2
    move-exception v5

    .line 383
    const-string v0, "FaceManager"

    const-string v1, "getHuaweiFaceImages IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    goto :goto_1

    .line 385
    :catch_3
    move-exception v5

    .line 387
    const-string v0, "FaceManager"

    const-string v1, "getHuaweiFaceImages IllegalAccessException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 390
    :cond_1
    iget-object v0, p0, Lo/bgh;->k:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0}, Lo/bgh;->e([Landroid/graphics/drawable/Drawable;)[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Landroid/graphics/drawable/Drawable;
    .locals 10

    .line 436
    mul-int/lit8 v3, p1, 0x17

    .line 437
    add-int/lit8 v4, v3, 0x17

    .line 438
    iget-object v0, p0, Lo/bgh;->f:[Ljava/lang/String;

    array-length v0, v0

    if-le v4, v0, :cond_0

    .line 440
    iget-object v0, p0, Lo/bgh;->f:[Ljava/lang/String;

    array-length v4, v0

    .line 443
    :cond_0
    sub-int v5, v4, v3

    .line 445
    add-int/lit8 v0, v5, 0x1

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lo/bgh;->k:[Landroid/graphics/drawable/Drawable;

    .line 449
    const/4 v7, 0x0

    .line 450
    move v8, v3

    :goto_0
    if-ge v8, v4, :cond_1

    .line 452
    :try_start_0
    const-class v0, Lcom/huawei/android/sns/R$drawable;

    iget-object v1, p0, Lo/bgh;->f:[Ljava/lang/String;

    aget-object v1, v1, v8

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    .line 454
    const-class v0, Lcom/huawei/android/sns/R$drawable;

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v9

    .line 456
    iget-object v0, p0, Lo/bgh;->k:[Landroid/graphics/drawable/Drawable;

    move v1, v7

    add-int/lit8 v7, v7, 0x1

    invoke-direct {p0, v9}, Lo/bgh;->c(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    aput-object v2, v0, v1

    .line 450
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 458
    :cond_1
    iget-object v0, p0, Lo/bgh;->k:[Landroid/graphics/drawable/Drawable;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_face_delete:I

    invoke-direct {p0, v1}, Lo/bgh;->c(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    aput-object v1, v0, v7
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_3

    .line 475
    goto :goto_1

    .line 460
    :catch_0
    move-exception v7

    .line 462
    const-string v0, "FaceManager"

    const-string v1, "getOnePageData NoSuchFieldException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    goto :goto_1

    .line 464
    :catch_1
    move-exception v7

    .line 466
    const-string v0, "FaceManager"

    const-string v1, "getOnePageData IllegalAccessException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    goto :goto_1

    .line 468
    :catch_2
    move-exception v7

    .line 470
    const-string v0, "FaceManager"

    const-string v1, "getOnePageData IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    goto :goto_1

    .line 472
    :catch_3
    move-exception v7

    .line 474
    const-string v0, "FaceManager"

    const-string v1, "getOnePageData NotFoundException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 476
    :goto_1
    iget-object v0, p0, Lo/bgh;->k:[Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0}, Lo/bgh;->e([Landroid/graphics/drawable/Drawable;)[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 404
    invoke-direct {p0}, Lo/bgh;->h()V

    .line 405
    return-void
.end method
