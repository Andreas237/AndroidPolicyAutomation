.class public final Lo/awk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/awk;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private c:Lo/bcb;

.field private d:Landroid/content/Context;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private f:J

.field private g:Z

.field private i:Z


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/awk;->b:Ljava/util/List;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/awk;->e:Ljava/util/List;

    .line 71
    const-wide/16 v0, 0xbb8

    iput-wide v0, p0, Lo/awk;->f:J

    .line 88
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/awk;->d:Landroid/content/Context;

    .line 89
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    iput-object v0, p0, Lo/awk;->c:Lo/bcb;

    .line 90
    return-void
.end method

.method private a(JII)Z
    .locals 4

    .line 459
    const/4 v2, 0x0

    .line 461
    const/4 v0, 0x1

    if-ne p3, v0, :cond_2

    .line 463
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 464
    if-eqz v3, :cond_1

    .line 466
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getUndisturbStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 468
    :cond_1
    :goto_0
    goto :goto_1

    .line 469
    :cond_2
    const/4 v0, 0x2

    if-ne p3, v0, :cond_5

    .line 471
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 473
    const/4 v0, 0x1

    if-ne p4, v0, :cond_3

    .line 475
    const/4 v2, 0x0

    goto :goto_1

    .line 477
    :cond_3
    if-eqz v3, :cond_5

    .line 479
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getDisturbMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    const/4 v2, 0x1

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    .line 482
    :cond_5
    :goto_1
    return v2
.end method

