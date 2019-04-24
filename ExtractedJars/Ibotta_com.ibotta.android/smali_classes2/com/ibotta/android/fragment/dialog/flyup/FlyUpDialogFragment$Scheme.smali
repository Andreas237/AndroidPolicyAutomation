.class public final enum Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;
.super Ljava/lang/Enum;
.source "FlyUpDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Scheme"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

.field public static final enum DEFAULT:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

.field public static final enum PINK:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;


# instance fields
.field private final bgColorId:I

.field private final filledColorId:I

.field private final unfilledColorId:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 51
    new-instance v6, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    const v3, 0x7f060171

    const v4, 0x7f0600ef

    const v5, 0x7f06001b

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;-><init>(Ljava/lang/String;IIII)V

    sput-object v6, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->DEFAULT:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    .line 52
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    const-string v8, "PINK"

    const/4 v9, 0x1

    const v10, 0x7f0600e9

    const v11, 0x7f060171

    const v12, 0x7f06001b

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->PINK:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    const/4 v0, 0x2

    .line 50
    new-array v0, v0, [Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->DEFAULT:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->PINK:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->$VALUES:[Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)V"
        }
    .end annotation

    .line 57
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 58
    iput p3, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->bgColorId:I

    .line 59
    iput p4, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->filledColorId:I

    .line 60
    iput p5, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->unfilledColorId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;
    .locals 1

    .line 50
    const-class v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;
    .locals 1

    .line 50
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->$VALUES:[Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    invoke-virtual {v0}, [Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;

    return-object v0
.end method


# virtual methods
.method public getBgColorId()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->bgColorId:I

    return v0
.end method

.method public getFilledColorId()I
    .locals 1

    .line 68
    iget v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->filledColorId:I

    return v0
.end method

.method public getUnfilledColorId()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$Scheme;->unfilledColorId:I

    return v0
.end method
