.class public Lo/cee;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lo/dcy;

.field private b:Landroid/content/Context;

.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/cee;->d:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/dcy;Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lo/cee;->b:Landroid/content/Context;

    .line 33
    iput-object p2, p0, Lo/cee;->a:Lo/dcy;

    .line 34
    iput-object p3, p0, Lo/cee;->e:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public static e(Landroid/content/Context;)I
    .locals 5

    .line 408
    if-eqz p0, :cond_1

    .line 409
    .line 410
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport_listen_type"

    .line 409
    invoke-static {p0, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 412
    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 413
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 415
    :cond_0
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireListenerType you should set it before get"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    const/4 v0, 0x0

    return v0

    .line 420
    :cond_1
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireListenerType  context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()J
    .locals 6

    .line 262
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "diffTimeBetweenGpsAndSystem"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 263
    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "diffTimeBetweenGpsAndSystem"

    const-string v3, "0"

    iget-object v4, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 266
    const-wide/16 v0, 0x0

    return-wide v0

    .line 268
    :cond_0
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a(I)V
    .locals 5

    .line 90
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    .line 91
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "voice_enable_type"

    iget-object v3, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v4, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 93
    return-void
.end method

.method public a(J)V
    .locals 5

    .line 239
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    .line 240
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "LastSportStartElapsedTime"

    iget-object v3, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v4, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 241
    return-void
.end method

.method public a(Z)V
    .locals 5

    .line 178
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    .line 179
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "iscrash"

    iget-object v3, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v4, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 180
    return-void
.end method

.method public b()I
    .locals 6

    .line 77
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "voice_enable_type"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 78
    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "voice_enable_type"

    const-string v3, "1"

    iget-object v4, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 81
    const/4 v0, 0x1

    return v0

    .line 83
    :cond_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(J)V
    .locals 5

    .line 273
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    .line 274
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "diffTimeBetweenGpsAndSystem"

    iget-object v3, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v4, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 278
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .line 189
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "logoffset"

    iget-object v3, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, p1, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 190
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 392
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, p1, p2, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 394
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 4

    .line 183
    const-string v3, ""

    .line 184
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "logoffset"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 185
    return-object v3
.end method

.method public d()I
    .locals 6

    .line 244
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "map_type_setting_key"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 245
    if-eqz v5, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 247
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 248
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "map_type_setting_key"

    const-string v3, "1"

    iget-object v4, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 249
    const/4 v0, 0x1

    return v0

    .line 251
    :cond_1
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "map_type_setting_key"

    const-string v3, "2"

    iget-object v4, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 252
    const/4 v0, 0x2

    return v0

    .line 255
    :cond_2
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Z)V
    .locals 5

    .line 439
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveChartHorizontalHasShown bFlag:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveChartHorizontalHasShown "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cee;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "track_horizontal_chart_tips_shown"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "track_horizontal_chart_tips_shown"

    .line 443
    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/cee;->a:Lo/dcy;

    .line 441
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 444
    return-void
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 387
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 388
    return-object v2
.end method

.method public e(J)V
    .locals 5

    .line 367
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    .line 368
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "diffTimeOnce"

    iget-object v3, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v4, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 372
    return-void
.end method

.method public e(Z)V
    .locals 5

    .line 459
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "show_chart_operation_tip"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 461
    return-void
.end method

.method public e()Z
    .locals 7

    .line 165
    const/4 v5, 0x0

    .line 166
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "iscrash"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 167
    const-string v0, ""

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrackCrashState TRACK_CRASH_KEY is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "iscrash"

    const-string v3, "false"

    iget-object v4, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 172
    :cond_0
    const-string v0, "true"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    .line 174
    :goto_0
    return v5
.end method

.method public f()I
    .locals 5

    .line 356
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "voice_broadcast_distance_interval_value"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 357
    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 358
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 360
    :cond_0
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireVoiceDistanceIntervalValue you should set it before get"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    const/4 v0, 0x0

    return v0
.end method

.method public g()J
    .locals 6

    .line 375
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "diffTimeOnce"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 376
    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 378
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "diffTimeOnce"

    const-string v3, "0"

    iget-object v4, p0, Lo/cee;->a:Lo/dcy;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 379
    const-wide/16 v0, 0x0

    return-wide v0

    .line 381
    :cond_0
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public h()I
    .locals 5

    .line 346
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "voice_broadcast_time_interval_value"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 347
    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 348
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 350
    :cond_0
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireVoiceTimeIntervalValue you should set it before get"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    const/4 v0, 0x0

    return v0
.end method

.method public i()Z
    .locals 5

    .line 397
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    .line 398
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_pause_enable_status"

    .line 397
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 400
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 401
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 403
    :cond_0
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireAutoPauseEnableStatus you should set it before get"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    const/4 v0, 0x0

    return v0
.end method

.method public k()I
    .locals 5

    .line 335
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "voice_broadcast_interval_type"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 336
    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 337
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 339
    :cond_0
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireVoiceIntervalSettingType you should set it before get"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    const/4 v0, 0x0

    return v0
.end method

.method public l()Z
    .locals 5

    .line 464
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "security_no_more_remind"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 465
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSecurityNoMoreRemind "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 467
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 469
    :cond_1
    const-string v0, "true"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public n()Z
    .locals 5

    .line 427
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireChartHorizontalHasShown "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cee;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "track_horizontal_chart_tips_shown"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "track_horizontal_chart_tips_shown"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 429
    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 430
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireChartHorizontalHasShown bFlag:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 433
    :cond_0
    const-string v0, "Track_TrackSharedPreferenceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireChartHorizontalHasShown return default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    const/4 v0, 0x0

    return v0
.end method

.method public p()Z
    .locals 4

    .line 447
    iget-object v0, p0, Lo/cee;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cee;->e:Ljava/lang/String;

    const-string v2, "show_chart_operation_tip"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 448
    if-eqz v3, :cond_0

    const-string v0, ""

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 450
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 452
    :cond_1
    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
