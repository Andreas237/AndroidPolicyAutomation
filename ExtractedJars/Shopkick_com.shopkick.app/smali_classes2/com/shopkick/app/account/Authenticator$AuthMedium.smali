.class public final enum Lcom/shopkick/app/account/Authenticator$AuthMedium;
.super Ljava/lang/Enum;
.source "Authenticator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/Authenticator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AuthMedium"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/account/Authenticator$AuthMedium;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/account/Authenticator$AuthMedium;

.field public static final enum AUTH_CODE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

.field public static final enum EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

.field public static final enum FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

.field public static final enum GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

.field public static final enum INVALID:Lcom/shopkick/app/account/Authenticator$AuthMedium;

.field private static map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/shopkick/app/account/Authenticator$AuthMedium;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 73
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;

    const-string v1, "INVALID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/shopkick/app/account/Authenticator$AuthMedium;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->INVALID:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    .line 74
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;

    const-string v1, "EMAIL"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lcom/shopkick/app/account/Authenticator$AuthMedium;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    .line 75
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;

    const-string v1, "FACEBOOK"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v4}, Lcom/shopkick/app/account/Authenticator$AuthMedium;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    .line 76
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;

    const-string v1, "GOOGLE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5, v5}, Lcom/shopkick/app/account/Authenticator$AuthMedium;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    .line 77
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;

    const-string v1, "AUTH_CODE"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6, v6}, Lcom/shopkick/app/account/Authenticator$AuthMedium;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->AUTH_CODE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    const/4 v0, 0x5

    .line 72
    new-array v0, v0, [Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->INVALID:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->AUTH_CODE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    aput-object v1, v0, v6

    sput-object v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->$VALUES:[Lcom/shopkick/app/account/Authenticator$AuthMedium;

    .line 80
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->map:Ljava/util/Map;

    .line 87
    invoke-static {}, Lcom/shopkick/app/account/Authenticator$AuthMedium;->values()[Lcom/shopkick/app/account/Authenticator$AuthMedium;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 88
    sget-object v4, Lcom/shopkick/app/account/Authenticator$AuthMedium;->map:Ljava/util/Map;

    iget v5, v3, Lcom/shopkick/app/account/Authenticator$AuthMedium;->value:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 82
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 83
    iput p3, p0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->value:I

    return-void
.end method

.method public static valueOf(I)Lcom/shopkick/app/account/Authenticator$AuthMedium;
    .locals 1

    .line 93
    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->map:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/account/Authenticator$AuthMedium;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthMedium;
    .locals 1

    .line 72
    const-class v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/account/Authenticator$AuthMedium;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/account/Authenticator$AuthMedium;
    .locals 1

    .line 72
    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->$VALUES:[Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v0}, [Lcom/shopkick/app/account/Authenticator$AuthMedium;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/account/Authenticator$AuthMedium;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 97
    iget v0, p0, Lcom/shopkick/app/account/Authenticator$AuthMedium;->value:I

    return v0
.end method
