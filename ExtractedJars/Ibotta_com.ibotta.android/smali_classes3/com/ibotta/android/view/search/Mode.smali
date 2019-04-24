.class public final enum Lcom/ibotta/android/view/search/Mode;
.super Ljava/lang/Enum;
.source "Mode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/view/search/Mode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/view/search/Mode;

.field public static final enum GALLERY:Lcom/ibotta/android/view/search/Mode;

.field public static final enum HOME:Lcom/ibotta/android/view/search/Mode;


# instance fields
.field private final trackingLabel:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 9
    new-instance v0, Lcom/ibotta/android/view/search/Mode;

    const-string v1, "HOME"

    const-string v2, "home"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/android/view/search/Mode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/view/search/Mode;->HOME:Lcom/ibotta/android/view/search/Mode;

    .line 10
    new-instance v0, Lcom/ibotta/android/view/search/Mode;

    const-string v1, "GALLERY"

    const-string v2, "gallery"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/android/view/search/Mode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/android/view/search/Mode;->GALLERY:Lcom/ibotta/android/view/search/Mode;

    const/4 v0, 0x2

    .line 8
    new-array v0, v0, [Lcom/ibotta/android/view/search/Mode;

    sget-object v1, Lcom/ibotta/android/view/search/Mode;->HOME:Lcom/ibotta/android/view/search/Mode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/view/search/Mode;->GALLERY:Lcom/ibotta/android/view/search/Mode;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/view/search/Mode;->$VALUES:[Lcom/ibotta/android/view/search/Mode;

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

    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    iput-object p3, p0, Lcom/ibotta/android/view/search/Mode;->trackingLabel:Ljava/lang/String;

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/view/search/Mode;
    .locals 0

    .line 26
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/view/search/Mode;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/view/search/Mode;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 29
    :catch_0
    sget-object p0, Lcom/ibotta/android/view/search/Mode;->HOME:Lcom/ibotta/android/view/search/Mode;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/view/search/Mode;
    .locals 1

    .line 8
    const-class v0, Lcom/ibotta/android/view/search/Mode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/view/search/Mode;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/view/search/Mode;
    .locals 1

    .line 8
    sget-object v0, Lcom/ibotta/android/view/search/Mode;->$VALUES:[Lcom/ibotta/android/view/search/Mode;

    invoke-virtual {v0}, [Lcom/ibotta/android/view/search/Mode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/view/search/Mode;

    return-object v0
.end method


# virtual methods
.method public getTrackingLabel()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/view/search/Mode;->trackingLabel:Ljava/lang/String;

    return-object v0
.end method
