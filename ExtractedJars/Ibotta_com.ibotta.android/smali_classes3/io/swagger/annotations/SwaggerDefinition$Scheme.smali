.class public final enum Lio/swagger/annotations/SwaggerDefinition$Scheme;
.super Ljava/lang/Enum;
.source "SwaggerDefinition.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/swagger/annotations/SwaggerDefinition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Scheme"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/swagger/annotations/SwaggerDefinition$Scheme;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/swagger/annotations/SwaggerDefinition$Scheme;

.field public static final enum DEFAULT:Lio/swagger/annotations/SwaggerDefinition$Scheme;

.field public static final enum HTTP:Lio/swagger/annotations/SwaggerDefinition$Scheme;

.field public static final enum HTTPS:Lio/swagger/annotations/SwaggerDefinition$Scheme;

.field public static final enum WS:Lio/swagger/annotations/SwaggerDefinition$Scheme;

.field public static final enum WSS:Lio/swagger/annotations/SwaggerDefinition$Scheme;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 118
    new-instance v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/swagger/annotations/SwaggerDefinition$Scheme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;->DEFAULT:Lio/swagger/annotations/SwaggerDefinition$Scheme;

    new-instance v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;

    const-string v1, "HTTP"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/swagger/annotations/SwaggerDefinition$Scheme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;->HTTP:Lio/swagger/annotations/SwaggerDefinition$Scheme;

    new-instance v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;

    const-string v1, "HTTPS"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lio/swagger/annotations/SwaggerDefinition$Scheme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;->HTTPS:Lio/swagger/annotations/SwaggerDefinition$Scheme;

    new-instance v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;

    const-string v1, "WS"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lio/swagger/annotations/SwaggerDefinition$Scheme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;->WS:Lio/swagger/annotations/SwaggerDefinition$Scheme;

    new-instance v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;

    const-string v1, "WSS"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lio/swagger/annotations/SwaggerDefinition$Scheme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;->WSS:Lio/swagger/annotations/SwaggerDefinition$Scheme;

    const/4 v0, 0x5

    .line 117
    new-array v0, v0, [Lio/swagger/annotations/SwaggerDefinition$Scheme;

    sget-object v1, Lio/swagger/annotations/SwaggerDefinition$Scheme;->DEFAULT:Lio/swagger/annotations/SwaggerDefinition$Scheme;

    aput-object v1, v0, v2

    sget-object v1, Lio/swagger/annotations/SwaggerDefinition$Scheme;->HTTP:Lio/swagger/annotations/SwaggerDefinition$Scheme;

    aput-object v1, v0, v3

    sget-object v1, Lio/swagger/annotations/SwaggerDefinition$Scheme;->HTTPS:Lio/swagger/annotations/SwaggerDefinition$Scheme;

    aput-object v1, v0, v4

    sget-object v1, Lio/swagger/annotations/SwaggerDefinition$Scheme;->WS:Lio/swagger/annotations/SwaggerDefinition$Scheme;

    aput-object v1, v0, v5

    sget-object v1, Lio/swagger/annotations/SwaggerDefinition$Scheme;->WSS:Lio/swagger/annotations/SwaggerDefinition$Scheme;

    aput-object v1, v0, v6

    sput-object v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;->$VALUES:[Lio/swagger/annotations/SwaggerDefinition$Scheme;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 117
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/swagger/annotations/SwaggerDefinition$Scheme;
    .locals 1

    .line 117
    const-class v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/swagger/annotations/SwaggerDefinition$Scheme;

    return-object p0
.end method

.method public static values()[Lio/swagger/annotations/SwaggerDefinition$Scheme;
    .locals 1

    .line 117
    sget-object v0, Lio/swagger/annotations/SwaggerDefinition$Scheme;->$VALUES:[Lio/swagger/annotations/SwaggerDefinition$Scheme;

    invoke-virtual {v0}, [Lio/swagger/annotations/SwaggerDefinition$Scheme;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/swagger/annotations/SwaggerDefinition$Scheme;

    return-object v0
.end method
