.class public Lo/cyj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cyj$e;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:Z

.field private F:Z

.field private G:Lo/cxk;

.field private H:Z

.field private I:Lo/cyk;

.field private J:Landroid/os/Handler;

.field private K:Z

.field private L:Z

.field private M:Landroid/os/HandlerThread;

.field private N:I

.field private O:Z

.field private P:Z

.field private Q:I

.field private R:Z

.field private S:I

.field private T:Z

.field private U:Lo/cye;

.field private V:Z

.field private final W:Ljava/lang/Object;

.field private X:Ljava/util/concurrent/ExecutorService;

.field private final Y:Landroid/content/BroadcastReceiver;

.field public a:Lo/cxx;

.field private aa:Landroid/content/ServiceConnection;

.field private ab:Z

.field private ac:Z

.field public final b:Ljava/lang/Object;

.field private c:Landroid/content/Context;

.field private d:I

.field public final e:Ljava/lang/Object;

.field private f:I

.field private g:I

.field private h:Landroid/bluetooth/BluetoothDevice;

.field private i:Lo/cxx;

.field private j:I

.field private k:Lo/cyn;

.field private l:I

.field private m:I

.field private n:I

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Lo/cyh;

.field private s:Ljava/lang/String;

.field private t:Lo/cyv;

.field private u:I

.field private v:Z

.field private w:I

.field private x:I

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cye;>;"
        }
    .end annotation
.end field

.field private z:Lo/cye;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILandroid/bluetooth/BluetoothDevice;Lo/cxx;I)V
    .locals 6

    .line 272
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    .line 85
    const/4 v0, -0x1

    iput v0, p0, Lo/cyj;->d:I

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    .line 89
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyj;->k:Lo/cyn;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyj;->i:Lo/cxx;

    .line 93
    const/4 v0, -0x1

    iput v0, p0, Lo/cyj;->g:I

    .line 95
    const/4 v0, -0x1

    iput v0, p0, Lo/cyj;->f:I

    .line 97
    const/4 v0, -0x1

    iput v0, p0, Lo/cyj;->l:I

    .line 99
    const/4 v0, -0x1

    iput v0, p0, Lo/cyj;->m:I

    .line 101
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->n:I

    .line 103
    const-string v0, ""

    iput-object v0, p0, Lo/cyj;->p:Ljava/lang/String;

    .line 105
    const-string v0, ""

    iput-object v0, p0, Lo/cyj;->o:Ljava/lang/String;

    .line 109
    const-string v0, "0110"

    iput-object v0, p0, Lo/cyj;->s:Ljava/lang/String;

    .line 111
    const-string v0, "0100"

    iput-object v0, p0, Lo/cyj;->q:Ljava/lang/String;

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyj;->t:Lo/cyv;

    .line 127
    new-instance v0, Lo/cyh;

    invoke-direct {v0}, Lo/cyh;-><init>()V

    iput-object v0, p0, Lo/cyj;->r:Lo/cyh;

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->u:I

    .line 141
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->x:I

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cyj;->y:Ljava/util/List;

    .line 145
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->v:Z

    .line 147
    new-instance v0, Lo/cye;

    invoke-direct {v0}, Lo/cye;-><init>()V

    iput-object v0, p0, Lo/cyj;->z:Lo/cye;

    .line 151
    const/4 v0, -0x1

    iput v0, p0, Lo/cyj;->w:I

    .line 153
    const/4 v0, -0x1

    iput v0, p0, Lo/cyj;->D:I

    .line 155
    const/4 v0, -0x1

    iput v0, p0, Lo/cyj;->j:I

    .line 157
    const/4 v0, -0x1

    iput v0, p0, Lo/cyj;->C:I

    .line 159
    const/4 v0, -0x1

    iput v0, p0, Lo/cyj;->B:I

    .line 161
    const/4 v0, -0x1

    iput v0, p0, Lo/cyj;->A:I

    .line 165
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cyj;->e:Ljava/lang/Object;

    .line 167
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cyj;->b:Ljava/lang/Object;

    .line 169
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->F:Z

    .line 171
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->E:Z

    .line 173
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->H:Z

    .line 175
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    iput-object v0, p0, Lo/cyj;->G:Lo/cxk;

    .line 179
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 181
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->L:Z

    .line 183
    const/4 v0, 0x1

    iput v0, p0, Lo/cyj;->N:I

    .line 185
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyj;->M:Landroid/os/HandlerThread;

    .line 187
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyj;->J:Landroid/os/Handler;

    .line 204
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->S:I

    .line 206
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->Q:I

    .line 208
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->P:Z

    .line 240
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyj;->O:Z

    .line 244
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyj;->R:Z

    .line 248
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->V:Z

    .line 250
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyj;->T:Z

    .line 258
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/cyj;->X:Ljava/util/concurrent/ExecutorService;

    .line 260
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cyj;->W:Ljava/lang/Object;

    .line 264
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->ab:Z

    .line 305
    new-instance v0, Lo/cyj$3;

    invoke-direct {v0, p0}, Lo/cyj$3;-><init>(Lo/cyj;)V

    iput-object v0, p0, Lo/cyj;->Y:Landroid/content/BroadcastReceiver;

    .line 1165
    new-instance v0, Lo/cyj$1;

    invoke-direct {v0, p0}, Lo/cyj$1;-><init>(Lo/cyj;)V

    iput-object v0, p0, Lo/cyj;->a:Lo/cxx;

    .line 2610
    new-instance v0, Lo/cyj$5;

    invoke-direct {v0, p0}, Lo/cyj$5;-><init>(Lo/cyj;)V

    iput-object v0, p0, Lo/cyj;->aa:Landroid/content/ServiceConnection;

    .line 273
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter BTDeviceSendCommandUtil()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 274
    iput-object p4, p0, Lo/cyj;->i:Lo/cxx;

    .line 276
    iput p2, p0, Lo/cyj;->d:I

    .line 278
    iput-object p3, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    .line 280
    iput-object p1, p0, Lo/cyj;->c:Landroid/content/Context;

    .line 282
    iget-object v0, p0, Lo/cyj;->a:Lo/cxx;

    invoke-direct {p0, p3, v0, p5}, Lo/cyj;->d(Landroid/bluetooth/BluetoothDevice;Lo/cxx;I)Lo/cyn;

    move-result-object v0

    iput-object v0, p0, Lo/cyj;->k:Lo/cyn;

    .line 283
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 284
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "initBTDeviceService with return null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 286
    :cond_0
    invoke-direct {p0}, Lo/cyj;->l()V

    .line 288
    invoke-direct {p0, p3, p5}, Lo/cyj;->a(Landroid/bluetooth/BluetoothDevice;I)V

    .line 290
    invoke-direct {p0}, Lo/cyj;->p()V

    .line 291
    return-void
.end method

.method static synthetic B(Lo/cyj;)Lo/cye;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->z:Lo/cye;

    return-object v0
.end method

.method static synthetic D(Lo/cyj;)I
    .locals 1

    .line 79
    iget v0, p0, Lo/cyj;->Q:I

    return v0
.end method

.method static synthetic a(Lo/cyj;I)I
    .locals 0

    .line 79
    iput p1, p0, Lo/cyj;->g:I

    return p1
.end method

