.class public Lo/ace;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ace$e;
    }
.end annotation


# instance fields
.field private b:[Ljava/lang/String;

.field private c:Lo/ace$e;

.field private d:[Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Lo/ace$e;)V
    .locals 3

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ace;->d:[Ljava/lang/String;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ace;->e:Ljava/lang/String;

    .line 22
    sget-object v0, Lo/ace$e;->b:Lo/ace$e;

    iput-object v0, p0, Lo/ace;->c:Lo/ace$e;

    .line 23
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "0000180d-0000-1000-8000-00805f9b34fb"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ace;->b:[Ljava/lang/String;

    .line 79
    if-eqz p1, :cond_0

    .line 80
    const-string v0, ";"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ace;->d:[Ljava/lang/String;

    .line 82
    :cond_0
    iput-object p2, p0, Lo/ace;->e:Ljava/lang/String;

    .line 83
    iput-object p3, p0, Lo/ace;->c:Lo/ace$e;

    .line 84
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Lo/ace$e;)Lo/ace;
    .locals 1

    .line 88
    new-instance v0, Lo/ace;

    invoke-direct {v0, p0, p1, p2}, Lo/ace;-><init>(Ljava/lang/String;Ljava/lang/String;Lo/ace$e;)V

    return-object v0
.end method


# virtual methods
.method public c([B)Z
    .locals 6

    .line 42
    iget-object v0, p0, Lo/ace;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    array-length v0, p1

    if-lez v0, :cond_1

    .line 43
    iget-object v2, p0, Lo/ace;->d:[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 44
    const-string v0, "moredevice"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ace;->e:Ljava/lang/String;

    invoke-static {v0}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    if-ne v0, v1, :cond_0

    .line 45
    iget-object v0, p0, Lo/ace;->b:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {p1, v0}, Lo/aci;->b([BLjava/util/UUID;)Z

    move-result v0

    return v0

    .line 43
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 50
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 3

    .line 26
    iget-object v0, p0, Lo/ace;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/ace;->d:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 27
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    invoke-virtual {p0, v2}, Lo/ace;->e(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 31
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 34
    :cond_1
    iget-object v0, p0, Lo/ace;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/ace;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/ace;->e:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 35
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 37
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public e(Ljava/lang/String;)Z
    .locals 8

    .line 53
    iget-object v4, p0, Lo/ace;->d:[Ljava/lang/String;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    aget-object v7, v4, v6

    .line 55
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ScanFilter target name is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " and device name is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    iget-object v0, p0, Lo/ace;->c:Lo/ace$e;

    sget-object v1, Lo/ace$e;->e:Lo/ace$e;

    if-ne v0, v1, :cond_0

    .line 58
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 59
    const/4 v0, 0x1

    return v0

    .line 61
    :cond_0
    iget-object v0, p0, Lo/ace;->c:Lo/ace$e;

    sget-object v1, Lo/ace$e;->b:Lo/ace$e;

    if-ne v0, v1, :cond_1

    .line 62
    invoke-virtual {p1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 63
    const/4 v0, 0x1

    return v0

    .line 65
    :cond_1
    iget-object v0, p0, Lo/ace;->c:Lo/ace$e;

    sget-object v1, Lo/ace$e;->a:Lo/ace$e;

    if-ne v0, v1, :cond_2

    .line 66
    invoke-virtual {p1, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 67
    const/4 v0, 0x1

    return v0

    .line 69
    :cond_2
    iget-object v0, p0, Lo/ace;->c:Lo/ace$e;

    sget-object v1, Lo/ace$e;->c:Lo/ace$e;

    if-ne v0, v1, :cond_3

    .line 70
    invoke-virtual {p1, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 71
    const/4 v0, 0x1

    return v0

    .line 53
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 75
    :cond_4
    const/4 v0, 0x0

    return v0
.end method
