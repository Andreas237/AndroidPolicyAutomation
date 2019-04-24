.class public final enum Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwErrorTipTextLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ShapeMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

.field public static final enum Bubble:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

.field public static final enum Linear:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 68
    new-instance v0, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    const-string v1, "Bubble"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->Bubble:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    .line 69
    new-instance v0, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    const-string v1, "Linear"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->Linear:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    .line 67
    const/4 v0, 0x2

    new-array v0, v0, [Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    sget-object v1, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->Bubble:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->Linear:Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->$VALUES:[Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 67
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;
    .locals 1

    .line 67
    const-class v0, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    return-object v0
.end method

.method public static values()[Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;
    .locals 1

    .line 67
    sget-object v0, Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->$VALUES:[Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    invoke-virtual {v0}, [Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhuawei/widget/HwErrorTipTextLayout$ShapeMode;

    return-object v0
.end method
