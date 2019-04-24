.class public Lo/cwf;
.super Lo/cwz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cwf$e;
    }
.end annotation


# static fields
.field private static d:Lo/cwf;

.field static e:Ljava/lang/String;

.field private static f:I

.field private static g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static final l:Ljava/lang/Object;

.field private static final n:Ljava/lang/Object;

.field private static o:I


# instance fields
.field private a:Lo/dde;

.field b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private c:Landroid/content/Context;

.field private m:Landroid/os/HandlerThread;

.field private p:Landroid/os/Handler;

.field private q:Landroid/content/BroadcastReceiver;

.field private r:Ljava/lang/String;

.field private s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private t:I

.field private u:Lo/dqi;

.field private v:I

.field private y:Lo/daz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/cwf;->h:Ljava/util/List;

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/cwf;->i:Ljava/util/List;

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/cwf;->k:Ljava/util/List;

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/cwf;->g:Ljava/util/List;

    .line 111
    const/4 v0, 0x5

    sput v0, Lo/cwf;->f:I

    .line 116
    const/4 v0, 0x1

    sput v0, Lo/cwf;->o:I

    .line 131
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cwf;->l:Ljava/lang/Object;

    .line 136
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cwf;->n:Ljava/lang/Object;

    .line 1423
    const-string v0, ""

    sput-object v0, Lo/cwf;->e:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 162
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 121
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwf;->m:Landroid/os/HandlerThread;

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lo/cwf;->t:I

    .line 146
    const-string v0, ""

    iput-object v0, p0, Lo/cwf;->r:Ljava/lang/String;

    .line 795
    new-instance v0, Lo/cwf$7;

    invoke-direct {v0, p0}, Lo/cwf$7;-><init>(Lo/cwf;)V

    iput-object v0, p0, Lo/cwf;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1012
    new-instance v0, Lo/cwf$9;

    invoke-direct {v0, p0}, Lo/cwf$9;-><init>(Lo/cwf;)V

    iput-object v0, p0, Lo/cwf;->q:Landroid/content/BroadcastReceiver;

    .line 1053
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    iput-object v0, p0, Lo/cwf;->y:Lo/daz;

    .line 1150
    new-instance v0, Lo/cwf$10;

    invoke-direct {v0, p0}, Lo/cwf$10;-><init>(Lo/cwf;)V

    iput-object v0, p0, Lo/cwf;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1314
    const/4 v0, 0x0

    iput v0, p0, Lo/cwf;->v:I

    .line 163
    iput-object p1, p0, Lo/cwf;->c:Landroid/content/Context;

    .line 164
    iget-object v0, p0, Lo/cwf;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/cwf;->a:Lo/dde;

    .line 165
    iget-object v0, p0, Lo/cwf;->a:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 166
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 167
    iget-object v0, p0, Lo/cwf;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/cwf;->q:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 169
    iget-object v0, p0, Lo/cwf;->a:Lo/dde;

    iget-object v1, p0, Lo/cwf;->s:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 170
    goto :goto_0

    .line 172
    :cond_0
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWAlarmManager() hwDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    :goto_0
    iget-object v0, p0, Lo/cwf;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lo/cwf;->u:Lo/dqi;

    .line 177
    iget-object v0, p0, Lo/cwf;->u:Lo/dqi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 178
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHwCombineMigrateMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    :cond_1
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "HWAlarmManager"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cwf;->m:Landroid/os/HandlerThread;

    .line 182
    iget-object v0, p0, Lo/cwf;->m:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 183
    new-instance v0, Lo/cwf$e;

    iget-object v1, p0, Lo/cwf;->m:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cwf$e;-><init>(Lo/cwf;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cwf;->p:Landroid/os/Handler;

    .line 186
    invoke-direct {p0}, Lo/cwf;->m()V

    .line 187
    return-void
.end method

.method static synthetic a(Lo/cwf;)I
    .locals 1

    .line 68
    iget v0, p0, Lo/cwf;->t:I

    return v0
.end method

.method static synthetic a()Ljava/util/List;
    .locals 1

    .line 68
    sget-object v0, Lo/cwf;->h:Ljava/util/List;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lo/cwf;
    .locals 4

    .line 154
    sget-object v0, Lo/cwf;->d:Lo/cwf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 155
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstance() context = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    new-instance v0, Lo/cwf;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cwf;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/cwf;->d:Lo/cwf;

    .line 158
    :cond_0
    sget-object v0, Lo/cwf;->d:Lo/cwf;

    return-object v0
.end method

.method private a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;)V"
        }
    .end annotation

    .line 975
    iget-object v0, p0, Lo/cwf;->p:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 976
    const/4 v0, 0x5

    iput v0, v1, Landroid/os/Message;->what:I

    .line 977
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 978
    iget-object v0, p0, Lo/cwf;->p:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 979
    return-void
