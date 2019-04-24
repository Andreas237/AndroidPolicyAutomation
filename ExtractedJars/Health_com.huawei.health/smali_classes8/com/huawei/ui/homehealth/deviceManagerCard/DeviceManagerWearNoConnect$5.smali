.class Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$5;->e:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$5;->e:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$5;->e:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$5;->e:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;Lo/egy;)Lo/egy;

    .line 197
    :cond_0
    return-void
.end method
