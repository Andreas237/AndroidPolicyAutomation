.class public Lo/fgb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fgb$b;
    }
.end annotation


# static fields
.field private static a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/cmo;>;"
        }
    .end annotation
.end field

.field private static e:Lo/fgb;


# instance fields
.field private b:Landroid/content/Context;

.field private d:Lo/cmj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/fgb;->a:Ljava/util/ArrayList;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/fgb;->b:Landroid/content/Context;

    .line 37
    return-void
.end method

.method static synthetic b()Ljava/util/ArrayList;
    .locals 1

    .line 18
    sget-object v0, Lo/fgb;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lo/fgb;
    .locals 2

    .line 29
    sget-object v0, Lo/fgb;->e:Lo/fgb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 30
    new-instance v0, Lo/fgb;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fgb;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/fgb;->e:Lo/fgb;

    .line 32
    :cond_0
    sget-object v0, Lo/fgb;->e:Lo/fgb;

    return-object v0
.end method

.method public static d()Ljava/lang/Integer;
    .locals 1

    .line 113
    const/16 v0, 0x3ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static d(Z)V
    .locals 5

    .line 108
    const-string v0, "Track_HealthOpenSDKUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNeedNoteRelogin:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lo/fgb;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "need_relogin"

    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 110
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 40
    iget-object v0, p0, Lo/fgb;->d:Lo/cmj;

    if-nez v0, :cond_0

    .line 41
    const-string v0, "TimeEat_HealthOpenSDKUtil"

    const-string v1, "Enter initHealthOpenSDK"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    new-instance v0, Lo/cmj;

    invoke-direct {v0}, Lo/cmj;-><init>()V

    iput-object v0, p0, Lo/fgb;->d:Lo/cmj;

    .line 43
    iget-object v0, p0, Lo/fgb;->d:Lo/cmj;

    iget-object v1, p0, Lo/fgb;->b:Landroid/content/Context;

    new-instance v2, Lo/fgb$b;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lo/fgb$b;-><init>(Lo/fgb$2;)V

    const-string v3, "HuaweiHealth"

    invoke-virtual {v0, v1, v2, v3}, Lo/cmj;->a(Landroid/content/Context;Lo/cmo;Ljava/lang/String;)I

    .line 44
    const-string v0, "TimeEat_HealthOpenSDKUtil"

    const-string v1, "Leave initHealthOpenSDK"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    :cond_0
    return-void
.end method

.method public a(Lo/cmo;)V
    .locals 1

    .line 98
    sget-object v0, Lo/fgb;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    sget-object v0, Lo/fgb;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    sget-object v0, Lo/fgb;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 101
    :cond_0
    return-void
.end method

.method public b(Lo/cmo;)V
    .locals 1

    .line 92
    sget-object v0, Lo/fgb;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    sget-object v0, Lo/fgb;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    sget-object v0, Lo/fgb;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    :cond_0
    return-void
.end method

.method public c()Lo/cmj;
    .locals 4

    .line 74
    const-string v0, "Track_HealthOpenSDKUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthOpenSDK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    iget-object v0, p0, Lo/fgb;->d:Lo/cmj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 76
    iget-object v0, p0, Lo/fgb;->d:Lo/cmj;

    return-object v0

    .line 78
    :cond_0
    const-string v0, "Track_HealthOpenSDKUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHealthOpenSDK no init success,init again"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    invoke-virtual {p0}, Lo/fgb;->a()V

    .line 80
    iget-object v0, p0, Lo/fgb;->d:Lo/cmj;

    return-object v0
.end method
