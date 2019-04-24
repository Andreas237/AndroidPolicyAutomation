.class public Lo/adh;
.super Lo/afw;
.source "SourceFile"


# instance fields
.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afz;>;"
        }
    .end annotation
.end field

.field private c:Lo/agb;

.field private e:Lo/adc;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Lo/afw;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/adh;->b:Ljava/util/ArrayList;

    return-void
.end method

.method private c()V
    .locals 3

    .line 107
    iget-object v0, p0, Lo/adh;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 108
    iget-object v0, p0, Lo/adh;->d:Lo/abx;

    iget-object v1, p0, Lo/adh;->a:Lo/acj;

    iget-object v2, p0, Lo/adh;->b:Ljava/util/ArrayList;

    invoke-interface {v0, v1, v2}, Lo/abx;->onDataChanged(Lo/acl;Ljava/util/List;)V

    .line 110
    :cond_0
    return-void
.end method

.method private c(I[BLjava/io/FileOutputStream;)V
    .locals 5

    .line 113
    iget-object v0, p0, Lo/adh;->e:Lo/adc;

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lo/adh;->e:Lo/adc;

    invoke-virtual {v0, p2}, Lo/adc;->e([B)Lo/afz;

    move-result-object v0

    check-cast v0, Lo/agb;

    iput-object v0, p0, Lo/adh;->c:Lo/agb;

    .line 115
    iget-object v0, p0, Lo/adh;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/adh;->c:Lo/agb;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    add-int/lit8 p1, p1, 0x1

    .line 117
    sget-object v0, Lo/ade;->c:[B

    int-to-byte v1, p1

    const/4 v2, 0x7

    aput-byte v1, v0, v2

    .line 119
    :try_start_0
    sget-object v0, Lo/ade;->c:[B

    invoke-virtual {p3, v0}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    goto :goto_0

    .line 120
    :catch_0
    move-exception v4

    .line 121
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HdpBloodPresureMeasureController HandleHealthChannelStateChange error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    :cond_0
    :goto_0
    return-void
.end method

.method private c(Landroid/os/ParcelFileDescriptor;Ljava/io/FileInputStream;Ljava/io/FileOutputStream;)V
    .locals 3

    .line 81
    if-eqz p1, :cond_0

    .line 83
    :try_start_0
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    goto :goto_0

    .line 84
    :catch_0
    move-exception v2

    .line 85
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    :cond_0
    :goto_0
    if-eqz p2, :cond_1

    .line 91
    :try_start_1
    invoke-virtual {p2}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 94
    goto :goto_1

    .line 92
    :catch_1
    move-exception v2

    .line 93
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    :cond_1
    :goto_1
    if-eqz p3, :cond_2

    .line 99
    :try_start_2
    invoke-virtual {p3}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 102
    goto :goto_2

    .line 100
    :catch_2
    move-exception v2

    .line 101
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    :cond_2
    :goto_2
    return-void
.end method


# virtual methods
.method protected a()I
    .locals 1

    .line 28
    const/16 v0, 0x1007

    return v0
.end method

.method protected a(IILandroid/os/ParcelFileDescriptor;I)V
    .locals 10

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/16 v0, 0x400

    new-array v6, v0, [B

    .line 36
    const/4 v7, 0x1

    .line 38
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-virtual {p3}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    move-object v4, v0

    .line 39
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-virtual {p3}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    move-object v5, v0

    .line 40
    new-instance v0, Lo/adc;

    invoke-direct {v0}, Lo/adc;-><init>()V

    iput-object v0, p0, Lo/adh;->e:Lo/adc;

    .line 41
    :goto_0
    invoke-virtual {v4, v6}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_5

    .line 42
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/16 v1, -0x1e

    if-ne v0, v1, :cond_0

    .line 44
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HdpBloodPresureMeasureController fos.write RESPONSE_2_2_3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    sget-object v0, Lo/ade;->b:[B

    invoke-virtual {v5, v0}, Ljava/io/FileOutputStream;->write([B)V

    goto/16 :goto_1

    .line 46
    :cond_0
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/16 v1, -0x19

    if-ne v0, v1, :cond_1

    const/16 v0, 0x12

    aget-byte v0, v6, v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_1

    const/16 v0, 0x13

    aget-byte v0, v6, v0

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_1

    .line 49
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HdpBloodPresureMeasureController fos.write(RESPONSE_3_2_3)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    sget-object v0, Lo/ade;->a:[B

    invoke-virtual {v5, v0}, Ljava/io/FileOutputStream;->write([B)V

    goto :goto_1

    .line 51
    :cond_1
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/16 v1, -0x19

    if-ne v0, v1, :cond_2

    const/16 v0, 0x12

    aget-byte v0, v6, v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    const/16 v0, 0x13

    aget-byte v0, v6, v0

    const/16 v1, 0x1f

    if-ne v0, v1, :cond_2

    .line 55
    invoke-direct {p0, v7, v6, v5}, Lo/adh;->c(I[BLjava/io/FileOutputStream;)V

    goto :goto_1

    .line 56
    :cond_2
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/16 v1, -0x1a

    if-ne v0, v1, :cond_3

    .line 58
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HdpBloodPresureMeasureController ABORT_APDU"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    const/4 v7, 0x1

    .line 60
    invoke-direct {p0}, Lo/adh;->c()V

    goto :goto_1

    .line 61
    :cond_3
    const/4 v0, 0x0

    aget-byte v0, v6, v0

    const/16 v1, -0x1c

    if-ne v0, v1, :cond_4

    .line 62
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HdpBloodPresureMeasureController fos.write(RESPONSE_6_2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    const/4 v7, 0x1

    .line 64
    sget-object v0, Lo/ade;->d:[B

    invoke-virtual {v5, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 65
    invoke-direct {p0}, Lo/adh;->c()V

    .line 67
    :cond_4
    :goto_1
    const/16 v0, 0x400

    new-array v6, v0, [B

    .line 68
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 75
    :cond_5
    invoke-direct {p0, p3, v4, v5}, Lo/adh;->c(Landroid/os/ParcelFileDescriptor;Ljava/io/FileInputStream;Ljava/io/FileOutputStream;)V

    .line 77
    goto :goto_2

    .line 70
    :catch_0
    move-exception v8

    .line 71
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HdpBloodPresureMeasureController HandleHealthChannelStateChange error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    invoke-direct {p0, p3, v4, v5}, Lo/adh;->c(Landroid/os/ParcelFileDescriptor;Ljava/io/FileInputStream;Ljava/io/FileOutputStream;)V

    .line 77
    goto :goto_2

    .line 75
    :catchall_0
    move-exception v9

    invoke-direct {p0, p3, v4, v5}, Lo/adh;->c(Landroid/os/ParcelFileDescriptor;Ljava/io/FileInputStream;Ljava/io/FileOutputStream;)V

    .line 77
    throw v9

    .line 78
    :goto_2
    return-void
.end method
