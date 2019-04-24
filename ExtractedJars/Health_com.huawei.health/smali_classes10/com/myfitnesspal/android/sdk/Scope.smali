.class public enum Lcom/myfitnesspal/android/sdk/Scope;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/myfitnesspal/android/sdk/Scope;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/myfitnesspal/android/sdk/Scope;

.field public static final enum Diary:Lcom/myfitnesspal/android/sdk/Scope;

.field public static final enum DiaryReadOnly:Lcom/myfitnesspal/android/sdk/Scope;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 14
    new-instance v0, Lcom/myfitnesspal/android/sdk/Scope$1;

    const-string v1, "Diary"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/myfitnesspal/android/sdk/Scope$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/myfitnesspal/android/sdk/Scope;->Diary:Lcom/myfitnesspal/android/sdk/Scope;

    .line 21
    new-instance v0, Lcom/myfitnesspal/android/sdk/Scope$2;

    const-string v1, "DiaryReadOnly"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/myfitnesspal/android/sdk/Scope$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/myfitnesspal/android/sdk/Scope;->DiaryReadOnly:Lcom/myfitnesspal/android/sdk/Scope;

    .line 12
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/myfitnesspal/android/sdk/Scope;

    sget-object v1, Lcom/myfitnesspal/android/sdk/Scope;->Diary:Lcom/myfitnesspal/android/sdk/Scope;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/myfitnesspal/android/sdk/Scope;->DiaryReadOnly:Lcom/myfitnesspal/android/sdk/Scope;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/myfitnesspal/android/sdk/Scope;->$VALUES:[Lcom/myfitnesspal/android/sdk/Scope;

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

.method synthetic constructor <init>(Ljava/lang/String;ILcom/myfitnesspal/android/sdk/Scope$1;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/myfitnesspal/android/sdk/Scope;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/myfitnesspal/android/sdk/Scope;
    .locals 1

    .line 12
    const-class v0, Lcom/myfitnesspal/android/sdk/Scope;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/myfitnesspal/android/sdk/Scope;

    return-object v0
.end method

.method public static values()[Lcom/myfitnesspal/android/sdk/Scope;
    .locals 1

    .line 12
    sget-object v0, Lcom/myfitnesspal/android/sdk/Scope;->$VALUES:[Lcom/myfitnesspal/android/sdk/Scope;

    invoke-virtual {v0}, [Lcom/myfitnesspal/android/sdk/Scope;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/myfitnesspal/android/sdk/Scope;

    return-object v0
.end method