.end method

.method static synthetic a(Lo/cwf;Ljava/util/List;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1}, Lo/cwf;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic a(Lo/cwf;[B)V
    .locals 0

    .line 68
    invoke-direct {p0, p1}, Lo/cwf;->a([B)V

    return-void
.end method

.method private a([B)V
    .locals 11

    .line 809
    const/4 v4, 0x0

    .line 810
    const/4 v5, 0x0

    .line 811
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Alarm manager getResult = "

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

    .line 812
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 813
    :cond_0
    invoke-direct {p0, p1}, Lo/cwf;->c([B)I

    move-result v5

    .line 814
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Alarm manager info = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "message[1]  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    aget-byte v3, p1, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 816
    const v0, 0x186a0

    if-ne v0, v5, :cond_1

    .line 817
    const/4 v4, 0x0

    goto :goto_0

    .line 820
    :cond_1
    const/4 v4, -0x1

    .line 823
    :cond_2
    :goto_0
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_5

    .line 825
    :pswitch_0
    invoke-static {}, Lo/cwf;->h()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 826
    :try_start_0
    sget-object v0, Lo/cwf;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 827
    sget-object v0, Lo/cwf;->h:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v4, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 828
    sget-object v0, Lo/cwf;->h:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 830
    :cond_3
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 831
    :goto_1
    goto/16 :goto_5

    .line 834
    :pswitch_1
    invoke-static {}, Lo/cwf;->f()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 835
    :try_start_1
    sget-object v0, Lo/cwf;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 836
    sget-object v0, Lo/cwf;->i:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v4, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 837
    sget-object v0, Lo/cwf;->i:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 839
    :cond_4
    monitor-exit v6

    goto :goto_2

    :catchall_1
    move-exception v8

    monitor-exit v6

    throw v8

    .line 840
    :goto_2
    goto/16 :goto_5

    .line 843
    :pswitch_2
    invoke-static {}, Lo/cwf;->i()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 844
    :try_start_2
    sget-object v0, Lo/cwf;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 845
    sget-object v0, Lo/cwf;->k:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v4, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 846
    sget-object v0, Lo/cwf;->k:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 848
    :cond_5
    monitor-exit v6

    goto :goto_3

    :catchall_2
    move-exception v9

    monitor-exit v6

    throw v9

    .line 849
    :goto_3
    goto :goto_5

    .line 852
    :pswitch_3
    invoke-static {}, Lo/cwf;->g()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 853
    :try_start_3
    sget-object v0, Lo/cwf;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 854
    sget-object v0, Lo/cwf;->g:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v4, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 855
    sget-object v0, Lo/cwf;->g:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 857
    :cond_6
    monitor-exit v6

    goto :goto_4

    :catchall_3
    move-exception v10

    monitor-exit v6

    throw v10

    .line 858
    :goto_4
    goto :goto_5

    .line 861
    :pswitch_4
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cwf;->e(Ljava/lang/String;)V

    .line 862
    .line 868
    :goto_5
    const/4 v0, 0x0

    if-eq v0, v4, :cond_7

    .line 870
    iget-object v0, p0, Lo/cwf;->a:Lo/dde;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/dde;->a(Ljava/lang/String;)V

    .line 871
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bluetooth send error, clear mac"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 873
    :cond_7
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic b()I
    .locals 1

    .line 68
    sget v0, Lo/cwf;->f:I

    return v0
.end method

.method static synthetic b(Lo/cwf;I)I
    .locals 0

    .line 68
    iput p1, p0, Lo/cwf;->t:I

    return p1
.end method

.method static synthetic b(Lo/cwf;Lcom/huawei/datatype/EventAlarmInfo;Landroid/content/Context;)I
    .locals 1

    .line 68
    invoke-direct {p0, p1, p2}, Lo/cwf;->c(Lcom/huawei/datatype/EventAlarmInfo;Landroid/content/Context;)I

    move-result v0

    return v0
.end method

.method static synthetic b(Lo/cwf;)Lo/dde;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/cwf;->a:Lo/dde;

    return-object v0
.end method

.method private b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;)V"
        }
    .end annotation

    .line 936
    iget-object v0, p0, Lo/cwf;->p:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 937
    const/4 v0, 0x2

    iput v0, v1, Landroid/os/Message;->what:I

    .line 938
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 939
    iget-object v0, p0, Lo/cwf;->p:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 940
    return-void
.end method

.method private b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 960
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmInfoList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; iBaseResponseCallback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 961
    new-instance v4, Lcom/huawei/datatype/DBAlarmObject;

    invoke-direct {v4}, Lcom/huawei/datatype/DBAlarmObject;-><init>()V

    .line 962
    invoke-virtual {v4, p2}, Lcom/huawei/datatype/DBAlarmObject;->setiBaseResponseCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 963
    invoke-virtual {v4, p1}, Lcom/huawei/datatype/DBAlarmObject;->setObject(Ljava/lang/Object;)V

    .line 964
    iget-object v0, p0, Lo/cwf;->p:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 965
    const/4 v0, 0x4

    iput v0, v5, Landroid/os/Message;->what:I

    .line 966
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 967
    iget-object v0, p0, Lo/cwf;->p:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 968
    return-void
.end method

.method static synthetic b(Lo/cwf;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1, p2}, Lo/cwf;->b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method private c(Lcom/huawei/datatype/EventAlarmInfo;Landroid/content/Context;)I
    .locals 11

    .line 376
    invoke-virtual {p1}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v4

    .line 379
    const/16 v0, 0x2726

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ONCE_EVENT_ALARM_INFO"

    invoke-static {p2, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 380
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onceEventAlarmIsOver json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 382
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lo/cwf$5;

    invoke-direct {v1, p0}, Lo/cwf$5;-><init>(Lo/cwf;)V

    .line 383
    invoke-virtual {v1}, Lo/cwf$5;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 382
    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 384
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 385
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 386
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/datatype/EventAlarmInfo;

    .line 387
    invoke-virtual {v8}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmIndex()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmIndex()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 390
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v9, v0, v2

    .line 391
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== CurTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    invoke-virtual {v8}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmTime()J

    move-result-wide v0

    cmp-long v0, v9, v0

    if-ltz v0, :cond_0

    .line 394
    const/4 v4, 0x0

    .line 385
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 399
    :cond_1
    goto :goto_1

    .line 400
    :cond_2
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==once== onceEventAlarmIsOver json is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    :goto_1
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onceEventAlarmIsOver iRet = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    return v4
.end method

.method static synthetic c(Lo/cwf;Lcom/huawei/datatype/SmartAlarmInfo;)I
    .locals 1

    .line 68
    invoke-direct {p0, p1}, Lo/cwf;->d(Lcom/huawei/datatype/SmartAlarmInfo;)I

    move-result v0

    return v0
.end method

.method private c([B)I
    .locals 3

    .line 881
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 882
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

.method static synthetic c()Ljava/lang/Object;
    .locals 1

    .line 68
    invoke-static {}, Lo/cwf;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/cwf;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lo/cwf;->m()V

    return-void
.end method

.method private d(Lcom/huawei/datatype/SmartAlarmInfo;)I
    .locals 11

    .line 345
    invoke-virtual {p1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v4

    .line 348
    iget-object v0, p0, Lo/cwf;->c:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ONCE_SMART_ALARM_INFO"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 349
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onceSmartAlarmIsOver json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 351
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lo/cwf$2;

    invoke-direct {v1, p0}, Lo/cwf$2;-><init>(Lo/cwf;)V

    invoke-virtual {v1}, Lo/cwf$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 352
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 353
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 354
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 355
    invoke-virtual {v8}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 358
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v9, v0, v2

    .line 359
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== CurTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    invoke-virtual {v8}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmTime()J

    move-result-wide v0

    cmp-long v0, v9, v0

    if-ltz v0, :cond_0

    .line 362
    const/4 v4, 0x0

    .line 353
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 367
    :cond_1
    goto :goto_1

    .line 368
    :cond_2
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==once== onceSmartAlarmIsOver json is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    :goto_1
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onceSmartAlarmIsOver iRet = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    return v4
.end method

.method static synthetic d(Lo/cwf;)Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/cwf;->r:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d()Ljava/util/List;
    .locals 1

    .line 68
    sget-object v0, Lo/cwf;->i:Ljava/util/List;

    return-object v0
.end method

.method private d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 921
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "eventAlarmInfoList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; iBaseResponseCallback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 922
    new-instance v4, Lcom/huawei/datatype/DBAlarmObject;

    invoke-direct {v4}, Lcom/huawei/datatype/DBAlarmObject;-><init>()V

    .line 923
    invoke-virtual {v4, p2}, Lcom/huawei/datatype/DBAlarmObject;->setiBaseResponseCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 924
    invoke-virtual {v4, p1}, Lcom/huawei/datatype/DBAlarmObject;->setObject(Ljava/lang/Object;)V

    .line 925
    iget-object v0, p0, Lo/cwf;->p:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 926
    const/4 v0, 0x1

    iput v0, v5, Landroid/os/Message;->what:I

    .line 927
    iput-object v4, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 928
    iget-object v0, p0, Lo/cwf;->p:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 929
    return-void
.end method

.method static synthetic d(Lo/cwf;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1, p2}, Lo/cwf;->d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic e(Lo/cwf;)Landroid/content/Context;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/cwf;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/Object;
    .locals 1

    .line 68
    invoke-static {}, Lo/cwf;->h()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 1322
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "commandHex ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1323
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1325
    :pswitch_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cwf;->v:I

    .line 1326
    invoke-direct {p0}, Lo/cwf;->n()V

    .line 1327
    goto :goto_0

    .line 1329
    :pswitch_1
    nop

    .line 1331
    .line 1335
    :goto_0
    :pswitch_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic e(Lo/cwf;Ljava/util/List;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1}, Lo/cwf;->b(Ljava/util/List;)V

    return-void
.end method

.method static synthetic f(Lo/cwf;)I
    .locals 2

    .line 68
    iget v0, p0, Lo/cwf;->v:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/cwf;->v:I

    return v0
.end method

.method private static declared-synchronized f()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/cwf;

    monitor-enter v1

    .line 898
    :try_start_0
    sget-object v0, Lo/cwf;->i:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic g(Lo/cwf;)Landroid/os/Handler;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/cwf;->p:Landroid/os/Handler;

    return-object v0
.end method

.method private static declared-synchronized g()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/cwf;

    monitor-enter v1

    .line 913
    :try_start_0
    sget-object v0, Lo/cwf;->g:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized h()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/cwf;

    monitor-enter v1

    .line 890
    :try_start_0
    sget-object v0, Lo/cwf;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic h(Lo/cwf;)Lo/dqi;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/cwf;->u:Lo/dqi;

    return-object v0
.end method

.method private static declared-synchronized i()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/cwf;

    monitor-enter v1

    .line 906
    :try_start_0
    sget-object v0, Lo/cwf;->k:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic i(Lo/cwf;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lo/cwf;->n()V

    return-void
.end method

.method static synthetic k(Lo/cwf;)I
    .locals 1

    .line 68
    iget v0, p0, Lo/cwf;->v:I

    return v0
.end method

.method static synthetic k()Ljava/lang/Object;
    .locals 1

    .line 68
    sget-object v0, Lo/cwf;->l:Ljava/lang/Object;

    return-object v0
.end method

.method private static l()V
    .locals 6

    .line 1407
    const/4 v0, 0x0

    sput-object v0, Lo/cwf;->d:Lo/cwf;

    .line 1408
    invoke-static {}, Lo/cwf;->h()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 1409
    :try_start_0
    sget-object v0, Lo/cwf;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1410
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 1412
    :goto_0
    invoke-static {}, Lo/cwf;->f()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 1413
    :try_start_1
    sget-object v0, Lo/cwf;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1414
    monitor-exit v1

    goto :goto_1

    :catchall_1
    move-exception v3

    monitor-exit v1

    throw v3

    .line 1415
    :goto_1
    invoke-static {}, Lo/cwf;->i()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 1416
    :try_start_2
    sget-object v0, Lo/cwf;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1417
    monitor-exit v1

    goto :goto_2

    :catchall_2
    move-exception v4

    monitor-exit v1

    throw v4

    .line 1418
    :goto_2
    invoke-static {}, Lo/cwf;->g()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 1419
    :try_start_3
    sget-object v0, Lo/cwf;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1420
    monitor-exit v1

    goto :goto_3

    :catchall_3
    move-exception v5

    monitor-exit v1

    throw v5

    .line 1421
    :goto_3
    return-void
.end method

.method private m()V
    .locals 9

    .line 1065
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1067
    iget v0, p0, Lo/cwf;->t:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    .line 1068
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend--device is not connected, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1069
    return-void

    .line 1072
    :cond_0
    const/4 v4, 0x0

    .line 1073
    iget-object v0, p0, Lo/cwf;->a:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->a()Ljava/util/List;

    move-result-object v5

    .line 1074
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 1075
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1076
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v8

    .line 1077
    const/4 v0, 0x1

    if-eq v0, v8, :cond_1

    .line 1078
    move-object v4, v7

    .line 1079
    goto :goto_1

    .line 1081
    :cond_1
    goto :goto_0

    .line 1083
    :cond_2
    :goto_1
    const/4 v6, 0x1

    .line 1084
    const/4 v7, 0x1

    .line 1085
    const/4 v8, 0x0

    .line 1087
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1088
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cwf;->r:Ljava/lang/String;

    .line 1089
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isEvent_alarm()Z

    move-result v6

    .line 1090
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSmart_alarm()Z

    move-result v7

    .line 1091
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isChange_alarm()Z

    move-result v8

    goto :goto_2

    .line 1093
    :cond_3
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend---CapabilityUtils.getDeviceCapability() is null!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1096
    :goto_2
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "autoSendCommend() bIsSupportEventAlarm = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", bIsSupportSmartAlarm = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1097
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bIsSupportChangeAlarm =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1099
    if-eqz v8, :cond_4

    .line 1100
    return-void

    .line 1102
    :cond_4
    if-eqz v6, :cond_5

    .line 1104
    iget-object v0, p0, Lo/cwf;->u:Lo/dqi;

    new-instance v1, Lo/cwf$6;

    invoke-direct {v1, p0}, Lo/cwf$6;-><init>(Lo/cwf;)V

    invoke-virtual {v0, v1}, Lo/dqi;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1127
    :cond_5
    if-eqz v7, :cond_6

    .line 1129
    iget-object v0, p0, Lo/cwf;->u:Lo/dqi;

    new-instance v1, Lo/cwf$8;

    invoke-direct {v1, p0}, Lo/cwf$8;-><init>(Lo/cwf;)V

    invoke-virtual {v0, v1}, Lo/dqi;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1147
    :cond_6
    return-void
.end method

.method private n()V
    .locals 4

    .line 1338
    iget-object v0, p0, Lo/cwf;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v3

    .line 1339
    if-eqz v3, :cond_0

    .line 1341
    iget-object v0, p0, Lo/cwf;->u:Lo/dqi;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intelligent_home_linkage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/cwf$1;

    invoke-direct {v2, p0}, Lo/cwf$1;-><init>(Lo/cwf;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1385
    :cond_0
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 1158
    new-instance v2, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v2}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1159
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1160
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1161
    invoke-virtual {v2, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1163
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1164
    invoke-static {v3}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 1165
    invoke-static {v3}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 1167
    iget-object v0, p0, Lo/cwf;->a:Lo/dde;

    invoke-virtual {v0, v2}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1168
    invoke-static {}, Lo/cwf;->i()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 1169
    :try_start_0
    sget-object v0, Lo/cwf;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1170
    sget-object v0, Lo/cwf;->k:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1171
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 1173
    :goto_0
    return-void
.end method

.method public b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V"
        }
    .end annotation

    .line 570
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWAlarmManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " setSmartAlarm()"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    sget-object v4, Lo/cwf;->n:Ljava/lang/Object;

    monitor-enter v4

    .line 572
    :try_start_0
    iget-object v0, p0, Lo/cwf;->u:Lo/dqi;

    new-instance v1, Lo/cwf$4;

    invoke-direct {v1, p0, p1, p3, p2}, Lo/cwf$4;-><init>(Lo/cwf;Ljava/util/List;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/dqi;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 684
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 685
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/Object;)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;"
        }
    .end annotation

    .line 1191
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1192
    move-object/from16 v5, p1

    check-cast v5, Ljava/lang/String;

    .line 1193
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 1194
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "commandHex ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1196
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/cwf;->y:Lo/daz;

    invoke-virtual {v0, v6}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v7

    .line 1197
    iget-object v0, v7, Lo/dba;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/dba;

    .line 1199
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "tlvf ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lo/dba;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1200
    iget-object v0, v9, Lo/dba;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 1202
    const/4 v12, 0x0

    .line 1203
    const/4 v13, 0x0

    .line 1204
    const/4 v14, 0x0

    .line 1205
    const/4 v15, 0x0

    .line 1206
    const/16 v16, 0x0

    .line 1208
    iget-object v0, v11, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_2
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/daw;

    .line 1209
    invoke-virtual/range {v18 .. v18}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 1211
    :pswitch_0
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v12

    .line 1212
    goto/16 :goto_3

    .line 1214
    :pswitch_1
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 1215
    goto/16 :goto_3

    .line 1217
    :pswitch_2
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v19

    .line 1218
    move-object/from16 v0, v19

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v14

    .line 1219
    move-object/from16 v0, v19

    const/4 v1, 0x2

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v15

    .line 1220
    goto :goto_3

    .line 1222
    :pswitch_3
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v16

    .line 1223
    goto :goto_3

    .line 1225
    :pswitch_4
    new-instance v20, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-direct/range {v20 .. v20}, Lcom/huawei/datatype/EventAlarmInfo;-><init>()V

    .line 1226
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v21

    .line 1227
    invoke-static/range {v21 .. v21}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmName(Ljava/lang/String;)V

    .line 1228
    move-object/from16 v0, v20

    invoke-virtual {v0, v12}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmIndex(I)V

    .line 1229
    move-object/from16 v0, v20

    invoke-virtual {v0, v13}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmEnable(I)V

    .line 1230
    move-object/from16 v0, v20

    invoke-virtual {v0, v14}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmStartTime_hour(I)V

    .line 1231
    move-object/from16 v0, v20

    invoke-virtual {v0, v15}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmStartTime_mins(I)V

    .line 1232
    move-object/from16 v0, v20

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmRepeat(I)V

    .line 1233
    move-object/from16 v0, v20

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1234
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "eventAlarmInfo ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v20 .. v20}, Lcom/huawei/datatype/EventAlarmInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1235
    .line 1240
    :goto_3
    goto/16 :goto_2

    .line 1242
    :cond_0
    goto/16 :goto_1

    .line 1243
    :cond_1
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mEventAlarmInfoList "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 1244
    goto/16 :goto_0

    .line 1248
    :cond_2
    goto :goto_4

    .line 1246
    :catch_0
    move-exception v7

    .line 1247
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "COMMAND_ID_GET_DATE error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1249
    :goto_4
    return-object v4

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public c(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 1175
    new-instance v2, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v2}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1176
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1177
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1178
    invoke-virtual {v2, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1180
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1181
    invoke-static {v3}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 1182
    invoke-static {v3}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 1184
    iget-object v0, p0, Lo/cwf;->a:Lo/dde;

    invoke-virtual {v0, v2}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1185
    invoke-static {}, Lo/cwf;->g()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 1186
    :try_start_0
    sget-object v0, Lo/cwf;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1187
    sget-object v0, Lo/cwf;->g:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1188
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 1189
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 449
    new-instance v2, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v2}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 450
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 451
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 452
    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 453
    const/4 v3, 0x0

    .line 454
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 455
    const/4 v5, 0x0

    :goto_0
    sget v0, Lo/cwf;->f:I

    if-ge v5, v0, :cond_1

    .line 457
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    if-lt v5, v0, :cond_0

    .line 458
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 460
    const/16 v0, -0x7e

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 462
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 465
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 467
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 469
    add-int/lit8 v0, v5, 0x1

    int-to-byte v0, v0

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto/16 :goto_1

    .line 472
    :cond_0
    add-int/lit8 v0, v5, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 474
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 476
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 479
    move-object/from16 v0, p2

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 481
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 483
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v12

    .line 486
    move-object/from16 v0, p2

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_hour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    move-object/from16 v1, p2

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v1}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_mins()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, Lo/czx;->b(I)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v13

    .line 488
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v14

    .line 490
    const/4 v0, 0x5

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v15

    .line 493
    move-object/from16 v0, p2

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmRepeat()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v16

    .line 495
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v17

    .line 497
    const/4 v0, 0x6

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v18

    .line 500
    move-object/from16 v0, p2

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 502
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v20

    .line 504
    const/4 v0, 0x7

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v21

    .line 508
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    .line 514
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v23

    .line 516
    const/16 v0, 0x82

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v24

    .line 518
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    .line 520
    invoke-static/range {v25 .. v25}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v26

    .line 522
    move-object/from16 v0, v26

    array-length v0, v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 525
    move-object/from16 v0, v26

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 527
    :goto_1
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    add-int/2addr v3, v0

    .line 528
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 455
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 532
    :cond_1
    invoke-static {v3}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v5

    .line 534
    array-length v0, v5

    add-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 537
    const/16 v0, -0x7f

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 539
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 541
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/nio/ByteBuffer;

    .line 542
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 543
    goto :goto_2

    .line 545
    :cond_2
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 546
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 547
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf;->a:Lo/dde;

    invoke-virtual {v0, v2}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 549
    invoke-static {}, Lo/cwf;->h()Ljava/lang/Object;

    move-result-object v7

    monitor-enter v7

    .line 550
    :try_start_0
    sget-object v0, Lo/cwf;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 551
    sget-object v0, Lo/cwf;->h:Ljava/util/List;

    move-object/from16 v1, p3

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 552
    monitor-exit v7

    goto :goto_3

    :catchall_0
    move-exception v27

    monitor-exit v7

    throw v27

    .line 554
    :goto_3
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 693
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWAlarmManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " setDeviceSmartAlarm()"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSmartAlarm() before smartAlarmInfoList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 699
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 700
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 701
    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 703
    :cond_0
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSmartAlarm() after smartAlarmInfoList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 705
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 706
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 707
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 708
    invoke-virtual {v4, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 709
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v5, v0, 0x12

    .line 713
    const/16 v0, 0xff

    if-ge v0, v5, :cond_1

    .line 714
    add-int/lit8 v0, v5, 0x3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 715
    invoke-static {v5}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v7

    goto :goto_0

    .line 717
    :cond_1
    add-int/lit8 v0, v5, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 718
    invoke-static {v5}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v7

    .line 721
    :goto_0
    const/16 v0, -0x7f

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 723
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 725
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 728
    const/16 v0, -0x7e

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 730
    const/16 v0, 0x10

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 733
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 735
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 742
    invoke-virtual {v9}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 745
    const/4 v0, 0x4

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 747
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 749
    invoke-virtual {v9}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 752
    const/4 v0, 0x5

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 754
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 756
    invoke-virtual {v9}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_hour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    invoke-virtual {v9}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_mins()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, Lo/czx;->b(I)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 759
    const/4 v0, 0x6

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 761
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 763
    invoke-virtual {v9}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmRepeat()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 766
    const/4 v0, 0x7

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 768
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 770
    invoke-virtual {v9}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmAheadTime()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 772
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 773
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 775
    iget-object v0, p0, Lo/cwf;->a:Lo/dde;

    invoke-virtual {v0, v4}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 776
    goto/16 :goto_1

    .line 777
    :cond_2
    invoke-static {}, Lo/cwf;->f()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8

    .line 778
    :try_start_0
    sget-object v0, Lo/cwf;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 779
    sget-object v0, Lo/cwf;->i:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 780
    monitor-exit v8

    goto :goto_2

    :catchall_0
    move-exception v10

    monitor-exit v8

    throw v10

    .line 782
    :goto_2
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;)V"
        }
    .end annotation

    .line 413
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== eventAlarmInfoList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 417
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 418
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/datatype/EventAlarmInfo;

    .line 420
    invoke-virtual {v6}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmRepeat()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    invoke-virtual {v6}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 422
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 417
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 426
    :cond_1
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== eventAlarm saveAlarmInfoList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 432
    :try_start_0
    new-instance v5, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/dcy;-><init>(I)V

    .line 434
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 435
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== eventAlarm saveOnceAlarm() json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    iget-object v0, p0, Lo/cwf;->c:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ONCE_EVENT_ALARM_INFO"

    invoke-static {v0, v1, v2, v6, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 442
    goto :goto_1

    .line 440
    :catch_0
    move-exception v5

    .line 441
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== eventAlarm saveOnceAlarm() setSharedPreference error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    :cond_2
    :goto_1
    return-void
.end method

.method public d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V"
        }
    .end annotation

    .line 201
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWAlarmManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " setEventAlarm() begin "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    sget-object v4, Lo/cwf;->l:Ljava/lang/Object;

    monitor-enter v4

    .line 204
    :try_start_0
    iget-object v0, p0, Lo/cwf;->u:Lo/dqi;

    new-instance v1, Lo/cwf$3;

    invoke-direct {v1, p0, p1, p3, p2}, Lo/cwf$3;-><init>(Lo/cwf;Ljava/util/List;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/dqi;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 337
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 338
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/Object;)Ljava/util/List;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;)Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;"
        }
    .end annotation

    .line 1253
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1254
    move-object/from16 v5, p1

    check-cast v5, Ljava/lang/String;

    .line 1255
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 1256
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "commandHex ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1258
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/cwf;->y:Lo/daz;

    invoke-virtual {v0, v6}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v7

    .line 1259
    iget-object v0, v7, Lo/dba;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/dba;

    .line 1261
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "tlvf ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lo/dba;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1262
    iget-object v0, v9, Lo/dba;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 1264
    const/4 v12, 0x0

    .line 1265
    const/4 v13, 0x0

    .line 1266
    const/4 v14, 0x0

    .line 1267
    const/4 v15, 0x0

    .line 1268
    const/16 v16, 0x0

    .line 1270
    iget-object v0, v11, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_2
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/daw;

    .line 1271
    invoke-virtual/range {v18 .. v18}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 1273
    :pswitch_0
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v12

    .line 1274
    goto/16 :goto_3

    .line 1276
    :pswitch_1
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 1277
    goto/16 :goto_3

    .line 1279
    :pswitch_2
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v19

    .line 1280
    move-object/from16 v0, v19

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v14

    .line 1281
    move-object/from16 v0, v19

    const/4 v1, 0x2

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v15

    .line 1282
    goto :goto_3

    .line 1284
    :pswitch_3
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v16

    .line 1285
    goto :goto_3

    .line 1287
    :pswitch_4
    new-instance v20, Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-direct/range {v20 .. v20}, Lcom/huawei/datatype/SmartAlarmInfo;-><init>()V

    .line 1289
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmAheadTime(I)V

    .line 1290
    move-object/from16 v0, v20

    invoke-virtual {v0, v12}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmIndex(I)V

    .line 1291
    move-object/from16 v0, v20

    invoke-virtual {v0, v13}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmEnable(I)V

    .line 1292
    move-object/from16 v0, v20

    invoke-virtual {v0, v14}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmStartTime_hour(I)V

    .line 1293
    move-object/from16 v0, v20

    invoke-virtual {v0, v15}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmStartTime_mins(I)V

    .line 1294
    move-object/from16 v0, v20

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmRepeat(I)V

    .line 1295
    move-object/from16 v0, v20

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1297
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmInfo ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v20 .. v20}, Lcom/huawei/datatype/SmartAlarmInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1298
    .line 1303
    :goto_3
    goto/16 :goto_2

    .line 1304
    :cond_0
    goto/16 :goto_1

    .line 1305
    :cond_1
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msmartAlarmInfoList "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 1306
    goto/16 :goto_0

    .line 1310
    :cond_2
    goto :goto_4

    .line 1308
    :catch_0
    move-exception v7

    .line 1309
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "COMMAND_ID_GET_DATE error e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1311
    :goto_4
    return-object v4

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 191
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public onDataMigrate()Z
    .locals 1

    .line 1610
    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 5

    .line 1389
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 1391
    :try_start_0
    invoke-static {}, Lo/cwf;->l()V

    .line 1392
    iget-object v0, p0, Lo/cwf;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/cwf;->q:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1395
    goto :goto_0

    .line 1393
    :catch_0
    move-exception v4

    .line 1394
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver is not registered"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1396
    :goto_0
    iget-object v0, p0, Lo/cwf;->m:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1397
    iget-object v0, p0, Lo/cwf;->m:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 1398
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwf;->m:Landroid/os/HandlerThread;

    .line 1400
    :cond_0
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1401
    return-void
.end method
