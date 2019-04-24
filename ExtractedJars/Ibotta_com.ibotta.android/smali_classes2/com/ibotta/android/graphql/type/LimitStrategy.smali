.class public final enum Lcom/ibotta/android/graphql/type/LimitStrategy;
.super Ljava/lang/Enum;
.source "LimitStrategy.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/graphql/type/LimitStrategy;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum $UNKNOWN:Lcom/ibotta/android/graphql/type/LimitStrategy;

.field private static final synthetic $VALUES:[Lcom/ibotta/android/graphql/type/LimitStrategy;

.field public static final enum All:Lcom/ibotta/android/graphql/type/LimitStrategy;

.field public static final enum Even:Lcom/ibotta/android/graphql/type/LimitStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 11
    new-instance v0, Lcom/ibotta/android/graphql/type/LimitStrategy;

    const-string v1, "All"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/graphql/type/LimitStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/graphql/type/LimitStrategy;->All:Lcom/ibotta/android/graphql/type/LimitStrategy;

    .line 16
    new-instance v0, Lcom/ibotta/android/graphql/type/LimitStrategy;

    const-string v1, "Even"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/graphql/type/LimitStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/graphql/type/LimitStrategy;->Even:Lcom/ibotta/android/graphql/type/LimitStrategy;

    .line 21
    new-instance v0, Lcom/ibotta/android/graphql/type/LimitStrategy;

    const-string v1, "$UNKNOWN"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/graphql/type/LimitStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/graphql/type/LimitStrategy;->$UNKNOWN:Lcom/ibotta/android/graphql/type/LimitStrategy;

    const/4 v0, 0x3

    .line 6
    new-array v0, v0, [Lcom/ibotta/android/graphql/type/LimitStrategy;

    sget-object v1, Lcom/ibotta/android/graphql/type/LimitStrategy;->All:Lcom/ibotta/android/graphql/type/LimitStrategy;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/graphql/type/LimitStrategy;->Even:Lcom/ibotta/android/graphql/type/LimitStrategy;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/graphql/type/LimitStrategy;->$UNKNOWN:Lcom/ibotta/android/graphql/type/LimitStrategy;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/graphql/type/LimitStrategy;->$VALUES:[Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static safeValueOf(Ljava/lang/String;)Lcom/ibotta/android/graphql/type/LimitStrategy;
    .locals 5

    .line 24
    invoke-static {}, Lcom/ibotta/android/graphql/type/LimitStrategy;->values()[Lcom/ibotta/android/graphql/type/LimitStrategy;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 25
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/type/LimitStrategy;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 29
    :cond_1
    sget-object p0, Lcom/ibotta/android/graphql/type/LimitStrategy;->$UNKNOWN:Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/graphql/type/LimitStrategy;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/graphql/type/LimitStrategy;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/graphql/type/LimitStrategy;->$VALUES:[Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-virtual {v0}, [Lcom/ibotta/android/graphql/type/LimitStrategy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-object v0
.end method
