.class public final Lo/any;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()I
    .locals 4

    .line 103
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_setting"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 104
    if-eqz v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private b()I
    .locals 4

    .line 79
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowPushNotification"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 80
    if-eqz v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c()Ljava/lang/String;
    .locals 3

    .line 114
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_uri"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 8

    .line 272
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 274
    const-string v0, "SNS_BAK"

    const-string v1, "setSoundType ringUri is empty!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    return-void

    .line 278
    :cond_0
    invoke-static {}, Lo/awk;->c()Lo/awk;

    move-result-object v0

    invoke-virtual {v0}, Lo/awk;->a()Landroid/net/Uri;

    move-result-object v3

    .line 281
    if-eqz v3, :cond_1

    .line 283
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 285
    const-string v0, "SNS_BAK"

    const-string v1, "ringUri equal default ringtong uri"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    return-void

    .line 290
    :cond_1
    const/4 v4, 0x0

    .line 292
    invoke-static {}, Lo/awk;->c()Lo/awk;

    move-result-object v0

    invoke-virtual {v0}, Lo/awk;->d()Ljava/util/List;

    move-result-object v5

    .line 293
    invoke-static {}, Lo/awk;->c()Lo/awk;

    move-result-object v0

    invoke-virtual {v0}, Lo/awk;->e()Ljava/util/List;

    move-result-object v6

    .line 294
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 296
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 298
    const/4 v4, 0x1

    .line 299
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_file_name"

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 300
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_uri"

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 301
    goto :goto_1

    .line 294
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 305
    :cond_3
    :goto_1
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setSoundType isMatchRing:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    return-void
.end method

.method private e()I
    .locals 4

    .line 91
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowMsgDetail"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 92
    if-eqz v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private f()I
    .locals 4

    .line 167
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "enter_send_msg"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 168
    if-eqz v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private g()J
    .locals 4

    .line 156
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_end_time"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/bcb;->e(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private h()J
    .locals 4

    .line 146
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_start_time"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/bcb;->e(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private i()I
    .locals 4

    .line 135
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_setting"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 136
    if-eqz v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private k()I
    .locals 4

    .line 124
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "shake_setting"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 125
    if-eqz v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public d(Landroid/content/ContentValues;)I
    .locals 6

    .line 178
    const/4 v3, 0x0

    .line 179
    if-eqz p1, :cond_9

    .line 182
    const-string v0, "msg_notify"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    const-string v0, "msg_notify"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lo/anw;->e(Landroid/content/ContentValues;Ljava/lang/String;Z)Z

    move-result v4

    .line 185
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "msg_notify:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowPushNotification"

    invoke-virtual {v0, v1, v4}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 190
    :cond_0
    const-string v0, "notify_content"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 192
    const-string v0, "notify_content"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lo/anw;->e(Landroid/content/ContentValues;Ljava/lang/String;Z)Z

    move-result v4

    .line 193
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notify_content:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowMsgDetail"

    invoke-virtual {v0, v1, v4}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 198
    :cond_1
    const-string v0, "notify_sound"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 200
    const-string v0, "notify_content"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lo/anw;->e(Landroid/content/ContentValues;Ljava/lang/String;Z)Z

    move-result v4

    .line 201
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notify_sound:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_setting"

    invoke-virtual {v0, v1, v4}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 206
    :cond_2
    const-string v0, "sound_type"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 208
    const-string v0, "sound_type"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/any;->c(Ljava/lang/String;)V

    .line 212
    :cond_3
    const-string v0, "vibrate"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 214
    const-string v0, "vibrate"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lo/anw;->e(Landroid/content/ContentValues;Ljava/lang/String;Z)Z

    move-result v4

    .line 215
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "vibrate:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "shake_setting"

    invoke-virtual {v0, v1, v4}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 220
    :cond_4
    const-string v0, "dndst"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 222
    const-string v0, "dndst"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lo/anw;->e(Landroid/content/ContentValues;Ljava/lang/String;Z)Z

    move-result v4

    .line 223
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dndst:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_setting"

    invoke-virtual {v0, v1, v4}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 228
    :cond_5
    const-string v0, "dndst_starttime"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 230
    const-string v0, "dndst_starttime"

    const-wide/16 v1, -0x1

    invoke-static {p1, v0, v1, v2}, Lo/anw;->b(Landroid/content/ContentValues;Ljava/lang/String;J)J

    move-result-wide v4

    .line 231
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dndst_starttime:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-lez v0, :cond_6

    .line 234
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_start_time"

    invoke-virtual {v0, v1, v4, v5}, Lo/bcb;->a(Ljava/lang/String;J)Z

    .line 239
    :cond_6
    const-string v0, "dndst_endtime"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 241
    const-string v0, "dndst_endtime"

    const-wide/16 v1, -0x1

    invoke-static {p1, v0, v1, v2}, Lo/anw;->b(Landroid/content/ContentValues;Ljava/lang/String;J)J

    move-result-wide v4

    .line 242
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dndst_endtime:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-lez v0, :cond_7

    .line 245
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_end_time"

    invoke-virtual {v0, v1, v4, v5}, Lo/bcb;->a(Ljava/lang/String;J)Z

    .line 250
    :cond_7
    const-string v0, "enter_send"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 252
    const-string v0, "enter_send"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lo/anw;->e(Landroid/content/ContentValues;Ljava/lang/String;Z)Z

    move-result v4

    .line 253
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter_send:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "enter_send_msg"

    invoke-virtual {v0, v1, v4}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 256
    :cond_8
    const/4 v3, 0x1

    goto :goto_0

    .line 260
    :cond_9
    const-string v0, "SNS_BAK"

    const-string v1, "recover setting ContentValues null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    :goto_0
    return v3
.end method

.method d()Landroid/database/Cursor;
    .locals 5

    .line 37
    const/16 v0, 0x9

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "msg_notify"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "notify_content"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "notify_sound"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const-string v0, "sound_type"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    const-string v0, "vibrate"

    const/4 v1, 0x4

    aput-object v0, v2, v1

    const-string v0, "dndst"

    const/4 v1, 0x5

    aput-object v0, v2, v1

    const-string v0, "dndst_starttime"

    const/4 v1, 0x6

    aput-object v0, v2, v1

    const-string v0, "dndst_endtime"

    const/4 v1, 0x7

    aput-object v0, v2, v1

    const-string v0, "enter_send"

    const/16 v1, 0x8

    aput-object v0, v2, v1

    .line 40
    new-instance v3, Landroid/database/MatrixCursor;

    invoke-direct {v3, v2}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    .line 41
    invoke-virtual {v3}, Landroid/database/MatrixCursor;->newRow()Landroid/database/MatrixCursor$RowBuilder;

    move-result-object v4

    .line 44
    invoke-direct {p0}, Lo/any;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 47
    invoke-direct {p0}, Lo/any;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 50
    invoke-direct {p0}, Lo/any;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 53
    invoke-direct {p0}, Lo/any;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 56
    invoke-direct {p0}, Lo/any;->k()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 59
    invoke-direct {p0}, Lo/any;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 61
    invoke-direct {p0}, Lo/any;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 63
    invoke-direct {p0}, Lo/any;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 66
    invoke-direct {p0}, Lo/any;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/database/MatrixCursor$RowBuilder;->add(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;

    .line 68
    return-object v3
.end method
