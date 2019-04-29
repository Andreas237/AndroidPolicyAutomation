.class final enum Lcom/mopub/mraid/MraidOrientation;
.super Ljava/lang/Enum;
.source "MraidOrientation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/mraid/MraidOrientation;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/mraid/MraidOrientation;

.field public static final enum LANDSCAPE:Lcom/mopub/mraid/MraidOrientation;

.field public static final enum NONE:Lcom/mopub/mraid/MraidOrientation;

.field public static final enum PORTRAIT:Lcom/mopub/mraid/MraidOrientation;


# instance fields
.field private final mActivityInfoOrientation:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 6
    new-instance v0, Lcom/mopub/mraid/MraidOrientation;

    const-string v1, "PORTRAIT"

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/mopub/mraid/MraidOrientation;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/mraid/MraidOrientation;->PORTRAIT:Lcom/mopub/mraid/MraidOrientation;

    .line 7
    new-instance v0, Lcom/mopub/mraid/MraidOrientation;

    const-string v1, "LANDSCAPE"

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/mraid/MraidOrientation;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/mraid/MraidOrientation;->LANDSCAPE:Lcom/mopub/mraid/MraidOrientation;

    .line 8
    new-instance v0, Lcom/mopub/mraid/MraidOrientation;

    const-string v1, "NONE"

    const/4 v4, 0x2

    const/4 v5, -0x1

    invoke-direct {v0, v1, v4, v5}, Lcom/mopub/mraid/MraidOrientation;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/mraid/MraidOrientation;->NONE:Lcom/mopub/mraid/MraidOrientation;

    const/4 v0, 0x3

    .line 5
    new-array v0, v0, [Lcom/mopub/mraid/MraidOrientation;

    sget-object v1, Lcom/mopub/mraid/MraidOrientation;->PORTRAIT:Lcom/mopub/mraid/MraidOrientation;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/mraid/MraidOrientation;->LANDSCAPE:Lcom/mopub/mraid/MraidOrientation;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/mraid/MraidOrientation;->NONE:Lcom/mopub/mraid/MraidOrientation;

    aput-object v1, v0, v4

    sput-object v0, Lcom/mopub/mraid/MraidOrientation;->$VALUES:[Lcom/mopub/mraid/MraidOrientation;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 13
    iput p3, p0, Lcom/mopub/mraid/MraidOrientation;->mActivityInfoOrientation:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/mraid/MraidOrientation;
    .locals 1

    .line 5
    const-class v0, Lcom/mopub/mraid/MraidOrientation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/mraid/MraidOrientation;

    return-object p0
.end method

.method public static values()[Lcom/mopub/mraid/MraidOrientation;
    .locals 1

    .line 5
    sget-object v0, Lcom/mopub/mraid/MraidOrientation;->$VALUES:[Lcom/mopub/mraid/MraidOrientation;

    invoke-virtual {v0}, [Lcom/mopub/mraid/MraidOrientation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/mraid/MraidOrientation;

    return-object v0
.end method


# virtual methods
.method getActivityInfoOrientation()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/mopub/mraid/MraidOrientation;->mActivityInfoOrientation:I

    return v0
.end method
