.class Lcom/huawei/health/StartHealthActivity$5;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/StartHealthActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/StartHealthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/StartHealthActivity;)V
    .locals 2

    .line 277
    iput-object p1, p0, Lcom/huawei/health/StartHealthActivity$5;->b:Lcom/huawei/health/StartHealthActivity;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 279
    const-string v0, "com.huawei.health.MULTI_SIM_AUTH"

    const-string v1, "com.huawei.sim.multisim.MultiSimAuth"

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/StartHealthActivity$5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    const-string v0, "com.google.android.wearable.action.CONFIGURE_CELLULAR"

    const-string v1, "com.huawei.sim.esim.view.WirelessManagerAcitivity"

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/StartHealthActivity$5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    const-string v0, "com.google.android.wearable.action.CONFIGURE_PAYMENTS"

    const-string v1, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/StartHealthActivity$5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    return-void
.end method
