.class Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V
    .locals 0

    .line 662
    iput-object p1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$10;->b:Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 665
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showTipDialog\uff0cclick known button"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    return-void
.end method
