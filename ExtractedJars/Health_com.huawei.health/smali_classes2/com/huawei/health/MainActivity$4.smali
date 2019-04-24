.class Lcom/huawei/health/MainActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 342
    iput-object p1, p0, Lcom/huawei/health/MainActivity$4;->c:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiDeviceInfo;>;)V"
        }
    .end annotation

    .line 345
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 346
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBindingDeviceToODMF deviceInfos = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    return-void

    .line 350
    :cond_0
    const/4 v4, -0x1

    .line 351
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 352
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceTypeMapping()I

    move-result v4

    .line 353
    const/4 v0, -0x1

    if-ne v0, v4, :cond_1

    .line 354
    goto :goto_1

    .line 356
    :cond_1
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceInfoToODMF()Ljava/lang/String;

    move-result-object v6

    .line 357
    iget-object v0, p0, Lcom/huawei/health/MainActivity$4;->c:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v6}, Lo/dnn;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 351
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 360
    :cond_2
    return-void
.end method
