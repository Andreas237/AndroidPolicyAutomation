.class public Lo/akg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/akg$e;,
        Lo/akg$b;,
        Lo/akg$c;,
        Lo/akg$a;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/Object;

.field private static e:Lo/akg;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/content/Context;>;"
        }
    .end annotation
.end field

.field private d:Lo/akg$a;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:Lo/ajd;

.field private k:Lo/ajh;

.field private l:Lo/akl;

.field private m:Lo/akg$e;

.field private n:Lo/akh;

.field private o:Lo/aic;

.field private p:Lo/akg$b;

.field private q:Lo/ajm;

.field private r:Lo/ace;

.field private s:Ljava/lang/String;

.field private t:Lo/akj;

.field private u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/akg;->c:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x1

    iput v0, p0, Lo/akg;->h:I

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/akg;->g:I

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/akg;->u:I

    .line 729
    new-instance v0, Lo/akg$1;

    invoke-direct {v0, p0}, Lo/akg$1;-><init>(Lo/akg;)V

    iput-object v0, p0, Lo/akg;->q:Lo/ajm;

    .line 83
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/akg;->b:Ljava/lang/ref/WeakReference;

    .line 85
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "config_network"

    invoke-direct {v2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 86
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 87
    new-instance v0, Lo/akg$a;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/akg$a;-><init>(Lo/akg;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/akg;->d:Lo/akg$a;

    .line 88
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/akg;
    .locals 4

    .line 73
    sget-object v2, Lo/akg;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 74
    :try_start_0
    sget-object v0, Lo/akg;->e:Lo/akg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 75
    new-instance v0, Lo/akg;

    invoke-direct {v0, p0}, Lo/akg;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/akg;->e:Lo/akg;

    .line 77
    :cond_0
    sget-object v0, Lo/akg;->e:Lo/akg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 78
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic a(Lo/akg;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lo/akg;->r()V

    return-void
.end method

.method static synthetic a(Lo/akg;Ljava/lang/String;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/akg;->c(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 5

    .line 193
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    if-nez v0, :cond_0

    .line 194
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isPatternMatching isPatternMatching is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 195
    const/4 v0, 0x0

    return v0

    .line 197
    :cond_0
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v4

    .line 198
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isPatternMatching deviceType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 199
    invoke-static {p1, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    const/4 v0, 0x1

    return v0

    .line 202
    :cond_1
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isPatternMatching deviceType is error : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 203
    const/4 v0, 0x0

    return v0
.end method

.method private b(I)V
    .locals 4

    .line 251
    sget-object v2, Lo/akg;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 252
    :try_start_0
    iget-object v0, p0, Lo/akg;->k:Lo/ajh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 253
    iget-object v0, p0, Lo/akg;->k:Lo/ajh;

    iget v1, p0, Lo/akg;->h:I

    invoke-interface {v0, v1, p1}, Lo/ajh;->onFailure(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 256
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/Object;)V
    .locals 4

    .line 275
    sget-object v2, Lo/akg;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 276
    :try_start_0
    iget-object v0, p0, Lo/akg;->k:Lo/ajh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 277
    iget-object v0, p0, Lo/akg;->k:Lo/ajh;

    iget v1, p0, Lo/akg;->h:I

    invoke-interface {v0, v1, p1}, Lo/ajh;->onSuccess(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 279
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 280
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/akg;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lo/akg;->u()V

    return-void
.end method

.method static synthetic b(Lo/akg;I)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/akg;->b(I)V

    return-void
.end method

.method static synthetic b(Lo/akg;Landroid/os/Message;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/akg;->c(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic c(Lo/akg;)I
    .locals 1

    .line 34
    iget v0, p0, Lo/akg;->u:I

    return v0
.end method

.method private c(I)V
    .locals 4

    .line 150
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initConfigMode configMode\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 151
    if-ltz p1, :cond_0

    const/4 v0, 0x4

    if-le p1, v0, :cond_1

    .line 152
    :cond_0
    return-void

    .line 154
    :cond_1
    iput p1, p0, Lo/akg;->h:I

    .line 155
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 4

    .line 438
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 440
    :sswitch_0
    invoke-direct {p0}, Lo/akg;->s()V

    .line 441
    goto :goto_1

    .line 443
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-direct {p0, v0}, Lo/akg;->d(I)V

    .line 444
    goto :goto_1

    .line 446
    :goto_0
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleMultMessage msg is error :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 449
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0xb -> :sswitch_0
        0xd -> :sswitch_1
    .end sparse-switch
.end method

.method private c(Ljava/lang/String;)V
    .locals 6

    .line 682
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 683
    move-object v4, p1

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v0, "G"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :pswitch_1
    const-string v0, "I"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :pswitch_2
    const-string v0, "J"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x2

    goto :goto_0

    :pswitch_3
    const-string v0, "H"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x3

    :cond_0
    :goto_0
    packed-switch v5, :pswitch_data_1

    goto/16 :goto_1

    .line 685
    :pswitch_4
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Status :WiFi Password is error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 686
    invoke-direct {p0}, Lo/akg;->u()V

    .line 687
    invoke-direct {p0}, Lo/akg;->l()V

    .line 688
    const/16 v0, 0x83d

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 689
    goto/16 :goto_2

    .line 691
    :pswitch_5
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Status :Cannot connect to the router WiFi due to timeout "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 692
    invoke-direct {p0}, Lo/akg;->u()V

    .line 693
    invoke-direct {p0}, Lo/akg;->l()V

    .line 694
    const/16 v0, 0x83e

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 695
    goto :goto_2

    .line 697
    :pswitch_6
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Status :Unable to connect to the router\'s WiFi because the router SSID could not be found "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 698
    invoke-direct {p0}, Lo/akg;->u()V

    .line 699
    invoke-direct {p0}, Lo/akg;->l()V

    .line 700
    const/16 v0, 0x83f

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 701
    goto :goto_2

    .line 703
    :pswitch_7
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Status :The device has received the WiFi name/password and is connecting to the router WiFi "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 704
    invoke-direct {p0}, Lo/akg;->o()V

    .line 705
    const/16 v0, 0x840

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 706
    goto :goto_2

    .line 708
    :goto_1
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendMultStatus: other msg:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 709
    :goto_2
    goto :goto_3

    .line 712
    :cond_1
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendMultStatus msg is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 714
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x47
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method static synthetic c(Lo/akg;I)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/akg;->d(I)V

    return-void
.end method

.method static synthetic c(Lo/akg;Landroid/os/Message;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/akg;->d(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic d(Lo/akg;)Lo/akg$a;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/akg;->d:Lo/akg$a;

    return-object v0
.end method

.method private d()V
    .locals 1

    .line 140
    invoke-direct {p0}, Lo/akg;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    invoke-direct {p0}, Lo/akg;->v()V

    .line 143
    :cond_0
    return-void
.end method

.method private d(I)V
    .locals 4

    .line 263
    sget-object v2, Lo/akg;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 264
    :try_start_0
    iget-object v0, p0, Lo/akg;->k:Lo/ajh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 265
    iget-object v0, p0, Lo/akg;->k:Lo/ajh;

    iget v1, p0, Lo/akg;->h:I

    invoke-interface {v0, v1, p1}, Lo/ajh;->onStatus(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 267
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 268
    :goto_0
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 4

    .line 113
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 115
    :pswitch_0
    invoke-direct {p0}, Lo/akg;->m()V

    .line 116
    goto :goto_1

    .line 119
    :pswitch_1
    invoke-direct {p0}, Lo/akg;->p()V

    .line 120
    goto :goto_1

    .line 122
    :pswitch_2
    invoke-direct {p0}, Lo/akg;->d()V

    .line 123
    goto :goto_1

    .line 125
    :pswitch_3
    invoke-direct {p0}, Lo/akg;->q()V

    .line 126
    goto :goto_1

    .line 128
    :pswitch_4
    invoke-direct {p0}, Lo/akg;->t()V

    .line 129
    goto :goto_1

    .line 131
    :pswitch_5
    iget-object v0, p0, Lo/akg;->d:Lo/akg$a;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lo/akg$a;->sendEmptyMessage(I)Z

    .line 132
    goto :goto_1

    .line 134
    :goto_0
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startConfigNetWork what is error\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 137
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic e(Lo/akg;)Lo/ajd;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    return-object v0
.end method

.method private e(ILjava/lang/Object;)V
    .locals 4

    .line 415
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 417
    :pswitch_0
    invoke-direct {p0, p2}, Lo/akg;->b(Ljava/lang/Object;)V

    .line 418
    goto :goto_1

    .line 420
    :pswitch_1
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AP Device SSID is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 421
    goto :goto_1

    .line 425
    :pswitch_2
    invoke-direct {p0, p1}, Lo/akg;->b(I)V

    .line 426
    goto :goto_1

    .line 428
    :goto_0
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "softApErrorCode error is other "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 431
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x44c
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic e(Lo/akg;ILjava/lang/Object;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Lo/akg;->e(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic e(Lo/akg;Ljava/lang/Object;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/akg;->b(Ljava/lang/Object;)V

    return-void
.end method

.method private f()V
    .locals 2

    .line 306
    iget-object v0, p0, Lo/akg;->l:Lo/akl;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 307
    invoke-virtual {p0}, Lo/akg;->b()V

    .line 308
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akg;->l:Lo/akl;

    .line 310
    :cond_0
    return-void
.end method

.method private g()V
    .locals 3

    .line 297
    const/4 v0, 0x1

    iput v0, p0, Lo/akg;->h:I

    .line 298
    const/4 v0, 0x0

    iput v0, p0, Lo/akg;->g:I

    .line 299
    const/4 v0, 0x0

    iput v0, p0, Lo/akg;->u:I

    .line 300
    sget-object v1, Lo/akg;->c:Ljava/lang/Object;

    monitor-enter v1

    .line 301
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lo/akg;->k:Lo/ajh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 303
    :goto_0
    return-void
.end method

.method private h()Z
    .locals 2

    .line 185
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 186
    const/16 v0, 0x66

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 187
    const/4 v0, 0x0

    return v0

    .line 189
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private i()Z
    .locals 4

    .line 325
    iget v0, p0, Lo/akg;->h:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    iget v0, p0, Lo/akg;->h:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    iget v0, p0, Lo/akg;->h:I

    const/4 v1, 0x4

    if-eq v1, v0, :cond_0

    .line 326
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isStartConfig configMode error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/akg;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 327
    const/16 v0, 0x65

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 328
    const/4 v0, 0x0

    return v0

    .line 330
    :cond_0
    iget-object v0, p0, Lo/akg;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/akg;->f:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 331
    :cond_1
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isStartConfig wifiName:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/akg;->a:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " wifiPassword:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/akg;->f:Ljava/lang/String;

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 332
    const/16 v0, 0x66

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 333
    const/4 v0, 0x0

    return v0

    .line 335
    :cond_3
    iget v0, p0, Lo/akg;->h:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_6

    .line 336
    iget-object v0, p0, Lo/akg;->r:Lo/ace;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 337
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isStartConfig mScanFilter null:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 338
    const/16 v0, 0x66

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 339
    const/4 v0, 0x0

    return v0

    .line 341
    :cond_4
    iget-object v0, p0, Lo/akg;->s:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 342
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isStartConfig productID:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/akg;->s:Ljava/lang/String;

    if-nez v2, :cond_5

    const/4 v2, 0x1

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 343
    const/16 v0, 0x66

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 344
    const/4 v0, 0x0

    return v0

    .line 347
    :cond_6
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_7

    .line 348
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isStartConfig mDeviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 349
    const/16 v0, 0x66

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 350
    const/4 v0, 0x0

    return v0

    .line 353
    :cond_7
    iget-object v0, p0, Lo/akg;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lo/akf;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 354
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isStartConfig wifi is not connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const/16 v0, 0x67

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 356
    const/4 v0, 0x0

    return v0

    .line 363
    :cond_8
    const/4 v0, 0x1

    return v0
.end method

.method private k()V
    .locals 2

    .line 313
    iget-object v0, p0, Lo/akg;->o:Lo/aic;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 314
    iget-object v0, p0, Lo/akg;->d:Lo/akg$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akg$a;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 315
    invoke-virtual {p0}, Lo/akg;->c()V

    .line 316
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akg;->o:Lo/aic;

    .line 318
    :cond_0
    return-void
.end method

.method private l()V
    .locals 2

    .line 508
    iget-object v0, p0, Lo/akg;->o:Lo/aic;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 509
    iget-object v0, p0, Lo/akg;->o:Lo/aic;

    invoke-virtual {v0}, Lo/aic;->c()V

    .line 511
    :cond_0
    return-void
.end method

.method private m()V
    .locals 5

    .line 373
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSoftAp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 374
    const-string v0, "softap"

    invoke-direct {p0, v0}, Lo/akg;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 375
    const/4 v0, 0x1

    iput v0, p0, Lo/akg;->u:I

    .line 376
    iget-object v0, p0, Lo/akg;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lo/akl;->d(Landroid/content/Context;)Lo/akl;

    move-result-object v0

    iput-object v0, p0, Lo/akg;->l:Lo/akl;

    .line 377
    iget-object v0, p0, Lo/akg;->l:Lo/akl;

    iget-object v1, p0, Lo/akg;->i:Lo/ajd;

    iget-object v2, p0, Lo/akg;->a:Ljava/lang/String;

    iget-object v3, p0, Lo/akg;->f:Ljava/lang/String;

    new-instance v4, Lo/akg$c;

    invoke-direct {v4, p0}, Lo/akg$c;-><init>(Lo/akg;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/akl;->a(Lo/ajd;Ljava/lang/String;Ljava/lang/String;Lo/ajj;)V

    goto :goto_0

    .line 379
    :cond_0
    const/16 v0, 0x65

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 381
    :goto_0
    return-void
.end method

.method private n()Z
    .locals 4

    .line 459
    iget-object v0, p0, Lo/akg;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lo/aii;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 460
    const/4 v0, 0x1

    return v0

    .line 462
    :cond_0
    const/16 v0, 0x6e

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 463
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWiFiConfig WiFi config has Configuration information"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 464
    const/4 v0, 0x0

    return v0
.end method

.method private o()V
    .locals 2

    .line 502
    iget-object v0, p0, Lo/akg;->o:Lo/aic;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 503
    iget-object v0, p0, Lo/akg;->o:Lo/aic;

    invoke-virtual {v0}, Lo/aic;->d()V

    .line 505
    :cond_0
    return-void
.end method

.method private p()V
    .locals 4

    .line 471
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMulticast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 472
    invoke-direct {p0}, Lo/akg;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 473
    new-instance v0, Lo/akg$b;

    invoke-direct {v0, p0}, Lo/akg$b;-><init>(Lo/akg;)V

    iput-object v0, p0, Lo/akg;->p:Lo/akg$b;

    .line 474
    new-instance v0, Lo/akg$e;

    invoke-direct {v0, p0}, Lo/akg$e;-><init>(Lo/akg;)V

    iput-object v0, p0, Lo/akg;->m:Lo/akg$e;

    .line 475
    iget-object v0, p0, Lo/akg;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lo/akj;->b(Landroid/content/Context;)Lo/akj;

    move-result-object v0

    iput-object v0, p0, Lo/akg;->t:Lo/akj;

    .line 476
    iget v0, p0, Lo/akg;->h:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_0

    .line 477
    iget-object v0, p0, Lo/akg;->d:Lo/akg$a;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/akg$a;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 479
    :cond_0
    iget-object v0, p0, Lo/akg;->d:Lo/akg$a;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lo/akg$a;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 482
    :cond_1
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMulticast start multcast fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 484
    :goto_0
    return-void
.end method

.method private q()V
    .locals 5

    .line 529
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    if-nez v0, :cond_0

    .line 530
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doStartMulticast mDeviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 531
    return-void

    .line 533
    :cond_0
    const-string v0, "wifiap"

    invoke-direct {p0, v0}, Lo/akg;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 534
    const/4 v0, 0x2

    iput v0, p0, Lo/akg;->u:I

    .line 535
    iget-object v0, p0, Lo/akg;->m:Lo/akg$e;

    invoke-virtual {v0}, Lo/akg$e;->d()V

    .line 536
    new-instance v4, Lo/aie;

    invoke-direct {v4}, Lo/aie;-><init>()V

    .line 537
    iget-object v0, p0, Lo/akg;->a:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/aie;->e(Ljava/lang/String;)V

    .line 538
    iget-object v0, p0, Lo/akg;->f:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/aie;->a(Ljava/lang/String;)V

    .line 539
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/aie;->b(Ljava/lang/String;)V

    .line 540
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->g()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/aie;->d(I)V

    .line 541
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/aie;->c(Ljava/lang/String;)V

    .line 542
    iget-object v0, p0, Lo/akg;->r:Lo/ace;

    iput-object v0, v4, Lo/aie;->m:Lo/ace;

    .line 543
    new-instance v0, Lo/aic;

    iget-object v1, p0, Lo/akg;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lo/akg;->p:Lo/akg$b;

    invoke-direct {v0, v1, v4, v2}, Lo/aic;-><init>(Landroid/content/Context;Lo/aie;Lo/ajm;)V

    iput-object v0, p0, Lo/akg;->o:Lo/aic;

    .line 544
    iget-object v0, p0, Lo/akg;->o:Lo/aic;

    iget v1, p0, Lo/akg;->g:I

    invoke-virtual {v0, v1}, Lo/aic;->b(I)V

    .line 545
    iget-object v0, p0, Lo/akg;->o:Lo/aic;

    iget v1, p0, Lo/akg;->h:I

    invoke-virtual {v0, v1}, Lo/aic;->c(I)V

    .line 546
    iget-object v0, p0, Lo/akg;->o:Lo/aic;

    invoke-virtual {v0}, Lo/aic;->a()V

    .line 547
    goto :goto_0

    .line 548
    :cond_1
    const/16 v0, 0x65

    invoke-direct {p0, v0}, Lo/akg;->b(I)V

    .line 550
    :goto_0
    return-void
.end method

.method private r()V
    .locals 4

    .line 621
    iget-object v0, p0, Lo/akg;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    .line 622
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 624
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/net/wifi/WifiManager;

    .line 626
    invoke-virtual {v3}, Landroid/net/wifi/WifiManager;->startScan()Z

    .line 628
    :cond_0
    return-void
.end method

.method private s()V
    .locals 4

    .line 613
    iget-object v0, p0, Lo/akg;->t:Lo/akj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 614
    iget-object v0, p0, Lo/akg;->t:Lo/akj;

    iget-object v1, p0, Lo/akg;->i:Lo/ajd;

    iget-object v2, p0, Lo/akg;->m:Lo/akg$e;

    invoke-virtual {v0, v1, v2}, Lo/akj;->a(Lo/ajd;Lo/ajm;)V

    goto :goto_0

    .line 616
    :cond_0
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scanSelectDevice mScanManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 618
    :goto_0
    return-void
.end method

.method private t()V
    .locals 4

    .line 514
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doStartHandMulticast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 515
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 516
    new-instance v0, Lo/ajd;

    invoke-direct {v0}, Lo/ajd;-><init>()V

    iput-object v0, p0, Lo/akg;->i:Lo/ajd;

    .line 517
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    const-string v1, "Hi11117K5B000000000000000009CB55"

    invoke-virtual {v0, v1}, Lo/ajd;->d(Ljava/lang/String;)V

    .line 518
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    iget-object v1, p0, Lo/akg;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/ajd;->b(Ljava/lang/String;)V

    .line 519
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    const-string v1, "wifiap"

    invoke-virtual {v0, v1}, Lo/ajd;->i(Ljava/lang/String;)V

    .line 520
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    iget-object v1, p0, Lo/akg;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, Lo/aia;->b(Landroid/content/Context;)Lo/aia;

    move-result-object v1

    const-string v2, "Hi11117K5B000000000000000009CB55"

    invoke-virtual {v1, v2}, Lo/aia;->b(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ajd;->b(I)V

    .line 521
    iget-object v0, p0, Lo/akg;->i:Lo/ajd;

    const-string v1, "Hi11117K5B000000000000000009CB55"

    const-string v2, "Hi11117K5B000000000000000009CB55"

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x5

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ajd;->h(Ljava/lang/String;)V

    .line 523
    :cond_0
    invoke-direct {p0}, Lo/akg;->q()V

    .line 524
    return-void
.end method

.method private u()V
    .locals 2

    .line 557
    iget-object v0, p0, Lo/akg;->t:Lo/akj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 558
    iget-object v0, p0, Lo/akg;->t:Lo/akj;

    invoke-virtual {v0}, Lo/akj;->c()V

    .line 560
    :cond_0
    return-void
.end method

.method private v()V
    .locals 4

    .line 724
    const/4 v0, 0x3

    iput v0, p0, Lo/akg;->u:I

    .line 725
    iget-object v0, p0, Lo/akg;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lo/akh;->e(Landroid/content/Context;)Lo/akh;

    move-result-object v0

    iput-object v0, p0, Lo/akg;->n:Lo/akh;

    .line 726
    iget-object v0, p0, Lo/akg;->n:Lo/akh;

    iget-object v1, p0, Lo/akg;->i:Lo/ajd;

    sget-object v2, Lo/akh$i;->d:Lo/akh$i;

    iget-object v3, p0, Lo/akg;->q:Lo/ajm;

    invoke-virtual {v0, v1, v2, v3}, Lo/akh;->b(Lo/ajd;Lo/akh$i;Lo/ajm;)V

    .line 727
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 717
    iget-object v0, p0, Lo/akg;->n:Lo/akh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 718
    iget-object v0, p0, Lo/akg;->n:Lo/akh;

    invoke-virtual {v0}, Lo/akh;->a()V

    .line 719
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akg;->n:Lo/akh;

    .line 721
    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 387
    iget-object v0, p0, Lo/akg;->l:Lo/akl;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 388
    iget-object v0, p0, Lo/akg;->l:Lo/akl;

    invoke-virtual {v0}, Lo/akl;->d()V

    .line 390
    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    .line 490
    iget-object v0, p0, Lo/akg;->o:Lo/aic;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 491
    iget-object v0, p0, Lo/akg;->o:Lo/aic;

    invoke-virtual {v0}, Lo/aic;->c()V

    .line 492
    iget-object v0, p0, Lo/akg;->t:Lo/akj;

    invoke-virtual {v0}, Lo/akj;->c()V

    .line 494
    iget-object v0, p0, Lo/akg;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    .line 495
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 496
    invoke-static {v2}, Lo/aii;->b(Landroid/content/Context;)Z

    .line 499
    :cond_0
    return-void
.end method

.method public c(ILjava/lang/String;Ljava/lang/String;Lo/ajd;Lo/ajh;)V
    .locals 3

    .line 220
    iput-object p2, p0, Lo/akg;->a:Ljava/lang/String;

    .line 221
    iput-object p3, p0, Lo/akg;->f:Ljava/lang/String;

    .line 222
    iput-object p4, p0, Lo/akg;->i:Lo/ajd;

    .line 223
    sget-object v1, Lo/akg;->c:Ljava/lang/Object;

    monitor-enter v1

    .line 224
    :try_start_0
    iput-object p5, p0, Lo/akg;->k:Lo/ajh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 226
    :goto_0
    invoke-direct {p0, p1}, Lo/akg;->c(I)V

    .line 227
    invoke-direct {p0}, Lo/akg;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Lo/akg;->d:Lo/akg$a;

    invoke-virtual {v0, p1}, Lo/akg$a;->sendEmptyMessage(I)Z

    .line 230
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Lo/ace;Ljava/lang/String;Lo/ajh;)V
    .locals 4

    .line 233
    iput-object p1, p0, Lo/akg;->a:Ljava/lang/String;

    .line 234
    iput-object p2, p0, Lo/akg;->f:Ljava/lang/String;

    .line 235
    iput-object p3, p0, Lo/akg;->r:Lo/ace;

    .line 236
    iput-object p4, p0, Lo/akg;->s:Ljava/lang/String;

    .line 237
    sget-object v2, Lo/akg;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 238
    :try_start_0
    iput-object p5, p0, Lo/akg;->k:Lo/ajh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 240
    :goto_0
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lo/akg;->c(I)V

    .line 241
    invoke-direct {p0}, Lo/akg;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lo/akg;->d:Lo/akg$a;

    iget v1, p0, Lo/akg;->h:I

    invoke-virtual {v0, v1}, Lo/akg$a;->sendEmptyMessage(I)Z

    .line 244
    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    .line 283
    iget v0, p0, Lo/akg;->h:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 284
    invoke-direct {p0}, Lo/akg;->f()V

    goto :goto_0

    .line 285
    :cond_0
    iget v0, p0, Lo/akg;->h:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget v0, p0, Lo/akg;->h:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 286
    :cond_1
    invoke-direct {p0}, Lo/akg;->k()V

    .line 287
    iget v0, p0, Lo/akg;->u:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 288
    invoke-virtual {p0}, Lo/akg;->a()V

    goto :goto_0

    .line 290
    :cond_2
    iget v0, p0, Lo/akg;->h:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 291
    invoke-virtual {p0}, Lo/akg;->a()V

    .line 293
    :cond_3
    :goto_0
    invoke-direct {p0}, Lo/akg;->g()V

    .line 294
    return-void
.end method

.method public e(Lo/ajd;Lo/ajh;)V
    .locals 4

    .line 176
    iput-object p1, p0, Lo/akg;->i:Lo/ajd;

    .line 177
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/akg;->c(I)V

    .line 178
    sget-object v2, Lo/akg;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 179
    :try_start_0
    iput-object p2, p0, Lo/akg;->k:Lo/ajh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 181
    :goto_0
    iget-object v0, p0, Lo/akg;->d:Lo/akg$a;

    iget v1, p0, Lo/akg;->h:I

    invoke-virtual {v0, v1}, Lo/akg$a;->sendEmptyMessage(I)Z

    .line 182
    return-void
.end method
