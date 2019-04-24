.class public Lo/drs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/drs$e;
    }
.end annotation


# static fields
.field private static a:Lo/drs;

.field private static final c:Ljava/lang/String;

.field private static e:Lo/drs$e;

.field private static final f:Ljava/lang/Object;

.field private static final g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private static final k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Lo/dre;>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Landroid/os/HandlerThread;

.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Lo/drs;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drs;->c:Ljava/lang/String;

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/drs;->g:Ljava/util/HashMap;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/drs;->k:Ljava/util/HashMap;

    .line 41
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/drs;->f:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drs;->b:Landroid/os/HandlerThread;

    .line 44
    iget-object v0, p0, Lo/drs;->b:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 45
    new-instance v0, Landroid/os/HandlerThread;

    sget-object v1, Lo/drs;->c:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/drs;->b:Landroid/os/HandlerThread;

    .line 46
    iget-object v0, p0, Lo/drs;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 48
    :cond_0
    new-instance v0, Lo/drs$e;

    iget-object v1, p0, Lo/drs;->b:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/drs$e;-><init>(Lo/drs;Landroid/os/Looper;)V

    sput-object v0, Lo/drs;->e:Lo/drs$e;

    .line 49
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/os/Message;)V
    .locals 3

    .line 331
    const/4 v1, 0x0

    .line 332
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    if-eqz v0, :cond_0

    .line 333
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    .line 335
    :cond_0
    new-instance v2, Lo/dsf;

    invoke-direct {v2, p1}, Lo/dsf;-><init>(Landroid/content/Context;)V

    .line 336
    invoke-virtual {v2, v1}, Lo/dsf;->c(Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 337
    invoke-virtual {v2}, Lo/dsf;->a()V

    .line 338
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 6

    .line 223
    const/4 v4, 0x0

    .line 224
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    if-eqz v0, :cond_0

    .line 225
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    .line 227
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 228
    invoke-virtual {v4}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getType()I

    move-result v5

    .line 229
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Handle authCallbackMethod, msg.what = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", type = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    const/16 v0, 0x64

    if-ne v0, v5, :cond_1

    .line 231
    sget-object v0, Lo/drs;->e:Lo/drs$e;

    sget-object v1, Lo/drs;->e:Lo/drs$e;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x71

    invoke-virtual {v1, v3, v2}, Lo/drs$e;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/drs$e;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 232
    :cond_1
    const/16 v0, 0x65

    if-ne v0, v5, :cond_2

    .line 233
    sget-object v0, Lo/drs;->e:Lo/drs$e;

    sget-object v1, Lo/drs;->e:Lo/drs$e;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x75

    invoke-virtual {v1, v3, v2}, Lo/drs$e;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/drs$e;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 235
    :cond_2
    sget-object v0, Lo/drs;->e:Lo/drs$e;

    sget-object v1, Lo/drs;->e:Lo/drs$e;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/16 v3, 0x7c

    invoke-virtual {v1, v3, v2}, Lo/drs$e;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/drs$e;->sendMessage(Landroid/os/Message;)Z

    .line 238
    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/drs;)Landroid/content/Context;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/drs;->d:Landroid/content/Context;

    return-object v0
.end method

