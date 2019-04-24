.class public final enum Lcom/ibotta/android/api/auth/UserFamiliarity;
.super Ljava/lang/Enum;
.source "UserFamiliarity.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/api/auth/UserFamiliarity;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/api/auth/UserFamiliarity;

.field public static final enum EXISTING_USER:Lcom/ibotta/android/api/auth/UserFamiliarity;

.field public static final enum NEW_USER:Lcom/ibotta/android/api/auth/UserFamiliarity;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 4
    new-instance v0, Lcom/ibotta/android/api/auth/UserFamiliarity;

    const-string v1, "NEW_USER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/api/auth/UserFamiliarity;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/api/auth/UserFamiliarity;->NEW_USER:Lcom/ibotta/android/api/auth/UserFamiliarity;

    .line 5
    new-instance v0, Lcom/ibotta/android/api/auth/UserFamiliarity;

    const-string v1, "EXISTING_USER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/api/auth/UserFamiliarity;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/api/auth/UserFamiliarity;->EXISTING_USER:Lcom/ibotta/android/api/auth/UserFamiliarity;

    const/4 v0, 0x2

    .line 3
    new-array v0, v0, [Lcom/ibotta/android/api/auth/UserFamiliarity;

    sget-object v1, Lcom/ibotta/android/api/auth/UserFamiliarity;->NEW_USER:Lcom/ibotta/android/api/auth/UserFamiliarity;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/api/auth/UserFamiliarity;->EXISTING_USER:Lcom/ibotta/android/api/auth/UserFamiliarity;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/api/auth/UserFamiliarity;->$VALUES:[Lcom/ibotta/android/api/auth/UserFamiliarity;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/api/auth/UserFamiliarity;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/android/api/auth/UserFamiliarity;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/api/auth/UserFamiliarity;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/api/auth/UserFamiliarity;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/android/api/auth/UserFamiliarity;->$VALUES:[Lcom/ibotta/android/api/auth/UserFamiliarity;

    invoke-virtual {v0}, [Lcom/ibotta/android/api/auth/UserFamiliarity;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/api/auth/UserFamiliarity;

    return-object v0
.end method
