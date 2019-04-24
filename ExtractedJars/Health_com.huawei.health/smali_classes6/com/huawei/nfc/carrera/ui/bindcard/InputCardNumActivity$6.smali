.class Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->showQueryCplcErro()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;)V
    .locals 0

    .line 834
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 839
    const-string v0, "jump to NFC setting "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 842
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.settings.NFCSHARING_SETTINGS"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/InputCardNumActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 847
    goto :goto_0

    .line 844
    :catch_0
    move-exception v3

    .line 846
    const-string v0, "jump to NFC setting fail  the action erro"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 848
    :goto_0
    return-void
.end method
