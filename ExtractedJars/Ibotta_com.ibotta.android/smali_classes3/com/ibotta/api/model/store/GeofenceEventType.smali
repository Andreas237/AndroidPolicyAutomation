.class public final enum Lcom/ibotta/api/model/store/GeofenceEventType;
.super Ljava/lang/Enum;
.source "GeofenceEventType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/store/GeofenceEventType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/store/GeofenceEventType;

.field public static final enum ENTER:Lcom/ibotta/api/model/store/GeofenceEventType;

.field public static final enum EXIT:Lcom/ibotta/api/model/store/GeofenceEventType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 7
    new-instance v0, Lcom/ibotta/api/model/store/GeofenceEventType;

    const-string v1, "ENTER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/store/GeofenceEventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/store/GeofenceEventType;->ENTER:Lcom/ibotta/api/model/store/GeofenceEventType;

    .line 8
    new-instance v0, Lcom/ibotta/api/model/store/GeofenceEventType;

    const-string v1, "EXIT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/store/GeofenceEventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/store/GeofenceEventType;->EXIT:Lcom/ibotta/api/model/store/GeofenceEventType;

    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [Lcom/ibotta/api/model/store/GeofenceEventType;

    sget-object v1, Lcom/ibotta/api/model/store/GeofenceEventType;->ENTER:Lcom/ibotta/api/model/store/GeofenceEventType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/store/GeofenceEventType;->EXIT:Lcom/ibotta/api/model/store/GeofenceEventType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/api/model/store/GeofenceEventType;->$VALUES:[Lcom/ibotta/api/model/store/GeofenceEventType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/store/GeofenceEventType;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 21
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/store/GeofenceEventType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/store/GeofenceEventType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/store/GeofenceEventType;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/api/model/store/GeofenceEventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/store/GeofenceEventType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/store/GeofenceEventType;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/api/model/store/GeofenceEventType;->$VALUES:[Lcom/ibotta/api/model/store/GeofenceEventType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/store/GeofenceEventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/store/GeofenceEventType;

    return-object v0
.end method


# virtual methods
.method public toApiName()Ljava/lang/String;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/api/model/store/GeofenceEventType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
