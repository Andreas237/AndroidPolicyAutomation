.class Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$RemindDownMarketListener;
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
    name = "RemindDownMarketListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;


# direct methods
.method private constructor <init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$RemindDownMarketListener;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;)V
    .locals 0

    .line 130
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$RemindDownMarketListener;-><init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    return-void
.end method


# virtual methods
.method public onKeyBack()V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$RemindDownMarketListener;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->access$100(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    .line 135
    return-void
.end method

.method public onNegativeButtonClick()V
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$RemindDownMarketListener;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->access$100(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    .line 145
    return-void
.end method

.method public onPositiveButtonClick()V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$RemindDownMarketListener;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->access$200(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    .line 140
    return-void
.end method
