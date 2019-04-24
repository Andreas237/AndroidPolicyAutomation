.class public final enum Lcom/ibotta/android/search/async/SearchAsync$SearchContent;
.super Ljava/lang/Enum;
.source "SearchAsync.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/search/async/SearchAsync;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SearchContent"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/search/async/SearchAsync$SearchContent;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

.field public static final enum OFFERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

.field public static final enum PRODUCTS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

.field public static final enum RETAILERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 17
    new-instance v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    const-string v1, "OFFERS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->OFFERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    new-instance v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    const-string v1, "RETAILERS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->RETAILERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    new-instance v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    const-string v1, "PRODUCTS"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->PRODUCTS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    const/4 v0, 0x3

    .line 16
    new-array v0, v0, [Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    sget-object v1, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->OFFERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->RETAILERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->PRODUCTS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->$VALUES:[Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/search/async/SearchAsync$SearchContent;
    .locals 1

    .line 16
    const-class v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/search/async/SearchAsync$SearchContent;
    .locals 1

    .line 16
    sget-object v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->$VALUES:[Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    invoke-virtual {v0}, [Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    return-object v0
.end method
