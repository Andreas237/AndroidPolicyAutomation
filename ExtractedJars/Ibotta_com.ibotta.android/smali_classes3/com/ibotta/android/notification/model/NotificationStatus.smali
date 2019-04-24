.class public final enum Lcom/ibotta/android/notification/model/NotificationStatus;
.super Ljava/lang/Enum;
.source "NotificationStatus.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/notification/model/NotificationStatus$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/notification/model/NotificationStatus;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationStatus.kt\ncom/ibotta/android/notification/model/NotificationStatus\n*L\n1#1,24:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0001\u0018\u0000 \u00132\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/notification/model/NotificationStatus;",
        "",
        "(Ljava/lang/String;I)V",
        "apiName",
        "",
        "getApiName",
        "()Ljava/lang/String;",
        "SUCCESS",
        "PENDING",
        "PENDING_VERIFICATION",
        "EXPIRING",
        "ERROR",
        "DUPLICATE",
        "LIKED",
        "NEW",
        "INFO",
        "REVERSED",
        "MESSAGE",
        "EARNED",
        "Companion",
        "ibotta-notification_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final Companion:Lcom/ibotta/android/notification/model/NotificationStatus$Companion;

.field public static final enum DUPLICATE:Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final enum EARNED:Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final enum ERROR:Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final enum EXPIRING:Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final enum INFO:Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final enum LIKED:Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final enum MESSAGE:Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final enum NEW:Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final enum PENDING:Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final enum PENDING_VERIFICATION:Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final enum REVERSED:Lcom/ibotta/android/notification/model/NotificationStatus;

.field public static final enum SUCCESS:Lcom/ibotta/android/notification/model/NotificationStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xc

    new-array v0, v0, [Lcom/ibotta/android/notification/model/NotificationStatus;

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "SUCCESS"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->SUCCESS:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "PENDING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "PENDING_VERIFICATION"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING_VERIFICATION:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "EXPIRING"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->EXPIRING:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "ERROR"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->ERROR:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "DUPLICATE"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->DUPLICATE:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "LIKED"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->LIKED:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "NEW"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->NEW:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "INFO"

    const/16 v3, 0x8

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->INFO:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "REVERSED"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->REVERSED:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "MESSAGE"

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->MESSAGE:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/model/NotificationStatus;

    const-string v2, "EARNED"

    const/16 v3, 0xb

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/model/NotificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->EARNED:Lcom/ibotta/android/notification/model/NotificationStatus;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/notification/model/NotificationStatus;->$VALUES:[Lcom/ibotta/android/notification/model/NotificationStatus;

    new-instance v0, Lcom/ibotta/android/notification/model/NotificationStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/notification/model/NotificationStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/notification/model/NotificationStatus;->Companion:Lcom/ibotta/android/notification/model/NotificationStatus$Companion;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/notification/model/NotificationStatus;
    .locals 1

    const-class v0, Lcom/ibotta/android/notification/model/NotificationStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/notification/model/NotificationStatus;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/notification/model/NotificationStatus;
    .locals 1

    sget-object v0, Lcom/ibotta/android/notification/model/NotificationStatus;->$VALUES:[Lcom/ibotta/android/notification/model/NotificationStatus;

    invoke-virtual {v0}, [Lcom/ibotta/android/notification/model/NotificationStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/notification/model/NotificationStatus;

    return-object v0
.end method


# virtual methods
.method public final getApiName()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/NotificationStatus;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "(this as java.lang.String).toLowerCase()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
