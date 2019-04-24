.class public final Lcom/tencent/map/b/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/map/b/c$b;,
        Lcom/tencent/map/b/c$a;
    }
.end annotation


# static fields
.field private static a:Lcom/tencent/map/b/c;


# instance fields
.field private b:J

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/tencent/map/b/c$a;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/tencent/map/b/c$b;>;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/map/b/c;->b:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/c;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/c;->d:Ljava/util/List;

    return-void
.end method

.method public static a()Lcom/tencent/map/b/c;
    .locals 1

    sget-object v0, Lcom/tencent/map/b/c;->a:Lcom/tencent/map/b/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/tencent/map/b/c;

    invoke-direct {v0}, Lcom/tencent/map/b/c;-><init>()V

    sput-object v0, Lcom/tencent/map/b/c;->a:Lcom/tencent/map/b/c;

    :cond_0
    sget-object v0, Lcom/tencent/map/b/c;->a:Lcom/tencent/map/b/c;

    return-object v0
.end method

.method private static a(Ljava/lang/StringBuffer;)Z
    .locals 8

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object p0, v0

    const-string v1, "location"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v0, "accuracy"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v6, v0

    const-wide v2, 0x40b3880000000000L    # 5000.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method private a(Ljava/util/List;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/net/wifi/ScanResult;>;)Z"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v4, 0x0

    iget-object v0, p0, Lcom/tencent/map/b/c;->d:Ljava/util/List;

    if-eqz v0, :cond_3

    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/tencent/map/b/c;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    iget-object v0, p0, Lcom/tencent/map/b/c;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/c$b;

    iget-object v6, v0, Lcom/tencent/map/b/c$b;->a:Ljava/lang/String;

    const/4 v7, 0x0

    :goto_1
    if-eqz v6, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    move v5, v0

    const/4 v1, 0x6

    if-lt v0, v1, :cond_4

    div-int/lit8 v0, v5, 0x2

    add-int/lit8 v0, v0, 0x1

    if-lt v4, v0, :cond_4

    const/4 v0, 0x1

    return v0

    :cond_4
    const/4 v0, 0x6

    if-ge v5, v0, :cond_5

    const/4 v0, 0x2

    if-lt v4, v0, :cond_5

    const/4 v0, 0x1

    return v0

    :cond_5
    iget-object v0, p0, Lcom/tencent/map/b/c;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_6

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-wide v6, v0

    iget-wide v2, p0, Lcom/tencent/map/b/c;->b:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    move-wide v8, v0

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-gtz v0, :cond_6

    const/4 v0, 0x1

    return v0

    :cond_6
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final a(IIIILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIILjava/util/List<Landroid/net/wifi/ScanResult;>;)V"
        }
    .end annotation

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/map/b/c;->b:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/c;->e:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    new-instance v2, Lcom/tencent/map/b/c$a;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lcom/tencent/map/b/c$a;-><init>(B)V

    iput p1, v2, Lcom/tencent/map/b/c$a;->a:I

    iput p2, v2, Lcom/tencent/map/b/c$a;->b:I

    iput p3, v2, Lcom/tencent/map/b/c$a;->c:I

    iput p4, v2, Lcom/tencent/map/b/c$a;->d:I

    iget-object v0, p0, Lcom/tencent/map/b/c;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p5, :cond_0

    iget-object v0, p0, Lcom/tencent/map/b/c;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    new-instance p2, Lcom/tencent/map/b/c$b;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/tencent/map/b/c$b;-><init>(B)V

    invoke-interface {p5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget-object v0, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    iput-object v0, p2, Lcom/tencent/map/b/c$b;->a:Ljava/lang/String;

    invoke-interface {p5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    iget v0, v0, Landroid/net/wifi/ScanResult;->level:I

    iget-object v0, p0, Lcom/tencent/map/b/c;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/map/b/c;->e:Ljava/lang/String;

    return-void
.end method

.method public final b(IIIILjava/util/List;)Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIILjava/util/List<Landroid/net/wifi/ScanResult;>;)Ljava/lang/String;"
        }
    .end annotation

    iget-object v0, p0, Lcom/tencent/map/b/c;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/map/b/c;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v5, p0, Lcom/tencent/map/b/c;->e:Ljava/lang/String;

    move-object/from16 v6, p5

    move-object v4, p0

    if-eqz v5, :cond_2

    if-nez v6, :cond_3

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-wide v8, v0

    iget-wide v2, v4, Lcom/tencent/map/b/c;->b:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    move-wide v10, v0

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_6

    :cond_4
    const-wide/32 v0, 0xafc8

    cmp-long v0, v10, v0

    if-lez v0, :cond_5

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_6

    :cond_5
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4, v5}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Lcom/tencent/map/b/c;->a(Ljava/lang/StringBuffer;)Z

    move-result v0

    move v4, v0

    if-eqz v0, :cond_6

    move-object v0, v5

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/tencent/map/b/c;->e:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/c;->e:Ljava/lang/String;

    if-nez v0, :cond_7

    const/4 v0, 0x0

    return-object v0

    :cond_7
    iget-object v0, p0, Lcom/tencent/map/b/c;->c:Ljava/util/List;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/tencent/map/b/c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_d

    iget-object v0, p0, Lcom/tencent/map/b/c;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/tencent/map/b/c$a;

    iget v0, v4, Lcom/tencent/map/b/c$a;->a:I

    if-ne v0, p1, :cond_8

    iget v0, v4, Lcom/tencent/map/b/c$a;->b:I

    if-ne v0, p2, :cond_8

    iget v0, v4, Lcom/tencent/map/b/c$a;->c:I

    if-ne v0, p3, :cond_8

    iget v0, v4, Lcom/tencent/map/b/c$a;->d:I

    move/from16 v1, p4

    if-eq v0, v1, :cond_9

    :cond_8
    const/4 v0, 0x0

    return-object v0

    :cond_9
    iget-object v0, p0, Lcom/tencent/map/b/c;->d:Ljava/util/List;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/tencent/map/b/c;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_c

    :cond_a
    if-eqz p5, :cond_b

    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    iget-object v0, p0, Lcom/tencent/map/b/c;->e:Ljava/lang/String;

    return-object v0

    :cond_c
    move-object/from16 v0, p5

    invoke-direct {p0, v0}, Lcom/tencent/map/b/c;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/tencent/map/b/c;->e:Ljava/lang/String;

    return-object v0

    :cond_d
    move-object/from16 v0, p5

    invoke-direct {p0, v0}, Lcom/tencent/map/b/c;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/tencent/map/b/c;->e:Ljava/lang/String;

    return-object v0

    :cond_e
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/c;->e:Ljava/lang/String;

    return-void
.end method