.method private a(Ljava/lang/String;)Z
    .locals 4

    .line 247
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isFollowNotification"

    invoke-virtual {v0, v1}, Lo/bcb;->c(Ljava/lang/String;)Z

    move-result v2

    .line 248
    iget-object v0, p0, Lo/awk;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_follow_system:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 250
    if-nez v2, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 252
    const/4 v0, 0x1

    return v0

    .line 254
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static declared-synchronized c()Lo/awk;
    .locals 3

    const-class v1, Lo/awk;

    monitor-enter v1

    .line 99
    :try_start_0
    sget-object v0, Lo/awk;->a:Lo/awk;

    if-nez v0, :cond_0

    .line 101
    new-instance v0, Lo/awk;

    invoke-direct {v0}, Lo/awk;-><init>()V

    sput-object v0, Lo/awk;->a:Lo/awk;

    .line 103
    :cond_0
    sget-object v0, Lo/awk;->a:Lo/awk;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private d(Landroid/database/Cursor;)Landroid/net/Uri;
    .locals 3

    .line 503
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 504
    const/4 v1, 0x0

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    .line 503
    invoke-static {v0, v1, v2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private d(Landroid/app/Notification;)V
    .locals 1

    .line 228
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/awk;->i:Z

    if-nez v0, :cond_0

    .line 230
    const-string v0, ""

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    goto :goto_0

    .line 234
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 236
    :goto_0
    return-void
.end method

.method private d(JII)Z
    .locals 9

    .line 345
    invoke-direct {p0, p1, p2, p3, p4}, Lo/awk;->a(JII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 347
    const/4 v0, 0x1

    return v0

    .line 350
    :cond_0
    iget-object v0, p0, Lo/awk;->c:Lo/bcb;

    const-string v1, "no_disturb_setting"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v4

    .line 351
    if-eqz v4, :cond_1

    .line 354
    iget-object v0, p0, Lo/awk;->c:Lo/bcb;

    const-string v1, "no_disturb_start_time"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/bcb;->e(Ljava/lang/String;J)J

    move-result-wide v5

    .line 355
    iget-object v0, p0, Lo/awk;->c:Lo/bcb;

    const-string v1, "no_disturb_end_time"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/bcb;->e(Ljava/lang/String;J)J

    move-result-wide v7

    .line 356
    invoke-direct {p0, v5, v6, v7, v8}, Lo/awk;->d(JJ)Z

    move-result v0

    return v0

    .line 361
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private d(JJ)Z
    .locals 6

    .line 375
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 377
    const/16 v0, 0xb

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 379
    const/16 v0, 0xc

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 381
    mul-int/lit8 v0, v3, 0x3c

    add-int v5, v0, v4

    .line 383
    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 385
    const-wide/16 p1, 0x564

    .line 387
    :cond_0
    const-wide/16 v0, -0x1

    cmp-long v0, p3, v0

    if-nez v0, :cond_1

    .line 389
    const-wide/16 p3, 0x21c

    .line 392
    :cond_1
    cmp-long v0, p1, p3

    if-lez v0, :cond_4

    .line 394
    int-to-long v0, v5

    cmp-long v0, v0, p1

    if-gez v0, :cond_2

    int-to-long v0, v5

    cmp-long v0, v0, p3

    if-gez v0, :cond_3

    .line 396
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 400
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 403
    :cond_4
    cmp-long v0, p1, p3

    if-gez v0, :cond_6

    .line 405
    int-to-long v0, v5

    cmp-long v0, v0, p1

    if-ltz v0, :cond_5

    int-to-long v0, v5

    cmp-long v0, v0, p3

    if-gez v0, :cond_5

    .line 407
    const/4 v0, 0x1

    return v0

    .line 411
    :cond_5
    const/4 v0, 0x0

    return v0

    .line 416
    :cond_6
    int-to-long v0, v5

    cmp-long v0, v0, p1

    if-nez v0, :cond_7

    .line 418
    const/4 v0, 0x1

    return v0

    .line 422
    :cond_7
    const/4 v0, 0x0

    return v0
.end method

.method private e(Landroid/app/Notification;)V
    .locals 8

    .line 159
    const/4 v3, 0x0

    .line 160
    iget-object v0, p0, Lo/awk;->c:Lo/bcb;

    const-string v1, "ring_setting"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v4

    .line 163
    if-eqz v4, :cond_0

    iget-boolean v0, p0, Lo/awk;->g:Z

    if-nez v0, :cond_1

    .line 166
    :cond_0
    invoke-direct {p0, p1}, Lo/awk;->d(Landroid/app/Notification;)V

    .line 167
    return-void

    .line 171
    :cond_1
    iget-object v0, p0, Lo/awk;->c:Lo/bcb;

    const-string v1, "ring_file_name"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 173
    iget-object v0, p0, Lo/awk;->c:Lo/bcb;

    const-string v1, "ring_uri"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 176
    invoke-direct {p0, v5}, Lo/awk;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 178
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 179
    iput-object v3, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 180
    return-void

    .line 183
    :cond_2
    iget-object v0, p0, Lo/awk;->c:Lo/bcb;

    const-string v1, "isFollowNotification"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v7

    .line 185
    if-nez v7, :cond_3

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 188
    invoke-direct {p0, p1}, Lo/awk;->d(Landroid/app/Notification;)V

    .line 189
    return-void

    .line 193
    :cond_3
    if-nez v7, :cond_4

    iget-object v0, p0, Lo/awk;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/bcc;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 196
    :cond_4
    invoke-virtual {p0}, Lo/awk;->a()Landroid/net/Uri;

    move-result-object v3

    .line 197
    iget v0, p1, Landroid/app/Notification;->defaults:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/app/Notification;->defaults:I

    .line 198
    iput-object v3, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 199
    return-void

    .line 203
    :cond_5
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 205
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    goto :goto_0

    .line 210
    :cond_6
    invoke-virtual {p0}, Lo/awk;->a()Landroid/net/Uri;

    move-result-object v3

    .line 211
    iget v0, p1, Landroid/app/Notification;->defaults:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/app/Notification;->defaults:I

    .line 214
    :goto_0
    iput-object v3, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 215
    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 2

    .line 492
    iget-object v0, p0, Lo/awk;->d:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/media/RingtoneManager;->getActualDefaultRingtoneUri(Landroid/content/Context;I)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/app/Notification;JZII)Landroid/app/Notification;
    .locals 3

    .line 120
    iget-object v0, p0, Lo/awk;->d:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/media/AudioManager;

    .line 121
    invoke-virtual {v2}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/awk;->g:Z

    .line 122
    invoke-virtual {v2}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lo/awk;->i:Z

    .line 125
    iget v0, p1, Landroid/app/Notification;->flags:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p1, Landroid/app/Notification;->flags:I

    .line 126
    const v0, -0xff0100

    iput v0, p1, Landroid/app/Notification;->ledARGB:I

    .line 127
    const/16 v0, 0x1f4

    iput v0, p1, Landroid/app/Notification;->ledOnMS:I

    .line 128
    const/16 v0, 0x7d0

    iput v0, p1, Landroid/app/Notification;->ledOffMS:I

    .line 131
    if-eqz p4, :cond_2

    invoke-direct {p0, p2, p3, p5, p6}, Lo/awk;->d(JII)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 133
    :cond_2
    invoke-direct {p0, p1}, Lo/awk;->d(Landroid/app/Notification;)V

    .line 134
    const/4 v0, 0x0

    iput-object v0, p1, Landroid/app/Notification;->vibrate:[J

    .line 135
    return-object p1

    .line 138
    :cond_3
    invoke-direct {p0, p1}, Lo/awk;->e(Landroid/app/Notification;)V

    .line 140
    invoke-virtual {p0, p2, p3, p5, p6}, Lo/awk;->b(JII)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 143
    iget v0, p1, Landroid/app/Notification;->defaults:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p1, Landroid/app/Notification;->defaults:I

    goto :goto_2

    .line 147
    :cond_4
    const/4 v0, 0x0

    iput-object v0, p1, Landroid/app/Notification;->vibrate:[J

    .line 149
    :goto_2
    return-object p1
.end method

.method public b()V
    .locals 5

    .line 262
    iget-object v0, p0, Lo/awk;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 263
    iget-object v0, p0, Lo/awk;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 264
    new-instance v1, Landroid/media/RingtoneManager;

    iget-object v0, p0, Lo/awk;->d:Landroid/content/Context;

    invoke-direct {v1, v0}, Landroid/media/RingtoneManager;-><init>(Landroid/content/Context;)V

    .line 267
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Landroid/media/RingtoneManager;->setType(I)V

    .line 269
    invoke-virtual {v1}, Landroid/media/RingtoneManager;->getCursor()Landroid/database/Cursor;

    move-result-object v2

    .line 270
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 274
    :cond_0
    const/4 v0, 0x1

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 275
    invoke-direct {p0, v2}, Lo/awk;->d(Landroid/database/Cursor;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    .line 276
    iget-object v0, p0, Lo/awk;->b:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    iget-object v0, p0, Lo/awk;->e:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 278
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 280
    :cond_1
    return-void
.end method

.method public b(JII)Z
    .locals 5

    .line 319
    invoke-direct {p0, p1, p2, p3, p4}, Lo/awk;->d(JII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    const/4 v0, 0x0

    return v0

    .line 323
    :cond_0
    iget-object v0, p0, Lo/awk;->c:Lo/bcb;

    const-string v1, "shake_setting"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 324
    iget-object v0, p0, Lo/awk;->d:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/media/AudioManager;

    .line 325
    invoke-virtual {v4}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v0

    if-nez v0, :cond_1

    .line 327
    const/4 v0, 0x0

    return v0

    .line 331
    :cond_1
    return v3
.end method

.method public c(J)Z
    .locals 5

    .line 436
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 438
    const/4 v4, 0x1

    goto :goto_0

    .line 443
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    iget-wide v2, p0, Lo/awk;->f:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 446
    :goto_0
    return v4
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 289
    iget-object v0, p0, Lo/awk;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    invoke-virtual {p0}, Lo/awk;->b()V

    .line 294
    :cond_0
    iget-object v0, p0, Lo/awk;->b:Ljava/util/List;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 304
    iget-object v0, p0, Lo/awk;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 306
    invoke-virtual {p0}, Lo/awk;->b()V

    .line 309
    :cond_0
    iget-object v0, p0, Lo/awk;->e:Ljava/util/List;

    return-object v0
.end method
