.class public final enum Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;
.super Ljava/lang/Enum;
.source "ApiKeyAuthDefinition.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/swagger/annotations/ApiKeyAuthDefinition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ApiKeyLocation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

.field public static final enum HEADER:Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

.field public static final enum QUERY:Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

.field private static names:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 38
    new-instance v0, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    const-string v1, "HEADER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->HEADER:Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    new-instance v0, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    const-string v1, "QUERY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->QUERY:Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    const/4 v0, 0x2

    .line 37
    new-array v0, v0, [Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    sget-object v1, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->HEADER:Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    aput-object v1, v0, v2

    sget-object v1, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->QUERY:Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    aput-object v1, v0, v3

    sput-object v0, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->$VALUES:[Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->names:Ljava/util/Map;

    .line 57
    sget-object v0, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->names:Ljava/util/Map;

    const-string v1, "header"

    sget-object v2, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->HEADER:Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v0, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->names:Ljava/util/Map;

    const-string v1, "query"

    sget-object v2, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->QUERY:Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 37
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;
    .locals 1

    .line 37
    const-class v0, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    return-object p0
.end method

.method public static values()[Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;
    .locals 1

    .line 37
    sget-object v0, Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->$VALUES:[Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    invoke-virtual {v0}, [Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;

    return-object v0
.end method
