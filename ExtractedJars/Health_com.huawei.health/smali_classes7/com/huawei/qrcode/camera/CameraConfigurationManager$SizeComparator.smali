.class Lcom/huawei/qrcode/camera/CameraConfigurationManager$SizeComparator;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/camera/CameraConfigurationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SizeComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Landroid/hardware/Camera$Size;>;Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x1L


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/camera/CameraConfigurationManager$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/camera/CameraConfigurationManager$SizeComparator;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)I
    .locals 4

    iget v0, p1, Landroid/hardware/Camera$Size;->height:I

    iget v1, p1, Landroid/hardware/Camera$Size;->width:I

    mul-int v2, v0, v1

    iget v0, p2, Landroid/hardware/Camera$Size;->height:I

    iget v1, p2, Landroid/hardware/Camera$Size;->width:I

    mul-int v3, v0, v1

    if-ge v3, v2, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    if-le v3, v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    move-object v0, p1

    check-cast v0, Landroid/hardware/Camera$Size;

    move-object v1, p2

    check-cast v1, Landroid/hardware/Camera$Size;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager$SizeComparator;->compare(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)I

    move-result v0

    return v0
.end method
