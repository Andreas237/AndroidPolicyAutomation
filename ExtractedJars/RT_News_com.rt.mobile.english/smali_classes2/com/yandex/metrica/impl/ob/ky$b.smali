.class abstract Lcom/yandex/metrica/impl/ob/ky$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x11
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ky;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation


# static fields
.field static final a:Ljava/lang/Integer;

.field static final b:Ljava/lang/Integer;

.field static final c:Ljava/lang/Integer;

.field static final d:Ljava/lang/Integer;

.field static final e:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const v0, 0x7fffffff

    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sput-object v1, Lcom/yandex/metrica/impl/ob/ky$b;->a:Ljava/lang/Integer;

    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sput-object v1, Lcom/yandex/metrica/impl/ob/ky$b;->b:Ljava/lang/Integer;

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sput-object v1, Lcom/yandex/metrica/impl/ob/ky$b;->c:Ljava/lang/Integer;

    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sput-object v1, Lcom/yandex/metrica/impl/ob/ky$b;->d:Ljava/lang/Integer;

    .line 38
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/ky$b;->e:Ljava/lang/Integer;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a(Landroid/telephony/CellInfo;)Lcom/yandex/metrica/impl/ob/ky;
.end method

.method protected a(Ljava/lang/Integer;Ljava/lang/Integer;Landroid/telephony/CellSignalStrength;Ljava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/Integer;)Lcom/yandex/metrica/impl/ob/ky;
    .locals 17
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p8

    const/4 v5, 0x0

    if-eqz v0, :cond_1

    .line 53
    sget-object v6, Lcom/yandex/metrica/impl/ob/ky$b;->a:Ljava/lang/Integer;

    if-eq v0, v6, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    move-object v10, v0

    goto :goto_1

    :cond_1
    move-object v10, v5

    :goto_1
    if-eqz v1, :cond_3

    .line 57
    sget-object v0, Lcom/yandex/metrica/impl/ob/ky$b;->b:Ljava/lang/Integer;

    if-eq v1, v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v5

    :goto_2
    move-object v9, v1

    goto :goto_3

    :cond_3
    move-object v9, v5

    :goto_3
    if-eqz p3, :cond_4

    .line 59
    invoke-virtual/range {p3 .. p3}, Landroid/telephony/CellSignalStrength;->getDbm()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v13, v0

    goto :goto_4

    :cond_4
    move-object v13, v5

    :goto_4
    if-eqz v3, :cond_6

    .line 63
    sget-object v0, Lcom/yandex/metrica/impl/ob/ky$b;->c:Ljava/lang/Integer;

    if-eq v3, v0, :cond_5

    goto :goto_5

    :cond_5
    move-object v3, v5

    :goto_5
    move-object v7, v3

    goto :goto_6

    :cond_6
    move-object v7, v5

    :goto_6
    if-eqz v2, :cond_8

    .line 67
    sget-object v0, Lcom/yandex/metrica/impl/ob/ky$b;->d:Ljava/lang/Integer;

    if-eq v2, v0, :cond_7

    goto :goto_7

    :cond_7
    move-object v2, v5

    :goto_7
    move-object v8, v2

    goto :goto_8

    :cond_8
    move-object v8, v5

    :goto_8
    if-eqz v4, :cond_9

    .line 69
    sget-object v0, Lcom/yandex/metrica/impl/ob/ky$b;->e:Ljava/lang/Integer;

    if-eq v4, v0, :cond_9

    move-object/from16 v16, v4

    goto :goto_9

    :cond_9
    move-object/from16 v16, v5

    .line 71
    :goto_9
    new-instance v0, Lcom/yandex/metrica/impl/ob/ky;

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v6, v0

    move/from16 v14, p6

    move/from16 v15, p7

    invoke-direct/range {v6 .. v16}, Lcom/yandex/metrica/impl/ob/ky;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Integer;)V

    return-object v0
.end method
