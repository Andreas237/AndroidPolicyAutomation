.class public final enum Lcom/microblink/camera/hardware/orientation/Orientation;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/camera/hardware/orientation/Orientation;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/camera/hardware/orientation/Orientation;

.field public static final enum ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/camera/hardware/orientation/Orientation;

.field public static final enum ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/camera/hardware/orientation/Orientation;

.field public static final enum ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

.field public static final enum ORIENTATION_PORTRAIT_UPSIDE:Lcom/microblink/camera/hardware/orientation/Orientation;

.field public static final enum ORIENTATION_UNKNOWN:Lcom/microblink/camera/hardware/orientation/Orientation;


# instance fields
.field private mHorizontal:Z

.field private mValue:I

.field private mVertical:Z


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lcom/microblink/camera/hardware/orientation/Orientation;

    const-string v1, "ORIENTATION_PORTRAIT"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/microblink/camera/hardware/orientation/Orientation;-><init>(Ljava/lang/String;IIZZ)V

    sput-object v6, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

    new-instance v0, Lcom/microblink/camera/hardware/orientation/Orientation;

    const-string v8, "ORIENTATION_LANDSCAPE_RIGHT"

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/microblink/camera/hardware/orientation/Orientation;-><init>(Ljava/lang/String;IIZZ)V

    sput-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/camera/hardware/orientation/Orientation;

    new-instance v0, Lcom/microblink/camera/hardware/orientation/Orientation;

    const-string v2, "ORIENTATION_PORTRAIT_UPSIDE"

    const/4 v3, 0x2

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/microblink/camera/hardware/orientation/Orientation;-><init>(Ljava/lang/String;IIZZ)V

    sput-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT_UPSIDE:Lcom/microblink/camera/hardware/orientation/Orientation;

    new-instance v0, Lcom/microblink/camera/hardware/orientation/Orientation;

    const-string v8, "ORIENTATION_LANDSCAPE_LEFT"

    const/4 v9, 0x3

    const/4 v10, 0x3

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/microblink/camera/hardware/orientation/Orientation;-><init>(Ljava/lang/String;IIZZ)V

    sput-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/camera/hardware/orientation/Orientation;

    new-instance v0, Lcom/microblink/camera/hardware/orientation/Orientation;

    const-string v2, "ORIENTATION_UNKNOWN"

    const/4 v3, 0x4

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/microblink/camera/hardware/orientation/Orientation;-><init>(Ljava/lang/String;IIZZ)V

    sput-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_UNKNOWN:Lcom/microblink/camera/hardware/orientation/Orientation;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/microblink/camera/hardware/orientation/Orientation;

    sget-object v1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/camera/hardware/orientation/Orientation;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT_UPSIDE:Lcom/microblink/camera/hardware/orientation/Orientation;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/camera/hardware/orientation/Orientation;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_UNKNOWN:Lcom/microblink/camera/hardware/orientation/Orientation;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->$VALUES:[Lcom/microblink/camera/hardware/orientation/Orientation;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/microblink/camera/hardware/orientation/Orientation;->mValue:I

    iput-boolean p4, p0, Lcom/microblink/camera/hardware/orientation/Orientation;->mVertical:Z

    iput-boolean p5, p0, Lcom/microblink/camera/hardware/orientation/Orientation;->mHorizontal:Z

    return-void
.end method

.method public static fromInt(I)Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 0

    packed-switch p0, :pswitch_data_0

    sget-object p0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_UNKNOWN:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p0

    :pswitch_0
    sget-object p0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT_UPSIDE:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 1

    const-class v0, Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object p0
.end method

.method public static values()[Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 1

    sget-object v0, Lcom/microblink/camera/hardware/orientation/Orientation;->$VALUES:[Lcom/microblink/camera/hardware/orientation/Orientation;

    invoke-virtual {v0}, [Lcom/microblink/camera/hardware/orientation/Orientation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/camera/hardware/orientation/Orientation;

    return-object v0
.end method


# virtual methods
.method public final intValue()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/orientation/Orientation;->mValue:I

    return v0
.end method

.method public final isHorizontal()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/orientation/Orientation;->mHorizontal:Z

    return v0
.end method

.method public final isVertical()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/camera/hardware/orientation/Orientation;->mVertical:Z

    return v0
.end method

.method public final rotate180()Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/orientation/Orientation;->mValue:I

    add-int/lit8 v0, v0, 0x2

    rem-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Lcom/microblink/camera/hardware/orientation/Orientation;->fromInt(I)Lcom/microblink/camera/hardware/orientation/Orientation;

    move-result-object v0

    return-object v0
.end method

.method public final rotate90Clockwise()Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/orientation/Orientation;->mValue:I

    add-int/lit8 v0, v0, 0x3

    rem-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Lcom/microblink/camera/hardware/orientation/Orientation;->fromInt(I)Lcom/microblink/camera/hardware/orientation/Orientation;

    move-result-object v0

    return-object v0
.end method

.method public final rotate90CounterClockwise()Lcom/microblink/camera/hardware/orientation/Orientation;
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/orientation/Orientation;->mValue:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Lcom/microblink/camera/hardware/orientation/Orientation;->fromInt(I)Lcom/microblink/camera/hardware/orientation/Orientation;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/orientation/Orientation;->mValue:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Unknown"

    return-object v0

    :pswitch_0
    const-string v0, "Landscape left"

    return-object v0

    :pswitch_1
    const-string v0, "Inverse portrait"

    return-object v0

    :pswitch_2
    const-string v0, "Landscape right"

    return-object v0

    :pswitch_3
    const-string v0, "Portrait"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
