.class public Lo/cun;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cun$d;
    }
.end annotation


# instance fields
.field private b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Landroid/os/RemoteCallbackList<Lo/clo;>;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Lo/clo;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/concurrent/ExecutorService;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lo/cun;->b:Landroid/util/SparseArray;

    .line 45
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cun;->c:Ljava/util/HashMap;

    .line 46
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/cun;->e:Ljava/util/concurrent/ExecutorService;

    .line 47
    return-void
.end method

.method synthetic constructor <init>(Lo/cun$5;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lo/cun;-><init>()V

    return-void
.end method

.method static synthetic b(Lo/cun;)Landroid/util/SparseArray;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/cun;->b:Landroid/util/SparseArray;

    return-object v0
.end method

.method private b(I)Ljava/lang/Integer;
    .locals 5

    .line 226
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    .line 228
    const/4 v4, 0x0

    .line 230
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/16 v1, 0x53e2

    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    add-int/lit16 v1, p1, 0x2710

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 231
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    const/16 v1, 0xa

    if-lt v0, v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 233
    :cond_1
    iget-object v0, p0, Lo/cun;->c:Ljava/util/HashMap;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 234
    return-object v3
.end method

.method private c(Ljava/lang/Integer;Ljava/lang/Integer;Lo/clo;)V
    .locals 5

    .line 241
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeTypeWithKey key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",type = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    iget-object v0, p0, Lo/cun;->b:Landroid/util/SparseArray;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/RemoteCallbackList;

    .line 244
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 245
    new-instance v4, Landroid/os/RemoteCallbackList;

    invoke-direct {v4}, Landroid/os/RemoteCallbackList;-><init>()V

    .line 247
    :cond_0
    invoke-virtual {v4, p3}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    .line 248
    iget-object v0, p0, Lo/cun;->b:Landroid/util/SparseArray;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 249
    iget-object v0, p0, Lo/cun;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    return-void
.end method

.method private d(Lo/crd;)Lcom/huawei/hihealth/HiHealthClient;
    .locals 2

    .line 253
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 254
    const/4 v0, 0x0

    return-object v0

    .line 257
    :cond_0
    new-instance v1, Lcom/huawei/hihealth/HiHealthClient;

    invoke-direct {v1}, Lcom/huawei/hihealth/HiHealthClient;-><init>()V

    .line 258
    invoke-virtual {p1}, Lo/crd;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthClient;->setPackageName(Ljava/lang/String;)V

    .line 259
    invoke-virtual {p1}, Lo/crd;->d()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthClient;->setAppID(I)V

    .line 260
    return-object v1
.end method

.method public static e()Lo/cun;
    .locals 1

    .line 58
    sget-object v0, Lo/cun$d;->a:Lo/cun;

    return-object v0
.end method

.method private e(ILjava/lang/String;Lcom/huawei/hihealth/HiHealthClient;Lcom/huawei/hihealth/HiHealthData;)V
    .locals 7

    .line 182
    invoke-static {p1}, Lo/cml;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 183
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startListenerChange type is not valid subscribeType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return-void

    .line 186
    :cond_0
    iget-object v0, p0, Lo/cun;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 187
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startListenerChange subscribeThread is closed! Restarting..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/cun;->e:Ljava/util/concurrent/ExecutorService;

    .line 190
    :cond_1
    iget-object v0, p0, Lo/cun;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cun$5;

    move-object v2, p0

    move v3, p1

    move-object v4, p3

    move-object v5, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lo/cun$5;-><init>(Lo/cun;ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 219
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Integer;Lo/clo;)Ljava/lang/Integer;
    .locals 6

    .line 70
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 71
    :cond_0
    const-string v0, "registerListener not right"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 76
    invoke-static {v4}, Lo/cml;->a(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 77
    const-string v0, "registerListener this type can not be subscribed ,type = "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x0

    return-object v0

    .line 81
    :cond_2
    invoke-direct {p0, v4}, Lo/cun;->b(I)Ljava/lang/Integer;

    move-result-object v5

    .line 82
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 83
    const-string v0, "registerListener can not get a key"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const/4 v0, 0x0

    return-object v0

    .line 87
    :cond_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v5, v0, p2}, Lo/cun;->c(Ljava/lang/Integer;Ljava/lang/Integer;Lo/clo;)V

    .line 89
    return-object v5
.end method

.method public b()V
    .locals 4

    .line 175
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    iget-object v0, p0, Lo/cun;->e:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 177
    iget-object v0, p0, Lo/cun;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 179
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Integer;)V
    .locals 7

    .line 97
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 98
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterListenerByKey key = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void

    .line 102
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x186a0

    rem-int/2addr v0, v1

    add-int/lit16 v4, v0, -0x2710

    .line 103
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterListenerByKey type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iget-object v0, p0, Lo/cun;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/os/RemoteCallbackList;

    .line 106
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 107
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterListenerByKey null == listeners"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    return-void

    .line 111
    :cond_1
    iget-object v0, p0, Lo/cun;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/clo;

    .line 112
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterListenerByKey size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cun;->c:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 115
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterListenerByKey null == tempListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return-void

    .line 119
    :cond_2
    invoke-virtual {v5, v6}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 120
    iget-object v0, p0, Lo/cun;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterListenerByKey removed key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    return-void
.end method

.method public d(ILjava/lang/String;Lo/crd;)V
    .locals 5

    .line 155
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startListenerChange subscribeType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",changeKey = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, ",hiHealthContext = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    invoke-direct {p0, p3}, Lo/cun;->d(Lo/crd;)Lcom/huawei/hihealth/HiHealthClient;

    move-result-object v4

    .line 157
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v4, v0}, Lo/cun;->e(ILjava/lang/String;Lcom/huawei/hihealth/HiHealthClient;Lcom/huawei/hihealth/HiHealthData;)V

    .line 158
    return-void
.end method

.method public e(Ljava/util/List;Ljava/lang/String;Lo/crd;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/lang/String;Lo/crd;)V"
        }
    .end annotation

    .line 161
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startListenerChange subscribeTypes = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",changeKey = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, ",hiHealthContext = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    return-void

    .line 165
    :cond_0
    invoke-direct {p0, p3}, Lo/cun;->d(Lo/crd;)Lcom/huawei/hihealth/HiHealthClient;

    move-result-object v4

    .line 166
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 167
    const/4 v0, 0x0

    invoke-direct {p0, v6, p2, v4, v0}, Lo/cun;->e(ILjava/lang/String;Lcom/huawei/hihealth/HiHealthClient;Lcom/huawei/hihealth/HiHealthData;)V

    .line 168
    goto :goto_0

    .line 169
    :cond_1
    return-void
.end method

.method public e(Ljava/util/List;Lo/crd;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/crd;)V"
        }
    .end annotation

    .line 129
    invoke-static {p1}, Lo/cvd;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 130
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startListenerChange subscribeList = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-static {v4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    return-void

    .line 135
    :cond_0
    invoke-direct {p0, p2}, Lo/cun;->d(Lo/crd;)Lcom/huawei/hihealth/HiHealthClient;

    move-result-object v5

    .line 136
    const/4 v6, 0x0

    .line 137
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 138
    packed-switch v8, :pswitch_data_0

    goto :goto_1

    .line 142
    :pswitch_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 143
    .line 147
    :goto_1
    :pswitch_1
    const-string v0, "insertHiHealthData"

    invoke-direct {p0, v8, v0, v5, v6}, Lo/cun;->e(ILjava/lang/String;Lcom/huawei/hihealth/HiHealthClient;Lcom/huawei/hihealth/HiHealthData;)V

    .line 148
    goto :goto_0

    .line 149
    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
