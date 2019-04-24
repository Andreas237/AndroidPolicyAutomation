.class public enum Lcom/ibotta/android/state/app/permissions/PermissionProfile;
.super Ljava/lang/Enum;
.source "PermissionProfile.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/state/app/permissions/PermissionProfile;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/state/app/permissions/PermissionProfile;

.field public static final enum CAMERA:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

.field public static final enum LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;


# instance fields
.field private final permanentDenialMsg:I

.field private final permissions:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 11
    new-instance v0, Lcom/ibotta/android/state/app/permissions/PermissionProfile$1;

    const-string v1, "LOCATION"

    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/ibotta/android/state/R$string;->permission_permanent_denial_location:I

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/ibotta/android/state/app/permissions/PermissionProfile$1;-><init>(Ljava/lang/String;I[Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    .line 17
    new-instance v0, Lcom/ibotta/android/state/app/permissions/PermissionProfile$2;

    const-string v1, "CAMERA"

    const-string v2, "android.permission.CAMERA"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/ibotta/android/state/R$string;->permission_permanent_denial_camera:I

    const/4 v5, 0x1

    invoke-direct {v0, v1, v5, v2, v3}, Lcom/ibotta/android/state/app/permissions/PermissionProfile$2;-><init>(Ljava/lang/String;I[Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->CAMERA:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    const/4 v0, 0x2

    .line 10
    new-array v0, v0, [Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    sget-object v1, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->CAMERA:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->$VALUES:[Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I[Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    iput-object p3, p0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->permissions:[Ljava/lang/String;

    .line 28
    iput p4, p0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->permanentDenialMsg:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;I[Ljava/lang/String;ILcom/ibotta/android/state/app/permissions/PermissionProfile$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;-><init>(Ljava/lang/String;I[Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/state/app/permissions/PermissionProfile;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 45
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/state/app/permissions/PermissionProfile;
    .locals 1

    .line 10
    const-class v0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/state/app/permissions/PermissionProfile;
    .locals 1

    .line 10
    sget-object v0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->$VALUES:[Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {v0}, [Lcom/ibotta/android/state/app/permissions/PermissionProfile;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    return-object v0
.end method


# virtual methods
.method public getPermanentDenialMsg()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->permanentDenialMsg:I

    return v0
.end method

.method public getPermissions()[Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->permissions:[Ljava/lang/String;

    return-object v0
.end method
