.class public Lo/aow;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aow$e;
    }
.end annotation


# static fields
.field private static final b:[B

.field private static final c:Ljava/lang/String;

.field private static e:Lo/aow;


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const-class v0, Lo/aow;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/aow;->c:Ljava/lang/String;

    .line 155
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/aow;->b:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/aow;->a:Ljava/util/Map;

    .line 175
    return-void
.end method

.method private a()V
    .locals 5

    .line 423
    sget-object v1, Lo/aow;->b:[B

    monitor-enter v1

    .line 425
    :try_start_0
    iget-object v0, p0, Lo/aow;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 427
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 428
    goto :goto_0

    .line 430
    :cond_0
    iget-object v0, p0, Lo/aow;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 431
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 432
    :goto_1
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 399
    sget-object v2, Lo/aow;->b:[B

    monitor-enter v2

    .line 401
    :try_start_0
    iget-object v0, p0, Lo/aow;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 403
    iget-object v0, p0, Lo/aow;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Set;

    .line 405
    invoke-interface {v3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    .line 406
    goto :goto_0

    .line 410
    :cond_0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 411
    invoke-interface {v3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    .line 412
    iget-object v0, p0, Lo/aow;->a:Ljava/util/Map;

    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 414
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 415
    :goto_1
    return v1
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 354
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 356
    return-void

    .line 359
    :cond_0
    invoke-direct {p0}, Lo/aow;->b()Z

    move-result v4

    .line 361
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v5

    .line 364
    invoke-direct {p0, p1}, Lo/aow;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v5}, Lo/axr;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    if-eqz v4, :cond_1

    .line 365
    invoke-static {}, Lo/bom;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 367
    :cond_1
    sget-object v0, Lo/aow;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "analytic for BI, do not meet current conditions, user experience status : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 368
    invoke-direct {p0, p1}, Lo/aow;->c(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", ics : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 369
    invoke-virtual {v5}, Lo/axr;->c()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", ica: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", is emui : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 370
    invoke-static {}, Lo/bom;->e()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 367
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    return-void

    .line 375
    :cond_3
    const-string v0, "from_pkg"

    invoke-virtual {p3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    .line 378
    if-nez v6, :cond_4

    const-string v0, "SNS_CLIK_SYSNTC"

    .line 379
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "SNS_CLIK_SYSMENU"

    .line 380
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 381
    invoke-direct {p0, p2, p3}, Lo/aow;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 386
    :cond_4
    invoke-direct {p0, p1}, Lo/aow;->d(Landroid/content/Context;)V

    .line 387
    return-void
.end method

.method private b()Z
    .locals 2

    .line 715
    const-string v0, "CN"

    sget-object v1, Lo/bps$a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/aow;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/aow;->a()V

    return-void
.end method

.method private c(Landroid/content/Context;)Z
    .locals 5

    .line 652
    const/4 v3, 0x0

    .line 655
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "user_experience_involved"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 661
    goto :goto_0

    .line 658
    :catch_0
    move-exception v4

    .line 660
    sget-object v0, Lo/aow;->c:Ljava/lang/String;

    const-string v1, "setOpenUserExperienceInvolved(Context context) Throwable"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 663
    :goto_0
    sget-object v0, Lo/aow;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "user experience is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 665
    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 30
    sget-object v0, Lo/aow;->c:Ljava/lang/String;

    return-object v0
.end method

.method private d(Landroid/content/Context;)V
    .locals 2

    .line 674
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/aow$2;

    invoke-direct {v1, p0}, Lo/aow$2;-><init>(Lo/aow;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 708
    return-void
.end method

.method public static declared-synchronized e()Lo/aow;
    .locals 3

    const-class v1, Lo/aow;

    monitor-enter v1

    .line 164
    :try_start_0
    sget-object v0, Lo/aow;->e:Lo/aow;

    if-nez v0, :cond_0

    .line 166
    new-instance v0, Lo/aow;

    invoke-direct {v0}, Lo/aow;-><init>()V

    sput-object v0, Lo/aow;->e:Lo/aow;

    .line 168
    :cond_0
    sget-object v0, Lo/aow;->e:Lo/aow;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a(Landroid/content/Context;JJLjava/lang/String;)V
    .locals 3

    .line 246
    new-instance v0, Lo/aow$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aow$e;-><init>(Lo/aow$2;)V

    .line 247
    invoke-virtual {v0, p2, p3}, Lo/aow$e;->b(J)Lo/aow$e;

    move-result-object v0

    .line 248
    invoke-virtual {v0, p4, p5}, Lo/aow$e;->d(J)Lo/aow$e;

    move-result-object v0

    .line 249
    invoke-virtual {v0, p6}, Lo/aow$e;->a(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 250
    invoke-virtual {v0}, Lo/aow$e;->a()Ljava/lang/String;

    move-result-object v2

    .line 251
    const-string v0, "SNS_VIEW_USER"

    invoke-direct {p0, p1, v0, v2}, Lo/aow;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    return-void
.end method

.method public a(Landroid/content/Context;JLjava/lang/String;)V
    .locals 3

    .line 317
    new-instance v0, Lo/aow$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aow$e;-><init>(Lo/aow$2;)V

    .line 318
    invoke-virtual {v0, p2, p3}, Lo/aow$e;->b(J)Lo/aow$e;

    move-result-object v0

    .line 319
    invoke-virtual {v0, p4}, Lo/aow$e;->a(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 320
    invoke-virtual {v0}, Lo/aow$e;->a()Ljava/lang/String;

    move-result-object v2

    .line 321
    const-string v0, "SNS_CREATE_GROUP"

    invoke-direct {p0, p1, v0, v2}, Lo/aow;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    return-void
.end method

.method public b(Landroid/content/Context;JJLjava/lang/String;)V
    .locals 3

    .line 282
    new-instance v0, Lo/aow$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aow$e;-><init>(Lo/aow$2;)V

    .line 283
    invoke-virtual {v0, p2, p3}, Lo/aow$e;->b(J)Lo/aow$e;

    move-result-object v0

    .line 284
    invoke-virtual {v0, p4, p5}, Lo/aow$e;->e(J)Lo/aow$e;

    move-result-object v0

    .line 285
    invoke-virtual {v0, p6}, Lo/aow$e;->a(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 286
    invoke-virtual {v0}, Lo/aow$e;->a()Ljava/lang/String;

    move-result-object v2

    .line 287
    const-string v0, "SNS_ADD_FRIEND"

    invoke-direct {p0, p1, v0, v2}, Lo/aow;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    return-void
.end method

.method public b(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 206
    new-instance v0, Lo/aow$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aow$e;-><init>(Lo/aow$2;)V

    .line 207
    invoke-virtual {v0, p2, p3}, Lo/aow$e;->a(J)Lo/aow$e;

    move-result-object v0

    .line 208
    invoke-virtual {v0, p4, p5}, Lo/aow$e;->b(J)Lo/aow$e;

    move-result-object v0

    .line 209
    invoke-virtual {v0, p6}, Lo/aow$e;->d(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 210
    invoke-virtual {v0, p7}, Lo/aow$e;->a(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 211
    invoke-virtual {v0}, Lo/aow$e;->a()Ljava/lang/String;

    move-result-object v2

    .line 212
    const-string v0, "SNS_VIEW_SYSNTC"

    invoke-direct {p0, p1, v0, v2}, Lo/aow;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    return-void
.end method

.method public c()V
    .locals 3

    .line 439
    sget-object v0, Lo/aow;->c:Ljava/lang/String;

    const-string v1, " onAppExitReport begin"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bca;->c(Ljava/lang/Long;)V

    .line 441
    invoke-direct {p0}, Lo/aow;->a()V

    .line 442
    return-void
.end method

.method public c(Landroid/content/Context;JJLjava/lang/String;)V
    .locals 3

    .line 300
    new-instance v0, Lo/aow$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aow$e;-><init>(Lo/aow$2;)V

    .line 301
    invoke-virtual {v0, p2, p3}, Lo/aow$e;->b(J)Lo/aow$e;

    move-result-object v0

    .line 302
    invoke-virtual {v0, p4, p5}, Lo/aow$e;->c(J)Lo/aow$e;

    move-result-object v0

    .line 303
    invoke-virtual {v0, p6}, Lo/aow$e;->a(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 304
    invoke-virtual {v0}, Lo/aow$e;->a()Ljava/lang/String;

    move-result-object v2

    .line 305
    const-string v0, "SNS_SHARE_MSG"

    invoke-direct {p0, p1, v0, v2}, Lo/aow;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    return-void
.end method

.method public d(Landroid/content/Context;JJLjava/lang/String;)V
    .locals 3

    .line 187
    new-instance v0, Lo/aow$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aow$e;-><init>(Lo/aow$2;)V

    .line 188
    invoke-virtual {v0, p2, p3}, Lo/aow$e;->a(J)Lo/aow$e;

    move-result-object v0

    .line 189
    invoke-virtual {v0, p4, p5}, Lo/aow$e;->b(J)Lo/aow$e;

    move-result-object v0

    .line 190
    invoke-virtual {v0, p6}, Lo/aow$e;->d(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 191
    invoke-virtual {v0}, Lo/aow$e;->a()Ljava/lang/String;

    move-result-object v2

    .line 192
    const-string v0, "SNS_REV_SYSNTC"

    invoke-direct {p0, p1, v0, v2}, Lo/aow;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    return-void
.end method

.method public e(Landroid/content/Context;JJLjava/lang/String;)V
    .locals 3

    .line 264
    new-instance v0, Lo/aow$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aow$e;-><init>(Lo/aow$2;)V

    .line 265
    invoke-virtual {v0, p2, p3}, Lo/aow$e;->b(J)Lo/aow$e;

    move-result-object v0

    .line 266
    invoke-virtual {v0, p4, p5}, Lo/aow$e;->c(J)Lo/aow$e;

    move-result-object v0

    .line 267
    invoke-virtual {v0, p6}, Lo/aow$e;->a(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 268
    invoke-virtual {v0}, Lo/aow$e;->a()Ljava/lang/String;

    move-result-object v2

    .line 269
    const-string v0, "SNS_VIEW_CHAT"

    invoke-direct {p0, p1, v0, v2}, Lo/aow;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    return-void
.end method

.method public e(Landroid/content/Context;JJLjava/lang/String;ILjava/lang/String;)V
    .locals 3

    .line 226
    new-instance v0, Lo/aow$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aow$e;-><init>(Lo/aow$2;)V

    .line 227
    invoke-virtual {v0, p2, p3}, Lo/aow$e;->a(J)Lo/aow$e;

    move-result-object v0

    .line 228
    invoke-virtual {v0, p4, p5}, Lo/aow$e;->b(J)Lo/aow$e;

    move-result-object v0

    .line 229
    invoke-virtual {v0, p6}, Lo/aow$e;->d(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 230
    invoke-virtual {v0, p7}, Lo/aow$e;->b(I)Lo/aow$e;

    move-result-object v0

    .line 231
    invoke-virtual {v0, p8}, Lo/aow$e;->a(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 232
    invoke-virtual {v0}, Lo/aow$e;->a()Ljava/lang/String;

    move-result-object v2

    .line 233
    const-string v0, "SNS_CLIK_SYSNTC"

    invoke-direct {p0, p1, v0, v2}, Lo/aow;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    return-void
.end method

.method public e(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 334
    new-instance v0, Lo/aow$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aow$e;-><init>(Lo/aow$2;)V

    .line 335
    invoke-virtual {v0, p2, p3}, Lo/aow$e;->a(J)Lo/aow$e;

    move-result-object v0

    .line 336
    invoke-virtual {v0, p4, p5}, Lo/aow$e;->b(J)Lo/aow$e;

    move-result-object v0

    .line 337
    invoke-virtual {v0, p6}, Lo/aow$e;->b(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 338
    invoke-virtual {v0, p7}, Lo/aow$e;->e(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 339
    invoke-virtual {v0, p8}, Lo/aow$e;->a(Ljava/lang/String;)Lo/aow$e;

    move-result-object v0

    .line 340
    invoke-virtual {v0}, Lo/aow$e;->a()Ljava/lang/String;

    move-result-object v2

    .line 341
    const-string v0, "SNS_CLIK_SYSMENU"

    invoke-direct {p0, p1, v0, v2}, Lo/aow;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    return-void
.end method
