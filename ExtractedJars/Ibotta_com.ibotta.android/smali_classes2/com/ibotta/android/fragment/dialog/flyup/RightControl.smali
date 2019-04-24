.class public final enum Lcom/ibotta/android/fragment/dialog/flyup/RightControl;
.super Ljava/lang/Enum;
.source "RightControl.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/fragment/dialog/flyup/RightControl;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

.field public static final enum CANCEL:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

.field public static final enum CLOSE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

.field public static final enum CLOSE_WHITE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

.field public static final enum NEXT:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

.field public static final enum NONE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

.field public static final enum RESET_PASSWORD:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

.field public static final enum SAVE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

.field public static final enum SEND:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

.field public static final enum SUBMIT:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;


# instance fields
.field private final imageId:I

.field private final textId:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 9
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    const-string v1, "NONE"

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    .line 10
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    const-string v1, "NEXT"

    const/4 v4, 0x1

    const v5, 0x7f0802ab

    invoke-direct {v0, v1, v4, v5, v3}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->NEXT:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    .line 11
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    const-string v1, "SEND"

    const/4 v5, 0x2

    const v6, 0x7f1101e8

    invoke-direct {v0, v1, v5, v3, v6}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SEND:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    .line 12
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    const-string v1, "SUBMIT"

    const/4 v6, 0x3

    const v7, 0x7f1101f2

    invoke-direct {v0, v1, v6, v3, v7}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SUBMIT:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    .line 13
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    const-string v1, "SAVE"

    const/4 v7, 0x4

    const v8, 0x7f1101e5

    invoke-direct {v0, v1, v7, v3, v8}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SAVE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    .line 14
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    const-string v1, "CANCEL"

    const/4 v8, 0x5

    const v9, 0x7f110142

    invoke-direct {v0, v1, v8, v3, v9}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CANCEL:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    .line 15
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    const-string v1, "RESET_PASSWORD"

    const/4 v9, 0x6

    const v10, 0x7f1101df

    invoke-direct {v0, v1, v9, v3, v10}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->RESET_PASSWORD:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    .line 16
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    const-string v1, "CLOSE"

    const/4 v10, 0x7

    const v11, 0x7f080123

    invoke-direct {v0, v1, v10, v11, v3}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CLOSE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    .line 17
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    const-string v1, "CLOSE_WHITE"

    const/16 v11, 0x8

    const v12, 0x7f080124

    invoke-direct {v0, v1, v11, v12, v3}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CLOSE_WHITE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    const/16 v0, 0x9

    .line 8
    new-array v0, v0, [Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->NEXT:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SEND:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SUBMIT:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SAVE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CANCEL:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->RESET_PASSWORD:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CLOSE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CLOSE_WHITE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    aput-object v1, v0, v11

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->$VALUES:[Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 23
    iput p3, p0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->imageId:I

    .line 24
    iput p4, p0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->textId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/flyup/RightControl;
    .locals 1

    .line 8
    const-class v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/fragment/dialog/flyup/RightControl;
    .locals 1

    .line 8
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->$VALUES:[Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    invoke-virtual {v0}, [Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    return-object v0
.end method


# virtual methods
.method public getImageId()I
    .locals 1

    .line 28
    iget v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->imageId:I

    return v0
.end method

.method public getTextId()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->textId:I

    return v0
.end method
