.class public final enum Lcom/ibotta/android/api/auth/PostAuthType;
.super Ljava/lang/Enum;
.source "PostAuthType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/api/auth/PostAuthType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/api/auth/PostAuthType;

.field public static final enum USER_AUTH:Lcom/ibotta/android/api/auth/PostAuthType;

.field public static final enum USER_UPDATE:Lcom/ibotta/android/api/auth/PostAuthType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 4
    new-instance v0, Lcom/ibotta/android/api/auth/PostAuthType;

    const-string v1, "USER_AUTH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/api/auth/PostAuthType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/api/auth/PostAuthType;->USER_AUTH:Lcom/ibotta/android/api/auth/PostAuthType;

    .line 5
    new-instance v0, Lcom/ibotta/android/api/auth/PostAuthType;

    const-string v1, "USER_UPDATE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/api/auth/PostAuthType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/api/auth/PostAuthType;->USER_UPDATE:Lcom/ibotta/android/api/auth/PostAuthType;

    const/4 v0, 0x2

    .line 3
    new-array v0, v0, [Lcom/ibotta/android/api/auth/PostAuthType;

    sget-object v1, Lcom/ibotta/android/api/auth/PostAuthType;->USER_AUTH:Lcom/ibotta/android/api/auth/PostAuthType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/api/auth/PostAuthType;->USER_UPDATE:Lcom/ibotta/android/api/auth/PostAuthType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/api/auth/PostAuthType;->$VALUES:[Lcom/ibotta/android/api/auth/PostAuthType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/api/auth/PostAuthType;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/android/api/auth/PostAuthType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/api/auth/PostAuthType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/api/auth/PostAuthType;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/android/api/auth/PostAuthType;->$VALUES:[Lcom/ibotta/android/api/auth/PostAuthType;

    invoke-virtual {v0}, [Lcom/ibotta/android/api/auth/PostAuthType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/api/auth/PostAuthType;

    return-object v0
.end method
