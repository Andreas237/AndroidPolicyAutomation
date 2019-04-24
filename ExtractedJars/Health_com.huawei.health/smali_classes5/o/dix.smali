.class public Lo/dix;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static a:Lo/dix;

.field private static e:Lo/dde;


# instance fields
.field private b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private c:Landroid/content/Context;

.field private d:Z

.field private g:Landroid/os/Handler;
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 94
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dix;->d:Z

    .line 158
    new-instance v0, Lo/dix$2;

    invoke-direct {v0, p0}, Lo/dix$2;-><init>(Lo/dix;)V

    iput-object v0, p0, Lo/dix;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 497
    new-instance v0, Lo/dix$4;

    .line 498
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dix$4;-><init>(Lo/dix;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dix;->g:Landroid/os/Handler;

    .line 95
    iput-object p1, p0, Lo/dix;->c:Landroid/content/Context;

    .line 96
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    sput-object v0, Lo/dix;->e:Lo/dde;

    .line 98
    sget-object v0, Lo/dix;->e:Lo/dde;

    iget-object v1, p0, Lo/dix;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0x25

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 99
    return-void
.end method

.method private static a(I)Ljava/lang/String;
    .locals 4

    .line 348
    const/16 v0, 0x7f

    if-le p0, v0, :cond_0

    .line 349
    shr-int/lit8 v0, p0, 0x7

    add-int/lit16 v2, v0, 0x80

    .line 350
    and-int/lit8 v3, p0, 0x7f

    .line 351
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 353
    :cond_0
    invoke-static {p0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 4
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 196
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter reportMusicInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-virtual {p0}, Lo/dix;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 199
    const v0, 0x21341

    invoke-direct {p0, v0}, Lo/dix;->b(I)V

    .line 200
    return-void

    .line 202
    :cond_0
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 203
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getPlay_State()I

    move-result v0

    if-nez v0, :cond_2

    .line 204
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getMax_Volume()I

    move-result v0

    if-nez v0, :cond_2

    .line 207
    :cond_1
    const v0, 0x21342

    invoke-direct {p0, v0}, Lo/dix;->b(I)V

    goto :goto_0

    .line 209
    :cond_2
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/dix;->b(I)V

    .line 211
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dix;->d(Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;)V

    .line 214
    :goto_0
    invoke-direct {p0}, Lo/dix;->e()V

    .line 215
    return-void
.end method

.method private b(I)V
    .locals 6

    .line 310
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendAppStatus  errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 312
    const/16 v0, 0x25

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 313
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 314
    invoke-virtual {p0, p1}, Lo/dix;->d(I)[B

    move-result-object v5

    .line 315
    array-length v0, v5

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 316
    invoke-virtual {v4, v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 317
    sget-object v0, Lo/dix;->e:Lo/dde;

    invoke-virtual {v0, v4}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 318
    return-void
.end method

.method private b([B)V
    .locals 4
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 172
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 175
    :pswitch_0
    array-length v0, p1

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    const/4 v0, 0x2

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 176
    iget-object v0, p0, Lo/dix;->g:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 180
    :pswitch_1
    invoke-virtual {p0, p1}, Lo/dix;->c([B)I

    .line 181
    goto :goto_0

    .line 183
    :pswitch_2
    array-length v0, p1

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    const/4 v0, 0x2

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 184
    invoke-direct {p0, p1}, Lo/dix;->e([B)V

    .line 190
    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private c()V
    .locals 1

    .line 461
    invoke-virtual {p0}, Lo/dix;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 463
    const v0, 0x21342

    invoke-direct {p0, v0}, Lo/dix;->c(I)V

    goto :goto_0

    .line 466
    :cond_0
    const v0, 0x21341

    invoke-direct {p0, v0}, Lo/dix;->c(I)V

    .line 468
    :goto_0
    return-void
.end method

.method private c(I)V
    .locals 6

    .line 324
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendAppControlResponse  errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 326
    const/16 v0, 0x25

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 327
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 328
    invoke-virtual {p0, p1}, Lo/dix;->d(I)[B

    move-result-object v5

    .line 329
    array-length v0, v5

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 330
    invoke-virtual {v4, v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 331
    sget-object v0, Lo/dix;->e:Lo/dde;

    invoke-virtual {v0, v4}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 332
    return-void
.end method

.method static synthetic c(Lo/dix;[B)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lo/dix;->b([B)V

    return-void
.end method

.method public static d(Landroid/content/Context;)Lo/dix;
    .locals 4

    .line 87
    sget-object v0, Lo/dix;->a:Lo/dix;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 88
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstance() context = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    new-instance v0, Lo/dix;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dix;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dix;->a:Lo/dix;

    .line 91
    :cond_0
    sget-object v0, Lo/dix;->a:Lo/dix;

    return-object v0
.end method

.method private d(Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;)V
    .locals 6

    .line 253
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendMusicInfo  musicInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 255
    const/16 v0, 0x25

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 256
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 257
    invoke-virtual {p0, p1}, Lo/dix;->a(Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;)[B

    move-result-object v5

    .line 258
    array-length v0, v5

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 259
    invoke-virtual {v4, v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 260
    sget-object v0, Lo/dix;->e:Lo/dde;

    invoke-virtual {v0, v4}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 261
    return-void
.end method

.method static synthetic d(Lo/dix;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lo/dix;->b()V

    return-void
.end method

.method static synthetic d(Lo/dix;Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lo/dix;->d(Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;)V

    return-void
.end method

.method private d()Z
    .locals 6

    .line 128
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getMusicStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const/4 v4, 0x0

    .line 130
    iget-object v0, p0, Lo/dix;->c:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "music_control_status"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 132
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMusicStatus: status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const-string v0, "true"

    invoke-static {v5, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    const/4 v4, 0x1

    .line 136
    :cond_0
    return v4
.end method

.method private e()V
    .locals 4
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 222
    iget-boolean v0, p0, Lo/dix;->d:Z

    if-nez v0, :cond_0

    .line 223
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter registMusicCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    new-instance v1, Lo/dix$3;

    invoke-direct {v1, p0}, Lo/dix$3;-><init>(Lo/dix;)V

    invoke-virtual {v0, v1}, Lo/dit;->e(Lo/dir$e;)V

    .line 241
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dix;->d:Z

    .line 242
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "end  registMusicCallback registMusicCall "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dix;->d:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 244
    :cond_0
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have already registMusicCallback!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    :goto_0
    return-void
.end method

.method private e([B)V
    .locals 11

    .line 363
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 364
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 365
    new-instance v7, Lo/daz;

    invoke-direct {v7}, Lo/daz;-><init>()V

    .line 367
    :try_start_0
    invoke-virtual {v7, v6}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v8

    .line 368
    iget-object v9, v8, Lo/dba;->e:Ljava/util/List;

    .line 369
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/daw;

    .line 370
    invoke-virtual {v10}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    .line 374
    goto :goto_0

    .line 371
    :catch_0
    move-exception v8

    .line 372
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMusicControl error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    return-void

    .line 375
    :goto_0
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleMusicControl :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    iget-boolean v0, p0, Lo/dix;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x5

    if-eq v4, v0, :cond_0

    const/4 v0, 0x6

    if-ne v4, v0, :cond_9

    .line 378
    :cond_0
    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    .line 380
    :sswitch_0
    invoke-virtual {p0}, Lo/dix;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 382
    const v0, 0x21341

    invoke-direct {p0, v0}, Lo/dix;->b(I)V

    goto/16 :goto_3

    .line 383
    :cond_1
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 384
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getPlay_State()I

    move-result v0

    if-nez v0, :cond_3

    .line 385
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getMax_Volume()I

    move-result v0

    if-nez v0, :cond_3

    .line 388
    :cond_2
    new-instance v8, Landroid/content/Intent;

    const-string v0, "action_music_control_start_music_app"

    invoke-direct {v8, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 389
    iget-object v0, p0, Lo/dix;->c:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v8, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 390
    invoke-direct {p0}, Lo/dix;->e()V

    .line 391
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    const/16 v1, 0x7e

    invoke-virtual {v0, v1}, Lo/dit;->e(I)V

    .line 392
    goto/16 :goto_3

    .line 394
    :cond_3
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    const/16 v1, 0x7e

    invoke-virtual {v0, v1}, Lo/dit;->e(I)V

    .line 395
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/dix;->c(I)V

    .line 397
    goto/16 :goto_3

    .line 399
    :sswitch_1
    invoke-direct {p0}, Lo/dix;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 400
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    const/16 v1, 0x7f

    invoke-virtual {v0, v1}, Lo/dit;->e(I)V

    .line 401
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/dix;->c(I)V

    goto/16 :goto_3

    .line 403
    :cond_4
    invoke-direct {p0}, Lo/dix;->c()V

    .line 405
    goto/16 :goto_3

    .line 407
    :sswitch_2
    invoke-direct {p0}, Lo/dix;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 408
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    const/16 v1, 0x58

    invoke-virtual {v0, v1}, Lo/dit;->e(I)V

    .line 409
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/dix;->c(I)V

    goto/16 :goto_3

    .line 411
    :cond_5
    invoke-direct {p0}, Lo/dix;->c()V

    .line 413
    goto/16 :goto_3

    .line 415
    :sswitch_3
    invoke-direct {p0}, Lo/dix;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 416
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    const/16 v1, 0x57

    invoke-virtual {v0, v1}, Lo/dit;->e(I)V

    .line 417
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/dix;->c(I)V

    goto/16 :goto_3

    .line 419
    :cond_6
    invoke-direct {p0}, Lo/dix;->c()V

    .line 421
    goto/16 :goto_3

    .line 423
    :sswitch_4
    invoke-direct {p0}, Lo/dix;->g()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 424
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dit;->c(Z)V

    .line 425
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/dix;->c(I)V

    goto :goto_3

    .line 427
    :cond_7
    invoke-direct {p0}, Lo/dix;->c()V

    .line 429
    goto :goto_3

    .line 431
    :sswitch_5
    invoke-direct {p0}, Lo/dix;->g()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 432
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dit;->c(Z)V

    .line 433
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/dix;->c(I)V

    goto :goto_3

    .line 435
    :cond_8
    invoke-direct {p0}, Lo/dix;->c()V

    .line 437
    goto :goto_3

    .line 439
    :sswitch_6
    iget-object v0, p0, Lo/dix;->g:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 440
    const v0, 0x186a0

    invoke-direct {p0, v0}, Lo/dix;->c(I)V

    .line 441
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dix;->d:Z

    .line 442
    goto :goto_3

    .line 444
    :goto_1
    goto :goto_3

    .line 448
    :cond_9
    invoke-virtual {p0}, Lo/dix;->a()Z

    move-result v0

    if-nez v0, :cond_a

    .line 449
    const v0, 0x21341

    invoke-direct {p0, v0}, Lo/dix;->c(I)V

    goto :goto_2

    .line 450
    :cond_a
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_b

    .line 451
    const v0, 0x21342

    invoke-direct {p0, v0}, Lo/dix;->c(I)V

    .line 453
    :cond_b
    :goto_2
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registMusicCall is false , can not control music!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0x6 -> :sswitch_5
        0x64 -> :sswitch_6
    .end sparse-switch
.end method

.method private g()Z
    .locals 5
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 476
    const/4 v4, 0x1

    .line 477
    invoke-virtual {p0}, Lo/dix;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 479
    const v0, 0x21341

    invoke-direct {p0, v0}, Lo/dix;->b(I)V

    .line 480
    const/4 v4, 0x0

    goto :goto_0

    .line 481
    :cond_0
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 483
    const v0, 0x21342

    invoke-direct {p0, v0}, Lo/dix;->b(I)V

    .line 484
    const/4 v4, 0x0

    goto :goto_0

    .line 485
    :cond_1
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getPlay_State()I

    move-result v0

    if-nez v0, :cond_2

    .line 486
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getMax_Volume()I

    move-result v0

    if-nez v0, :cond_2

    .line 487
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkState musicAPP is died!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    const v0, 0x21342

    invoke-direct {p0, v0}, Lo/dix;->b(I)V

    .line 490
    const/4 v4, 0x0

    .line 492
    :cond_2
    :goto_0
    return v4
.end method


# virtual methods
.method public a()Z
    .locals 5

    .line 144
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getMusicStatusForUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const/4 v4, 0x0

    .line 147
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    invoke-virtual {v0}, Lo/dip;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 148
    return v4

    .line 151
    :cond_0
    invoke-direct {p0}, Lo/dix;->d()Z

    move-result v4

    .line 153
    return v4
.end method

.method public a(Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;)[B
    .locals 12

    .line 269
    const-string v4, ""

    .line 270
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getBundle()Landroid/os/Bundle;

    move-result-object v5

    .line 271
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 272
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Singer_Name"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/dix;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Singer_Name"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 273
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Song_Name"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/dix;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Song_Name"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Play_State"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 275
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Max_Volume"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x5

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Current_Volume"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 277
    invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 278
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    .line 279
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "package packageMusicCommond :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    invoke-static {v4}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public c([B)I
    .locals 11

    .line 289
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleErrorCode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    new-instance v4, Lo/daz;

    invoke-direct {v4}, Lo/daz;-><init>()V

    .line 291
    const/4 v5, 0x0

    .line 293
    :try_start_0
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 294
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 295
    invoke-virtual {v4, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v8

    .line 296
    iget-object v9, v8, Lo/dba;->e:Ljava/util/List;

    .line 297
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/daw;

    .line 298
    invoke-virtual {v10}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 301
    goto :goto_0

    .line 299
    :catch_0
    move-exception v6

    .line 300
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleErrorCode error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    :goto_0
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleErrorCode :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    return v5
.end method

.method public d(Ljava/lang/Boolean;)V
    .locals 6

    .line 109
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter setMusicStatus result :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    const-string v4, ""

    .line 112
    new-instance v5, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/dcy;-><init>(I)V

    .line 113
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    const-string v4, "true"

    goto :goto_0

    .line 116
    :cond_0
    const-string v4, "false"

    .line 119
    :goto_0
    iget-object v0, p0, Lo/dix;->c:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "music_control_status"

    invoke-static {v0, v1, v2, v4, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 121
    return-void
.end method

.method public d(I)[B
    .locals 7

    .line 339
    const-string v4, ""

    .line 340
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 341
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x7f

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-long v1, p1

    invoke-static {v1, v2}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 342
    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 343
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    .line 344
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "package Error Code Commond:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    invoke-static {v4}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 102
    const/16 v0, 0x25

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
