.class public Lcom/tencent/stat/DeviceInfo;
.super Ljava/lang/Object;


# static fields
.field public static final NEW_USER:I = 0x0

.field public static final OLD_USER:I = 0x1

.field public static final TAG_ANDROID_ID:Ljava/lang/String; = "aid"

.field public static final TAG_FLAG:Ljava/lang/String; = "__MTA_DEVICE_INFO__"

.field public static final TAG_IMEI:Ljava/lang/String; = "ui"

.field public static final TAG_MAC:Ljava/lang/String; = "mc"

.field public static final TAG_MID:Ljava/lang/String; = "mid"

.field public static final TAG_TIMESTAMPS:Ljava/lang/String; = "ts"

.field public static final TAG_VERSION:Ljava/lang/String; = "ver"

.field public static final UPGRADE_USER:I = 0x2

.field private static h:Lcom/tencent/stat/common/StatLogger; = null


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/DeviceInfo;->h:Lcom/tencent/stat/common/StatLogger;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->c:Ljava/lang/String;

    const-string v0, "0"

    iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->d:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/DeviceInfo;->f:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/stat/DeviceInfo;->g:J

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->c:Ljava/lang/String;

    const-string v0, "0"

    iput-object v0, p0, Lcom/tencent/stat/DeviceInfo;->d:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/DeviceInfo;->f:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/stat/DeviceInfo;->g:J

    iput-object p1, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;

    iput p3, p0, Lcom/tencent/stat/DeviceInfo;->e:I

    return-void
.end method

.method static a(Ljava/lang/String;)Lcom/tencent/stat/DeviceInfo;
    .locals 4

    new-instance v2, Lcom/tencent/stat/DeviceInfo;

    invoke-direct {v2}, Lcom/tencent/stat/DeviceInfo;-><init>()V

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ui"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/stat/DeviceInfo;->d(Ljava/lang/String;)V

    :cond_0
    const-string v0, "mc"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "mc"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/stat/DeviceInfo;->e(Ljava/lang/String;)V

    :cond_1
    const-string v0, "mid"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "mid"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/stat/DeviceInfo;->c(Ljava/lang/String;)V

    :cond_2
    const-string v0, "aid"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "aid"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/stat/DeviceInfo;->b(Ljava/lang/String;)V

    :cond_3
    const-string v0, "ts"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "ts"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/tencent/stat/DeviceInfo;->a(J)V

    :cond_4
    const-string v0, "ver"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "ver"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/tencent/stat/DeviceInfo;->a(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/DeviceInfo;->h:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    :goto_0
    return-object v2
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/tencent/stat/DeviceInfo;->f:I

    return v0
.end method

.method a(Lcom/tencent/stat/DeviceInfo;)I
    .locals 9

    if-nez p1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/tencent/stat/DeviceInfo;->getMid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/tencent/stat/DeviceInfo;->getMid()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/tencent/stat/DeviceInfo;->a()I

    move-result v3

    invoke-virtual {p1}, Lcom/tencent/stat/DeviceInfo;->a()I

    move-result v4

    if-le v3, v4, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    if-ne v3, v4, :cond_5

    invoke-virtual {p0}, Lcom/tencent/stat/DeviceInfo;->b()J

    move-result-wide v5

    invoke-virtual {p1}, Lcom/tencent/stat/DeviceInfo;->b()J

    move-result-wide v7

    cmp-long v0, v5, v7

    if-lez v0, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    cmp-long v0, v5, v7

    if-nez v0, :cond_4

    const/4 v0, 0x0

    return v0

    :cond_4
    const/4 v0, -0x1

    return v0

    :cond_5
    const/4 v0, -0x1

    return v0
.end method

.method a(I)V
    .locals 0

    iput p1, p0, Lcom/tencent/stat/DeviceInfo;->f:I

    return-void
.end method

.method a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/tencent/stat/DeviceInfo;->g:J

    return-void
.end method

.method b()J
    .locals 2

    iget-wide v0, p0, Lcom/tencent/stat/DeviceInfo;->g:J

    return-wide v0
.end method

.method b(I)V
    .locals 0

    iput p1, p0, Lcom/tencent/stat/DeviceInfo;->e:I

    return-void
.end method

.method b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/stat/DeviceInfo;->c:Ljava/lang/String;

    return-void
.end method

.method c()Lorg/json/JSONObject;
    .locals 5

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "ui"

    :try_start_0
    iget-object v1, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mc"

    iget-object v1, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mid"

    iget-object v1, p0, Lcom/tencent/stat/DeviceInfo;->d:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "aid"

    iget-object v1, p0, Lcom/tencent/stat/DeviceInfo;->c:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ts"

    iget-wide v1, p0, Lcom/tencent/stat/DeviceInfo;->g:J

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "ver"

    iget v1, p0, Lcom/tencent/stat/DeviceInfo;->f:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    sget-object v0, Lcom/tencent/stat/DeviceInfo;->h:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v4}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    :goto_0
    return-object v3
.end method

.method c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/stat/DeviceInfo;->d:Ljava/lang/String;

    return-void
.end method

.method d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;

    return-void
.end method

.method e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;

    return-void
.end method

.method public getImei()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/stat/DeviceInfo;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getMac()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/stat/DeviceInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getMid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/stat/DeviceInfo;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getUserType()I
    .locals 1

    iget v0, p0, Lcom/tencent/stat/DeviceInfo;->e:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/tencent/stat/DeviceInfo;->c()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
