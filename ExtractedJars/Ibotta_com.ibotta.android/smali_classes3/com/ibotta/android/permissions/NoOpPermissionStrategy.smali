.class public final enum Lcom/ibotta/android/permissions/NoOpPermissionStrategy;
.super Ljava/lang/Enum;
.source "NoOpPermissionStrategy.java"

# interfaces
.implements Lcom/ibotta/android/permissions/PermissionStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/permissions/NoOpPermissionStrategy;",
        ">;",
        "Lcom/ibotta/android/permissions/PermissionStrategy;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/permissions/NoOpPermissionStrategy;

.field public static final enum INSTANCE:Lcom/ibotta/android/permissions/NoOpPermissionStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 12
    new-instance v0, Lcom/ibotta/android/permissions/NoOpPermissionStrategy;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/permissions/NoOpPermissionStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/permissions/NoOpPermissionStrategy;->INSTANCE:Lcom/ibotta/android/permissions/NoOpPermissionStrategy;

    const/4 v0, 0x1

    .line 11
    new-array v0, v0, [Lcom/ibotta/android/permissions/NoOpPermissionStrategy;

    sget-object v1, Lcom/ibotta/android/permissions/NoOpPermissionStrategy;->INSTANCE:Lcom/ibotta/android/permissions/NoOpPermissionStrategy;

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/permissions/NoOpPermissionStrategy;->$VALUES:[Lcom/ibotta/android/permissions/NoOpPermissionStrategy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/permissions/NoOpPermissionStrategy;
    .locals 1

    .line 11
    const-class v0, Lcom/ibotta/android/permissions/NoOpPermissionStrategy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/permissions/NoOpPermissionStrategy;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/permissions/NoOpPermissionStrategy;
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/android/permissions/NoOpPermissionStrategy;->$VALUES:[Lcom/ibotta/android/permissions/NoOpPermissionStrategy;

    invoke-virtual {v0}, [Lcom/ibotta/android/permissions/NoOpPermissionStrategy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/permissions/NoOpPermissionStrategy;

    return-object v0
.end method


# virtual methods
.method public checkPermissionsForArea(Lcom/ibotta/android/mvp/base/MvpActivity;Lcom/ibotta/android/state/app/permissions/Area;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public delete()V
    .locals 0

    return-void
.end method

.method public trackNewSession()V
    .locals 0

    return-void
.end method
