.class public enum Lcom/myfitnesspal/android/sdk/AccessType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/myfitnesspal/android/sdk/AccessType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/myfitnesspal/android/sdk/AccessType;

.field public static final enum Offline:Lcom/myfitnesspal/android/sdk/AccessType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 15
    new-instance v0, Lcom/myfitnesspal/android/sdk/AccessType$1;

    const-string v1, "Offline"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/myfitnesspal/android/sdk/AccessType$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/myfitnesspal/android/sdk/AccessType;->Offline:Lcom/myfitnesspal/android/sdk/AccessType;

    .line 13
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/myfitnesspal/android/sdk/AccessType;

    sget-object v1, Lcom/myfitnesspal/android/sdk/AccessType;->Offline:Lcom/myfitnesspal/android/sdk/AccessType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/myfitnesspal/android/sdk/AccessType;->$VALUES:[Lcom/myfitnesspal/android/sdk/AccessType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/myfitnesspal/android/sdk/AccessType$1;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/myfitnesspal/android/sdk/AccessType;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/myfitnesspal/android/sdk/AccessType;
    .locals 1

    .line 13
    const-class v0, Lcom/myfitnesspal/android/sdk/AccessType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/myfitnesspal/android/sdk/AccessType;

    return-object v0
.end method

.method public static values()[Lcom/myfitnesspal/android/sdk/AccessType;
    .locals 1

    .line 13
    sget-object v0, Lcom/myfitnesspal/android/sdk/AccessType;->$VALUES:[Lcom/myfitnesspal/android/sdk/AccessType;

    invoke-virtual {v0}, [Lcom/myfitnesspal/android/sdk/AccessType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/myfitnesspal/android/sdk/AccessType;

    return-object v0
.end method
