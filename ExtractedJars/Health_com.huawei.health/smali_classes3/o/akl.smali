.class public Lo/akl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/akl$c;,
        Lo/akl$e;,
        Lo/akl$a;
    }
.end annotation


# static fields
.field private static B:Landroid/content/BroadcastReceiver;

.field private static l:Ljava/lang/String;

.field private static m:Z

.field private static n:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/Object;

.field private b:Landroid/content/Context;

.field private volatile c:I

.field private d:Lo/ajm;

.field private e:Landroid/net/wifi/WifiManager;

.field private f:Lo/ajd;

.field private g:Ljava/lang/String;

.field private h:Lo/ajm;

.field private i:Lo/akl$c;

.field private k:Lo/ajv;

.field private o:Ljava/lang/String;

.field private p:Lo/ajj;

.field private q:Z

.field private r:J

.field private volatile s:Z

.field private t:I

.field private u:I

.field private v:I

.field private w:Lo/aib;

.field private x:J

.field private y:Ljava/lang/String;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 115
    const/4 v0, 0x0

    sput-object v0, Lo/akl;->n:Ljava/lang/String;

    .line 117
    const/4 v0, 0x0

    sput-object v0, Lo/akl;->l:Ljava/lang/String;

    .line 121
    const/4 v0, 0x0

    sput-boolean v0, Lo/akl;->m:Z

    .line 306
    new-instance v0, Lo/akl$4;

    invoke-direct {v0}, Lo/akl$4;-><init>()V

    sput-object v0, Lo/akl;->B:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/akl;->a:Ljava/lang/Object;

    .line 97
    const/4 v0, -0x1

    iput v0, p0, Lo/akl;->c:I

    .line 123
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akl;->s:Z

    .line 127
    const/4 v0, 0x0

    iput v0, p0, Lo/akl;->u:I

    .line 129
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akl;->q:Z

    .line 131
    const/4 v0, -0x1

    iput v0, p0, Lo/akl;->t:I

    .line 135
    const/4 v0, 0x0

    iput v0, p0, Lo/akl;->z:I

    .line 137
    const/4 v0, -0x1

    iput v0, p0, Lo/akl;->v:I

    .line 139
    const-string v0, ""

    iput-object v0, p0, Lo/akl;->y:Ljava/lang/String;

    .line 141
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/akl;->x:J

    .line 144
    iput-object p1, p0, Lo/akl;->b:Landroid/content/Context;

    .line 145
    invoke-direct {p0}, Lo/akl;->h()V

    .line 146
    return-void
.end method

.method static synthetic a(Lo/akl;)Landroid/content/Context;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/akl;->b:Landroid/content/Context;

    return-object v0
.end method

.method private static a(Landroid/net/NetworkInfo;Landroid/content/Context;)V
    .locals 5

    .line 361
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 362
    sget-object v0, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 363
    const-string v0, "wifi"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/wifi/WifiManager;

    .line 364
    invoke-static {v4}, Lo/akl;->a(Landroid/net/wifi/WifiManager;)Z

    .line 365
    goto :goto_0

    .line 366
    :cond_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWifiConnectDevice : disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 369
    :cond_1
    :goto_0
    return-void
.end method

.method private static a(Ljava/lang/String;)V
    .locals 0

    .line 194
    sput-object p0, Lo/akl;->n:Ljava/lang/String;

    .line 195
    return-void
.end method

.method static synthetic a(Lo/akl;I)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/akl;->d(I)V

    return-void
.end method

.method private static a(Z)V
    .locals 0

    .line 200
    sput-boolean p0, Lo/akl;->m:Z

    .line 201
    return-void
.end method

