.class public final enum Lcom/ibotta/android/state/app/permissions/Area;
.super Ljava/lang/Enum;
.source "Area.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/state/app/permissions/Area;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/state/app/permissions/Area;

.field public static final enum GALLERY:Lcom/ibotta/android/state/app/permissions/Area;

.field public static final enum GOOGLE_PLUS:Lcom/ibotta/android/state/app/permissions/Area;

.field public static final enum HOME:Lcom/ibotta/android/state/app/permissions/Area;

.field public static final enum RETAILER_PICKER:Lcom/ibotta/android/state/app/permissions/Area;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 9
    new-instance v0, Lcom/ibotta/android/state/app/permissions/Area;

    const-string v1, "HOME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/state/app/permissions/Area;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/permissions/Area;->HOME:Lcom/ibotta/android/state/app/permissions/Area;

    .line 10
    new-instance v0, Lcom/ibotta/android/state/app/permissions/Area;

    const-string v1, "RETAILER_PICKER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/state/app/permissions/Area;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/permissions/Area;->RETAILER_PICKER:Lcom/ibotta/android/state/app/permissions/Area;

    .line 11
    new-instance v0, Lcom/ibotta/android/state/app/permissions/Area;

    const-string v1, "GALLERY"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/state/app/permissions/Area;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/permissions/Area;->GALLERY:Lcom/ibotta/android/state/app/permissions/Area;

    .line 12
    new-instance v0, Lcom/ibotta/android/state/app/permissions/Area;

    const-string v1, "GOOGLE_PLUS"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/state/app/permissions/Area;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/state/app/permissions/Area;->GOOGLE_PLUS:Lcom/ibotta/android/state/app/permissions/Area;

    const/4 v0, 0x4

    .line 8
    new-array v0, v0, [Lcom/ibotta/android/state/app/permissions/Area;

    sget-object v1, Lcom/ibotta/android/state/app/permissions/Area;->HOME:Lcom/ibotta/android/state/app/permissions/Area;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/state/app/permissions/Area;->RETAILER_PICKER:Lcom/ibotta/android/state/app/permissions/Area;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/state/app/permissions/Area;->GALLERY:Lcom/ibotta/android/state/app/permissions/Area;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/state/app/permissions/Area;->GOOGLE_PLUS:Lcom/ibotta/android/state/app/permissions/Area;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/android/state/app/permissions/Area;->$VALUES:[Lcom/ibotta/android/state/app/permissions/Area;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/state/app/permissions/Area;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 22
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/android/state/app/permissions/Area;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/state/app/permissions/Area;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/state/app/permissions/Area;
    .locals 1

    .line 8
    const-class v0, Lcom/ibotta/android/state/app/permissions/Area;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/permissions/Area;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/state/app/permissions/Area;
    .locals 1

    .line 8
    sget-object v0, Lcom/ibotta/android/state/app/permissions/Area;->$VALUES:[Lcom/ibotta/android/state/app/permissions/Area;

    invoke-virtual {v0}, [Lcom/ibotta/android/state/app/permissions/Area;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/state/app/permissions/Area;

    return-object v0
.end method
