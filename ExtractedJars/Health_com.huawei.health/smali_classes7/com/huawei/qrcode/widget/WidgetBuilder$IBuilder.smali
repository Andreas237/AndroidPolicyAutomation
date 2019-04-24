.class public interface abstract Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/widget/WidgetBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IBuilder"
.end annotation


# virtual methods
.method public abstract createDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
.end method

.method public abstract createProgressDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;
.end method
