.class public Lcom/huawei/logupload/c/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Ljava/lang/String; = "com.huawei.imonitor"

.field public static final B:Ljava/lang/String; = "com.huawei.hidp"

.field public static final C:Ljava/lang/String; = "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

.field public static final D:Ljava/lang/Object;

.field public static final E:Ljava/lang/String; = "000000000000000"

.field public static final F:I = 0x1a

.field private static final G:Ljava/lang/String; = "Ej1Nxlg"

.field private static H:I = 0x0

.field private static I:I = 0x0

.field private static J:I = 0x0

.field private static K:I = 0x0

.field private static L:Landroid/os/PowerManager$WakeLock; = null

.field private static M:Landroid/net/wifi/WifiManager$WifiLock; = null

.field private static N:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private static O:Ljava/lang/String; = null

.field public static final a:I = 0x14

.field public static final b:J = 0xfa000L

.field public static final c:I = 0x64

.field public static final d:I = 0xf731400

.field public static final e:I = 0x1

.field public static final f:I = 0x2

.field public static final g:I = 0x3

.field public static final h:I = 0x1

.field public static final i:I = 0x2

.field public static final j:I = 0x3

.field public static final k:I = 0x0

.field public static final l:I = 0x0

.field public static final m:I = 0x1

.field public static final n:I = 0x2

.field public static final o:I = 0x3

.field public static final p:I = 0x4

.field public static final q:Ljava/lang/String; = "phoneservice_logupload_wakelock"

.field public static final r:Ljava/lang/String; = "phoneservice_logupload_wifilock"

.field public static final s:Ljava/lang/String; = "https://logservice.vmall.com:443/osg/logServerAction!addLogServer.htm"

.field public static final t:Ljava/lang/String; = "https://lfmemberdev.hwcloudtest.cn:9448/osg/logServerAction!addLogServer.htm"

.field public static final u:I = 0x3

.field public static final v:I = 0xf

.field public static final w:I = 0x3a98

.field public static final x:I = 0x927c0

.field public static final y:I = 0x16

.field public static final z:Ljava/lang/String; = "com.huawei.lcagent"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    const/4 v0, 0x0

    sput v0, Lcom/huawei/logupload/c/c;->H:I

    .line 69
    const/4 v0, 0x0

    sput v0, Lcom/huawei/logupload/c/c;->I:I

    .line 72
    const/4 v0, -0x1

    sput v0, Lcom/huawei/logupload/c/c;->J:I

    .line 75
    const/4 v0, -0x1

    sput v0, Lcom/huawei/logupload/c/c;->K:I

    .line 89
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/logupload/c/c;->L:Landroid/os/PowerManager$WakeLock;

    .line 90
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/logupload/c/c;->M:Landroid/net/wifi/WifiManager$WifiLock;

    .line 100
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    .line 103
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/huawei/logupload/c/c;->N:Ljava/util/Map;

    .line 107
    const-string v0, "EvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCYLKhv2RCG+W1RS5To1d+q7GYznfEvANriF6i+x7jVb4pigGTrgyAysI2wAWHi/MocP0SMb6qoUSltiFX5Rj2T9d4+57N8QwVec7Zpcp5Lkpl4tqOaEw5OZrKLO3QvWmOhtj8F0JD/j+0gZqhZTom97Y1vweBX6SweepVWL7akKLcpRxJe6RkNgLBdHyXd1l+GVW05kr63aKrtD8MDkK7G7U72dX920LDi+G+rVZt5ifgj4ETIv9Ltwhv1n/T05ms/3dr1oyMCnk7y3FqMII"

    sput-object v0, Lcom/huawei/logupload/c/c;->O:Ljava/lang/String;

    .line 179
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 110
    sget-object v0, Lcom/huawei/logupload/c/c;->O:Ljava/lang/String;

    return-object v0
.end method

.method public static a(I)V
    .locals 0

    .line 122
    sput p0, Lcom/huawei/logupload/c/c;->H:I

    .line 123
    return-void
.end method

.method public static a(Landroid/net/wifi/WifiManager$WifiLock;)V
    .locals 0

    .line 146
    sput-object p0, Lcom/huawei/logupload/c/c;->M:Landroid/net/wifi/WifiManager$WifiLock;

    .line 147
    return-void
.end method

.method public static a(Landroid/os/PowerManager$WakeLock;)V
    .locals 0

    .line 138
    sput-object p0, Lcom/huawei/logupload/c/c;->L:Landroid/os/PowerManager$WakeLock;

    .line 139
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .line 114
    sput-object p0, Lcom/huawei/logupload/c/c;->O:Ljava/lang/String;

    .line 115
    return-void
.end method

.method public static a(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 130
    sput-object p0, Lcom/huawei/logupload/c/c;->N:Ljava/util/Map;

    .line 131
    return-void
.end method

.method public static b()I
    .locals 1

    .line 118
    sget v0, Lcom/huawei/logupload/c/c;->H:I

    return v0
.end method

.method public static b(I)V
    .locals 0

    .line 154
    sput p0, Lcom/huawei/logupload/c/c;->I:I

    .line 155
    return-void
.end method

.method public static c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 126
    sget-object v0, Lcom/huawei/logupload/c/c;->N:Ljava/util/Map;

    return-object v0
.end method

.method public static c(I)V
    .locals 0

    .line 162
    sput p0, Lcom/huawei/logupload/c/c;->J:I

    .line 163
    return-void
.end method

.method public static d()Landroid/os/PowerManager$WakeLock;
    .locals 1

    .line 134
    sget-object v0, Lcom/huawei/logupload/c/c;->L:Landroid/os/PowerManager$WakeLock;

    return-object v0
.end method

.method public static d(I)V
    .locals 0

    .line 174
    sput p0, Lcom/huawei/logupload/c/c;->K:I

    .line 175
    return-void
.end method

.method public static e()Landroid/net/wifi/WifiManager$WifiLock;
    .locals 1

    .line 142
    sget-object v0, Lcom/huawei/logupload/c/c;->M:Landroid/net/wifi/WifiManager$WifiLock;

    return-object v0
.end method

.method public static f()I
    .locals 1

    .line 150
    sget v0, Lcom/huawei/logupload/c/c;->I:I

    return v0
.end method

.method public static g()I
    .locals 1

    .line 158
    sget v0, Lcom/huawei/logupload/c/c;->J:I

    return v0
.end method

.method public static h()Ljava/lang/String;
    .locals 1

    .line 166
    const-string v0, "Ej1Nxlg"

    return-object v0
.end method

.method public static i()I
    .locals 1

    .line 170
    sget v0, Lcom/huawei/logupload/c/c;->K:I

    return v0
.end method
