.class public final enum Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;
.super Ljava/lang/Enum;
.source "LeftControl.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

.field public static final enum CANCEL:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

.field public static final enum NONE:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

.field public static final enum PREVIOUS:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;


# instance fields
.field private final imageId:I

.field private final textId:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 9
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    const-string v1, "NONE"

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    .line 10
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    const-string v1, "PREVIOUS"

    const/4 v4, 0x1

    const v5, 0x7f0802aa

    invoke-direct {v0, v1, v4, v5, v3}, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->PREVIOUS:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    .line 11
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    const-string v1, "CANCEL"

    const/4 v5, 0x2

    const v6, 0x7f110142

    invoke-direct {v0, v1, v5, v3, v6}, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->CANCEL:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    const/4 v0, 0x3

    .line 8
    new-array v0, v0, [Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->PREVIOUS:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->CANCEL:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->$VALUES:[Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    iput p3, p0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->imageId:I

    .line 18
    iput p4, p0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->textId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;
    .locals 1

    .line 8
    const-class v0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;
    .locals 1

    .line 8
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->$VALUES:[Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    invoke-virtual {v0}, [Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    return-object v0
.end method


# virtual methods
.method public getImageId()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->imageId:I

    return v0
.end method

.method public getTextId()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->textId:I

    return v0
.end method
