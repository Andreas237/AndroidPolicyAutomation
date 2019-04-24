.class public final enum Lio/swagger/annotations/OAuth2Definition$Flow;
.super Ljava/lang/Enum;
.source "OAuth2Definition.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/swagger/annotations/OAuth2Definition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Flow"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/swagger/annotations/OAuth2Definition$Flow;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/swagger/annotations/OAuth2Definition$Flow;

.field public static final enum ACCESS_CODE:Lio/swagger/annotations/OAuth2Definition$Flow;

.field public static final enum APPLICATION:Lio/swagger/annotations/OAuth2Definition$Flow;

.field public static final enum IMPLICIT:Lio/swagger/annotations/OAuth2Definition$Flow;

.field public static final enum PASSWORD:Lio/swagger/annotations/OAuth2Definition$Flow;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 49
    new-instance v0, Lio/swagger/annotations/OAuth2Definition$Flow;

    const-string v1, "IMPLICIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/swagger/annotations/OAuth2Definition$Flow;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/swagger/annotations/OAuth2Definition$Flow;->IMPLICIT:Lio/swagger/annotations/OAuth2Definition$Flow;

    new-instance v0, Lio/swagger/annotations/OAuth2Definition$Flow;

    const-string v1, "ACCESS_CODE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/swagger/annotations/OAuth2Definition$Flow;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/swagger/annotations/OAuth2Definition$Flow;->ACCESS_CODE:Lio/swagger/annotations/OAuth2Definition$Flow;

    new-instance v0, Lio/swagger/annotations/OAuth2Definition$Flow;

    const-string v1, "PASSWORD"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lio/swagger/annotations/OAuth2Definition$Flow;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/swagger/annotations/OAuth2Definition$Flow;->PASSWORD:Lio/swagger/annotations/OAuth2Definition$Flow;

    new-instance v0, Lio/swagger/annotations/OAuth2Definition$Flow;

    const-string v1, "APPLICATION"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lio/swagger/annotations/OAuth2Definition$Flow;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/swagger/annotations/OAuth2Definition$Flow;->APPLICATION:Lio/swagger/annotations/OAuth2Definition$Flow;

    const/4 v0, 0x4

    .line 48
    new-array v0, v0, [Lio/swagger/annotations/OAuth2Definition$Flow;

    sget-object v1, Lio/swagger/annotations/OAuth2Definition$Flow;->IMPLICIT:Lio/swagger/annotations/OAuth2Definition$Flow;

    aput-object v1, v0, v2

    sget-object v1, Lio/swagger/annotations/OAuth2Definition$Flow;->ACCESS_CODE:Lio/swagger/annotations/OAuth2Definition$Flow;

    aput-object v1, v0, v3

    sget-object v1, Lio/swagger/annotations/OAuth2Definition$Flow;->PASSWORD:Lio/swagger/annotations/OAuth2Definition$Flow;

    aput-object v1, v0, v4

    sget-object v1, Lio/swagger/annotations/OAuth2Definition$Flow;->APPLICATION:Lio/swagger/annotations/OAuth2Definition$Flow;

    aput-object v1, v0, v5

    sput-object v0, Lio/swagger/annotations/OAuth2Definition$Flow;->$VALUES:[Lio/swagger/annotations/OAuth2Definition$Flow;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 48
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/swagger/annotations/OAuth2Definition$Flow;
    .locals 1

    .line 48
    const-class v0, Lio/swagger/annotations/OAuth2Definition$Flow;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/swagger/annotations/OAuth2Definition$Flow;

    return-object p0
.end method

.method public static values()[Lio/swagger/annotations/OAuth2Definition$Flow;
    .locals 1

    .line 48
    sget-object v0, Lio/swagger/annotations/OAuth2Definition$Flow;->$VALUES:[Lio/swagger/annotations/OAuth2Definition$Flow;

    invoke-virtual {v0}, [Lio/swagger/annotations/OAuth2Definition$Flow;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/swagger/annotations/OAuth2Definition$Flow;

    return-object v0
.end method
