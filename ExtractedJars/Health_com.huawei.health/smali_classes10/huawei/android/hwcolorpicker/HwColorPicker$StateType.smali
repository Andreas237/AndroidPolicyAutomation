.class public final enum Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/android/hwcolorpicker/HwColorPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "StateType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

.field public static final enum Common:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

.field public static final enum Error:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

.field public static final enum Gray:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

.field public static final enum None:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

.field public static final enum OK:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

.field public static final enum Single:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

.field public static final enum UnDefined:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;


# instance fields
.field private index:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 372
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const-string v1, "UnDefined"

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->UnDefined:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    .line 378
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const-string v1, "OK"

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->OK:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    .line 384
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const-string v1, "Error"

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->Error:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    .line 390
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const-string v1, "None"

    const/4 v2, 0x3

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->None:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    .line 396
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const-string v1, "Common"

    const/4 v2, 0x4

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->Common:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    .line 402
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const-string v1, "Single"

    const/4 v2, 0x5

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->Single:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    .line 408
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const-string v1, "Gray"

    const/4 v2, 0x6

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->Gray:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    .line 364
    const/4 v0, 0x7

    new-array v0, v0, [Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->UnDefined:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->OK:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->Error:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->None:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->Common:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->Single:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->Gray:Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->$VALUES:[Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 412
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 413
    iput p3, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->index:I

    .line 414
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;
    .locals 1

    .line 364
    const-class v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    return-object v0
.end method

.method public static values()[Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;
    .locals 1

    .line 364
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->$VALUES:[Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    invoke-virtual {v0}, [Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhuawei/android/hwcolorpicker/HwColorPicker$StateType;

    return-object v0
.end method