.method static synthetic a(Lo/cyj;)Landroid/bluetooth/BluetoothDevice;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method private a(I[B)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B)Ljava/util/ArrayList<[B>;"
        }
    .end annotation

    .line 2053
    if-lez p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 2054
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "wrapOTAFilePackets error, dataContent is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2055
    const/4 v0, 0x0

    return-object v0

    .line 2060
    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2062
    array-length v0, p2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 2064
    invoke-virtual {v7, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 2066
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 2068
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2070
    return-object v6
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 6

    .line 387
    iget v0, p0, Lo/cyj;->d:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 388
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter initBTDeviceLinkLayerBaseInfo() with BT_AW."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 389
    const v0, 0xffff

    iput v0, p0, Lo/cyj;->f:I

    .line 390
    const v0, 0xffff

    iput v0, p0, Lo/cyj;->l:I

    .line 392
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->m:I

    .line 394
    const/4 v0, 0x2

    iput v0, p0, Lo/cyj;->g:I

    .line 395
    iget-object v0, p0, Lo/cyj;->t:Lo/cyv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 396
    new-instance v0, Lo/cyu;

    iget-object v1, p0, Lo/cyj;->c:Landroid/content/Context;

    iget v2, p0, Lo/cyj;->f:I

    invoke-direct {v0, v1, v2}, Lo/cyu;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lo/cyj;->t:Lo/cyv;

    goto/16 :goto_3

    .line 399
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter initBTDeviceLinkLayerBaseInfo() with not BT_AW."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 400
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 402
    iget-object v0, p0, Lo/cyj;->G:Lo/cxk;

    invoke-virtual {v0, p1}, Lo/cxk;->d(Landroid/bluetooth/BluetoothDevice;)I

    move-result v5

    .line 403
    const/4 v0, -0x1

    if-ne v0, v5, :cond_1

    .line 404
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    .line 405
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Use the product Type."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 406
    move v5, p2

    .line 410
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device product type = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 411
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    .line 413
    :sswitch_0
    const/4 v0, 0x1

    iput v0, p0, Lo/cyj;->g:I

    .line 414
    const/16 v0, 0x14

    iput v0, p0, Lo/cyj;->f:I

    .line 415
    const/16 v0, 0x14

    iput v0, p0, Lo/cyj;->l:I

    .line 417
    const/16 v0, 0xa

    iput v0, p0, Lo/cyj;->m:I

    .line 418
    goto :goto_1

    .line 420
    :sswitch_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->g:I

    .line 421
    const/16 v0, 0x80

    iput v0, p0, Lo/cyj;->f:I

    .line 422
    const/16 v0, 0x80

    iput v0, p0, Lo/cyj;->l:I

    .line 424
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->m:I

    .line 425
    goto :goto_1

    .line 427
    :sswitch_2
    const/4 v0, 0x1

    iput v0, p0, Lo/cyj;->g:I

    .line 428
    const/16 v0, 0x80

    iput v0, p0, Lo/cyj;->f:I

    .line 429
    const/16 v0, 0x80

    iput v0, p0, Lo/cyj;->l:I

    .line 431
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->m:I

    .line 432
    goto :goto_1

    .line 434
    :goto_0
    const/4 v0, 0x2

    iput v0, p0, Lo/cyj;->g:I

    .line 435
    const/16 v0, 0xff

    iput v0, p0, Lo/cyj;->f:I

    .line 436
    const/16 v0, 0xff

    iput v0, p0, Lo/cyj;->l:I

    .line 437
    const/16 v0, 0xa

    iput v0, p0, Lo/cyj;->m:I

    .line 442
    :goto_1
    iget-object v0, p0, Lo/cyj;->t:Lo/cyv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 443
    iget v0, p0, Lo/cyj;->g:I

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    .line 445
    :sswitch_3
    new-instance v0, Lo/cyr;

    iget-object v1, p0, Lo/cyj;->c:Landroid/content/Context;

    iget v2, p0, Lo/cyj;->f:I

    invoke-direct {v0, v1, v2}, Lo/cyr;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lo/cyj;->t:Lo/cyv;

    .line 446
    goto :goto_2

    .line 448
    :sswitch_4
    new-instance v0, Lo/cyu;

    iget-object v1, p0, Lo/cyj;->c:Landroid/content/Context;

    iget v2, p0, Lo/cyj;->f:I

    invoke-direct {v0, v1, v2}, Lo/cyu;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lo/cyj;->t:Lo/cyv;

    .line 449
    .line 454
    :cond_2
    :goto_2
    goto :goto_3

    .line 455
    :cond_3
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btDevice is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 458
    :cond_4
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_2
        0x5 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x1 -> :sswitch_3
        0x2 -> :sswitch_4
    .end sparse-switch
.end method

.method private a([B)V
    .locals 9

    .line 1126
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter reSend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1127
    iget-object v0, p0, Lo/cyj;->U:Lo/cye;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1128
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mBtDeviceCommand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1129
    return-void

    .line 1131
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    array-length v0, p1

    const/4 v1, 0x4

    if-le v0, v1, :cond_4

    const/4 v0, 0x2

    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_4

    .line 1132
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 1133
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 1134
    new-instance v5, Lo/daz;

    invoke-direct {v5}, Lo/daz;-><init>()V

    .line 1136
    :try_start_0
    invoke-virtual {v5, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 1137
    iget-object v7, v6, Lo/dba;->e:Ljava/util/List;

    .line 1138
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 1139
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/daw;

    .line 1140
    invoke-virtual {v8}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_1

    .line 1141
    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const v1, 0x186ae

    if-ne v1, v0, :cond_2

    .line 1142
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pre resend device command."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1143
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    aget-byte v1, p1, v1

    invoke-direct {p0, v0, v1}, Lo/cyj;->c(II)V

    .line 1144
    iget-object v0, p0, Lo/cyj;->U:Lo/cye;

    invoke-direct {p0, v0}, Lo/cyj;->d(Lo/cye;)Z

    goto :goto_0

    .line 1147
    :cond_1
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong tl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1149
    :cond_2
    :goto_0
    goto :goto_1

    .line 1150
    :cond_3
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong cmd ,no need resend."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 1154
    :goto_1
    goto :goto_2

    .line 1152
    :catch_0
    move-exception v6

    .line 1153
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1155
    :goto_2
    goto :goto_3

    .line 1156
    :cond_4
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no need resend."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1159
    :goto_3
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyj;->U:Lo/cye;

    .line 1160
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 7

    .line 640
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter checkAuthenticBTDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 641
    iget-object v0, p0, Lo/cyj;->p:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    const/16 v1, 0x10

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lo/cyj;->o:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    const/16 v1, 0x10

    if-ne v1, v0, :cond_1

    .line 643
    iget-object v0, p0, Lo/cyj;->s:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/cyj;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 644
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 645
    invoke-virtual {p1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 647
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Authentic codeInfoHex is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 648
    const/4 v0, 0x0

    return v0

    .line 651
    :cond_1
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Authentic Random parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 652
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic a(Lo/cyj;Z)Z
    .locals 0

    .line 79
    iput-boolean p1, p0, Lo/cyj;->v:Z

    return p1
.end method

.method static synthetic b(Lo/cyj;I)I
    .locals 0

    .line 79
    iput p1, p0, Lo/cyj;->B:I

    return p1
.end method

.method static synthetic b(Lo/cyj;)Lo/cxx;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    return-object v0
.end method

.method private b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V
    .locals 9

    .line 970
    :try_start_0
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_17

    const/4 v0, 0x0

    if-eq v0, p1, :cond_17

    const/4 v0, 0x0

    if-eq v0, p3, :cond_17

    .line 971
    iget v0, p0, Lo/cyj;->g:I

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceProtocol(I)V

    .line 972
    iget v0, p0, Lo/cyj;->g:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 973
    iget-boolean v0, p0, Lo/cyj;->K:Z

    if-eqz v0, :cond_0

    .line 974
    invoke-direct {p0, p1, p2, p3}, Lo/cyj;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    goto/16 :goto_5

    .line 977
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "not handshake report data with V2."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 980
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p3, v1}, Lo/cxo;->a(Landroid/content/Context;[BLjava/lang/String;)[B

    move-result-object v6

    .line 981
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 982
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "checkedContent is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 983
    move-object v6, p3

    .line 985
    :cond_1
    invoke-direct {p0, v6}, Lo/cyj;->a([B)V

    .line 988
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    aget-byte v1, p3, v1

    invoke-direct {p0, v0, v1}, Lo/cyj;->c(II)V

    .line 989
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    array-length v1, v6

    invoke-interface {v0, p1, v1, v6}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 991
    invoke-direct {p0, v6}, Lo/cyj;->e([B)V

    .line 992
    goto/16 :goto_5

    .line 993
    :cond_2
    iget v0, p0, Lo/cyj;->g:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_15

    .line 995
    array-length v0, p3

    const/4 v1, 0x3

    if-le v0, v1, :cond_5

    .line 996
    const/4 v0, 0x2

    aget-byte v6, p3, v0

    .line 997
    const/4 v0, 0x0

    if-ne v0, v6, :cond_5

    .line 999
    invoke-static {p3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v7

    .line 1000
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Notification info-------------------"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1001
    move-object v8, p3

    .line 1003
    invoke-direct {p0, p3}, Lo/cyj;->c([B)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1005
    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/4 v1, 0x2

    aget-byte v1, p3, v1

    const/4 v2, 0x3

    aget-byte v2, p3, v2

    invoke-static {v7}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lo/cxr;->a(III[B)[B

    move-result-object v8

    .line 1006
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "after V1--->V2 Notification info----"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v8}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1009
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 1010
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    array-length v1, v8

    invoke-interface {v0, p1, v1, v8}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    goto :goto_0

    .line 1012
    :cond_4
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "notificationData is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1015
    :goto_0
    return-void

    .line 1020
    :cond_5
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    :try_start_1
    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "reportReceivedData, mCommandType = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->N:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1021
    move-object v6, p3

    .line 1022
    iget v0, p0, Lo/cyj;->N:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_8

    .line 1025
    const/4 v0, 0x0

    aget-byte v7, p3, v0

    .line 1026
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "before requestID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1027
    if-gez v7, :cond_6

    .line 1028
    add-int/lit16 v7, v7, 0x100

    .line 1032
    :cond_6
    iget v0, p0, Lo/cyj;->w:I

    if-eq v7, v0, :cond_7

    .line 1033
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "error report data, requestID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " mRequestID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->w:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1034
    return-void

    .line 1038
    :cond_7
    :try_start_2
    iget v0, p0, Lo/cyj;->D:I

    iget v1, p0, Lo/cyj;->j:I

    iget v2, p0, Lo/cyj;->C:I

    invoke-static {v0, v1, v2, p3}, Lo/cxr;->a(III[B)[B

    move-result-object v6

    .line 1039
    goto :goto_1

    :cond_8
    iget v0, p0, Lo/cyj;->N:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_9

    .line 1041
    iget v0, p0, Lo/cyj;->B:I

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v6, v1

    .line 1042
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "reportReceivedData, OTA report business cmd, need add Service id, mServiceID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->B:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 1043
    :cond_9
    iget v0, p0, Lo/cyj;->N:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_a

    .line 1045
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "reportReceivedData, OTA report file data, do nothing..."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1048
    :cond_a
    :goto_1
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "reportReceivedData, receive data finish so need to reset resend timer and unLockBT."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1050
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->Q:I

    .line 1051
    invoke-direct {p0}, Lo/cyj;->t()V

    .line 1053
    const/4 v0, 0x0

    if-ne v0, v6, :cond_b

    .line 1054
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btV2Command is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1055
    return-void

    .line 1058
    :cond_b
    :try_start_3
    iget-boolean v0, p0, Lo/cyj;->K:Z

    if-eqz v0, :cond_11

    .line 1059
    iget v0, p0, Lo/cyj;->d:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_10

    .line 1060
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_d

    const/4 v0, 0x1

    aget-byte v0, v6, v0

    const/16 v1, 0xf

    if-ne v1, v0, :cond_d

    .line 1061
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "receive bond status response."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1062
    iget-object v0, p0, Lo/cyj;->I:Lo/cyk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_14

    .line 1063
    iget-object v0, p0, Lo/cyj;->I:Lo/cyk;

    invoke-virtual {v0, p1, v6}, Lo/cyk;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)Z

    move-result v7

    .line 1064
    if-nez v7, :cond_c

    .line 1065
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "receive bond status incorrect response."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1067
    :cond_c
    goto/16 :goto_3

    .line 1068
    :cond_d
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_f

    const/4 v0, 0x1

    aget-byte v0, v6, v0

    const/16 v1, 0xe

    if-ne v1, v0, :cond_f

    .line 1069
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "receive request bond response."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1070
    iget-object v0, p0, Lo/cyj;->I:Lo/cyk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_14

    .line 1071
    iget-object v0, p0, Lo/cyj;->I:Lo/cyk;

    invoke-virtual {v0, p1, v6}, Lo/cyk;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)Z

    move-result v7

    .line 1072
    if-nez v7, :cond_e

    .line 1073
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "receive pair status incorrect response."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1075
    :cond_e
    goto/16 :goto_3

    .line 1078
    :cond_f
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handshake report data with V1."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1079
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    array-length v1, v6

    invoke-interface {v0, p1, v1, v6}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    goto/16 :goto_3

    .line 1083
    :cond_10
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handshake report data with V1 and not BLE."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1084
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    array-length v1, v6

    invoke-interface {v0, p1, v1, v6}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    goto :goto_3

    .line 1087
    :cond_11
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "not handshake report data with V1."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1089
    iget v0, p0, Lo/cyj;->B:I

    const/4 v1, 0x7

    if-ne v1, v0, :cond_12

    iget v0, p0, Lo/cyj;->A:I

    const/16 v1, 0x9

    if-ne v1, v0, :cond_12

    .line 1090
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Take wanted message so need change command ID for set userInfo."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1091
    const/4 v0, 0x2

    const/4 v1, 0x1

    aput-byte v0, v6, v1

    goto :goto_2

    .line 1092
    :cond_12
    iget v0, p0, Lo/cyj;->B:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_13

    iget v0, p0, Lo/cyj;->A:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_13

    .line 1093
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Take wanted message so need change command ID for send message."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1094
    const/4 v0, 0x1

    const/4 v1, 0x1

    aput-byte v0, v6, v1

    .line 1097
    :cond_13
    :goto_2
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    array-length v1, v6

    invoke-interface {v0, p1, v1, v6}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 1099
    :cond_14
    :goto_3
    goto/16 :goto_5

    :cond_15
    iget v0, p0, Lo/cyj;->g:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_18

    .line 1100
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "receive V0 data info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1102
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->Q:I

    .line 1103
    invoke-direct {p0}, Lo/cyj;->t()V

    .line 1105
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "not handshake report data with V1."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1106
    array-length v6, p3

    .line 1107
    add-int/lit8 v0, v6, 0x2

    new-array v7, v0, [B

    .line 1108
    iget v0, p0, Lo/cyj;->B:I

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v7, v1

    .line 1109
    iget v0, p0, Lo/cyj;->A:I

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, v7, v1

    .line 1110
    const/4 v8, 0x0

    :goto_4
    if-ge v8, v6, :cond_16

    .line 1111
    add-int/lit8 v0, v8, 0x2

    aget-byte v1, p3, v8

    aput-byte v1, v7, v0

    .line 1110
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 1114
    :cond_16
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    array-length v1, v7

    invoke-interface {v0, p1, v1, v7}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 1115
    goto :goto_5

    .line 1117
    :cond_17
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "reportReceivedData: parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_0

    .line 1121
    :cond_18
    :goto_5
    goto :goto_6

    .line 1119
    :catch_0
    move-exception v6

    .line 1120
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ArrayIndexOutOfBoundsException ERROR :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1122
    :goto_6
    return-void
.end method

.method static synthetic b(Lo/cyj;Z)Z
    .locals 0

    .line 79
    iput-boolean p1, p0, Lo/cyj;->V:Z

    return p1
.end method

.method static synthetic b(Lo/cyj;[BI)[B
    .locals 1

    .line 79
    invoke-direct {p0, p1, p2}, Lo/cyj;->d([BI)[B

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/cyj;I)I
    .locals 0

    .line 79
    iput p1, p0, Lo/cyj;->A:I

    return p1
.end method

.method static synthetic c(Lo/cyj;)Ljava/util/List;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->y:Ljava/util/List;

    return-object v0
.end method

.method private c(II)V
    .locals 1

    .line 663
    iget v0, p0, Lo/cyj;->B:I

    if-ne v0, p1, :cond_0

    iget v0, p0, Lo/cyj;->A:I

    if-ne v0, p2, :cond_0

    .line 665
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->Q:I

    .line 666
    invoke-direct {p0}, Lo/cyj;->t()V

    .line 668
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/cyj;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V
    .locals 0

    .line 79
    invoke-direct {p0, p1, p2, p3}, Lo/cyj;->b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    return-void
.end method

.method static synthetic c(Lo/cyj;Z)Z
    .locals 0

    .line 79
    iput-boolean p1, p0, Lo/cyj;->ac:Z

    return p1
.end method

.method private c([B)Z
    .locals 3

    .line 2488
    const/4 v2, 0x1

    .line 2490
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_0

    const/4 v0, 0x2

    aget-byte v0, p1, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x3

    aget-byte v0, p1, v0

    const/16 v1, 0x8

    if-ne v1, v0, :cond_0

    .line 2491
    const/4 v2, 0x0

    .line 2493
    :cond_0
    return v2
.end method

.method static synthetic d(Lo/cyj;I)I
    .locals 0

    .line 79
    iput p1, p0, Lo/cyj;->Q:I

    return p1
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 527
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getAuthenticTokenValue()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 530
    iget-object v0, p0, Lo/cyj;->p:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    const/16 v1, 0x10

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/cyj;->o:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    const/16 v1, 0x10

    if-ne v1, v0, :cond_0

    .line 532
    iget-object v0, p0, Lo/cyj;->p:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v7

    .line 534
    iget-object v0, p0, Lo/cyj;->o:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v8

    .line 536
    const/16 v0, 0x20

    new-array v9, v0, [B

    .line 538
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x10

    invoke-static {v7, v0, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 539
    const/4 v0, 0x0

    const/16 v1, 0x10

    const/16 v2, 0x10

    invoke-static {v8, v0, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 542
    invoke-direct {p0}, Lo/cyj;->o()Ljava/lang/String;

    move-result-object v10

    .line 543
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "old strCak = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v10, v2, v3

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 544
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "after convert old strCak to Hex = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v10}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 548
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to create encode info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 550
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0, v9}, Lo/cxt;->d([B[B)[B

    move-result-object v11

    .line 553
    invoke-static {v11, v9}, Lo/cxt;->d([B[B)[B

    move-result-object v12

    .line 554
    invoke-static {v12}, Lo/czx;->e([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 556
    return-object v6

    .line 557
    :catch_0
    move-exception v11

    .line 558
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HMac256 occur exception with info = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 560
    const/4 v0, 0x0

    return-object v0

    .line 563
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Authentic Random parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 564
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic d(Lo/cyj;)Lo/cxk;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->G:Lo/cxk;

    return-object v0
.end method

.method static synthetic d(Lo/cyj;Lo/cye;)Lo/cye;
    .locals 0

    .line 79
    iput-object p1, p0, Lo/cyj;->U:Lo/cye;

    return-object p1
.end method

.method private d(Landroid/bluetooth/BluetoothDevice;Lo/cxx;I)Lo/cyn;
    .locals 7

    .line 356
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "initBTDeviceService with btType = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->d:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 357
    iget v0, p0, Lo/cyj;->d:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_0

    .line 358
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "initBTDeviceService with btType is unknown"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 359
    const/4 v0, 0x0

    return-object v0

    .line 363
    :cond_0
    const/4 v6, 0x0

    .line 364
    iget v0, p0, Lo/cyj;->d:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 366
    :pswitch_0
    new-instance v6, Lo/cyo;

    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-direct {v6, v0, p1, p2, p3}, Lo/cyo;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lo/cxx;I)V

    .line 367
    goto :goto_0

    .line 369
    :pswitch_1
    new-instance v6, Lo/cyq;

    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-direct {v6, v0, p1, p2}, Lo/cyq;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lo/cxx;)V

    .line 370
    new-instance v0, Lo/cyk;

    iget-object v1, p0, Lo/cyj;->c:Landroid/content/Context;

    iget-object v2, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    iget-object v3, p0, Lo/cyj;->i:Lo/cxx;

    invoke-direct {v0, p0, v1, v2, v3}, Lo/cyk;-><init>(Lo/cyj;Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lo/cxx;)V

    iput-object v0, p0, Lo/cyj;->I:Lo/cyk;

    .line 371
    goto :goto_0

    .line 373
    :pswitch_2
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1, p2}, Lo/cym;->e(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lo/cxx;)Lo/cym;

    move-result-object v6

    .line 374
    .line 379
    :goto_0
    return-object v6

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private d(Lo/cye;)Z
    .locals 14

    .line 1804
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter sendBTDeviceWrapData(). mLinkLayerVersion = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->g:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1805
    invoke-direct {p0}, Lo/cyj;->z()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_1

    .line 1807
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->v:Z

    .line 1808
    iget-boolean v0, p0, Lo/cyj;->K:Z

    if-eqz v0, :cond_0

    .line 1809
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 1810
    invoke-direct {p0}, Lo/cyj;->y()V

    .line 1812
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "base Service connect state is not connected so return."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1813
    const/4 v0, 0x0

    return v0

    .line 1817
    :cond_1
    iget-object v0, p0, Lo/cyj;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1818
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mBTDeviceCommandList size = 0, so cancel send wrap data."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1819
    const/4 v0, 0x0

    return v0

    .line 1822
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1f

    .line 1823
    invoke-virtual {p1}, Lo/cye;->c()[B

    move-result-object v6

    .line 1824
    invoke-virtual {p1}, Lo/cye;->k()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_d

    iget v0, p0, Lo/cyj;->g:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_d

    .line 1826
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1f

    .line 1827
    iget-object v0, p0, Lo/cyj;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1f

    .line 1830
    :try_start_0
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0, v6}, Lo/cyn;->a([B)Z

    .line 1832
    iget-object v7, p0, Lo/cyj;->b:Ljava/lang/Object;

    monitor-enter v7
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1833
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lo/cyj;->E:Z

    .line 1834
    iget-boolean v0, p0, Lo/cyj;->K:Z

    if-eqz v0, :cond_4

    .line 1835
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BTDeviceAWService Enter Lock of sendBTDeviceWrapData Handshake, timeout = 30000"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1836
    const/4 v0, 0x1

    iput v0, p0, Lo/cyj;->S:I

    .line 1838
    invoke-direct {p0}, Lo/cyj;->z()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_3

    .line 1839
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->E:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1840
    monitor-exit v7

    const/4 v0, 0x0

    return v0

    .line 1842
    :cond_3
    :try_start_2
    iget-object v0, p0, Lo/cyj;->b:Ljava/lang/Object;

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V

    goto :goto_0

    .line 1844
    :cond_4
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BTDeviceAWService Enter Lock of sendBTDeviceWrapData, timeout = 10000"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1846
    invoke-direct {p0}, Lo/cyj;->z()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_5

    .line 1847
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->E:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1848
    monitor-exit v7

    const/4 v0, 0x0

    return v0

    .line 1850
    :cond_5
    :try_start_3
    iget-object v0, p0, Lo/cyj;->b:Ljava/lang/Object;

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V

    .line 1852
    :goto_0
    iget-boolean v0, p0, Lo/cyj;->E:Z

    if-eqz v0, :cond_c

    .line 1854
    iget v0, p0, Lo/cyj;->Q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cyj;->Q:I

    .line 1856
    iget v0, p0, Lo/cyj;->S:I

    iget v1, p0, Lo/cyj;->Q:I

    if-ne v0, v1, :cond_b

    .line 1858
    iget-boolean v0, p0, Lo/cyj;->K:Z

    if-eqz v0, :cond_9

    .line 1860
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 1861
    const/4 v8, 0x0

    .line 1862
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1863
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0}, Lo/cyn;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v8

    .line 1866
    :cond_6
    const/4 v0, 0x0

    if-ne v0, v8, :cond_7

    .line 1867
    new-instance v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    .line 1869
    const-string v0, "AndroidWear"

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 1870
    const-string v0, "HUAWEI WATCH"

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 1873
    :cond_7
    const/4 v0, 0x4

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1875
    const/4 v0, 0x4

    iput v0, p0, Lo/cyj;->x:I

    .line 1877
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 1878
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to report aw v1 protocol connect fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1879
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x4

    invoke-interface {v0, v8, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 1881
    :cond_8
    goto :goto_1

    .line 1883
    :cond_9
    invoke-virtual {p1}, Lo/cye;->d()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1884
    invoke-direct {p0}, Lo/cyj;->r()V

    .line 1888
    :cond_a
    :goto_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->v:Z

    .line 1889
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BTDeviceAWService Set Sending flag false for AW timeout."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 1891
    :cond_b
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "BTDeviceAWService Command send timeout but counter not arrived = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->Q:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1894
    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->E:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1896
    :cond_c
    monitor-exit v7

    goto :goto_3

    :catchall_0
    move-exception v9

    monitor-exit v7

    :try_start_4
    throw v9
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 1900
    :goto_3
    goto/16 :goto_e

    .line 1898
    :catch_0
    move-exception v7

    .line 1899
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "InterruptedException is\uff1a"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v7}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1900
    goto/16 :goto_e

    .line 1904
    :cond_d
    iget-object v0, p0, Lo/cyj;->t:Lo/cyv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1e

    .line 1905
    invoke-virtual {p1}, Lo/cye;->a()I

    move-result v7

    .line 1906
    const/4 v8, 0x0

    .line 1908
    invoke-virtual {p1}, Lo/cye;->f()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_e

    .line 1909
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "OTA send bytes of file data."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1910
    invoke-direct {p0, v7, v6}, Lo/cyj;->a(I[B)Ljava/util/ArrayList;

    move-result-object v8

    goto :goto_4

    .line 1912
    :cond_e
    iget-object v0, p0, Lo/cyj;->t:Lo/cyv;

    invoke-virtual {v0, v7, v6}, Lo/cyv;->b(I[B)Ljava/util/ArrayList;

    move-result-object v8

    .line 1915
    :goto_4
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1d

    .line 1917
    new-instance v9, Lo/cyg;

    invoke-virtual {p1}, Lo/cye;->d()Z

    move-result v0

    invoke-direct {v9, v8, v0}, Lo/cyg;-><init>(Ljava/util/ArrayList;Z)V

    .line 1919
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1d

    .line 1921
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->H:Z

    .line 1923
    const/4 v10, 0x0

    :goto_5
    iget-object v0, v9, Lo/cyg;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v10, v0, :cond_1d

    .line 1925
    iget-object v0, v9, Lo/cyg;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, [B

    .line 1927
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendBTDeviceWrapData, i = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", command size = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v9, Lo/cyg;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1928
    iget-object v0, v9, Lo/cyg;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v10, v0, :cond_f

    .line 1929
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyj;->H:Z

    .line 1934
    :cond_f
    :try_start_5
    invoke-virtual {p1}, Lo/cye;->f()I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_1b

    .line 1937
    iget v0, p0, Lo/cyj;->g:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_10

    iget v0, p0, Lo/cyj;->g:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_10

    iget v0, p0, Lo/cyj;->g:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1a

    iget-boolean v0, p0, Lo/cyj;->H:Z

    if-eqz v0, :cond_1a

    .line 1938
    invoke-virtual {p1}, Lo/cye;->d()Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 1939
    :cond_10
    iget-object v0, p0, Lo/cyj;->e:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1c

    .line 1940
    iget-object v12, p0, Lo/cyj;->e:Ljava/lang/Object;

    monitor-enter v12
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_2

    .line 1941
    const/4 v0, 0x1

    :try_start_6
    iput-boolean v0, p0, Lo/cyj;->F:Z

    .line 1943
    invoke-direct {p0, v11}, Lo/cyj;->d([B)Z

    move-result v0

    iput-boolean v0, p0, Lo/cyj;->T:Z

    .line 1944
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendLinkDataCommand result:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, p0, Lo/cyj;->T:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1946
    invoke-virtual {p1}, Lo/cye;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_12

    invoke-virtual {p1}, Lo/cye;->h()I

    move-result v0

    const/16 v1, 0xe

    if-ne v1, v0, :cond_12

    .line 1947
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter Lock of sendBTDeviceWrapData with device pair. timeout = 30000"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1949
    const/4 v0, 0x1

    iput v0, p0, Lo/cyj;->S:I

    .line 1951
    invoke-direct {p0}, Lo/cyj;->z()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_11

    .line 1952
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->F:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 1953
    monitor-exit v12

    const/4 v0, 0x0

    return v0

    .line 1955
    :cond_11
    :try_start_7
    iget-object v0, p0, Lo/cyj;->e:Ljava/lang/Object;

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V

    goto :goto_6

    .line 1957
    :cond_12
    iget v0, p0, Lo/cyj;->d:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_14

    invoke-virtual {p1}, Lo/cye;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_14

    .line 1958
    invoke-virtual {p1}, Lo/cye;->h()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_14

    .line 1960
    const/4 v0, 0x1

    iput v0, p0, Lo/cyj;->S:I

    .line 1961
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BTDeviceAWService Enter Lock of sendBTDeviceWrapData. timeout = 30000"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1963
    invoke-direct {p0}, Lo/cyj;->z()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_13

    .line 1964
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->F:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 1965
    monitor-exit v12

    const/4 v0, 0x0

    return v0

    .line 1967
    :cond_13
    :try_start_8
    iget-object v0, p0, Lo/cyj;->e:Ljava/lang/Object;

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V

    goto :goto_6

    .line 1969
    :cond_14
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter Lock of sendBTDeviceWrapData. timeout = 10000"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1971
    invoke-direct {p0}, Lo/cyj;->z()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_15

    .line 1972
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->F:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 1973
    monitor-exit v12

    const/4 v0, 0x0

    return v0

    .line 1975
    :cond_15
    :try_start_9
    iget-object v0, p0, Lo/cyj;->e:Ljava/lang/Object;

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V

    .line 1979
    :goto_6
    iget-boolean v0, p0, Lo/cyj;->F:Z

    if-eqz v0, :cond_19

    .line 1981
    iget v0, p0, Lo/cyj;->Q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cyj;->Q:I

    .line 1982
    iget v0, p0, Lo/cyj;->S:I

    iget v1, p0, Lo/cyj;->Q:I

    if-ne v0, v1, :cond_18

    .line 1983
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Command send timeout and counter arrived."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1986
    iget-boolean v0, p0, Lo/cyj;->K:Z

    if-eqz v0, :cond_16

    .line 1987
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_17

    .line 1988
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 1989
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " shake failed due to timeout"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1990
    const v0, 0x1eab90

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 1991
    invoke-direct {p0}, Lo/cyj;->y()V

    goto :goto_7

    .line 1995
    :cond_16
    invoke-virtual {p1}, Lo/cye;->d()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 1996
    invoke-direct {p0}, Lo/cyj;->r()V

    .line 2002
    :cond_17
    :goto_7
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->v:Z

    .line 2003
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Set Sending flag false for BT timeout."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_8

    .line 2006
    :cond_18
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Command send timeout but counter not arrived = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->Q:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2009
    :goto_8
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->F:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 2010
    monitor-exit v12

    goto/16 :goto_d

    .line 2012
    :cond_19
    monitor-exit v12

    goto :goto_9

    :catchall_1
    move-exception v13

    monitor-exit v12

    :try_start_a
    throw v13

    :goto_9
    goto/16 :goto_b

    .line 2016
    :cond_1a
    invoke-direct {p0, v11}, Lo/cyj;->d([B)Z

    move-result v0

    iput-boolean v0, p0, Lo/cyj;->T:Z

    .line 2017
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendLinkDataCommand else result:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, p0, Lo/cyj;->T:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_b

    .line 2021
    :cond_1b
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0, v11}, Lo/cyn;->a([B)Z

    move-result v0

    iput-boolean v0, p0, Lo/cyj;->T:Z
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_2

    .line 2023
    :try_start_b
    iget v0, p0, Lo/cyj;->m:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_1

    .line 2026
    goto :goto_a

    .line 2024
    :catch_1
    move-exception v12

    .line 2025
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    :try_start_c
    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Sleep InterruptedException with exception = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v12}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2029
    :goto_a
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->v:Z

    .line 2030
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Set Sending flag false for OTA transfer file..."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_2

    .line 2034
    :cond_1c
    :goto_b
    goto :goto_c

    .line 2032
    :catch_2
    move-exception v12

    .line 2033
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "InterruptedException is\uff1a"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v12}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1923
    :goto_c
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_5

    .line 2038
    :cond_1d
    :goto_d
    goto :goto_e

    .line 2039
    :cond_1e
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "disconnectBTDevice: mBTDeviceServiceBase is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2043
    :cond_1f
    :goto_e
    iget-boolean v0, p0, Lo/cyj;->T:Z

    return v0
.end method

.method static synthetic d(Lo/cyj;Z)Z
    .locals 0

    .line 79
    iput-boolean p1, p0, Lo/cyj;->K:Z

    return p1
.end method

.method private d([B)Z
    .locals 15

    .line 1615
    const/4 v6, 0x1

    .line 1617
    move-object/from16 v0, p1

    array-length v7, v0

    .line 1618
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1619
    iget v0, p0, Lo/cyj;->l:I

    if-gt v7, v0, :cond_0

    .line 1621
    move-object/from16 v0, p1

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1625
    :cond_0
    iget v0, p0, Lo/cyj;->l:I

    rem-int v0, v7, v0

    if-lez v0, :cond_1

    iget v0, p0, Lo/cyj;->l:I

    div-int v0, v7, v0

    add-int/lit8 v11, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Lo/cyj;->l:I

    div-int v11, v7, v0

    .line 1626
    :goto_0
    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_3

    .line 1627
    iget v13, p0, Lo/cyj;->l:I

    .line 1628
    add-int/lit8 v0, v11, -0x1

    if-ne v12, v0, :cond_2

    .line 1630
    iget v0, p0, Lo/cyj;->l:I

    mul-int/2addr v0, v12

    sub-int v13, v7, v0

    .line 1633
    :cond_2
    iget v0, p0, Lo/cyj;->l:I

    mul-int v9, v12, v0

    .line 1634
    add-int v10, v9, v13

    .line 1635
    move-object/from16 v0, p1

    invoke-static {v0, v9, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v14

    .line 1636
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1626
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 1640
    :cond_3
    :goto_2
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendLinkDataCommand, mInterval = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->m:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1642
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, [B

    .line 1643
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0, v10}, Lo/cyn;->a([B)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1644
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendLinkDataCommond has write false"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1645
    const/4 v6, 0x0

    .line 1648
    :cond_4
    iget v0, p0, Lo/cyj;->g:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 1650
    :try_start_0
    iget v0, p0, Lo/cyj;->m:I

    if-lez v0, :cond_5

    .line 1651
    iget v0, p0, Lo/cyj;->m:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1655
    :cond_5
    goto :goto_4

    .line 1653
    :catch_0
    move-exception v11

    .line 1654
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "InterruptedException = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v11}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1657
    :cond_6
    :goto_4
    goto :goto_3

    .line 1660
    :cond_7
    iget v0, p0, Lo/cyj;->g:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_9

    .line 1662
    :try_start_1
    iget v0, p0, Lo/cyj;->m:I

    if-lez v0, :cond_8

    .line 1663
    iget v0, p0, Lo/cyj;->m:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1667
    :cond_8
    goto :goto_5

    .line 1665
    :catch_1
    move-exception v9

    .line 1666
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "InterruptedException = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v9}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1669
    :cond_9
    :goto_5
    return v6
.end method

.method private d([BI)[B
    .locals 7

    .line 2079
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 2080
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "otaCmdForDeviceCommand with parameter deviceData is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2081
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 2083
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "otaCmdForDeviceCommand , type = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2086
    const/4 v0, 0x3

    if-ne v0, p2, :cond_1

    .line 2087
    move-object v6, p1

    goto :goto_0

    .line 2089
    :cond_1
    array-length v0, p1

    add-int/lit8 v0, v0, 0x1

    new-array v6, v0, [B

    .line 2091
    invoke-direct {p0}, Lo/cyj;->u()V

    .line 2092
    iget v0, p0, Lo/cyj;->w:I

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v6, v1

    .line 2094
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v6, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2096
    :goto_0
    return-object v6
.end method

.method static synthetic e(Lo/cyj;I)I
    .locals 0

    .line 79
    iput p1, p0, Lo/cyj;->x:I

    return p1
.end method

.method static synthetic e(Lo/cyj;)Landroid/os/Handler;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->J:Landroid/os/Handler;

    return-object v0
.end method

.method private e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V
    .locals 9

    .line 677
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1c

    const/4 v0, 0x0

    if-eq v0, p1, :cond_1c

    const/4 v0, 0x0

    if-eq v0, p3, :cond_1c

    .line 678
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_7

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_7

    .line 680
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Capture V2 link connect parameter."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 682
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/cyj;->c(II)V

    .line 683
    iget v0, p0, Lo/cyj;->d:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 685
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyj;->V:Z

    .line 687
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 688
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0}, Lo/cyn;->h()V

    .line 692
    :cond_0
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-static {v0, p3}, Lo/cxo;->d(Landroid/content/Context;[B)Lo/cyl;

    move-result-object v6

    .line 693
    const/4 v0, 0x4

    iput v0, p0, Lo/cyj;->x:I

    .line 695
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 697
    invoke-virtual {v6}, Lo/cyl;->d()I

    move-result v0

    iput v0, p0, Lo/cyj;->g:I

    .line 698
    invoke-virtual {v6}, Lo/cyl;->c()I

    move-result v0

    iput v0, p0, Lo/cyj;->f:I

    .line 700
    iget-object v0, p0, Lo/cyj;->t:Lo/cyv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 701
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device max frame size = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->f:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 702
    iget-object v0, p0, Lo/cyj;->t:Lo/cyv;

    iget v1, p0, Lo/cyj;->f:I

    invoke-virtual {v0, v1}, Lo/cyv;->b(I)V

    .line 705
    :cond_1
    invoke-virtual {v6}, Lo/cyl;->a()I

    move-result v0

    iput v0, p0, Lo/cyj;->l:I

    .line 706
    invoke-virtual {v6}, Lo/cyl;->e()I

    move-result v0

    iput v0, p0, Lo/cyj;->m:I

    .line 707
    invoke-virtual {v6}, Lo/cyl;->b()I

    move-result v0

    iput v0, p0, Lo/cyj;->n:I

    .line 708
    invoke-virtual {v6}, Lo/cyl;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cyj;->p:Ljava/lang/String;

    .line 709
    iget v0, p0, Lo/cyj;->n:I

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setmAuthVersion(I)V

    .line 711
    iget v0, p0, Lo/cyj;->d:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 712
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Path extend number = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Lo/cyl;->g()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 714
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 715
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-virtual {v6}, Lo/cyl;->g()I

    move-result v1

    invoke-interface {v0, v1}, Lo/cyn;->a(I)V

    .line 720
    :cond_2
    iget v0, p0, Lo/cyj;->d:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_5

    .line 722
    invoke-direct {p0}, Lo/cyj;->x()V

    .line 725
    iget v0, p0, Lo/cyj;->n:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 727
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device need authentic Application."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 728
    invoke-direct {p0}, Lo/cyj;->n()Z

    move-result v7

    .line 729
    if-nez v7, :cond_3

    .line 730
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Send Authentic command fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 731
    const/4 v0, 0x4

    iput v0, p0, Lo/cyj;->x:I

    .line 733
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 735
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x4

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 737
    :cond_3
    goto :goto_0

    .line 738
    :cond_4
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device do not need authentic."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 740
    const/4 v0, 0x2

    iput v0, p0, Lo/cyj;->x:I

    .line 742
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 744
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x2

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    goto :goto_0

    .line 748
    :cond_5
    invoke-static {}, Lo/cxo;->b()Lo/cye;

    move-result-object v7

    .line 749
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyj;->ac:Z

    .line 750
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to get device available status."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 752
    invoke-virtual {p0, v7}, Lo/cyj;->a(Lo/cye;)V

    .line 753
    goto :goto_0

    .line 755
    :cond_6
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device Link parameter resolve fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 756
    const/4 v0, 0x4

    iput v0, p0, Lo/cyj;->x:I

    .line 758
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 760
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x4

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 762
    :goto_0
    goto/16 :goto_6

    :cond_7
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_a

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/16 v1, 0x13

    if-ne v1, v0, :cond_a

    .line 764
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Capture V2 Authentic parameter."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 766
    const/4 v0, 0x1

    const/16 v1, 0x13

    invoke-direct {p0, v0, v1}, Lo/cyj;->c(II)V

    .line 769
    invoke-static {p3}, Lo/cxo;->b([B)Ljava/lang/String;

    move-result-object v6

    .line 771
    invoke-direct {p0, v6}, Lo/cyj;->a(Ljava/lang/String;)Z

    move-result v7

    .line 772
    if-eqz v7, :cond_9

    .line 773
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Authentic success."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 774
    iget v0, p0, Lo/cyj;->d:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_8

    .line 776
    const/4 v0, 0x2

    invoke-static {v0}, Lo/cxo;->c(I)Lo/cye;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/cyj;->a(Lo/cye;)V

    goto :goto_1

    .line 779
    :cond_8
    const/4 v0, 0x2

    iput v0, p0, Lo/cyj;->x:I

    .line 781
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 783
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x2

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    goto :goto_1

    .line 786
    :cond_9
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Authentic fail so disconnect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 788
    invoke-virtual {p0}, Lo/cyj;->d()V

    .line 790
    const/4 v0, 0x4

    iput v0, p0, Lo/cyj;->x:I

    .line 792
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 794
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x4

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 796
    :goto_1
    goto/16 :goto_6

    :cond_a
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_d

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/16 v1, 0xf

    if-ne v1, v0, :cond_d

    .line 797
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Capture V2 receive bond status response."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 799
    const/4 v0, 0x1

    const/16 v1, 0xf

    invoke-direct {p0, v0, v1}, Lo/cyj;->c(II)V

    .line 803
    iget v0, p0, Lo/cyj;->d:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_b

    .line 804
    invoke-direct {p0}, Lo/cyj;->w()V

    .line 808
    :cond_b
    iget-object v0, p0, Lo/cyj;->I:Lo/cyk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1d

    .line 809
    iget-object v0, p0, Lo/cyj;->I:Lo/cyk;

    invoke-virtual {v0, p1, p3}, Lo/cyk;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)Z

    move-result v6

    .line 810
    if-nez v6, :cond_c

    .line 811
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "receive bond status incorrect response."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 812
    const/4 v0, 0x4

    iput v0, p0, Lo/cyj;->x:I

    .line 814
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 816
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x4

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 818
    :cond_c
    goto/16 :goto_6

    .line 819
    :cond_d
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_f

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/16 v1, 0xe

    if-ne v1, v0, :cond_f

    .line 820
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Capture V2 bond request response."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 822
    const/4 v0, 0x1

    const/16 v1, 0xe

    invoke-direct {p0, v0, v1}, Lo/cyj;->c(II)V

    .line 824
    iget-object v0, p0, Lo/cyj;->I:Lo/cyk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1d

    .line 825
    iget-object v0, p0, Lo/cyj;->I:Lo/cyk;

    invoke-virtual {v0, p1, p3}, Lo/cyk;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)Z

    move-result v6

    .line 826
    if-nez v6, :cond_e

    .line 827
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "receive pair status incorrect response."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 828
    const/4 v0, 0x4

    iput v0, p0, Lo/cyj;->x:I

    .line 830
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 832
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x4

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 834
    :cond_e
    goto/16 :goto_6

    .line 835
    :cond_f
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1b

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/16 v1, 0x16

    if-ne v1, v0, :cond_1b

    .line 837
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->l()Z

    move-result v6

    .line 838
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAutoConnect : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "    isWaitUserConfirm : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/cyj;->ab:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 839
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cys;->c(Z)V

    .line 841
    const/4 v0, 0x1

    const/16 v1, 0x16

    invoke-direct {p0, v0, v1}, Lo/cyj;->c(II)V

    .line 842
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-static {v0, p3}, Lo/cxo;->f(Landroid/content/Context;[B)I

    move-result v7

    .line 843
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device available status \uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 844
    const/4 v0, -0x1

    if-eq v0, v7, :cond_10

    const/4 v0, 0x0

    if-eq v0, v7, :cond_10

    const/4 v0, 0x1

    if-ne v0, v7, :cond_13

    .line 845
    :cond_10
    iget v0, p0, Lo/cyj;->n:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_12

    .line 847
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device need authentic Application after check device available."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 848
    invoke-direct {p0}, Lo/cyj;->n()Z

    move-result v8

    .line 849
    if-nez v8, :cond_11

    .line 850
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Send Authentic command fail after check device available."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 851
    const/4 v0, 0x4

    iput v0, p0, Lo/cyj;->x:I

    .line 853
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 855
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x4

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 857
    :cond_11
    goto :goto_2

    .line 858
    :cond_12
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device do not need authentic after check device available."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 860
    const/4 v0, 0x2

    iput v0, p0, Lo/cyj;->x:I

    .line 862
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 864
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x2

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 866
    :goto_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyj;->O:Z

    goto/16 :goto_5

    .line 867
    :cond_13
    const/4 v0, 0x2

    if-ne v0, v7, :cond_14

    .line 869
    const/4 v0, 0x5

    iput v0, p0, Lo/cyj;->x:I

    .line 871
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 873
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x5

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 874
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->O:Z

    .line 875
    return-void

    .line 876
    :cond_14
    const/4 v0, 0x3

    if-ne v0, v7, :cond_18

    .line 877
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAutoConnect : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 878
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6536\u5230\u547d\u4ee4 5.1.22 type = 3,\u624b\u73af\u5904\u4e8e\u53cc\u624b\u673a\u573a\u666f."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 879
    if-eqz v6, :cond_16

    .line 880
    iget-boolean v0, p0, Lo/cyj;->ab:Z

    if-eqz v0, :cond_15

    .line 881
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wait util user click button."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 882
    return-void

    .line 885
    :cond_15
    const/4 v0, 0x4

    iput v0, p0, Lo/cyj;->x:I

    .line 887
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 890
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->O:Z

    .line 891
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0}, Lo/cyn;->a()V

    goto :goto_4

    .line 893
    :cond_16
    new-instance v8, Landroid/content/Intent;

    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwbtsdk/ui/NotifyActivity;

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 894
    const/high16 v0, 0x10000000

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 895
    const/high16 v0, 0x20000000

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 896
    iget-object v0, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_17

    .line 897
    const-string v0, "deviceName"

    iget-object v1, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 898
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceName : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 900
    :cond_17
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBTDevice is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 902
    :goto_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyj;->ab:Z

    .line 903
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 905
    :goto_4
    return-void

    .line 906
    :cond_18
    const v0, 0x186a0

    if-ne v0, v7, :cond_1a

    .line 907
    iget-boolean v0, p0, Lo/cyj;->ac:Z

    if-eqz v0, :cond_19

    .line 908
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.1.22 \u6536\u5230 100000 \u8fde\u63a5\u5931\u8d25"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 910
    const/4 v0, 0x4

    iput v0, p0, Lo/cyj;->x:I

    .line 912
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->K:Z

    .line 915
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->O:Z

    .line 916
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0}, Lo/cyn;->a()V

    .line 917
    return-void

    .line 919
    :cond_19
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.1.22 status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 920
    iget v0, p0, Lo/cyj;->d:I

    invoke-static {v0}, Lo/cxo;->d(I)Lo/cye;

    move-result-object v8

    .line 921
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to get link parameter."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 923
    invoke-virtual {p0, v8}, Lo/cyj;->a(Lo/cye;)V

    .line 924
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyj;->ac:Z

    .line 926
    :cond_1a
    :goto_5
    goto :goto_6

    .line 928
    :cond_1b
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handshake report data with V2."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 929
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    invoke-interface {v0, p1, p2, p3}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    goto :goto_6

    .line 932
    :cond_1c
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 934
    :cond_1d
    :goto_6
    return-void
.end method

.method private e([B)V
    .locals 8

    .line 940
    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    .line 941
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "not 5.1.17 data, return"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 942
    return-void

    .line 945
    :cond_1
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 947
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/16 v1, 0x11

    if-ne v1, v0, :cond_2

    .line 950
    :try_start_0
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 951
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 952
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/cyj;->m:I

    .line 953
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getMTSInterval mInterval = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->m:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 956
    goto :goto_0

    .line 954
    :catch_0
    move-exception v6

    .line 955
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error e = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 959
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/cyj;Lo/cye;)Z
    .locals 1

    .line 79
    invoke-direct {p0, p1}, Lo/cyj;->d(Lo/cye;)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/cyj;Z)Z
    .locals 0

    .line 79
    iput-boolean p1, p0, Lo/cyj;->ab:Z

    return p1
.end method

.method static synthetic f(Lo/cyj;)Ljava/lang/Object;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->W:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic g(Lo/cyj;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->X:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic h(Lo/cyj;I)I
    .locals 0

    .line 79
    iput p1, p0, Lo/cyj;->N:I

    return p1
.end method

.method static synthetic h(Lo/cyj;)V
    .locals 0

    .line 79
    invoke-direct {p0}, Lo/cyj;->q()V

    return-void
.end method

.method static synthetic h(Lo/cyj;Z)Z
    .locals 0

    .line 79
    iput-boolean p1, p0, Lo/cyj;->T:Z

    return p1
.end method

.method static synthetic i(Lo/cyj;)I
    .locals 1

    .line 79
    iget v0, p0, Lo/cyj;->g:I

    return v0
.end method

.method static synthetic i(Lo/cyj;I)I
    .locals 0

    .line 79
    iput p1, p0, Lo/cyj;->S:I

    return p1
.end method

.method static synthetic j(Lo/cyj;)I
    .locals 1

    .line 79
    iget v0, p0, Lo/cyj;->N:I

    return v0
.end method

.method static synthetic k(Lo/cyj;)I
    .locals 1

    .line 79
    iget v0, p0, Lo/cyj;->S:I

    return v0
.end method

.method static synthetic l(Lo/cyj;)Lo/cyn;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    return-object v0
.end method

.method private l()V
    .locals 5

    .line 296
    iget-object v0, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_0

    .line 297
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registeConfirmOrCancel : com.huawei.health.action.ACTION_DOUBLE_PHONE_CONFIRM_OR_CANCEL"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    new-instance v4, Landroid/content/IntentFilter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "com.huawei.health.action.ACTION_DOUBLE_PHONE_CONFIRM_OR_CANCEL"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 299
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/cyj;->Y:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 300
    goto :goto_0

    .line 301
    :cond_0
    const-string v0, "BTDeviceSendCommandUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBTDevice is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    :goto_0
    return-void
.end method

.method static synthetic m(Lo/cyj;)V
    .locals 0

    .line 79
    invoke-direct {p0}, Lo/cyj;->t()V

    return-void
.end method

.method static synthetic n(Lo/cyj;)I
    .locals 1

    .line 79
    iget v0, p0, Lo/cyj;->d:I

    return v0
.end method

.method private n()Z
    .locals 8

    .line 596
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter startAuthenticBTDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 597
    iget-object v0, p0, Lo/cyj;->p:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    if-eq v1, v0, :cond_0

    .line 599
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "RandA parameter is incorrect so stop authentic."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 600
    const/4 v0, 0x0

    return v0

    .line 606
    :cond_0
    const/16 v0, 0x10

    :try_start_0
    invoke-static {v0}, Lo/cxt;->a(I)[B

    move-result-object v5

    .line 607
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 608
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "generateRandomBytes fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 610
    const/4 v0, 0x0

    return v0

    .line 616
    :cond_1
    goto :goto_0

    .line 612
    :catch_0
    move-exception v6

    .line 613
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "generateRandomBytes exception with info = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 615
    const/4 v0, 0x0

    return v0

    .line 618
    :goto_0
    invoke-static {v5}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cyj;->o:Ljava/lang/String;

    .line 621
    iget-object v0, p0, Lo/cyj;->q:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/cyj;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 622
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 624
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    iget v1, p0, Lo/cyj;->n:I

    iget-object v2, p0, Lo/cyj;->o:Ljava/lang/String;

    invoke-static {v0, v1, v6, v2}, Lo/cxo;->c(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)Lo/cye;

    move-result-object v7

    .line 625
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to request authentic."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 627
    invoke-virtual {p0, v7}, Lo/cyj;->a(Lo/cye;)V

    .line 628
    goto :goto_1

    .line 629
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 632
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic o(Lo/cyj;)I
    .locals 1

    .line 79
    iget v0, p0, Lo/cyj;->x:I

    return v0
.end method

.method private o()Ljava/lang/String;
    .locals 9

    .line 569
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getCak enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 570
    iget v0, p0, Lo/cyj;->n:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 571
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    const-string v1, "154CB790FD6FA8AEF0F5389454703E94LgzawBpNLWm9LvJlDf61Vvqjricn/SlN4YzA/IQqmjalRCxcegUciVxXk6hXq+Vq"

    invoke-virtual {v0, v1}, Lo/dec;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 572
    :cond_0
    iget v0, p0, Lo/cyj;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 573
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    const-string v1, "154CB790FD6FA8AEF0F5389454703E94bZX+pDwJX2DyXdVgaCVmsY53Xz+9Rmby11P8qQ2xz3PaNCi0mBPQD0LIxahAL/Ft"

    invoke-virtual {v0, v1}, Lo/dec;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 574
    :cond_1
    iget v0, p0, Lo/cyj;->n:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 575
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x17

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v5

    .line 576
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getCak first = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v5, v2, v3

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 577
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x3ff

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v6

    .line 578
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getCak second = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v6, v2, v3

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 579
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x7e7

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v7

    .line 580
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getCak third = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v7, v2, v3

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 582
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/huawei/whitebox/e;->b([B)[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 583
    :catch_0
    move-exception v8

    .line 584
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getCak "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v8}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 587
    :cond_2
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getCak exception, the mAuthenticVersion = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->n:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 588
    const-string v0, ""

    return-object v0
.end method

.method static synthetic p(Lo/cyj;)Lo/cyv;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->t:Lo/cyv;

    return-object v0
.end method

.method private p()V
    .locals 2

    .line 342
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "BTDeviceSendCommandUtil"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cyj;->M:Landroid/os/HandlerThread;

    .line 344
    iget-object v0, p0, Lo/cyj;->M:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 346
    new-instance v0, Lo/cyj$e;

    iget-object v1, p0, Lo/cyj;->M:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cyj$e;-><init>(Lo/cyj;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cyj;->J:Landroid/os/Handler;

    .line 347
    return-void
.end method

.method static synthetic q(Lo/cyj;)Lo/cyh;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->r:Lo/cyh;

    return-object v0
.end method

.method private q()V
    .locals 7

    .line 1586
    iget-object v5, p0, Lo/cyj;->b:Ljava/lang/Object;

    monitor-enter v5

    .line 1587
    :try_start_0
    iget-boolean v0, p0, Lo/cyj;->E:Z

    if-eqz v0, :cond_0

    .line 1588
    iget-object v0, p0, Lo/cyj;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 1589
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->E:Z

    .line 1591
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->v:Z

    .line 1592
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, " unLockAW, mSendingV1Command set false."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1593
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 1594
    :goto_0
    return-void
.end method

.method private r()V
    .locals 8

    .line 1755
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter reportTimeoutInfo() with ServiceID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->B:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " CommandID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->A:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1756
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    iget v1, p0, Lo/cyj;->B:I

    iget v2, p0, Lo/cyj;->A:I

    iget v3, p0, Lo/cyj;->g:I

    iget v4, p0, Lo/cyj;->w:I

    iget v5, p0, Lo/cyj;->D:I

    invoke-static/range {v0 .. v5}, Lo/cxo;->b(Landroid/content/Context;IIIII)Ljava/lang/String;

    move-result-object v6

    .line 1757
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1758
    const/4 v7, 0x0

    .line 1761
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v7

    .line 1762
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Timeout Info = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1763
    invoke-virtual {p0}, Lo/cyj;->k()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    array-length v1, v7

    invoke-direct {p0, v0, v1, v7}, Lo/cyj;->b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 1765
    :cond_0
    return-void
.end method

.method static synthetic r(Lo/cyj;)Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lo/cyj;->H:Z

    return v0
.end method

.method private s()I
    .locals 11

    .line 1723
    const/4 v7, -0x1

    .line 1724
    const/4 v8, 0x0

    .line 1725
    iget-object v0, p0, Lo/cyj;->y:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1726
    iget-object v0, p0, Lo/cyj;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .line 1728
    :cond_0
    :try_start_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1729
    add-int/lit8 v7, v7, 0x1

    .line 1730
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cye;

    .line 1731
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 1732
    invoke-virtual {v6}, Lo/cye;->e()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 1733
    const/4 v8, 0x1

    .line 1734
    .line 1740
    :cond_1
    goto :goto_0

    .line 1738
    :catch_0
    move-exception v10

    .line 1739
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getDeviceCommand Exception with exception = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1742
    :goto_0
    if-nez v8, :cond_2

    .line 1744
    const/4 v7, 0x0

    .line 1748
    :cond_2
    return v7
.end method

.method static synthetic s(Lo/cyj;)Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lo/cyj;->V:Z

    return v0
.end method

.method private t()V
    .locals 7

    .line 1600
    iget-object v5, p0, Lo/cyj;->e:Ljava/lang/Object;

    monitor-enter v5

    .line 1601
    :try_start_0
    iget-boolean v0, p0, Lo/cyj;->F:Z

    if-eqz v0, :cond_0

    .line 1602
    iget-object v0, p0, Lo/cyj;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 1603
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->F:Z

    .line 1605
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cyj;->v:Z

    .line 1606
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, " unLockBT, mSendingV1Command set false."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1607
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 1608
    :goto_0
    return-void
.end method

.method static synthetic t(Lo/cyj;)Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lo/cyj;->T:Z

    return v0
.end method

.method private u()V
    .locals 2

    .line 1676
    iget v0, p0, Lo/cyj;->w:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cyj;->w:I

    .line 1677
    iget v0, p0, Lo/cyj;->w:I

    const/16 v1, 0x100

    if-ne v1, v0, :cond_0

    .line 1678
    const/4 v0, 0x0

    iput v0, p0, Lo/cyj;->w:I

    .line 1680
    :cond_0
    return-void
.end method

.method static synthetic u(Lo/cyj;)Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lo/cyj;->K:Z

    return v0
.end method

.method static synthetic v(Lo/cyj;)I
    .locals 1

    .line 79
    iget v0, p0, Lo/cyj;->B:I

    return v0
.end method

.method static synthetic w(Lo/cyj;)I
    .locals 1

    .line 79
    invoke-direct {p0}, Lo/cyj;->s()I

    move-result v0

    return v0
.end method

.method private w()V
    .locals 6

    .line 2589
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter unBindIConnectService."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2590
    invoke-static {}, Lo/cxo;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/cxo;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2591
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2594
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, Lo/cxo;->e(Lo/dqe;)V

    .line 2595
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/cyj;->aa:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2598
    goto :goto_0

    .line 2596
    :catch_0
    move-exception v5

    .line 2597
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "unBindIConnectService with IllegalArgumentException."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2598
    goto :goto_0

    .line 2600
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mContext is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2603
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iconnect do not exist or do not have iconnect action."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2605
    :goto_0
    return-void
.end method

.method static synthetic x(Lo/cyj;)Landroid/content/Context;
    .locals 1

    .line 79
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    return-object v0
.end method

.method private x()V
    .locals 7

    .line 2563
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter bindIConnectService."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2564
    invoke-static {}, Lo/cxo;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lo/cxo;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2565
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2567
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.iconnect.action.WEAR_CONNECT_SERVICE"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2568
    const-string v0, "com.huawei.iconnect"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 2569
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "start to bind iconnect service."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2570
    iget-object v0, p0, Lo/cyj;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/cyj;->aa:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v5, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v6

    .line 2571
    if-nez v6, :cond_0

    .line 2573
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "bind iconnect fail so set service handle is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2574
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cxo;->e(Lo/dqe;)V

    .line 2576
    :cond_0
    goto :goto_0

    .line 2577
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mContext is null so set service handle is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2578
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cxo;->e(Lo/dqe;)V

    goto :goto_0

    .line 2581
    :cond_2
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iconnect do not exist or do not have iconnect action."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2583
    :goto_0
    return-void
.end method

.method static synthetic y(Lo/cyj;)I
    .locals 1

    .line 79
    iget v0, p0, Lo/cyj;->A:I

    return v0
.end method

.method private y()V
    .locals 6

    .line 1768
    const/4 v5, 0x0

    .line 1769
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1770
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0}, Lo/cyn;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 1771
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0}, Lo/cyn;->d()V

    .line 1774
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 1775
    new-instance v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    .line 1776
    iget v0, p0, Lo/cyj;->d:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1778
    const-string v0, "AndroidWear"

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 1779
    const-string v0, "HUAWEI WATCH"

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    goto :goto_0

    .line 1782
    :cond_1
    iget-object v0, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1783
    iget-object v0, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 1784
    iget-object v0, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    goto :goto_0

    .line 1786
    :cond_2
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mBTDevice is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1792
    :cond_3
    :goto_0
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Start to report connect fail state with device type = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1793
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1795
    const/4 v0, 0x4

    iput v0, p0, Lo/cyj;->x:I

    .line 1797
    iget-object v0, p0, Lo/cyj;->i:Lo/cxx;

    const/4 v1, 0x4

    invoke-interface {v0, v5, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 1798
    return-void
.end method

.method private z()I
    .locals 2

    .line 2637
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2638
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0}, Lo/cyn;->f()I

    move-result v0

    return v0

    .line 2640
    :cond_0
    const/4 v0, 0x3

    return v0
.end method

.method static synthetic z(Lo/cyj;)Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lo/cyj;->v:Z

    return v0
.end method


# virtual methods
.method public a()Lo/cyn;
    .locals 1

    .line 2439
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 465
    iput p1, p0, Lo/cyj;->f:I

    .line 466
    return-void
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 2408
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "setFileCallback"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2409
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 2410
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "callback is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2411
    return-void

    .line 2413
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setFileCallback callback : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2414
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0, p1}, Lo/cyn;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2415
    return-void
.end method

.method public a(Lo/cye;)V
    .locals 10

    .line 2369
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 2370
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btDeviceCommand is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2371
    return-void

    .line 2374
    :cond_0
    iget-object v0, p0, Lo/cyj;->y:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2376
    iget-object v6, p0, Lo/cyj;->W:Ljava/lang/Object;

    monitor-enter v6

    .line 2378
    :try_start_0
    iget-object v0, p0, Lo/cyj;->y:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2380
    iget-object v0, p0, Lo/cyj;->J:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 2381
    iget-object v0, p0, Lo/cyj;->J:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    move-result v8

    .line 2382
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendBTDeviceData insert queue."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2383
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v6

    throw v9

    :goto_0
    goto :goto_1

    .line 2385
    :cond_1
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mBTDeviceCommandList is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2387
    :goto_1
    return-void
.end method

.method public b()V
    .locals 6

    .line 502
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 504
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cyj;->R:Z

    .line 505
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    iget-object v1, p0, Lo/cyj;->h:Landroid/bluetooth/BluetoothDevice;

    invoke-interface {v0, v1}, Lo/cyn;->b(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    .line 507
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "connectBTDevice: mBTDeviceServiceBase is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 509
    :goto_0
    return-void
.end method

.method public b(I)V
    .locals 5

    .line 481
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter setBTDeviceActiveState() with activeState = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 486
    iput p1, p0, Lo/cyj;->u:I

    .line 487
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 2500
    iput-boolean p1, p0, Lo/cyj;->P:Z

    .line 2501
    return-void
.end method

.method protected b([B)[B
    .locals 7

    .line 1687
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1688
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "transferV2ToV1Protocol with parameter is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1689
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 1693
    :cond_0
    invoke-static {p1}, Lo/cxr;->d([B)[B

    move-result-object v6

    .line 1694
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 1695
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "transferV2ToV1Protocol with commandData is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1696
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 1700
    :cond_1
    invoke-direct {p0}, Lo/cyj;->u()V

    .line 1701
    array-length v0, v6

    const/4 v1, 0x4

    if-le v0, v1, :cond_2

    .line 1702
    iget v0, p0, Lo/cyj;->w:I

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v6, v1

    .line 1703
    const/4 v0, 0x1

    aget-byte v0, v6, v0

    iput v0, p0, Lo/cyj;->D:I

    .line 1704
    const/4 v0, 0x2

    aget-byte v0, v6, v0

    iput v0, p0, Lo/cyj;->j:I

    .line 1706
    const/4 v0, 0x3

    aget-byte v0, v6, v0

    iput v0, p0, Lo/cyj;->C:I

    .line 1707
    iget v0, p0, Lo/cyj;->C:I

    if-gez v0, :cond_2

    .line 1709
    iget v0, p0, Lo/cyj;->C:I

    add-int/lit16 v0, v0, 0x80

    iput v0, p0, Lo/cyj;->C:I

    .line 1713
    :cond_2
    return-object v6
.end method

.method public c()I
    .locals 1

    .line 473
    iget v0, p0, Lo/cyj;->u:I

    return v0
.end method

.method public c(I)V
    .locals 6

    .line 2522
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter btSwitchChangeInfo() with status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2523
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2524
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0, p1}, Lo/cyn;->e(I)V

    goto :goto_0

    .line 2526
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mBTDeviceServiceBase is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2528
    :goto_0
    return-void
.end method

.method public d()V
    .locals 6

    .line 515
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 516
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0}, Lo/cyn;->a()V

    goto :goto_0

    .line 518
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "disconnectBTDevice: mBTDeviceServiceBase is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 520
    :goto_0
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 2457
    iput-boolean p1, p0, Lo/cyj;->L:Z

    .line 2458
    return-void
.end method

.method public e()I
    .locals 5

    .line 494
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getBTDeviceConnectState with state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyj;->x:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 495
    iget v0, p0, Lo/cyj;->x:I

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 6

    .line 2394
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendAssetData"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2395
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 2396
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "filePath is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2397
    return-void

    .line 2399
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sendBTDeviceAssetData filePath : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2400
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0, p1}, Lo/cyn;->a(Ljava/lang/String;)V

    .line 2401
    return-void
.end method

.method public e(Z)V
    .locals 5

    .line 2534
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter setBLEReconnectEnableFlag() with status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2535
    iput-boolean p1, p0, Lo/cyj;->R:Z

    .line 2536
    return-void
.end method

.method public e(ZI)V
    .locals 5

    .line 2446
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter setBLEHandshakeStatus() with needHandshake = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2448
    iput-boolean p1, p0, Lo/cyj;->K:Z

    .line 2450
    iput p2, p0, Lo/cyj;->x:I

    .line 2451
    return-void
.end method

.method public f()Z
    .locals 1

    .line 2507
    iget-boolean v0, p0, Lo/cyj;->P:Z

    return v0
.end method

.method public g()Z
    .locals 1

    .line 2515
    iget-boolean v0, p0, Lo/cyj;->O:Z

    return v0
.end method

.method public h()Z
    .locals 1

    .line 2465
    iget-boolean v0, p0, Lo/cyj;->L:Z

    return v0
.end method

.method public i()Z
    .locals 5

    .line 2542
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter getBLEReconnectEnableFlag() with status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, p0, Lo/cyj;->R:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2543
    iget-boolean v0, p0, Lo/cyj;->R:Z

    return v0
.end method

.method public k()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 7

    .line 2472
    const/4 v6, 0x0

    .line 2473
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2474
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0}, Lo/cyn;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    goto :goto_0

    .line 2476
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "getDeviceInfo: mBTDeviceServiceBase is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2479
    :goto_0
    return-object v6
.end method

.method public m()V
    .locals 6

    .line 2550
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter disconnectGMS()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2551
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2552
    iget-object v0, p0, Lo/cyj;->k:Lo/cyn;

    invoke-interface {v0}, Lo/cyn;->d()V

    goto :goto_0

    .line 2554
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mBTDeviceServiceBase is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2556
    :goto_0
    return-void
.end method