.method private b(Lo/dre;Landroid/os/Message;)Ljava/lang/Boolean;
    .locals 6

    .line 341
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 342
    iget v0, p2, Landroid/os/Message;->what:I

    const/16 v1, 0x66

    if-eq v1, v0, :cond_2

    .line 343
    sget-object v0, Lo/drs;->g:Ljava/util/HashMap;

    invoke-virtual {p1}, Lo/dre;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    invoke-virtual {p1}, Lo/dre;->e()Landroid/os/Message;

    move-result-object v3

    .line 345
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 346
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Message.sendToTarget() msg.what= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v3, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", msg.ag1="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v3, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 347
    invoke-virtual {p1}, Lo/dre;->c()I

    move-result v4

    .line 348
    new-instance v5, Lo/dra;

    invoke-direct {v5}, Lo/dra;-><init>()V

    .line 349
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lo/dra;->b(I)V

    .line 350
    const/16 v0, 0x63

    invoke-virtual {v5, v0}, Lo/dra;->d(I)V

    .line 351
    invoke-direct {p0, v4}, Lo/drs;->d(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/dra;->e(I)V

    .line 352
    iput-object v5, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 353
    invoke-static {v3}, Lo/dsh;->e(Landroid/os/Message;)V

    .line 354
    goto :goto_0

    .line 355
    :cond_0
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    const-string v1, "Message is null "

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 357
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 359
    :cond_1
    sget-object v0, Lo/drs;->g:Ljava/util/HashMap;

    invoke-virtual {p1}, Lo/dre;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lo/drs;
    .locals 4

    .line 52
    sget-object v2, Lo/drs;->f:Ljava/lang/Object;

    monitor-enter v2

    .line 53
    :try_start_0
    sget-object v0, Lo/drs;->a:Lo/drs;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 54
    new-instance v0, Lo/drs;

    invoke-direct {v0}, Lo/drs;-><init>()V

    sput-object v0, Lo/drs;->a:Lo/drs;

    .line 56
    :cond_0
    sget-object v0, Lo/drs;->a:Lo/drs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 57
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private b(Landroid/os/Message;)V
    .locals 3

    .line 138
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    const-string v1, "Start invalid token handler "

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 140
    const/4 v2, 0x0

    .line 141
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    .line 144
    :cond_0
    invoke-direct {p0, v2}, Lo/drs;->b(Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 146
    :cond_1
    invoke-direct {p0, p1}, Lo/drs;->e(Landroid/os/Message;)V

    .line 147
    return-void
.end method

.method private b(Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V
    .locals 5

    .line 150
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 151
    invoke-virtual {p1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getPrimary()Ljava/lang/String;

    move-result-object v3

    .line 152
    iget-object v0, p0, Lo/drs;->d:Landroid/content/Context;

    const-string v1, "Tag"

    invoke-static {v0, v3, v1}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 153
    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 154
    iget-object v0, p0, Lo/drs;->d:Landroid/content/Context;

    const-string v1, "authen_Token"

    invoke-static {v0, v4, v1}, Lo/dsh;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 155
    iget-object v0, p0, Lo/drs;->d:Landroid/content/Context;

    const-string v1, "authorization"

    invoke-static {v0, v4, v1}, Lo/dsh;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 156
    iget-object v0, p0, Lo/drs;->d:Landroid/content/Context;

    const-string v1, "Tag"

    invoke-static {v0, v4, v1}, Lo/dsh;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 157
    iget-object v0, p0, Lo/drs;->d:Landroid/content/Context;

    const-string v1, "Tag"

    invoke-static {v0, v3, v1}, Lo/dsh;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 159
    :cond_0
    iget-object v0, p0, Lo/drs;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getPrimary()Ljava/lang/String;

    move-result-object v1

    const-string v2, "authen_Token"

    invoke-static {v0, v1, v2}, Lo/dsh;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 160
    iget-object v0, p0, Lo/drs;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getPrimary()Ljava/lang/String;

    move-result-object v1

    const-string v2, "authorization"

    invoke-static {v0, v1, v2}, Lo/dsh;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 161
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    const-string v1, "Start to delete token info"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    goto :goto_0

    .line 163
    :cond_1
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    const-string v1, "Start to delete token info failed, inProgressData is null "

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/drs;Landroid/content/Context;Landroid/os/Message;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lo/drs;->a(Landroid/content/Context;Landroid/os/Message;)V

    return-void
.end method

.method static synthetic b(Lo/drs;Landroid/os/Message;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/drs;->e(Landroid/os/Message;)V

    return-void
.end method

.method private c(Lo/dre;I)Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;
    .locals 2

    .line 188
    new-instance v1, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    invoke-direct {v1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;-><init>()V

    .line 189
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 190
    invoke-virtual {p1}, Lo/dre;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setPrimary(Ljava/lang/String;)V

    .line 191
    invoke-virtual {p1}, Lo/dre;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setPrimaryIDtype(Ljava/lang/String;)V

    .line 192
    invoke-virtual {p1}, Lo/dre;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setSecondaryID(Ljava/lang/String;)V

    .line 193
    invoke-virtual {p1}, Lo/dre;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setSecondarytype(Ljava/lang/String;)V

    .line 194
    invoke-virtual {v1, p2}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setRsn(I)V

    .line 195
    invoke-virtual {p1}, Lo/dre;->c()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setType(I)V

    .line 196
    invoke-virtual {p1}, Lo/dre;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setNikename(Ljava/lang/String;)V

    .line 197
    invoke-virtual {p1}, Lo/dre;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setServiceType(Ljava/lang/String;)V

    .line 198
    invoke-virtual {p1}, Lo/dre;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setDeviceid(Ljava/lang/String;)V

    .line 199
    invoke-virtual {p1}, Lo/dre;->m()Lo/drc;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->setSecondaryDeviceId(Lo/drc;)V

    .line 201
    :cond_0
    return-object v1
.end method

.method private c(Landroid/os/Message;)V
    .locals 6

    .line 205
    const/4 v2, 0x0

    .line 206
    const/4 v3, 0x0

    .line 207
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lo/dre;

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lo/dre;

    .line 210
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 211
    invoke-static {}, Lo/dsh;->a()I

    move-result v4

    .line 212
    invoke-direct {p0, v2, p1}, Lo/drs;->b(Lo/dre;Landroid/os/Message;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 213
    return-void

    .line 215
    :cond_1
    sget-object v0, Lo/drs;->k:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    invoke-direct {p0, v2, v4}, Lo/drs;->c(Lo/dre;I)Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    move-result-object v5

    .line 217
    iput-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 218
    invoke-direct {p0, p1}, Lo/drs;->a(Landroid/os/Message;)V

    .line 220
    :cond_2
    return-void
.end method

.method private d(I)I
    .locals 1

    .line 367
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 369
    :pswitch_0
    const/4 v0, 0x0

    return v0

    .line 371
    :pswitch_1
    const/4 v0, 0x1

    return v0

    .line 373
    :pswitch_2
    const/4 v0, 0x2

    return v0

    .line 375
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 25
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    return-object v0
.end method

.method private d(Landroid/os/Message;)Lo/dra;
    .locals 6

    .line 280
    new-instance v3, Lo/dra;

    invoke-direct {v3}, Lo/dra;-><init>()V

    .line 281
    const/4 v4, 0x0

    .line 282
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    if-eqz v0, :cond_0

    .line 283
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    .line 285
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 286
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 290
    :sswitch_0
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/dra;->b(I)V

    .line 291
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/dra;->d(I)V

    .line 292
    goto :goto_0

    .line 294
    :sswitch_1
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/dra;->b(I)V

    .line 295
    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Lo/dra;->d(I)V

    .line 296
    goto :goto_0

    .line 298
    :sswitch_2
    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Lo/dra;->b(I)V

    .line 299
    goto :goto_0

    .line 304
    :sswitch_3
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/dra;->b(I)V

    .line 305
    invoke-virtual {v4}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getResultcode()I

    move-result v0

    invoke-virtual {v3, v0}, Lo/dra;->d(I)V

    .line 306
    goto :goto_0

    .line 308
    :sswitch_4
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/dra;->b(I)V

    .line 309
    invoke-direct {p0, v4}, Lo/drs;->b(Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 310
    const/16 v0, 0x3ec

    invoke-virtual {v3, v0}, Lo/dra;->d(I)V

    .line 311
    goto :goto_0

    .line 314
    :sswitch_5
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/dra;->b(I)V

    .line 315
    .line 319
    :goto_0
    invoke-virtual {v4}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getType()I

    move-result v5

    .line 320
    invoke-direct {p0, v5}, Lo/drs;->d(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/dra;->e(I)V

    .line 321
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Message - multiSimAsyncResult reasonCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lo/dra;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    invoke-virtual {v4}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getMultiSIMServiceInfo()Lo/dqy;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dra;->a(Lo/dqy;)V

    .line 323
    invoke-virtual {v4}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getWebViewData()Lo/drw;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dra;->e(Lo/drw;)V

    .line 324
    goto :goto_1

    .line 325
    :cond_1
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    const-string v1, "Message - inProgressData is null "

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 327
    :goto_1
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0x65 -> :sswitch_0
        0x66 -> :sswitch_0
        0x6a -> :sswitch_4
        0x6b -> :sswitch_3
        0x73 -> :sswitch_3
        0x77 -> :sswitch_3
        0x7d -> :sswitch_5
        0x7e -> :sswitch_3
        0x22b8 -> :sswitch_1
        0x22b9 -> :sswitch_2
        0x22ba -> :sswitch_5
    .end sparse-switch
.end method

.method static synthetic d(Lo/drs;Landroid/os/Message;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/drs;->c(Landroid/os/Message;)V

    return-void
.end method

.method private e(Landroid/os/Message;)V
    .locals 7

    .line 241
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 242
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    const-string v1, "Handle back data method failed, msg is null."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 243
    return-void

    .line 245
    :cond_0
    const/4 v3, 0x0

    .line 246
    const/4 v4, 0x0

    .line 247
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    if-eqz v0, :cond_1

    .line 248
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    .line 250
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v3, :cond_7

    .line 251
    sget-object v0, Lo/drs;->g:Ljava/util/HashMap;

    invoke-virtual {v3}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getSecondaryID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 252
    sget-object v0, Lo/drs;->g:Ljava/util/HashMap;

    invoke-virtual {v3}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getSecondaryID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    :cond_2
    invoke-virtual {v3}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->getRsn()I

    move-result v5

    .line 255
    sget-object v0, Lo/drs;->k:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dre;

    .line 256
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 257
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x22b9

    if-eq v1, v0, :cond_3

    .line 258
    invoke-virtual {v6}, Lo/dre;->e()Landroid/os/Message;

    move-result-object v4

    goto :goto_0

    .line 260
    :cond_3
    invoke-virtual {v6}, Lo/dre;->a()Landroid/os/Message;

    move-result-object v4

    .line 263
    :cond_4
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 264
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Message.sendToTarget() message.what= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 265
    invoke-direct {p0, p1}, Lo/drs;->d(Landroid/os/Message;)Lo/dra;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 266
    invoke-static {v4}, Lo/dsh;->e(Landroid/os/Message;)V

    .line 267
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x22b9

    if-eq v1, v0, :cond_5

    .line 268
    sget-object v0, Lo/drs;->k:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    :cond_5
    sget-object v0, Lo/drs;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    goto :goto_1

    .line 272
    :cond_6
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    const-string v1, "Message is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    :goto_1
    goto :goto_2

    .line 275
    :cond_7
    sget-object v0, Lo/drs;->c:Ljava/lang/String;

    const-string v1, "mutiProgressData is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 277
    :goto_2
    return-void
.end method

.method static synthetic e(Lo/drs;Landroid/os/Message;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/drs;->b(Landroid/os/Message;)V

    return-void
.end method


# virtual methods
.method public a()Lo/drs$e;
    .locals 1

    .line 61
    sget-object v0, Lo/drs;->e:Lo/drs$e;

    return-object v0
.end method

.method public c()V
    .locals 2

    .line 73
    sget-object v0, Lo/drs;->e:Lo/drs$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 74
    const/4 v0, 0x0

    sput-object v0, Lo/drs;->e:Lo/drs$e;

    .line 76
    :cond_0
    iget-object v0, p0, Lo/drs;->b:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 77
    iget-object v0, p0, Lo/drs;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drs;->b:Landroid/os/HandlerThread;

    .line 80
    :cond_1
    sget-object v0, Lo/drs;->a:Lo/drs;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 81
    const/4 v0, 0x0

    sput-object v0, Lo/drs;->a:Lo/drs;

    .line 83
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lo/drs;->d:Landroid/content/Context;

    .line 84
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lo/drs;->d:Landroid/content/Context;

    .line 66
    return-void
.end method

.method public e()Landroid/content/Context;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/drs;->d:Landroid/content/Context;

    return-object v0
.end method
