.class Lo/akx$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/akx;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/SharedPreferences;

.field final synthetic c:Lo/akx;


# direct methods
.method constructor <init>(Lo/akx;Landroid/content/SharedPreferences;)V
    .locals 0

    .line 523
    iput-object p1, p0, Lo/akx$2;->c:Lo/akx;

    iput-object p2, p0, Lo/akx$2;->a:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthClient;>;)V"
        }
    .end annotation

    .line 526
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 527
    :cond_0
    const-string v0, "ISportIntensity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " mUUID is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    iget-object v0, p0, Lo/akx$2;->c:Lo/akx;

    iget-object v1, p0, Lo/akx$2;->c:Lo/akx;

    invoke-static {v1}, Lo/akx;->h(Lo/akx;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/akx;->a(Lo/akx;Ljava/lang/String;)Ljava/lang/String;

    .line 529
    return-void

    .line 531
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthClient;

    .line 532
    iget-object v0, p0, Lo/akx$2;->c:Lo/akx;

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthClient;->getDeviceUUID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/akx;->a(Lo/akx;Ljava/lang/String;)Ljava/lang/String;

    .line 533
    iget-object v0, p0, Lo/akx$2;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "PHONE_UUID"

    iget-object v2, p0, Lo/akx$2;->c:Lo/akx;

    invoke-static {v2}, Lo/akx;->e(Lo/akx;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 534
    return-void
.end method
