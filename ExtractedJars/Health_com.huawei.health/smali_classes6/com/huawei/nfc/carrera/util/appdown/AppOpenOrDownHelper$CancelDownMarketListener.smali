.class Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$CancelDownMarketListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "CancelDownMarketListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;


# direct methods
.method private constructor <init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$CancelDownMarketListener;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;)V
    .locals 0

    .line 241
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$CancelDownMarketListener;-><init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    return-void
.end method


# virtual methods
.method public onKeyBack()V
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$CancelDownMarketListener;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->access$800(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    .line 246
    return-void
.end method

.method public onNegativeButtonClick()V
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$CancelDownMarketListener;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->access$800(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    .line 258
    return-void
.end method

.method public onPositiveButtonClick()V
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$CancelDownMarketListener;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->access$800(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    .line 252
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$CancelDownMarketListener;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->access$900(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->d(Landroid/content/Context;)Lcom/huawei/wallet/logic/down/AppDownManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->c()V

    .line 253
    return-void
.end method
