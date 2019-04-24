.class public Lo/ana;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static g:Landroid/content/Context;

.field private static m:Lo/ana;


# instance fields
.field private a:F

.field private b:I

.field private c:F

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:F

.field private h:F

.field private i:I

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    const/4 v0, 0x0

    sput-object v0, Lo/ana;->g:Landroid/content/Context;

    .line 52
    const/4 v0, 0x0

    sput-object v0, Lo/ana;->m:Lo/ana;

    return-void
.end method

.method private constructor <init>()V
    .locals 9

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-string v0, "com.huawei.health"

    iput-object v0, p0, Lo/ana;->e:Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/ana;->i:I

    .line 40
    const/high16 v0, 0x42700000    # 60.0f

    iput v0, p0, Lo/ana;->h:F

    .line 44
    const/high16 v0, 0x432a0000    # 170.0f

    iput v0, p0, Lo/ana;->f:F

    .line 48
    const/4 v0, -0x1

    iput v0, p0, Lo/ana;->k:I

    .line 79
    sget-object v0, Lo/ana;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->u(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v6

    .line 80
    sget-object v0, Lo/ana;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->s(Landroid/content/Context;)I

    move-result v7

    .line 82
    if-eqz v6, :cond_0

    const/4 v0, 0x0

    :try_start_0
    aget-object v0, v6, v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    aget-object v0, v6, v0

    .line 83
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 84
    move-object v0, p0

    const/4 v1, 0x0

    aget-object v1, v6, v1

    const/4 v2, 0x1

    aget-object v2, v6, v2

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    const/4 v3, 0x2

    aget-object v3, v6, v3

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    const/4 v4, 0x3

    aget-object v4, v6, v4

    .line 85
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    move v5, v7

    .line 84
    invoke-virtual/range {v0 .. v5}, Lo/ana;->e(Ljava/lang/String;FFII)V

    goto :goto_0

    .line 88
    :cond_0
    move-object v0, p0

    iget-object v1, p0, Lo/ana;->e:Ljava/lang/String;

    iget v2, p0, Lo/ana;->h:F

    iget v3, p0, Lo/ana;->f:F

    iget v4, p0, Lo/ana;->i:I

    move v5, v7

    invoke-virtual/range {v0 .. v5}, Lo/ana;->e(Ljava/lang/String;FFII)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    :goto_0
    goto :goto_1

    .line 91
    :catch_0
    move-exception v8

    .line 92
    const-string v0, "UserInfo"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException ex"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    :goto_1
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 0

    .line 61
    sput-object p0, Lo/ana;->g:Landroid/content/Context;

    .line 62
    return-void
.end method

.method public static c()Lo/ana;
    .locals 3

    .line 65
    const-class v1, Lo/ana;

    monitor-enter v1

    .line 66
    :try_start_0
    sget-object v0, Lo/ana;->m:Lo/ana;

    if-nez v0, :cond_0

    .line 67
    new-instance v0, Lo/ana;

    invoke-direct {v0}, Lo/ana;-><init>()V

    sput-object v0, Lo/ana;->m:Lo/ana;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 71
    :goto_0
    sget-object v0, Lo/ana;->m:Lo/ana;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lo/ana;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()F
    .locals 1

    .line 150
    iget v0, p0, Lo/ana;->a:F

    return v0
.end method

.method public d()I
    .locals 1

    .line 132
    iget v0, p0, Lo/ana;->b:I

    return v0
.end method

.method public e()F
    .locals 1

    .line 141
    iget v0, p0, Lo/ana;->c:F

    return v0
.end method

.method public final e(Ljava/lang/String;FFII)V
    .locals 4

    .line 103
    iget v0, p0, Lo/ana;->a:F

    cmpl-float v0, p2, v0

    if-nez v0, :cond_0

    iget v0, p0, Lo/ana;->c:F

    cmpl-float v0, p3, v0

    if-nez v0, :cond_0

    iget v0, p0, Lo/ana;->k:I

    if-eq p5, v0, :cond_1

    .line 104
    :cond_0
    const-string v0, "Step_UserInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userInfo changed detail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    :cond_1
    iget-object v0, p0, Lo/ana;->e:Ljava/lang/String;

    iput-object v0, p0, Lo/ana;->d:Ljava/lang/String;

    .line 107
    iput p2, p0, Lo/ana;->a:F

    .line 108
    iput p3, p0, Lo/ana;->c:F

    .line 109
    iput p4, p0, Lo/ana;->b:I

    .line 110
    iput p5, p0, Lo/ana;->k:I

    .line 111
    sget-object v0, Lo/ana;->g:Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 112
    sget-object v0, Lo/ana;->g:Landroid/content/Context;

    iget-object v1, p0, Lo/ana;->e:Ljava/lang/String;

    invoke-static {v0, v1, p2, p3, p4}, Lo/amy;->a(Landroid/content/Context;Ljava/lang/String;FFI)V

    .line 114
    sget-object v0, Lo/ana;->g:Landroid/content/Context;

    invoke-static {v0, p5}, Lo/amy;->e(Landroid/content/Context;I)V

    .line 116
    :cond_2
    return-void
.end method

.method public h()I
    .locals 1

    .line 159
    iget v0, p0, Lo/ana;->k:I

    return v0
.end method
