.class public Lo/ael;
.super Lo/afu;
.source "SourceFile"


# instance fields
.field private a:Lo/abx;

.field private c:Landroid/bluetooth/BluetoothGatt;

.field private d:Lo/acl;

.field private e:Landroid/bluetooth/BluetoothGattService;

.field private f:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private g:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/afz;>;"
        }
    .end annotation
.end field

.field private i:F

.field private k:I

.field private l:Z

.field private m:I

.field private n:Landroid/bluetooth/BluetoothGattCallback;

.field private p:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Lo/afu;-><init>()V

    .line 59
    const/high16 v0, 0x432d0000    # 173.0f

    iput v0, p0, Lo/ael;->i:F

    .line 60
    const/16 v0, 0x1d

    iput v0, p0, Lo/ael;->k:I

    .line 61
    const/4 v0, 0x1

    iput v0, p0, Lo/ael;->m:I

    .line 63
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ael;->p:Z

    .line 64
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ael;->l:Z

    .line 169
    new-instance v0, Lo/ael$1;

    invoke-direct {v0, p0}, Lo/ael$1;-><init>(Lo/ael;)V

    iput-object v0, p0, Lo/ael;->n:Landroid/bluetooth/BluetoothGattCallback;

    return-void
.end method

.method static synthetic a(Lo/ael;)I
    .locals 1

    .line 40
    iget v0, p0, Lo/ael;->m:I

    return v0
.end method

.method static synthetic a(Lo/ael;Lo/fkd;)Lo/agg;
    .locals 1

    .line 40
    invoke-direct {p0, p1}, Lo/ael;->c(Lo/fkd;)Lo/agg;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/ael;I)I
    .locals 0

    .line 40
    iput p1, p0, Lo/ael;->k:I

    return p1
.end method

.method static synthetic b(Lo/ael;)Lo/abx;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ael;->a:Lo/abx;

    return-object v0
.end method

.method static synthetic b(Lo/ael;Z)Z
    .locals 0

    .line 40
    iput-boolean p1, p0, Lo/ael;->p:Z

    return p1
.end method

