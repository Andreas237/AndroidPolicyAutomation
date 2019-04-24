.class public final Lo/awj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/awj$c;,
        Lo/awj$a;
    }
.end annotation


# static fields
.field private static c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;Lo/awj;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lo/awp;

.field private b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

.field private e:Ljava/lang/Object;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/awj$a;>;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/awj;->c:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    .line 69
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/awj;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 74
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/awj;->e:Ljava/lang/Object;

    .line 79
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/awj;->h:Ljava/lang/Object;

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/awj;->g:Ljava/util/List;

    .line 116
    new-instance v0, Lo/awp;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/awp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/awj;->a:Lo/awp;

    .line 117
    return-void
.end method

.method static synthetic a(Lo/awj;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    .locals 1

    .line 43
    invoke-direct {p0}, Lo/awj;->k()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/awj;Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    .locals 0

    .line 43
    iput-object p1, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    return-object p1
.end method

.method private a(ILandroid/os/Handler;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILandroid/os/Handler;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 252
    new-instance v0, Lo/awj$4;

    invoke-direct {v0, p0, p2, p1}, Lo/awj$4;-><init>(Lo/awj;Landroid/os/Handler;I)V

    return-object v0
.end method

.method private a(Lo/awj$a;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/awj$a;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 636
    new-instance v0, Lo/awj$9;

    invoke-direct {v0, p0, p1}, Lo/awj$9;-><init>(Lo/awj;Lo/awj$a;)V

    return-object v0
.end method

.method private static a(JLjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 745
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v1

    .line 746
    if-nez v1, :cond_0

    .line 748
    return-void

    .line 750
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    .line 753
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 755
    invoke-static {p0, p1, v2, p2, p3}, Lo/bbk;->e(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 756
    return-void

    .line 759
    :cond_1
    invoke-static {v2, p2}, Lo/bqz;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 761
    invoke-static {p0, p1, v2, p2, p3}, Lo/bbk;->d(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 763
    :cond_2
    return-void
.end method

.method private a(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 5

    .line 692
    if-nez p1, :cond_0

    .line 694
    return-void

    .line 696
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getUserID_()J

    move-result-wide v2

    .line 697
    invoke-direct {p0}, Lo/awj;->m()Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 699
    if-eqz v4, :cond_1

    .line 702
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v0, v1}, Lo/awj;->a(JLjava/lang/String;Ljava/lang/String;)V

    .line 704
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/axa;->e(Lcom/huawei/health/sns/model/user/User;)Z

    .line 706
    :cond_1
    return-void
.end method

.method static synthetic b(Lo/awj;)Ljava/lang/Object;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/awj;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public static declared-synchronized b()Lo/awj;
    .locals 6

    const-class v5, Lo/awj;

    monitor-enter v5

    .line 126
    :try_start_0
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v2

    .line 127
    sget-object v0, Lo/awj;->c:Ljava/util/Map;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/awj;

    .line 128
    if-nez v4, :cond_0

    .line 130
    new-instance v4, Lo/awj;

    invoke-direct {v4}, Lo/awj;-><init>()V

    .line 132
    sget-object v0, Lo/awj;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 133
    sget-object v0, Lo/awj;->c:Ljava/util/Map;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    :cond_0
    monitor-exit v5

    return-object v4

    :catchall_0
    move-exception v2

    monitor-exit v5

    throw v2
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 814
    new-instance v0, Lo/awj$8;

    invoke-direct {v0, p0, p1, p2}, Lo/awj$8;-><init>(Lo/awj;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private b(Lo/awj$c;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/awj$c;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 291
    new-instance v0, Lo/awj$1;

    invoke-direct {v0, p0, p1}, Lo/awj$1;-><init>(Lo/awj;Lo/awj$c;)V

    return-object v0
.end method

.method private b(ZILcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 5

    .line 510
    iget-object v0, p0, Lo/awj;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 512
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 513
    iget-object v3, p0, Lo/awj;->g:Ljava/util/List;

    monitor-enter v3

    .line 515
    :try_start_0
    iget-object v0, p0, Lo/awj;->g:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 516
    iget-object v0, p0, Lo/awj;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 517
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 520
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/awj$a;

    .line 522
    if-eqz p1, :cond_0

    .line 524
    invoke-interface {v4, p3}, Lo/awj$a;->d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V

    goto :goto_2

    .line 528
    :cond_0
    invoke-interface {v4, p2}, Lo/awj$a;->c(I)V

    .line 530
    :goto_2
    goto :goto_1

    .line 531
    :cond_1
    return-void
.end method

.method private c(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    .locals 3

    .line 163
    const/4 v2, 0x0

    .line 165
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;->getGetUserSNSInfoRsp_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 167
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;->getGetUserSNSInfoRsp_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;->getUserSNSInfo_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v2

    .line 169
    :cond_0
    if-eqz v2, :cond_1

    .line 171
    const-string v0, "self_info"

    invoke-static {v2}, Lo/awh;->c(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/awj;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 172
    iput-object v2, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    .line 173
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getPrivacySetFlags_()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/awj;->e(Ljava/lang/String;)V

    .line 175
    :cond_1
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    return-object v0
.end method

.method static synthetic c(Lo/awj;Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    .locals 1

    .line 43
    invoke-direct {p0, p1}, Lo/awj;->c(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/awj;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lo/awj;->o()V

    return-void
.end method

.method static synthetic c(Lo/awj;Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lo/awj;->a(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V

    return-void
.end method

.method static synthetic d(Lo/awj;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    return-object v0
.end method

.method static synthetic d(Lo/awj;Lo/awj$a;)Lo/brd;
    .locals 1

    .line 43
    invoke-direct {p0, p1}, Lo/awj;->a(Lo/awj$a;)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/awj;ZILcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Lo/awj;->b(ZILcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V

    return-void
.end method

.method static synthetic e(Lo/awj;)Ljava/lang/Object;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/awj;->h:Ljava/lang/Object;

    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 7

    .line 181
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    return-void

    .line 186
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 188
    const/4 v0, 0x5

    if-eq v3, v0, :cond_1

    .line 190
    return-void

    .line 192
    :cond_1
    const/4 v4, 0x0

    .line 194
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 195
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v6

    .line 199
    if-eqz v6, :cond_2

    .line 201
    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 203
    :cond_2
    const-string v0, "SettingManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isAgreeUploadContact:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x1

    if-ne v4, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 206
    return-void
.end method

.method static synthetic g(Lo/awj;)Lo/awp;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/awj;->a:Lo/awp;

    return-object v0
.end method

.method private k()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    .locals 6

    .line 377
    iget-object v2, p0, Lo/awj;->h:Ljava/lang/Object;

    monitor-enter v2

    .line 379
    const/4 v3, 0x0

    .line 380
    :try_start_0
    iget-object v0, p0, Lo/awj;->a:Lo/awp;

    const-string v1, "self_info"

    invoke-virtual {v0, v1}, Lo/awp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 381
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 383
    invoke-static {v4}, Lo/awh;->e(Ljava/lang/String;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 385
    :cond_0
    monitor-exit v2

    return-object v3

    .line 386
    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5
.end method

.method private l()Lo/awj$a;
    .locals 1

    .line 484
    new-instance v0, Lo/awj$3;

    invoke-direct {v0, p0}, Lo/awj$3;-><init>(Lo/awj;)V

    return-object v0
.end method

.method private m()Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 731
    invoke-virtual {p0}, Lo/awj;->a()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v1

    .line 732
    new-instance v0, Lo/awg;

    invoke-direct {v0}, Lo/awg;-><init>()V

    invoke-virtual {v0, v1}, Lo/awg;->c(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    .line 733
    return-object v2
.end method

.method private n()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 556
    new-instance v0, Lo/awj$10;

    invoke-direct {v0, p0}, Lo/awj$10;-><init>(Lo/awj;)V

    return-object v0
.end method

.method private o()V
    .locals 3

    .line 444
    iget-object v0, p0, Lo/awj;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 447
    return-void

    .line 451
    :cond_0
    invoke-direct {p0}, Lo/awj;->l()Lo/awj$a;

    move-result-object v2

    .line 452
    new-instance v0, Lo/awj$5;

    invoke-direct {v0, p0, v2}, Lo/awj$5;-><init>(Lo/awj;Lo/awj$a;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 475
    return-void
.end method

.method private p()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 396
    new-instance v0, Lo/awj$2;

    invoke-direct {v0, p0}, Lo/awj$2;-><init>(Lo/awj;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    .locals 1

    .line 313
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    if-eqz v0, :cond_0

    .line 315
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    return-object v0

    .line 318
    :cond_0
    invoke-direct {p0}, Lo/awj;->k()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v0

    iput-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    .line 319
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 215
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    if-nez v0, :cond_0

    .line 217
    invoke-virtual {p0}, Lo/awj;->a()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v0

    iput-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    .line 219
    :cond_0
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    if-eqz v0, :cond_1

    .line 221
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setPrivacySetFlags_(Ljava/lang/String;)V

    goto :goto_0

    .line 225
    :cond_1
    new-instance v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;-><init>()V

    iput-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    .line 226
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->setPrivacySetFlags_(Ljava/lang/String;)V

    .line 228
    :goto_0
    const-string v0, "self_info"

    iget-object v1, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    invoke-static {v1}, Lo/awh;->c(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/awj;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 229
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 363
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    if-eqz v0, :cond_0

    .line 365
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getQrCode_()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 367
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(ILandroid/os/Handler;)V
    .locals 2

    .line 240
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lo/awj;->a(ILandroid/os/Handler;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 241
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 802
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lo/awj;->b(Ljava/lang/String;Ljava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 803
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 2

    .line 329
    invoke-virtual {p0}, Lo/awj;->a()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v1

    .line 330
    if-eqz v1, :cond_0

    .line 332
    invoke-virtual {v1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 334
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 773
    iget-object v1, p0, Lo/awj;->h:Ljava/lang/Object;

    monitor-enter v1

    .line 775
    :try_start_0
    iget-object v0, p0, Lo/awj;->a:Lo/awp;

    invoke-virtual {v0, p1}, Lo/awp;->b(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 776
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public e()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    .locals 3

    .line 344
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    if-nez v0, :cond_0

    .line 347
    invoke-virtual {p0}, Lo/awj;->h()V

    .line 349
    :cond_0
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 351
    const-string v0, "SettingManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getCacheUserSNSInfo checkNull:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    :cond_2
    iget-object v0, p0, Lo/awj;->d:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    return-object v0
.end method

.method public e(Lo/awj$a;)V
    .locals 3

    .line 429
    if-eqz p1, :cond_0

    .line 431
    iget-object v1, p0, Lo/awj;->g:Ljava/util/List;

    monitor-enter v1

    .line 433
    :try_start_0
    iget-object v0, p0, Lo/awj;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 434
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 436
    :cond_0
    :goto_0
    invoke-direct {p0}, Lo/awj;->o()V

    .line 437
    return-void
.end method

.method public e(Lo/awj$c;)V
    .locals 2

    .line 280
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1}, Lo/awj;->b(Lo/awj$c;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 281
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 788
    iget-object v1, p0, Lo/awj;->h:Ljava/lang/Object;

    monitor-enter v1

    .line 790
    :try_start_0
    iget-object v0, p0, Lo/awj;->a:Lo/awp;

    invoke-virtual {v0, p1, p2}, Lo/awp;->a(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    .line 791
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public f()V
    .locals 2

    .line 546
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0}, Lo/awj;->n()Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 547
    return-void
.end method

.method public g()Lcom/huawei/health/sns/model/user/User;
    .locals 4

    .line 715
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v1

    .line 716
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 717
    if-nez v3, :cond_0

    .line 719
    invoke-direct {p0}, Lo/awj;->m()Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 721
    :cond_0
    return-object v3
.end method

.method public h()V
    .locals 2

    .line 538
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0}, Lo/awj;->p()Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 539
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 5

    .line 580
    const-string v2, ""

    .line 581
    invoke-virtual {p0}, Lo/awj;->a()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v3

    .line 582
    if-eqz v3, :cond_1

    .line 585
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getPrivacySetFlags_()Ljava/lang/String;

    move-result-object v2

    .line 586
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 588
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    .line 589
    array-length v0, v4

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    .line 591
    const/16 v0, 0x31

    const/4 v1, 0x1

    aput-char v0, v4, v1

    .line 593
    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v4}, Ljava/lang/String;-><init>([C)V

    .line 596
    :cond_1
    return-object v2
.end method