.method public static a(Landroid/net/wifi/WifiManager;)Z
    .locals 8

    .line 975
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v4

    .line 976
    invoke-virtual {v4}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object v5

    .line 977
    invoke-virtual {v4}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 978
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1e

    if-le v0, v1, :cond_1

    .line 979
    const-string v0, "\""

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "\""

    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 980
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    .line 981
    add-int/lit8 v0, v7, -0x1

    const/4 v1, 0x1

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 982
    sget-object v0, Lo/akl;->n:Ljava/lang/String;

    invoke-static {v5, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 983
    const/4 v0, 0x1

    sput-boolean v0, Lo/akl;->m:Z

    .line 985
    :cond_0
    goto :goto_0

    .line 987
    :cond_1
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isWifiConnectDevice : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 989
    :cond_2
    :goto_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lo/akl;->l:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 990
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWifiConnectDevice : MAC equal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 991
    const/4 v0, 0x1

    sput-boolean v0, Lo/akl;->m:Z

    goto :goto_1

    .line 993
    :cond_3
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWifiConnectDevice : Bssid:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " devMac:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget-object v2, Lo/akl;->l:Ljava/lang/String;

    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 995
    :goto_1
    sget-boolean v0, Lo/akl;->m:Z

    return v0
.end method

.method static synthetic b(Lo/akl;)Lo/ajd;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/akl;->f:Lo/ajd;

    return-object v0
.end method

.method public static b()Z
    .locals 1

    .line 149
    sget-boolean v0, Lo/akl;->m:Z

    return v0
.end method

.method static synthetic c(Lo/akl;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 50
    iput-object p1, p0, Lo/akl;->y:Ljava/lang/String;

    return-object p1
.end method

.method private c(I)V
    .locals 4

    .line 718
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handeMessageSendMsgToDevice msg: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mWorkFlow"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 719
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 721
    :sswitch_0
    iget v0, p0, Lo/akl;->c:I

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 722
    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lo/akl;->c:I

    .line 723
    const/16 v0, 0x458

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/akl;->c(ILjava/lang/Object;)V

    .line 724
    const/4 v0, 0x0

    sput-boolean v0, Lo/akl;->m:Z

    .line 725
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akl;->q:Z

    .line 726
    invoke-direct {p0}, Lo/akl;->n()Z

    .line 727
    iget v0, p0, Lo/akl;->t:I

    if-gez v0, :cond_1

    .line 728
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handeMessageSendMsgToDevice device addNetWork == -1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 730
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Lo/akl$c;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 732
    :cond_1
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 733
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/4 v1, 0x4

    const-wide/32 v2, 0xc350

    invoke-virtual {v0, v1, v2, v3}, Lo/akl$c;->sendEmptyMessageDelayed(IJ)Z

    .line 734
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 735
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/4 v1, 0x6

    const-wide/32 v2, 0xd6d8

    invoke-virtual {v0, v1, v2, v3}, Lo/akl$c;->sendEmptyMessageDelayed(IJ)Z

    .line 739
    :cond_2
    :goto_0
    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 740
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x3e8

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/akl$c;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_2

    .line 742
    :cond_3
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " MSG_START_SEND_MSG_TO_DEV nodeal state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 744
    goto/16 :goto_2

    .line 747
    :sswitch_1
    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 748
    invoke-direct {p0}, Lo/akl;->p()V

    .line 749
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x3e8

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/akl$c;->sendEmptyMessageDelayed(IJ)Z

    .line 750
    iget-boolean v0, p0, Lo/akl;->q:Z

    if-nez v0, :cond_9

    .line 751
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/akl;->q:Z

    .line 752
    invoke-virtual {p0}, Lo/akl;->c()V

    goto/16 :goto_2

    .line 755
    :cond_4
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " MSG_CONNECT_DEVICE_TIMER ERR:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 757
    goto/16 :goto_2

    .line 760
    :sswitch_2
    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 761
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 762
    sget-boolean v0, Lo/akl;->m:Z

    if-eqz v0, :cond_5

    .line 763
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mIsConnected so successed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 764
    invoke-virtual {p0}, Lo/akl;->g()V

    .line 765
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 767
    :cond_5
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mIsConnected false ,goto manual"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 768
    invoke-virtual {p0}, Lo/akl;->g()V

    .line 769
    const/16 v0, 0x44f

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/akl;->d(ILjava/lang/Object;)V

    .line 770
    invoke-direct {p0}, Lo/akl;->i()V

    goto/16 :goto_2

    .line 773
    :cond_6
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " MSG_CONNECT_DEVICE_FAILURE ERR:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 775
    goto/16 :goto_2

    .line 778
    :sswitch_3
    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_7

    .line 779
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " MSG_SEND_MSG_TO_DEVICE_SUCCESS: success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 780
    invoke-virtual {p0}, Lo/akl;->g()V

    .line 781
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 783
    :cond_7
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " MSG_SEND_MSG_TO_DEVICE_SUCCESS: err"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 785
    goto :goto_2

    .line 788
    :sswitch_4
    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_8

    .line 789
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " MSG_SEND_MSG_TO_DEVICE_FAILURE:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 790
    invoke-virtual {p0}, Lo/akl;->g()V

    .line 791
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    goto :goto_2

    .line 793
    :cond_8
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " MSG_SEND_MSG_TO_DEVICE_FAILURE: err "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 795
    goto :goto_2

    .line 798
    :goto_1
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handeMessageSendMsgToDevice never go here"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 801
    :cond_9
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_2
        0x5 -> :sswitch_3
        0x6 -> :sswitch_4
        0x66 -> :sswitch_0
        0x3e8 -> :sswitch_1
    .end sparse-switch
.end method

.method private c(ILjava/lang/Object;)V
    .locals 6

    .line 898
    iget-object v4, p0, Lo/akl;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 899
    :try_start_0
    iget-object v0, p0, Lo/akl;->p:Lo/ajj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 900
    iget-object v0, p0, Lo/akl;->p:Lo/ajj;

    const-string v1, "work_flow"

    invoke-interface {v0, p1, v1, p2}, Lo/ajj;->onResult(ILjava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 902
    :cond_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendWorkFLowMsg callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 904
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 905
    :goto_1
    return-void
.end method

.method static synthetic c(Landroid/net/NetworkInfo;Landroid/content/Context;)V
    .locals 0

    .line 50
    invoke-static {p0, p1}, Lo/akl;->a(Landroid/net/NetworkInfo;Landroid/content/Context;)V

    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 4

    .line 529
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handeMessageWaitDeviceOnline msg:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "mWorkFlow:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/akl;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 530
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 532
    :sswitch_0
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 533
    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 534
    const/4 v0, 0x2

    iput v0, p0, Lo/akl;->c:I

    .line 535
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    .line 536
    const/16 v0, 0x459

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/akl;->c(ILjava/lang/Object;)V

    .line 537
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/akl;->e(Z)Z

    .line 539
    :cond_0
    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_1

    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 540
    :cond_1
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 541
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    goto/16 :goto_1

    .line 543
    :cond_2
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " MSG_START_SWITCH_TO_ROUTER, ERR:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 545
    goto/16 :goto_1

    .line 548
    :sswitch_1
    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_3

    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_4

    .line 549
    :cond_3
    const/4 v0, 0x3

    iput v0, p0, Lo/akl;->c:I

    .line 550
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x3ea

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/akl$c;->sendEmptyMessageDelayed(IJ)Z

    .line 551
    const/4 v0, 0x0

    iput v0, p0, Lo/akl;->z:I

    goto/16 :goto_1

    .line 553
    :cond_4
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " MSG_START_GET_ONLINE_DEVINFO: ERR "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 555
    goto/16 :goto_1

    .line 558
    :sswitch_2
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " connect wifi success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 559
    goto/16 :goto_1

    .line 562
    :sswitch_3
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " connect wifi fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 563
    goto/16 :goto_1

    .line 566
    :sswitch_4
    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x3

    if-eq v1, v0, :cond_5

    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_8

    .line 567
    :cond_5
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " MSG_GET_DEVICE_INFO_FROM get info:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 568
    iget v0, p0, Lo/akl;->z:I

    const/4 v1, 0x5

    if-le v0, v1, :cond_6

    .line 569
    invoke-virtual {p0}, Lo/akl;->e()V

    .line 570
    const/4 v0, 0x0

    iput v0, p0, Lo/akl;->z:I

    .line 572
    :cond_6
    invoke-direct {p0}, Lo/akl;->f()Z

    move-result v0

    if-nez v0, :cond_7

    .line 573
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " MSG_GET_DEVICE_INFO_FROM reconnect preWiFiAP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 574
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/akl;->e(Z)Z

    .line 576
    :cond_7
    iget v0, p0, Lo/akl;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/akl;->z:I

    .line 577
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x3ea

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/akl$c;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1

    .line 579
    :cond_8
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " MSG_GET_DEVICE_INFO_FROM ERR"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 581
    goto :goto_1

    .line 584
    :sswitch_5
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DEVICE REGISTER SUCCESS!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 586
    const/16 v0, 0x64

    iput v0, p0, Lo/akl;->c:I

    .line 587
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 588
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 589
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 590
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lo/akl;->b(Ljava/lang/Object;)V

    .line 591
    goto :goto_1

    .line 594
    :goto_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handeMessageSwitchToRouter never go here"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 597
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_2
        0x8 -> :sswitch_3
        0x9 -> :sswitch_5
        0x67 -> :sswitch_0
        0x68 -> :sswitch_1
        0x3ea -> :sswitch_4
    .end sparse-switch
.end method

.method static synthetic c(Lo/akl;I)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/akl;->c(I)V

    return-void
.end method

.method static synthetic d(Lo/akl;)Lo/akl$c;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Lo/akl;
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 153
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 154
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " create Context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 155
    const/4 v0, 0x0

    return-object v0

    .line 157
    :cond_0
    new-instance v4, Lo/akl;

    invoke-direct {v4, p0}, Lo/akl;-><init>(Landroid/content/Context;)V

    .line 158
    return-object v4
.end method

.method private d(I)V
    .locals 4

    .line 681
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handeMessageGetRegisterInfo msg:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " mWorkFlow:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget v2, p0, Lo/akl;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 682
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 684
    :sswitch_0
    const/4 v0, 0x0

    iput v0, p0, Lo/akl;->c:I

    .line 685
    const/4 v0, 0x0

    iput v0, p0, Lo/akl;->u:I

    .line 686
    invoke-direct {p0}, Lo/akl;->l()V

    .line 687
    goto/16 :goto_1

    .line 690
    :sswitch_1
    iget v0, p0, Lo/akl;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 691
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    goto/16 :goto_1

    .line 693
    :cond_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " MSG_GET_REGISTER_INFO_SUCCESS ERR: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 695
    goto :goto_1

    .line 698
    :sswitch_2
    iget v0, p0, Lo/akl;->u:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/akl;->u:I

    .line 699
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handeMessageGetRegisterInfo: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " count:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->u:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 700
    iget v0, p0, Lo/akl;->u:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 701
    const/16 v0, 0x44e

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/akl;->d(ILjava/lang/Object;)V

    goto :goto_1

    .line 703
    :cond_1
    invoke-direct {p0}, Lo/akl;->l()V

    .line 705
    goto :goto_1

    .line 708
    :goto_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handeMessageGetRegisterInfo never go here"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 711
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_2
        0x64 -> :sswitch_0
    .end sparse-switch
.end method

.method private d(IJ)V
    .locals 5

    .line 233
    iget-object v0, p0, Lo/akl;->f:Lo/ajd;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/akl;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 234
    :cond_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " startSoftApOuth \u53c2\u6570\u9519\u8bef\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 235
    return-void

    .line 237
    :cond_1
    sget-object v0, Lo/akl;->n:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 238
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSoftApOuth mDeviceSsid is Empity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 239
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 240
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 241
    const/16 v0, 0xa

    iput v0, v4, Landroid/os/Message;->what:I

    .line 242
    const/16 v0, 0x44d

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 243
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    .line 244
    return-void

    .line 247
    :cond_2
    invoke-direct {p0}, Lo/akl;->k()V

    .line 249
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 250
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0xa

    invoke-virtual {v0, v1, p2, p3}, Lo/akl$c;->sendEmptyMessageDelayed(IJ)Z

    .line 251
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/akl;->r:J

    .line 252
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 254
    :pswitch_0
    const/4 v0, -0x1

    iput v0, p0, Lo/akl;->c:I

    .line 255
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    .line 256
    goto :goto_0

    .line 258
    :pswitch_1
    const/4 v0, 0x0

    iput v0, p0, Lo/akl;->c:I

    .line 259
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    .line 260
    goto :goto_0

    .line 262
    :pswitch_2
    const/4 v0, 0x1

    iput v0, p0, Lo/akl;->c:I

    .line 263
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    .line 264
    .line 268
    :goto_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSoftApOuth begin staff outhStep:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mWorkFlow:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 269
    new-instance v0, Lo/ajv;

    const-string v1, "\u8bbe\u5907\u70ed\u70b9"

    invoke-direct {v0, v1}, Lo/ajv;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/akl;->k:Lo/ajv;

    .line 270
    iget-object v0, p0, Lo/akl;->k:Lo/ajv;

    invoke-virtual {v0}, Lo/ajv;->b()V

    .line 271
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d(ILjava/lang/Object;)V
    .locals 6

    .line 913
    iget-object v4, p0, Lo/akl;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 914
    :try_start_0
    iget-object v0, p0, Lo/akl;->p:Lo/ajj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 915
    iget-object v0, p0, Lo/akl;->p:Lo/ajj;

    const-string v1, "error_code"

    invoke-interface {v0, p1, v1, p2}, Lo/ajj;->onResult(ILjava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 917
    :cond_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendResultMsg callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 919
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 920
    :goto_1
    return-void
.end method

.method private static d(Ljava/lang/String;)V
    .locals 0

    .line 197
    sput-object p0, Lo/akl;->l:Ljava/lang/String;

    .line 198
    return-void
.end method

.method static synthetic d(Lo/akl;Landroid/os/Message;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/akl;->c(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic e(Lo/akl;)I
    .locals 1

    .line 50
    iget v0, p0, Lo/akl;->c:I

    return v0
.end method

.method static synthetic e(Lo/akl;J)J
    .locals 0

    .line 50
    iput-wide p1, p0, Lo/akl;->x:J

    return-wide p1
.end method

.method private e(Z)Z
    .locals 4

    .line 601
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectWiFi"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    iget v0, p0, Lo/akl;->v:I

    if-gez v0, :cond_0

    .line 603
    iget-object v0, p0, Lo/akl;->e:Landroid/net/wifi/WifiManager;

    iget-object v1, p0, Lo/akl;->g:Ljava/lang/String;

    iget-object v2, p0, Lo/akl;->o:Ljava/lang/String;

    sget-object v3, Lo/akl;->n:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lo/akf;->c(Landroid/net/wifi/WifiManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/akl;->v:I

    .line 605
    :cond_0
    iget v0, p0, Lo/akl;->v:I

    if-ltz v0, :cond_2

    .line 606
    if-eqz p1, :cond_1

    .line 607
    iget-object v0, p0, Lo/akl;->e:Landroid/net/wifi/WifiManager;

    iget v1, p0, Lo/akl;->v:I

    invoke-static {v0, v1}, Lo/akf;->a(Landroid/net/wifi/WifiManager;I)Z

    move-result v0

    return v0

    .line 609
    :cond_1
    iget-object v0, p0, Lo/akl;->e:Landroid/net/wifi/WifiManager;

    iget v1, p0, Lo/akl;->v:I

    invoke-static {v0, v1}, Lo/akf;->b(Landroid/net/wifi/WifiManager;I)Z

    move-result v0

    return v0

    .line 612
    :cond_2
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connectWiFi false: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->v:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    const/4 v0, 0x0

    return v0
.end method

.method private f()Z
    .locals 8

    .line 659
    iget-object v0, p0, Lo/akl;->b:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/wifi/WifiManager;

    .line 660
    invoke-virtual {v4}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v5

    .line 661
    invoke-virtual {v5}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object v6

    .line 662
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 663
    const-string v0, "\""

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "\""

    invoke-virtual {v6, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 664
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    .line 665
    add-int/lit8 v0, v7, -0x1

    const/4 v1, 0x1

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 666
    iget-object v0, p0, Lo/akl;->g:Ljava/lang/String;

    invoke-static {v6, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 667
    const/4 v0, 0x1

    return v0

    .line 669
    :cond_0
    goto :goto_0

    .line 671
    :cond_1
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isConnectRouter CONNECTIVITY_ACTION: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 673
    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private h()V
    .locals 2

    .line 163
    const/4 v0, -0x1

    iput v0, p0, Lo/akl;->c:I

    .line 164
    iget-object v0, p0, Lo/akl;->b:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lo/akl;->e:Landroid/net/wifi/WifiManager;

    .line 165
    new-instance v0, Lo/akl$a;

    invoke-direct {v0, p0}, Lo/akl$a;-><init>(Lo/akl;)V

    iput-object v0, p0, Lo/akl;->d:Lo/ajm;

    .line 166
    new-instance v0, Lo/akl$e;

    invoke-direct {v0, p0}, Lo/akl$e;-><init>(Lo/akl;)V

    iput-object v0, p0, Lo/akl;->h:Lo/ajm;

    .line 167
    new-instance v0, Lo/akl$c;

    invoke-direct {v0, p0}, Lo/akl$c;-><init>(Lo/akl;)V

    iput-object v0, p0, Lo/akl;->i:Lo/akl$c;

    .line 168
    return-void
.end method

.method private i()V
    .locals 6

    .line 828
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/akl;->r:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x249f0

    sub-long v4, v2, v0

    .line 829
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " connectDeviceApFail() left time:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 830
    const-wide/16 v0, 0x2710

    cmp-long v0, v4, v0

    if-gtz v0, :cond_0

    .line 832
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 833
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    .line 834
    return-void

    .line 836
    :cond_0
    iget-object v0, p0, Lo/akl;->k:Lo/ajv;

    if-eqz v0, :cond_1

    .line 837
    iget-object v0, p0, Lo/akl;->k:Lo/ajv;

    const-string v1, "\u8ba4\u8bc1\u5931\u8d25"

    const/16 v2, 0x44f

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/ajv;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 839
    :cond_1
    invoke-virtual {p0}, Lo/akl;->d()V

    .line 840
    return-void
.end method

.method private k()V
    .locals 5

    .line 291
    iget-object v0, p0, Lo/akl;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 292
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regWifiStateBroadCast activity NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 293
    :cond_0
    iget-boolean v0, p0, Lo/akl;->s:Z

    if-eqz v0, :cond_1

    .line 294
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Already regWifiStateBroadCast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 296
    :cond_1
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 297
    const-string v0, "android.net.wifi.WIFI_STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 298
    const-string v0, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 299
    const/16 v0, 0x3e8

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 300
    iget-object v0, p0, Lo/akl;->b:Landroid/content/Context;

    sget-object v1, Lo/akl;->B:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 301
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/akl;->s:Z

    .line 303
    :goto_0
    return-void
.end method

.method private l()V
    .locals 4

    .line 926
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getDeviceRegisterInfo() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 928
    const/16 v0, 0x457

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/akl;->c(ILjava/lang/Object;)V

    .line 930
    iget-object v0, p0, Lo/akl;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/akh;->e(Landroid/content/Context;)Lo/akh;

    move-result-object v0

    iget-object v1, p0, Lo/akl;->f:Lo/ajd;

    sget-object v2, Lo/akh$i;->a:Lo/akh$i;

    iget-object v3, p0, Lo/akl;->h:Lo/ajm;

    invoke-virtual {v0, v1, v2, v3}, Lo/akh;->b(Lo/ajd;Lo/akh$i;Lo/ajm;)V

    .line 932
    return-void
.end method

.method private n()Z
    .locals 4

    .line 939
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " startConnectDeviceAp() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 940
    iget-object v0, p0, Lo/akl;->e:Landroid/net/wifi/WifiManager;

    sget-object v1, Lo/akl;->n:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/akf;->b(Landroid/net/wifi/WifiManager;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/akl;->t:I

    .line 942
    iget v0, p0, Lo/akl;->t:I

    if-gez v0, :cond_0

    .line 943
    iget-object v0, p0, Lo/akl;->e:Landroid/net/wifi/WifiManager;

    iget v1, p0, Lo/akl;->t:I

    invoke-static {v0, v1}, Lo/akf;->b(Landroid/net/wifi/WifiManager;I)Z

    move-result v0

    return v0

    .line 945
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_1

    .line 946
    iget-object v0, p0, Lo/akl;->e:Landroid/net/wifi/WifiManager;

    iget v1, p0, Lo/akl;->t:I

    invoke-static {v0, v1}, Lo/akf;->b(Landroid/net/wifi/WifiManager;I)Z

    move-result v0

    return v0

    .line 948
    :cond_1
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startConnectDeviceAp false: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 949
    const/4 v0, 0x0

    return v0
.end method

.method private o()V
    .locals 4

    .line 856
    iget-boolean v0, p0, Lo/akl;->s:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/akl;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 857
    iget-object v0, p0, Lo/akl;->b:Landroid/content/Context;

    sget-object v1, Lo/akl;->B:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 858
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akl;->s:Z

    goto :goto_0

    .line 860
    :cond_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregWifiStateBroadCast mHasRegBroadcast is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 862
    :goto_0
    return-void
.end method

.method private p()V
    .locals 4

    .line 957
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reconnectDeviceAp\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 958
    iget v0, p0, Lo/akl;->t:I

    if-gez v0, :cond_0

    .line 959
    iget-object v0, p0, Lo/akl;->e:Landroid/net/wifi/WifiManager;

    sget-object v1, Lo/akl;->n:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/akf;->b(Landroid/net/wifi/WifiManager;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/akl;->t:I

    .line 962
    :cond_0
    iget v0, p0, Lo/akl;->t:I

    if-ltz v0, :cond_1

    .line 963
    iget-object v0, p0, Lo/akl;->e:Landroid/net/wifi/WifiManager;

    iget v1, p0, Lo/akl;->t:I

    invoke-static {v0, v1}, Lo/akf;->a(Landroid/net/wifi/WifiManager;I)Z

    goto :goto_0

    .line 965
    :cond_1
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reconnectDeviceAp false: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/akl;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 967
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 804
    iget-object v0, p0, Lo/akl;->k:Lo/ajv;

    if-eqz v0, :cond_0

    .line 805
    iget-object v0, p0, Lo/akl;->k:Lo/ajv;

    const-string v1, "\u914d\u7f51\u8d85\u65f6"

    const/16 v2, 0x450

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/ajv;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 807
    :cond_0
    invoke-virtual {p0}, Lo/akl;->d()V

    .line 808
    const/16 v0, 0x450

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/akl;->d(ILjava/lang/Object;)V

    .line 809
    return-void
.end method

.method public a(Lo/ajd;Ljava/lang/String;Ljava/lang/String;Lo/ajj;)V
    .locals 4

    .line 179
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " start() addDeviceInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " outhSSID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, " outhPsd = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 180
    invoke-static {p3}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 179
    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iput-object p1, p0, Lo/akl;->f:Lo/ajd;

    .line 182
    iget-object v0, p0, Lo/akl;->f:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/akl;->a(Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Lo/akl;->f:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/akl;->d(Ljava/lang/String;)V

    .line 184
    iput-object p2, p0, Lo/akl;->g:Ljava/lang/String;

    .line 185
    iput-object p3, p0, Lo/akl;->o:Ljava/lang/String;

    .line 186
    iput-object p4, p0, Lo/akl;->p:Lo/ajj;

    .line 187
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akl;->y:Ljava/lang/String;

    .line 188
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/akl;->x:J

    .line 189
    const/4 v0, 0x0

    invoke-static {v0}, Lo/akl;->a(Z)V

    .line 190
    const/4 v0, 0x0

    const-wide/32 v1, 0x249f0

    invoke-direct {p0, v0, v1, v2}, Lo/akl;->d(IJ)V

    .line 191
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 815
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " registerSuccess()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 817
    iget-object v0, p0, Lo/akl;->k:Lo/ajv;

    if-eqz v0, :cond_0

    .line 818
    iget-object v0, p0, Lo/akl;->k:Lo/ajv;

    const-string v1, "\u914d\u7f51\u6210\u529f"

    invoke-virtual {v0, v1}, Lo/ajv;->c(Ljava/lang/String;)V

    .line 820
    :cond_0
    invoke-virtual {p0}, Lo/akl;->d()V

    .line 821
    const/16 v0, 0x44c

    invoke-direct {p0, v0, p1}, Lo/akl;->d(ILjava/lang/Object;)V

    .line 822
    return-void
.end method

.method public c()V
    .locals 5

    .line 867
    const-string v0, "SoftApOuthManager"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " startDeviceApConnection() mOuthName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/akl;->g:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mOuthPazzword = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/akl;->o:Ljava/lang/String;

    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mAddDeviceInfo = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/akl;->f:Lo/ajd;

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " mRegisterMessage = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/akl;->y:Ljava/lang/String;

    .line 868
    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 867
    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 870
    new-instance v4, Lo/aie;

    invoke-direct {v4}, Lo/aie;-><init>()V

    .line 871
    iget-object v0, p0, Lo/akl;->g:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/aie;->e(Ljava/lang/String;)V

    .line 872
    iget-object v0, p0, Lo/akl;->o:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/aie;->a(Ljava/lang/String;)V

    .line 873
    iget-object v0, p0, Lo/akl;->f:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/aie;->b(Ljava/lang/String;)V

    .line 874
    iget-object v0, p0, Lo/akl;->f:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->g()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/aie;->d(I)V

    .line 875
    iget-object v0, p0, Lo/akl;->f:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/aie;->c(Ljava/lang/String;)V

    .line 877
    invoke-virtual {p0}, Lo/akl;->g()V

    .line 878
    new-instance v0, Lo/aib;

    iget-object v1, p0, Lo/akl;->y:Ljava/lang/String;

    iget-object v2, p0, Lo/akl;->d:Lo/ajm;

    invoke-direct {v0, v4, v1, v2}, Lo/aib;-><init>(Lo/aie;Ljava/lang/String;Lo/ajm;)V

    iput-object v0, p0, Lo/akl;->w:Lo/aib;

    .line 879
    iget-object v0, p0, Lo/akl;->w:Lo/aib;

    iget-object v1, p0, Lo/akl;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/aib;->b(Landroid/content/Context;)V

    .line 880
    return-void
.end method

.method public d()V
    .locals 2

    .line 844
    invoke-direct {p0}, Lo/akl;->o()V

    .line 846
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 847
    const/16 v0, 0x3e7

    iput v0, p0, Lo/akl;->c:I

    .line 848
    iget-object v0, p0, Lo/akl;->i:Lo/akl$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akl$c;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 850
    :cond_0
    return-void
.end method

.method public e()V
    .locals 5

    .line 621
    iget-object v0, p0, Lo/akl;->f:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 622
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;-><init>()V

    .line 623
    iget-object v0, p0, Lo/akl;->f:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;->setDevId(Ljava/lang/String;)V

    .line 624
    iget-object v0, p0, Lo/akl;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/akl$5;

    invoke-direct {v1, p0}, Lo/akl$5;-><init>(Lo/akl;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;Lo/cyx;)V

    .line 649
    goto :goto_0

    .line 650
    :cond_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOuthedDeviceFromCloud mAddDeviceInfo DevId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 652
    :goto_0
    return-void
.end method

.method public g()V
    .locals 4

    .line 886
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " stopDeviceApConnection() in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 887
    iget-object v0, p0, Lo/akl;->w:Lo/aib;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 888
    iget-object v0, p0, Lo/akl;->w:Lo/aib;

    invoke-virtual {v0}, Lo/aib;->e()V

    .line 889
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akl;->w:Lo/aib;

    .line 891
    :cond_0
    return-void
.end method
