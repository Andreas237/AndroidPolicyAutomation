.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyInstallCardResultCallback"
.end annotation


# instance fields
.field private mBindCardAcitivityReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;>;"
        }
    .end annotation
.end field

.field private mCardType:I

.field private mIssuerId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;Ljava/lang/String;I)V
    .locals 1

    .line 287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 288
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;->mBindCardAcitivityReference:Ljava/lang/ref/WeakReference;

    .line 289
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;->mIssuerId:Ljava/lang/String;

    .line 290
    iput p3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;->mCardType:I

    .line 291
    return-void
.end method


# virtual methods
.method public installResultCallback(ILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 296
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123====\u7ed1\u5b9a\u7ed3\u679c resultCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;->mBindCardAcitivityReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    .line 298
    const/4 v5, 0x0

    .line 299
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 301
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v1, "process_fragment"

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    goto :goto_0

    .line 306
    :cond_0
    const-string v0, "MyInstallCardResultCallback installResultCallback, mBindCardAcitivityReference get is null."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 308
    :goto_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_3

    .line 311
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 313
    invoke-static {v4, p3}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;Ljava/lang/String;)V

    .line 315
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 317
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;->mIssuerId:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;->mCardType:I

    invoke-virtual {v5, v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->showBindSuccessView(Ljava/lang/String;I)V

    .line 319
    :cond_2
    return-void

    .line 322
    :cond_3
    const/16 v0, -0x63

    if-ne v0, p1, :cond_4

    .line 324
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 325
    const-string v0, "fail_reason"

    const-string v1, "bind card fail"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    const-string v0, "fail_code"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    const-string v0, "productId"

    invoke-interface {v6, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processBindCard result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x3611a444

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 330
    goto :goto_1

    .line 333
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startBind bind card fail resultCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 336
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 338
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123====processFragment2 resultCode"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 339
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;->mIssuerId:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$MyInstallCardResultCallback;->mCardType:I

    invoke-virtual {v5, p1, v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->bindFailed(ILjava/lang/String;I)V

    .line 341
    :cond_5
    return-void
.end method
