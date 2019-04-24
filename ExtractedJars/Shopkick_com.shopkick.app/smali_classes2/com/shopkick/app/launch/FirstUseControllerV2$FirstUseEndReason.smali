.class final enum Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;
.super Ljava/lang/Enum;
.source "FirstUseControllerV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/launch/FirstUseControllerV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "FirstUseEndReason"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

.field public static final enum FirstUseEndReasonAllScreensShown:Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

.field public static final enum FirstUseEndReasonUserLogin:Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 95
    new-instance v0, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    const-string v1, "FirstUseEndReasonAllScreensShown"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;->FirstUseEndReasonAllScreensShown:Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    .line 96
    new-instance v0, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    const-string v1, "FirstUseEndReasonUserLogin"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;->FirstUseEndReasonUserLogin:Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    const/4 v0, 0x2

    .line 94
    new-array v0, v0, [Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    sget-object v1, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;->FirstUseEndReasonAllScreensShown:Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;->FirstUseEndReasonUserLogin:Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;->$VALUES:[Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 94
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;
    .locals 1

    .line 94
    const-class v0, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;
    .locals 1

    .line 94
    sget-object v0, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;->$VALUES:[Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    invoke-virtual {v0}, [Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    return-object v0
.end method
