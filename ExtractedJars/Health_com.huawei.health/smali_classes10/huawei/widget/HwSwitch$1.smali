.class final Lhuawei/widget/HwSwitch$1;
.super Landroid/util/FloatProperty;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwSwitch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/FloatProperty<Lhuawei/widget/HwSwitch;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 471
    invoke-direct {p0, p1}, Landroid/util/FloatProperty;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public get(Lhuawei/widget/HwSwitch;)Ljava/lang/Float;
    .locals 1

    .line 474
    invoke-static {p1}, Lhuawei/widget/HwSwitch;->access$000(Lhuawei/widget/HwSwitch;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 471
    move-object v0, p1

    check-cast v0, Lhuawei/widget/HwSwitch;

    invoke-virtual {p0, v0}, Lhuawei/widget/HwSwitch$1;->get(Lhuawei/widget/HwSwitch;)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Lhuawei/widget/HwSwitch;F)V
    .locals 0

    .line 479
    invoke-static {p1, p2}, Lhuawei/widget/HwSwitch;->access$100(Lhuawei/widget/HwSwitch;F)V

    .line 480
    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;F)V
    .locals 1

    .line 471
    move-object v0, p1

    check-cast v0, Lhuawei/widget/HwSwitch;

    invoke-virtual {p0, v0, p2}, Lhuawei/widget/HwSwitch$1;->setValue(Lhuawei/widget/HwSwitch;F)V

    return-void
.end method
