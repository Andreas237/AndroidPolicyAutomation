.class public Lcom/huawei/health/browseraction/HwSchemeKakaActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Opera_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-class v1, Lcom/huawei/health/browseraction/HwSchemeKakaActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/browseraction/HwSchemeKakaActivity;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeKakaActivity;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 20
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 21
    iput-object p0, p0, Lcom/huawei/health/browseraction/HwSchemeKakaActivity;->a:Landroid/content/Context;

    .line 22
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeKakaActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 23
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 24
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeKakaActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    return-void

    .line 27
    :cond_0
    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    .line 28
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 29
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeKakaActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleCommand(Intent intent) schemeData == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    return-void

    .line 32
    :cond_1
    invoke-virtual {v5}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v6

    .line 33
    const-string v0, "/mykaka"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 34
    sget-object v0, Lcom/huawei/health/browseraction/HwSchemeKakaActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "path is incorrect!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    return-void

    .line 38
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeKakaActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v7

    .line 39
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeKakaActivity;->a:Landroid/content/Context;

    invoke-virtual {v7, v0}, Lo/dth;->e(Landroid/content/Context;)V

    .line 40
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeKakaActivity;->finish()V

    .line 41
    return-void
.end method
