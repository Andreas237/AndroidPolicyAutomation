.class Lcom/huawei/ui/homehealth/HomeFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/SharedPreferences;

.field final synthetic e:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;Landroid/content/SharedPreferences;)V
    .locals 0

    .line 779
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$5;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    iput-object p2, p0, Lcom/huawei/ui/homehealth/HomeFragment$5;->b:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthClient;>;)V"
        }
    .end annotation

    .line 782
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 783
    :cond_0
    return-void

    .line 785
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiHealthClient;

    .line 786
    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthClient;->getDeviceUUID()Ljava/lang/String;

    move-result-object v3

    .line 787
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$5;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "PHONE_UUID"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 788
    return-void
.end method
