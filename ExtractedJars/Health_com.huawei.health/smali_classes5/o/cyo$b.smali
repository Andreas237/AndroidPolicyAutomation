.class Lo/cyo$b;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/bluetooth/BluetoothSocket;

.field private d:Ljava/lang/String;

.field final synthetic e:Lo/cyo;


# direct methods
.method private constructor <init>(Lo/cyo;Landroid/bluetooth/BluetoothDevice;)V
    .locals 10

    .line 214
    iput-object p1, p0, Lo/cyo$b;->e:Lo/cyo;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 212
    const-string v0, "Secure"

    iput-object v0, p0, Lo/cyo$b;->d:Ljava/lang/String;

    .line 215
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter ConnectThread."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 218
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "ConnectThread: device parameter is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 219
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyo$b;->a:Landroid/bluetooth/BluetoothSocket;

    .line 220
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/cyo;->a(Lo/cyo;Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothDevice;

    .line 221
    return-void

    .line 225
    :cond_0
    const/4 v6, 0x0

    .line 226
    const/4 v7, 0x0

    .line 228
    invoke-static {p1, p2}, Lo/cyo;->a(Lo/cyo;Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothDevice;

    .line 229
    invoke-static {p1}, Lo/cyo;->c(Lo/cyo;)Lo/cxk;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/cxk;->d(Landroid/bluetooth/BluetoothDevice;)I

    move-result v8

    .line 230
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device product type = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 233
    const/4 v0, -0x1

    if-ne v0, v8, :cond_1

    .line 234
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lo/cyo;->a(Lo/cyo;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    .line 235
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device name is null so use mProductType with value = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Lo/cyo;->a(Lo/cyo;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 236
    invoke-static {p1}, Lo/cyo;->a(Lo/cyo;)I

    move-result v8

    .line 242
    :cond_1
    sparse-switch v8, :sswitch_data_0

    goto :goto_0

    .line 244
    :sswitch_0
    const-string v0, "82ff3820-8411-400c-b85a-55bdb32cf057"

    :try_start_0
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v6

    .line 245
    goto :goto_1

    .line 247
    :sswitch_1
    const-string v0, "82ff3820-8411-400c-b85a-55bdb32cf060"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v6

    .line 248
    goto :goto_1

    .line 250
    :goto_0
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not find suitable UUID info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 251
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v9

    .line 252
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 253
    invoke-virtual {v9}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v9

    .line 254
    const-string v0, "HUAWEI"

    invoke-virtual {v9, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 256
    const-string v0, "82ff3820-8411-400c-b85a-55bdb32cf060"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v6

    .line 263
    :cond_2
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 264
    invoke-virtual {p2, v6}, Landroid/bluetooth/BluetoothDevice;->createRfcommSocketToServiceRecord(Ljava/util/UUID;)Landroid/bluetooth/BluetoothSocket;

    move-result-object v0

    move-object v7, v0

    goto :goto_2

    .line 266
    :cond_3
    const-string v0, "0xA0200000"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mSecureSocketUUID is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 271
    :goto_2
    goto :goto_3

    .line 269
    :catch_0
    move-exception v9

    .line 270
    const-string v0, "0xA0200000"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "create socket exception with info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 273
    :goto_3
    iput-object v7, p0, Lo/cyo$b;->a:Landroid/bluetooth/BluetoothSocket;

    .line 274
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x7 -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lo/cyo;Landroid/bluetooth/BluetoothDevice;Lo/cyo$3;)V
    .locals 0

    .line 208
    invoke-direct {p0, p1, p2}, Lo/cyo$b;-><init>(Lo/cyo;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 7

    .line 334
    :try_start_0
    iget-object v0, p0, Lo/cyo$b;->a:Landroid/bluetooth/BluetoothSocket;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 335
    iget-object v0, p0, Lo/cyo$b;->a:Landroid/bluetooth/BluetoothSocket;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothSocket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 340
    :cond_0
    goto :goto_0

    .line 338
    :catch_0
    move-exception v6

    .line 339
    const-string v0, "0xA0200000"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Close socket exception with info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 341
    :goto_0
    return-void
.end method

.method public run()V
    .locals 8

    .line 277
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectThread"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cyo$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cyo$b;->setName(Ljava/lang/String;)V

    .line 280
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 281
    iget-object v0, p0, Lo/cyo$b;->e:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->e(Lo/cyo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    const-wide/16 v0, 0x3e8

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 286
    :cond_0
    goto :goto_0

    .line 284
    :catch_0
    move-exception v6

    .line 285
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "InterruptedException = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v6}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 289
    :goto_0
    iget-object v0, p0, Lo/cyo$b;->e:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->c(Lo/cyo;)Lo/cxk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cxk;->f()V

    .line 292
    iget-object v0, p0, Lo/cyo$b;->a:Landroid/bluetooth/BluetoothSocket;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 293
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mBTSocket is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 294
    iget-object v0, p0, Lo/cyo$b;->e:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->d(Lo/cyo;)V

    .line 295
    return-void

    .line 300
    :cond_1
    :try_start_1
    iget-object v0, p0, Lo/cyo$b;->a:Landroid/bluetooth/BluetoothSocket;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothSocket;->connect()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_3

    .line 325
    goto/16 :goto_3

    .line 302
    :catch_1
    move-exception v6

    .line 304
    const-string v0, "0xA0200000"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    :try_start_2
    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mBTSocket connect IOException1 with info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 305
    iget-object v0, p0, Lo/cyo$b;->a:Landroid/bluetooth/BluetoothSocket;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothSocket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 309
    goto :goto_1

    .line 307
    :catch_2
    move-exception v7

    .line 308
    const-string v0, "0xA0200000"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mBTSocket connect IOException2 with info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :goto_1
    iget-object v0, p0, Lo/cyo$b;->e:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->d(Lo/cyo;)V

    .line 312
    return-void

    .line 314
    :catch_3
    move-exception v6

    .line 316
    const-string v0, "0xA0200000"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    :try_start_3
    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mBTSocket connect NullPointerException1 with info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v6}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 317
    iget-object v0, p0, Lo/cyo$b;->a:Landroid/bluetooth/BluetoothSocket;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothSocket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 321
    goto :goto_2

    .line 319
    :catch_4
    move-exception v7

    .line 320
    const-string v0, "0xA0200000"

    const-string v1, "01"

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mBTSocket connect IOException with info = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v6}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 323
    :goto_2
    iget-object v0, p0, Lo/cyo$b;->e:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->d(Lo/cyo;)V

    .line 324
    return-void

    .line 328
    :goto_3
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start DataTransferThread."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 329
    iget-object v0, p0, Lo/cyo$b;->e:Lo/cyo;

    iget-object v1, p0, Lo/cyo$b;->a:Landroid/bluetooth/BluetoothSocket;

    invoke-static {v0, v1}, Lo/cyo;->c(Lo/cyo;Landroid/bluetooth/BluetoothSocket;)V

    .line 330
    return-void
.end method
