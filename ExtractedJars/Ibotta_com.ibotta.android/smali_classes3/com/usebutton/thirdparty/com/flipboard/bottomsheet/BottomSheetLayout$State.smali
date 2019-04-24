.class public final enum Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;
.super Ljava/lang/Enum;
.source "BottomSheetLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

.field public static final enum EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

.field public static final enum HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

.field public static final enum PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

.field public static final enum PREPARING:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 100
    new-instance v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    const-string v1, "HIDDEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    .line 101
    new-instance v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    const-string v1, "PREPARING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PREPARING:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    .line 102
    new-instance v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    const-string v1, "PEEKED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    .line 103
    new-instance v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    const-string v1, "EXPANDED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    const/4 v0, 0x4

    .line 99
    new-array v0, v0, [Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    aput-object v1, v0, v2

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PREPARING:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    aput-object v1, v0, v3

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    aput-object v1, v0, v4

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    aput-object v1, v0, v5

    sput-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->$VALUES:[Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 99
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;
    .locals 1

    .line 99
    const-class v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    return-object p0
.end method

.method public static values()[Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;
    .locals 1

    .line 99
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->$VALUES:[Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-virtual {v0}, [Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    return-object v0
.end method
