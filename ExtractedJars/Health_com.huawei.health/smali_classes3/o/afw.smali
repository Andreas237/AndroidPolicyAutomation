.class public abstract Lo/afw;
.super Lo/afv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/afw$d;
    }
.end annotation


# instance fields
.field protected a:Lo/acj;

.field private b:Landroid/bluetooth/BluetoothHealth;

.field private c:I

.field protected d:Lo/abx;

.field private e:Landroid/bluetooth/BluetoothHealthAppConfiguration;

.field private final g:Landroid/bluetooth/BluetoothProfile$ServiceListener;

.field private final i:Landroid/bluetooth/BluetoothHealthCallback;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Lo/afv;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afw;->a:Lo/acj;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afw;->b:Landroid/bluetooth/BluetoothHealth;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afw;->e:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lo/afw;->c:I

    .line 115
    new-instance v0, Lo/afw$2;

    invoke-direct {v0, p0}, Lo/afw$2;-><init>(Lo/afw;)V

    iput-object v0, p0, Lo/afw;->i:Landroid/bluetooth/BluetoothHealthCallback;

    .line 142
    new-instance v0, Lo/afw$1;

    invoke-direct {v0, p0}, Lo/afw$1;-><init>(Lo/afw;)V

    iput-object v0, p0, Lo/afw;->g:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    return-void
.end method

.method static synthetic b(Lo/afw;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/afw;->c:I

    return p1
.end method

.method static synthetic b(Lo/afw;Landroid/bluetooth/BluetoothHealth;)Landroid/bluetooth/BluetoothHealth;
    .locals 0

    .line 23
    iput-object p1, p0, Lo/afw;->b:Landroid/bluetooth/BluetoothHealth;

    return-object p1
.end method

.method static synthetic b(Lo/afw;)Landroid/bluetooth/BluetoothHealthAppConfiguration;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/afw;->e:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    return-object v0
.end method

.method static synthetic b(Lo/afw;Landroid/bluetooth/BluetoothHealthAppConfiguration;)Landroid/bluetooth/BluetoothHealthAppConfiguration;
    .locals 0

    .line 23
    iput-object p1, p0, Lo/afw;->e:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    return-object p1
.end method

.method static synthetic d(Lo/afw;)Landroid/bluetooth/BluetoothHealth;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/afw;->b:Landroid/bluetooth/BluetoothHealth;

    return-object v0
.end method

.method static synthetic e(Lo/afw;)Landroid/bluetooth/BluetoothHealthCallback;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/afw;->i:Landroid/bluetooth/BluetoothHealthCallback;

    return-object v0
.end method


# virtual methods
.method protected abstract a()I
.end method

.method protected abstract a(IILandroid/os/ParcelFileDescriptor;I)V
.end method

.method public a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    .locals 5

    .line 33
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 34
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 37
    :cond_1
    move-object v0, p1

    check-cast v0, Lo/acj;

    iput-object v0, p0, Lo/afw;->a:Lo/acj;

    .line 38
    iput-object p2, p0, Lo/afw;->d:Lo/abx;

    .line 40
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/afw;->g:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    .line 45
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    goto :goto_0

    .line 46
    :catch_0
    move-exception v4

    .line 47
    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public b()Z
    .locals 3

    .line 58
    iget-object v0, p0, Lo/afw;->b:Landroid/bluetooth/BluetoothHealth;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/afw;->e:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lo/afw;->b:Landroid/bluetooth/BluetoothHealth;

    iget-object v1, p0, Lo/afw;->a:Lo/acj;

    invoke-virtual {v1}, Lo/acj;->d()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    iget-object v2, p0, Lo/afw;->e:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    invoke-virtual {v0, v1, v2}, Landroid/bluetooth/BluetoothHealth;->connectChannelToSource(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothHealthAppConfiguration;)Z

    move-result v0

    return v0

    .line 63
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 1

    .line 80
    invoke-virtual {p0}, Lo/afw;->e()V

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afw;->a:Lo/acj;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afw;->b:Landroid/bluetooth/BluetoothHealth;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afw;->e:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    .line 85
    return-void
.end method

.method public e()V
    .locals 4

    .line 71
    iget-object v0, p0, Lo/afw;->a:Lo/acj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/afw;->b:Landroid/bluetooth/BluetoothHealth;

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lo/afw;->b:Landroid/bluetooth/BluetoothHealth;

    iget-object v1, p0, Lo/afw;->a:Lo/acj;

    invoke-virtual {v1}, Lo/acj;->d()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    iget-object v2, p0, Lo/afw;->e:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    iget v3, p0, Lo/afw;->c:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothHealth;->disconnectChannel(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothHealthAppConfiguration;I)Z

    .line 73
    iget-object v0, p0, Lo/afw;->b:Landroid/bluetooth/BluetoothHealth;

    iget-object v1, p0, Lo/afw;->e:Landroid/bluetooth/BluetoothHealthAppConfiguration;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothHealth;->unregisterAppConfiguration(Landroid/bluetooth/BluetoothHealthAppConfiguration;)Z

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afw;->b:Landroid/bluetooth/BluetoothHealth;

    .line 76
    :cond_0
    return-void
.end method
