.class public Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;,
        Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;,
        Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;
    }
.end annotation


# instance fields
.field private a:J

.field private b:Landroid/content/Context;

.field private c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;

.field private d:Lo/ceg;

.field private e:Landroid/os/Handler;

.field private f:Z

.field private g:J

.field private h:Lo/cef;

.field private i:Landroid/telephony/TelephonyManager;

.field private k:Landroid/os/Handler;

.field private l:Z

.field private n:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;

.field private o:Landroid/media/MediaPlayer$OnCompletionListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 31
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 61
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->a:J

    .line 62
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->g:J

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->h:Lo/cef;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->k:Landroid/os/Handler;

    .line 73
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->f:Z

    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->l:Z

    .line 365
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$1;-><init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->o:Landroid/media/MediaPlayer$OnCompletionListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/ceg;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d:Lo/ceg;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 203
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopEngine() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->e:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$4;-><init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 216
    return-void
.end method

.method private a(ILjava/lang/Object;)V
    .locals 4

    .line 191
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playVoice() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d:Lo/ceg;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1, p2}, Lo/ceg;->b(ZILjava/lang/Object;)I

    .line 193
    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)Z
    .locals 0

    .line 31
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->l:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Lo/cef;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->h:Lo/cef;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 242
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "retartVoiceService() run"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 244
    const-string v0, "action_voice_soundpool_enge"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 245
    invoke-virtual {p0, v4}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 246
    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;J)J
    .locals 0

    .line 31
    iput-wide p1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->g:J

    return-wide p1
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Landroid/os/Handler;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->k:Landroid/os/Handler;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 480
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setPhoneStateListener() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->i:Landroid/telephony/TelephonyManager;

    .line 482
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;-><init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->n:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;

    .line 483
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->i:Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->n:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$a;

    const/16 v2, 0x20

    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 484
    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Z)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c(Z)V

    return-void
.end method

.method private declared-synchronized c(Z)V
    .locals 0

    monitor-enter p0

    .line 513
    :try_start_0
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 514
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private d()V
    .locals 4

    .line 253
    new-instance v2, Landroid/content/Intent;

    const-string v0, "checkserviceaction"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 254
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 255
    const-string v0, "SERVICETYPE"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 256
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 258
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b:Landroid/content/Context;

    invoke-static {v0, v2}, Lo/ccd;->d(Landroid/content/Context;Landroid/content/Intent;)V

    .line 259
    return-void
.end method

