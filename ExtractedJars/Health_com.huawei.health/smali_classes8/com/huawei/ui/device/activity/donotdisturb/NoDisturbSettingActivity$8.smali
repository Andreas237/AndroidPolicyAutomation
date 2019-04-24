.class Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fey$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 736
    iput-object p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$8;->a:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/app/Dialog;III)V
    .locals 0

    .line 740
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 741
    return-void
.end method
