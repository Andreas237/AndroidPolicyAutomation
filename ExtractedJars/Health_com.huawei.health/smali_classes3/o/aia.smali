.class public Lo/aia;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/Object;

.field private static e:Lo/aia;


# instance fields
.field private a:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/net/wifi/ScanResult;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ajd;>;"
        }
    .end annotation
.end field

.field private f:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/aia;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "G"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "H"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "J"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "I"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/aia;->f:[Ljava/lang/String;

    .line 70
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/aia;->a:Landroid/content/Context;

    .line 71
    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 3

    .line 291
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    const/4 v0, 0x0

    return v0

    .line 296
    :cond_0
    const-string v0, "_5G"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 297
    const/4 v0, 0x0

    return v0

    .line 299
    :cond_1
    const-string v0, "^Hi(\\w{1})(\\w{1})([\\w^_]{4})(\\w{1})([\\w^_]{1})([\\w^_]{10,31})"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 300
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 301
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method

.method private b(Lo/afj;Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/afj;Ljava/util/List<Landroid/net/wifi/ScanResult;>;)Ljava/util/List<Lo/ajd;>;"
        }
    .end annotation

    .line 266
    invoke-direct {p0, p2}, Lo/aia;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 267
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 268
    :cond_0
    return-object v2

    .line 270
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 271
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ajd;

    .line 272
    iget-object v0, p1, Lo/afj;->h:Lo/ace;

    invoke-virtual {v5}, Lo/ajd;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ace;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 273
    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/ajd;->b(Ljava/lang/String;)V

    .line 274
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    :cond_2
    goto :goto_0

    .line 277
    :cond_3
    return-object v3
.end method

