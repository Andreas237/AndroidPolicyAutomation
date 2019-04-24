.class public enum Lcom/myfitnesspal/android/sdk/ResponseType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/myfitnesspal/android/sdk/ResponseType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/myfitnesspal/android/sdk/ResponseType;

.field public static final enum Both:Lcom/myfitnesspal/android/sdk/ResponseType;

.field public static final enum Code:Lcom/myfitnesspal/android/sdk/ResponseType;

.field public static final enum Token:Lcom/myfitnesspal/android/sdk/ResponseType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 14
    new-instance v0, Lcom/myfitnesspal/android/sdk/ResponseType$1;

    const-string v1, "Code"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/myfitnesspal/android/sdk/ResponseType$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/myfitnesspal/android/sdk/ResponseType;->Code:Lcom/myfitnesspal/android/sdk/ResponseType;

    .line 21
    new-instance v0, Lcom/myfitnesspal/android/sdk/ResponseType$2;

    const-string v1, "Token"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/myfitnesspal/android/sdk/ResponseType$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/myfitnesspal/android/sdk/ResponseType;->Token:Lcom/myfitnesspal/android/sdk/ResponseType;

    .line 28
    new-instance v0, Lcom/myfitnesspal/android/sdk/ResponseType$3;

    const-string v1, "Both"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/myfitnesspal/android/sdk/ResponseType$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/myfitnesspal/android/sdk/ResponseType;->Both:Lcom/myfitnesspal/android/sdk/ResponseType;

    .line 12
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/myfitnesspal/android/sdk/ResponseType;

    sget-object v1, Lcom/myfitnesspal/android/sdk/ResponseType;->Code:Lcom/myfitnesspal/android/sdk/ResponseType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/myfitnesspal/android/sdk/ResponseType;->Token:Lcom/myfitnesspal/android/sdk/ResponseType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/myfitnesspal/android/sdk/ResponseType;->Both:Lcom/myfitnesspal/android/sdk/ResponseType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/myfitnesspal/android/sdk/ResponseType;->$VALUES:[Lcom/myfitnesspal/android/sdk/ResponseType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/myfitnesspal/android/sdk/ResponseType$1;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/myfitnesspal/android/sdk/ResponseType;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/myfitnesspal/android/sdk/ResponseType;
    .locals 1

    .line 12
    const-class v0, Lcom/myfitnesspal/android/sdk/ResponseType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/myfitnesspal/android/sdk/ResponseType;

    return-object v0
.end method

.method public static values()[Lcom/myfitnesspal/android/sdk/ResponseType;
    .locals 1

    .line 12
    sget-object v0, Lcom/myfitnesspal/android/sdk/ResponseType;->$VALUES:[Lcom/myfitnesspal/android/sdk/ResponseType;

    invoke-virtual {v0}, [Lcom/myfitnesspal/android/sdk/ResponseType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/myfitnesspal/android/sdk/ResponseType;

    return-object v0
.end method
