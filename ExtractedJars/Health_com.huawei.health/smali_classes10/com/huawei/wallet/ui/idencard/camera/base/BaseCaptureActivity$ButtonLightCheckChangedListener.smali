.class Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$ButtonLightCheckChangedListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ButtonLightCheckChangedListener"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$1;)V
    .locals 0

    .line 222
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$ButtonLightCheckChangedListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 228
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->b(Z)Z

    .line 229
    return-void
.end method
