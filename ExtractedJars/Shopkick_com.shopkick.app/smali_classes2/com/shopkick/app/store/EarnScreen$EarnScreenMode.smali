.class final enum Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;
.super Ljava/lang/Enum;
.source "EarnScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/EarnScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "EarnScreenMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

.field public static final enum FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

.field public static final enum NORMAL:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

.field public static final enum SUGGESTED_FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 205
    new-instance v0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    const-string v1, "NORMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->NORMAL:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    .line 206
    new-instance v0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    const-string v1, "FILTER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    .line 207
    new-instance v0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    const-string v1, "SUGGESTED_FILTER"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->SUGGESTED_FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    const/4 v0, 0x3

    .line 204
    new-array v0, v0, [Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->NORMAL:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->SUGGESTED_FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->$VALUES:[Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 204
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;
    .locals 1

    .line 204
    const-class v0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;
    .locals 1

    .line 204
    sget-object v0, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->$VALUES:[Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    invoke-virtual {v0}, [Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    return-object v0
.end method
