.class public Lo/cvw;
.super Lo/cwz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cvw$c;
    }
.end annotation


# static fields
.field static a:Ljava/lang/String;

.field private static b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static c:Lo/cvw;

.field private static e:Lo/dde;

.field private static final f:Ljava/lang/String;

.field private static final h:Ljava/lang/Object;

.field private static i:I


# instance fields
.field private d:Landroid/content/Context;

.field private g:Lo/dqi;

.field private k:Lo/cvw$c;

.field private n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private p:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/cvw;->b:Ljava/util/List;

    .line 88
    const/16 v0, 0xa

    sput v0, Lo/cvw;->i:I

    .line 372
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/cvw;->f:Ljava/lang/String;

    .line 434
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvw;->h:Ljava/lang/Object;

    .line 666
    const-string v0, ""

    sput-object v0, Lo/cvw;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 110
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 523
    new-instance v0, Lo/cvw$3;

    invoke-direct {v0, p0}, Lo/cvw$3;-><init>(Lo/cvw;)V

    iput-object v0, p0, Lo/cvw;->o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 585
    new-instance v0, Lo/cvw$7;

    invoke-direct {v0, p0}, Lo/cvw$7;-><init>(Lo/cvw;)V

    iput-object v0, p0, Lo/cvw;->p:Landroid/content/BroadcastReceiver;

    .line 622
    new-instance v0, Lo/cvw$6;

    invoke-direct {v0, p0}, Lo/cvw$6;-><init>(Lo/cvw;)V

    iput-object v0, p0, Lo/cvw;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 111
    iput-object p1, p0, Lo/cvw;->d:Landroid/content/Context;

    .line 112
    invoke-static {p1}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lo/cvw;->g:Lo/dqi;

    .line 113
    iget-object v0, p0, Lo/cvw;->g:Lo/dqi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 114
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWCombineMigrateMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    :cond_0
    iget-object v0, p0, Lo/cvw;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    sput-object v0, Lo/cvw;->e:Lo/dde;

    .line 117
    sget-object v0, Lo/cvw;->e:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 119
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lo/cvw;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/cvw;->p:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 122
    sget-object v0, Lo/cvw;->e:Lo/dde;

    iget-object v1, p0, Lo/cvw;->o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 123
    invoke-direct {p0}, Lo/cvw;->k()V

    .line 124
    goto :goto_0

    .line 126
    :cond_1
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWAddressBookManager() hwDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    :goto_0
    new-instance v0, Lo/cvw$c;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cvw$c;-><init>(Lo/cvw;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cvw;->k:Lo/cvw$c;

    .line 129
    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 2

    .line 672
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/cvw;->a:Ljava/lang/String;

    .line 674
    sget-object v0, Lo/cvw;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 675
    const-string v0, ""

    sput-object v0, Lo/cvw;->a:Ljava/lang/String;

    .line 678
    :cond_0
    sget-object v0, Lo/cvw;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lo/cvw;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lo/cvw;->k()V

    return-void
.end method

.method static synthetic a(Lo/cvw;[B)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lo/cvw;->a([B)V

    return-void
.end method

.method private a([B)V
    .locals 8

    .line 536
    const-string v0, "HWAddressBookManager"

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

    .line 537
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 539
    :sswitch_0
    invoke-direct {p0, p1}, Lo/cvw;->c([B)I

    move-result v4

    .line 540
    const/4 v5, -0x1

    .line 541
    const v0, 0x186a0

    if-ne v0, v4, :cond_0

    .line 542
    const/4 v5, 0x0

    .line 544
    :cond_0
    invoke-static {}, Lo/cvw;->h()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 545
    :try_start_0
    sget-object v0, Lo/cvw;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 546
    sget-object v0, Lo/cvw;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 547
    sget-object v0, Lo/cvw;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 549
    :cond_1
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 550
    :goto_0
    goto :goto_1

    .line 553
    :sswitch_1
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 554
    const/16 v0, 0x8

    const/16 v1, 0xa

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lo/cvw;->i:I

    .line 555
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult(): maxContactNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lo/cvw;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 557
    new-instance v0, Lo/cvw$4;

    invoke-direct {v0, p0}, Lo/cvw$4;-><init>(Lo/cvw;)V

    invoke-virtual {p0, v0}, Lo/cvw;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 564
    .line 570
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic b(Lo/cvw;Ljava/lang/String;)I
    .locals 1

    .line 49
    invoke-direct {p0, p1}, Lo/cvw;->c(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method static synthetic b(Lo/cvw;)Lo/cvw$c;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/cvw;->k:Lo/cvw$c;

    return-object v0
.end method

.method private declared-synchronized c(Ljava/lang/String;)I
    .locals 4

    monitor-enter p0

    .line 491
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveContact() info = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ADDRESS_BOOK_ENCRYPTO"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/cvw;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/dcy;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lo/dcy;-><init>(I)V

    invoke-virtual {p0, v0, p1, v1}, Lo/cvw;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private c([B)I
    .locals 3

    .line 578
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 579
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/cvw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/cvw;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 473
    iget-object v0, p0, Lo/cvw;->g:Lo/dqi;

    new-instance v1, Lo/cvw$2;

    invoke-direct {v1, p0}, Lo/cvw$2;-><init>(Lo/cvw;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/dqi;->d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 483
    return-void
.end method

.method private declared-synchronized d()I
    .locals 5

    monitor-enter p0

    .line 464
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteNoEncryptoContact() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    invoke-static {}, Lo/cvw;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cvw;->deleteSharedPreference(Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method static synthetic d(Lo/cvw;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lo/cvw;->c()V

    return-void
.end method

.method static synthetic e(Lo/cvw;)Landroid/content/Context;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/cvw;->d:Landroid/content/Context;

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/cvw;
    .locals 2

    .line 103
    sget-object v0, Lo/cvw;->c:Lo/cvw;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 104
    new-instance v0, Lo/cvw;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cvw;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/cvw;->c:Lo/cvw;

    .line 106
    :cond_0
    sget-object v0, Lo/cvw;->c:Lo/cvw;

    return-object v0
.end method

.method private static f()V
    .locals 3

    .line 654
    const/4 v0, 0x0

    sput-object v0, Lo/cvw;->c:Lo/cvw;

    .line 656
    invoke-static {}, Lo/cvw;->h()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 657
    :try_start_0
    sget-object v0, Lo/cvw;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 658
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 659
    :goto_0
    return-void
.end method

.method private g()V
    .locals 3

    .line 500
    new-instance v1, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 501
    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 502
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 503
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 505
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 507
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 510
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 512
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 514
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 515
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 517
    sget-object v0, Lo/cvw;->e:Lo/dde;

    invoke-virtual {v0, v1}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 518
    return-void
.end method

.method private static declared-synchronized h()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/cvw;

    monitor-enter v1

    .line 634
    :try_start_0
    sget-object v0, Lo/cvw;->b:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private k()V
    .locals 2

    .line 613
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v1

    .line 614
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isContacts()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 615
    invoke-direct {p0}, Lo/cvw;->g()V

    .line 617
    :cond_0
    return-void
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/datatype/Contact;>;"
        }
    .end annotation

    .line 436
    sget-object v4, Lo/cvw;->h:Ljava/lang/Object;

    monitor-enter v4

    .line 437
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ADDRESS_BOOK_ENCRYPTO"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/cvw;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cvw;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 438
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getContact() jsonString = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 440
    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    .line 441
    new-instance v0, Lo/cvw$1;

    invoke-direct {v0, p0}, Lo/cvw$1;-><init>(Lo/cvw;)V

    invoke-virtual {v0}, Lo/cvw$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v7

    .line 442
    invoke-virtual {v6, v5, v7}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 445
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    return-object v0

    .line 447
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 378
    iget-object v0, p0, Lo/cvw;->d:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "NOT_HAVE_ADDRESS_BOOK_ON_HIHEALTH_FLAG"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 380
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "contactStorageUpdate notHavAddressBookOnHiHealth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    const-string v0, "encrypto"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 383
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contactStorageUpdate no need update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 385
    return-void

    .line 386
    :cond_0
    sget-object v0, Lo/cvw;->f:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 388
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contactStorageUpdate not crypto, need update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    invoke-static {}, Lo/cvw;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cvw;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 390
    invoke-direct {p0, v7}, Lo/cvw;->c(Ljava/lang/String;)I

    .line 391
    invoke-direct {p0}, Lo/cvw;->d()I

    .line 392
    iget-object v0, p0, Lo/cvw;->d:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "NOT_HAVE_ADDRESS_BOOK_ON_HIHEALTH_FLAG"

    const-string v3, "encrypto"

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 396
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 397
    goto :goto_0

    .line 399
    :cond_1
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contactStorageUpdate save in hihealth, need update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    iget-object v0, p0, Lo/cvw;->g:Lo/dqi;

    new-instance v1, Lo/cvw$5;

    invoke-direct {v1, p0, p1}, Lo/cvw$5;-><init>(Lo/cvw;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/dqi;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 428
    :goto_0
    return-void
.end method

.method public d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/Contact;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V"
        }
    .end annotation

    .line 167
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 168
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 169
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 171
    const/4 v6, 0x0

    .line 172
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 173
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWAddressBookManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setContact() maxContactNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lo/cvw;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/4 v8, 0x0

    :goto_0
    sget v0, Lo/cvw;->i:I

    if-ge v8, v0, :cond_b

    .line 177
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-lt v8, v0, :cond_0

    .line 178
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v9

    .line 180
    const/16 v0, -0x7e

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 182
    const/4 v0, 0x3

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 185
    const/4 v0, 0x3

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 187
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 189
    add-int/lit8 v0, v8, 0x1

    int-to-byte v0, v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto/16 :goto_3

    .line 193
    :cond_0
    const/4 v10, 0x5

    .line 195
    move-object/from16 v0, p1

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/Contact;

    invoke-virtual {v0}, Lcom/huawei/datatype/Contact;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 196
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x3c

    if-ge v1, v0, :cond_1

    .line 197
    const/4 v0, 0x0

    const/16 v1, 0x3c

    invoke-virtual {v11, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    .line 200
    :cond_1
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v10, v0, 0x5

    .line 202
    move-object/from16 v0, p1

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/Contact;

    invoke-virtual {v0}, Lcom/huawei/datatype/Contact;->getPhoneNumbers()Ljava/util/List;

    move-result-object v12

    .line 204
    const/4 v13, 0x0

    .line 206
    const/4 v14, 0x0

    .line 208
    const/4 v15, 0x0

    .line 209
    const/16 v16, 0x0

    :goto_1
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_3

    .line 211
    move/from16 v0, v16

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/PhoneNumber;

    invoke-virtual {v0}, Lcom/huawei/datatype/PhoneNumber;->getPhone_tag()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 213
    move/from16 v0, v16

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/PhoneNumber;

    invoke-virtual {v0}, Lcom/huawei/datatype/PhoneNumber;->getPhone_number()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 215
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x28

    if-ge v1, v0, :cond_2

    .line 216
    move-object/from16 v0, v18

    const/4 v1, 0x0

    const/16 v2, 0x28

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v18

    .line 220
    :cond_2
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x2

    add-int/2addr v13, v0

    .line 222
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x2

    add-int/2addr v14, v0

    .line 224
    add-int/lit8 v15, v15, 0x2

    .line 209
    add-int/lit8 v16, v16, 0x1

    goto :goto_1

    .line 227
    :cond_3
    add-int v0, v13, v14

    add-int/2addr v15, v0

    .line 229
    add-int/lit8 v0, v15, 0x2

    add-int/2addr v10, v0

    .line 232
    move-object/from16 v0, p1

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/Contact;

    invoke-virtual {v0}, Lcom/huawei/datatype/Contact;->getNote()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 233
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x3c

    if-ge v1, v0, :cond_4

    .line 234
    move-object/from16 v0, v16

    const/4 v1, 0x0

    const/16 v2, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v16

    .line 237
    :cond_4
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 239
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x2

    add-int/2addr v10, v0

    .line 242
    :cond_5
    const-string v0, "-1"

    move-object/from16 v1, p1

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/Contact;

    invoke-virtual {v1}, Lcom/huawei/datatype/Contact;->getIcon_index()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 244
    add-int/lit8 v10, v10, 0x3

    .line 247
    :cond_6
    invoke-static {v10}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v9

    .line 250
    const/16 v0, -0x7e

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 252
    add-int/lit8 v0, v10, -0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 255
    const/4 v0, 0x3

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 257
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 259
    add-int/lit8 v0, v8, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 260
    move-object/from16 v0, p1

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/Contact;

    add-int/lit8 v1, v8, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/Contact;->setIndex(I)V

    .line 262
    const/4 v0, 0x4

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 264
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 266
    invoke-static {v11}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 269
    const/16 v0, -0x7b

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 271
    invoke-static {v15}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 273
    const/16 v17, 0x0

    :goto_2
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v17

    if-ge v1, v0, :cond_8

    .line 274
    move/from16 v0, v17

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/PhoneNumber;

    invoke-virtual {v0}, Lcom/huawei/datatype/PhoneNumber;->getPhone_tag()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 275
    move/from16 v0, v17

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/PhoneNumber;

    invoke-virtual {v0}, Lcom/huawei/datatype/PhoneNumber;->getPhone_number()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 277
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x28

    if-ge v1, v0, :cond_7

    .line 278
    move-object/from16 v0, v19

    const/4 v1, 0x0

    const/16 v2, 0x28

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v19

    .line 282
    :cond_7
    const/16 v0, -0x7a

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 284
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x2

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 287
    const/4 v0, 0x7

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 289
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 291
    invoke-static/range {v18 .. v18}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 294
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 296
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 298
    invoke-static/range {v19 .. v19}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 273
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_2

    .line 301
    :cond_8
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 303
    const/16 v0, 0x9

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 305
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 307
    invoke-static/range {v16 .. v16}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 310
    :cond_9
    const-string v0, "-1"

    move-object/from16 v1, p1

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/Contact;

    invoke-virtual {v1}, Lcom/huawei/datatype/Contact;->getIcon_index()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 312
    const/16 v0, 0xa

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 314
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 316
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 319
    :cond_a
    :goto_3
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    add-int/2addr v6, v0

    .line 320
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 323
    :cond_b
    invoke-static {v6}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v8

    .line 325
    array-length v0, v8

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v6, v0

    .line 327
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 330
    const/16 v0, -0x7f

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 332
    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 334
    const/4 v9, 0x0

    :goto_4
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_c

    .line 335
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 334
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 338
    :cond_c
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 339
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 341
    sget-object v0, Lo/cvw;->e:Lo/dde;

    invoke-virtual {v0, v4}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 342
    const-string v9, ""

    .line 343
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 345
    sget v0, Lo/cvw;->i:I

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_d

    .line 346
    move-object/from16 v10, p1

    goto :goto_5

    .line 349
    :cond_d
    sget v0, Lo/cvw;->i:I

    add-int/lit8 v0, v0, -0x1

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v10

    .line 351
    :goto_5
    new-instance v11, Lcom/google/gson/Gson;

    invoke-direct {v11}, Lcom/google/gson/Gson;-><init>()V

    .line 352
    invoke-virtual {v11, v10}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 354
    :cond_e
    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lo/cvw;->c(Ljava/lang/String;)I

    move-result v10

    .line 355
    if-eqz p3, :cond_f

    .line 356
    invoke-static {}, Lo/cvw;->h()Ljava/lang/Object;

    move-result-object v11

    monitor-enter v11

    .line 357
    :try_start_0
    sget-object v0, Lo/cvw;->b:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 358
    monitor-exit v11

    goto :goto_6

    :catchall_0
    move-exception v20

    monitor-exit v11

    throw v20

    :goto_6
    goto :goto_7

    .line 361
    :cond_f
    const/4 v0, -0x1

    if-eq v0, v10, :cond_10

    .line 362
    const v0, 0x186a0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_7

    .line 365
    :cond_10
    const v0, 0x19259

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p2

    const/4 v2, -0x1

    invoke-interface {v1, v2, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 368
    :goto_7
    return-void
.end method

.method public e()I
    .locals 1

    .line 455
    sget v0, Lo/cvw;->i:I

    return v0
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 663
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public onDataMigrate()Z
    .locals 1

    .line 685
    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 5

    .line 639
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 642
    :try_start_0
    invoke-static {}, Lo/cvw;->f()V

    .line 643
    iget-object v0, p0, Lo/cvw;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/cvw;->p:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 646
    goto :goto_0

    .line 644
    :catch_0
    move-exception v4

    .line 645
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Receiver is not registered"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 647
    :goto_0
    const-string v0, "HWAddressBookManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy() finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    return-void
.end method