.method private d(Landroid/content/Intent;)V
    .locals 5

    .line 225
    if-nez p1, :cond_0

    .line 226
    return-void

    .line 228
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 229
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleIntent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "intent action = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    const-string v0, "action_voice_iflytek_enge"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 232
    :cond_1
    const-string v0, "action_voice_soundpool_enge"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 233
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ceg;->b(Landroid/content/Context;)Lo/ceg;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d:Lo/ceg;

    .line 234
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d:Lo/ceg;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->o:Landroid/media/MediaPlayer$OnCompletionListener;

    invoke-virtual {v0, v1}, Lo/ceg;->e(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 236
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->l:Z

    return v0
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Landroid/content/Context;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b:Landroid/content/Context;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 196
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopVoice() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d:Lo/ceg;

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d:Lo/ceg;

    invoke-virtual {v0}, Lo/ceg;->a()I

    .line 200
    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->e()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->f:Z

    return v0
.end method

.method static synthetic k(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->a()V

    return-void
.end method


# virtual methods
.method public b(Landroid/content/Intent;)V
    .locals 17

    .line 295
    if-eqz p1, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "action_play_voice"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 296
    :cond_0
    return-void

    .line 298
    :cond_1
    const-string v0, "SPEAK_TYPE"

    move-object/from16 v1, p1

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 300
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->h:Lo/cef;

    invoke-virtual {v2}, Lo/cef;->a()I

    move-result v2

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-virtual {v3, v4, v2}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->e(Landroid/content/Intent;I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    const/16 v0, 0xa

    if-ne v5, v0, :cond_9

    .line 303
    const-string v0, "SPEAK_PARAMETER_TYPE"

    move-object/from16 v1, p1

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 305
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_2

    .line 308
    :pswitch_0
    const-string v0, "SPEAK_PARAMETER"

    move-object/from16 v1, p1

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 309
    const/4 v0, -0x1

    if-eq v7, v0, :cond_8

    .line 310
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 311
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 312
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d:Lo/ceg;

    const/4 v1, 0x1

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v8}, Lo/ceg;->b(ZILjava/lang/Object;)I

    .line 313
    goto/16 :goto_3

    .line 317
    :pswitch_1
    const-string v0, "SPEAK_PARAMETER"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object v0

    if-eqz v0, :cond_8

    const-string v0, "SPEAK_PARAMETER"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_2

    .line 318
    goto/16 :goto_3

    .line 320
    :cond_2
    const-string v0, "SPEAK_PARAMETER"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object v8

    .line 321
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 322
    if-nez v8, :cond_3

    .line 323
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "voiceSourceIndexArray is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    goto/16 :goto_3

    .line 326
    :cond_3
    move-object v10, v8

    array-length v11, v10

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v11, :cond_4

    aget v13, v10, v12

    .line 327
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 326
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 329
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d:Lo/ceg;

    const/4 v1, 0x1

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v9}, Lo/ceg;->b(ZILjava/lang/Object;)I

    .line 330
    goto/16 :goto_3

    .line 333
    :pswitch_2
    const-string v0, "SPEAK_PARAMETER"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 334
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d:Lo/ceg;

    const/4 v1, 0x1

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v10}, Lo/ceg;->b(ZILjava/lang/Object;)I

    .line 335
    goto/16 :goto_3

    .line 338
    :pswitch_3
    const-string v0, "SPEAK_PARAMETER"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    const-string v0, "SPEAK_PARAMETER"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_5

    .line 339
    goto :goto_3

    .line 341
    :cond_5
    const-string v0, "SPEAK_PARAMETER"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 342
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 343
    if-nez v11, :cond_6

    .line 344
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "voiceSourceIndexArrayString is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    goto :goto_3

    .line 347
    :cond_6
    move-object v13, v11

    array-length v14, v13

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v14, :cond_7

    aget-object v16, v13, v15

    .line 348
    move-object/from16 v0, v16

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 347
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 350
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d:Lo/ceg;

    const/4 v1, 0x1

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v12}, Lo/ceg;->b(ZILjava/lang/Object;)I

    .line 351
    goto :goto_3

    .line 353
    :goto_2
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unkown resource type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    :cond_8
    :goto_3
    goto :goto_4

    .line 357
    :cond_9
    const-string v0, "SPEAK_PARAMETER"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v6

    .line 358
    move-object/from16 v0, p0

    invoke-direct {v0, v5, v6}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->a(ILjava/lang/Object;)V

    .line 360
    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public e(Landroid/content/Intent;I)Ljava/lang/String;
    .locals 7

    .line 400
    const-string v0, "SPEAK_TYPE"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 401
    const-string v4, "Playing voice "

    .line 402
    packed-switch v3, :pswitch_data_0

    goto/16 :goto_0

    .line 404
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "START_BIKING"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 405
    goto/16 :goto_1

    .line 407
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "START_RUNNING"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 408
    goto/16 :goto_1

    .line 410
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "START_WALKING"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 411
    goto/16 :goto_1

    .line 413
    :pswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "PAUSE_SPORT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 414
    goto/16 :goto_1

    .line 416
    :pswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "SPORT_OVER"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 417
    goto/16 :goto_1

    .line 419
    :pswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "RESTART_SPORT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 420
    goto/16 :goto_1

    .line 422
    :pswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "GOAL_COMPLETE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 423
    goto/16 :goto_1

    .line 425
    :pswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DISTANCE_TIME"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 426
    const-string v0, "SPEAK_PARAMETER"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cem;

    .line 427
    if-eqz v5, :cond_0

    .line 428
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " SportType:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lo/cem;->g()I

    move-result v1

    invoke-static {v1}, Lo/cds;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " CurrentDistance:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lo/cem;->h()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "km TotalDuration:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 429
    invoke-virtual {v5}, Lo/cem;->k()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms LastOneKiloMeterDuration:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lo/cem;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms Tip "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lo/cem;->n()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_1

    .line 433
    :pswitch_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "VOICE INVALID"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 434
    goto/16 :goto_1

    .line 436
    :pswitch_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "SPORT_SUGGEST_TYPE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 437
    goto/16 :goto_1

    .line 439
    :pswitch_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "SPORT_STATE_BROADCAST_TYPE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 440
    const-string v0, "SPEAK_PARAMETER"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cem;

    .line 441
    if-eqz v6, :cond_0

    .line 442
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " SportType:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lo/cem;->g()I

    move-result v1

    invoke-static {v1}, Lo/cds;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " CurrentDistance:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lo/cem;->h()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "km TotalDuration:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 443
    invoke-virtual {v6}, Lo/cem;->k()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms LastOneKiloMeterDuration:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lo/cem;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms Tip "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 444
    invoke-virtual {v6}, Lo/cem;->n()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_1

    .line 449
    :pswitch_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "HALF_MARATHON_COMPLETE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 450
    goto/16 :goto_1

    .line 452
    :pswitch_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "MARATHON_COMPLETE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 453
    goto/16 :goto_1

    .line 455
    :pswitch_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "HEART_RATE_WARNING"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 456
    goto :goto_1

    .line 458
    :pswitch_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "COUNT_DOWN"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 459
    goto :goto_1

    .line 461
    :pswitch_f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "COUNT_DOWN_GOAL_FINISH"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 462
    goto :goto_1

    .line 464
    :pswitch_10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "COUNT_DOWN_GOAL_FINISH"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 465
    goto :goto_1

    .line 467
    :pswitch_11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "COUNT_DOWN_NUMBER_321"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 468
    goto :goto_1

    .line 470
    :goto_0
    :pswitch_12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "VOICE INVALID"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 474
    :cond_0
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Pieces of voice to play:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 476
    return-object v4

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_8
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_12
        :pswitch_12
        :pswitch_7
        :pswitch_9
        :pswitch_a
        :pswitch_c
        :pswitch_b
        :pswitch_d
        :pswitch_12
        :pswitch_12
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
    .end packed-switch
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 82
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 5

    .line 87
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 88
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b:Landroid/content/Context;

    .line 90
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->e:Landroid/os/Handler;

    .line 93
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "action_voice_soundpool_enge"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 94
    const-string v0, "action_play_voice"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 95
    const-string v0, "action_stop_voice"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 96
    const-string v0, "action_stop_service"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 97
    const-string v0, "ACTION_RESET_MEDIA_IDLE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 98
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;-><init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$4;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;

    .line 99
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;

    invoke-static {v0, v1, v4}, Lo/ccd;->d(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 102
    new-instance v0, Lo/cef;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lo/cef;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->h:Lo/cef;

    .line 103
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$c;-><init>(Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$4;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->k:Landroid/os/Handler;

    .line 105
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c()V

    .line 106
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 110
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 111
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->c:Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService$e;

    invoke-static {v0, v1}, Lo/ccd;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V

    .line 113
    iget-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->g:J

    iget-wide v2, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->a:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 119
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->b()V

    .line 121
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d:Lo/ceg;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->o:Landroid/media/MediaPlayer$OnCompletionListener;

    invoke-virtual {v0, v1}, Lo/ceg;->b(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->o:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 123
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 127
    const-string v0, "Track_VoiceEngService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 130
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d(Landroid/content/Intent;)V

    .line 131
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->a:J

    .line 132
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->e:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 134
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/manager/service/VoiceEngService;->d()V

    .line 136
    const/4 v0, 0x2

    return v0
.end method
