.class public Lo/cwg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/vv;


# static fields
.field private static a:I


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    const/4 v0, 0x0

    sput v0, Lo/cwg;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const-class v0, Lo/cwg;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cwg;->b:Ljava/lang/String;

    return-void
.end method

.method static synthetic b(Lo/cwg;Lo/dwe;)Lo/xh;
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Lo/cwg;->d(Lo/dwe;)Lo/xh;

    move-result-object v0

    return-object v0
.end method

.method private d(Lo/dwe;)Lo/xh;
    .locals 5

    .line 73
    iget-object v0, p0, Lo/cwg;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter convertData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    const/4 v4, 0x0

    .line 75
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 76
    invoke-static {}, Lo/xh;->c()Lo/xh$c;

    move-result-object v0

    invoke-virtual {p1}, Lo/dwe;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/xh$c;->e(I)Lo/xh$c;

    move-result-object v0

    invoke-virtual {p1}, Lo/dwe;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/xh$c;->c(I)Lo/xh$c;

    move-result-object v0

    invoke-virtual {p1}, Lo/dwe;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/xh$c;->b(Ljava/lang/String;)Lo/xh$c;

    move-result-object v0

    .line 77
    invoke-virtual {p1}, Lo/dwe;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/xh$c;->a(I)Lo/xh$c;

    move-result-object v0

    invoke-virtual {p1}, Lo/dwe;->e()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/xh$c;->e(D)Lo/xh$c;

    move-result-object v0

    invoke-virtual {p1}, Lo/dwe;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/xh$c;->e(I)Lo/xh$c;

    move-result-object v0

    invoke-virtual {p1}, Lo/dwe;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/xh$c;->d(Ljava/lang/String;)Lo/xh$c;

    move-result-object v0

    .line 78
    invoke-virtual {p1}, Lo/dwe;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/xh$c;->b(I)Lo/xh$c;

    move-result-object v0

    invoke-virtual {v0}, Lo/xh$c;->d()Lo/xh;

    move-result-object v4

    goto :goto_0

    .line 80
    :cond_0
    invoke-static {}, Lo/xh;->c()Lo/xh$c;

    move-result-object v0

    invoke-virtual {v0}, Lo/xh$c;->d()Lo/xh;

    move-result-object v4

    .line 82
    :goto_0
    const/4 v0, 0x1

    iput v0, v4, Lo/xh;->e:I

    .line 83
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, ""

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, v4, Lo/xh;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-object v4
.end method

.method public static d(I)V
    .locals 0

    .line 50
    sput p0, Lo/cwg;->a:I

    .line 51
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 137
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v1

    .line 138
    return-object v1
.end method

.method public b()V
    .locals 2

    .line 143
    new-instance v1, Lo/czr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/czr;-><init>(Landroid/content/Context;)V

    .line 144
    invoke-virtual {v1}, Lo/czr;->b()V

    .line 145
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 132
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    .line 121
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    .line 122
    return-object v1
.end method

.method public d(Lo/xk;Landroid/content/Context;)Lo/xh;
    .locals 6

    .line 56
    iget-object v0, p0, Lo/cwg;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter convertData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    invoke-static {p2}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v4

    .line 58
    new-instance v0, Lo/cwg$3;

    invoke-direct {v0, p0, p1}, Lo/cwg$3;-><init>(Lo/cwg;Lo/xk;)V

    invoke-virtual {v4, v0, p2}, Lo/dth;->b(Lo/duj;Landroid/content/Context;)Lo/dwe;

    move-result-object v5

    .line 67
    invoke-direct {p0, v5}, Lo/cwg;->d(Lo/dwe;)Lo/xh;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 9

    .line 98
    iget-object v0, p0, Lo/cwg;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter shareBitmapAndText"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 100
    const-string p3, ""

    .line 102
    :cond_0
    move-object v0, p1

    const-string v2, ""

    move-object v3, p3

    move-object v4, p2

    const-string v5, ""

    move-object v6, p4

    sget-object v1, Lo/dae;->z:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    const/4 v1, 0x1

    const/4 v7, 0x0

    invoke-static/range {v0 .. v8}, Lo/fjy;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;ZLjava/lang/String;)V

    .line 103
    return-void
.end method

.method public d(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 106
    iget-object v0, p0, Lo/cwg;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getTodayFitnessTotalData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 108
    iget-object v0, p0, Lo/cwg;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 110
    const-string v0, ""

    const v1, 0x186a1

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 113
    :cond_0
    iget-object v0, p0, Lo/cwg;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTodayFitnessTotalData todaytotalstep="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, Lo/cwg;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 115
    sget v0, Lo/cwg;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 117
    :cond_1
    return-void
.end method

.method public e()Z
    .locals 1

    .line 127
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    return v0
.end method
