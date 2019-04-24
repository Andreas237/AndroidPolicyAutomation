.class public final enum Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;
.super Ljava/lang/Enum;
.source "PaymentOptionRowViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Action"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;",
        "",
        "trackingName",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getTrackingName",
        "()Ljava/lang/String;",
        "STRIPE_SOURCE",
        "ADD_NEW",
        "GOOGLE_PAY",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

.field public static final enum ADD_NEW:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

.field public static final enum GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

.field public static final enum STRIPE_SOURCE:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;


# instance fields
.field private final trackingName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    new-instance v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    const-string v2, "STRIPE_SOURCE"

    const-string v3, "ibotta"

    const/4 v4, 0x0

    .line 41
    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->STRIPE_SOURCE:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    const-string v2, "ADD_NEW"

    const-string v3, "new_card"

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ADD_NEW:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    const-string v2, "GOOGLE_PAY"

    const-string v3, "google_pay"

    const/4 v4, 0x2

    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->$VALUES:[Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 40
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->trackingName:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;
    .locals 1

    const-class v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;
    .locals 1

    sget-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->$VALUES:[Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    invoke-virtual {v0}, [Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    return-object v0
.end method


# virtual methods
.method public final getTrackingName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->trackingName:Ljava/lang/String;

    return-object v0
.end method
