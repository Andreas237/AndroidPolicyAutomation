.class Lo/dqi$24;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dqi;->d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lo/dqi;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dqi;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lo/dqi$24;->d:Lo/dqi;

    iput-object p2, p0, Lo/dqi$24;->c:Ljava/util/List;

    iput-object p3, p0, Lo/dqi$24;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 206
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 207
    iget-object v0, p0, Lo/dqi$24;->c:Ljava/util/List;

    invoke-virtual {v4, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 208
    new-instance v6, Lcom/huawei/hihealth/HiUserPreference;

    const-string v0, "custom.address_book"

    invoke-direct {v6, v0, v5}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    .line 212
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.address_book"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v7

    .line 213
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 214
    const-string v0, "HWCombineMigrateMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "migrateAddressBook value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    :cond_0
    iget-object v0, p0, Lo/dqi$24;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v1, p0, Lo/dqi$24;->c:Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 217
    return-void
.end method
