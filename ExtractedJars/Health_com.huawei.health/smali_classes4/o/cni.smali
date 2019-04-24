.class public Lo/cni;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/cni;->d:Ljava/util/List;

    .line 33
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.profile"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.profile.readonly"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.sport"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.sport.readonly"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.wgt"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.wgt.readonly"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.slp"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.slp.readonly"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.hr"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.hr.readonly"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.ecg"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.ecg.readonly"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.bg"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.bg.readonly"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.bf"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.health.bf.readonly"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "\tcom.huawei.android.hms.health.motionpath"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    sget-object v0, Lo/cni;->d:Ljava/util/List;

    const-string v1, "com.huawei.android.hms.health.motionpath.readonly"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(I)Ljava/lang/String;
    .locals 3

    .line 180
    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    .line 181
    const-string v0, "com.huawei.android.hms.health.profile"

    return-object v0

    .line 183
    :cond_0
    invoke-static {p0}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v2

    .line 184
    sget-object v0, Lo/cni$2;->d:[I

    invoke-virtual {v2}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 186
    :pswitch_0
    invoke-static {p0}, Lo/cni;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 188
    :pswitch_1
    invoke-static {p0}, Lo/cni;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 190
    :pswitch_2
    invoke-static {p0}, Lo/cni;->h(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 192
    :pswitch_3
    invoke-static {p0}, Lo/cni;->f(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 194
    :pswitch_4
    invoke-static {p0}, Lo/cni;->l(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 196
    :pswitch_5
    invoke-static {p0}, Lo/cni;->o(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 198
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static a([I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 126
    invoke-static {p0}, Lo/cne;->b([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    const/4 v0, 0x0

    return-object v0

    .line 129
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 131
    move-object v3, p0

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget v6, v3, v5

    .line 132
    invoke-static {v6}, Lo/cni;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 133
    invoke-static {v2}, Lo/cni;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 134
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 137
    :cond_2
    return-object v1
.end method

.method private static b(I)Ljava/lang/String;
    .locals 3

    .line 206
    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    .line 207
    const-string v0, "com.huawei.android.hms.health.profile.readonly"

    return-object v0

    .line 209
    :cond_0
    invoke-static {p0}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v2

    .line 210
    sget-object v0, Lo/cni$2;->d:[I

    invoke-virtual {v2}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 212
    :pswitch_0
    invoke-static {p0}, Lo/cni;->e(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 214
    :pswitch_1
    invoke-static {p0}, Lo/cni;->k(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 216
    :pswitch_2
    invoke-static {p0}, Lo/cni;->g(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 218
    :pswitch_3
    invoke-static {p0}, Lo/cni;->i(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 220
    :pswitch_4
    invoke-static {p0}, Lo/cni;->m(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 222
    :pswitch_5
    invoke-static {p0}, Lo/cni;->p(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 224
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    .line 58
    invoke-static {p0}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lo/cni;->d:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    .line 293
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 295
    :pswitch_0
    const-string v0, "com.huawei.android.hms.health.health.bg"

    return-object v0

    .line 297
    :pswitch_1
    const-string v0, "com.huawei.android.hms.health.health.bf"

    return-object v0

    .line 299
    :pswitch_2
    const-string v0, "com.huawei.android.hms.health.health.wgt"

    return-object v0

    .line 302
    :goto_0
    :pswitch_3
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2711
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public static c([I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 144
    invoke-static {p0}, Lo/cne;->b([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    const/4 v0, 0x0

    return-object v0

    .line 147
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 149
    move-object v3, p0

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget v6, v3, v5

    .line 150
    invoke-static {v6}, Lo/cni;->b(I)Ljava/lang/String;

    move-result-object v2

    .line 151
    invoke-static {v2}, Lo/cni;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 152
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 155
    :cond_2
    return-object v1
.end method

.method private static d(I)Ljava/lang/String;
    .locals 1

    .line 229
    const/16 v0, 0x3e8

    if-ge p0, v0, :cond_0

    .line 230
    const-string v0, "com.huawei.android.hms.health.sport"

    return-object v0

    .line 232
    :cond_0
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 235
    :pswitch_0
    const-string v0, "com.huawei.android.hms.health.health.hr"

    return-object v0

    .line 238
    :pswitch_1
    const-string v0, "com.huawei.android.hms.health.health.wgt"

    return-object v0

    .line 241
    :pswitch_2
    const-string v0, "com.huawei.android.hms.health.health.bf"

    return-object v0

    .line 250
    :pswitch_3
    const-string v0, "com.huawei.android.hms.health.health.bg"

    return-object v0

    .line 256
    :goto_0
    :pswitch_4
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x7d1
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method public static d([I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 162
    invoke-static {p0}, Lo/cne;->b([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const/4 v0, 0x0

    return-object v0

    .line 165
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 167
    move-object v3, p0

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget v6, v3, v5

    .line 168
    invoke-static {v6}, Lo/cni;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 169
    invoke-static {v2}, Lo/cni;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 170
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 173
    :cond_2
    return-object v1
.end method

.method private static e(I)Ljava/lang/String;
    .locals 1

    .line 261
    const/16 v0, 0x3e8

    if-ge p0, v0, :cond_0

    .line 262
    const-string v0, "com.huawei.android.hms.health.sport.readonly"

    return-object v0

    .line 264
    :cond_0
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 267
    :pswitch_0
    const-string v0, "com.huawei.android.hms.health.health.hr.readonly"

    return-object v0

    .line 270
    :pswitch_1
    const-string v0, "com.huawei.android.hms.health.health.wgt.readonly"

    return-object v0

    .line 273
    :pswitch_2
    const-string v0, "com.huawei.android.hms.health.health.bf.readonly"

    return-object v0

    .line 282
    :pswitch_3
    const-string v0, "com.huawei.android.hms.health.health.bg.readonly"

    return-object v0

    .line 288
    :goto_0
    :pswitch_4
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x7d1
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 108
    invoke-static {p0}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    const/4 v0, 0x0

    return-object v0

    .line 111
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 113
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 114
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cni;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 115
    invoke-static {v2}, Lo/cni;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 116
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    :cond_1
    goto :goto_0

    .line 119
    :cond_2
    return-object v1
.end method

.method private static f(I)Ljava/lang/String;
    .locals 1

    .line 341
    const/16 v0, 0x7918

    if-gt p0, v0, :cond_0

    .line 342
    const-string v0, "\tcom.huawei.android.hms.health.motionpath"

    return-object v0

    .line 344
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static g(I)Ljava/lang/String;
    .locals 1

    .line 331
    const/16 v0, 0x5208

    if-gt p0, v0, :cond_0

    .line 332
    const-string v0, "com.huawei.android.hms.health.sport.readonly"

    return-object v0

    .line 334
    :cond_0
    const/16 v0, 0x56b7

    if-gt p0, v0, :cond_1

    .line 335
    const-string v0, "com.huawei.android.hms.health.health.slp.readonly"

    return-object v0

    .line 337
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private static h(I)Ljava/lang/String;
    .locals 1

    .line 321
    const/16 v0, 0x5208

    if-gt p0, v0, :cond_0

    .line 322
    const-string v0, "com.huawei.android.hms.health.sport"

    return-object v0

    .line 324
    :cond_0
    const/16 v0, 0x56b7

    if-gt p0, v0, :cond_1

    .line 325
    const-string v0, "com.huawei.android.hms.health.health.slp"

    return-object v0

    .line 327
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private static i(I)Ljava/lang/String;
    .locals 1

    .line 348
    const/16 v0, 0x7918

    if-gt p0, v0, :cond_0

    .line 349
    const-string v0, "com.huawei.android.hms.health.motionpath.readonly"

    return-object v0

    .line 351
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static k(I)Ljava/lang/String;
    .locals 1

    .line 307
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 309
    :pswitch_0
    const-string v0, "com.huawei.android.hms.health.health.bg.readonly"

    return-object v0

    .line 311
    :pswitch_1
    const-string v0, "com.huawei.android.hms.health.health.bf.readonly"

    return-object v0

    .line 313
    :pswitch_2
    const-string v0, "com.huawei.android.hms.health.health.wgt.readonly"

    return-object v0

    .line 316
    :goto_0
    :pswitch_3
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2711
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private static l(I)Ljava/lang/String;
    .locals 1

    .line 355
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 357
    :sswitch_0
    const-string v0, "com.huawei.android.hms.health.health.hr"

    return-object v0

    .line 359
    :goto_0
    const/4 v0, 0x0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xc351 -> :sswitch_0
    .end sparse-switch
.end method

.method private static m(I)Ljava/lang/String;
    .locals 1

    .line 364
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 366
    :sswitch_0
    const-string v0, "com.huawei.android.hms.health.health.hr.readonly"

    return-object v0

    .line 368
    :goto_0
    const/4 v0, 0x0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xc351 -> :sswitch_0
    .end sparse-switch
.end method

.method private static o(I)Ljava/lang/String;
    .locals 1

    .line 373
    const v0, 0xa028

    if-gt p0, v0, :cond_0

    .line 374
    const-string v0, "com.huawei.android.hms.health.sport"

    return-object v0

    .line 376
    :cond_0
    const v0, 0xab7c

    if-gt p0, v0, :cond_1

    .line 377
    const-string v0, "\tcom.huawei.android.hms.health.motionpath"

    return-object v0

    .line 379
    :cond_1
    const v0, 0xac43

    if-gt p0, v0, :cond_2

    .line 380
    const-string v0, "com.huawei.android.hms.health.health.slp"

    return-object v0

    .line 382
    :cond_2
    const v0, 0xad0b

    if-gt p0, v0, :cond_3

    .line 383
    const-string v0, "com.huawei.android.hms.health.health.slp"

    return-object v0

    .line 385
    :cond_3
    const v0, 0xb3ba

    if-gt p0, v0, :cond_4

    .line 386
    const-string v0, "com.huawei.android.hms.health.health.hr"

    return-object v0

    .line 388
    :cond_4
    const v0, 0xb798

    if-gt p0, v0, :cond_5

    .line 389
    const-string v0, "com.huawei.android.hms.health.health.hr"

    return-object v0

    .line 392
    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method private static p(I)Ljava/lang/String;
    .locals 1

    .line 396
    const v0, 0xa028

    if-gt p0, v0, :cond_0

    .line 397
    const-string v0, "com.huawei.android.hms.health.sport.readonly"

    return-object v0

    .line 399
    :cond_0
    const v0, 0xab7c

    if-gt p0, v0, :cond_1

    .line 400
    const-string v0, "com.huawei.android.hms.health.motionpath.readonly"

    return-object v0

    .line 402
    :cond_1
    const v0, 0xac43

    if-gt p0, v0, :cond_2

    .line 403
    const-string v0, "com.huawei.android.hms.health.health.slp.readonly"

    return-object v0

    .line 405
    :cond_2
    const v0, 0xad0b

    if-gt p0, v0, :cond_3

    .line 406
    const-string v0, "com.huawei.android.hms.health.health.slp.readonly"

    return-object v0

    .line 408
    :cond_3
    const v0, 0xb3ba

    if-gt p0, v0, :cond_4

    .line 409
    const-string v0, "com.huawei.android.hms.health.health.hr.readonly"

    return-object v0

    .line 411
    :cond_4
    const v0, 0xb798

    if-gt p0, v0, :cond_5

    .line 412
    const-string v0, "com.huawei.android.hms.health.health.hr.readonly"

    return-object v0

    .line 415
    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method
