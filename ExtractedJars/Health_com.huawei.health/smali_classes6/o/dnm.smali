.class public Lo/dnm;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static b:Lo/dnm;

.field private static d:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static final k:Ljava/lang/Object;


# instance fields
.field private c:Lo/dnq;

.field private e:Lo/dnv;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 39
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "com.huawei.bone.action.CLOUD_SWITCH_CHANGED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 40
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lo/dnm;->d:Ljava/util/HashSet;

    .line 110
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dnm;->a:Ljava/lang/Object;

    .line 174
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dnm;->k:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 104
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnm;->c:Lo/dnq;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnm;->e:Lo/dnv;

    .line 106
    invoke-static {p1}, Lo/dnq;->e(Landroid/content/Context;)Lo/dnq;

    move-result-object v0

    iput-object v0, p0, Lo/dnm;->c:Lo/dnq;

    .line 107
    invoke-static {p1}, Lo/dnv;->c(Landroid/content/Context;)Lo/dnv;

    move-result-object v0

    iput-object v0, p0, Lo/dnm;->e:Lo/dnv;

    .line 108
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/dnm;
    .locals 6

    .line 116
    invoke-static {}, Lo/doo;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 117
    const-string v0, "HWUserProfileMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isMainProcess false;UserProfileMgr error!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    :cond_0
    sget-object v4, Lo/dnm;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 120
    :try_start_0
    sget-object v0, Lo/dnm;->b:Lo/dnm;

    if-nez v0, :cond_1

    .line 121
    new-instance v0, Lo/dnm;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dnm;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dnm;->b:Lo/dnm;

    .line 123
    :cond_1
    sget-object v0, Lo/dnm;->b:Lo/dnm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 124
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 136
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0}, Lo/dnq;->d()V

    .line 137
    iget-object v0, p0, Lo/dnm;->e:Lo/dnv;

    invoke-virtual {v0}, Lo/dnv;->c()V

    .line 138
    return-void
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 154
    invoke-static {p1}, Lo/dol;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 155
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 237
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0, p1}, Lo/dnq;->b(Ljava/lang/String;)V

    .line 238
    return-void
.end method

.method public b()V
    .locals 1

    .line 145
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0}, Lo/dnq;->b()V

    .line 146
    iget-object v0, p0, Lo/dnm;->e:Lo/dnv;

    invoke-virtual {v0}, Lo/dnv;->d()V

    .line 147
    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 1

    .line 311
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0, p1}, Lo/dnq;->a(Landroid/content/Context;)V

    .line 312
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 290
    iget-object v0, p0, Lo/dnm;->e:Lo/dnv;

    invoke-virtual {v0, p1}, Lo/dnv;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 291
    return-void
.end method

.method public b(Lcom/huawei/up/callback/CommonCallback;)V
    .locals 1

    .line 249
    iget-object v0, p0, Lo/dnm;->e:Lo/dnv;

    invoke-virtual {v0, p1}, Lo/dnv;->c(Lcom/huawei/up/callback/CommonCallback;)V

    .line 250
    return-void
.end method

.method public c(I)Ljava/lang/String;
    .locals 1

    .line 344
    iget-object v0, p0, Lo/dnm;->e:Lo/dnv;

    invoke-virtual {v0, p1}, Lo/dnv;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 191
    const-string v0, "HWUserProfileMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getCustomeDefine Entry, key="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    const-string v0, ""

    return-object v0
.end method

.method public c(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 199
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0, p1, p2, p3}, Lo/dnq;->a(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    .line 200
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 286
    iget-object v0, p0, Lo/dnm;->e:Lo/dnv;

    invoke-virtual {v0, p1}, Lo/dnv;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 287
    return-void
.end method

.method public c()Z
    .locals 1

    .line 131
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0}, Lo/dnq;->a()Z

    move-result v0

    return v0
.end method

.method public d()V
    .locals 1

    .line 141
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0}, Lo/dnq;->c()V

    .line 142
    return-void
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 226
    const-string v0, "HWUserProfileMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfo() callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    invoke-virtual {p0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 229
    return-void
.end method

.method public d(Lcom/huawei/up/callback/CommonCallback;)V
    .locals 1

    .line 245
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0, p1}, Lo/dnq;->a(Lcom/huawei/up/callback/CommonCallback;)V

    .line 246
    return-void
.end method

.method public e()V
    .locals 1

    .line 150
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0}, Lo/dnq;->e()V

    .line 151
    return-void
.end method

.method public e(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 281
    iget-object v0, p0, Lo/dnm;->e:Lo/dnv;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/dnv;->d(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 282
    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 5

    .line 320
    const-string v0, "HWUserProfileMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNoAllowLoginArea() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0, p1}, Lo/dnq;->c(Landroid/content/Context;)V

    .line 324
    invoke-static {p1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v4

    .line 326
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/login/ui/login/LoginInit;->setIsLogined(Z)V

    .line 328
    const-string v0, "0"

    invoke-virtual {v4, v0}, Lcom/huawei/login/ui/login/LoginInit;->setUsetId(Ljava/lang/String;)V

    .line 329
    return-void
.end method

.method e(Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/up/model/UserInfomation;Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 206
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0, p1, p2}, Lo/dnq;->e(Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    .line 207
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lo/cyx;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 183
    return-void
.end method

.method public f()V
    .locals 1

    .line 340
    iget-object v0, p0, Lo/dnm;->e:Lo/dnv;

    invoke-virtual {v0}, Lo/dnv;->e()V

    .line 341
    return-void
.end method

.method protected getAvailableBroadcastSet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 170
    sget-object v0, Lo/dnm;->d:Ljava/util/HashSet;

    return-object v0
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 162
    const/16 v0, 0x3ec

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public i()Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 216
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0}, Lo/dnq;->k()Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    return-object v0
.end method

.method public k()V
    .locals 1

    .line 241
    iget-object v0, p0, Lo/dnm;->c:Lo/dnq;

    invoke-virtual {v0}, Lo/dnq;->g()V

    .line 242
    return-void
.end method

.method public onDataMigrate()Z
    .locals 1

    .line 295
    const/4 v0, 0x1

    return v0
.end method
