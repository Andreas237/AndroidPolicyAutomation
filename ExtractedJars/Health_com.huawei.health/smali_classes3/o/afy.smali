.class public Lo/afy;
.super Lo/afz;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:S

.field private d:F

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Lo/afz;-><init>()V

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lo/afy;->a:I

    return-void
.end method

.method public static a(J)I
    .locals 3

    .line 245
    const/4 v1, 0x0

    .line 246
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v2

    .line 247
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 248
    const/16 v0, 0xb

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 249
    return v1
.end method

.method private static a(I)Z
    .locals 1

    .line 264
    const/4 v0, 0x0

    if-gt v0, p0, :cond_0

    const/4 v0, 0x6

    if-le v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static b(I)Z
    .locals 1

    .line 268
    const/4 v0, 0x6

    if-gt v0, p0, :cond_0

    const/16 v0, 0x8

    if-le v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(J)I
    .locals 3

    .line 219
    const/16 v1, 0x7df

    .line 220
    invoke-static {p0, p1}, Lo/afy;->a(J)I

    move-result v2

    .line 221
    invoke-static {v2}, Lo/afy;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    const/16 v1, 0x7df

    goto :goto_0

    .line 224
    :cond_0
    invoke-static {v2}, Lo/afy;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 225
    const/16 v1, 0x7d8

    goto :goto_0

    .line 226
    :cond_1
    invoke-static {v2}, Lo/afy;->f(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 227
    const/16 v1, 0x7d9

    goto :goto_0

    .line 228
    :cond_2
    invoke-static {v2}, Lo/afy;->g(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 229
    const/16 v1, 0x7da

    goto :goto_0

    .line 230
    :cond_3
    invoke-static {v2}, Lo/afy;->k(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 231
    const/16 v1, 0x7db

    goto :goto_0

    .line 232
    :cond_4
    invoke-static {v2}, Lo/afy;->h(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 233
    const/16 v1, 0x7dc

    goto :goto_0

    .line 234
    :cond_5
    invoke-static {v2}, Lo/afy;->i(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 235
    const/16 v1, 0x7dd

    goto :goto_0

    .line 236
    :cond_6
    invoke-static {v2}, Lo/afy;->l(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 237
    const/16 v1, 0x7de

    .line 239
    :cond_7
    :goto_0
    return v1
.end method

.method public static d(IF)S
    .locals 2

    .line 132
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 136
    :pswitch_0
    const v0, 0x40c33333    # 6.1f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 137
    const/4 v1, 0x1

    goto :goto_1

    .line 139
    :cond_0
    const/4 v1, 0x2

    .line 141
    goto :goto_1

    .line 145
    :pswitch_1
    const v0, 0x410ccccd    # 8.8f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 146
    const/4 v1, 0x1

    goto :goto_1

    .line 148
    :cond_1
    const/4 v1, 0x2

    .line 150
    goto :goto_1

    .line 154
    :goto_0
    :pswitch_2
    const/high16 v0, 0x41000000    # 8.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_2

    .line 155
    const/4 v1, 0x1

    goto :goto_1

    .line 157
    :cond_2
    const/4 v1, 0x2

    .line 161
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x7d8
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static d(F)Z
    .locals 4

    .line 259
    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, p0, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    sub-float v0, p0, v0

    .line 260
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 259
    :goto_0
    return v0
.end method

.method public static e(IF)S
    .locals 2

    .line 119
    invoke-static {p1}, Lo/afy;->d(F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    const/16 v1, -0x8000

    goto :goto_0

    .line 121
    :cond_0
    const v0, 0x408ccccd    # 4.4f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 122
    const/4 v1, 0x0

    goto :goto_0

    .line 124
    :cond_1
    invoke-static {p0, p1}, Lo/afy;->d(IF)S

    move-result v1

    .line 127
    :goto_0
    return v1
.end method

.method private static f(I)Z
    .locals 1

    .line 272
    const/16 v0, 0x8

    if-gt v0, p0, :cond_0

    const/16 v0, 0xa

    if-le v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static g(I)Z
    .locals 1

    .line 276
    const/16 v0, 0xa

    if-gt v0, p0, :cond_0

    const/16 v0, 0xc

    if-le v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static h(I)Z
    .locals 1

    .line 284
    const/16 v0, 0xf

    if-gt v0, p0, :cond_0

    const/16 v0, 0x13

    if-le v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static i(I)Z
    .locals 1

    .line 288
    const/16 v0, 0x13

    if-gt v0, p0, :cond_0

    const/16 v0, 0x15

    if-le v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static k(I)Z
    .locals 1

    .line 280
    const/16 v0, 0xc

    if-gt v0, p0, :cond_0

    const/16 v0, 0xf

    if-le v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static l(I)Z
    .locals 1

    .line 292
    const/16 v0, 0x15

    if-gt v0, p0, :cond_0

    const/16 v0, 0x18

    if-le v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 96
    iget v0, p0, Lo/afy;->e:I

    return v0
.end method

.method public b(F)V
    .locals 0

    .line 76
    iput p1, p0, Lo/afy;->d:F

    .line 77
    return-void
.end method

.method public c()F
    .locals 1

    .line 71
    iget v0, p0, Lo/afy;->d:F

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 91
    iput p1, p0, Lo/afy;->e:I

    .line 92
    return-void
.end method

.method public d()I
    .locals 1

    .line 101
    iget v0, p0, Lo/afy;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BloodSugar [state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lo/afy;->b:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bloodSugar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/afy;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timePeriod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/afy;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 255
    invoke-super {p0}, Lo/afz;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 254
    return-object v0
.end method
