.class public Lo/aif;
.super Lo/ahv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aif$a;
    }
.end annotation


# instance fields
.field private a:Lo/ajm;

.field private b:[[I

.field private c:Landroid/content/Context;

.field private d:[I

.field private e:Lo/aif$a;

.field private final f:Landroid/net/wifi/WifiManager;

.field private h:[I

.field private k:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/aij;Lo/ajm;)V
    .locals 2

    .line 43
    invoke-direct {p0}, Lo/ahv;-><init>()V

    .line 163
    new-instance v0, Lo/aif$1;

    invoke-direct {v0, p0}, Lo/aif$1;-><init>(Lo/aif;)V

    iput-object v0, p0, Lo/aif;->k:Landroid/os/Handler;

    .line 44
    iput-object p1, p0, Lo/aif;->c:Landroid/content/Context;

    .line 45
    iput-object p3, p0, Lo/aif;->a:Lo/ajm;

    .line 46
    iget-object v0, p2, Lo/aij;->c:[I

    iput-object v0, p0, Lo/aif;->d:[I

    .line 47
    new-instance v0, Lo/aif$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/aif$a;-><init>(Lo/aif;Lo/aif$1;)V

    iput-object v0, p0, Lo/aif;->e:Lo/aif$a;

    .line 49
    iget-object v0, p0, Lo/aif;->c:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lo/aif;->f:Landroid/net/wifi/WifiManager;

    .line 50
    iget-object v0, p0, Lo/aif;->d:[I

    invoke-static {v0}, Lo/aii;->c([I)[[I

    move-result-object v0

    iput-object v0, p0, Lo/aif;->b:[[I

    .line 51
    return-void
.end method

.method static synthetic a(Lo/aif;)Lo/aif$a;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aif;->e:Lo/aif$a;

    return-object v0
.end method

.method static synthetic b(Lo/aif;)Lo/ajm;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aif;->a:Lo/ajm;

    return-object v0
.end method

.method private b()V
    .locals 9

    .line 229
    iget-object v0, p0, Lo/aif;->b:[[I

    array-length v0, v0

    if-lez v0, :cond_0

    .line 230
    iget-object v0, p0, Lo/aif;->b:[[I

    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, p0, Lo/aif;->h:[I

    .line 233
    :cond_0
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/aif;->b:[[I

    array-length v0, v0

    if-ge v4, v0, :cond_2

    .line 234
    iget-object v0, p0, Lo/aif;->b:[[I

    aget-object v0, v0, v4

    invoke-static {v0}, Lo/ajw;->c([I)[B

    move-result-object v5

    .line 235
    new-instance v6, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v6, v5, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 236
    invoke-static {v6}, Lo/aii;->b(Ljava/lang/String;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v7

    .line 237
    iget-object v0, p0, Lo/aif;->f:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0, v7}, Landroid/net/wifi/WifiManager;->addNetwork(Landroid/net/wifi/WifiConfiguration;)I

    move-result v8

    .line 238
    iget-object v0, p0, Lo/aif;->h:[I

    aput v8, v0, v4

    .line 239
    iget-object v0, p0, Lo/aif;->f:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->saveConfiguration()Z

    .line 240
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addNetwork "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 241
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiddenSSID ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aif;->f:Landroid/net/wifi/WifiManager;

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/wifi/WifiInfo;->getHiddenSSID()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 242
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    .line 243
    iget-object v0, p0, Lo/aif;->f:Landroid/net/wifi/WifiManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v8, v1}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    .line 233
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 246
    :cond_2
    return-void
.end method

.method static synthetic c(Lo/aif;)[I
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aif;->h:[I

    return-object v0
.end method

.method static synthetic d(Lo/aif;)Landroid/os/Handler;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aif;->k:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lo/aif;)[I
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aif;->d:[I

    return-object v0
.end method

.method static synthetic g(Lo/aif;)Landroid/net/wifi/WifiManager;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aif;->f:Landroid/net/wifi/WifiManager;

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 75
    iget-object v0, p0, Lo/aif;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/aii;->b(Landroid/content/Context;)Z

    .line 77
    iget-object v0, p0, Lo/aif;->e:Lo/aif$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 78
    iget-object v0, p0, Lo/aif;->e:Lo/aif$a;

    invoke-virtual {v0}, Lo/aif$a;->b()V

    .line 81
    :cond_0
    iget-object v0, p0, Lo/aif;->k:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 82
    iget-object v0, p0, Lo/aif;->k:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 83
    iget-object v0, p0, Lo/aif;->k:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 84
    iget-object v0, p0, Lo/aif;->k:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 85
    return-void
.end method

.method public d()V
    .locals 4

    .line 55
    iget-object v0, p0, Lo/aif;->k:Landroid/os/Handler;

    const/4 v1, 0x4

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 56
    iget-object v0, p0, Lo/aif;->k:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/32 v2, 0x15f90

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 58
    invoke-direct {p0}, Lo/aif;->b()V

    .line 59
    iget-object v0, p0, Lo/aif;->k:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 60
    iget-object v0, p0, Lo/aif;->e:Lo/aif$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 61
    iget-object v0, p0, Lo/aif;->e:Lo/aif$a;

    invoke-virtual {v0}, Lo/aif$a;->a()V

    .line 63
    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    .line 68
    iget-object v0, p0, Lo/aif;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/aii;->b(Landroid/content/Context;)Z

    .line 69
    iget-object v0, p0, Lo/aif;->k:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 71
    return-void
.end method
