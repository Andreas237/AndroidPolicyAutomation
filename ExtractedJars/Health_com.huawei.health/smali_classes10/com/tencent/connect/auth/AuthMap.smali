.class public Lcom/tencent/connect/auth/AuthMap;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/connect/auth/AuthMap$Auth;
    }
.end annotation


# static fields
.field static final synthetic a:Z

.field private static b:I

.field public static sInstance:Lcom/tencent/connect/auth/AuthMap;


# instance fields
.field public final KEY_CHAR_LIST:Ljava/lang/String;

.field public authMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/tencent/connect/auth/AuthMap$Auth;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    const-class v0, Lcom/tencent/connect/auth/AuthMap;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/tencent/connect/auth/AuthMap;->a:Z

    .line 11
    const/4 v0, 0x0

    sput v0, Lcom/tencent/connect/auth/AuthMap;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/tencent/connect/auth/AuthMap;->authMap:Ljava/util/HashMap;

    .line 53
    const-string v0, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

    iput-object v0, p0, Lcom/tencent/connect/auth/AuthMap;->KEY_CHAR_LIST:Ljava/lang/String;

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 74
    sget-boolean v0, Lcom/tencent/connect/auth/AuthMap;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 75
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    const/4 v4, 0x0

    .line 77
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    .line 79
    const/4 v6, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v7, v0, 0x2

    :goto_0
    if-ge v6, v7, :cond_1

    .line 80
    mul-int/lit8 v0, v6, 0x2

    mul-int/lit8 v1, v6, 0x2

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 81
    const/16 v0, 0x10

    invoke-static {v8, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 83
    invoke-virtual {p2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v10

    .line 84
    xor-int v11, v9, v10

    .line 86
    int-to-char v0, v11

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    add-int/lit8 v4, v4, 0x1

    .line 89
    rem-int/2addr v4, v5

    .line 79
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance()Lcom/tencent/connect/auth/AuthMap;
    .locals 2

    .line 22
    sget-object v0, Lcom/tencent/connect/auth/AuthMap;->sInstance:Lcom/tencent/connect/auth/AuthMap;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 23
    new-instance v0, Lcom/tencent/connect/auth/AuthMap;

    invoke-direct {v0}, Lcom/tencent/connect/auth/AuthMap;-><init>()V

    sput-object v0, Lcom/tencent/connect/auth/AuthMap;->sInstance:Lcom/tencent/connect/auth/AuthMap;

    .line 25
    :cond_0
    sget-object v0, Lcom/tencent/connect/auth/AuthMap;->sInstance:Lcom/tencent/connect/auth/AuthMap;

    return-object v0
.end method

.method public static getSerial()I
    .locals 2

    .line 35
    sget v0, Lcom/tencent/connect/auth/AuthMap;->b:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/tencent/connect/auth/AuthMap;->b:I

    return v0
.end method


# virtual methods
.method public decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 70
    invoke-direct {p0, p1, p2}, Lcom/tencent/connect/auth/AuthMap;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/String;)Lcom/tencent/connect/auth/AuthMap$Auth;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthMap;->authMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/connect/auth/AuthMap$Auth;

    return-object v0
.end method

.method public makeKey()Ljava/lang/String;
    .locals 10

    .line 56
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v4, v0

    .line 57
    const-string v0, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    .line 58
    array-length v6, v5

    .line 59
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 60
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v4, :cond_0

    .line 61
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    int-to-double v2, v6

    mul-double/2addr v0, v2

    double-to-int v9, v0

    .line 62
    aget-char v0, v5, v9

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 60
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v8

    .line 66
    return-object v8
.end method

.method public remove(Ljava/lang/String;)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthMap;->authMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    return-void
.end method

.method public set(Lcom/tencent/connect/auth/AuthMap$Auth;)Ljava/lang/String;
    .locals 5

    .line 39
    invoke-static {}, Lcom/tencent/connect/auth/AuthMap;->getSerial()I

    move-result v3

    .line 42
    :try_start_0
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthMap;->authMap:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    goto :goto_0

    .line 43
    :catch_0
    move-exception v4

    .line 44
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method