.class public final enum Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/DeferredDeeplinkParametersListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Error"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

.field public static final enum NOT_A_FIRST_LAUNCH:Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

.field public static final enum PARSE_ERROR:Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;


# instance fields
.field private final mDescription:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 25
    new-instance v0, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    const-string v1, "NOT_A_FIRST_LAUNCH"

    const-string v2, "Deferred deeplink parameters can be requested during first launch only."

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;->NOT_A_FIRST_LAUNCH:Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    .line 29
    new-instance v0, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    const-string v1, "PARSE_ERROR"

    const-string v2, "Google Play referrer did not contain valid deferred deeplink parameters."

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;->PARSE_ERROR:Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    const/4 v0, 0x2

    .line 21
    new-array v0, v0, [Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    sget-object v1, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;->NOT_A_FIRST_LAUNCH:Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;->PARSE_ERROR:Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    aput-object v1, v0, v4

    sput-object v0, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;->$VALUES:[Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

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

    .line 33
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 34
    iput-object p3, p0, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;->mDescription:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;
    .locals 1

    .line 21
    const-class v0, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;
    .locals 1

    .line 21
    sget-object v0, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;->$VALUES:[Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    invoke-virtual {v0}, [Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;

    return-object v0
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/yandex/metrica/DeferredDeeplinkParametersListener$Error;->mDescription:Ljava/lang/String;

    return-object v0
.end method
