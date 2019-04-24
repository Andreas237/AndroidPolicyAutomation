.class Lo/cnq$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->a(Lcom/huawei/hihealth/HiAppInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cnq;

.field final synthetic b:Lcom/huawei/hihealth/HiAppInfo;


# direct methods
.method constructor <init>(Lo/cnq;Lcom/huawei/hihealth/HiAppInfo;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lo/cnq$8;->a:Lo/cnq;

    iput-object p2, p0, Lo/cnq$8;->b:Lcom/huawei/hihealth/HiAppInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 196
    iget-object v0, p0, Lo/cnq$8;->b:Lcom/huawei/hihealth/HiAppInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 197
    iget-object v0, p0, Lo/cnq$8;->a:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/cuz;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 198
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHiHealth() packageName = null packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    return-void

    .line 202
    :cond_0
    iget-object v0, p0, Lo/cnq$8;->a:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v5

    .line 203
    invoke-virtual {v5, v4}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v6

    .line 204
    if-gtz v6, :cond_1

    .line 205
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHiHealth() app <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    :cond_1
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHiHealth() app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    return-void
.end method
