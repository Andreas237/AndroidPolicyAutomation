.class Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V
    .locals 0

    .line 348
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 353
    const-string v0, "PluginPay BuscardRechargeAcitvityonCreate, cancel queryRechargeMoney"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 355
    return-void
.end method
