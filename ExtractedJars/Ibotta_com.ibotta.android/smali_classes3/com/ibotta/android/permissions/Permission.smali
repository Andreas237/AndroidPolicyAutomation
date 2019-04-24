.class public final enum Lcom/ibotta/android/permissions/Permission;
.super Ljava/lang/Enum;
.source "Permission.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/permissions/Permission;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/permissions/Permission;

.field public static final enum LOCATION:Lcom/ibotta/android/permissions/Permission;


# instance fields
.field private final permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 11
    new-instance v0, Lcom/ibotta/android/permissions/Permission;

    const-string v1, "LOCATION"

    sget-object v2, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/android/permissions/Permission;-><init>(Ljava/lang/String;ILcom/ibotta/android/state/app/permissions/PermissionProfile;)V

    sput-object v0, Lcom/ibotta/android/permissions/Permission;->LOCATION:Lcom/ibotta/android/permissions/Permission;

    const/4 v0, 0x1

    .line 10
    new-array v0, v0, [Lcom/ibotta/android/permissions/Permission;

    sget-object v1, Lcom/ibotta/android/permissions/Permission;->LOCATION:Lcom/ibotta/android/permissions/Permission;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/permissions/Permission;->$VALUES:[Lcom/ibotta/android/permissions/Permission;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/ibotta/android/state/app/permissions/PermissionProfile;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/state/app/permissions/PermissionProfile;",
            ")V"
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 16
    iput-object p3, p0, Lcom/ibotta/android/permissions/Permission;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/permissions/Permission;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 31
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/android/permissions/Permission;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/permissions/Permission;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/permissions/Permission;
    .locals 1

    .line 10
    const-class v0, Lcom/ibotta/android/permissions/Permission;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/permissions/Permission;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/permissions/Permission;
    .locals 1

    .line 10
    sget-object v0, Lcom/ibotta/android/permissions/Permission;->$VALUES:[Lcom/ibotta/android/permissions/Permission;

    invoke-virtual {v0}, [Lcom/ibotta/android/permissions/Permission;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/permissions/Permission;

    return-object v0
.end method


# virtual methods
.method public getPermissionProfile()Lcom/ibotta/android/state/app/permissions/PermissionProfile;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/permissions/Permission;->permissionProfile:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    return-object v0
.end method
