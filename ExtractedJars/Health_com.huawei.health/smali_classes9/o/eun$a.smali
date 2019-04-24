.class Lo/eun$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/util/IEncryptManager;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eun;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eun$a;->d:Landroid/content/Context;

    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eun$a;->d:Landroid/content/Context;

    .line 47
    return-void
.end method


# virtual methods
.method public getEncryptType(C)C
    .locals 1

    .line 62
    const/16 v0, 0x31

    if-ne v0, p1, :cond_0

    .line 63
    const/16 v0, 0x33

    return v0

    .line 65
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getEncryptVersion()C
    .locals 1

    .line 71
    const/16 v0, 0x31

    return v0
.end method

.method public getSecret(C)[B
    .locals 2

    .line 52
    const/16 v0, 0x31

    if-ne v0, p1, :cond_0

    .line 53
    iget-object v0, p0, Lo/eun$a;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/eun;->d(Landroid/content/Context;)[B

    move-result-object v1

    .line 54
    return-object v1

    .line 56
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