.method public static b(Landroid/content/Context;)Lo/aia;
    .locals 3

    .line 60
    sget-object v1, Lo/aia;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 61
    :try_start_0
    sget-object v0, Lo/aia;->e:Lo/aia;

    if-nez v0, :cond_0

    .line 62
    new-instance v0, Lo/aia;

    invoke-direct {v0, p0}, Lo/aia;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/aia;->e:Lo/aia;

    .line 64
    :cond_0
    sget-object v0, Lo/aia;->e:Lo/aia;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 65
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private c(Ljava/util/List;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/net/wifi/ScanResult;>;)Ljava/util/List<Lo/ajd;>;"
        }
    .end annotation

    .line 153
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 154
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 155
    return-object v4

    .line 157
    :cond_0
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAddDeviceInfosByResult enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 158
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/net/wifi/ScanResult;

    .line 159
    iget-object v7, v6, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    .line 160
    const-string v8, ""

    .line 161
    const-string v9, ""

    .line 162
    const/4 v10, -0x1

    .line 167
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SSID is null ???!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 169
    goto :goto_0

    .line 172
    :cond_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    if-eq v1, v0, :cond_2

    .line 173
    goto :goto_0

    .line 176
    :cond_2
    const-string v0, "Hi- "

    invoke-virtual {v7, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 177
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Hi- , SoftAp branch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 178
    const-string v0, "-"

    invoke-virtual {v7, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    .line 179
    array-length v0, v12

    const/4 v1, 0x4

    if-ne v1, v0, :cond_3

    const/4 v0, 0x3

    aget-object v0, v12, v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-le v1, v0, :cond_4

    .line 180
    :cond_3
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ssid split faild:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v12

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 181
    goto/16 :goto_0

    .line 184
    :cond_4
    const-string v0, "[0-9A-Za-z]+"

    const/4 v1, 0x3

    aget-object v1, v12, v1

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 185
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ssid[3] is not avalid\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x3

    aget-object v3, v12, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 186
    goto/16 :goto_0

    .line 189
    :cond_5
    const/4 v0, 0x3

    aget-object v0, v12, v0

    const/4 v1, 0x1

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 190
    const/4 v0, 0x3

    aget-object v0, v12, v0

    const/4 v1, 0x5

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 191
    const-string v0, "0"

    const/4 v1, 0x3

    aget-object v1, v12, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 192
    new-instance v0, Lo/ajp;

    const-string v1, "B"

    invoke-direct {v0, v1}, Lo/ajp;-><init>(Ljava/lang/String;)V

    move-object v13, v0

    .line 193
    invoke-virtual {v13}, Lo/ajp;->b()I

    move-result v10

    .line 194
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 195
    goto :goto_1

    .line 196
    :cond_6
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mode is not 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 197
    goto/16 :goto_0

    .line 199
    :goto_1
    new-instance v0, Lo/ajd;

    move-object v1, v7

    move-object v2, v9

    move v3, v10

    invoke-direct {v0, v1, v2, v3}, Lo/ajd;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    move-object v13, v0

    .line 200
    const-string v0, "softap"

    invoke-virtual {v13, v0}, Lo/ajd;->i(Ljava/lang/String;)V

    .line 201
    iget-object v0, v6, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    invoke-virtual {v13, v0}, Lo/ajd;->h(Ljava/lang/String;)V

    .line 202
    invoke-virtual {v13, v8}, Lo/ajd;->a(Ljava/lang/String;)V

    .line 203
    invoke-interface {v4, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v13}, Lo/ajd;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 205
    goto/16 :goto_0

    .line 207
    :cond_7
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v7}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  len:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 210
    invoke-static {v7}, Lo/aia;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lo/aia;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 211
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "broadcast branch"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v7}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 212
    const-string v0, "^Hi(\\w{1})(\\w{1})([\\w^_]{4})(\\w{1})([\\w^_]{1})([\\w^_]{10,31})"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v12

    .line 213
    invoke-virtual {v12, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v13

    .line 214
    :goto_2
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 215
    const/4 v0, 0x3

    invoke-virtual {v13, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    .line 216
    const/4 v0, 0x4

    invoke-virtual {v13, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v9

    .line 217
    const/4 v0, 0x5

    invoke-virtual {v13, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v14

    .line 218
    new-instance v0, Lo/ajp;

    move-object v1, v14

    invoke-direct {v0, v1}, Lo/ajp;-><init>(Ljava/lang/String;)V

    move-object v15, v0

    .line 219
    invoke-virtual {v15}, Lo/ajp;->b()I

    move-result v10

    .line 220
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceSn :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 221
    goto :goto_2

    .line 222
    :cond_8
    new-instance v0, Lo/ajd;

    move-object v1, v7

    move-object v2, v9

    move v3, v10

    invoke-direct {v0, v1, v2, v3}, Lo/ajd;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    move-object v14, v0

    .line 223
    const-string v0, "wifiap"

    invoke-virtual {v14, v0}, Lo/ajd;->i(Ljava/lang/String;)V

    .line 224
    iget-object v11, v6, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    .line 225
    invoke-virtual {v14, v11}, Lo/ajd;->h(Ljava/lang/String;)V

    .line 226
    invoke-virtual {v14, v8}, Lo/ajd;->a(Ljava/lang/String;)V

    .line 227
    invoke-interface {v4, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    :cond_9
    goto/16 :goto_0

    .line 230
    :cond_a
    return-object v4
.end method


# virtual methods
.method public b(Ljava/lang/String;)I
    .locals 9

    .line 366
    const/4 v4, -0x1

    .line 367
    invoke-static {p1}, Lo/aia;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lo/aia;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 368
    const-string v0, "^Hi(\\w{1})(\\w{1})([\\w^_]{4})(\\w{1})([\\w^_]{1})([\\w^_]{10,31})"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    .line 369
    invoke-virtual {v5, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    .line 370
    :goto_0
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 371
    const/4 v0, 0x5

    invoke-virtual {v6, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    .line 372
    new-instance v8, Lo/ajp;

    invoke-direct {v8, v7}, Lo/ajp;-><init>(Ljava/lang/String;)V

    .line 373
    invoke-virtual {v8}, Lo/ajp;->b()I

    move-result v4

    .line 374
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EncryptMode :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 375
    goto :goto_0

    .line 377
    :cond_0
    return v4
.end method

.method public c(Lo/ajd;)Ljava/lang/String;
    .locals 8

    .line 79
    const-string v4, ""

    .line 80
    if-eqz p1, :cond_1

    .line 81
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "scanSelectWifiAP info "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/ajd;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 82
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scanSelectWifiAP ssid:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 84
    iget-object v0, p0, Lo/aia;->a:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/net/wifi/WifiManager;

    .line 86
    invoke-virtual {v5}, Landroid/net/wifi/WifiManager;->startScan()Z

    .line 88
    invoke-virtual {v5}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/ajc;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/aia;->c:Ljava/util/List;

    .line 90
    iget-object v0, p0, Lo/aia;->c:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/aia;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/aia;->d:Ljava/util/List;

    .line 91
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scanSelectWifiAP device size:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aia;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lo/aia;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ajd;

    .line 93
    invoke-virtual {p1}, Lo/ajd;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/ajd;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lo/ajd;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {v7}, Lo/ajd;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/aia;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 95
    :cond_0
    goto :goto_0

    .line 97
    :cond_1
    return-object v4
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 109
    const-string v4, ""

    .line 110
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    .line 111
    invoke-static {p1}, Lo/aia;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x13

    if-le v5, v0, :cond_0

    .line 112
    const-string v0, "^Hi(\\w{1})(\\w{1})([\\w^_]{4})(\\w{1})([\\w^_]{1})([\\w^_]{10,31})"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    .line 113
    invoke-virtual {v6, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    .line 114
    :goto_0
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 118
    :cond_0
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchDeviceWorkStatusMsg "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 119
    return-object v4
.end method

.method public d(Lo/aiv;)Lo/ajd;
    .locals 13

    .line 315
    new-instance v4, Lo/ajd;

    invoke-direct {v4}, Lo/ajd;-><init>()V

    .line 322
    const-string v11, "0000"

    .line 323
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    iget-object v0, p1, Lo/aiv;->c:Lo/aiv$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 324
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "model is :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 325
    iget-object v5, p1, Lo/aiv;->e:Ljava/lang/String;

    .line 326
    iget-object v0, p1, Lo/aiv;->c:Lo/aiv$e;

    iget-object v6, v0, Lo/aiv$e;->a:Ljava/lang/String;

    .line 327
    iget-object v0, p1, Lo/aiv;->c:Lo/aiv$e;

    iget-object v7, v0, Lo/aiv$e;->e:Ljava/lang/String;

    .line 328
    iget-object v0, p1, Lo/aiv;->c:Lo/aiv$e;

    iget-object v8, v0, Lo/aiv$e;->b:Ljava/lang/String;

    .line 329
    iget-object v0, p1, Lo/aiv;->c:Lo/aiv$e;

    iget-object v11, v0, Lo/aiv$e;->d:Ljava/lang/String;

    .line 330
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 331
    :cond_0
    return-object v4

    .line 334
    :cond_1
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 335
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v8, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    .line 337
    :cond_2
    iget-object v0, p1, Lo/aiv;->c:Lo/aiv$e;

    iget-object v9, v0, Lo/aiv$e;->g:Ljava/lang/String;

    .line 338
    iget-object v10, p1, Lo/aiv;->a:Ljava/lang/String;

    .line 341
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Hi"

    .line 342
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 343
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "000000000000000000000000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 348
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 349
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseCoapEntityToDeviceInfo: ssid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 350
    invoke-virtual {v4, v11}, Lo/ajd;->a(Ljava/lang/String;)V

    .line 351
    invoke-virtual {v4, v12}, Lo/ajd;->d(Ljava/lang/String;)V

    .line 352
    invoke-virtual {v4, v5}, Lo/ajd;->e(Ljava/lang/String;)V

    .line 353
    invoke-virtual {v4, v8}, Lo/ajd;->c(Ljava/lang/String;)V

    .line 354
    invoke-virtual {v4, v9}, Lo/ajd;->h(Ljava/lang/String;)V

    .line 355
    invoke-virtual {v4, v10}, Lo/ajd;->k(Ljava/lang/String;)V

    .line 356
    const-string v0, "coap"

    invoke-virtual {v4, v0}, Lo/ajd;->i(Ljava/lang/String;)V

    .line 357
    goto :goto_0

    .line 358
    :cond_3
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "COAP Scan devInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 360
    :goto_0
    return-object v4
.end method

.method public e(Lo/afj;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/afj;)Ljava/util/List<Lo/ajd;>;"
        }
    .end annotation

    .line 131
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "------scanWifiAP----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lo/aia;->a:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/wifi/WifiManager;

    .line 136
    invoke-virtual {v4}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/ajc;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/aia;->c:Ljava/util/List;

    .line 139
    iget-object v0, p0, Lo/aia;->c:Ljava/util/List;

    invoke-direct {p0, p1, v0}, Lo/aia;->b(Lo/afj;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/aia;->d:Ljava/util/List;

    .line 140
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "scanWifiAP mAddDeviceInfos size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/aia;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lo/aia;->d:Ljava/util/List;

    return-object v0
.end method

.method public e(Ljava/lang/String;)Z
    .locals 11

    .line 241
    invoke-static {p1}, Lo/aia;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x13

    if-le v0, v1, :cond_2

    .line 242
    const-string v0, "DeviceWifiAP"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CheckSpecialStatusSsid "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 243
    const-string v0, "^Hi(\\w{1})(\\w{1})([\\w^_]{4})(\\w{1})([\\w^_]{1})([\\w^_]{10,31})"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 244
    invoke-virtual {v4, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 245
    const-string v6, ""

    .line 246
    :goto_0
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 247
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 249
    :cond_0
    iget-object v7, p0, Lo/aia;->f:[Ljava/lang/String;

    array-length v8, v7

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_2

    aget-object v10, v7, v9

    .line 250
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    const/4 v0, 0x0

    return v0

    .line 249
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 255
    :cond_2
    const/4 v0, 0x1

    return v0
.end method
