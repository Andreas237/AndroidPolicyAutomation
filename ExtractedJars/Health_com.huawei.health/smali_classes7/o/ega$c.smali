.class public Lo/ega$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ega;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Lo/egc$a;

.field public b:Lo/efo;

.field private c:Lo/egc$b;

.field private d:Landroid/content/Context;

.field public e:Lo/efo;

.field private g:Landroid/graphics/Bitmap;

.field private h:Ljava/lang/Integer;

.field private k:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lo/ega$c;->d:Landroid/content/Context;

    .line 62
    return-void
.end method

.method private a(Lo/ega;)V
    .locals 4

    .line 196
    iget-object v0, p0, Lo/ega$c;->h:Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 197
    sget-object v0, Lo/ega$4;->b:[I

    iget-object v1, p0, Lo/ega$c;->a:Lo/egc$a;

    invoke-virtual {v1}, Lo/egc$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 199
    :pswitch_0
    const/16 v0, 0xff

    const/16 v1, 0x70

    const/16 v2, 0x31

    const/4 v3, 0x3

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p1, Lo/ega;->b:I

    .line 200
    goto :goto_1

    .line 202
    :pswitch_1
    const/16 v0, 0xff

    const/16 v1, 0x6f

    const/16 v2, 0x6f

    const/16 v3, 0x6f

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p1, Lo/ega;->b:I

    .line 203
    goto :goto_1

    .line 205
    :pswitch_2
    const/16 v0, 0xff

    const/16 v1, 0xb0

    const/16 v2, 0x7c

    const/16 v3, 0x8

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p1, Lo/ega;->b:I

    .line 206
    goto :goto_1

    .line 208
    :goto_0
    goto :goto_1

    .line 211
    :cond_0
    iget-object v0, p0, Lo/ega$c;->h:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Lo/ega;->b:I

    .line 213
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private b(Lo/ega;)V
    .locals 2

    .line 122
    iget-object v0, p0, Lo/ega$c;->g:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 123
    sget-object v0, Lo/ega$4;->d:[I

    iget-object v1, p0, Lo/ega$c;->c:Lo/egc$b;

    invoke-virtual {v1}, Lo/egc$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4

    .line 127
    :pswitch_0
    sget-object v0, Lo/ega$4;->b:[I

    iget-object v1, p0, Lo/ega$c;->a:Lo/egc$a;

    invoke-virtual {v1}, Lo/egc$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 129
    :pswitch_1
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_solid_copper.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 130
    goto/16 :goto_5

    .line 132
    :pswitch_2
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_solid_silver.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 133
    goto/16 :goto_5

    .line 135
    :pswitch_3
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_solid_gold.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 136
    goto/16 :goto_5

    .line 138
    :goto_0
    goto/16 :goto_5

    .line 143
    :pswitch_4
    sget-object v0, Lo/ega$4;->b:[I

    iget-object v1, p0, Lo/ega$c;->a:Lo/egc$a;

    invoke-virtual {v1}, Lo/egc$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_2

    goto :goto_1

    .line 145
    :pswitch_5
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_hollow_hexagon_copper.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 146
    goto/16 :goto_5

    .line 148
    :pswitch_6
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_hollow_hexagon_silver.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 149
    goto/16 :goto_5

    .line 151
    :pswitch_7
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_hollow_hexagon_gold.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 152
    goto/16 :goto_5

    .line 154
    :goto_1
    goto/16 :goto_5

    .line 158
    :pswitch_8
    sget-object v0, Lo/ega$4;->b:[I

    iget-object v1, p0, Lo/ega$c;->a:Lo/egc$a;

    invoke-virtual {v1}, Lo/egc$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_3

    goto :goto_2

    .line 160
    :pswitch_9
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_hollow_tetragonum_copper.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 161
    goto/16 :goto_5

    .line 163
    :pswitch_a
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_hollow_tetragonum_silver.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 164
    goto :goto_5

    .line 166
    :pswitch_b
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_hollow_tetragonum_gold.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 167
    goto :goto_5

    .line 169
    :goto_2
    goto :goto_5

    .line 173
    :pswitch_c
    sget-object v0, Lo/ega$4;->b:[I

    iget-object v1, p0, Lo/ega$c;->a:Lo/egc$a;

    invoke-virtual {v1}, Lo/egc$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_4

    goto :goto_3

    .line 175
    :pswitch_d
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_hollow_triangle_copper.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 176
    goto :goto_5

    .line 178
    :pswitch_e
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_hollow_triangle_silver.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 179
    goto :goto_5

    .line 181
    :pswitch_f
    iget-object v0, p0, Lo/ega$c;->d:Landroid/content/Context;

    const-string v1, "medal/medal_back_icon_hollow_triangle_gold.png"

    invoke-static {v0, v1}, Lo/eff;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 182
    goto :goto_5

    .line 184
    :goto_3
    goto :goto_5

    .line 188
    :goto_4
    goto :goto_5

    .line 191
    :cond_0
    iget-object v0, p0, Lo/ega$c;->g:Landroid/graphics/Bitmap;

    iput-object v0, p1, Lo/ega;->h:Landroid/graphics/Bitmap;

    .line 193
    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_8
        :pswitch_c
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch
.end method

.method private c(Lo/ega;)V
    .locals 3

    .line 216
    iget-object v0, p0, Lo/ega$c;->e:Lo/efo;

    if-nez v0, :cond_0

    .line 217
    new-instance v0, Lo/efo;

    const/4 v1, 0x0

    const/high16 v2, 0x43960000    # 300.0f

    invoke-direct {v0, v1, v2}, Lo/efo;-><init>(FF)V

    iput-object v0, p0, Lo/ega$c;->e:Lo/efo;

    .line 218
    sget-object v0, Lo/ega$4;->d:[I

    iget-object v1, p0, Lo/ega$c;->c:Lo/egc$b;

    invoke-virtual {v1}, Lo/egc$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 222
    :pswitch_0
    goto :goto_1

    .line 225
    :pswitch_1
    iget-object v0, p0, Lo/ega$c;->e:Lo/efo;

    const/high16 v1, 0x43bc0000    # 376.0f

    iput v1, v0, Lo/efo;->d:F

    .line 226
    goto :goto_1

    .line 228
    :pswitch_2
    iget-object v0, p0, Lo/ega$c;->e:Lo/efo;

    const/high16 v1, -0x3e600000    # -20.0f

    iput v1, v0, Lo/efo;->e:F

    .line 229
    iget-object v0, p0, Lo/ega$c;->e:Lo/efo;

    const/high16 v1, 0x43bc0000    # 376.0f

    iput v1, v0, Lo/efo;->d:F

    .line 230
    goto :goto_1

    .line 232
    :pswitch_3
    iget-object v0, p0, Lo/ega$c;->e:Lo/efo;

    const/high16 v1, 0x438e0000    # 284.0f

    iput v1, v0, Lo/efo;->d:F

    .line 233
    goto :goto_1

    .line 235
    :goto_0
    iget-object v0, p0, Lo/ega$c;->e:Lo/efo;

    const/high16 v1, 0x43960000    # 300.0f

    iput v1, v0, Lo/efo;->d:F

    .line 239
    :cond_0
    :goto_1
    iget-object v0, p0, Lo/ega$c;->e:Lo/efo;

    iput-object v0, p1, Lo/ega;->c:Lo/efo;

    .line 240
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private d(Lo/ega;)V
    .locals 3

    .line 243
    iget-object v0, p0, Lo/ega$c;->b:Lo/efo;

    if-nez v0, :cond_0

    .line 244
    new-instance v0, Lo/efo;

    const/4 v1, 0x0

    const/high16 v2, 0x43a20000    # 324.0f

    invoke-direct {v0, v1, v2}, Lo/efo;-><init>(FF)V

    iput-object v0, p0, Lo/ega$c;->b:Lo/efo;

    .line 245
    sget-object v0, Lo/ega$4;->d:[I

    iget-object v1, p0, Lo/ega$c;->c:Lo/egc$b;

    invoke-virtual {v1}, Lo/egc$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 249
    :pswitch_0
    goto :goto_1

    .line 252
    :pswitch_1
    iget-object v0, p0, Lo/ega$c;->b:Lo/efo;

    const/high16 v1, 0x43c30000    # 390.0f

    iput v1, v0, Lo/efo;->d:F

    .line 253
    goto :goto_1

    .line 255
    :pswitch_2
    iget-object v0, p0, Lo/ega$c;->b:Lo/efo;

    const/high16 v1, -0x3e600000    # -20.0f

    iput v1, v0, Lo/efo;->e:F

    .line 256
    iget-object v0, p0, Lo/ega$c;->b:Lo/efo;

    const/high16 v1, 0x43c30000    # 390.0f

    iput v1, v0, Lo/efo;->d:F

    .line 257
    goto :goto_1

    .line 259
    :pswitch_3
    iget-object v0, p0, Lo/ega$c;->b:Lo/efo;

    const/high16 v1, 0x439e0000    # 316.0f

    iput v1, v0, Lo/efo;->d:F

    .line 260
    goto :goto_1

    .line 262
    :goto_0
    iget-object v0, p0, Lo/ega$c;->b:Lo/efo;

    const/high16 v1, 0x43a20000    # 324.0f

    iput v1, v0, Lo/efo;->d:F

    .line 266
    :cond_0
    :goto_1
    iget-object v0, p0, Lo/ega$c;->b:Lo/efo;

    iput-object v0, p1, Lo/ega;->e:Lo/efo;

    .line 267
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public a([Ljava/lang/String;)Lo/ega$c;
    .locals 0

    .line 99
    iput-object p1, p0, Lo/ega$c;->k:[Ljava/lang/String;

    .line 100
    return-object p0
.end method

.method public b()Lo/ega;
    .locals 2

    .line 109
    new-instance v1, Lo/ega;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lo/ega;-><init>(Lo/ega$4;)V

    .line 110
    iget-object v0, p0, Lo/ega$c;->c:Lo/egc$b;

    iput-object v0, v1, Lo/ega;->a:Lo/egc$b;

    .line 111
    iget-object v0, p0, Lo/ega$c;->a:Lo/egc$a;

    iput-object v0, v1, Lo/ega;->d:Lo/egc$a;

    .line 113
    iget-object v0, p0, Lo/ega$c;->k:[Ljava/lang/String;

    iput-object v0, v1, Lo/ega;->k:[Ljava/lang/String;

    .line 114
    invoke-direct {p0, v1}, Lo/ega$c;->c(Lo/ega;)V

    .line 115
    invoke-direct {p0, v1}, Lo/ega$c;->d(Lo/ega;)V

    .line 116
    invoke-direct {p0, v1}, Lo/ega$c;->a(Lo/ega;)V

    .line 117
    invoke-direct {p0, v1}, Lo/ega$c;->b(Lo/ega;)V

    .line 118
    return-object v1
.end method

.method public c(Lo/egc$b;)Lo/ega$c;
    .locals 0

    .line 65
    iput-object p1, p0, Lo/ega$c;->c:Lo/egc$b;

    .line 66
    return-object p0
.end method

.method public e(Landroid/graphics/Bitmap;)Lo/ega$c;
    .locals 0

    .line 104
    iput-object p1, p0, Lo/ega$c;->g:Landroid/graphics/Bitmap;

    .line 105
    return-object p0
.end method

.method public e(Lo/egc$a;)Lo/ega$c;
    .locals 0

    .line 70
    iput-object p1, p0, Lo/ega$c;->a:Lo/egc$a;

    .line 71
    return-object p0
.end method
