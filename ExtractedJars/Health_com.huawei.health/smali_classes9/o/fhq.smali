.class public Lo/fhq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/fhq;

.field private static final d:Ljava/lang/String;


# instance fields
.field private a:Lo/eaa;

.field private b:Landroid/content/Context;

.field private e:Lo/dnm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const-class v0, Lo/fhq;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/fhq;->d:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lo/fhq;->b:Landroid/content/Context;

    .line 36
    iget-object v0, p0, Lo/fhq;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iput-object v0, p0, Lo/fhq;->a:Lo/eaa;

    .line 37
    iget-object v0, p0, Lo/fhq;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iput-object v0, p0, Lo/fhq;->e:Lo/dnm;

    .line 38
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 20
    sget-object v0, Lo/fhq;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Lo/fhq;
    .locals 2

    .line 41
    sget-object v0, Lo/fhq;->c:Lo/fhq;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 42
    new-instance v0, Lo/fhq;

    invoke-direct {v0, p0}, Lo/fhq;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/fhq;->c:Lo/fhq;

    .line 44
    :cond_0
    sget-object v0, Lo/fhq;->c:Lo/fhq;

    return-object v0
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 2

    .line 137
    const/4 v0, 0x6

    if-ne p1, v0, :cond_0

    .line 138
    iget-object v0, p0, Lo/fhq;->e:Lo/dnm;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lo/dnm;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 140
    :cond_0
    iget-object v0, p0, Lo/fhq;->e:Lo/dnm;

    invoke-virtual {v0, p1}, Lo/dnm;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 172
    iget-object v0, p0, Lo/fhq;->e:Lo/dnm;

    invoke-virtual {v0, p1}, Lo/dnm;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 173
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 168
    iget-object v0, p0, Lo/fhq;->e:Lo/dnm;

    invoke-virtual {v0, p1}, Lo/dnm;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 169
    return-void
.end method

.method public d()V
    .locals 1

    .line 177
    iget-object v0, p0, Lo/fhq;->e:Lo/dnm;

    invoke-virtual {v0}, Lo/dnm;->f()V

    .line 178
    return-void
.end method

.method public d(IZ)V
    .locals 4

    .line 149
    sget-object v0, Lo/fhq;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setPersonalPrivacySettingValue... privacyId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", isOpen = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    iget-object v0, p0, Lo/fhq;->e:Lo/dnm;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fhq$1;

    invoke-direct {v2, p0}, Lo/fhq$1;-><init>(Lo/fhq;)V

    invoke-virtual {v0, p1, p2, v1, v2}, Lo/dnm;->e(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 160
    return-void
.end method