.method static synthetic c(Lo/ael;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ael;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-object v0
.end method

.method private c(Lo/fkd;)Lo/agg;
    .locals 3

    .line 309
    new-instance v2, Lo/agg;

    invoke-direct {v2}, Lo/agg;-><init>()V

    .line 310
    invoke-virtual {p1}, Lo/fkd;->e()F

    move-result v0

    invoke-virtual {v2, v0}, Lo/agg;->e(F)V

    .line 311
    invoke-virtual {p1}, Lo/fkd;->c()F

    move-result v0

    invoke-virtual {v2, v0}, Lo/agg;->b(F)V

    .line 312
    invoke-virtual {p1}, Lo/fkd;->d()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/agg;->e(J)V

    .line 313
    invoke-virtual {p1}, Lo/fkd;->d()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/agg;->d(J)V

    .line 314
    return-object v2
.end method

.method static synthetic d(Lo/ael;)F
    .locals 1

    .line 40
    iget v0, p0, Lo/ael;->i:F

    return v0
.end method

.method static synthetic d(Lo/ael;F)F
    .locals 0

    .line 40
    iput p1, p0, Lo/ael;->i:F

    return p1
.end method

.method static synthetic d(Lo/ael;Lo/fkd;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lo/ael;->e(Lo/fkd;)V

    return-void
.end method

.method static synthetic d(Lo/ael;Z)Z
    .locals 0

    .line 40
    iput-boolean p1, p0, Lo/ael;->l:Z

    return p1
.end method

.method static synthetic e(Lo/ael;I)I
    .locals 0

    .line 40
    iput p1, p0, Lo/ael;->m:I

    return p1
.end method

.method static synthetic e(Lo/ael;)Lo/acl;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ael;->d:Lo/acl;

    return-object v0
.end method

.method private e(Lo/fkd;)V
    .locals 7

    .line 296
    const/4 v4, 0x0

    .line 297
    iget-object v0, p0, Lo/ael;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/afz;

    .line 298
    invoke-virtual {p1}, Lo/fkd;->d()J

    move-result-wide v0

    invoke-virtual {v6}, Lo/afz;->h()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 299
    const/4 v4, 0x1

    .line 300
    goto :goto_0

    .line 302
    :cond_0
    goto :goto_0

    .line 303
    :cond_1
    if-nez v4, :cond_2

    .line 304
    iget-object v0, p0, Lo/ael;->h:Ljava/util/List;

    invoke-direct {p0, p1}, Lo/ael;->c(Lo/fkd;)Lo/agg;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 306
    :cond_2
    return-void
.end method

.method static synthetic f(Lo/ael;)Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lo/ael;->l:Z

    return v0
.end method

.method static synthetic g(Lo/ael;)Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lo/ael;->p:Z

    return v0
.end method

.method static synthetic h(Lo/ael;)I
    .locals 1

    .line 40
    iget v0, p0, Lo/ael;->k:I

    return v0
.end method

.method static synthetic i(Lo/ael;)Lo/acg;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ael;->b:Lo/acg;

    return-object v0
.end method

.method static synthetic k(Lo/ael;)Ljava/util/List;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ael;->h:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGatt;)V
    .locals 5

    .line 318
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PicoocMeasureController initService, service = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ael;->e:Landroid/bluetooth/BluetoothGattService;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    iput-object p1, p0, Lo/ael;->c:Landroid/bluetooth/BluetoothGatt;

    .line 321
    iget-object v0, p0, Lo/ael;->e:Landroid/bluetooth/BluetoothGattService;

    if-eqz v0, :cond_0

    .line 322
    return-void

    .line 325
    :cond_0
    iget-object v0, p0, Lo/ael;->c:Landroid/bluetooth/BluetoothGatt;

    const-string v1, "0000fff0-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    iput-object v0, p0, Lo/ael;->e:Landroid/bluetooth/BluetoothGattService;

    .line 327
    iget-object v0, p0, Lo/ael;->e:Landroid/bluetooth/BluetoothGattService;

    if-eqz v0, :cond_1

    .line 328
    iget-object v0, p0, Lo/ael;->e:Landroid/bluetooth/BluetoothGattService;

    const-string v1, "0000fff1-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    iput-object v0, p0, Lo/ael;->f:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 329
    iget-object v0, p0, Lo/ael;->e:Landroid/bluetooth/BluetoothGattService;

    const-string v1, "0000fff2-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    iput-object v0, p0, Lo/ael;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 330
    iget-object v0, p0, Lo/ael;->c:Landroid/bluetooth/BluetoothGatt;

    iget-object v1, p0, Lo/ael;->f:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 332
    iget-object v0, p0, Lo/ael;->f:Landroid/bluetooth/BluetoothGattCharacteristic;

    const-string v1, "00002902-0000-1000-8000-00805f9b34fb"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v4

    .line 333
    if-eqz v4, :cond_1

    .line 334
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_INDICATION_VALUE:[B

    invoke-virtual {v4, v0}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 335
    iget-object v0, p0, Lo/ael;->c:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, v4}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    .line 338
    :cond_1
    return-void
.end method

.method public a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    .locals 4

    .line 118
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController prepare"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/ael$2;

    invoke-direct {v1, p0}, Lo/ael$2;-><init>(Lo/ael;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 149
    iput-object p1, p0, Lo/ael;->d:Lo/acl;

    .line 150
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ael;->h:Ljava/util/List;

    .line 151
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ael;->p:Z

    .line 152
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ael;->l:Z

    .line 153
    invoke-super {p0, p1, p2, p3}, Lo/afu;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    iput-object p2, p0, Lo/ael;->a:Lo/abx;

    .line 156
    if-eqz p3, :cond_0

    .line 157
    const-string v0, "height"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/ael;->i:F

    .line 158
    const-string v0, "sex"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/ael;->m:I

    .line 159
    const-string v0, "age"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/ael;->k:I

    goto :goto_0

    .line 162
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController args is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 166
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    .line 78
    const/4 v0, 0x1

    return v0
.end method

.method protected c()Landroid/bluetooth/BluetoothGattCallback;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/ael;->n:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method public d()V
    .locals 4

    .line 86
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController cleanup"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lo/ael;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lo/ael;->c:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 90
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ael;->c:Landroid/bluetooth/BluetoothGatt;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ael;->e:Landroid/bluetooth/BluetoothGattService;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ael;->g:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ael;->f:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ael;->a:Lo/abx;

    .line 95
    return-void
.end method

.method public e()V
    .locals 4

    .line 102
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController ending"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lo/ael;->c:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lo/ael;->c:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 107
    :cond_0
    return-void
.end method
