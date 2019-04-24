.class public Lcom/tencent/connect/avatar/ImageActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;,
        Lcom/tencent/connect/avatar/ImageActivity$a;
    }
.end annotation


# instance fields
.field a:Landroid/widget/RelativeLayout;

.field private b:Lcom/tencent/connect/auth/QQToken;

.field private c:Ljava/lang/String;

.field private d:Landroid/os/Handler;

.field private e:Lcom/tencent/connect/avatar/c;

.field private f:Landroid/widget/Button;

.field private g:Landroid/widget/Button;

.field private h:Lcom/tencent/connect/avatar/b;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/ProgressBar;

.field private k:I

.field private l:Z

.field private m:J

.field private n:I

.field private final o:I

.field private final p:I

.field private q:Landroid/graphics/Rect;

.field private r:Ljava/lang/String;

.field private s:Landroid/graphics/Bitmap;

.field private final t:Landroid/view/View$OnClickListener;

.field private final u:Landroid/view/View$OnClickListener;

.field private final v:Lcom/tencent/tauth/IUiListener;

.field private final w:Lcom/tencent/tauth/IUiListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 52
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->k:I

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->l:Z

    .line 76
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->m:J

    .line 78
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->n:I

    .line 80
    const/16 v0, 0x280

    iput v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->o:I

    .line 81
    const/16 v0, 0x280

    iput v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->p:I

    .line 82
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;

    .line 447
    new-instance v0, Lcom/tencent/connect/avatar/ImageActivity$2;

    invoke-direct {v0, p0}, Lcom/tencent/connect/avatar/ImageActivity$2;-><init>(Lcom/tencent/connect/avatar/ImageActivity;)V

    iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->t:Landroid/view/View$OnClickListener;

    .line 475
    new-instance v0, Lcom/tencent/connect/avatar/ImageActivity$3;

    invoke-direct {v0, p0}, Lcom/tencent/connect/avatar/ImageActivity$3;-><init>(Lcom/tencent/connect/avatar/ImageActivity;)V

    iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->u:Landroid/view/View$OnClickListener;

    .line 639
    new-instance v0, Lcom/tencent/connect/avatar/ImageActivity$5;

    invoke-direct {v0, p0}, Lcom/tencent/connect/avatar/ImageActivity$5;-><init>(Lcom/tencent/connect/avatar/ImageActivity;)V

    iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->v:Lcom/tencent/tauth/IUiListener;

    .line 706
    new-instance v0, Lcom/tencent/connect/avatar/ImageActivity$6;

    invoke-direct {v0, p0}, Lcom/tencent/connect/avatar/ImageActivity$6;-><init>(Lcom/tencent/connect/avatar/ImageActivity;)V

    iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->w:Lcom/tencent/tauth/IUiListener;

    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 96
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 97
    const/4 v0, 0x1

    iput-boolean v0, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 98
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 99
    invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v3

    .line 101
    if-nez v3, :cond_0

    .line 102
    const/4 v0, 0x0

    return-object v0

    .line 105
    :cond_0
    const/4 v4, 0x0

    .line 107
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v3, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 110
    goto :goto_0

    .line 108
    :catch_0
    move-exception v5

    .line 109
    invoke-virtual {v5}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 111
    :goto_0
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 114
    const/high16 v5, 0x400000

    .line 116
    iget v6, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v7, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 117
    const/4 v8, 0x1

    .line 119
    :goto_1
    mul-int v0, v6, v7

    if-gt v0, v5, :cond_1

    .line 120
    goto :goto_2

    .line 122
    :cond_1
    div-int/lit8 v6, v6, 0x2

    .line 123
    div-int/lit8 v7, v7, 0x2

    .line 124
    mul-int/lit8 v8, v8, 0x2

    goto :goto_1

    .line 126
    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 127
    iput v8, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 129
    invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v3

    .line 131
    const/4 v0, 0x0

    :try_start_1
    invoke-static {v3, v0, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v4

    .line 135
    goto :goto_3

    .line 132
    :catch_1
    move-exception v9

    .line 133
    invoke-virtual {v9}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 134
    const/4 v4, 0x0

    .line 138
    :goto_3
    return-object v4
.end method

.method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;

    return-object p1
.end method

.method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 52
    invoke-direct {p0, p1}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private a()Landroid/view/View;
    .locals 26

    .line 156
    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v5, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 158
    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v6, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 160
    new-instance v7, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v7, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 163
    new-instance v0, Landroid/widget/RelativeLayout;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;

    .line 164
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 165
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 167
    new-instance v8, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 168
    invoke-virtual {v8, v7}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 171
    new-instance v0, Lcom/tencent/connect/avatar/c;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/tencent/connect/avatar/c;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;

    .line 172
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;

    invoke-virtual {v0, v6}, Lcom/tencent/connect/avatar/c;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 173
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Lcom/tencent/connect/avatar/c;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 174
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 176
    new-instance v0, Lcom/tencent/connect/avatar/b;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/tencent/connect/avatar/b;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/avatar/ImageActivity;->h:Lcom/tencent/connect/avatar/b;

    .line 177
    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v9, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 179
    const/16 v0, 0xe

    const/4 v1, -0x1

    invoke-virtual {v9, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 181
    const/16 v0, 0xf

    const/4 v1, -0x1

    invoke-virtual {v9, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 183
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->h:Lcom/tencent/connect/avatar/b;

    invoke-virtual {v0, v9}, Lcom/tencent/connect/avatar/b;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 184
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->h:Lcom/tencent/connect/avatar/b;

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 187
    new-instance v10, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v10, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 188
    new-instance v11, Landroid/widget/RelativeLayout$LayoutParams;

    move-object/from16 v0, p0

    const/high16 v1, 0x42a00000    # 80.0f

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, -0x2

    invoke-direct {v11, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 191
    const/16 v0, 0xe

    const/4 v1, -0x1

    invoke-virtual {v11, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 193
    invoke-virtual {v10, v11}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 194
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 195
    const/16 v0, 0x11

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 196
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v10}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 198
    new-instance v12, Landroid/widget/ImageView;

    move-object/from16 v0, p0

    invoke-direct {v12, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 199
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v0, p0

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v0

    move-object/from16 v1, p0

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-static {v1, v2}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v13, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 201
    invoke-virtual {v12, v13}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 202
    const-string v0, "com.tencent.plus.logo.png"

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 203
    invoke-virtual {v10, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 205
    new-instance v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;

    .line 206
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v14, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 208
    move-object/from16 v0, p0

    const/high16 v1, 0x40e00000    # 7.0f

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 209
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 210
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 211
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    .line 212
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 213
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 218
    new-instance v15, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 219
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    move-object/from16 v1, p0

    const/high16 v2, 0x42700000    # 60.0f

    invoke-static {v1, v2}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v2

    const/4 v1, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    move-object/from16 v16, v0

    .line 223
    move-object/from16 v0, v16

    const/16 v1, 0xc

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 225
    move-object/from16 v0, v16

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 227
    move-object/from16 v0, v16

    invoke-virtual {v15, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 228
    const-string v0, "com.tencent.plus.bar.png"

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v15, v0}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 230
    move-object/from16 v0, p0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v17

    .line 231
    move/from16 v0, v17

    move/from16 v1, v17

    move/from16 v2, v17

    const/4 v3, 0x0

    invoke-virtual {v15, v0, v1, v2, v3}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v15}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 233
    new-instance v0, Lcom/tencent/connect/avatar/ImageActivity$a;

    move-object/from16 v1, p0

    move-object/from16 v2, p0

    invoke-direct {v0, v1, v2}, Lcom/tencent/connect/avatar/ImageActivity$a;-><init>(Lcom/tencent/connect/avatar/ImageActivity;Landroid/content/Context;)V

    move-object/from16 v18, v0

    .line 235
    move-object/from16 v0, p0

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v19

    .line 236
    move-object/from16 v0, p0

    const/high16 v1, 0x40e00000    # 7.0f

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v20

    .line 238
    new-instance v0, Landroid/widget/Button;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;

    .line 239
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    move-object/from16 v1, p0

    const/high16 v2, 0x429c0000    # 78.0f

    invoke-static {v1, v2}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v1

    move-object/from16 v2, p0

    const/high16 v3, 0x42340000    # 45.0f

    invoke-static {v2, v3}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    move-object/from16 v21, v0

    .line 241
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 242
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;

    const-string v1, "\u53d6\u6d88"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 243
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 245
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;

    const/high16 v1, 0x41900000    # 18.0f

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextSize(F)V

    .line 246
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;

    move/from16 v1, v19

    move/from16 v2, v20

    move/from16 v3, v19

    move/from16 v4, v20

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/Button;->setPadding(IIII)V

    .line 249
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/tencent/connect/avatar/ImageActivity$a;->b(Landroid/widget/Button;)V

    .line 250
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;

    invoke-virtual {v15, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 252
    new-instance v0, Landroid/widget/Button;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;

    .line 253
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    move-object/from16 v1, p0

    const/high16 v2, 0x429c0000    # 78.0f

    invoke-static {v1, v2}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v1

    move-object/from16 v2, p0

    const/high16 v3, 0x42340000    # 45.0f

    invoke-static {v2, v3}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    move-object/from16 v22, v0

    .line 255
    move-object/from16 v0, v22

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 257
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 258
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 259
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;

    const/high16 v1, 0x41900000    # 18.0f

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextSize(F)V

    .line 260
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;

    move/from16 v1, v19

    move/from16 v2, v20

    move/from16 v3, v19

    move/from16 v4, v20

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/Button;->setPadding(IIII)V

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;

    const-string v1, "\u9009\u53d6"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 264
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/tencent/connect/avatar/ImageActivity$a;->a(Landroid/widget/Button;)V

    .line 265
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;

    invoke-virtual {v15, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 268
    new-instance v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v23, v0

    .line 269
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    move-object v1, v7

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v24, v0

    .line 271
    move-object/from16 v0, v24

    const/16 v1, 0xd

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 273
    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 274
    const-string v0, "\u79fb\u52a8\u548c\u7f29\u653e"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 275
    move-object/from16 v0, p0

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v0

    move-object/from16 v1, v23

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 276
    move-object/from16 v0, v23

    const/high16 v1, 0x41900000    # 18.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 277
    move-object/from16 v0, v23

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 278
    move-object/from16 v0, v23

    invoke-virtual {v15, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 281
    new-instance v0, Landroid/widget/ProgressBar;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/avatar/ImageActivity;->j:Landroid/widget/ProgressBar;

    .line 282
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    move-object v1, v7

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v25, v0

    .line 284
    move-object/from16 v0, v25

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 286
    move-object/from16 v0, v25

    const/16 v1, 0xf

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 288
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->j:Landroid/widget/ProgressBar;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 289
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->j:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 290
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/avatar/ImageActivity;->j:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 292
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;)Lcom/tencent/connect/avatar/b;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->h:Lcom/tencent/connect/avatar/b;

    return-object v0
.end method

.method private a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 592
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 593
    const-string v0, "key_error_code"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 594
    const-string v0, "key_error_msg"

    invoke-virtual {v1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 595
    const-string v0, "key_error_detail"

    invoke-virtual {v1, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 596
    const-string v0, "key_response"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 597
    const/4 v2, -0x1

    .line 598
    invoke-virtual {p0, v2, v1}, Lcom/tencent/connect/avatar/ImageActivity;->setResult(ILandroid/content/Intent;)V

    .line 599
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 525
    new-instance v1, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;

    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;

    invoke-direct {v1, p0, v0}, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;-><init>(Lcom/tencent/connect/avatar/ImageActivity;Lcom/tencent/connect/auth/QQToken;)V

    .line 526
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->v:Lcom/tencent/tauth/IUiListener;

    invoke-virtual {v1, p1, v0}, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;->setAvator(Landroid/graphics/Bitmap;Lcom/tencent/tauth/IUiListener;)V

    .line 527
    return-void
.end method

.method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/connect/avatar/ImageActivity;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;I)V

    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 2

    .line 558
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->d:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/connect/avatar/ImageActivity$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/connect/avatar/ImageActivity$4;-><init>(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 564
    return-void
.end method

.method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;Z)Z
    .locals 0

    .line 52
    iput-boolean p1, p0, Lcom/tencent/connect/avatar/ImageActivity;->l:Z

    return p1
.end method

.method static synthetic b(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/graphics/Rect;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;

    return-object v0
.end method

.method private b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 143
    invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    .line 144
    const/4 v2, 0x0

    .line 146
    :try_start_0
    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    .line 147
    invoke-static {v3, p1}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v2, v0

    .line 148
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    goto :goto_0

    .line 149
    :catch_0
    move-exception v3

    .line 150
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    .line 152
    :goto_0
    return-object v2
.end method

.method private b()V
    .locals 5

    .line 337
    :try_start_0
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->r:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;

    .line 338
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 339
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot read picture: \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/connect/avatar/ImageActivity;->r:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 347
    :cond_0
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;

    iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/tencent/connect/avatar/c;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 357
    goto :goto_0

    .line 350
    :catch_0
    move-exception v3

    .line 351
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    .line 352
    const-string v4, "\u56fe\u7247\u8bfb\u53d6\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u8be5\u56fe\u7247\u662f\u5426\u6709\u6548"

    .line 353
    const/4 v0, 0x1

    invoke-direct {p0, v4, v0}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;I)V

    .line 354
    invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v4, v0}, Lcom/tencent/connect/avatar/ImageActivity;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->d()V

    .line 367
    :goto_0
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;

    iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->t:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 368
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;

    iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 371
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/tencent/connect/avatar/ImageActivity$1;

    invoke-direct {v1, p0}, Lcom/tencent/connect/avatar/ImageActivity$1;-><init>(Lcom/tencent/connect/avatar/ImageActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 396
    return-void
.end method

.method static synthetic b(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/tencent/connect/avatar/ImageActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;I)V

    return-void
.end method

.method private b(Ljava/lang/String;I)V
    .locals 9

    .line 567
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    .line 568
    invoke-virtual {v4}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 569
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 570
    const/16 v0, 0x8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v1, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 571
    new-instance v7, Landroid/widget/ImageView;

    invoke-direct {v7, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 572
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v0

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {p0, v1}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v8, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 574
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 575
    if-nez p2, :cond_0

    .line 576
    const-string v0, "com.tencent.plus.ic_success.png"

    invoke-direct {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 579
    :cond_0
    const-string v0, "com.tencent.plus.ic_error.png"

    invoke-direct {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 582
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v5, v7, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 583
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 584
    const/16 v0, 0x11

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 585
    invoke-virtual {v4, v5}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 586
    const/16 v0, 0x11

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/widget/Toast;->setGravity(III)V

    .line 587
    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    .line 588
    return-void
.end method

.method static synthetic c(Lcom/tencent/connect/avatar/ImageActivity;)Lcom/tencent/connect/avatar/c;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;

    return-object v0
.end method

.method private c()V
    .locals 22

    .line 486
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v7, v0

    .line 487
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;

    invoke-virtual {v0}, Lcom/tencent/connect/avatar/c;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v8

    .line 488
    const/16 v0, 0x9

    new-array v9, v0, [F

    .line 489
    invoke-virtual {v8, v9}, Landroid/graphics/Matrix;->getValues([F)V

    .line 490
    const/4 v0, 0x2

    aget v10, v9, v0

    .line 491
    const/4 v0, 0x5

    aget v11, v9, v0

    .line 492
    const/4 v0, 0x0

    aget v12, v9, v0

    .line 493
    const/high16 v0, 0x44200000    # 640.0f

    div-float v13, v0, v7

    .line 494
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    sub-float/2addr v0, v10

    div-float/2addr v0, v12

    float-to-int v14, v0

    .line 495
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    sub-float/2addr v0, v11

    div-float/2addr v0, v12

    float-to-int v15, v0

    .line 496
    new-instance v16, Landroid/graphics/Matrix;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/Matrix;-><init>()V

    .line 497
    move-object/from16 v0, v16

    invoke-virtual {v0, v8}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 498
    move-object/from16 v0, v16

    invoke-virtual {v0, v13, v13}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 500
    const v0, 0x44228000    # 650.0f

    div-float/2addr v0, v12

    float-to-int v1, v0

    move/from16 v17, v1

    .line 501
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    sub-int/2addr v0, v14

    move/from16 v1, v17

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v18

    .line 503
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    sub-int/2addr v0, v15

    move/from16 v1, v17

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v19

    .line 505
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;

    move v1, v14

    move v2, v15

    move/from16 v3, v18

    move/from16 v4, v19

    move-object/from16 v5, v16

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v20

    .line 507
    move-object/from16 v0, v20

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x280

    const/16 v4, 0x280

    invoke-static {v0, v1, v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v21

    .line 510
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Bitmap;->recycle()V

    .line 516
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    invoke-direct {v0, v1}, Lcom/tencent/connect/avatar/ImageActivity;->a(Landroid/graphics/Bitmap;)V

    .line 517
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    .line 623
    invoke-direct {p0, p1}, Lcom/tencent/connect/avatar/ImageActivity;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 624
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 625
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 626
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 628
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->j:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 631
    const-string v0, "&gt;"

    const-string v1, ">"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 632
    const-string v0, "&lt;"

    const-string v1, "<"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 633
    const-string v0, "&quot;"

    const-string v1, "\""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 634
    const-string v0, "&#39;"

    const-string v1, "\'"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 635
    const-string v0, "&amp;"

    const-string v1, "&"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 636
    return-object p1
.end method

.method private d()V
    .locals 2

    .line 602
    invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity;->finish()V

    .line 603
    iget v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->n:I

    if-eqz v0, :cond_0

    .line 604
    iget v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->n:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/tencent/connect/avatar/ImageActivity;->overridePendingTransition(II)V

    .line 606
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 612
    iget v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->k:I

    .line 613
    new-instance v2, Lcom/tencent/connect/UserInfo;

    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;

    invoke-direct {v2, p0, v0}, Lcom/tencent/connect/UserInfo;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 614
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->w:Lcom/tencent/tauth/IUiListener;

    invoke-virtual {v2, v0}, Lcom/tencent/connect/UserInfo;->getUserInfo(Lcom/tencent/tauth/IUiListener;)V

    .line 615
    return-void
.end method

.method static synthetic f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic g(Lcom/tencent/connect/avatar/ImageActivity;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->c()V

    return-void
.end method

.method static synthetic h(Lcom/tencent/connect/avatar/ImageActivity;)Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->l:Z

    return v0
.end method

.method static synthetic i(Lcom/tencent/connect/avatar/ImageActivity;)J
    .locals 2

    .line 52
    iget-wide v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->m:J

    return-wide v0
.end method

.method static synthetic j(Lcom/tencent/connect/avatar/ImageActivity;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->d()V

    return-void
.end method

.method static synthetic k(Lcom/tencent/connect/avatar/ImageActivity;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method static synthetic l(Lcom/tencent/connect/avatar/ImageActivity;)Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/os/Handler;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->d:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic n(Lcom/tencent/connect/avatar/ImageActivity;)I
    .locals 1

    .line 52
    iget v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->k:I

    return v0
.end method

.method static synthetic o(Lcom/tencent/connect/avatar/ImageActivity;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->e()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;J)V
    .locals 1

    .line 752
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, p2, p3, v0}, Lcom/tencent/open/utils/Util;->reportBernoulli(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V

    .line 753
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 434
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->setResult(I)V

    .line 435
    invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->d()V

    .line 436
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 12

    .line 401
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 402
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->requestWindowFeature(I)Z

    .line 403
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->setRequestedOrientation(I)V

    .line 404
    invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->a()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->setContentView(Landroid/view/View;)V

    .line 406
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->d:Landroid/os/Handler;

    .line 408
    invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "key_params"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    .line 410
    const-string v0, "picture"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->r:Ljava/lang/String;

    .line 411
    const-string v0, "return_activity"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->c:Ljava/lang/String;

    .line 413
    const-string v0, "appid"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 414
    const-string v0, "access_token"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 415
    const-string v0, "expires_in"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v9

    .line 416
    const-string v0, "openid"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 417
    const-string v0, "exitAnim"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->n:I

    .line 419
    new-instance v0, Lcom/tencent/connect/auth/QQToken;

    invoke-direct {v0, v7}, Lcom/tencent/connect/auth/QQToken;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;

    .line 420
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v2, v9, v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v8, v1}, Lcom/tencent/connect/auth/QQToken;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0, v11}, Lcom/tencent/connect/auth/QQToken;->setOpenId(Ljava/lang/String;)V

    .line 424
    invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->b()V

    .line 427
    invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->e()V

    .line 428
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->m:J

    .line 429
    const-string v0, "10653"

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;J)V

    .line 430
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 440
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 441
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/connect/avatar/c;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 442
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 443
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 445
    :cond_0
    return-void
.end method
