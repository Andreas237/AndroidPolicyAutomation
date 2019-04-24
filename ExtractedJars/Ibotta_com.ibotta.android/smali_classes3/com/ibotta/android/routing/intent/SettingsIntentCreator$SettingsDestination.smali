.class public final enum Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;
.super Ljava/lang/Enum;
.source "SettingsIntentCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/routing/intent/SettingsIntentCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SettingsDestination"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

.field public static final enum CONNECTED:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

.field public static final enum PREFS:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

.field public static final enum PROFILE:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

.field public static final enum SETTINGS:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 19
    new-instance v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    const-string v1, "SETTINGS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->SETTINGS:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    .line 20
    new-instance v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    const-string v1, "PROFILE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->PROFILE:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    .line 21
    new-instance v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    const-string v1, "CONNECTED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->CONNECTED:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    .line 22
    new-instance v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    const-string v1, "PREFS"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->PREFS:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    const/4 v0, 0x4

    .line 18
    new-array v0, v0, [Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    sget-object v1, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->SETTINGS:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->PROFILE:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->CONNECTED:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->PREFS:Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->$VALUES:[Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;
    .locals 1

    .line 18
    const-class v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;
    .locals 1

    .line 18
    sget-object v0, Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->$VALUES:[Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    invoke-virtual {v0}, [Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/routing/intent/SettingsIntentCreator$SettingsDestination;

    return-object v0
.end method
