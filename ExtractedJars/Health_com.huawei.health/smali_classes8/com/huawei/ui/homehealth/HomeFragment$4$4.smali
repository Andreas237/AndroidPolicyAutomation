.class Lcom/huawei/ui/homehealth/HomeFragment$4$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment$4;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/HomeFragment$4;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment$4;)V
    .locals 0

    .line 1298
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$4$4;->a:Lcom/huawei/ui/homehealth/HomeFragment$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 1301
    move-object v2, p2

    check-cast v2, Lcom/huawei/hihealth/HiUserInfo;

    .line 1302
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1303
    const-string v0, "id"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment$4$4;->a:Lcom/huawei/ui/homehealth/HomeFragment$4;

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment$4;->c:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1304
    const-string v0, "uid"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1305
    const-string v0, "gender"

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1306
    const-string v0, "age"

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getAge()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1307
    const-string v0, "height"

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1308
    const-string v0, "isDelete"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1309
    const-string v0, "userInfo1"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment$4$4;->a:Lcom/huawei/ui/homehealth/HomeFragment$4;

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment$4;->c:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lo/ahu;->d(Ljava/util/Map;Ljava/lang/String;Landroid/content/Context;)V

    .line 1311
    return-void
.end method
